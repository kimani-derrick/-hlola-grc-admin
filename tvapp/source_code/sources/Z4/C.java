package Z4;

import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class C extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f4744u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f4745v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String str, D5.d dVar) {
        super(2, dVar);
        this.f4745v = str;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C c5 = new C(this.f4745v, dVar);
        c5.f4744u = obj;
        return c5;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C) h(dVar, (Y.b) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        Y.b bVar = (Y.b) this.f4744u;
        bVar.getClass();
        Y.d dVar = AbstractC0187y.f4874a;
        M5.g.f(dVar, "key");
        bVar.c(dVar, this.f4745v);
        return C1530l.f16479a;
    }
}
