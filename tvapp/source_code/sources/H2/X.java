package H2;

import Y2.C0132a;
import Z2.AbstractC0156a;
import android.os.Bundle;
import k2.C0943h;
import k2.C0950o;
import k2.C0951p;
import k2.InterfaceC0955t;
import s3.AbstractC1203v;
import s3.C1154I;
import s3.C1175g0;
import s3.f1;
import s3.h1;
import s3.x1;
import t2.InterfaceC1236g;
/* loaded from: classes.dex */
public final class X implements InterfaceC1236g {

    /* renamed from: q  reason: collision with root package name */
    public long f997q;

    /* renamed from: r  reason: collision with root package name */
    public long f998r;

    /* renamed from: s  reason: collision with root package name */
    public Object f999s;

    /* renamed from: t  reason: collision with root package name */
    public Object f1000t;

    public X(long j7, int i7) {
        AbstractC0156a.k(((C0132a) this.f999s) == null);
        this.f997q = j7;
        this.f998r = j7 + i7;
    }

    public boolean a(long j7, boolean z7, boolean z8) {
        f1 f1Var = (f1) this.f1000t;
        f1Var.D();
        f1Var.H();
        C1175g0 c1175g0 = (C1175g0) f1Var.f2765q;
        if (c1175g0.j()) {
            s3.T B6 = f1Var.B();
            c1175g0.f14037D.getClass();
            B6.f13883G.g(System.currentTimeMillis());
        }
        long j8 = j7 - this.f997q;
        if (!z7 && j8 < 1000) {
            C1154I b7 = f1Var.b();
            b7.f13803D.c(Long.valueOf(j8), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z8) {
            j8 = j7 - this.f998r;
            this.f998r = j7;
        }
        C1154I b8 = f1Var.b();
        b8.f13803D.c(Long.valueOf(j8), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j8);
        x1.g0(f1Var.F().L(!c1175g0.f14062w.R()), bundle, true);
        if (!z8) {
            f1Var.E().i0("auto", "_e", bundle);
        }
        this.f997q = j7;
        h1 h1Var = (h1) this.f999s;
        h1Var.a();
        h1Var.b(((Long) AbstractC1203v.f14312b0.a(null)).longValue());
        return true;
    }

    @Override // t2.InterfaceC1236g
    public long b(C0943h c0943h) {
        long j7 = this.f998r;
        if (j7 < 0) {
            return -1L;
        }
        long j8 = -(j7 + 2);
        this.f998r = -1L;
        return j8;
    }

    @Override // t2.InterfaceC1236g
    public InterfaceC0955t c() {
        boolean z7;
        if (this.f997q != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        return new C0950o(0, this.f997q, (C0951p) this.f999s);
    }

    @Override // t2.InterfaceC1236g
    public void d(long j7) {
        long[] jArr = (long[]) ((androidx.fragment.app.D) this.f1000t).f5883r;
        this.f998r = jArr[Z2.H.f(jArr, j7, true)];
    }

    public X(String str, byte[] bArr, long j7, long j8) {
        this.f999s = str;
        this.f1000t = bArr;
        this.f997q = j7;
        this.f998r = j8;
    }
}
