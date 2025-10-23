package K0;

import java.io.Closeable;
import k3.AbstractC0958a;
import v6.InterfaceC1343h;
import v6.w;
import v6.z;
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: q  reason: collision with root package name */
    public final w f1536q;

    /* renamed from: r  reason: collision with root package name */
    public final v6.k f1537r;

    /* renamed from: s  reason: collision with root package name */
    public final String f1538s;

    /* renamed from: t  reason: collision with root package name */
    public final Closeable f1539t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1540u;

    /* renamed from: v  reason: collision with root package name */
    public z f1541v;

    public k(w wVar, v6.k kVar, String str, Closeable closeable) {
        this.f1536q = wVar;
        this.f1537r = kVar;
        this.f1538s = str;
        this.f1539t = closeable;
    }

    @Override // K0.l
    public final AbstractC0958a a() {
        return null;
    }

    @Override // K0.l
    public final synchronized InterfaceC1343h b() {
        if (!this.f1540u) {
            z zVar = this.f1541v;
            if (zVar != null) {
                return zVar;
            }
            z c5 = p6.l.c(this.f1537r.l(this.f1536q));
            this.f1541v = c5;
            return c5;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f1540u = true;
            z zVar = this.f1541v;
            if (zVar != null) {
                X0.e.a(zVar);
            }
            Closeable closeable = this.f1539t;
            if (closeable != null) {
                X0.e.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
