package com.google.android.exoplayer2.source.hls;

import A4.a;
import H2.AbstractC0000a;
import H2.InterfaceC0024z;
import J3.e;
import K2.j;
import K2.m;
import L2.p;
import L4.f;
import T4.c;
import Y2.InterfaceC0143l;
import Z2.AbstractC0156a;
import com.google.android.gms.internal.measurement.K1;
import e2.Z;
import g5.b;
import j2.q;
import java.util.List;
/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements InterfaceC0024z {

    /* renamed from: a  reason: collision with root package name */
    public final c f8120a;
    public b f = new b(3);

    /* renamed from: c  reason: collision with root package name */
    public final e f8122c = new e(7);
    public final a d = L2.c.f1933E;

    /* renamed from: b  reason: collision with root package name */
    public final K2.c f8121b = j.f1683a;

    /* renamed from: g  reason: collision with root package name */
    public f f8124g = new f(false);

    /* renamed from: e  reason: collision with root package name */
    public final e f8123e = new e(4);

    /* renamed from: i  reason: collision with root package name */
    public final int f8126i = 1;

    /* renamed from: j  reason: collision with root package name */
    public final long f8127j = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8125h = true;

    public HlsMediaSource$Factory(InterfaceC0143l interfaceC0143l) {
        this.f8120a = new c(12, interfaceC0143l);
    }

    @Override // H2.InterfaceC0024z
    public final InterfaceC0024z a(b bVar) {
        AbstractC0156a.j(bVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f = bVar;
        return this;
    }

    @Override // H2.InterfaceC0024z
    public final AbstractC0000a b(Z z7) {
        z7.f9805r.getClass();
        p pVar = this.f8122c;
        List list = z7.f9805r.f9765u;
        if (!list.isEmpty()) {
            pVar = new K1(pVar, 8, list);
        }
        K2.c cVar = this.f8121b;
        q x7 = this.f.x(z7);
        f fVar = this.f8124g;
        this.d.getClass();
        L2.c cVar2 = new L2.c(this.f8120a, fVar, pVar);
        int i7 = this.f8126i;
        return new m(z7, this.f8120a, cVar, this.f8123e, x7, fVar, cVar2, this.f8127j, this.f8125h, i7);
    }

    @Override // H2.InterfaceC0024z
    public final InterfaceC0024z c(f fVar) {
        AbstractC0156a.j(fVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f8124g = fVar;
        return this;
    }
}
