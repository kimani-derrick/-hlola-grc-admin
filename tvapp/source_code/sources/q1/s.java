package q1;

import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class s extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13264u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f13265v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, D5.d dVar) {
        super(2, dVar);
        this.f13265v = tVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new s(this.f13265v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((s) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13264u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            t tVar = this.f13265v;
            r rVar = new r(tVar, null);
            this.f13264u = 1;
            if (P.k(tVar, enumC0337o, rVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
