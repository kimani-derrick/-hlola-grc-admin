package L0;

import java.io.Closeable;
/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: q  reason: collision with root package name */
    public final c f1872q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1873r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ g f1874s;

    public d(g gVar, c cVar) {
        this.f1874s = gVar;
        this.f1872q = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f1873r) {
            this.f1873r = true;
            g gVar = this.f1874s;
            synchronized (gVar) {
                c cVar = this.f1872q;
                int i7 = cVar.f1870h - 1;
                cVar.f1870h = i7;
                if (i7 == 0 && cVar.f) {
                    U5.d dVar = g.f1877G;
                    gVar.V(cVar);
                }
            }
        }
    }
}
