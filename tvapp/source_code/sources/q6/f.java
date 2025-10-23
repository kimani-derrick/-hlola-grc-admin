package q6;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;
/* loaded from: classes.dex */
public final class f implements j {
    @Override // q6.j
    public final boolean a(SSLSocket sSLSocket) {
        boolean z7 = p6.e.d;
        if (p6.d.r() && (sSLSocket instanceof BCSSLSocket)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q6.l, java.lang.Object] */
    @Override // q6.j
    public final l c(SSLSocket sSLSocket) {
        return new Object();
    }
}
