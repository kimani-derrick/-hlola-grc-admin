package H2;

import e2.D0;
/* loaded from: classes.dex */
public final class J implements InterfaceC0022x, InterfaceC0021w {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0022x f904q;

    /* renamed from: r  reason: collision with root package name */
    public final long f905r;

    /* renamed from: s  reason: collision with root package name */
    public InterfaceC0021w f906s;

    public J(InterfaceC0022x interfaceC0022x, long j7) {
        this.f904q = interfaceC0022x;
        this.f905r = j7;
    }

    @Override // H2.InterfaceC0022x
    public final long B() {
        long B6 = this.f904q.B();
        if (B6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f905r + B6;
    }

    @Override // H2.f0
    public final boolean C(long j7) {
        return this.f904q.C(j7 - this.f905r);
    }

    @Override // H2.f0
    public final void G(long j7) {
        this.f904q.G(j7 - this.f905r);
    }

    @Override // H2.f0
    public final boolean a() {
        return this.f904q.a();
    }

    @Override // H2.InterfaceC0022x
    public final void e(InterfaceC0021w interfaceC0021w, long j7) {
        this.f906s = interfaceC0021w;
        this.f904q.e(this, j7 - this.f905r);
    }

    @Override // H2.InterfaceC0022x
    public final n0 g() {
        return this.f904q.g();
    }

    @Override // H2.e0
    public final void h(f0 f0Var) {
        InterfaceC0022x interfaceC0022x = (InterfaceC0022x) f0Var;
        InterfaceC0021w interfaceC0021w = this.f906s;
        interfaceC0021w.getClass();
        interfaceC0021w.h(this);
    }

    @Override // H2.f0
    public final long m() {
        long m7 = this.f904q.m();
        if (m7 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f905r + m7;
    }

    @Override // H2.InterfaceC0022x
    public final void n() {
        this.f904q.n();
    }

    @Override // H2.InterfaceC0021w
    public final void s(InterfaceC0022x interfaceC0022x) {
        InterfaceC0021w interfaceC0021w = this.f906s;
        interfaceC0021w.getClass();
        interfaceC0021w.s(this);
    }

    @Override // H2.InterfaceC0022x
    public final long u(long j7, D0 d02) {
        long j8 = this.f905r;
        return this.f904q.u(j7 - j8, d02) + j8;
    }

    @Override // H2.InterfaceC0022x
    public final long v(long j7) {
        long j8 = this.f905r;
        return this.f904q.v(j7 - j8) + j8;
    }

    @Override // H2.InterfaceC0022x
    public final void w(long j7) {
        this.f904q.w(j7 - this.f905r);
    }

    @Override // H2.InterfaceC0022x
    public final long y(W2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j7) {
        d0[] d0VarArr2 = new d0[d0VarArr.length];
        int i7 = 0;
        while (true) {
            d0 d0Var = null;
            if (i7 >= d0VarArr.length) {
                break;
            }
            K k5 = (K) d0VarArr[i7];
            if (k5 != null) {
                d0Var = k5.f907q;
            }
            d0VarArr2[i7] = d0Var;
            i7++;
        }
        long j8 = this.f905r;
        long y3 = this.f904q.y(qVarArr, zArr, d0VarArr2, zArr2, j7 - j8);
        for (int i8 = 0; i8 < d0VarArr.length; i8++) {
            d0 d0Var2 = d0VarArr2[i8];
            if (d0Var2 == null) {
                d0VarArr[i8] = null;
            } else {
                d0 d0Var3 = d0VarArr[i8];
                if (d0Var3 == null || ((K) d0Var3).f907q != d0Var2) {
                    d0VarArr[i8] = new K(d0Var2, j8);
                }
            }
        }
        return y3 + j8;
    }

    @Override // H2.f0
    public final long z() {
        long z7 = this.f904q.z();
        if (z7 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f905r + z7;
    }
}
