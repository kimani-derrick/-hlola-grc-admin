package r2;

import Z2.AbstractC0156a;
import Z2.H;
import k2.C0954s;
import k2.C0956u;
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f13472a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13473b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13474c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13475e;
    public final long[] f;

    public h(long j7, int i7, long j8, long j9, long[] jArr) {
        this.f13472a = j7;
        this.f13473b = i7;
        this.f13474c = j8;
        this.f = jArr;
        this.d = j9;
        this.f13475e = j9 != -1 ? j7 + j9 : -1L;
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // r2.f
    public final long c(long j7) {
        long j8;
        double d;
        long j9 = j7 - this.f13472a;
        if (b() && j9 > this.f13473b) {
            long[] jArr = this.f;
            AbstractC0156a.l(jArr);
            double d7 = (j9 * 256.0d) / this.d;
            int f = H.f(jArr, (long) d7, true);
            long j10 = this.f13474c;
            long j11 = (f * j10) / 100;
            long j12 = jArr[f];
            int i7 = f + 1;
            long j13 = (j10 * i7) / 100;
            if (f == 99) {
                j8 = 256;
            } else {
                j8 = jArr[i7];
            }
            if (j12 == j8) {
                d = 0.0d;
            } else {
                d = (d7 - j12) / (j8 - j12);
            }
            return Math.round(d * (j13 - j11)) + j11;
        }
        return 0L;
    }

    @Override // r2.f
    public final long f() {
        return this.f13475e;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        double d;
        double d7;
        boolean b7 = b();
        int i7 = this.f13473b;
        long j8 = this.f13472a;
        if (!b7) {
            C0956u c0956u = new C0956u(0L, j8 + i7);
            return new C0954s(c0956u, c0956u);
        }
        long k5 = H.k(j7, 0L, this.f13474c);
        double d8 = (k5 * 100.0d) / this.f13474c;
        double d9 = 0.0d;
        if (d8 > 0.0d) {
            if (d8 >= 100.0d) {
                d7 = 256.0d;
                d9 = 256.0d;
                double d10 = d9 / d7;
                long j9 = this.d;
                C0956u c0956u2 = new C0956u(k5, j8 + H.k(Math.round(d10 * j9), i7, j9 - 1));
                return new C0954s(c0956u2, c0956u2);
            }
            int i8 = (int) d8;
            long[] jArr = this.f;
            AbstractC0156a.l(jArr);
            double d11 = jArr[i8];
            if (i8 == 99) {
                d = 256.0d;
            } else {
                d = jArr[i8 + 1];
            }
            d9 = ((d - d11) * (d8 - i8)) + d11;
        }
        d7 = 256.0d;
        double d102 = d9 / d7;
        long j92 = this.d;
        C0956u c0956u22 = new C0956u(k5, j8 + H.k(Math.round(d102 * j92), i7, j92 - 1));
        return new C0954s(c0956u22, c0956u22);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f13474c;
    }
}
