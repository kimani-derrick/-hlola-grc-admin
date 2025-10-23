package b5;

import L5.p;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class m extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f7167u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f7168v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Y.d f7169w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ n f7170x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj, Y.d dVar, n nVar, D5.d dVar2) {
        super(2, dVar2);
        this.f7168v = obj;
        this.f7169w = dVar;
        this.f7170x = nVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        m mVar = new m(this.f7168v, this.f7169w, this.f7170x, dVar);
        mVar.f7167u = obj;
        return mVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((m) h(dVar, (Y.b) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        Y.b bVar = (Y.b) this.f7167u;
        Y.d dVar = this.f7169w;
        Object obj2 = this.f7168v;
        if (obj2 != null) {
            bVar.getClass();
            M5.g.f(dVar, "key");
            bVar.c(dVar, obj2);
        } else {
            bVar.getClass();
            M5.g.f(dVar, "key");
            bVar.a();
            bVar.f4297a.remove(dVar);
        }
        n.a(this.f7170x, bVar);
        return C1530l.f16479a;
    }
}
