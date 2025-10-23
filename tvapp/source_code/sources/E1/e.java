package E1;

import com.boxhdo.android.tv.ui.tvseries.TvSeriesFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class e extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f547u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSeriesFragment f548v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TvSeriesFragment tvSeriesFragment, D5.d dVar) {
        super(2, dVar);
        this.f548v = tvSeriesFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        e eVar = new e(this.f548v, dVar);
        eVar.f547u = obj;
        return eVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((e) h(dVar, (o) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        o oVar = (o) this.f547u;
        if (!M5.g.a(oVar, m.f559a) && (oVar instanceof n)) {
            TvSeriesFragment tvSeriesFragment = this.f548v;
            if (!tvSeriesFragment.f7914K1) {
                tvSeriesFragment.O0(((n) oVar).f560a);
            }
            tvSeriesFragment.f7914K1 = false;
        }
        return C1530l.f16479a;
    }
}
