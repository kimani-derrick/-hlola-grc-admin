package r2;

import Z2.H;
import k2.C0954s;
import k2.C0956u;
/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f13469a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f13470b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13471c;
    public final long d;

    public g(long[] jArr, long[] jArr2, long j7, long j8) {
        this.f13469a = jArr;
        this.f13470b = jArr2;
        this.f13471c = j7;
        this.d = j8;
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return true;
    }

    @Override // r2.f
    public final long c(long j7) {
        return this.f13469a[H.f(this.f13470b, j7, true)];
    }

    @Override // r2.f
    public final long f() {
        return this.d;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        long[] jArr = this.f13469a;
        int f = H.f(jArr, j7, true);
        long j8 = jArr[f];
        long[] jArr2 = this.f13470b;
        C0956u c0956u = new C0956u(j8, jArr2[f]);
        if (j8 < j7 && f != jArr.length - 1) {
            int i7 = f + 1;
            return new C0954s(c0956u, new C0956u(jArr[i7], jArr2[i7]));
        }
        return new C0954s(c0956u, c0956u);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f13471c;
    }
}
