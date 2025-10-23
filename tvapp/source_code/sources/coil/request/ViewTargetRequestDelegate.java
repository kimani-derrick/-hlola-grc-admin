package coil.request;

import J0.j;
import P1.c;
import S0.g;
import S0.n;
import S0.q;
import S0.r;
import W5.AbstractC0117y;
import W5.G;
import W5.InterfaceC0093a0;
import W5.U;
import W5.p0;
import X0.e;
import androidx.lifecycle.InterfaceC0341t;
import androidx.lifecycle.InterfaceC0342u;
import b6.o;
import coil.target.GenericViewTarget;
import d6.d;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class ViewTargetRequestDelegate implements n {

    /* renamed from: q  reason: collision with root package name */
    public final j f7276q;

    /* renamed from: r  reason: collision with root package name */
    public final g f7277r;

    /* renamed from: s  reason: collision with root package name */
    public final GenericViewTarget f7278s;

    /* renamed from: t  reason: collision with root package name */
    public final c f7279t;

    /* renamed from: u  reason: collision with root package name */
    public final InterfaceC0093a0 f7280u;

    public ViewTargetRequestDelegate(j jVar, g gVar, GenericViewTarget genericViewTarget, c cVar, InterfaceC0093a0 interfaceC0093a0) {
        this.f7276q = jVar;
        this.f7277r = gVar;
        this.f7278s = genericViewTarget;
        this.f7279t = cVar;
        this.f7280u = interfaceC0093a0;
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void a(InterfaceC0342u interfaceC0342u) {
        M5.g.f(interfaceC0342u, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void b(InterfaceC0342u interfaceC0342u) {
        r c5 = e.c(this.f7278s.k());
        synchronized (c5) {
            p0 p0Var = c5.f3066r;
            if (p0Var != null) {
                p0Var.b(null);
            }
            U u7 = U.f3965q;
            d dVar = G.f3945a;
            c5.f3066r = AbstractC0117y.p(u7, o.f7208a.f4295v, 0, new q(c5, null), 2);
            c5.f3065q = null;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void c(InterfaceC0342u interfaceC0342u) {
        M5.g.f(interfaceC0342u, "owner");
    }

    @Override // S0.n
    public final /* synthetic */ void e() {
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final /* synthetic */ void f(InterfaceC0342u interfaceC0342u) {
    }

    @Override // S0.n
    public final void g() {
        GenericViewTarget genericViewTarget = this.f7278s;
        if (genericViewTarget.k().isAttachedToWindow()) {
            return;
        }
        r c5 = e.c(genericViewTarget.k());
        ViewTargetRequestDelegate viewTargetRequestDelegate = c5.f3067s;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.f7280u.b(null);
            GenericViewTarget genericViewTarget2 = viewTargetRequestDelegate.f7278s;
            boolean z7 = genericViewTarget2 instanceof InterfaceC0341t;
            c cVar = viewTargetRequestDelegate.f7279t;
            if (z7) {
                cVar.v(genericViewTarget2);
            }
            cVar.v(viewTargetRequestDelegate);
        }
        c5.f3067s = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final /* synthetic */ void h(InterfaceC0342u interfaceC0342u) {
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void i(InterfaceC0342u interfaceC0342u) {
        M5.g.f(interfaceC0342u, "owner");
    }

    @Override // S0.n
    public final void start() {
        c cVar = this.f7279t;
        cVar.g(this);
        GenericViewTarget genericViewTarget = this.f7278s;
        if (genericViewTarget instanceof InterfaceC0341t) {
            cVar.v(genericViewTarget);
            cVar.g(genericViewTarget);
        }
        r c5 = e.c(genericViewTarget.k());
        ViewTargetRequestDelegate viewTargetRequestDelegate = c5.f3067s;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.f7280u.b(null);
            GenericViewTarget genericViewTarget2 = viewTargetRequestDelegate.f7278s;
            boolean z7 = genericViewTarget2 instanceof InterfaceC0341t;
            c cVar2 = viewTargetRequestDelegate.f7279t;
            if (z7) {
                cVar2.v(genericViewTarget2);
            }
            cVar2.v(viewTargetRequestDelegate);
        }
        c5.f3067s = this;
    }
}
