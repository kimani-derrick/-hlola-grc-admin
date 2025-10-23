package k2;

import Z2.AbstractC0156a;
import Z2.H;
import androidx.fragment.app.D;
import m2.C0988b;
import m2.C0991e;
/* renamed from: k2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0950o implements InterfaceC0955t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12175a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12176b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f12177c;

    public /* synthetic */ C0950o(int i7, long j7, Object obj) {
        this.f12175a = i7;
        this.f12177c = obj;
        this.f12176b = j7;
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        switch (this.f12175a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        long j8;
        switch (this.f12175a) {
            case 0:
                C0951p c0951p = (C0951p) this.f12177c;
                AbstractC0156a.l(c0951p.f12186k);
                D d = c0951p.f12186k;
                long[] jArr = (long[]) d.f5883r;
                int f = H.f(jArr, H.k((c0951p.f12181e * j7) / 1000000, 0L, c0951p.f12185j - 1), false);
                long j9 = 0;
                if (f == -1) {
                    j8 = 0;
                } else {
                    j8 = jArr[f];
                }
                long[] jArr2 = (long[]) d.f5884s;
                if (f != -1) {
                    j9 = jArr2[f];
                }
                int i7 = c0951p.f12181e;
                long j10 = (j8 * 1000000) / i7;
                long j11 = this.f12176b;
                C0956u c0956u = new C0956u(j10, j9 + j11);
                if (j10 != j7 && f != jArr.length - 1) {
                    int i8 = f + 1;
                    return new C0954s(c0956u, new C0956u((jArr[i8] * 1000000) / i7, j11 + jArr2[i8]));
                }
                return new C0954s(c0956u, c0956u);
            case 1:
                return (C0954s) this.f12177c;
            default:
                C0988b c0988b = (C0988b) this.f12177c;
                C0954s b7 = c0988b.f12389g[0].b(j7);
                int i9 = 1;
                while (true) {
                    C0991e[] c0991eArr = c0988b.f12389g;
                    if (i9 < c0991eArr.length) {
                        C0954s b8 = c0991eArr[i9].b(j7);
                        if (b8.f12194a.f12198b < b7.f12194a.f12198b) {
                            b7 = b8;
                        }
                        i9++;
                    } else {
                        return b7;
                    }
                }
        }
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        switch (this.f12175a) {
            case 0:
                return ((C0951p) this.f12177c).b();
            case 1:
                return this.f12176b;
            default:
                return this.f12176b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0950o(long j7) {
        this(j7, 0L);
        this.f12175a = 1;
    }

    public C0950o(long j7, long j8) {
        this.f12175a = 1;
        this.f12176b = j7;
        C0956u c0956u = j8 == 0 ? C0956u.f12196c : new C0956u(0L, j8);
        this.f12177c = new C0954s(c0956u, c0956u);
    }
}
