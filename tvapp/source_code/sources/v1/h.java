package v1;

import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailFragment;
import j1.AbstractC0823u;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f15262u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMovieDetailFragment f15263v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(D5.d dVar, TvMovieDetailFragment tvMovieDetailFragment) {
        super(2, dVar);
        this.f15263v = tvMovieDetailFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        h hVar = new h(dVar, this.f15263v);
        hVar.f15262u = obj;
        return hVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((h) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        int i7;
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f15262u).a();
        if (a7 != null) {
            q qVar = (q) a7;
            if (!M5.g.a(qVar, o.f15272a) && (qVar instanceof p)) {
                TvMovieDetailFragment tvMovieDetailFragment = this.f15263v;
                AbstractC0823u abstractC0823u = (AbstractC0823u) tvMovieDetailFragment.f0();
                if (((p) qVar).f15273a) {
                    i7 = R.string.play_continue;
                } else {
                    i7 = R.string.title_play_now;
                }
                String v5 = tvMovieDetailFragment.v(i7);
                M5.g.e(v5, "getString(if (it.isConti… R.string.title_play_now)");
                abstractC0823u.f11723t.setText(v5);
            }
        }
        return C1530l.f16479a;
    }
}
