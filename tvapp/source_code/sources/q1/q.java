package q1;

import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class q extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13260u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f13261v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, D5.d dVar) {
        super(2, dVar);
        this.f13261v = tVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new q(this.f13261v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((q) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13260u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            t tVar = this.f13261v;
            T4.c cVar = new T4.c(28, tVar.h0().d);
            p pVar = new p(tVar, null);
            this.f13260u = 1;
            if (Z5.s.e(cVar, pVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
