#!/bin/bash
cd /home/derrick/Documents/workspace/hlola-grc-backend/database
docker compose -f docker-compose.prod.yml down
echo "Production database stopped: hlola-grc-db-prod"
