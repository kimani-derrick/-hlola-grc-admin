package r1;

import A5.t;
import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import Z5.u;
import Z5.w;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListViewModel;
import com.boxhdo.domain.model.Season;
import java.util.Iterator;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class o extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13439u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvEpisodeListViewModel f13440v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f13441w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TvEpisodeListViewModel tvEpisodeListViewModel, long j7, D5.d dVar) {
        super(2, dVar);
        this.f13440v = tvEpisodeListViewModel;
        this.f13441w = j7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new o(this.f13440v, this.f13441w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((o) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        long d;
        List list;
        Object obj2;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13439u;
        C1530l c1530l = C1530l.f16479a;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            int i8 = V5.a.f3731t;
            V5.c cVar = V5.c.MILLISECONDS;
            long C02 = android.support.v4.media.session.b.C0(200, cVar);
            this.f13439u = 1;
            long j7 = 0;
            if (V5.a.b(C02, 0L) > 0) {
                if ((((int) C02) & 1) == 1 && (!V5.a.c(C02))) {
                    d = C02 >> 1;
                } else {
                    d = V5.a.d(C02, cVar);
                }
                if (d < 1) {
                    j7 = 1;
                } else {
                    j7 = d;
                }
            }
            Object f = AbstractC0117y.f(j7, this);
            if (f != aVar) {
                f = c1530l;
            }
            if (f == aVar) {
                return aVar;
            }
        }
        TvEpisodeListViewModel tvEpisodeListViewModel = this.f13440v;
        w wVar = tvEpisodeListViewModel.f7824i;
        Iterator it = ((Iterable) ((u) tvEpisodeListViewModel.f7823h.f3382r).getValue()).iterator();
        while (true) {
            list = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((Season) obj2).f8055q == this.f13441w) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Season season = (Season) obj2;
        if (season != null) {
            list = season.f8060v;
        }
        if (list == null) {
            list = t.f135q;
        }
        wVar.f(list);
        return c1530l;
    }
}
