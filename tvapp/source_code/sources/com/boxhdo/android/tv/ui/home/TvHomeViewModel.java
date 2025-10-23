package com.boxhdo.android.tv.ui.home;

import A5.t;
import K1.B;
import K1.l;
import M5.g;
import T4.c;
import W5.p0;
import Z5.s;
import Z5.w;
import com.boxhdo.domain.model.HomeRow;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Vote;
import com.boxhdo.domain.type.MediaType;
import java.util.List;
import q1.i;
import s1.C1139n;
import s1.C1143r;
/* loaded from: classes.dex */
public final class TvHomeViewModel extends i {
    public final B f;

    /* renamed from: g  reason: collision with root package name */
    public final l f7830g;

    /* renamed from: h  reason: collision with root package name */
    public final c f7831h;

    /* renamed from: i  reason: collision with root package name */
    public final w f7832i;

    /* renamed from: j  reason: collision with root package name */
    public final c f7833j;

    /* renamed from: k  reason: collision with root package name */
    public final w f7834k;

    /* renamed from: l  reason: collision with root package name */
    public final c f7835l;

    /* renamed from: m  reason: collision with root package name */
    public p0 f7836m;

    public TvHomeViewModel(B b7, l lVar) {
        g.f(b7, "homeUseCase");
        g.f(lVar, "getContinueWatchUseCase");
        this.f = b7;
        this.f7830g = lVar;
        this.f7831h = new c(29, s.b(new HomeRow.SliderRow(new Movie(0L, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, 0, (MediaType) null, (String) null, (String) null, false, 0, 0, (String) null, 0.0d, 0L, (List) null, (List) null, (List) null, (List) null, false, (Vote) null, 16777215))));
        w b8 = s.b(t.f135q);
        this.f7832i = b8;
        this.f7833j = new c(29, b8);
        w b9 = s.b(C1139n.f13566a);
        this.f7834k = b9;
        this.f7835l = new c(29, b9);
        d(true, new C1143r(this, null));
    }
}
