package e2;

import H2.C0004e;
import H2.InterfaceC0022x;
import Z2.AbstractC0156a;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
/* renamed from: e2.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599c0 {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0022x f9915a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9916b;

    /* renamed from: c  reason: collision with root package name */
    public final H2.d0[] f9917c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9918e;
    public C0601d0 f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9919g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f9920h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC0600d[] f9921i;

    /* renamed from: j  reason: collision with root package name */
    public final W2.t f9922j;

    /* renamed from: k  reason: collision with root package name */
    public final J3.m f9923k;

    /* renamed from: l  reason: collision with root package name */
    public C0599c0 f9924l;

    /* renamed from: m  reason: collision with root package name */
    public H2.n0 f9925m;
    public W2.x n;

    /* renamed from: o  reason: collision with root package name */
    public long f9926o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [H2.e] */
    public C0599c0(AbstractC0600d[] abstractC0600dArr, long j7, W2.t tVar, Y2.r rVar, J3.m mVar, C0601d0 c0601d0, W2.x xVar) {
        this.f9921i = abstractC0600dArr;
        this.f9926o = j7;
        this.f9922j = tVar;
        this.f9923k = mVar;
        H2.A a7 = c0601d0.f9941a;
        this.f9916b = a7.f1180a;
        this.f = c0601d0;
        this.f9925m = H2.n0.f1144t;
        this.n = xVar;
        this.f9917c = new H2.d0[abstractC0600dArr.length];
        this.f9920h = new boolean[abstractC0600dArr.length];
        mVar.getClass();
        int i7 = z0.f10101A;
        Pair pair = (Pair) a7.f1180a;
        Object obj = pair.first;
        H2.A b7 = a7.b(pair.second);
        C0617l0 c0617l0 = (C0617l0) ((HashMap) mVar.f1397e).get(obj);
        c0617l0.getClass();
        ((HashSet) mVar.f1399h).add(c0617l0);
        C0615k0 c0615k0 = (C0615k0) ((HashMap) mVar.f1398g).get(c0617l0);
        if (c0615k0 != null) {
            c0615k0.f10001a.d(c0615k0.f10002b);
        }
        c0617l0.f10013c.add(b7);
        H2.r a8 = c0617l0.f10011a.a(b7, rVar, c0601d0.f9942b);
        ((IdentityHashMap) mVar.d).put(a8, c0617l0);
        mVar.d();
        long j8 = c0601d0.d;
        this.f9915a = j8 != -9223372036854775807L ? new C0004e(a8, true, 0L, j8) : a8;
    }

    public final long a(W2.x xVar, long j7, boolean z7, boolean[] zArr) {
        AbstractC0600d[] abstractC0600dArr;
        H2.d0[] d0VarArr;
        boolean z8;
        int i7 = 0;
        while (true) {
            boolean z9 = true;
            if (i7 >= xVar.f3932a) {
                break;
            }
            if (z7 || !xVar.a(this.n, i7)) {
                z9 = false;
            }
            this.f9920h[i7] = z9;
            i7++;
        }
        int i8 = 0;
        while (true) {
            abstractC0600dArr = this.f9921i;
            int length = abstractC0600dArr.length;
            d0VarArr = this.f9917c;
            if (i8 >= length) {
                break;
            }
            if (abstractC0600dArr[i8].f9932r == -2) {
                d0VarArr[i8] = null;
            }
            i8++;
        }
        b();
        this.n = xVar;
        c();
        long y3 = this.f9915a.y(xVar.f3934c, this.f9920h, this.f9917c, zArr, j7);
        for (int i9 = 0; i9 < abstractC0600dArr.length; i9++) {
            if (abstractC0600dArr[i9].f9932r == -2 && this.n.b(i9)) {
                d0VarArr[i9] = new L4.f(4);
            }
        }
        this.f9918e = false;
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            if (d0VarArr[i10] != null) {
                AbstractC0156a.k(xVar.b(i10));
                if (abstractC0600dArr[i10].f9932r != -2) {
                    this.f9918e = true;
                }
            } else {
                if (xVar.f3934c[i10] == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0156a.k(z8);
            }
        }
        return y3;
    }

    public final void b() {
        if (this.f9924l == null) {
            int i7 = 0;
            while (true) {
                W2.x xVar = this.n;
                if (i7 < xVar.f3932a) {
                    boolean b7 = xVar.b(i7);
                    W2.q qVar = this.n.f3934c[i7];
                    if (b7 && qVar != null) {
                        qVar.q();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f9924l == null) {
            int i7 = 0;
            while (true) {
                W2.x xVar = this.n;
                if (i7 < xVar.f3932a) {
                    boolean b7 = xVar.b(i7);
                    W2.q qVar = this.n.f3934c[i7];
                    if (b7 && qVar != null) {
                        qVar.i();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j7;
        if (!this.d) {
            return this.f.f9942b;
        }
        if (this.f9918e) {
            j7 = this.f9915a.m();
        } else {
            j7 = Long.MIN_VALUE;
        }
        if (j7 == Long.MIN_VALUE) {
            return this.f.f9944e;
        }
        return j7;
    }

    public final long e() {
        return this.f.f9942b + this.f9926o;
    }

    public final void f() {
        b();
        InterfaceC0022x interfaceC0022x = this.f9915a;
        try {
            boolean z7 = interfaceC0022x instanceof C0004e;
            J3.m mVar = this.f9923k;
            if (z7) {
                interfaceC0022x = ((C0004e) interfaceC0022x).f1052q;
            }
            mVar.h(interfaceC0022x);
        } catch (RuntimeException e3) {
            AbstractC0156a.r("MediaPeriodHolder", "Period release failed.", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x025f, code lost:
        if (O3.AbstractC0079x.f2710a.c(r8.f3805r, r0.f3805r).c(r8.f3804q, r0.f3804q).e() > 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03aa, code lost:
        if (r6 != 2) goto L203;
     */
    /* JADX WARN: Type inference failed for: r2v9, types: [O3.y, O3.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final W2.x g(float r27, e2.J0 r28) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C0599c0.g(float, e2.J0):W2.x");
    }

    public final void h() {
        InterfaceC0022x interfaceC0022x = this.f9915a;
        if (interfaceC0022x instanceof C0004e) {
            long j7 = this.f.d;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            C0004e c0004e = (C0004e) interfaceC0022x;
            c0004e.f1056u = 0L;
            c0004e.f1057v = j7;
        }
    }
}
