package v6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class E extends C1338c {

    /* renamed from: m  reason: collision with root package name */
    public final Socket f15364m;

    public E(Socket socket) {
        this.f15364m = socket;
    }

    @Override // v6.C1338c
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v6.C1338c
    public final void k() {
        Level level;
        StringBuilder sb;
        Logger logger;
        Exception exc;
        Socket socket = this.f15364m;
        try {
            socket.close();
        } catch (AssertionError e3) {
            if (p6.l.y(e3)) {
                Logger logger2 = t.f15413a;
                level = Level.WARNING;
                sb = new StringBuilder("Failed to close timed out socket ");
                exc = e3;
                logger = logger2;
                sb.append(socket);
                logger.log(level, sb.toString(), (Throwable) exc);
            }
            throw e3;
        } catch (Exception e7) {
            Logger logger3 = t.f15413a;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            exc = e7;
            logger = logger3;
            sb.append(socket);
            logger.log(level, sb.toString(), (Throwable) exc);
        }
    }
}
