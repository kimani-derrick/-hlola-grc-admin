#!/bin/bash
BACKUP_DIR="/home/derrick/Documents/workspace/hlola-grc-backend/database/backups"
TIMESTAMP=$(date +%Y%m%d_%H%M%S)
BACKUP_FILE="hlola_grc_platform_${TIMESTAMP}.sql"

mkdir -p $BACKUP_DIR

docker exec hlola-grc-db-prod pg_dump \
  -U hlola_user \
  -d hlola_grc_platform \
  --clean \
  --if-exists \
  > "${BACKUP_DIR}/${BACKUP_FILE}"

echo "Backup created: ${BACKUP_FILE}"
