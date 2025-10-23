package x6;

import v6.InterfaceC1343h;
/* renamed from: x6.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1487u extends h6.I {

    /* renamed from: q  reason: collision with root package name */
    public final h6.v f16328q;

    /* renamed from: r  reason: collision with root package name */
    public final long f16329r;

    public C1487u(h6.v vVar, long j7) {
        this.f16328q = vVar;
        this.f16329r = j7;
    }

    @Override // h6.I
    public final long a() {
        return this.f16329r;
    }

    @Override // h6.I
    public final h6.v b() {
        return this.f16328q;
    }

    @Override // h6.I
    public final InterfaceC1343h f() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
