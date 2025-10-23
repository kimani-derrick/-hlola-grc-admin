package K0;

import k3.AbstractC0958a;
import v6.InterfaceC1343h;
import v6.r;
/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0958a f1543q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1544r;

    /* renamed from: s  reason: collision with root package name */
    public final InterfaceC1343h f1545s;

    public n(InterfaceC1343h interfaceC1343h, AbstractC0958a abstractC0958a) {
        this.f1543q = abstractC0958a;
        this.f1545s = interfaceC1343h;
    }

    @Override // K0.l
    public final AbstractC0958a a() {
        return this.f1543q;
    }

    @Override // K0.l
    public final synchronized InterfaceC1343h b() {
        InterfaceC1343h interfaceC1343h;
        try {
            if (!this.f1544r) {
                interfaceC1343h = this.f1545s;
                if (interfaceC1343h == null) {
                    r rVar = v6.k.f15396a;
                    M5.g.c(null);
                    rVar.l(null);
                    throw null;
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC1343h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f1544r = true;
        InterfaceC1343h interfaceC1343h = this.f1545s;
        if (interfaceC1343h != null) {
            X0.e.a(interfaceC1343h);
        }
    }
}
