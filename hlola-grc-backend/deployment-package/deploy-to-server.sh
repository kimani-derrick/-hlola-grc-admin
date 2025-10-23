#!/bin/bash

echo "🚀 Deploying HLOLA GRC Platform to Production Server..."

# Load the Docker image
echo "📦 Loading Docker image..."
docker load < hlola-grc-backend-prod.tar.gz

# Create necessary directories
echo "📁 Creating directories..."
mkdir -p /opt/hlola-grc/{uploads,logs,backups}
mkdir -p /opt/hlola-grc/database/backups

# Set proper permissions
echo "🔐 Setting permissions..."
chown -R 1000:1000 /opt/hlola-grc/uploads
chown -R 1000:1000 /opt/hlola-grc/logs

# Start the database first
echo "🗄️ Starting production database..."
cd database
docker run -d \
  --name hlola-grc-db-prod \
  --restart unless-stopped \
  -p 5432:5432 \
  -e POSTGRES_DB=hlola_grc_platform \
  -e POSTGRES_USER=hlola_user \
  -e POSTGRES_PASSWORD=hlola2025_prod \
  -v hlola_grc_postgres_prod_data:/var/lib/postgresql/data \
  -v $(pwd)/schema.sql:/docker-entrypoint-initdb.d/01-schema.sql:ro \
  -v /opt/hlola-grc/backups:/backups \
  postgres:15-alpine

echo "⏳ Waiting for database to initialize..."
sleep 30

# Start the backend API
echo "🔧 Starting backend API..."
cd ..
docker run -d \
  --name hlola-grc-api \
  --restart unless-stopped \
  -p 3001:3001 \
  -e DB_HOST=localhost \
  -e DB_PORT=5432 \
  -e DB_NAME=hlola_grc_platform \
  -e DB_USER=hlola_user \
  -e DB_PASSWORD=hlola2025_prod \
  -e NODE_ENV=production \
  -e JWT_SECRET=your-super-secret-jwt-key-here \
  -e JWT_EXPIRES_IN=24h \
  -e FRONTEND_URL=https://your-domain.com \
  -e STORAGE_PROVIDER=local \
  -e LOCAL_UPLOAD_PATH=./uploads \
  -v /opt/hlola-grc/uploads:/app/uploads \
  -v /opt/hlola-grc/logs:/app/logs \
  --network host \
  hlola-grc-backend:prod

echo "⏳ Waiting for API to start..."
sleep 15

# Check service status
echo "📊 Service Status:"
docker ps --filter "name=hlola-grc"

echo "🔍 Testing API health..."
curl -s http://localhost:3001/health | jq . || echo "API not ready yet"

echo "✅ Deployment completed!"
echo "🌐 API available at: http://$(curl -s ifconfig.me):3001"
echo "📝 To view logs: docker logs hlola-grc-api"
echo "🛑 To stop: docker stop hlola-grc-api hlola-grc-db-prod"
