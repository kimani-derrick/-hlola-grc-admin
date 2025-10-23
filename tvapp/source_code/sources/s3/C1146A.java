package s3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* renamed from: s3.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146A {

    /* renamed from: A  reason: collision with root package name */
    public Long f13706A;

    /* renamed from: B  reason: collision with root package name */
    public Long f13707B;

    /* renamed from: C  reason: collision with root package name */
    public long f13708C;

    /* renamed from: D  reason: collision with root package name */
    public String f13709D;

    /* renamed from: E  reason: collision with root package name */
    public int f13710E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public long f13711G;

    /* renamed from: H  reason: collision with root package name */
    public String f13712H;

    /* renamed from: I  reason: collision with root package name */
    public long f13713I;

    /* renamed from: J  reason: collision with root package name */
    public long f13714J;

    /* renamed from: K  reason: collision with root package name */
    public long f13715K;

    /* renamed from: L  reason: collision with root package name */
    public long f13716L;

    /* renamed from: M  reason: collision with root package name */
    public long f13717M;

    /* renamed from: N  reason: collision with root package name */
    public long f13718N;

    /* renamed from: O  reason: collision with root package name */
    public String f13719O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f13720P;

    /* renamed from: Q  reason: collision with root package name */
    public long f13721Q;

    /* renamed from: R  reason: collision with root package name */
    public long f13722R;

    /* renamed from: a  reason: collision with root package name */
    public final C1175g0 f13723a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13724b;

    /* renamed from: c  reason: collision with root package name */
    public String f13725c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public String f13726e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public long f13727g;

    /* renamed from: h  reason: collision with root package name */
    public long f13728h;

    /* renamed from: i  reason: collision with root package name */
    public long f13729i;

    /* renamed from: j  reason: collision with root package name */
    public String f13730j;

    /* renamed from: k  reason: collision with root package name */
    public long f13731k;

    /* renamed from: l  reason: collision with root package name */
    public String f13732l;

    /* renamed from: m  reason: collision with root package name */
    public long f13733m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f13734o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f13735p;

    /* renamed from: q  reason: collision with root package name */
    public String f13736q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f13737r;

    /* renamed from: s  reason: collision with root package name */
    public long f13738s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f13739t;

    /* renamed from: u  reason: collision with root package name */
    public String f13740u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f13741v;

    /* renamed from: w  reason: collision with root package name */
    public long f13742w;

    /* renamed from: x  reason: collision with root package name */
    public long f13743x;

    /* renamed from: y  reason: collision with root package name */
    public int f13744y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f13745z;

    public C1146A(C1175g0 c1175g0, String str) {
        g3.n.g(c1175g0);
        g3.n.c(str);
        this.f13723a = c1175g0;
        this.f13724b = str;
        C1169d0 c1169d0 = c1175g0.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
    }

    public final void A(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13716L != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13716L = j7;
    }

    public final void B(String str) {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        this.f13720P |= !Objects.equals(this.f, str);
        this.f = str;
    }

    public final void C(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13717M != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13717M = j7;
    }

    public final void D(String str) {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f13720P |= !Objects.equals(this.d, str);
        this.d = str;
    }

    public final void E(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13715K != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13715K = j7;
    }

    public final void F(String str) {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        this.f13720P |= !Objects.equals(this.f13719O, str);
        this.f13719O = str;
    }

    public final void G(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13714J != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13714J = j7;
    }

    public final void H(String str) {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        this.f13720P |= !Objects.equals(this.f13726e, str);
        this.f13726e = str;
    }

    public final void I(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13718N != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13718N = j7;
    }

    public final void J(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13713I != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13713I = j7;
    }

    public final void K(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.n != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.n = j7;
    }

    public final void L(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13738s != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13738s = j7;
    }

    public final void M(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13722R != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13722R = j7;
    }

    public final void N(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13733m != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13733m = j7;
    }

    public final long O() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13738s;
    }

    public final void P(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13711G != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13711G = j7;
    }

    public final void Q(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13729i != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13729i = j7;
    }

    public final void R(long j7) {
        boolean z7;
        boolean z8 = false;
        if (j7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        g3.n.a(z7);
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z9 = this.f13720P;
        if (this.f13727g != j7) {
            z8 = true;
        }
        this.f13720P = z9 | z8;
        this.f13727g = j7;
    }

    public final void S(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13728h != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13728h = j7;
    }

    public final void T(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13743x != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13743x = j7;
    }

    public final void U(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13742w != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13742w = j7;
    }

    public final Boolean V() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13737r;
    }

    public final void a(long j7) {
        C1175g0 c1175g0 = this.f13723a;
        C1169d0 c1169d0 = c1175g0.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        long j8 = this.f13727g + j7;
        int i7 = (j8 > 2147483647L ? 1 : (j8 == 2147483647L ? 0 : -1));
        C1154I c1154i = c1175g0.f14064y;
        String str = this.f13724b;
        if (i7 > 0) {
            C1175g0.i(c1154i);
            c1154i.f13810y.c(C1154I.J(str), "Bundle index overflow. appId");
            j8 = j7 - 1;
        }
        long j9 = this.f13711G + 1;
        if (j9 > 2147483647L) {
            C1175g0.i(c1154i);
            c1154i.f13810y.c(C1154I.J(str), "Delivery index overflow. appId");
            j9 = 0;
        }
        this.f13720P = true;
        this.f13727g = j8;
        this.f13711G = j9;
    }

    public final void b(String str) {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f13720P |= !Objects.equals(this.f13736q, str);
        this.f13736q = str;
    }

    public final void c(List list) {
        ArrayList arrayList;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        if (!Objects.equals(this.f13739t, list)) {
            this.f13720P = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f13739t = arrayList;
        }
    }

    public final String d() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13736q;
    }

    public final String e() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        String str = this.f13719O;
        F(null);
        return str;
    }

    public final String f() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13724b;
    }

    public final String g() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13725c;
    }

    public final String h() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13730j;
    }

    public final String i() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f;
    }

    public final String j() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.d;
    }

    public final String k() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13712H;
    }

    public final String l() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13709D;
    }

    public final void m() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        this.f13720P = false;
    }

    public final boolean n() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13735p;
    }

    public final boolean o() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13720P;
    }

    public final boolean p() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13741v;
    }

    public final void q(int i7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.F != i7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.F = i7;
    }

    public final void r(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13731k != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13731k = j7;
    }

    public final void s(String str) {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        this.f13720P |= !Objects.equals(this.f13725c, str);
        this.f13725c = str;
    }

    public final void t(boolean z7) {
        boolean z8;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z9 = this.f13720P;
        if (this.f13734o != z7) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f13720P = z9 | z8;
        this.f13734o = z7;
    }

    public final void u(int i7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13710E != i7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13710E = i7;
    }

    public final void v(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13708C != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13708C = j7;
    }

    public final void w(String str) {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        this.f13720P |= !Objects.equals(this.f13732l, str);
        this.f13732l = str;
    }

    public final void x(long j7) {
        boolean z7;
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        boolean z8 = this.f13720P;
        if (this.f13721Q != j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f13720P = z8 | z7;
        this.f13721Q = j7;
    }

    public final void y(String str) {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        this.f13720P |= !Objects.equals(this.f13730j, str);
        this.f13730j = str;
    }

    public final long z() {
        C1169d0 c1169d0 = this.f13723a.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        return this.f13731k;
    }
}
