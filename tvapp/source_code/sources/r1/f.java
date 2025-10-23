package r1;

import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListFragment;
import j1.AbstractC0817o;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f13422u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvEpisodeListFragment f13423v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TvEpisodeListFragment tvEpisodeListFragment, D5.d dVar) {
        super(2, dVar);
        this.f13423v = tvEpisodeListFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        f fVar = new f(this.f13423v, dVar);
        fVar.f13422u = obj;
        return fVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((f) h(dVar, (List) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        int i7;
        AbstractC0958a.H(obj);
        List list = (List) this.f13422u;
        TvEpisodeListFragment tvEpisodeListFragment = this.f13423v;
        AbstractC0817o abstractC0817o = (AbstractC0817o) tvEpisodeListFragment.f0();
        if (list.size() > 1) {
            i7 = R.string.format_number_seasons;
        } else {
            i7 = R.string.format_number_season;
        }
        abstractC0817o.f11700u.setText(tvEpisodeListFragment.u().getString(i7, new Integer(list.size())));
        ((q) tvEpisodeListFragment.f7820w0.getValue()).d.b(list, new E1.b(19, tvEpisodeListFragment));
        return C1530l.f16479a;
    }
}
