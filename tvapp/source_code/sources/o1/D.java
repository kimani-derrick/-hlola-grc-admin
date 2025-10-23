package o1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.StreamUrl;
import com.boxhdo.domain.type.Quality;
import java.util.List;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class D extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TvPlayerViewModel f12823u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Quality f12824v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(TvPlayerViewModel tvPlayerViewModel, Quality quality, D5.d dVar) {
        super(2, dVar);
        this.f12823u = tvPlayerViewModel;
        this.f12824v = quality;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new D(this.f12823u, this.f12824v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((D) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        TvPlayerViewModel tvPlayerViewModel = this.f12823u;
        Quality quality = this.f12824v;
        tvPlayerViewModel.f7812r = quality;
        EpisodeSource episodeSource = tvPlayerViewModel.f7810p;
        if (episodeSource != null) {
            List a7 = episodeSource.a(quality);
            tvPlayerViewModel.f7808m = a7;
            StreamUrl streamUrl = (StreamUrl) A5.k.X(a7);
            if (streamUrl == null) {
                streamUrl = new StreamUrl(0);
            }
            tvPlayerViewModel.f7811q = streamUrl;
            tvPlayerViewModel.f7805j.f(new C1104f(new x(episodeSource)));
        }
        return C1530l.f16479a;
    }
}
