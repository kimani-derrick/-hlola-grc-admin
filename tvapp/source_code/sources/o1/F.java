package o1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class F extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12830u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerViewModel f12831v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(TvPlayerViewModel tvPlayerViewModel, D5.d dVar) {
        super(2, dVar);
        this.f12831v = tvPlayerViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new F(this.f12831v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((F) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f12830u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f12830u = 1;
            if (AbstractC0117y.f(500L, this) == aVar) {
                return aVar;
            }
        }
        TvPlayerViewModel tvPlayerViewModel = this.f12831v;
        tvPlayerViewModel.f7807l.f(new C1104f(Boolean.TRUE));
        tvPlayerViewModel.f7815u = 0L;
        tvPlayerViewModel.f7816v = 0L;
        tvPlayerViewModel.f7817w = false;
        return C1530l.f16479a;
    }
}
