package t2;

import Z2.H;
import java.math.BigInteger;
import k2.C0954s;
import k2.C0956u;
import k2.InterfaceC0955t;
/* renamed from: t2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1230a implements InterfaceC0955t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1231b f14527a;

    public C1230a(C1231b c1231b) {
        this.f14527a = c1231b;
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return true;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        C1231b c1231b = this.f14527a;
        BigInteger valueOf = BigInteger.valueOf((c1231b.f14533t.f14564i * j7) / 1000000);
        long j8 = c1231b.f14532s;
        long j9 = c1231b.f14531r;
        C0956u c0956u = new C0956u(j7, H.k((valueOf.multiply(BigInteger.valueOf(j8 - j9)).divide(BigInteger.valueOf(c1231b.f14535v)).longValue() + j9) - 30000, c1231b.f14531r, j8 - 1));
        return new C0954s(c0956u, c0956u);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        C1231b c1231b = this.f14527a;
        return (c1231b.f14535v * 1000000) / c1231b.f14533t.f14564i;
    }
}
