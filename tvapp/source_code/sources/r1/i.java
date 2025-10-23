package r1;

import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListFragment;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class i extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13428u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvEpisodeListFragment f13429v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TvEpisodeListFragment tvEpisodeListFragment, D5.d dVar) {
        super(2, dVar);
        this.f13429v = tvEpisodeListFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new i(this.f13429v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((i) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13428u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvEpisodeListFragment tvEpisodeListFragment = this.f13429v;
            h hVar = new h(tvEpisodeListFragment, null);
            this.f13428u = 1;
            if (s.e(((TvEpisodeListViewModel) tvEpisodeListFragment.f7818u0.getValue()).f7825j, hVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
