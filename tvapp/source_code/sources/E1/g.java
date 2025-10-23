package E1;

import com.boxhdo.android.tv.ui.tvseries.TvSeriesFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class g extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TvSeriesFragment f551u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TvSeriesFragment tvSeriesFragment, D5.d dVar) {
        super(2, dVar);
        this.f551u = tvSeriesFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new g(this.f551u, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((g) h(dVar, (q1.m) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        int i7 = TvSeriesFragment.f7912M1;
        TvSeriesFragment tvSeriesFragment = this.f551u;
        tvSeriesFragment.R0();
        tvSeriesFragment.Q0();
        tvSeriesFragment.P0();
        return C1530l.f16479a;
    }
}
