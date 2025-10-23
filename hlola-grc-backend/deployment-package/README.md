# HLOLA GRC Platform - Server Deployment

## Quick Start

1. **Deploy to server:**
   ```bash
   ./deploy-to-server.sh
   ```

2. **Manage services:**
   ```bash
   ./manage-services.sh status    # Check status
   ./manage-services.sh logs      # View logs
   ./manage-services.sh backup    # Create backup
   ```

## Services

- **Database**: `hlola-grc-db-prod` (PostgreSQL 15)
- **API**: `hlola-grc-api` (Node.js Backend)
- **Ports**: 5432 (DB), 3001 (API)

## API Endpoints

- Health Check: `http://your-server:3001/health`
- API Base: `http://your-server:3001/api/`

## File Locations

- **Uploads**: `/opt/hlola-grc/uploads/`
- **Logs**: `/opt/hlola-grc/logs/`
- **Backups**: `/opt/hlola-grc/backups/`

## Environment Variables

The API uses these environment variables:
- `DB_HOST=localhost`
- `DB_PORT=5432`
- `DB_NAME=hlola_grc_platform`
- `DB_USER=hlola_user`
- `DB_PASSWORD=hlola2025_prod`
- `NODE_ENV=production`

## Next Steps

1. Configure Nginx reverse proxy
2. Set up SSL certificates
3. Configure domain name
4. Set up monitoring and backups
