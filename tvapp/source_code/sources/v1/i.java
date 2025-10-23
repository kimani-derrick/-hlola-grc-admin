package v1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class i extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f15264u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMovieDetailFragment f15265v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(D5.d dVar, TvMovieDetailFragment tvMovieDetailFragment) {
        super(2, dVar);
        this.f15265v = tvMovieDetailFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new i(dVar, this.f15265v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((i) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f15264u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvMovieDetailFragment tvMovieDetailFragment = this.f15265v;
            T4.c cVar = new T4.c(29, tvMovieDetailFragment.h0().f7857p);
            h hVar = new h(null, tvMovieDetailFragment);
            this.f15264u = 1;
            if (Z5.s.e(cVar, hVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
