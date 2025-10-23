package r1;

import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListFragment;
/* loaded from: classes.dex */
public final class e extends M5.h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f13420r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ TvEpisodeListFragment f13421s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TvEpisodeListFragment tvEpisodeListFragment, int i7) {
        super(0);
        this.f13420r = i7;
        this.f13421s = tvEpisodeListFragment;
    }

    @Override // L5.a
    public final Object b() {
        switch (this.f13420r) {
            case 0:
                return new c(new d(this.f13421s, 0));
            default:
                return new q(new d(this.f13421s, 1));
        }
    }
}
