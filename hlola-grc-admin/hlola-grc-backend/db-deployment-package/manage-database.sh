#!/bin/bash

case "$1" in
    start)
        echo "🚀 Starting HLOLA GRC Database..."
        docker start hlola-grc-db-prod
        echo "✅ Database started"
        ;;
    stop)
        echo "🛑 Stopping HLOLA GRC Database..."
        docker stop hlola-grc-db-prod
        echo "✅ Database stopped"
        ;;
    restart)
        echo "🔄 Restarting HLOLA GRC Database..."
        docker restart hlola-grc-db-prod
        echo "✅ Database restarted"
        ;;
    status)
        echo "📊 Database Status:"
        docker ps --filter "name=hlola-grc-db-prod" --format "table {{.Names}}\t{{.Status}}\t{{.Ports}}"
        ;;
    logs)
        echo "📝 Database Logs:"
        docker logs --tail 50 hlola-grc-db-prod
        ;;
    backup)
        echo "💾 Creating database backup..."
        BACKUP_FILE="/opt/hlola-grc/backups/hlola_grc_$(date +%Y%m%d_%H%M%S).sql"
        docker exec hlola-grc-db-prod pg_dump -U hlola_user -d hlola_grc_platform > $BACKUP_FILE
        echo "✅ Backup created: $BACKUP_FILE"
        ;;
    connect)
        echo "🔌 Connecting to database..."
        docker exec -it hlola-grc-db-prod psql -U hlola_user -d hlola_grc_platform
        ;;
    test)
        echo "🧪 Testing database connection..."
        docker exec hlola-grc-db-prod psql -U hlola_user -d hlola_grc_platform -c "SELECT NOW() as current_time, current_database() as db_name;"
        ;;
    *)
        echo "Usage: $0 {start|stop|restart|status|logs|backup|connect|test}"
        echo ""
        echo "Commands:"
        echo "  start   - Start database"
        echo "  stop    - Stop database"
        echo "  restart - Restart database"
        echo "  status  - Show database status"
        echo "  logs    - Show database logs"
        echo "  backup  - Create database backup"
        echo "  connect - Connect to database shell"
        echo "  test    - Test database connection"
        exit 1
        ;;
esac
