package v1;

import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.customviews.TvButton;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailFragment;
import j1.AbstractC0823u;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ boolean f15258u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMovieDetailFragment f15259v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(D5.d dVar, TvMovieDetailFragment tvMovieDetailFragment) {
        super(2, dVar);
        this.f15259v = tvMovieDetailFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        f fVar = new f(dVar, this.f15259v);
        fVar.f15258u = ((Boolean) obj).booleanValue();
        return fVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C1530l c1530l = C1530l.f16479a;
        ((f) h((D5.d) obj2, bool)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        String v5;
        String str;
        AbstractC0958a.H(obj);
        boolean z7 = this.f15258u;
        TvMovieDetailFragment tvMovieDetailFragment = this.f15259v;
        TvButton tvButton = ((AbstractC0823u) tvMovieDetailFragment.f0()).f11721r;
        if (z7) {
            tvButton.setIcon(R.drawable.ic_added);
            v5 = tvMovieDetailFragment.v(R.string.added);
            str = "getString(R.string.added)";
        } else {
            tvButton.setIcon(R.drawable.ic_add);
            v5 = tvMovieDetailFragment.v(R.string.title_add_to_watch_list);
            str = "getString(R.string.title_add_to_watch_list)";
        }
        M5.g.e(v5, str);
        tvButton.setText(v5);
        return C1530l.f16479a;
    }
}
