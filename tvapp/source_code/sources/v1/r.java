package v1;

import K1.C0055f;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailViewModel;
import com.boxhdo.domain.model.Movie;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class r extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f15274u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMovieDetailViewModel f15275v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Movie f15276w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TvMovieDetailViewModel tvMovieDetailViewModel, Movie movie, D5.d dVar) {
        super(2, dVar);
        this.f15275v = tvMovieDetailViewModel;
        this.f15276w = movie;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new r(this.f15275v, this.f15276w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((r) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f15274u;
        TvMovieDetailViewModel tvMovieDetailViewModel = this.f15275v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
                a7 = ((C1526h) obj).f16471q;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0055f c0055f = tvMovieDetailViewModel.f7853k;
            long j7 = this.f15276w.f8029q;
            this.f15274u = 1;
            a7 = c0055f.a(j7, this);
            if (a7 == aVar) {
                return aVar;
            }
        }
        if (!(a7 instanceof C1525g)) {
            tvMovieDetailViewModel.f7857p.f(new C1104f(new p(((Boolean) a7).booleanValue())));
        }
        return C1530l.f16479a;
    }
}
