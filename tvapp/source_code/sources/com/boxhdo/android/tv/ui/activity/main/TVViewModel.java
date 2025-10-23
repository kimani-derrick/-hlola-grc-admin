package com.boxhdo.android.tv.ui.activity.main;

import L1.g;
import L1.m;
import M1.h;
import T4.c;
import Z5.s;
import Z5.w;
import com.google.android.gms.internal.measurement.K1;
import n1.C1027b;
import n1.C1029d;
import n1.e;
import n1.f;
import q1.C1104f;
import q1.i;
/* loaded from: classes.dex */
public final class TVViewModel extends i {
    public final g f;

    /* renamed from: g  reason: collision with root package name */
    public final h f7782g;

    /* renamed from: h  reason: collision with root package name */
    public final K1 f7783h;

    /* renamed from: i  reason: collision with root package name */
    public final K1 f7784i;

    /* renamed from: j  reason: collision with root package name */
    public final c f7785j;

    /* renamed from: k  reason: collision with root package name */
    public final w f7786k;

    /* renamed from: l  reason: collision with root package name */
    public String f7787l;

    public TVViewModel(g gVar, h hVar, K1 k12, K1 k13, c cVar, m mVar) {
        M5.g.f(gVar, "latestVersionUseCase");
        M5.g.f(hVar, "traktLoginUseCase");
        M5.g.f(mVar, "syncUseCase");
        this.f = gVar;
        this.f7782g = hVar;
        this.f7783h = k12;
        this.f7784i = k13;
        this.f7785j = cVar;
        this.f7786k = s.b(new C1104f(f.f12632b));
        this.f7787l = "";
        d(false, new C1027b(this, null));
        d(false, new C1029d(mVar, null));
        d(false, new e(this, null));
        d(false, new n1.i(this, null));
    }
}
