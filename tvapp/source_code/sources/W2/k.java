package W2;

import H2.m0;
import O3.AbstractC0079x;
import O3.E;
import O3.S;
import O3.b0;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class k extends m implements Comparable {

    /* renamed from: A  reason: collision with root package name */
    public final int f3838A;

    /* renamed from: B  reason: collision with root package name */
    public final int f3839B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f3840C;

    /* renamed from: u  reason: collision with root package name */
    public final int f3841u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f3842v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f3843w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f3844x;

    /* renamed from: y  reason: collision with root package name */
    public final int f3845y;

    /* renamed from: z  reason: collision with root package name */
    public final int f3846z;

    public k(int i7, m0 m0Var, int i8, h hVar, int i9, String str) {
        super(i7, m0Var, i8);
        boolean z7;
        boolean z8;
        E e3;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        int i11 = 0;
        this.f3842v = o.g(i9, false);
        int i12 = this.f3850t.f9679t & (~hVar.f3916K);
        if ((i12 & 1) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f3843w = z7;
        if ((i12 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f3844x = z8;
        E e7 = hVar.f3914I;
        if (e7.isEmpty()) {
            e3 = E.x("");
        } else {
            e3 = e7;
        }
        int i13 = 0;
        while (true) {
            if (i13 < e3.size()) {
                i10 = o.e(this.f3850t, (String) e3.get(i13), hVar.f3917L);
                if (i10 > 0) {
                    break;
                }
                i13++;
            } else {
                i13 = Integer.MAX_VALUE;
                i10 = 0;
                break;
            }
        }
        this.f3845y = i13;
        this.f3846z = i10;
        int b7 = o.b(this.f3850t.f9680u, hVar.f3915J);
        this.f3838A = b7;
        if ((this.f3850t.f9680u & 1088) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f3840C = z9;
        if (o.i(str) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int e8 = o.e(this.f3850t, str, z10);
        this.f3839B = e8;
        if (i10 <= 0 && ((!e7.isEmpty() || b7 <= 0) && !this.f3843w && (!this.f3844x || e8 <= 0))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (o.g(i9, hVar.f3831a0) && z11) {
            i11 = 1;
        }
        this.f3841u = i11;
    }

    @Override // W2.m
    public final int a() {
        return this.f3841u;
    }

    @Override // W2.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        k kVar = (k) mVar;
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(k kVar) {
        AbstractC0079x c5 = AbstractC0079x.f2710a.c(this.f3842v, kVar.f3842v);
        Integer valueOf = Integer.valueOf(this.f3845y);
        Integer valueOf2 = Integer.valueOf(kVar.f3845y);
        Comparator comparator = S.f2620q;
        comparator.getClass();
        b0 b0Var = b0.f2654q;
        AbstractC0079x b7 = c5.b(valueOf, valueOf2, b0Var);
        int i7 = this.f3846z;
        AbstractC0079x a7 = b7.a(i7, kVar.f3846z);
        int i8 = this.f3838A;
        AbstractC0079x c6 = a7.a(i8, kVar.f3838A).c(this.f3843w, kVar.f3843w);
        Boolean valueOf3 = Boolean.valueOf(this.f3844x);
        Boolean valueOf4 = Boolean.valueOf(kVar.f3844x);
        if (i7 != 0) {
            comparator = b0Var;
        }
        AbstractC0079x a8 = c6.b(valueOf3, valueOf4, comparator).a(this.f3839B, kVar.f3839B);
        if (i8 == 0) {
            a8 = a8.d(this.f3840C, kVar.f3840C);
        }
        return a8.e();
    }
}
