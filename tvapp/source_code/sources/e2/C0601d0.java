package e2;

import Z2.AbstractC0156a;
/* renamed from: e2.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601d0 {

    /* renamed from: a  reason: collision with root package name */
    public final H2.A f9941a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9942b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9943c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9944e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9945g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9946h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9947i;

    public C0601d0(H2.A a7, long j7, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if (z10 && !z8) {
            z11 = false;
        } else {
            z11 = true;
        }
        AbstractC0156a.f(z11);
        if (z9 && !z8) {
            z12 = false;
        } else {
            z12 = true;
        }
        AbstractC0156a.f(z12);
        if (z7 && (z8 || z9 || z10)) {
            z13 = false;
        }
        AbstractC0156a.f(z13);
        this.f9941a = a7;
        this.f9942b = j7;
        this.f9943c = j8;
        this.d = j9;
        this.f9944e = j10;
        this.f = z7;
        this.f9945g = z8;
        this.f9946h = z9;
        this.f9947i = z10;
    }

    public final C0601d0 a(long j7) {
        if (j7 == this.f9943c) {
            return this;
        }
        return new C0601d0(this.f9941a, this.f9942b, j7, this.d, this.f9944e, this.f, this.f9945g, this.f9946h, this.f9947i);
    }

    public final C0601d0 b(long j7) {
        if (j7 == this.f9942b) {
            return this;
        }
        return new C0601d0(this.f9941a, j7, this.f9943c, this.d, this.f9944e, this.f, this.f9945g, this.f9946h, this.f9947i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0601d0.class != obj.getClass()) {
            return false;
        }
        C0601d0 c0601d0 = (C0601d0) obj;
        if (this.f9942b == c0601d0.f9942b && this.f9943c == c0601d0.f9943c && this.d == c0601d0.d && this.f9944e == c0601d0.f9944e && this.f == c0601d0.f && this.f9945g == c0601d0.f9945g && this.f9946h == c0601d0.f9946h && this.f9947i == c0601d0.f9947i && Z2.H.a(this.f9941a, c0601d0.f9941a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f9941a.hashCode() + 527) * 31) + ((int) this.f9942b)) * 31) + ((int) this.f9943c)) * 31) + ((int) this.d)) * 31) + ((int) this.f9944e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f9945g ? 1 : 0)) * 31) + (this.f9946h ? 1 : 0)) * 31) + (this.f9947i ? 1 : 0);
    }
}
