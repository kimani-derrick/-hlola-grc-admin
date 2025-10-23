package n0;

import android.os.Bundle;
import z5.C1530l;
/* renamed from: n0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022m extends M5.h implements L5.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ M5.l f12562r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0999A f12563s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ v f12564t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Bundle f12565u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022m(M5.l lVar, C0999A c0999a, v vVar, Bundle bundle) {
        super(1);
        this.f12562r = lVar;
        this.f12563s = c0999a;
        this.f12564t = vVar;
        this.f12565u = bundle;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        C1019j c1019j = (C1019j) obj;
        M5.g.f(c1019j, "it");
        this.f12562r.f2312q = true;
        A5.t tVar = A5.t.f135q;
        this.f12563s.a(this.f12564t, this.f12565u, c1019j, tVar);
        return C1530l.f16479a;
    }
}
