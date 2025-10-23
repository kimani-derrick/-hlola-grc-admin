#!/bin/bash
cd /home/derrick/Documents/workspace/hlola-grc-backend

echo "🔨 Building HLOLA GRC Backend Docker Image..."

# Build the backend image
docker build -t hlola-grc-backend:latest .

if [ $? -eq 0 ]; then
    echo "✅ Backend Docker image built successfully!"
    echo "📦 Image: hlola-grc-backend:latest"
    
    # Show image details
    echo ""
    echo "📊 Image Details:"
    docker images hlola-grc-backend:latest
    
    echo ""
    echo "🚀 Next steps:"
    echo "1. Test locally: ./start-full-stack.sh"
    echo "2. Tag for production: docker tag hlola-grc-backend:latest hlola-grc-backend:prod"
    echo "3. Save image: docker save hlola-grc-backend:latest | gzip > hlola-grc-backend.tar.gz"
else
    echo "❌ Failed to build backend Docker image"
    exit 1
fi
