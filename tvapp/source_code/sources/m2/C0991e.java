package m2;

import Z2.AbstractC0156a;
import Z2.H;
import k2.C0954s;
import k2.C0956u;
import k2.w;
/* renamed from: m2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991e {

    /* renamed from: a  reason: collision with root package name */
    public final w f12403a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12404b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12405c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12406e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f12407g;

    /* renamed from: h  reason: collision with root package name */
    public int f12408h;

    /* renamed from: i  reason: collision with root package name */
    public int f12409i;

    /* renamed from: j  reason: collision with root package name */
    public int f12410j;

    /* renamed from: k  reason: collision with root package name */
    public long[] f12411k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f12412l;

    public C0991e(int i7, int i8, long j7, int i9, w wVar) {
        int i10;
        int i11;
        boolean z7 = true;
        if (i8 != 1 && i8 != 2) {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        this.d = j7;
        this.f12406e = i9;
        this.f12403a = wVar;
        if (i8 == 2) {
            i10 = 1667497984;
        } else {
            i10 = 1651965952;
        }
        int i12 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.f12404b = i10 | i12;
        if (i8 == 2) {
            i11 = i12 | 1650720768;
        } else {
            i11 = -1;
        }
        this.f12405c = i11;
        this.f12411k = new long[512];
        this.f12412l = new int[512];
    }

    public final C0956u a(int i7) {
        return new C0956u(((this.d * 1) / this.f12406e) * this.f12412l[i7], this.f12411k[i7]);
    }

    public final C0954s b(long j7) {
        int i7 = (int) (j7 / ((this.d * 1) / this.f12406e));
        int e3 = H.e(this.f12412l, i7, true, true);
        if (this.f12412l[e3] == i7) {
            C0956u a7 = a(e3);
            return new C0954s(a7, a7);
        }
        C0956u a8 = a(e3);
        int i8 = e3 + 1;
        if (i8 < this.f12411k.length) {
            return new C0954s(a8, a(i8));
        }
        return new C0954s(a8, a8);
    }
}
