package E1;

import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.tvseries.TvSeriesFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class d extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f545u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSeriesFragment f546v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TvSeriesFragment tvSeriesFragment, D5.d dVar) {
        super(2, dVar);
        this.f546v = tvSeriesFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new d(this.f546v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((d) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f545u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            int i8 = TvSeriesFragment.f7912M1;
            TvSeriesFragment tvSeriesFragment = this.f546v;
            T4.c cVar = new T4.c(29, tvSeriesFragment.T0().f7916g);
            c cVar2 = new c(tvSeriesFragment, null);
            this.f545u = 1;
            if (s.e(cVar, cVar2, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
