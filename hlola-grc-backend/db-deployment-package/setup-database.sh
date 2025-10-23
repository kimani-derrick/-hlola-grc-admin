#!/bin/bash

echo "🗄️ Setting up HLOLA GRC Production Database on Server..."

# Create necessary directories
echo "📁 Creating directories..."
mkdir -p /opt/hlola-grc/backups
mkdir -p /opt/hlola-grc/database

# Set proper permissions
echo "🔐 Setting permissions..."
chown -R 1000:1000 /opt/hlola-grc/backups

# Check if Docker is running
echo "🐳 Checking Docker status..."
if ! docker info > /dev/null 2>&1; then
    echo "❌ Docker is not running. Please start Docker first."
    exit 1
fi

# Check if PostgreSQL image is available
echo "📦 Checking PostgreSQL image..."
if ! docker images | grep -q "postgres.*15-alpine"; then
    echo "📥 Pulling PostgreSQL 15 Alpine image..."
    docker pull postgres:15-alpine
fi

# Stop any existing database container
echo "🛑 Stopping any existing database containers..."
docker stop hlola-grc-db-prod 2>/dev/null || true
docker rm hlola-grc-db-prod 2>/dev/null || true

# Start the production database
echo "🚀 Starting production database..."
docker run -d \
  --name hlola-grc-db-prod \
  --restart unless-stopped \
  -p 5432:5432 \
  -e POSTGRES_DB=hlola_grc_platform \
  -e POSTGRES_USER=hlola_user \
  -e POSTGRES_PASSWORD=hlola2025_prod \
  -e POSTGRES_INITDB_ARGS="--encoding=UTF-8 --lc-collate=en_US.UTF-8 --lc-ctype=en_US.UTF-8" \
  -v hlola_grc_postgres_prod_data:/var/lib/postgresql/data \
  -v $(pwd)/database/schema.sql:/docker-entrypoint-initdb.d/01-schema.sql:ro \
  -v /opt/hlola-grc/backups:/backups \
  postgres:15-alpine

echo "⏳ Waiting for database to initialize..."
sleep 30

# Test database connection
echo "🔍 Testing database connection..."
for i in {1..10}; do
    if docker exec hlola-grc-db-prod pg_isready -U hlola_user -d hlola_grc_platform > /dev/null 2>&1; then
        echo "✅ Database is ready!"
        break
    else
        echo "⏳ Waiting for database... (attempt $i/10)"
        sleep 10
    fi
done

# Verify schema was loaded
echo "📊 Verifying database schema..."
TABLE_COUNT=$(docker exec hlola-grc-db-prod psql -U hlola_user -d hlola_grc_platform -t -c "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = 'public';" | tr -d ' \n')

if [ "$TABLE_COUNT" = "26" ]; then
    echo "✅ Database schema loaded successfully! ($TABLE_COUNT tables)"
else
    echo "❌ Database schema verification failed. Expected 26 tables, found $TABLE_COUNT"
    exit 1
fi

# Show database status
echo "📊 Database Status:"
docker ps --filter "name=hlola-grc-db-prod" --format "table {{.Names}}\t{{.Status}}\t{{.Ports}}"

echo ""
echo "✅ Database setup completed successfully!"
echo "🌐 Database available at: localhost:5432"
echo "📝 Database: hlola_grc_platform"
echo "👤 User: hlola_user"
echo "🔑 Password: hlola2025_prod"
echo ""
echo "📋 Next steps:"
echo "1. Deploy backend API"
echo "2. Configure Nginx reverse proxy"
echo "3. Set up SSL certificates"
