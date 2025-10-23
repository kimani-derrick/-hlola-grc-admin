package Y5;

import W5.A0;
import r0.AbstractC1111a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: B  reason: collision with root package name */
    public final int f4538B;

    public m(int i7, int i8, L5.l lVar) {
        super(i7, lVar);
        this.f4538B = i8;
        if (i8 != 1) {
            if (i7 >= 1) {
                return;
            }
            throw new IllegalArgumentException(AbstractC1111a.n(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + M5.p.a(b.class).b() + " instead").toString());
    }

    public final Object G(Object obj, boolean z7) {
        j jVar;
        A0 a02;
        L5.l lVar;
        F0.c a7;
        C1530l c1530l = C1530l.f16479a;
        if (this.f4538B == 3) {
            Object e3 = super.e(obj);
            if (!(!(e3 instanceof h)) && !(e3 instanceof g)) {
                if (z7 && (lVar = this.f4513r) != null && (a7 = b6.a.a(lVar, obj, null)) != null) {
                    throw a7;
                }
                return c1530l;
            }
            return e3;
        }
        B0.d dVar = d.d;
        j jVar2 = (j) b.f4508w.get(this);
        while (true) {
            long andIncrement = b.f4504s.getAndIncrement(this);
            long j7 = andIncrement & 1152921504606846975L;
            boolean t5 = t(false, andIncrement);
            int i7 = d.f4516b;
            long j8 = i7;
            long j9 = j7 / j8;
            int i8 = (int) (j7 % j8);
            if (jVar2.f7212s != j9) {
                j a8 = b.a(this, j9, jVar2);
                if (a8 == null) {
                    if (t5) {
                        return new g(q());
                    }
                } else {
                    jVar = a8;
                }
            } else {
                jVar = jVar2;
            }
            int f = b.f(this, jVar, i8, obj, j7, dVar, t5);
            if (f != 0) {
                if (f != 1) {
                    if (f != 2) {
                        if (f != 3) {
                            if (f != 4) {
                                if (f == 5) {
                                    jVar.a();
                                }
                                jVar2 = jVar;
                            } else {
                                if (j7 < b.f4505t.get(this)) {
                                    jVar.a();
                                }
                                return new g(q());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else if (t5) {
                        jVar.h();
                        return new g(q());
                    } else {
                        if (dVar instanceof A0) {
                            a02 = (A0) dVar;
                        } else {
                            a02 = null;
                        }
                        if (a02 != null) {
                            a02.a(jVar, i8 + i7);
                        }
                        k((jVar.f7212s * j8) + i8);
                        return c1530l;
                    }
                } else {
                    return c1530l;
                }
            } else {
                jVar.a();
                return c1530l;
            }
        }
    }

    @Override // Y5.b, Y5.q
    public final Object e(Object obj) {
        return G(obj, false);
    }

    @Override // Y5.b, Y5.q
    public final Object p(D5.d dVar, Object obj) {
        F0.c a7;
        if (G(obj, true) instanceof g) {
            L5.l lVar = this.f4513r;
            if (lVar != null && (a7 = b6.a.a(lVar, obj, null)) != null) {
                android.support.v4.media.session.b.a(a7, q());
                throw a7;
            }
            throw q();
        }
        return C1530l.f16479a;
    }

    @Override // Y5.b
    public final boolean u() {
        if (this.f4538B == 2) {
            return true;
        }
        return false;
    }
}
