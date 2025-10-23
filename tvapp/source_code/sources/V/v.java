package V;

import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class v extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f3576u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f3577v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ H f3578w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(H h7, D5.d dVar) {
        super(2, dVar);
        this.f3578w = h7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        v vVar = new v(this.f3578w, dVar);
        vVar.f3577v = obj;
        return vVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((v) h((D5.d) obj2, (Z5.c) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [M5.l, java.lang.Object] */
    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f3576u;
        C1530l c1530l = C1530l.f16479a;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
                return c1530l;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0958a.H(obj);
        Z5.c cVar = (Z5.c) this.f3577v;
        H h7 = this.f3578w;
        I i8 = (I) h7.f3533w.getValue();
        if (!(i8 instanceof C0084c)) {
            h7.f3535y.N(new m(i8));
        }
        s sVar = new s(i8, null);
        this.f3576u = 1;
        h7.f3533w.t(new Z5.i(new Object(), new u(0, cVar), sVar), this);
        return aVar;
    }
}
