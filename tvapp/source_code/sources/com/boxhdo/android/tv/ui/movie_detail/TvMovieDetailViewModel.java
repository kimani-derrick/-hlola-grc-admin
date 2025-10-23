package com.boxhdo.android.tv.ui.movie_detail;

import K1.C0053d;
import K1.C0055f;
import K1.D;
import K1.j;
import K1.t;
import K1.z;
import M1.h;
import M5.g;
import N1.b;
import Z5.s;
import Z5.w;
import q1.C1104f;
import q1.i;
import v1.o;
/* loaded from: classes.dex */
public final class TvMovieDetailViewModel extends i {
    public final t f;

    /* renamed from: g  reason: collision with root package name */
    public final C0053d f7849g;

    /* renamed from: h  reason: collision with root package name */
    public final D f7850h;

    /* renamed from: i  reason: collision with root package name */
    public final z f7851i;

    /* renamed from: j  reason: collision with root package name */
    public final b f7852j;

    /* renamed from: k  reason: collision with root package name */
    public final C0055f f7853k;

    /* renamed from: l  reason: collision with root package name */
    public final h f7854l;

    /* renamed from: m  reason: collision with root package name */
    public final j f7855m;
    public final w n;

    /* renamed from: o  reason: collision with root package name */
    public final w f7856o;

    /* renamed from: p  reason: collision with root package name */
    public final w f7857p;

    /* renamed from: q  reason: collision with root package name */
    public final w f7858q;

    public TvMovieDetailViewModel(t tVar, C0053d c0053d, D d, z zVar, b bVar, C0055f c0055f, h hVar, j jVar) {
        g.f(tVar, "getMovieDetailUseCase");
        g.f(c0053d, "addToWatchListUseCase");
        g.f(d, "removeWatchListUseCase");
        g.f(zVar, "getSimilarMoviesUseCase");
        g.f(bVar, "checkLocalWatchListUseCase");
        g.f(c0055f, "checkContinueWatchUseCase");
        g.f(hVar, "traktLoginUseCase");
        g.f(jVar, "getAllWatchListUseCase");
        this.f = tVar;
        this.f7849g = c0053d;
        this.f7850h = d;
        this.f7851i = zVar;
        this.f7852j = bVar;
        this.f7853k = c0055f;
        this.f7854l = hVar;
        this.f7855m = jVar;
        this.n = s.b(null);
        this.f7856o = s.b(A5.t.f135q);
        this.f7857p = s.b(new C1104f(o.f15272a));
        this.f7858q = s.b(Boolean.TRUE);
    }
}
