FROM node:18-alpine

# Set working directory
WORKDIR /app

# Copy package files first for better caching
COPY package*.json ./

# Install dependencies
RUN npm ci --only=production

# Copy source code
COPY src/ ./src/

# Create default .env file for production
RUN echo "DB_HOST=postgres" > .env && \
    echo "DB_PORT=5432" >> .env && \
    echo "DB_NAME=hlola_grc_platform" >> .env && \
    echo "DB_USER=hlola_user" >> .env && \
    echo "DB_PASSWORD=hlola2025_prod" >> .env && \
    echo "JWT_SECRET=your-super-secret-jwt-key-here" >> .env && \
    echo "JWT_EXPIRES_IN=24h" >> .env && \
    echo "NODE_ENV=production" >> .env && \
    echo "PORT=3001" >> .env && \
    echo "FRONTEND_URL=http://localhost:3000" >> .env && \
    echo "STORAGE_PROVIDER=local" >> .env && \
    echo "LOCAL_UPLOAD_PATH=./uploads" >> .env && \
    echo "MAX_FILE_SIZE=52428800" >> .env && \
    echo "ALLOWED_FILE_TYPES=pdf,doc,docx,xls,xlsx,jpg,jpeg,png,txt,csv,zip,rar" >> .env && \
    echo "DISABLE_BACKGROUND_CRON=true" >> .env && \
    echo "DISABLE_CRON=false" >> .env

# Create uploads directory
RUN mkdir -p uploads

# Create logs directory
RUN mkdir -p logs

# Set proper permissions
RUN chown -R node:node /app
USER node

# Expose port
EXPOSE 3001

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=5s --retries=3 \
  CMD node -e "require('http').get('http://localhost:3001/health', (res) => { process.exit(res.statusCode === 200 ? 0 : 1) })"

# Start command
CMD ["npm", "start"]
