package q1;

import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class p extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f13258u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f13259v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, D5.d dVar) {
        super(2, dVar);
        this.f13259v = tVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        p pVar = new p(this.f13259v, dVar);
        pVar.f13258u = obj;
        return pVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((p) h(dVar, (m) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        this.f13259v.n0((m) this.f13258u, true);
        return C1530l.f16479a;
    }
}
