package W2;

import H2.m0;
import O3.AbstractC0079x;
import O3.E;
import O3.S;
import O3.T;
import O3.b0;
import Z2.H;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.K;
/* loaded from: classes.dex */
public final class e extends m implements Comparable {

    /* renamed from: A  reason: collision with root package name */
    public final int f3787A;

    /* renamed from: B  reason: collision with root package name */
    public final int f3788B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f3789C;

    /* renamed from: D  reason: collision with root package name */
    public final int f3790D;

    /* renamed from: E  reason: collision with root package name */
    public final int f3791E;
    public final boolean F;

    /* renamed from: G  reason: collision with root package name */
    public final int f3792G;

    /* renamed from: H  reason: collision with root package name */
    public final int f3793H;

    /* renamed from: I  reason: collision with root package name */
    public final int f3794I;

    /* renamed from: J  reason: collision with root package name */
    public final int f3795J;

    /* renamed from: K  reason: collision with root package name */
    public final boolean f3796K;

    /* renamed from: L  reason: collision with root package name */
    public final boolean f3797L;

    /* renamed from: u  reason: collision with root package name */
    public final int f3798u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f3799v;

    /* renamed from: w  reason: collision with root package name */
    public final String f3800w;

    /* renamed from: x  reason: collision with root package name */
    public final h f3801x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f3802y;

    /* renamed from: z  reason: collision with root package name */
    public final int f3803z;

    public e(int i7, m0 m0Var, int i8, h hVar, int i9, boolean z7, d dVar) {
        super(i7, m0Var, i8);
        int i10;
        int i11;
        boolean z8;
        boolean z9;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        this.f3801x = hVar;
        this.f3800w = o.i(this.f3850t.f9678s);
        int i13 = 0;
        this.f3802y = o.g(i9, false);
        int i14 = 0;
        while (true) {
            i10 = Integer.MAX_VALUE;
            if (i14 < hVar.f3910D.size()) {
                i11 = o.e(this.f3850t, (String) hVar.f3910D.get(i14), false);
                if (i11 > 0) {
                    break;
                }
                i14++;
            } else {
                i11 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f3787A = i14;
        this.f3803z = i11;
        this.f3788B = o.b(this.f3850t.f9680u, hVar.f3911E);
        K k5 = this.f3850t;
        int i15 = k5.f9680u;
        if (i15 != 0 && (i15 & 1) == 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f3789C = z8;
        if ((k5.f9679t & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.F = z9;
        int i16 = k5.f9667O;
        this.f3792G = i16;
        this.f3793H = k5.f9668P;
        int i17 = k5.f9683x;
        this.f3794I = i17;
        if ((i17 == -1 || i17 <= hVar.f3912G) && ((i16 == -1 || i16 <= hVar.F) && dVar.apply(k5))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3799v = z10;
        String[] A6 = H.A();
        int i18 = 0;
        while (true) {
            if (i18 < A6.length) {
                i12 = o.e(this.f3850t, A6[i18], false);
                if (i12 > 0) {
                    break;
                }
                i18++;
            } else {
                i12 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f3790D = i18;
        this.f3791E = i12;
        int i19 = 0;
        while (true) {
            E e3 = hVar.f3913H;
            if (i19 < e3.size()) {
                String str = this.f3850t.f9655B;
                if (str != null && str.equals(e3.get(i19))) {
                    i10 = i19;
                    break;
                }
                i19++;
            } else {
                break;
            }
        }
        this.f3795J = i10;
        if (AbstractC0515y1.c(i9) == 128) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f3796K = z11;
        if (AbstractC0515y1.d(i9) == 64) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f3797L = z12;
        h hVar2 = this.f3801x;
        if (o.g(i9, hVar2.f3831a0) && ((z13 = this.f3799v) || hVar2.f3826U)) {
            i13 = (!o.g(i9, false) || !z13 || this.f3850t.f9683x == -1 || hVar2.f3919N || hVar2.f3918M || (!hVar2.f3833c0 && z7)) ? 1 : 2;
        }
        this.f3798u = i13;
    }

    @Override // W2.m
    public final int a() {
        return this.f3798u;
    }

    @Override // W2.m
    public final boolean b(m mVar) {
        int i7;
        String str;
        int i8;
        e eVar = (e) mVar;
        h hVar = this.f3801x;
        boolean z7 = hVar.f3828X;
        K k5 = eVar.f3850t;
        K k7 = this.f3850t;
        if ((z7 || ((i8 = k7.f9667O) != -1 && i8 == k5.f9667O)) && ((hVar.f3827V || ((str = k7.f9655B) != null && TextUtils.equals(str, k5.f9655B))) && (hVar.W || ((i7 = k7.f9668P) != -1 && i7 == k5.f9668P)))) {
            if (!hVar.f3829Y) {
                if (this.f3796K != eVar.f3796K || this.f3797L != eVar.f3797L) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(e eVar) {
        T a7;
        T t5;
        boolean z7 = this.f3802y;
        boolean z8 = this.f3799v;
        if (z8 && z7) {
            a7 = o.f3864j;
        } else {
            a7 = o.f3864j.a();
        }
        AbstractC0079x c5 = AbstractC0079x.f2710a.c(z7, eVar.f3802y);
        Integer valueOf = Integer.valueOf(this.f3787A);
        Integer valueOf2 = Integer.valueOf(eVar.f3787A);
        S.f2620q.getClass();
        b0 b0Var = b0.f2654q;
        AbstractC0079x b7 = c5.b(valueOf, valueOf2, b0Var).a(this.f3803z, eVar.f3803z).a(this.f3788B, eVar.f3788B).c(this.F, eVar.F).c(this.f3789C, eVar.f3789C).b(Integer.valueOf(this.f3790D), Integer.valueOf(eVar.f3790D), b0Var).a(this.f3791E, eVar.f3791E).c(z8, eVar.f3799v).b(Integer.valueOf(this.f3795J), Integer.valueOf(eVar.f3795J), b0Var);
        int i7 = this.f3794I;
        Integer valueOf3 = Integer.valueOf(i7);
        int i8 = eVar.f3794I;
        Integer valueOf4 = Integer.valueOf(i8);
        if (this.f3801x.f3918M) {
            t5 = o.f3864j.a();
        } else {
            t5 = o.f3865k;
        }
        AbstractC0079x b8 = b7.b(valueOf3, valueOf4, t5).c(this.f3796K, eVar.f3796K).c(this.f3797L, eVar.f3797L).b(Integer.valueOf(this.f3792G), Integer.valueOf(eVar.f3792G), a7).b(Integer.valueOf(this.f3793H), Integer.valueOf(eVar.f3793H), a7);
        Integer valueOf5 = Integer.valueOf(i7);
        Integer valueOf6 = Integer.valueOf(i8);
        if (!H.a(this.f3800w, eVar.f3800w)) {
            a7 = o.f3865k;
        }
        return b8.b(valueOf5, valueOf6, a7).e();
    }
}
