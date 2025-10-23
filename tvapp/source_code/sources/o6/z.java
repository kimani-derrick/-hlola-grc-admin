package o6;

import java.io.IOException;
import java.net.SocketTimeoutException;
import v6.C1338c;
/* loaded from: classes.dex */
public final class z extends C1338c {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ A f13092m;

    public z(A a7) {
        M5.g.f(a7, "this$0");
        this.f13092m = a7;
    }

    @Override // v6.C1338c
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // v6.C1338c
    public final void k() {
        this.f13092m.e(EnumC1073b.f12990w);
        s sVar = this.f13092m.f12961b;
        synchronized (sVar) {
            long j7 = sVar.F;
            long j8 = sVar.f13043E;
            if (j7 >= j8) {
                sVar.f13043E = j8 + 1;
                sVar.f13044G = System.nanoTime() + 1000000000;
                sVar.f13063y.c(new k6.b(M5.g.k(" ping", sVar.f13058t), sVar, 2), 0L);
            }
        }
    }

    public final void l() {
        if (!i()) {
            return;
        }
        throw j(null);
    }
}
