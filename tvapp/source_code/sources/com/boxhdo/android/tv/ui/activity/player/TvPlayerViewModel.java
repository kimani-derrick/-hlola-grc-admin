package com.boxhdo.android.tv.ui.activity.player;

import K1.C0051b;
import K1.h;
import L1.e;
import L1.k;
import M5.g;
import W5.p0;
import Z5.s;
import Z5.w;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.StreamUrl;
import com.boxhdo.domain.type.Quality;
import java.util.ArrayList;
import java.util.List;
import o1.D;
import o1.E;
import o1.z;
import q1.C1104f;
import q1.i;
import z5.C1524f;
/* loaded from: classes.dex */
public final class TvPlayerViewModel extends i {
    public final e f;

    /* renamed from: g  reason: collision with root package name */
    public final k f7802g;

    /* renamed from: h  reason: collision with root package name */
    public final C0051b f7803h;

    /* renamed from: i  reason: collision with root package name */
    public final h f7804i;

    /* renamed from: j  reason: collision with root package name */
    public final w f7805j;

    /* renamed from: k  reason: collision with root package name */
    public final w f7806k;

    /* renamed from: l  reason: collision with root package name */
    public final w f7807l;

    /* renamed from: m  reason: collision with root package name */
    public List f7808m;
    public p0 n;

    /* renamed from: o  reason: collision with root package name */
    public List f7809o;

    /* renamed from: p  reason: collision with root package name */
    public EpisodeSource f7810p;

    /* renamed from: q  reason: collision with root package name */
    public StreamUrl f7811q;

    /* renamed from: r  reason: collision with root package name */
    public Quality f7812r;

    /* renamed from: s  reason: collision with root package name */
    public long f7813s;

    /* renamed from: t  reason: collision with root package name */
    public float f7814t;

    /* renamed from: u  reason: collision with root package name */
    public long f7815u;

    /* renamed from: v  reason: collision with root package name */
    public long f7816v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7817w;

    public TvPlayerViewModel(e eVar, k kVar, C0051b c0051b, h hVar) {
        g.f(eVar, "getGeneralSettings");
        g.f(kVar, "saveGeneralSettings");
        g.f(c0051b, "addToHistoryUseCase");
        g.f(hVar, "continueWatchUseCase");
        this.f = eVar;
        this.f7802g = kVar;
        this.f7803h = c0051b;
        this.f7804i = hVar;
        this.f7805j = s.b(new C1104f(z.f12887a));
        this.f7806k = s.b(new C1104f(new C1524f(0L, 0L)));
        this.f7807l = s.b(new C1104f(Boolean.FALSE));
        this.f7808m = new ArrayList();
        this.f7811q = new StreamUrl(0);
        this.f7812r = Quality.f8104q;
        this.f7813s = -1L;
        this.f7814t = 1.0f;
    }

    public final void g(Quality quality) {
        d(false, new D(this, quality, null));
    }

    public final void h(Movie movie, long j7, long j8) {
        g.f(movie, "movie");
        d(false, new E(this, j7, j8, movie, null));
    }
}
