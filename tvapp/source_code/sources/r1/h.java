package r1;

import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListFragment;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f13426u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvEpisodeListFragment f13427v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TvEpisodeListFragment tvEpisodeListFragment, D5.d dVar) {
        super(2, dVar);
        this.f13427v = tvEpisodeListFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        h hVar = new h(this.f13427v, dVar);
        hVar.f13426u = obj;
        return hVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((h) h(dVar, (List) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        ((c) this.f13427v.f7821x0.getValue()).d.b((List) this.f13426u, null);
        return C1530l.f16479a;
    }
}
