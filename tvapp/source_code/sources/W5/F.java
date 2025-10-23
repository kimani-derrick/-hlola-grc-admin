package W5;

import java.util.concurrent.CancellationException;
import k3.AbstractC0958a;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public abstract class F extends d6.h {

    /* renamed from: s  reason: collision with root package name */
    public int f3944s;

    public F(int i7) {
        super(0L, d6.j.f9320g);
        this.f3944s = i7;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract D5.d c();

    public Throwable e(Object obj) {
        C0109p c0109p;
        if (obj instanceof C0109p) {
            c0109p = (C0109p) obj;
        } else {
            c0109p = null;
        }
        if (c0109p == null) {
            return null;
        }
        return c0109p.f4012a;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            android.support.v4.media.session.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        M5.g.c(th);
        AbstractC0117y.m(c().k(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        y0 y0Var;
        InterfaceC0093a0 interfaceC0093a0;
        Object f;
        Object obj = C1530l.f16479a;
        B4.b bVar = this.f9314r;
        try {
            D5.d c5 = c();
            M5.g.d(c5, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            b6.h hVar = (b6.h) c5;
            D5.d dVar = hVar.f7189u;
            Object obj2 = hVar.f7191w;
            D5.i k5 = dVar.k();
            Object m7 = b6.a.m(k5, obj2);
            if (m7 != b6.a.f) {
                y0Var = AbstractC0117y.x(dVar, k5, m7);
            } else {
                y0Var = null;
            }
            D5.i k7 = dVar.k();
            Object j7 = j();
            Throwable e3 = e(j7);
            if (e3 == null && AbstractC0117y.o(this.f3944s)) {
                interfaceC0093a0 = (InterfaceC0093a0) k7.f(C0114v.f4028r);
            } else {
                interfaceC0093a0 = null;
            }
            if (interfaceC0093a0 != null && !interfaceC0093a0.a()) {
                CancellationException E4 = ((j0) interfaceC0093a0).E();
                b(j7, E4);
                f = AbstractC0958a.m(E4);
            } else if (e3 != null) {
                f = AbstractC0958a.m(e3);
            } else {
                f = f(j7);
            }
            dVar.m(f);
            if (y0Var == null || y0Var.e0()) {
                b6.a.h(k5, m7);
            }
            try {
                bVar.getClass();
            } catch (Throwable th) {
                obj = AbstractC0958a.m(th);
            }
            h(null, C1526h.a(obj));
        } catch (Throwable th2) {
            try {
                bVar.getClass();
            } catch (Throwable th3) {
                obj = AbstractC0958a.m(th3);
            }
            h(th2, C1526h.a(obj));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
