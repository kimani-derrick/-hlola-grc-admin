package q1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class r extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f13262u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f13263v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, D5.d dVar) {
        super(2, dVar);
        this.f13263v = tVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        r rVar = new r(this.f13263v, dVar);
        rVar.f13262u = obj;
        return rVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((r) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f13262u;
        t tVar = this.f13263v;
        AbstractC0117y.p(interfaceC0116x, null, 0, new o(tVar, null), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new q(tVar, null), 3);
        return C1530l.f16479a;
    }
}
