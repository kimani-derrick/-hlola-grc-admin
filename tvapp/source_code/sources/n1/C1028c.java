package n1;

import W5.AbstractC0117y;
import W5.G;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: n1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028c extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12623u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ L1.m f12624v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028c(L1.m mVar, D5.d dVar) {
        super(2, dVar);
        this.f12624v = mVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1028c(this.f12624v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1028c) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [L5.p, F5.i] */
    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f12623u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f12623u = 1;
            this.f12624v.getClass();
            obj = AbstractC0117y.y(this, G.f3946b, new F5.i(2, null));
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
