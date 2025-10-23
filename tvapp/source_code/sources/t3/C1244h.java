package t3;
/* renamed from: t3.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244h {

    /* renamed from: a  reason: collision with root package name */
    public final C1251o f14573a = new C1251o();

    public final void a(Exception exc) {
        C1251o c1251o = this.f14573a;
        c1251o.getClass();
        g3.n.h(exc, "Exception must not be null");
        synchronized (c1251o.f14595a) {
            try {
                if (!c1251o.f14597c) {
                    c1251o.f14597c = true;
                    c1251o.f = exc;
                    c1251o.f14596b.n(c1251o);
                }
            } finally {
            }
        }
    }

    public final void b(Object obj) {
        C1251o c1251o = this.f14573a;
        synchronized (c1251o.f14595a) {
            try {
                if (!c1251o.f14597c) {
                    c1251o.f14597c = true;
                    c1251o.f14598e = obj;
                    c1251o.f14596b.n(c1251o);
                }
            } finally {
            }
        }
    }
}
