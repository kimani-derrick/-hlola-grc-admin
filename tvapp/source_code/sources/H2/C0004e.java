package H2;

import Z2.AbstractC0156a;
import e2.D0;
/* renamed from: H2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e implements InterfaceC0022x, InterfaceC0021w {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0022x f1052q;

    /* renamed from: r  reason: collision with root package name */
    public InterfaceC0021w f1053r;

    /* renamed from: s  reason: collision with root package name */
    public C0003d[] f1054s = new C0003d[0];

    /* renamed from: t  reason: collision with root package name */
    public long f1055t;

    /* renamed from: u  reason: collision with root package name */
    public long f1056u;

    /* renamed from: v  reason: collision with root package name */
    public long f1057v;

    /* renamed from: w  reason: collision with root package name */
    public C0006g f1058w;

    public C0004e(InterfaceC0022x interfaceC0022x, boolean z7, long j7, long j8) {
        long j9;
        this.f1052q = interfaceC0022x;
        if (z7) {
            j9 = j7;
        } else {
            j9 = -9223372036854775807L;
        }
        this.f1055t = j9;
        this.f1056u = j7;
        this.f1057v = j8;
    }

    @Override // H2.InterfaceC0022x
    public final long B() {
        boolean z7;
        if (b()) {
            long j7 = this.f1055t;
            this.f1055t = -9223372036854775807L;
            long B6 = B();
            if (B6 != -9223372036854775807L) {
                return B6;
            }
            return j7;
        }
        long B7 = this.f1052q.B();
        if (B7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z8 = false;
        if (B7 >= this.f1056u) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        long j8 = this.f1057v;
        if (j8 == Long.MIN_VALUE || B7 <= j8) {
            z8 = true;
        }
        AbstractC0156a.k(z8);
        return B7;
    }

    @Override // H2.f0
    public final boolean C(long j7) {
        return this.f1052q.C(j7);
    }

    @Override // H2.f0
    public final void G(long j7) {
        this.f1052q.G(j7);
    }

    @Override // H2.f0
    public final boolean a() {
        return this.f1052q.a();
    }

    public final boolean b() {
        if (this.f1055t != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // H2.InterfaceC0022x
    public final void e(InterfaceC0021w interfaceC0021w, long j7) {
        this.f1053r = interfaceC0021w;
        this.f1052q.e(this, j7);
    }

    @Override // H2.InterfaceC0022x
    public final n0 g() {
        return this.f1052q.g();
    }

    @Override // H2.e0
    public final void h(f0 f0Var) {
        InterfaceC0022x interfaceC0022x = (InterfaceC0022x) f0Var;
        InterfaceC0021w interfaceC0021w = this.f1053r;
        interfaceC0021w.getClass();
        interfaceC0021w.h(this);
    }

    @Override // H2.f0
    public final long m() {
        long m7 = this.f1052q.m();
        if (m7 != Long.MIN_VALUE) {
            long j7 = this.f1057v;
            if (j7 == Long.MIN_VALUE || m7 < j7) {
                return m7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // H2.InterfaceC0022x
    public final void n() {
        C0006g c0006g = this.f1058w;
        if (c0006g == null) {
            this.f1052q.n();
            return;
        }
        throw c0006g;
    }

    @Override // H2.InterfaceC0021w
    public final void s(InterfaceC0022x interfaceC0022x) {
        if (this.f1058w != null) {
            return;
        }
        InterfaceC0021w interfaceC0021w = this.f1053r;
        interfaceC0021w.getClass();
        interfaceC0021w.s(this);
    }

    @Override // H2.InterfaceC0022x
    public final long u(long j7, D0 d02) {
        long j8;
        long j9 = this.f1056u;
        if (j7 == j9) {
            return j9;
        }
        long k5 = Z2.H.k(d02.f9484a, 0L, j7 - j9);
        long j10 = this.f1057v;
        if (j10 == Long.MIN_VALUE) {
            j8 = Long.MAX_VALUE;
        } else {
            j8 = j10 - j7;
        }
        long k7 = Z2.H.k(d02.f9485b, 0L, j8);
        if (k5 != d02.f9484a || k7 != d02.f9485b) {
            d02 = new D0(k5, k7);
        }
        return this.f1052q.u(j7, d02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > r6) goto L18;
     */
    @Override // H2.InterfaceC0022x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long v(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f1055t = r0
            H2.d[] r0 = r5.f1054s
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f1050r = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            H2.x r0 = r5.f1052q
            long r0 = r0.v(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f1056u
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f1057v
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            Z2.AbstractC0156a.k(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.C0004e.v(long):long");
    }

    @Override // H2.InterfaceC0022x
    public final void w(long j7) {
        this.f1052q.w(j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r1 > r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    @Override // H2.InterfaceC0022x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(W2.q[] r14, boolean[] r15, H2.d0[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r8 = r14
            r9 = r16
            int r1 = r9.length
            H2.d[] r1 = new H2.C0003d[r1]
            r0.f1054s = r1
            int r1 = r9.length
            H2.d0[] r10 = new H2.d0[r1]
            r11 = 0
            r1 = r11
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            H2.d[] r2 = r0.f1054s
            r3 = r9[r1]
            H2.d r3 = (H2.C0003d) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            H2.d0 r12 = r3.f1049q
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            H2.x r1 = r0.f1052q
            r2 = r14
            r3 = r15
            r4 = r10
            r5 = r17
            r6 = r18
            long r1 = r1.y(r2, r3, r4, r5, r6)
            boolean r3 = r13.b()
            if (r3 == 0) goto L5d
            long r3 = r0.f1056u
            int r5 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L5d
            int r3 = r8.length
            r4 = r11
        L44:
            if (r4 >= r3) goto L5d
            r5 = r8[r4]
            if (r5 == 0) goto L5a
            e2.K r5 = r5.e()
            java.lang.String r6 = r5.f9655B
            java.lang.String r5 = r5.f9684y
            boolean r5 = Z2.r.a(r6, r5)
            if (r5 != 0) goto L5a
            r3 = r1
            goto L62
        L5a:
            int r4 = r4 + 1
            goto L44
        L5d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L62:
            r0.f1055t = r3
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 == 0) goto L7d
            long r3 = r0.f1056u
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            long r3 = r0.f1057v
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L7d
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L7b
            goto L7d
        L7b:
            r3 = r11
            goto L7e
        L7d:
            r3 = 1
        L7e:
            Z2.AbstractC0156a.k(r3)
        L81:
            int r3 = r9.length
            if (r11 >= r3) goto La7
            r3 = r10[r11]
            if (r3 != 0) goto L8d
            H2.d[] r3 = r0.f1054s
            r3[r11] = r12
            goto L9e
        L8d:
            H2.d[] r4 = r0.f1054s
            r5 = r4[r11]
            if (r5 == 0) goto L97
            H2.d0 r5 = r5.f1049q
            if (r5 == r3) goto L9e
        L97:
            H2.d r5 = new H2.d
            r5.<init>(r13, r3)
            r4[r11] = r5
        L9e:
            H2.d[] r3 = r0.f1054s
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L81
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.C0004e.y(W2.q[], boolean[], H2.d0[], boolean[], long):long");
    }

    @Override // H2.f0
    public final long z() {
        long z7 = this.f1052q.z();
        if (z7 != Long.MIN_VALUE) {
            long j7 = this.f1057v;
            if (j7 == Long.MIN_VALUE || z7 < j7) {
                return z7;
            }
        }
        return Long.MIN_VALUE;
    }
}
