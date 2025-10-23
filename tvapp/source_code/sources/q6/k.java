package q6;

import java.util.List;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final j f13407a;

    /* renamed from: b  reason: collision with root package name */
    public l f13408b;

    public k(j jVar) {
        this.f13407a = jVar;
    }

    @Override // q6.l
    public final boolean a(SSLSocket sSLSocket) {
        return this.f13407a.a(sSLSocket);
    }

    @Override // q6.l
    public final String b(SSLSocket sSLSocket) {
        l e3 = e(sSLSocket);
        if (e3 == null) {
            return null;
        }
        return e3.b(sSLSocket);
    }

    @Override // q6.l
    public final boolean c() {
        return true;
    }

    @Override // q6.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        M5.g.f(list, "protocols");
        l e3 = e(sSLSocket);
        if (e3 != null) {
            e3.d(sSLSocket, str, list);
        }
    }

    public final synchronized l e(SSLSocket sSLSocket) {
        try {
            if (this.f13408b == null && this.f13407a.a(sSLSocket)) {
                this.f13408b = this.f13407a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13408b;
    }
}
