package k2;

import Z2.AbstractC0156a;
import Z2.H;
/* renamed from: k2.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953r implements InterfaceC0955t {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f12191a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f12192b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12193c;
    public final boolean d;

    public C0953r(long j7, long[] jArr, long[] jArr2) {
        boolean z7;
        boolean z8;
        if (jArr.length == jArr2.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        int length = jArr2.length;
        if (length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.d = z8;
        if (z8 && jArr2[0] > 0) {
            int i7 = length + 1;
            long[] jArr3 = new long[i7];
            this.f12191a = jArr3;
            long[] jArr4 = new long[i7];
            this.f12192b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f12191a = jArr;
            this.f12192b = jArr2;
        }
        this.f12193c = j7;
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return this.d;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        if (!this.d) {
            C0956u c0956u = C0956u.f12196c;
            return new C0954s(c0956u, c0956u);
        }
        long[] jArr = this.f12192b;
        int f = H.f(jArr, j7, true);
        long j8 = jArr[f];
        long[] jArr2 = this.f12191a;
        C0956u c0956u2 = new C0956u(j8, jArr2[f]);
        if (j8 != j7 && f != jArr.length - 1) {
            int i7 = f + 1;
            return new C0954s(c0956u2, new C0956u(jArr[i7], jArr2[i7]));
        }
        return new C0954s(c0956u2, c0956u2);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f12193c;
    }
}
