#!/bin/bash
cd /home/derrick/Documents/workspace/hlola-grc-backend/database
docker compose -f docker-compose.prod.yml --env-file .env.prod up -d
echo "Production database started: hlola-grc-db-prod"
docker ps --filter "name=hlola-grc-db-prod"
