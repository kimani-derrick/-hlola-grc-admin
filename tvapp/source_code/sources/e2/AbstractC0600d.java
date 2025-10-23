package e2;

import Z2.AbstractC0156a;
import w2.C1400v;
/* renamed from: e2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0600d implements w0 {

    /* renamed from: B  reason: collision with root package name */
    public boolean f9928B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f9929C;

    /* renamed from: D  reason: collision with root package name */
    public B0 f9930D;

    /* renamed from: r  reason: collision with root package name */
    public final int f9932r;

    /* renamed from: t  reason: collision with root package name */
    public C0 f9934t;

    /* renamed from: u  reason: collision with root package name */
    public int f9935u;

    /* renamed from: v  reason: collision with root package name */
    public f2.m f9936v;

    /* renamed from: w  reason: collision with root package name */
    public int f9937w;

    /* renamed from: x  reason: collision with root package name */
    public H2.d0 f9938x;

    /* renamed from: y  reason: collision with root package name */
    public K[] f9939y;

    /* renamed from: z  reason: collision with root package name */
    public long f9940z;

    /* renamed from: q  reason: collision with root package name */
    public final Object f9931q = new Object();

    /* renamed from: s  reason: collision with root package name */
    public final androidx.fragment.app.D f9933s = new androidx.fragment.app.D(7, false);

    /* renamed from: A  reason: collision with root package name */
    public long f9927A = Long.MIN_VALUE;

    public AbstractC0600d(int i7) {
        this.f9932r = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e2.C0616l e(java.lang.Exception r13, e2.K r14, boolean r15, int r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f9929C
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f9929C = r3
            r3 = 0
            int r4 = r12.y(r14)     // Catch: java.lang.Throwable -> L16 e2.C0616l -> L1b
            r4 = r4 & 7
            r1.f9929C = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f9929C = r3
            throw r2
        L1b:
            r1.f9929C = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.h()
            int r7 = r1.f9935u
            e2.l r11 = new e2.l
            if (r0 != 0) goto L2a
            r9 = r2
            goto L2b
        L2a:
            r9 = r4
        L2b:
            r3 = 1
            r2 = r11
            r4 = r13
            r5 = r16
            r8 = r14
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.AbstractC0600d.e(java.lang.Exception, e2.K, boolean, int):e2.l");
    }

    public final C0616l f(C1400v c1400v, K k5) {
        return e(c1400v, k5, false, 4002);
    }

    public Z2.q g() {
        return null;
    }

    public abstract String h();

    public final boolean i() {
        if (this.f9927A == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean j();

    public abstract boolean k();

    public abstract void l();

    public abstract void n(boolean z7, long j7);

    public abstract void s(K[] kArr, long j7, long j8);

    public final int t(androidx.fragment.app.D d, i2.g gVar, int i7) {
        H2.d0 d0Var = this.f9938x;
        d0Var.getClass();
        int k5 = d0Var.k(d, gVar, i7);
        if (k5 == -4) {
            if (gVar.d(4)) {
                this.f9927A = Long.MIN_VALUE;
                if (this.f9928B) {
                    return -4;
                }
                return -3;
            }
            long j7 = gVar.f11353v + this.f9940z;
            gVar.f11353v = j7;
            this.f9927A = Math.max(this.f9927A, j7);
        } else if (k5 == -5) {
            K k7 = (K) d.f5884s;
            k7.getClass();
            long j8 = k7.F;
            if (j8 != Long.MAX_VALUE) {
                C0593J a7 = k7.a();
                a7.f9608o = j8 + this.f9940z;
                d.f5884s = a7.a();
            }
        }
        return k5;
    }

    public abstract void u(long j7, long j8);

    public final void v(K[] kArr, H2.d0 d0Var, long j7, long j8) {
        AbstractC0156a.k(!this.f9928B);
        this.f9938x = d0Var;
        if (this.f9927A == Long.MIN_VALUE) {
            this.f9927A = j7;
        }
        this.f9939y = kArr;
        this.f9940z = j8;
        s(kArr, j7, j8);
    }

    public final void w() {
        boolean z7;
        if (this.f9937w == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        this.f9933s.d();
        p();
    }

    public void x(float f, float f7) {
    }

    public abstract int y(K k5);

    public int z() {
        return 0;
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    @Override // e2.w0
    public void c(int i7, Object obj) {
    }

    public void m(boolean z7, boolean z8) {
    }
}
