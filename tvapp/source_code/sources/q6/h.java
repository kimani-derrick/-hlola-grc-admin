package q6;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
/* loaded from: classes.dex */
public final class h implements j {
    @Override // q6.j
    public final boolean a(SSLSocket sSLSocket) {
        boolean z7 = p6.h.d;
        if (p6.f.b() && Conscrypt.isConscrypt(sSLSocket)) {
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
