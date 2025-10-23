# HLOLA GRC Database - Server Deployment

## Quick Start

1. **Deploy database to server:**
   ```bash
   ./setup-database.sh
   ```

2. **Manage database:**
   ```bash
   ./manage-database.sh status    # Check status
   ./manage-database.sh logs      # View logs
   ./manage-database.sh backup    # Create backup
   ./manage-database.sh test      # Test connection
   ```

## Database Details

- **Container**: `hlola-grc-db-prod`
- **Image**: `postgres:15-alpine`
- **Port**: 5432
- **Database**: `hlola_grc_platform`
- **User**: `hlola_user`
- **Password**: `hlola2025_prod`

## Schema

- **Tables**: 26 tables (complete GRC platform schema)
- **Data**: Clean production database (no test data)
- **Backup Location**: `/opt/hlola-grc/backups/`

## Connection Details

```bash
# From server
docker exec -it hlola-grc-db-prod psql -U hlola_user -d hlola_grc_platform

# From external (if port 5432 is open)
psql -h your-server-ip -p 5432 -U hlola_user -d hlola_grc_platform
```

## Next Steps

1. ✅ Database deployed and running
2. 🔄 Deploy backend API
3. 🔄 Configure Nginx reverse proxy
4. 🔄 Set up SSL certificates
5. 🔄 Deploy frontend to Vercel

## Troubleshooting

- **Database not starting**: Check Docker logs with `./manage-database.sh logs`
- **Connection issues**: Verify port 5432 is open and container is running
- **Schema issues**: Check if schema.sql was loaded properly
