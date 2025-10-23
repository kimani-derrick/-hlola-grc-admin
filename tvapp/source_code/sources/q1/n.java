package q1;

import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class n extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ boolean f13254u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f13255v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, D5.d dVar) {
        super(2, dVar);
        this.f13255v = tVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        n nVar = new n(this.f13255v, dVar);
        nVar.f13254u = ((Boolean) obj).booleanValue();
        return nVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C1530l c1530l = C1530l.f16479a;
        ((n) h((D5.d) obj2, bool)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        this.f13255v.m0(this.f13254u);
        return C1530l.f16479a;
    }
}
