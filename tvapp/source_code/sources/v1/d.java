package v1;

import android.animation.ValueAnimator;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailFragment;
import com.facebook.shimmer.ShimmerFrameLayout;
import j1.AbstractC0823u;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class d extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f15254u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMovieDetailFragment f15255v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(D5.d dVar, TvMovieDetailFragment tvMovieDetailFragment) {
        super(2, dVar);
        this.f15255v = tvMovieDetailFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        d dVar2 = new d(dVar, this.f15255v);
        dVar2.f15254u = obj;
        return dVar2;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((d) h(dVar, (List) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        List list = (List) this.f15254u;
        TvMovieDetailFragment tvMovieDetailFragment = this.f15255v;
        ShimmerFrameLayout shimmerFrameLayout = ((AbstractC0823u) tvMovieDetailFragment.f0()).f11725v;
        M5.g.e(shimmerFrameLayout, "binding.layoutMovieShimmer");
        if (list.isEmpty() && shimmerFrameLayout.getVisibility() != 0) {
            ShimmerFrameLayout shimmerFrameLayout2 = ((AbstractC0823u) tvMovieDetailFragment.f0()).f11725v;
            M5.g.e(shimmerFrameLayout2, "binding.layoutMovieShimmer");
            shimmerFrameLayout2.setVisibility(0);
            P1.e eVar = ((AbstractC0823u) tvMovieDetailFragment.f0()).f11725v.f8116r;
            ValueAnimator valueAnimator = eVar.f2786e;
            if (valueAnimator != null && ((valueAnimator == null || !valueAnimator.isStarted()) && eVar.getCallback() != null)) {
                eVar.f2786e.start();
            }
        } else if (shimmerFrameLayout.getVisibility() == 0) {
            ShimmerFrameLayout shimmerFrameLayout3 = ((AbstractC0823u) tvMovieDetailFragment.f0()).f11725v;
            M5.g.e(shimmerFrameLayout3, "binding.layoutMovieShimmer");
            shimmerFrameLayout3.setVisibility(8);
            ((AbstractC0823u) tvMovieDetailFragment.f0()).f11725v.b();
        }
        ((c) tvMovieDetailFragment.f7848w0.getValue()).d.b(list, new E1.b(20, tvMovieDetailFragment));
        return C1530l.f16479a;
    }
}
