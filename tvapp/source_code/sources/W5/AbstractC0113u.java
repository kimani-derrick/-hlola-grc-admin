package W5;
/* renamed from: W5.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0113u extends D5.a implements D5.f {

    /* renamed from: r  reason: collision with root package name */
    public static final C0112t f4025r = new C0112t(D5.e.f529q, C0111s.f4018r);

    public AbstractC0113u() {
        super(D5.e.f529q);
    }

    public abstract void V(D5.i iVar, Runnable runnable);

    public boolean W() {
        return !(this instanceof x0);
    }

    public AbstractC0113u X(int i7) {
        b6.a.b(i7);
        return new b6.i(this, i7);
    }

    @Override // D5.a, D5.i
    public final D5.g f(D5.h hVar) {
        M5.g.f(hVar, "key");
        if (hVar instanceof C0112t) {
            C0112t c0112t = (C0112t) hVar;
            D5.h hVar2 = this.f523q;
            M5.g.f(hVar2, "key");
            if (hVar2 != c0112t && c0112t.f4021r != hVar2) {
                return null;
            }
            D5.g gVar = (D5.g) c0112t.f4020q.c(this);
            if (!(gVar instanceof D5.g)) {
                return null;
            }
            return gVar;
        } else if (D5.e.f529q != hVar) {
            return null;
        } else {
            return this;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0117y.j(this);
    }

    @Override // D5.a, D5.i
    public final D5.i x(D5.h hVar) {
        M5.g.f(hVar, "key");
        boolean z7 = hVar instanceof C0112t;
        D5.j jVar = D5.j.f531q;
        if (z7) {
            C0112t c0112t = (C0112t) hVar;
            D5.h hVar2 = this.f523q;
            M5.g.f(hVar2, "key");
            if ((hVar2 == c0112t || c0112t.f4021r == hVar2) && ((D5.g) c0112t.f4020q.c(this)) != null) {
                return jVar;
            }
        } else if (D5.e.f529q == hVar) {
            return jVar;
        }
        return this;
    }
}
