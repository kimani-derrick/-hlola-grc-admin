package F1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.update.TVUpdateFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class g extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f634u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TVUpdateFragment f635v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(D5.d dVar, TVUpdateFragment tVUpdateFragment) {
        super(2, dVar);
        this.f635v = tVUpdateFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new g(dVar, this.f635v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((g) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f634u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TVUpdateFragment tVUpdateFragment = this.f635v;
            T4.c cVar = new T4.c(29, tVUpdateFragment.h0().f7925i);
            f fVar = new f(null, tVUpdateFragment);
            this.f634u = 1;
            if (Z5.s.e(cVar, fVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
