package w1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.movies.TvMoviesViewModel;
import com.boxhdo.domain.model.Movie;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class p extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f15734u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f15735v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TvMoviesViewModel f15736w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Movie f15737x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z7, TvMoviesViewModel tvMoviesViewModel, Movie movie, D5.d dVar) {
        super(2, dVar);
        this.f15735v = z7;
        this.f15736w = tvMoviesViewModel;
        this.f15737x = movie;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new p(this.f15735v, this.f15736w, this.f15737x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((p) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f15734u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            if (this.f15735v) {
                this.f15734u = 1;
                if (AbstractC0117y.f(400L, this) == aVar) {
                    return aVar;
                }
            }
        }
        this.f15736w.f7863h.f(new m(this.f15737x));
        return C1530l.f16479a;
    }
}
