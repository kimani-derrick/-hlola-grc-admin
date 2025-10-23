package n0;

import z5.C1530l;
/* renamed from: n0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023n extends M5.h implements L5.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ M5.l f12566r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ M5.l f12567s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0999A f12568t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ boolean f12569u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ A5.i f12570v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023n(M5.l lVar, M5.l lVar2, C0999A c0999a, boolean z7, A5.i iVar) {
        super(1);
        this.f12566r = lVar;
        this.f12567s = lVar2;
        this.f12568t = c0999a;
        this.f12569u = z7;
        this.f12570v = iVar;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        C1019j c1019j = (C1019j) obj;
        M5.g.f(c1019j, "entry");
        this.f12566r.f2312q = true;
        this.f12567s.f2312q = true;
        this.f12568t.n(c1019j, this.f12569u, this.f12570v);
        return C1530l.f16479a;
    }
}
