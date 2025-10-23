package F1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.update.TVUpdateFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class k extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f642u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TVUpdateFragment f643v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(D5.d dVar, TVUpdateFragment tVUpdateFragment) {
        super(2, dVar);
        this.f643v = tVUpdateFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new k(dVar, this.f643v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((k) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f642u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TVUpdateFragment tVUpdateFragment = this.f643v;
            T4.c cVar = new T4.c(29, tVUpdateFragment.h0().f7926j);
            j jVar = new j(null, tVUpdateFragment);
            this.f642u = 1;
            if (Z5.s.e(cVar, jVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
