package v2;

import Z2.H;
import k2.C0954s;
import k2.C0956u;
import k2.InterfaceC0955t;
/* renamed from: v2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1321e implements InterfaceC0955t {

    /* renamed from: a  reason: collision with root package name */
    public final s2.e f15308a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15309b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15310c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f15311e;

    public C1321e(s2.e eVar, int i7, long j7, long j8) {
        this.f15308a = eVar;
        this.f15309b = i7;
        this.f15310c = j7;
        long j9 = (j8 - j7) / eVar.f13592c;
        this.d = j9;
        this.f15311e = H.O(j9 * i7, 1000000L, eVar.f13591b);
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return true;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        s2.e eVar = this.f15308a;
        int i7 = this.f15309b;
        long j8 = (eVar.f13591b * j7) / (i7 * 1000000);
        long j9 = this.d - 1;
        long k5 = H.k(j8, 0L, j9);
        int i8 = eVar.f13592c;
        long j10 = this.f15310c;
        long O5 = H.O(k5 * i7, 1000000L, eVar.f13591b);
        C0956u c0956u = new C0956u(O5, (i8 * k5) + j10);
        if (O5 < j7 && k5 != j9) {
            long j11 = k5 + 1;
            return new C0954s(c0956u, new C0956u(H.O(j11 * i7, 1000000L, eVar.f13591b), (i8 * j11) + j10));
        }
        return new C0954s(c0956u, c0956u);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f15311e;
    }
}
