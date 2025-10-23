package W5;

import k3.AbstractC0958a;
import z5.C1526h;
import z5.C1530l;
/* renamed from: W5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0092a extends j0 implements D5.d, InterfaceC0116x {

    /* renamed from: s  reason: collision with root package name */
    public final D5.i f3972s;

    public AbstractC0092a(D5.i iVar, boolean z7) {
        super(z7);
        N((InterfaceC0093a0) iVar.f(C0114v.f4028r));
        this.f3972s = iVar.r(this);
    }

    @Override // W5.j0
    public final void M(F0.c cVar) {
        AbstractC0117y.m(this.f3972s, cVar);
    }

    @Override // W5.j0
    public String S() {
        return super.S();
    }

    @Override // W5.j0
    public final void V(Object obj) {
        boolean z7;
        if (obj instanceof C0109p) {
            C0109p c0109p = (C0109p) obj;
            Throwable th = c0109p.f4012a;
            c0109p.getClass();
            if (C0109p.f4011b.get(c0109p) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            b0(th, z7);
            return;
        }
        c0(obj);
    }

    @Override // W5.j0, W5.InterfaceC0093a0
    public boolean a() {
        return super.a();
    }

    public final void d0(int i7, AbstractC0092a abstractC0092a, L5.p pVar) {
        int b7 = s.h.b(i7);
        if (b7 != 0) {
            if (b7 != 1) {
                if (b7 != 2) {
                    if (b7 == 3) {
                        try {
                            D5.i iVar = this.f3972s;
                            Object m7 = b6.a.m(iVar, null);
                            M5.r.b(2, pVar);
                            Object j7 = pVar.j(abstractC0092a, this);
                            b6.a.h(iVar, m7);
                            if (j7 != E5.a.f612q) {
                                m(j7);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            m(AbstractC0958a.m(th));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                M5.g.f(pVar, "<this>");
                w4.l0.x(w4.l0.g(this, pVar, abstractC0092a)).m(C1530l.f16479a);
                return;
            }
            return;
        }
        w4.l0.U(pVar, abstractC0092a, this);
    }

    @Override // D5.d
    public final D5.i k() {
        return this.f3972s;
    }

    @Override // D5.d
    public final void m(Object obj) {
        Throwable a7 = C1526h.a(obj);
        if (a7 != null) {
            obj = new C0109p(a7, false);
        }
        Object R6 = R(obj);
        if (R6 == AbstractC0117y.f4037e) {
            return;
        }
        u(R6);
    }

    @Override // W5.InterfaceC0116x
    public final D5.i n() {
        return this.f3972s;
    }

    @Override // W5.j0
    public final String z() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void c0(Object obj) {
    }

    public void b0(Throwable th, boolean z7) {
    }
}
