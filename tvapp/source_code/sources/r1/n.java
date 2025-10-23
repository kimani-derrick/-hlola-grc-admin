package r1;

import A5.y;
import K1.r;
import W5.InterfaceC0116x;
import Z5.w;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListViewModel;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Season;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class n extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public Object f13435u;

    /* renamed from: v  reason: collision with root package name */
    public int f13436v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TvEpisodeListViewModel f13437w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Movie f13438x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TvEpisodeListViewModel tvEpisodeListViewModel, Movie movie, D5.d dVar) {
        super(2, dVar);
        this.f13437w = tvEpisodeListViewModel;
        this.f13438x = movie;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new n(this.f13437w, this.f13438x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((n) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13436v;
        TvEpisodeListViewModel tvEpisodeListViewModel = this.f13437w;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC0958a.H(obj);
                    return C1530l.f16479a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0958a.H(obj);
            a7 = ((C1526h) obj).f16471q;
        } else {
            AbstractC0958a.H(obj);
            r rVar = tvEpisodeListViewModel.f;
            Movie movie = this.f13438x;
            long j7 = movie.f8029q;
            this.f13436v = 1;
            a7 = rVar.a(j7, movie.f8037y, this);
            if (a7 == aVar) {
                return aVar;
            }
        }
        if (!(a7 instanceof C1525g)) {
            List list = (List) a7;
            w wVar = tvEpisodeListViewModel.f7822g;
            M5.g.f(list, "<this>");
            wVar.f(new y(list));
            tvEpisodeListViewModel.f7824i.f(((Season) A5.k.W((List) tvEpisodeListViewModel.f7822g.getValue())).f8060v);
        }
        Throwable a8 = C1526h.a(a7);
        if (a8 != null) {
            this.f13435u = a7;
            this.f13436v = 2;
            if (tvEpisodeListViewModel.e(a8, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
