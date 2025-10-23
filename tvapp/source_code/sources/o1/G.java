package o1;

import W5.InterfaceC0116x;
import android.os.Parcelable;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.StreamUrl;
import com.boxhdo.domain.type.Quality;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class G extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TvPlayerViewModel f12832u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ EpisodeSource f12833v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(TvPlayerViewModel tvPlayerViewModel, EpisodeSource episodeSource, D5.d dVar) {
        super(2, dVar);
        this.f12832u = tvPlayerViewModel;
        this.f12833v = episodeSource;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new G(this.f12832u, this.f12833v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((G) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        Parcelable.Creator<EpisodeSource> creator = EpisodeSource.CREATOR;
        Quality quality = Quality.f8104q;
        EpisodeSource episodeSource = this.f12833v;
        List a7 = episodeSource.a(quality);
        TvPlayerViewModel tvPlayerViewModel = this.f12832u;
        tvPlayerViewModel.f7808m = a7;
        StreamUrl streamUrl = (StreamUrl) A5.k.X(a7);
        if (streamUrl == null) {
            streamUrl = new StreamUrl(0);
        }
        tvPlayerViewModel.f7811q = streamUrl;
        tvPlayerViewModel.f7809o = episodeSource.f7981v;
        return C1530l.f16479a;
    }
}
