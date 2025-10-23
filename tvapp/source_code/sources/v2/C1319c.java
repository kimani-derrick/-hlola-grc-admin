package v2;

import Z2.H;
import e2.C0593J;
import e2.K;
import e2.m0;
import k2.C0943h;
import k2.InterfaceC0948m;
import k2.w;
/* renamed from: v2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1319c implements InterfaceC1318b {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0948m f15297a;

    /* renamed from: b  reason: collision with root package name */
    public final w f15298b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.e f15299c;
    public final K d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15300e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public int f15301g;

    /* renamed from: h  reason: collision with root package name */
    public long f15302h;

    public C1319c(InterfaceC0948m interfaceC0948m, w wVar, s2.e eVar, String str, int i7) {
        this.f15297a = interfaceC0948m;
        this.f15298b = wVar;
        this.f15299c = eVar;
        int i8 = eVar.d;
        int i9 = eVar.f13590a;
        int i10 = (i8 * i9) / 8;
        int i11 = eVar.f13592c;
        if (i11 == i10) {
            int i12 = eVar.f13591b;
            int i13 = i12 * i10;
            int i14 = i13 * 8;
            int max = Math.max(i10, i13 / 10);
            this.f15300e = max;
            C0593J c0593j = new C0593J();
            c0593j.f9605k = str;
            c0593j.f = i14;
            c0593j.f9601g = i14;
            c0593j.f9606l = max;
            c0593j.f9617x = i9;
            c0593j.f9618y = i12;
            c0593j.f9619z = i7;
            this.d = new K(c0593j);
            return;
        }
        throw m0.a("Expected block size: " + i10 + "; got: " + i11, null);
    }

    @Override // v2.InterfaceC1318b
    public final boolean a(C0943h c0943h, long j7) {
        int i7;
        s2.e eVar;
        int i8;
        int i9;
        long j8 = j7;
        while (true) {
            i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
            if (i7 <= 0 || (i8 = this.f15301g) >= (i9 = this.f15300e)) {
                break;
            }
            int a7 = this.f15298b.a(c0943h, (int) Math.min(i9 - i8, j8), true);
            if (a7 == -1) {
                j8 = 0;
            } else {
                this.f15301g += a7;
                j8 -= a7;
            }
        }
        int i10 = this.f15299c.f13592c;
        int i11 = this.f15301g / i10;
        if (i11 > 0) {
            int i12 = i11 * i10;
            int i13 = this.f15301g - i12;
            this.f15298b.c(this.f + H.O(this.f15302h, 1000000L, eVar.f13591b), 1, i12, i13, null);
            this.f15302h += i11;
            this.f15301g = i13;
        }
        if (i7 <= 0) {
            return true;
        }
        return false;
    }

    @Override // v2.InterfaceC1318b
    public final void b(long j7) {
        this.f = j7;
        this.f15301g = 0;
        this.f15302h = 0L;
    }

    @Override // v2.InterfaceC1318b
    public final void c(long j7, int i7) {
        this.f15297a.t(new C1321e(this.f15299c, 1, i7, j7));
        this.f15298b.e(this.d);
    }
}
