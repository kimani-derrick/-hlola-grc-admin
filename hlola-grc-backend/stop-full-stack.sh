#!/bin/bash
cd /home/derrick/Documents/workspace/hlola-grc-backend

echo "🛑 Stopping HLOLA GRC Full Stack..."
docker compose down

echo "🧹 Cleaning up containers..."
docker compose rm -f

echo "✅ Full stack stopped successfully!"
echo "💾 Database data is preserved in Docker volume"
