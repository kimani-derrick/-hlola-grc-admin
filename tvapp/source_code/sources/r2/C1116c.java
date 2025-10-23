package r2;

import Z2.H;
import android.util.Pair;
import k2.C0954s;
import k2.C0956u;
/* renamed from: r2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f13448a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f13449b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13450c;

    public C1116c(long j7, long[] jArr, long[] jArr2) {
        this.f13448a = jArr;
        this.f13449b = jArr2;
        this.f13450c = j7 == -9223372036854775807L ? H.J(jArr2[jArr2.length - 1]) : j7;
    }

    public static Pair a(long j7, long[] jArr, long[] jArr2) {
        double d;
        Long valueOf;
        Long valueOf2;
        int f = H.f(jArr, j7, true);
        long j8 = jArr[f];
        long j9 = jArr2[f];
        int i7 = f + 1;
        if (i7 == jArr.length) {
            valueOf = Long.valueOf(j8);
            valueOf2 = Long.valueOf(j9);
        } else {
            long j10 = jArr[i7];
            long j11 = jArr2[i7];
            if (j10 == j8) {
                d = 0.0d;
            } else {
                d = (j7 - j8) / (j10 - j8);
            }
            valueOf = Long.valueOf(j7);
            valueOf2 = Long.valueOf(((long) (d * (j11 - j9))) + j9);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return true;
    }

    @Override // r2.f
    public final long c(long j7) {
        return H.J(((Long) a(j7, this.f13448a, this.f13449b).second).longValue());
    }

    @Override // r2.f
    public final long f() {
        return -1L;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        Pair a7 = a(H.S(H.k(j7, 0L, this.f13450c)), this.f13449b, this.f13448a);
        C0956u c0956u = new C0956u(H.J(((Long) a7.first).longValue()), ((Long) a7.second).longValue());
        return new C0954s(c0956u, c0956u);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f13450c;
    }
}
