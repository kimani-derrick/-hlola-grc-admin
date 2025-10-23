package com.boxhdo.android.tv.ui.playerLoading;

import K1.n;
import K1.p;
import K1.r;
import M5.g;
import Z5.s;
import Z5.w;
import q1.C1104f;
import q1.i;
import z1.C1508g;
/* loaded from: classes.dex */
public final class PlayerLoadingViewModel extends i {
    public final p f;

    /* renamed from: g  reason: collision with root package name */
    public final r f7888g;

    /* renamed from: h  reason: collision with root package name */
    public final n f7889h;

    /* renamed from: i  reason: collision with root package name */
    public final w f7890i;

    public PlayerLoadingViewModel(p pVar, r rVar, n nVar) {
        g.f(pVar, "getListEpisodeUseCase");
        g.f(rVar, "getListSeasonUseCase");
        g.f(nVar, "getEpisodeDetailUseCase");
        this.f = pVar;
        this.f7888g = rVar;
        this.f7889h = nVar;
        this.f7890i = s.b(new C1104f(C1508g.f16419a));
    }
}
