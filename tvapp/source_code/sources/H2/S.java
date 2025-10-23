package H2;

import Y2.InterfaceC0144m;
import Z2.AbstractC0156a;
import android.net.Uri;
import android.os.Handler;
import e2.C0593J;
import e2.D0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k2.C0954s;
import k2.InterfaceC0946k;
import k2.InterfaceC0948m;
import k2.InterfaceC0955t;
import x2.C1461c;
/* loaded from: classes.dex */
public final class S implements InterfaceC0022x, InterfaceC0948m, Y2.I, Y2.L, b0 {

    /* renamed from: c0  reason: collision with root package name */
    public static final Map f942c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final e2.K f943d0;

    /* renamed from: B  reason: collision with root package name */
    public final C0002c f945B;

    /* renamed from: G  reason: collision with root package name */
    public InterfaceC0021w f949G;

    /* renamed from: H  reason: collision with root package name */
    public B2.b f950H;

    /* renamed from: K  reason: collision with root package name */
    public boolean f953K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f954L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f955M;

    /* renamed from: N  reason: collision with root package name */
    public C4.b f956N;

    /* renamed from: O  reason: collision with root package name */
    public InterfaceC0955t f957O;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f959Q;

    /* renamed from: S  reason: collision with root package name */
    public boolean f961S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f962T;

    /* renamed from: U  reason: collision with root package name */
    public int f963U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f964V;
    public long W;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f966Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f967Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f968a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f969b0;

    /* renamed from: q  reason: collision with root package name */
    public final Uri f970q;

    /* renamed from: r  reason: collision with root package name */
    public final InterfaceC0144m f971r;

    /* renamed from: s  reason: collision with root package name */
    public final j2.q f972s;

    /* renamed from: t  reason: collision with root package name */
    public final L4.f f973t;

    /* renamed from: u  reason: collision with root package name */
    public final C.d f974u;

    /* renamed from: v  reason: collision with root package name */
    public final j2.n f975v;

    /* renamed from: w  reason: collision with root package name */
    public final W f976w;

    /* renamed from: x  reason: collision with root package name */
    public final Y2.r f977x;

    /* renamed from: y  reason: collision with root package name */
    public final String f978y;

    /* renamed from: z  reason: collision with root package name */
    public final long f979z;

    /* renamed from: A  reason: collision with root package name */
    public final Y2.N f944A = new Y2.N("ProgressiveMediaPeriod");

    /* renamed from: C  reason: collision with root package name */
    public final X0.j f946C = new Object();

    /* renamed from: D  reason: collision with root package name */
    public final N f947D = new N(this, 0);

    /* renamed from: E  reason: collision with root package name */
    public final N f948E = new N(this, 1);
    public final Handler F = Z2.H.n(null);

    /* renamed from: J  reason: collision with root package name */
    public Q[] f952J = new Q[0];

    /* renamed from: I  reason: collision with root package name */
    public c0[] f951I = new c0[0];

    /* renamed from: X  reason: collision with root package name */
    public long f965X = -9223372036854775807L;

    /* renamed from: P  reason: collision with root package name */
    public long f958P = -9223372036854775807L;

    /* renamed from: R  reason: collision with root package name */
    public int f960R = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f942c0 = Collections.unmodifiableMap(hashMap);
        C0593J c0593j = new C0593J();
        c0593j.f9597a = "icy";
        c0593j.f9605k = "application/x-icy";
        f943d0 = c0593j.a();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X0.j] */
    public S(Uri uri, InterfaceC0144m interfaceC0144m, C0002c c0002c, j2.q qVar, j2.n nVar, L4.f fVar, C.d dVar, W w7, Y2.r rVar, String str, int i7) {
        this.f970q = uri;
        this.f971r = interfaceC0144m;
        this.f972s = qVar;
        this.f975v = nVar;
        this.f973t = fVar;
        this.f974u = dVar;
        this.f976w = w7;
        this.f977x = rVar;
        this.f978y = str;
        this.f979z = i7;
        this.f945B = c0002c;
    }

    public final void A() {
        O o7 = new O(this, this.f970q, this.f971r, this.f945B, this, this.f946C);
        if (this.f954L) {
            AbstractC0156a.k(o());
            long j7 = this.f958P;
            if (j7 != -9223372036854775807L && this.f965X > j7) {
                this.f968a0 = true;
                this.f965X = -9223372036854775807L;
                return;
            }
            InterfaceC0955t interfaceC0955t = this.f957O;
            interfaceC0955t.getClass();
            long j8 = interfaceC0955t.g(this.f965X).f12194a.f12198b;
            long j9 = this.f965X;
            o7.f.f3459a = j8;
            o7.f933i = j9;
            o7.f932h = true;
            o7.f936l = false;
            for (c0 c0Var : this.f951I) {
                c0Var.f1042t = this.f965X;
            }
            this.f965X = -9223372036854775807L;
        }
        this.f967Z = j();
        this.f944A.d(o7, this, this.f973t.K(this.f960R));
        this.f974u.s(new C0016q(o7.f934j), 1, -1, null, 0, null, o7.f933i, this.f958P);
    }

    @Override // H2.InterfaceC0022x
    public final long B() {
        if (this.f962T) {
            if (this.f968a0 || j() > this.f967Z) {
                this.f962T = false;
                return this.W;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // H2.f0
    public final boolean C(long j7) {
        if (!this.f968a0) {
            Y2.N n = this.f944A;
            if (n.f4343c == null && !this.f966Y) {
                if (!this.f954L || this.f963U != 0) {
                    boolean d = this.f946C.d();
                    if (!n.b()) {
                        A();
                        return true;
                    }
                    return d;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean D() {
        if (!this.f962T && !o()) {
            return false;
        }
        return true;
    }

    @Override // H2.f0
    public final boolean a() {
        boolean z7;
        if (this.f944A.b()) {
            X0.j jVar = this.f946C;
            synchronized (jVar) {
                z7 = jVar.f4072a;
            }
            if (z7) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void b(Y2.K k5) {
        InterfaceC0955t interfaceC0955t;
        long j7;
        O o7 = (O) k5;
        if (this.f958P == -9223372036854775807L && (interfaceC0955t = this.f957O) != null) {
            boolean b7 = interfaceC0955t.b();
            long k7 = k(true);
            if (k7 == Long.MIN_VALUE) {
                j7 = 0;
            } else {
                j7 = k7 + 10000;
            }
            this.f958P = j7;
            this.f976w.s(j7, b7, this.f959Q);
        }
        Uri uri = o7.f928b.f4367s;
        ?? obj = new Object();
        this.f973t.getClass();
        this.f974u.n(obj, 1, -1, null, 0, null, o7.f933i, this.f958P);
        this.f968a0 = true;
        InterfaceC0021w interfaceC0021w = this.f949G;
        interfaceC0021w.getClass();
        interfaceC0021w.h(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void c(Y2.K k5, boolean z7) {
        O o7 = (O) k5;
        Uri uri = o7.f928b.f4367s;
        ?? obj = new Object();
        this.f973t.getClass();
        this.f974u.l(obj, 1, -1, null, 0, null, o7.f933i, this.f958P);
        if (!z7) {
            for (c0 c0Var : this.f951I) {
                c0Var.z(false);
            }
            if (this.f963U > 0) {
                InterfaceC0021w interfaceC0021w = this.f949G;
                interfaceC0021w.getClass();
                interfaceC0021w.h(this);
            }
        }
    }

    @Override // Y2.L
    public final void d() {
        c0[] c0VarArr;
        for (c0 c0Var : this.f951I) {
            c0Var.z(true);
            j2.k kVar = c0Var.f1031h;
            if (kVar != null) {
                kVar.a(c0Var.f1029e);
                c0Var.f1031h = null;
                c0Var.f1030g = null;
            }
        }
        C0002c c0002c = this.f945B;
        InterfaceC0946k interfaceC0946k = (InterfaceC0946k) c0002c.f1018s;
        if (interfaceC0946k != null) {
            interfaceC0946k.a();
            c0002c.f1018s = null;
        }
        c0002c.f1019t = null;
    }

    @Override // H2.InterfaceC0022x
    public final void e(InterfaceC0021w interfaceC0021w, long j7) {
        this.f949G = interfaceC0021w;
        this.f946C.d();
        A();
    }

    @Override // H2.b0
    public final void f() {
        this.F.post(this.f947D);
    }

    @Override // H2.InterfaceC0022x
    public final n0 g() {
        i();
        return (n0) this.f956N.f421r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y2.H h(Y2.K r17, java.io.IOException r18, int r19) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.S.h(Y2.K, java.io.IOException, int):Y2.H");
    }

    public final void i() {
        AbstractC0156a.k(this.f954L);
        this.f956N.getClass();
        this.f957O.getClass();
    }

    public final int j() {
        c0[] c0VarArr;
        int i7 = 0;
        for (c0 c0Var : this.f951I) {
            i7 += c0Var.f1039q + c0Var.f1038p;
        }
        return i7;
    }

    public final long k(boolean z7) {
        long j7 = Long.MIN_VALUE;
        for (int i7 = 0; i7 < this.f951I.length; i7++) {
            if (!z7) {
                C4.b bVar = this.f956N;
                bVar.getClass();
                if (!((boolean[]) bVar.f423t)[i7]) {
                }
            }
            j7 = Math.max(j7, this.f951I[i7].m());
        }
        return j7;
    }

    @Override // k2.InterfaceC0948m
    public final void l() {
        this.f953K = true;
        this.F.post(this.f947D);
    }

    @Override // H2.f0
    public final long m() {
        long j7;
        boolean z7;
        i();
        if (this.f968a0 || this.f963U == 0) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.f965X;
        }
        if (this.f955M) {
            int length = this.f951I.length;
            j7 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                C4.b bVar = this.f956N;
                if (((boolean[]) bVar.f422s)[i7] && ((boolean[]) bVar.f423t)[i7]) {
                    c0 c0Var = this.f951I[i7];
                    synchronized (c0Var) {
                        z7 = c0Var.f1045w;
                    }
                    if (!z7) {
                        j7 = Math.min(j7, this.f951I[i7].m());
                    }
                }
            }
        } else {
            j7 = Long.MAX_VALUE;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = k(false);
        }
        if (j7 == Long.MIN_VALUE) {
            return this.W;
        }
        return j7;
    }

    @Override // H2.InterfaceC0022x
    public final void n() {
        int K6 = this.f973t.K(this.f960R);
        Y2.N n = this.f944A;
        IOException iOException = n.f4343c;
        if (iOException == null) {
            Y2.J j7 = n.f4342b;
            if (j7 != null) {
                if (K6 == Integer.MIN_VALUE) {
                    K6 = j7.f4331q;
                }
                IOException iOException2 = j7.f4334t;
                if (iOException2 != null && j7.f4335u > K6) {
                    throw iOException2;
                }
            }
            if (this.f968a0 && !this.f954L) {
                throw e2.m0.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    public final boolean o() {
        if (this.f965X != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void p() {
        boolean z7;
        C1461c a7;
        int i7;
        if (!this.f969b0 && !this.f954L && this.f953K && this.f957O != null) {
            for (c0 c0Var : this.f951I) {
                if (c0Var.s() == null) {
                    return;
                }
            }
            this.f946C.c();
            int length = this.f951I.length;
            m0[] m0VarArr = new m0[length];
            boolean[] zArr = new boolean[length];
            for (int i8 = 0; i8 < length; i8++) {
                e2.K s6 = this.f951I[i8].s();
                s6.getClass();
                String str = s6.f9655B;
                boolean i9 = Z2.r.i(str);
                if (!i9 && !Z2.r.k(str)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                zArr[i8] = z7;
                this.f955M = z7 | this.f955M;
                B2.b bVar = this.f950H;
                if (bVar != null) {
                    if (i9 || this.f952J[i8].f941b) {
                        C1461c c1461c = s6.f9685z;
                        if (c1461c == null) {
                            a7 = new C1461c(bVar);
                        } else {
                            a7 = c1461c.a(bVar);
                        }
                        C0593J a8 = s6.a();
                        a8.f9603i = a7;
                        s6 = new e2.K(a8);
                    }
                    if (i9 && s6.f9681v == -1 && s6.f9682w == -1 && (i7 = bVar.f181q) != -1) {
                        C0593J a9 = s6.a();
                        a9.f = i7;
                        s6 = new e2.K(a9);
                    }
                }
                int o7 = this.f972s.o(s6);
                C0593J a10 = s6.a();
                a10.F = o7;
                m0VarArr[i8] = new m0(Integer.toString(i8), a10.a());
            }
            this.f956N = new C4.b(new n0(m0VarArr), zArr);
            this.f954L = true;
            InterfaceC0021w interfaceC0021w = this.f949G;
            interfaceC0021w.getClass();
            interfaceC0021w.s(this);
        }
    }

    @Override // k2.InterfaceC0948m
    public final k2.w q(int i7, int i8) {
        return x(new Q(i7, false));
    }

    public final void r(int i7) {
        i();
        C4.b bVar = this.f956N;
        boolean[] zArr = (boolean[]) bVar.f424u;
        if (!zArr[i7]) {
            e2.K k5 = ((n0) bVar.f421r).a(i7).f1136t[0];
            int h7 = Z2.r.h(k5.f9655B);
            long j7 = this.W;
            C.d dVar = this.f974u;
            dVar.getClass();
            dVar.f(new C0020v(1, h7, k5, 0, null, Z2.H.S(j7), -9223372036854775807L));
            zArr[i7] = true;
        }
    }

    public final void s(int i7) {
        i();
        boolean[] zArr = (boolean[]) this.f956N.f422s;
        if (this.f966Y && zArr[i7] && !this.f951I[i7].u(false)) {
            this.f965X = 0L;
            this.f966Y = false;
            this.f962T = true;
            this.W = 0L;
            this.f967Z = 0;
            for (c0 c0Var : this.f951I) {
                c0Var.z(false);
            }
            InterfaceC0021w interfaceC0021w = this.f949G;
            interfaceC0021w.getClass();
            interfaceC0021w.h(this);
        }
    }

    @Override // k2.InterfaceC0948m
    public final void t(InterfaceC0955t interfaceC0955t) {
        this.F.post(new A4.d(this, 2, interfaceC0955t));
    }

    @Override // H2.InterfaceC0022x
    public final long u(long j7, D0 d02) {
        i();
        if (!this.f957O.b()) {
            return 0L;
        }
        C0954s g7 = this.f957O.g(j7);
        return d02.a(j7, g7.f12194a.f12197a, g7.f12195b.f12197a);
    }

    @Override // H2.InterfaceC0022x
    public final long v(long j7) {
        i();
        boolean[] zArr = (boolean[]) this.f956N.f422s;
        if (!this.f957O.b()) {
            j7 = 0;
        }
        this.f962T = false;
        this.W = j7;
        if (o()) {
            this.f965X = j7;
            return j7;
        }
        if (this.f960R != 7) {
            int length = this.f951I.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (this.f951I[i7].C(false, j7) || (!zArr[i7] && this.f955M)) {
                }
            }
            return j7;
        }
        this.f966Y = false;
        this.f965X = j7;
        this.f968a0 = false;
        Y2.N n = this.f944A;
        if (n.b()) {
            for (c0 c0Var : this.f951I) {
                c0Var.i();
            }
            n.a();
        } else {
            n.f4343c = null;
            for (c0 c0Var2 : this.f951I) {
                c0Var2.z(false);
            }
        }
        return j7;
    }

    @Override // H2.InterfaceC0022x
    public final void w(long j7) {
        i();
        if (o()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f956N.f423t;
        int length = this.f951I.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f951I[i7].h(zArr[i7], j7);
        }
    }

    public final c0 x(Q q5) {
        int length = this.f951I.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (q5.equals(this.f952J[i7])) {
                return this.f951I[i7];
            }
        }
        j2.q qVar = this.f972s;
        qVar.getClass();
        j2.n nVar = this.f975v;
        nVar.getClass();
        c0 c0Var = new c0(this.f977x, qVar, nVar);
        c0Var.f = this;
        int i8 = length + 1;
        Q[] qArr = (Q[]) Arrays.copyOf(this.f952J, i8);
        qArr[length] = q5;
        this.f952J = qArr;
        c0[] c0VarArr = (c0[]) Arrays.copyOf(this.f951I, i8);
        c0VarArr[length] = c0Var;
        this.f951I = c0VarArr;
        return c0Var;
    }

    @Override // H2.InterfaceC0022x
    public final long y(W2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j7) {
        boolean[] zArr3;
        boolean z7;
        W2.q qVar;
        boolean z8;
        boolean z9;
        i();
        C4.b bVar = this.f956N;
        n0 n0Var = (n0) bVar.f421r;
        int i7 = this.f963U;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int length = qVarArr.length;
            zArr3 = (boolean[]) bVar.f423t;
            if (i9 >= length) {
                break;
            }
            d0 d0Var = d0VarArr[i9];
            if (d0Var != null && (qVarArr[i9] == null || !zArr[i9])) {
                int i10 = ((P) d0Var).f938q;
                AbstractC0156a.k(zArr3[i10]);
                this.f963U--;
                zArr3[i10] = false;
                d0VarArr[i9] = null;
            }
            i9++;
        }
        if (!this.f961S ? j7 != 0 : i7 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        for (int i11 = 0; i11 < qVarArr.length; i11++) {
            if (d0VarArr[i11] == null && (qVar = qVarArr[i11]) != null) {
                if (qVar.length() == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0156a.k(z8);
                if (qVar.k(0) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC0156a.k(z9);
                int b7 = n0Var.b(qVar.b());
                AbstractC0156a.k(!zArr3[b7]);
                this.f963U++;
                zArr3[b7] = true;
                d0VarArr[i11] = new P(this, b7);
                zArr2[i11] = true;
                if (!z7) {
                    c0 c0Var = this.f951I[b7];
                    if (!c0Var.C(true, j7) && c0Var.p() != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
            }
        }
        if (this.f963U == 0) {
            this.f966Y = false;
            this.f962T = false;
            Y2.N n = this.f944A;
            if (n.b()) {
                c0[] c0VarArr = this.f951I;
                int length2 = c0VarArr.length;
                while (i8 < length2) {
                    c0VarArr[i8].i();
                    i8++;
                }
                n.a();
            } else {
                for (c0 c0Var2 : this.f951I) {
                    c0Var2.z(false);
                }
            }
        } else if (z7) {
            j7 = v(j7);
            while (i8 < d0VarArr.length) {
                if (d0VarArr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.f961S = true;
        return j7;
    }

    @Override // H2.f0
    public final long z() {
        return m();
    }

    @Override // H2.f0
    public final void G(long j7) {
    }
}
