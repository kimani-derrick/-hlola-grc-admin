package o1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.Movie;
import k3.AbstractC0958a;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class E extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12825u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerViewModel f12826v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f12827w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f12828x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Movie f12829y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(TvPlayerViewModel tvPlayerViewModel, long j7, long j8, Movie movie, D5.d dVar) {
        super(2, dVar);
        this.f12826v = tvPlayerViewModel;
        this.f12827w = j7;
        this.f12828x = j8;
        this.f12829y = movie;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new E(this.f12826v, this.f12827w, this.f12828x, this.f12829y, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((E) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        int i7;
        E5.a aVar = E5.a.f612q;
        int i8 = this.f12825u;
        C1530l c1530l = C1530l.f16479a;
        if (i8 != 0) {
            if (i8 == 1) {
                AbstractC0958a.H(obj);
                ((C1526h) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvPlayerViewModel tvPlayerViewModel = this.f12826v;
            EpisodeSource episodeSource = tvPlayerViewModel.f7810p;
            if (episodeSource == null) {
                return c1530l;
            }
            long j7 = this.f12827w;
            long j8 = this.f12828x;
            if (j7 > j8) {
                i7 = 100;
            } else {
                i7 = (int) ((100 * j7) / j8);
            }
            if (j7 > j8) {
                j7 = j8;
            }
            K1.h hVar = tvPlayerViewModel.f7804i;
            Long l7 = new Long(episodeSource.f7976q);
            this.f12825u = 1;
            if (hVar.a(this.f12829y, j7, i7, l7, null, null, this) == aVar) {
                return aVar;
            }
        }
        return c1530l;
    }
}
