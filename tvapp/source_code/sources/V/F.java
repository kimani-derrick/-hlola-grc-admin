package V;

import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class F extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f3515u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ L5.p f3516v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f3517w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(D5.d dVar, L5.p pVar, Object obj) {
        super(2, dVar);
        this.f3516v = pVar;
        this.f3517w = obj;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new F(dVar, this.f3516v, this.f3517w);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((F) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f3515u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f3515u = 1;
            obj = this.f3516v.j(this.f3517w, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
