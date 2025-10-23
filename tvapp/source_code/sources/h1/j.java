package h1;

import K1.B;
import K1.C0051b;
import K1.C0053d;
import K1.C0055f;
import K1.D;
import K1.F;
import K1.G;
import K1.r;
import K1.t;
import K1.v;
import K1.x;
import K1.z;
import a1.C0197a;
import android.app.Application;
import com.boxhdo.android.tv.ui.activity.main.TVViewModel;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListViewModel;
import com.boxhdo.android.tv.ui.home.TvHomeViewModel;
import com.boxhdo.android.tv.ui.hostMain.TvMainViewModel;
import com.boxhdo.android.tv.ui.login.TvLoginViewModel;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailViewModel;
import com.boxhdo.android.tv.ui.movies.TvMoviesViewModel;
import com.boxhdo.android.tv.ui.mylist.TvMyListViewModel;
import com.boxhdo.android.tv.ui.network_detail.TvNetworkDetailViewModel;
import com.boxhdo.android.tv.ui.playerLoading.PlayerLoadingViewModel;
import com.boxhdo.android.tv.ui.search.TvSearchViewModel;
import com.boxhdo.android.tv.ui.settings.TvSettingsViewModel;
import com.boxhdo.android.tv.ui.splash.TvSplashViewModel;
import com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsViewModel;
import com.boxhdo.android.tv.ui.tvseries.TvSeriesViewModel;
import com.boxhdo.android.tv.ui.update.TVUpdateViewModel;
import com.google.android.gms.internal.measurement.K1;
import f1.C0660A;
import f1.C0669J;
import f1.C0672M;
import k1.C0935h;
import k3.AbstractC0958a;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class j implements InterfaceC1496a {

    /* renamed from: a  reason: collision with root package name */
    public final i f10943a;

    /* renamed from: b  reason: collision with root package name */
    public final k f10944b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10945c;

    public j(i iVar, k kVar, int i7) {
        this.f10943a = iVar;
        this.f10944b = kVar;
        this.f10945c = i7;
    }

    @Override // y5.InterfaceC1496a
    public final Object get() {
        k kVar = this.f10944b;
        i iVar = this.f10943a;
        int i7 = this.f10945c;
        switch (i7) {
            case 0:
                return new PlayerLoadingViewModel((K1.p) iVar.f10928o.get(), (r) iVar.f10932q.get(), (K1.n) iVar.f10935s.get());
            case 1:
                return new SubtitleSettingsViewModel((L1.j) iVar.f10938v.get(), (L1.d) iVar.f10939w.get());
            case 2:
                Application l7 = p6.d.l(iVar.f10903a.f3243a);
                AbstractC0958a.g(l7);
                return new TVUpdateViewModel(l7, (C0935h) iVar.f10940x.get());
            case 3:
                L1.g gVar = (L1.g) iVar.f10879A.get();
                M1.h hVar = (M1.h) iVar.F.get();
                i iVar2 = kVar.f10946a;
                K1 k12 = new K1((C0197a) iVar2.f10910e.get(), (C0669J) iVar2.f10883E.get(), new L4.f(5));
                i iVar3 = kVar.f10946a;
                return new TVViewModel(gVar, hVar, k12, new K1((C0669J) iVar3.f10883E.get(), new J3.e(5)), new T4.c((C0660A) iVar3.f10937u.get()), (L1.m) iVar.f10884G.get());
            case 4:
                return new TvEpisodeListViewModel((r) iVar.f10932q.get());
            case 5:
                return new TvHomeViewModel((B) iVar.f10896S.get(), (K1.l) iVar.f10898U.get());
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new TvLoginViewModel((M1.b) iVar.W.get(), (M1.e) iVar.f10900X.get());
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new TvMainViewModel();
            case 8:
                return new TvMovieDetailViewModel((t) iVar.f10902Z.get(), (C0053d) iVar.f10904a0.get(), (D) iVar.f10906b0.get(), (z) iVar.f10909d0.get(), (N1.b) iVar.f10911e0.get(), (C0055f) iVar.f10912f0.get(), (M1.h) iVar.F.get(), (K1.j) iVar.f10914g0.get());
            case 9:
                return new TvMoviesViewModel((x) iVar.f10916h0.get(), (t) iVar.f10902Z.get());
            case 10:
                K1 k13 = new K1((C0669J) kVar.f10946a.f10883E.get(), new J3.e(5));
                i iVar4 = kVar.f10946a;
                return new TvMyListViewModel((N1.d) iVar.f10920j0.get(), (M1.h) iVar.F.get(), k13, new K1((C0672M) iVar4.f10901Y.get(), (J1.m) iVar4.f10890M.get()));
            case 11:
                return new TvNetworkDetailViewModel((v) iVar.f10922k0.get());
            case 12:
                return new TvPlayerViewModel((L1.e) iVar.f10924l0.get(), (L1.k) iVar.f10926m0.get(), (C0051b) iVar.f10927n0.get(), (K1.h) iVar.f10929o0.get());
            case 13:
                return new TvSearchViewModel((F) iVar.f10931p0.get(), (G) iVar.f10933q0.get());
            case 14:
                return new TvSeriesViewModel((x) iVar.f10916h0.get());
            case 15:
                i iVar5 = kVar.f10946a;
                return new TvSettingsViewModel((M1.h) iVar.F.get(), new K1((C0197a) iVar5.f10910e.get(), (C0669J) iVar5.f10883E.get(), new L4.f(5)), new T4.c((C0669J) kVar.f10946a.f10883E.get()), (L1.d) iVar.f10939w.get());
            case 16:
                return new TvSplashViewModel((L1.g) iVar.f10879A.get());
            default:
                throw new AssertionError(i7);
        }
    }
}
