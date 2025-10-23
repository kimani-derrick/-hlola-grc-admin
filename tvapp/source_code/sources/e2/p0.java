package e2;

import H2.C0023y;
import android.os.SystemClock;
import java.util.List;
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: t  reason: collision with root package name */
    public static final H2.A f10042t = new C0023y(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final J0 f10043a;

    /* renamed from: b  reason: collision with root package name */
    public final H2.A f10044b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10045c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10046e;
    public final C0616l f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10047g;

    /* renamed from: h  reason: collision with root package name */
    public final H2.n0 f10048h;

    /* renamed from: i  reason: collision with root package name */
    public final W2.x f10049i;

    /* renamed from: j  reason: collision with root package name */
    public final List f10050j;

    /* renamed from: k  reason: collision with root package name */
    public final H2.A f10051k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10052l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10053m;
    public final q0 n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f10054o;

    /* renamed from: p  reason: collision with root package name */
    public volatile long f10055p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f10056q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f10057r;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f10058s;

    public p0(J0 j02, H2.A a7, long j7, long j8, int i7, C0616l c0616l, boolean z7, H2.n0 n0Var, W2.x xVar, List list, H2.A a8, boolean z8, int i8, q0 q0Var, long j9, long j10, long j11, long j12, boolean z9) {
        this.f10043a = j02;
        this.f10044b = a7;
        this.f10045c = j7;
        this.d = j8;
        this.f10046e = i7;
        this.f = c0616l;
        this.f10047g = z7;
        this.f10048h = n0Var;
        this.f10049i = xVar;
        this.f10050j = list;
        this.f10051k = a8;
        this.f10052l = z8;
        this.f10053m = i8;
        this.n = q0Var;
        this.f10055p = j9;
        this.f10056q = j10;
        this.f10057r = j11;
        this.f10058s = j12;
        this.f10054o = z9;
    }

    public static p0 i(W2.x xVar) {
        G0 g02 = J0.f9620q;
        H2.A a7 = f10042t;
        return new p0(g02, a7, -9223372036854775807L, 0L, 1, null, false, H2.n0.f1144t, xVar, O3.U.f2621u, a7, false, 0, q0.f10062t, 0L, 0L, 0L, 0L, false);
    }

    public final p0 a() {
        return new p0(this.f10043a, this.f10044b, this.f10045c, this.d, this.f10046e, this.f, this.f10047g, this.f10048h, this.f10049i, this.f10050j, this.f10051k, this.f10052l, this.f10053m, this.n, this.f10055p, this.f10056q, j(), SystemClock.elapsedRealtime(), this.f10054o);
    }

    public final p0 b(H2.A a7) {
        return new p0(this.f10043a, this.f10044b, this.f10045c, this.d, this.f10046e, this.f, this.f10047g, this.f10048h, this.f10049i, this.f10050j, a7, this.f10052l, this.f10053m, this.n, this.f10055p, this.f10056q, this.f10057r, this.f10058s, this.f10054o);
    }

    public final p0 c(H2.A a7, long j7, long j8, long j9, long j10, H2.n0 n0Var, W2.x xVar, List list) {
        return new p0(this.f10043a, a7, j8, j9, this.f10046e, this.f, this.f10047g, n0Var, xVar, list, this.f10051k, this.f10052l, this.f10053m, this.n, this.f10055p, j10, j7, SystemClock.elapsedRealtime(), this.f10054o);
    }

    public final p0 d(int i7, boolean z7) {
        return new p0(this.f10043a, this.f10044b, this.f10045c, this.d, this.f10046e, this.f, this.f10047g, this.f10048h, this.f10049i, this.f10050j, this.f10051k, z7, i7, this.n, this.f10055p, this.f10056q, this.f10057r, this.f10058s, this.f10054o);
    }

    public final p0 e(C0616l c0616l) {
        return new p0(this.f10043a, this.f10044b, this.f10045c, this.d, this.f10046e, c0616l, this.f10047g, this.f10048h, this.f10049i, this.f10050j, this.f10051k, this.f10052l, this.f10053m, this.n, this.f10055p, this.f10056q, this.f10057r, this.f10058s, this.f10054o);
    }

    public final p0 f(q0 q0Var) {
        return new p0(this.f10043a, this.f10044b, this.f10045c, this.d, this.f10046e, this.f, this.f10047g, this.f10048h, this.f10049i, this.f10050j, this.f10051k, this.f10052l, this.f10053m, q0Var, this.f10055p, this.f10056q, this.f10057r, this.f10058s, this.f10054o);
    }

    public final p0 g(int i7) {
        return new p0(this.f10043a, this.f10044b, this.f10045c, this.d, i7, this.f, this.f10047g, this.f10048h, this.f10049i, this.f10050j, this.f10051k, this.f10052l, this.f10053m, this.n, this.f10055p, this.f10056q, this.f10057r, this.f10058s, this.f10054o);
    }

    public final p0 h(J0 j02) {
        return new p0(j02, this.f10044b, this.f10045c, this.d, this.f10046e, this.f, this.f10047g, this.f10048h, this.f10049i, this.f10050j, this.f10051k, this.f10052l, this.f10053m, this.n, this.f10055p, this.f10056q, this.f10057r, this.f10058s, this.f10054o);
    }

    public final long j() {
        long j7;
        long j8;
        if (!k()) {
            return this.f10057r;
        }
        do {
            j7 = this.f10058s;
            j8 = this.f10057r;
        } while (j7 != this.f10058s);
        return Z2.H.J(Z2.H.S(j8) + (((float) (SystemClock.elapsedRealtime() - j7)) * this.n.f10063q));
    }

    public final boolean k() {
        if (this.f10046e == 3 && this.f10052l && this.f10053m == 0) {
            return true;
        }
        return false;
    }
}
