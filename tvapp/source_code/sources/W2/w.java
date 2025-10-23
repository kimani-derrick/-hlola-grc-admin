package W2;

import O3.AbstractC0072p;
import O3.E;
import O3.H;
import O3.Z;
import e2.InterfaceC0604f;
/* loaded from: classes.dex */
public class w implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f3907A;

    /* renamed from: B  reason: collision with root package name */
    public final E f3908B;

    /* renamed from: C  reason: collision with root package name */
    public final int f3909C;

    /* renamed from: D  reason: collision with root package name */
    public final E f3910D;

    /* renamed from: E  reason: collision with root package name */
    public final int f3911E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public final int f3912G;

    /* renamed from: H  reason: collision with root package name */
    public final E f3913H;

    /* renamed from: I  reason: collision with root package name */
    public final E f3914I;

    /* renamed from: J  reason: collision with root package name */
    public final int f3915J;

    /* renamed from: K  reason: collision with root package name */
    public final int f3916K;

    /* renamed from: L  reason: collision with root package name */
    public final boolean f3917L;

    /* renamed from: M  reason: collision with root package name */
    public final boolean f3918M;

    /* renamed from: N  reason: collision with root package name */
    public final boolean f3919N;

    /* renamed from: O  reason: collision with root package name */
    public final Z f3920O;

    /* renamed from: P  reason: collision with root package name */
    public final H f3921P;

    /* renamed from: q  reason: collision with root package name */
    public final int f3922q;

    /* renamed from: r  reason: collision with root package name */
    public final int f3923r;

    /* renamed from: s  reason: collision with root package name */
    public final int f3924s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3925t;

    /* renamed from: u  reason: collision with root package name */
    public final int f3926u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3927v;

    /* renamed from: w  reason: collision with root package name */
    public final int f3928w;

    /* renamed from: x  reason: collision with root package name */
    public final int f3929x;

    /* renamed from: y  reason: collision with root package name */
    public final int f3930y;

    /* renamed from: z  reason: collision with root package name */
    public final int f3931z;

    static {
        new w(new v());
        int i7 = Z2.H.f4603a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
    }

    public w(v vVar) {
        this.f3922q = vVar.f3884a;
        this.f3923r = vVar.f3885b;
        this.f3924s = vVar.f3886c;
        this.f3925t = vVar.d;
        this.f3926u = vVar.f3887e;
        this.f3927v = vVar.f;
        this.f3928w = vVar.f3888g;
        this.f3929x = vVar.f3889h;
        this.f3930y = vVar.f3890i;
        this.f3931z = vVar.f3891j;
        this.f3907A = vVar.f3892k;
        this.f3908B = vVar.f3893l;
        this.f3909C = vVar.f3894m;
        this.f3910D = vVar.n;
        this.f3911E = vVar.f3895o;
        this.F = vVar.f3896p;
        this.f3912G = vVar.f3897q;
        this.f3913H = vVar.f3898r;
        this.f3914I = vVar.f3899s;
        this.f3915J = vVar.f3900t;
        this.f3916K = vVar.f3901u;
        this.f3917L = vVar.f3902v;
        this.f3918M = vVar.f3903w;
        this.f3919N = vVar.f3904x;
        this.f3920O = Z.b(vVar.f3905y);
        this.f3921P = H.s(vVar.f3906z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f3922q == wVar.f3922q && this.f3923r == wVar.f3923r && this.f3924s == wVar.f3924s && this.f3925t == wVar.f3925t && this.f3926u == wVar.f3926u && this.f3927v == wVar.f3927v && this.f3928w == wVar.f3928w && this.f3929x == wVar.f3929x && this.f3907A == wVar.f3907A && this.f3930y == wVar.f3930y && this.f3931z == wVar.f3931z && this.f3908B.equals(wVar.f3908B) && this.f3909C == wVar.f3909C && this.f3910D.equals(wVar.f3910D) && this.f3911E == wVar.f3911E && this.F == wVar.F && this.f3912G == wVar.f3912G && this.f3913H.equals(wVar.f3913H) && this.f3914I.equals(wVar.f3914I) && this.f3915J == wVar.f3915J && this.f3916K == wVar.f3916K && this.f3917L == wVar.f3917L && this.f3918M == wVar.f3918M && this.f3919N == wVar.f3919N) {
            Z z7 = this.f3920O;
            z7.getClass();
            if (AbstractC0072p.f(z7, wVar.f3920O) && this.f3921P.equals(wVar.f3921P)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f3908B.hashCode();
        int hashCode2 = this.f3910D.hashCode();
        int hashCode3 = this.f3913H.hashCode();
        int hashCode4 = this.f3914I.hashCode();
        int hashCode5 = this.f3920O.hashCode();
        return this.f3921P.hashCode() + ((hashCode5 + ((((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.f3922q + 31) * 31) + this.f3923r) * 31) + this.f3924s) * 31) + this.f3925t) * 31) + this.f3926u) * 31) + this.f3927v) * 31) + this.f3928w) * 31) + this.f3929x) * 31) + (this.f3907A ? 1 : 0)) * 31) + this.f3930y) * 31) + this.f3931z) * 31)) * 31) + this.f3909C) * 31)) * 31) + this.f3911E) * 31) + this.F) * 31) + this.f3912G) * 31)) * 31)) * 31) + this.f3915J) * 31) + this.f3916K) * 31) + (this.f3917L ? 1 : 0)) * 31) + (this.f3918M ? 1 : 0)) * 31) + (this.f3919N ? 1 : 0)) * 31)) * 31);
    }
}
