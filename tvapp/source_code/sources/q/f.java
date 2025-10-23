package q;

import a.AbstractC0189a;
/* loaded from: classes.dex */
public final class f extends AbstractC0189a {
    @Override // a.AbstractC0189a
    public final void C(g gVar, g gVar2) {
        gVar.f13205b = gVar2;
    }

    @Override // a.AbstractC0189a
    public final void D(g gVar, Thread thread) {
        gVar.f13204a = thread;
    }

    @Override // a.AbstractC0189a
    public final boolean i(h hVar, C1094d c1094d, C1094d c1094d2) {
        synchronized (hVar) {
            try {
                if (hVar.f13211r == c1094d) {
                    hVar.f13211r = c1094d2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0189a
    public final boolean j(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f13210q == obj) {
                    hVar.f13210q = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0189a
    public final boolean k(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f13212s == gVar) {
                    hVar.f13212s = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
