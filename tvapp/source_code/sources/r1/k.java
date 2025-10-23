package r1;

import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class k extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13432u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvEpisodeListFragment f13433v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TvEpisodeListFragment tvEpisodeListFragment, D5.d dVar) {
        super(2, dVar);
        this.f13433v = tvEpisodeListFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new k(this.f13433v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((k) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13432u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            TvEpisodeListFragment tvEpisodeListFragment = this.f13433v;
            j jVar = new j(tvEpisodeListFragment, null);
            this.f13432u = 1;
            if (P.k(tvEpisodeListFragment, enumC0337o, jVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
