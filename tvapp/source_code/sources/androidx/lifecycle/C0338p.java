package androidx.lifecycle;

import W5.C0114v;
import W5.InterfaceC0093a0;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: androidx.lifecycle.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338p extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f6823u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f6824v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0338p(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, D5.d dVar) {
        super(2, dVar);
        this.f6824v = lifecycleCoroutineScopeImpl;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C0338p c0338p = new C0338p(this.f6824v, dVar);
        c0338p.f6823u = obj;
        return c0338p;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C0338p) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f6823u;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f6824v;
        if (lifecycleCoroutineScopeImpl.f6764q.l().compareTo(EnumC0337o.f6818r) >= 0) {
            lifecycleCoroutineScopeImpl.f6764q.g(lifecycleCoroutineScopeImpl);
        } else {
            InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) interfaceC0116x.n().f(C0114v.f4028r);
            if (interfaceC0093a0 != null) {
                interfaceC0093a0.b(null);
            }
        }
        return C1530l.f16479a;
    }
}
