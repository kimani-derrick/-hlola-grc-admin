package E1;

import W5.p0;
import androidx.leanback.widget.C0280a;
import androidx.leanback.widget.J;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.tvseries.TvSeriesFragment;
import com.boxhdo.android.tv.ui.tvseries.TvSeriesViewModel;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.type.PageType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k3.AbstractC0958a;
import q1.z;
import z5.C1524f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class c extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f543u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSeriesFragment f544v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TvSeriesFragment tvSeriesFragment, D5.d dVar) {
        super(2, dVar);
        this.f544v = tvSeriesFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        c cVar = new c(this.f544v, dVar);
        cVar.f543u = obj;
        return cVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((c) h(dVar, (List) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        int i7;
        AbstractC0958a.H(obj);
        List list = (List) this.f543u;
        if (!list.isEmpty()) {
            int i8 = TvSeriesFragment.f7912M1;
            TvSeriesFragment tvSeriesFragment = this.f544v;
            tvSeriesFragment.J0().f11652s.b();
            List<C1524f> list2 = list;
            ArrayList arrayList = new ArrayList(A5.m.P(list2));
            for (C1524f c1524f : list2) {
                int ordinal = ((PageType) c1524f.f16468q).ordinal();
                Object obj2 = c1524f.f16469r;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            i7 = R.string.title_popular;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        i7 = R.string.title_trending;
                    }
                } else {
                    List list3 = (List) obj2;
                    tvSeriesFragment.N0((Movie) A5.k.W(list3));
                    TvSeriesViewModel T02 = tvSeriesFragment.T0();
                    Movie movie = (Movie) A5.k.W(list3);
                    M5.g.f(movie, "movie");
                    p0 p0Var = T02.f7918i;
                    if (p0Var != null) {
                        p0Var.b(null);
                    }
                    T02.f7918i = T02.d(false, new q(false, T02, movie, null));
                    i7 = R.string.title_lastest;
                }
                String v5 = tvSeriesFragment.v(i7);
                M5.g.e(v5, "getString(\n             …                        )");
                C0280a c0280a = new C0280a((z) tvSeriesFragment.I1.getValue());
                c0280a.e(0, (Collection) obj2);
                arrayList.add(new J(new B0.d(5, v5, false), c0280a));
            }
            tvSeriesFragment.f13223B1.e(0, arrayList);
            tvSeriesFragment.R0();
        }
        return C1530l.f16479a;
    }
}
