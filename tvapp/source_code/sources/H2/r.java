package H2;

import e2.D0;
/* loaded from: classes.dex */
public final class r implements InterfaceC0022x, InterfaceC0021w {

    /* renamed from: q  reason: collision with root package name */
    public final A f1157q;

    /* renamed from: r  reason: collision with root package name */
    public final long f1158r;

    /* renamed from: s  reason: collision with root package name */
    public final Y2.r f1159s;

    /* renamed from: t  reason: collision with root package name */
    public AbstractC0000a f1160t;

    /* renamed from: u  reason: collision with root package name */
    public InterfaceC0022x f1161u;

    /* renamed from: v  reason: collision with root package name */
    public InterfaceC0021w f1162v;

    /* renamed from: w  reason: collision with root package name */
    public long f1163w = -9223372036854775807L;

    public r(A a7, Y2.r rVar, long j7) {
        this.f1157q = a7;
        this.f1159s = rVar;
        this.f1158r = j7;
    }

    @Override // H2.InterfaceC0022x
    public final long B() {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        int i7 = Z2.H.f4603a;
        return interfaceC0022x.B();
    }

    @Override // H2.f0
    public final boolean C(long j7) {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        if (interfaceC0022x != null && interfaceC0022x.C(j7)) {
            return true;
        }
        return false;
    }

    @Override // H2.f0
    public final void G(long j7) {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        int i7 = Z2.H.f4603a;
        interfaceC0022x.G(j7);
    }

    @Override // H2.f0
    public final boolean a() {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        if (interfaceC0022x != null && interfaceC0022x.a()) {
            return true;
        }
        return false;
    }

    public final void b(A a7) {
        long j7 = this.f1163w;
        if (j7 == -9223372036854775807L) {
            j7 = this.f1158r;
        }
        AbstractC0000a abstractC0000a = this.f1160t;
        abstractC0000a.getClass();
        InterfaceC0022x a8 = abstractC0000a.a(a7, this.f1159s, j7);
        this.f1161u = a8;
        if (this.f1162v != null) {
            a8.e(this, j7);
        }
    }

    public final void c() {
        if (this.f1161u != null) {
            AbstractC0000a abstractC0000a = this.f1160t;
            abstractC0000a.getClass();
            abstractC0000a.m(this.f1161u);
        }
    }

    @Override // H2.InterfaceC0022x
    public final void e(InterfaceC0021w interfaceC0021w, long j7) {
        this.f1162v = interfaceC0021w;
        InterfaceC0022x interfaceC0022x = this.f1161u;
        if (interfaceC0022x != null) {
            long j8 = this.f1163w;
            if (j8 == -9223372036854775807L) {
                j8 = this.f1158r;
            }
            interfaceC0022x.e(this, j8);
        }
    }

    @Override // H2.InterfaceC0022x
    public final n0 g() {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        int i7 = Z2.H.f4603a;
        return interfaceC0022x.g();
    }

    @Override // H2.e0
    public final void h(f0 f0Var) {
        InterfaceC0022x interfaceC0022x = (InterfaceC0022x) f0Var;
        InterfaceC0021w interfaceC0021w = this.f1162v;
        int i7 = Z2.H.f4603a;
        interfaceC0021w.h(this);
    }

    @Override // H2.f0
    public final long m() {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        int i7 = Z2.H.f4603a;
        return interfaceC0022x.m();
    }

    @Override // H2.InterfaceC0022x
    public final void n() {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        if (interfaceC0022x != null) {
            interfaceC0022x.n();
            return;
        }
        AbstractC0000a abstractC0000a = this.f1160t;
        if (abstractC0000a != null) {
            abstractC0000a.i();
        }
    }

    @Override // H2.InterfaceC0021w
    public final void s(InterfaceC0022x interfaceC0022x) {
        InterfaceC0021w interfaceC0021w = this.f1162v;
        int i7 = Z2.H.f4603a;
        interfaceC0021w.s(this);
    }

    @Override // H2.InterfaceC0022x
    public final long u(long j7, D0 d02) {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        int i7 = Z2.H.f4603a;
        return interfaceC0022x.u(j7, d02);
    }

    @Override // H2.InterfaceC0022x
    public final long v(long j7) {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        int i7 = Z2.H.f4603a;
        return interfaceC0022x.v(j7);
    }

    @Override // H2.InterfaceC0022x
    public final void w(long j7) {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        int i7 = Z2.H.f4603a;
        interfaceC0022x.w(j7);
    }

    @Override // H2.InterfaceC0022x
    public final long y(W2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j7) {
        long j8;
        long j9 = this.f1163w;
        if (j9 != -9223372036854775807L && j7 == this.f1158r) {
            this.f1163w = -9223372036854775807L;
            j8 = j9;
        } else {
            j8 = j7;
        }
        InterfaceC0022x interfaceC0022x = this.f1161u;
        int i7 = Z2.H.f4603a;
        return interfaceC0022x.y(qVarArr, zArr, d0VarArr, zArr2, j8);
    }

    @Override // H2.f0
    public final long z() {
        InterfaceC0022x interfaceC0022x = this.f1161u;
        int i7 = Z2.H.f4603a;
        return interfaceC0022x.z();
    }
}
