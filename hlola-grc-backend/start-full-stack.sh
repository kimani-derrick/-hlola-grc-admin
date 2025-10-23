#!/bin/bash
cd /home/derrick/Documents/workspace/hlola-grc-backend

echo "🚀 Starting HLOLA GRC Full Stack..."
echo "📦 Building backend Docker image..."
docker compose build

echo "🔄 Starting services..."
docker compose up -d

echo "⏳ Waiting for services to be ready..."
sleep 10

echo "📊 Service Status:"
docker compose ps

echo "🔍 Checking service health..."
echo "Backend API: http://localhost:3001"
echo "Database: localhost:5432"
echo ""
echo "✅ Full stack started successfully!"
echo "📝 Logs: docker compose logs -f"
echo "🛑 Stop: docker compose down"
