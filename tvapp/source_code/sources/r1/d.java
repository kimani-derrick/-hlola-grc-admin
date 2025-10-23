package r1;

import W5.p0;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListFragment;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListViewModel;
import com.boxhdo.domain.model.Episode;
import com.boxhdo.domain.model.Season;
import com.boxhdo.domain.type.MediaType;
import z5.C1530l;
/* loaded from: classes.dex */
public final class d extends M5.h implements L5.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f13418r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ TvEpisodeListFragment f13419s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TvEpisodeListFragment tvEpisodeListFragment, int i7) {
        super(1);
        this.f13418r = i7;
        this.f13419s = tvEpisodeListFragment;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        switch (this.f13418r) {
            case 0:
                Episode episode = (Episode) obj;
                M5.g.f(episode, "it");
                TvEpisodeListFragment tvEpisodeListFragment = this.f13419s;
                String str = tvEpisodeListFragment.r0().f13434a.f8032t;
                MediaType mediaType = tvEpisodeListFragment.r0().f13434a.f8037y;
                long j7 = tvEpisodeListFragment.r0().f13434a.f8029q;
                String str2 = tvEpisodeListFragment.r0().f13434a.f8031s;
                String str3 = tvEpisodeListFragment.r0().f13434a.f8034v;
                float f = (float) tvEpisodeListFragment.r0().f13434a.F;
                String str4 = tvEpisodeListFragment.r0().f13434a.f8035w;
                M5.g.f(str, "movieName");
                M5.g.f(mediaType, "movieType");
                tvEpisodeListFragment.i0(new h1.n(str, mediaType, j7, episode.f7966q, 1L, 1L, 0L, str2, str3, f, str4));
                return C1530l.f16479a;
            default:
                Season season = (Season) obj;
                M5.g.f(season, "it");
                TvEpisodeListViewModel tvEpisodeListViewModel = (TvEpisodeListViewModel) this.f13419s.f7818u0.getValue();
                p0 p0Var = tvEpisodeListViewModel.f7826k;
                if (p0Var != null) {
                    p0Var.b(null);
                }
                tvEpisodeListViewModel.f7826k = tvEpisodeListViewModel.d(false, new o(tvEpisodeListViewModel, season.f8055q, null));
                return C1530l.f16479a;
        }
    }
}
