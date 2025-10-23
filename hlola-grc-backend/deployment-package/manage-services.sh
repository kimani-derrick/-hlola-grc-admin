#!/bin/bash

case "$1" in
    start)
        echo "🚀 Starting HLOLA GRC Services..."
        docker start hlola-grc-db-prod hlola-grc-api
        echo "✅ Services started"
        ;;
    stop)
        echo "🛑 Stopping HLOLA GRC Services..."
        docker stop hlola-grc-api hlola-grc-db-prod
        echo "✅ Services stopped"
        ;;
    restart)
        echo "🔄 Restarting HLOLA GRC Services..."
        docker restart hlola-grc-db-prod hlola-grc-api
        echo "✅ Services restarted"
        ;;
    status)
        echo "📊 Service Status:"
        docker ps --filter "name=hlola-grc" --format "table {{.Names}}\t{{.Status}}\t{{.Ports}}"
        ;;
    logs)
        echo "📝 Service Logs:"
        docker logs --tail 50 hlola-grc-api
        ;;
    backup)
        echo "💾 Creating database backup..."
        BACKUP_FILE="/opt/hlola-grc/backups/hlola_grc_$(date +%Y%m%d_%H%M%S).sql"
        docker exec hlola-grc-db-prod pg_dump -U hlola_user -d hlola_grc_platform > $BACKUP_FILE
        echo "✅ Backup created: $BACKUP_FILE"
        ;;
    *)
        echo "Usage: $0 {start|stop|restart|status|logs|backup}"
        echo ""
        echo "Commands:"
        echo "  start   - Start all services"
        echo "  stop    - Stop all services"
        echo "  restart - Restart all services"
        echo "  status  - Show service status"
        echo "  logs    - Show API logs"
        echo "  backup  - Create database backup"
        exit 1
        ;;
esac
