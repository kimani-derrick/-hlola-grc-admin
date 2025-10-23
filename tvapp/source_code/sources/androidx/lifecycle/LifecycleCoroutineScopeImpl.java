package androidx.lifecycle;

import W5.C0114v;
import W5.InterfaceC0093a0;
import W5.InterfaceC0116x;
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements InterfaceC0340s, InterfaceC0116x {

    /* renamed from: q  reason: collision with root package name */
    public final P1.c f6764q;

    /* renamed from: r  reason: collision with root package name */
    public final D5.i f6765r;

    public LifecycleCoroutineScopeImpl(P1.c cVar, D5.i iVar) {
        InterfaceC0093a0 interfaceC0093a0;
        M5.g.f(iVar, "coroutineContext");
        this.f6764q = cVar;
        this.f6765r = iVar;
        if (cVar.l() == EnumC0337o.f6817q && (interfaceC0093a0 = (InterfaceC0093a0) iVar.f(C0114v.f4028r)) != null) {
            interfaceC0093a0.b(null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0340s
    public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        P1.c cVar = this.f6764q;
        if (cVar.l().compareTo(EnumC0337o.f6817q) <= 0) {
            cVar.v(this);
            InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) this.f6765r.f(C0114v.f4028r);
            if (interfaceC0093a0 != null) {
                interfaceC0093a0.b(null);
            }
        }
    }

    @Override // W5.InterfaceC0116x
    public final D5.i n() {
        return this.f6765r;
    }
}
