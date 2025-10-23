package E1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.tvseries.TvSeriesViewModel;
import com.boxhdo.domain.model.Movie;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class q extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f569u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f570v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TvSeriesViewModel f571w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Movie f572x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z7, TvSeriesViewModel tvSeriesViewModel, Movie movie, D5.d dVar) {
        super(2, dVar);
        this.f570v = z7;
        this.f571w = tvSeriesViewModel;
        this.f572x = movie;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new q(this.f570v, this.f571w, this.f572x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((q) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f569u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            if (this.f570v) {
                this.f569u = 1;
                if (AbstractC0117y.f(400L, this) == aVar) {
                    return aVar;
                }
            }
        }
        this.f571w.f7917h.f(new n(this.f572x));
        return C1530l.f16479a;
    }
}
