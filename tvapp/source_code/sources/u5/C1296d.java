package u5;

import O3.AbstractC0072p;
import androidx.fragment.app.D;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import h1.i;
import h1.k;
import java.io.Closeable;
import java.util.LinkedHashSet;
import l0.C0967c;
import y5.InterfaceC1496a;
/* renamed from: u5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296d extends a0 implements Y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f15074a;

    public C1296d(D d) {
        this.f15074a = d;
    }

    @Override // androidx.lifecycle.Y
    public final V a(Class cls) {
        if (cls.getCanonicalName() != null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.Y
    public final V b(Class cls, C0967c c0967c) {
        String str = (String) c0967c.f12233a.get(W.f6802b);
        if (str != null) {
            return d(str, cls, P.d(c0967c));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final V d(String str, Class cls, N n) {
        final C1299g c1299g = new C1299g();
        D d = this.f15074a;
        d.getClass();
        n.getClass();
        d.getClass();
        d.getClass();
        k kVar = (k) ((InterfaceC1297e) android.support.v4.media.session.b.g0(InterfaceC1297e.class, new k((i) d.f5883r, (h1.f) d.f5884s)));
        kVar.getClass();
        AbstractC0072p.c("expectedSize", 17);
        C.d dVar = new C.d(17, 4);
        dVar.z("com.boxhdo.android.tv.ui.playerLoading.PlayerLoadingViewModel", kVar.f10947b);
        dVar.z("com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsViewModel", kVar.f10948c);
        dVar.z("com.boxhdo.android.tv.ui.update.TVUpdateViewModel", kVar.d);
        dVar.z("com.boxhdo.android.tv.ui.activity.main.TVViewModel", kVar.f10949e);
        dVar.z("com.boxhdo.android.tv.ui.episode_list.TvEpisodeListViewModel", kVar.f);
        dVar.z("com.boxhdo.android.tv.ui.home.TvHomeViewModel", kVar.f10950g);
        dVar.z("com.boxhdo.android.tv.ui.login.TvLoginViewModel", kVar.f10951h);
        dVar.z("com.boxhdo.android.tv.ui.hostMain.TvMainViewModel", kVar.f10952i);
        dVar.z("com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailViewModel", kVar.f10953j);
        dVar.z("com.boxhdo.android.tv.ui.movies.TvMoviesViewModel", kVar.f10954k);
        dVar.z("com.boxhdo.android.tv.ui.mylist.TvMyListViewModel", kVar.f10955l);
        dVar.z("com.boxhdo.android.tv.ui.network_detail.TvNetworkDetailViewModel", kVar.f10956m);
        dVar.z("com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel", kVar.n);
        dVar.z("com.boxhdo.android.tv.ui.search.TvSearchViewModel", kVar.f10957o);
        dVar.z("com.boxhdo.android.tv.ui.tvseries.TvSeriesViewModel", kVar.f10958p);
        dVar.z("com.boxhdo.android.tv.ui.settings.TvSettingsViewModel", kVar.f10959q);
        dVar.z("com.boxhdo.android.tv.ui.splash.TvSplashViewModel", kVar.f10960r);
        InterfaceC1496a interfaceC1496a = (InterfaceC1496a) dVar.c().get(cls.getName());
        if (interfaceC1496a != null) {
            V v5 = (V) interfaceC1496a.get();
            Closeable closeable = new Closeable() { // from class: u5.c
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    C1299g.this.a();
                }
            };
            LinkedHashSet linkedHashSet = v5.f6799b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    v5.f6799b.add(closeable);
                }
            }
            return v5;
        }
        throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
    }

    @Override // androidx.lifecycle.a0
    public final void c(V v5) {
    }
}
