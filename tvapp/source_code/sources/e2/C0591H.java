package e2;

import H2.C0001b;
import H2.C0012m;
import H2.InterfaceC0021w;
import H2.InterfaceC0022x;
import O3.AbstractC0080y;
import Y2.C0145n;
import Y2.C0150t;
import Y2.InterfaceC0137f;
import Z2.AbstractC0156a;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import x2.C1461c;
import x2.InterfaceC1460b;
/* renamed from: e2.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591H implements Handler.Callback, InterfaceC0021w {

    /* renamed from: A  reason: collision with root package name */
    public final I0 f9508A;

    /* renamed from: B  reason: collision with root package name */
    public final H0 f9509B;

    /* renamed from: C  reason: collision with root package name */
    public final long f9510C;

    /* renamed from: D  reason: collision with root package name */
    public final androidx.leanback.app.C f9511D;

    /* renamed from: E  reason: collision with root package name */
    public final ArrayList f9512E;
    public final Z2.B F;

    /* renamed from: G  reason: collision with root package name */
    public final C0623s f9513G;

    /* renamed from: H  reason: collision with root package name */
    public final C0603e0 f9514H;

    /* renamed from: I  reason: collision with root package name */
    public final J3.m f9515I;

    /* renamed from: J  reason: collision with root package name */
    public final C0608h f9516J;

    /* renamed from: K  reason: collision with root package name */
    public final long f9517K;

    /* renamed from: L  reason: collision with root package name */
    public D0 f9518L;

    /* renamed from: M  reason: collision with root package name */
    public p0 f9519M;

    /* renamed from: N  reason: collision with root package name */
    public C0588E f9520N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f9521O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f9522P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f9523Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f9524R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f9525S;

    /* renamed from: T  reason: collision with root package name */
    public int f9526T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f9527U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f9528V;
    public boolean W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f9529X;

    /* renamed from: Y  reason: collision with root package name */
    public int f9530Y;

    /* renamed from: Z  reason: collision with root package name */
    public C0590G f9531Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f9532a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f9533b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f9534c0;

    /* renamed from: d0  reason: collision with root package name */
    public C0616l f9535d0;

    /* renamed from: e0  reason: collision with root package name */
    public long f9536e0 = -9223372036854775807L;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0600d[] f9537q;

    /* renamed from: r  reason: collision with root package name */
    public final Set f9538r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC0600d[] f9539s;

    /* renamed from: t  reason: collision with root package name */
    public final W2.t f9540t;

    /* renamed from: u  reason: collision with root package name */
    public final W2.x f9541u;

    /* renamed from: v  reason: collision with root package name */
    public final C0610i f9542v;

    /* renamed from: w  reason: collision with root package name */
    public final InterfaceC0137f f9543w;

    /* renamed from: x  reason: collision with root package name */
    public final Z2.D f9544x;

    /* renamed from: y  reason: collision with root package name */
    public final HandlerThread f9545y;

    /* renamed from: z  reason: collision with root package name */
    public final Looper f9546z;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.leanback.app.C, java.lang.Object] */
    public C0591H(AbstractC0600d[] abstractC0600dArr, W2.t tVar, W2.x xVar, C0610i c0610i, InterfaceC0137f interfaceC0137f, int i7, boolean z7, f2.f fVar, D0 d02, C0608h c0608h, long j7, boolean z8, Looper looper, Z2.B b7, C0623s c0623s, f2.m mVar) {
        this.f9513G = c0623s;
        this.f9537q = abstractC0600dArr;
        this.f9540t = tVar;
        this.f9541u = xVar;
        this.f9542v = c0610i;
        this.f9543w = interfaceC0137f;
        this.f9526T = i7;
        this.f9527U = z7;
        this.f9518L = d02;
        this.f9516J = c0608h;
        this.f9517K = j7;
        this.f9522P = z8;
        this.F = b7;
        this.f9510C = c0610i.f9984g;
        p0 i8 = p0.i(xVar);
        this.f9519M = i8;
        this.f9520N = new C0588E(i8);
        this.f9539s = new AbstractC0600d[abstractC0600dArr.length];
        W2.o oVar = (W2.o) tVar;
        oVar.getClass();
        for (int i9 = 0; i9 < abstractC0600dArr.length; i9++) {
            AbstractC0600d abstractC0600d = abstractC0600dArr[i9];
            abstractC0600d.f9935u = i9;
            abstractC0600d.f9936v = mVar;
            this.f9539s[i9] = abstractC0600d;
            synchronized (abstractC0600d.f9931q) {
                abstractC0600d.f9930D = oVar;
            }
        }
        ?? obj = new Object();
        obj.f6158t = this;
        obj.f6157s = new Z2.A(b7);
        obj.f6155q = true;
        this.f9511D = obj;
        this.f9512E = new ArrayList();
        this.f9538r = Collections.newSetFromMap(new IdentityHashMap());
        this.f9508A = new I0();
        this.f9509B = new H0();
        tVar.f3878a = this;
        tVar.f3879b = interfaceC0137f;
        this.f9534c0 = true;
        Z2.D a7 = b7.a(looper, null);
        this.f9514H = new C0603e0(fVar, a7);
        this.f9515I = new J3.m(this, fVar, a7, mVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f9545y = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f9546z = looper2;
        this.f9544x = b7.a(looper2, this);
    }

    public static Pair G(J0 j02, C0590G c0590g, boolean z7, int i7, boolean z8, I0 i02, H0 h02) {
        J0 j03;
        Pair j7;
        Object H6;
        J0 j04 = c0590g.f9505a;
        if (j02.q()) {
            return null;
        }
        if (j04.q()) {
            j03 = j02;
        } else {
            j03 = j04;
        }
        try {
            j7 = j03.j(i02, h02, c0590g.f9506b, c0590g.f9507c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (j02.equals(j03)) {
            return j7;
        }
        if (j02.b(j7.first) != -1) {
            if (j03.h(j7.first, h02).f9557v && j03.n(h02.f9554s, i02, 0L).f9580E == j03.b(j7.first)) {
                return j02.j(i02, h02, j02.h(j7.first, h02).f9554s, c0590g.f9507c);
            }
            return j7;
        }
        if (z7 && (H6 = H(i02, h02, i7, z8, j7.first, j03, j02)) != null) {
            return j02.j(i02, h02, j02.h(H6, h02).f9554s, -9223372036854775807L);
        }
        return null;
    }

    public static Object H(I0 i02, H0 h02, int i7, boolean z7, Object obj, J0 j02, J0 j03) {
        int b7 = j02.b(obj);
        int i8 = j02.i();
        int i9 = b7;
        int i10 = -1;
        for (int i11 = 0; i11 < i8 && i10 == -1; i11++) {
            i9 = j02.d(i9, h02, i02, i7, z7);
            if (i9 == -1) {
                break;
            }
            i10 = j03.b(j02.m(i9));
        }
        if (i10 == -1) {
            return null;
        }
        return j03.m(i10);
    }

    public static void M(AbstractC0600d abstractC0600d, long j7) {
        abstractC0600d.f9928B = true;
        if (abstractC0600d instanceof M2.m) {
            M2.m mVar = (M2.m) abstractC0600d;
            AbstractC0156a.k(mVar.f9928B);
            mVar.f2291S = j7;
        }
    }

    public static boolean p(AbstractC0600d abstractC0600d) {
        if (abstractC0600d.f9937w != 0) {
            return true;
        }
        return false;
    }

    public final void A(int i7, int i8, H2.g0 g0Var) {
        boolean z7 = true;
        this.f9520N.a(1);
        J3.m mVar = this.f9515I;
        mVar.getClass();
        if (i7 < 0 || i7 > i8 || i8 > ((ArrayList) mVar.f1396c).size()) {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        mVar.f1402k = g0Var;
        mVar.i(i7, i8);
        k(mVar.c(), false);
    }

    public final void B() {
        boolean z7;
        float f = this.f9511D.a().f10063q;
        C0603e0 c0603e0 = this.f9514H;
        C0599c0 c0599c0 = c0603e0.f9953h;
        C0599c0 c0599c02 = c0603e0.f9954i;
        boolean z8 = true;
        for (C0599c0 c0599c03 = c0599c0; c0599c03 != null && c0599c03.d; c0599c03 = c0599c03.f9924l) {
            W2.x g7 = c0599c03.g(f, this.f9519M.f10043a);
            W2.x xVar = c0599c03.n;
            if (xVar != null) {
                int length = xVar.f3934c.length;
                W2.q[] qVarArr = g7.f3934c;
                if (length == qVarArr.length) {
                    for (int i7 = 0; i7 < qVarArr.length; i7++) {
                        if (g7.a(xVar, i7)) {
                        }
                    }
                    if (c0599c03 == c0599c02) {
                        z8 = false;
                    }
                }
            }
            C0603e0 c0603e02 = this.f9514H;
            if (z8) {
                C0599c0 c0599c04 = c0603e02.f9953h;
                boolean l7 = c0603e02.l(c0599c04);
                boolean[] zArr = new boolean[this.f9537q.length];
                long a7 = c0599c04.a(g7, this.f9519M.f10057r, l7, zArr);
                p0 p0Var = this.f9519M;
                if (p0Var.f10046e != 4 && a7 != p0Var.f10057r) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                p0 p0Var2 = this.f9519M;
                this.f9519M = n(p0Var2.f10044b, a7, p0Var2.f10045c, p0Var2.d, z7, 5);
                if (z7) {
                    E(a7);
                }
                boolean[] zArr2 = new boolean[this.f9537q.length];
                int i8 = 0;
                while (true) {
                    AbstractC0600d[] abstractC0600dArr = this.f9537q;
                    if (i8 >= abstractC0600dArr.length) {
                        break;
                    }
                    AbstractC0600d abstractC0600d = abstractC0600dArr[i8];
                    boolean p3 = p(abstractC0600d);
                    zArr2[i8] = p3;
                    H2.d0 d0Var = c0599c04.f9917c[i8];
                    if (p3) {
                        if (d0Var != abstractC0600d.f9938x) {
                            b(abstractC0600d);
                        } else if (zArr[i8]) {
                            long j7 = this.f9532a0;
                            abstractC0600d.f9928B = false;
                            abstractC0600d.f9927A = j7;
                            abstractC0600d.n(false, j7);
                            i8++;
                        }
                    }
                    i8++;
                }
                d(zArr2);
            } else {
                c0603e02.l(c0599c03);
                if (c0599c03.d) {
                    c0599c03.a(g7, Math.max(c0599c03.f.f9942b, this.f9532a0 - c0599c03.f9926o), false, new boolean[c0599c03.f9921i.length]);
                }
            }
            j(true);
            if (this.f9519M.f10046e != 4) {
                r();
                e0();
                this.f9544x.d(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Type inference failed for: r6v17, types: [H2.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C0591H.C(boolean, boolean, boolean, boolean):void");
    }

    public final void D() {
        boolean z7;
        C0599c0 c0599c0 = this.f9514H.f9953h;
        if (c0599c0 != null && c0599c0.f.f9946h && this.f9522P) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f9523Q = z7;
    }

    public final void E(long j7) {
        C0603e0 c0603e0;
        long j8;
        AbstractC0600d[] abstractC0600dArr;
        W2.q[] qVarArr;
        C0599c0 c0599c0 = this.f9514H.f9953h;
        if (c0599c0 == null) {
            j8 = 1000000000000L;
        } else {
            j8 = c0599c0.f9926o;
        }
        long j9 = j7 + j8;
        this.f9532a0 = j9;
        ((Z2.A) this.f9511D.f6157s).c(j9);
        for (AbstractC0600d abstractC0600d : this.f9537q) {
            if (p(abstractC0600d)) {
                long j10 = this.f9532a0;
                abstractC0600d.f9928B = false;
                abstractC0600d.f9927A = j10;
                abstractC0600d.n(false, j10);
            }
        }
        for (C0599c0 c0599c02 = c0603e0.f9953h; c0599c02 != null; c0599c02 = c0599c02.f9924l) {
            for (W2.q qVar : c0599c02.n.f3934c) {
                if (qVar != null) {
                    qVar.m();
                }
            }
        }
    }

    public final void F(J0 j02, J0 j03) {
        if (j02.q() && j03.q()) {
            return;
        }
        ArrayList arrayList = this.f9512E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC0515y1.v(arrayList.get(size));
            throw null;
        }
    }

    public final void I(boolean z7) {
        H2.A a7 = this.f9514H.f9953h.f.f9941a;
        long K6 = K(a7, this.f9519M.f10057r, true, false);
        if (K6 != this.f9519M.f10057r) {
            p0 p0Var = this.f9519M;
            this.f9519M = n(a7, K6, p0Var.f10045c, p0Var.d, z7, 5);
        }
    }

    public final void J(C0590G c0590g) {
        long j7;
        boolean z7;
        long j8;
        long j9;
        boolean z8;
        H2.A a7;
        long j10;
        long j11;
        long j12;
        boolean z9;
        boolean z10;
        long j13;
        long j14;
        p0 p0Var;
        int i7;
        boolean z11 = true;
        this.f9520N.a(1);
        Pair G6 = G(this.f9519M.f10043a, c0590g, true, this.f9526T, this.f9527U, this.f9508A, this.f9509B);
        if (G6 == null) {
            Pair f = f(this.f9519M.f10043a);
            a7 = (H2.A) f.first;
            long longValue = ((Long) f.second).longValue();
            z8 = !this.f9519M.f10043a.q();
            j8 = longValue;
            j9 = -9223372036854775807L;
        } else {
            Object obj = G6.first;
            long longValue2 = ((Long) G6.second).longValue();
            if (c0590g.f9507c == -9223372036854775807L) {
                j7 = -9223372036854775807L;
            } else {
                j7 = longValue2;
            }
            H2.A n = this.f9514H.n(this.f9519M.f10043a, obj, longValue2);
            if (n.a()) {
                this.f9519M.f10043a.h(n.f1180a, this.f9509B);
                if (this.f9509B.f(n.f1181b) == n.f1182c) {
                    j10 = this.f9509B.f9558w.f1239s;
                } else {
                    j10 = 0;
                }
                j8 = j10;
                j9 = j7;
                a7 = n;
                z8 = true;
            } else {
                if (c0590g.f9507c == -9223372036854775807L) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                j8 = longValue2;
                j9 = j7;
                z8 = z7;
                a7 = n;
            }
        }
        try {
            if (this.f9519M.f10043a.q()) {
                this.f9531Z = c0590g;
            } else if (G6 == null) {
                if (this.f9519M.f10046e != 1) {
                    W(4);
                }
                C(false, true, false, true);
            } else {
                if (a7.equals(this.f9519M.f10044b)) {
                    C0599c0 c0599c0 = this.f9514H.f9953h;
                    if (c0599c0 != null && c0599c0.d && j8 != 0) {
                        j14 = c0599c0.f9915a.u(j8, this.f9518L);
                    } else {
                        j14 = j8;
                    }
                    if (Z2.H.S(j14) == Z2.H.S(this.f9519M.f10057r) && ((i7 = (p0Var = this.f9519M).f10046e) == 2 || i7 == 3)) {
                        long j15 = p0Var.f10057r;
                        this.f9519M = n(a7, j15, j9, j15, z8, 2);
                        return;
                    }
                    j12 = j14;
                } else {
                    j12 = j8;
                }
                if (this.f9519M.f10046e == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C0603e0 c0603e0 = this.f9514H;
                if (c0603e0.f9953h != c0603e0.f9954i) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long K6 = K(a7, j12, z10, z9);
                if (j8 == K6) {
                    z11 = false;
                }
                z8 |= z11;
                try {
                    p0 p0Var2 = this.f9519M;
                    J0 j02 = p0Var2.f10043a;
                    f0(j02, a7, j02, p0Var2.f10044b, j9, true);
                    j13 = K6;
                    this.f9519M = n(a7, j13, j9, j13, z8, 2);
                } catch (Throwable th) {
                    th = th;
                    j11 = K6;
                    this.f9519M = n(a7, j11, j9, j11, z8, 2);
                    throw th;
                }
            }
            j13 = j8;
            this.f9519M = n(a7, j13, j9, j13, z8, 2);
        } catch (Throwable th2) {
            th = th2;
            j11 = j8;
        }
    }

    public final long K(H2.A a7, long j7, boolean z7, boolean z8) {
        b0();
        this.f9524R = false;
        if (z8 || this.f9519M.f10046e == 3) {
            W(2);
        }
        C0603e0 c0603e0 = this.f9514H;
        C0599c0 c0599c0 = c0603e0.f9953h;
        C0599c0 c0599c02 = c0599c0;
        while (c0599c02 != null && !a7.equals(c0599c02.f.f9941a)) {
            c0599c02 = c0599c02.f9924l;
        }
        if (z7 || c0599c0 != c0599c02 || (c0599c02 != null && c0599c02.f9926o + j7 < 0)) {
            AbstractC0600d[] abstractC0600dArr = this.f9537q;
            for (AbstractC0600d abstractC0600d : abstractC0600dArr) {
                b(abstractC0600d);
            }
            if (c0599c02 != null) {
                while (c0603e0.f9953h != c0599c02) {
                    c0603e0.a();
                }
                c0603e0.l(c0599c02);
                c0599c02.f9926o = 1000000000000L;
                d(new boolean[abstractC0600dArr.length]);
            }
        }
        if (c0599c02 != null) {
            c0603e0.l(c0599c02);
            if (!c0599c02.d) {
                c0599c02.f = c0599c02.f.b(j7);
            } else if (c0599c02.f9918e) {
                InterfaceC0022x interfaceC0022x = c0599c02.f9915a;
                j7 = interfaceC0022x.v(j7);
                interfaceC0022x.w(j7 - this.f9510C);
            }
            E(j7);
            r();
        } else {
            c0603e0.b();
            E(j7);
        }
        j(false);
        this.f9544x.d(2);
        return j7;
    }

    public final void L(x0 x0Var) {
        Looper looper = x0Var.f;
        if (!looper.getThread().isAlive()) {
            AbstractC0156a.K("TAG", "Trying to send message on a dead thread.");
            x0Var.b(false);
            return;
        }
        this.F.a(looper, null).c(new A4.d(this, 11, x0Var));
    }

    public final void N(boolean z7, AtomicBoolean atomicBoolean) {
        AbstractC0600d[] abstractC0600dArr;
        if (this.f9528V != z7) {
            this.f9528V = z7;
            if (!z7) {
                for (AbstractC0600d abstractC0600d : this.f9537q) {
                    if (!p(abstractC0600d) && this.f9538r.remove(abstractC0600d)) {
                        abstractC0600d.w();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(C0587D c0587d) {
        this.f9520N.a(1);
        int i7 = c0587d.f9482c;
        H2.g0 g0Var = c0587d.f9481b;
        List list = c0587d.f9480a;
        if (i7 != -1) {
            this.f9531Z = new C0590G(new z0(list, g0Var), c0587d.f9482c, c0587d.d);
        }
        J3.m mVar = this.f9515I;
        ArrayList arrayList = (ArrayList) mVar.f1396c;
        mVar.i(0, arrayList.size());
        k(mVar.a(arrayList.size(), list, g0Var), false);
    }

    public final void P(boolean z7) {
        if (z7 == this.f9529X) {
            return;
        }
        this.f9529X = z7;
        if (!z7 && this.f9519M.f10054o) {
            this.f9544x.d(2);
        }
    }

    public final void Q(boolean z7) {
        this.f9522P = z7;
        D();
        if (this.f9523Q) {
            C0603e0 c0603e0 = this.f9514H;
            if (c0603e0.f9954i != c0603e0.f9953h) {
                I(true);
                j(false);
            }
        }
    }

    public final void R(int i7, int i8, boolean z7, boolean z8) {
        W2.q[] qVarArr;
        this.f9520N.a(z8 ? 1 : 0);
        C0588E c0588e = this.f9520N;
        c0588e.f9486a = true;
        c0588e.f = true;
        c0588e.f9490g = i8;
        this.f9519M = this.f9519M.d(i7, z7);
        this.f9524R = false;
        for (C0599c0 c0599c0 = this.f9514H.f9953h; c0599c0 != null; c0599c0 = c0599c0.f9924l) {
            for (W2.q qVar : c0599c0.n.f3934c) {
                if (qVar != null) {
                    qVar.d(z7);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i9 = this.f9519M.f10046e;
        Z2.D d = this.f9544x;
        if (i9 == 3) {
            Z();
        } else if (i9 != 2) {
            return;
        }
        d.d(2);
    }

    public final void S(q0 q0Var) {
        this.f9544x.f4597a.removeMessages(16);
        androidx.leanback.app.C c5 = this.f9511D;
        c5.b(q0Var);
        q0 a7 = c5.a();
        m(a7, a7.f10063q, true, true);
    }

    public final void T(int i7) {
        this.f9526T = i7;
        J0 j02 = this.f9519M.f10043a;
        C0603e0 c0603e0 = this.f9514H;
        c0603e0.f = i7;
        if (!c0603e0.o(j02)) {
            I(true);
        }
        j(false);
    }

    public final void U(boolean z7) {
        this.f9527U = z7;
        J0 j02 = this.f9519M.f10043a;
        C0603e0 c0603e0 = this.f9514H;
        c0603e0.f9952g = z7;
        if (!c0603e0.o(j02)) {
            I(true);
        }
        j(false);
    }

    public final void V(H2.g0 g0Var) {
        this.f9520N.a(1);
        J3.m mVar = this.f9515I;
        int size = ((ArrayList) mVar.f1396c).size();
        if (g0Var.f1064b.length != size) {
            g0Var = new H2.g0(new Random(g0Var.f1063a.nextLong())).a(size);
        }
        mVar.f1402k = g0Var;
        k(mVar.c(), false);
    }

    public final void W(int i7) {
        p0 p0Var = this.f9519M;
        if (p0Var.f10046e != i7) {
            if (i7 != 2) {
                this.f9536e0 = -9223372036854775807L;
            }
            this.f9519M = p0Var.g(i7);
        }
    }

    public final boolean X() {
        p0 p0Var = this.f9519M;
        if (p0Var.f10052l && p0Var.f10053m == 0) {
            return true;
        }
        return false;
    }

    public final boolean Y(J0 j02, H2.A a7) {
        if (a7.a() || j02.q()) {
            return false;
        }
        int i7 = j02.h(a7.f1180a, this.f9509B).f9554s;
        I0 i02 = this.f9508A;
        j02.o(i7, i02);
        if (!i02.a() || !i02.f9590y || i02.f9587v == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final void Z() {
        AbstractC0600d[] abstractC0600dArr;
        boolean z7;
        this.f9524R = false;
        androidx.leanback.app.C c5 = this.f9511D;
        c5.f6156r = true;
        ((Z2.A) c5.f6157s).e();
        for (AbstractC0600d abstractC0600d : this.f9537q) {
            if (p(abstractC0600d)) {
                if (abstractC0600d.f9937w == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.k(z7);
                abstractC0600d.f9937w = 2;
                abstractC0600d.q();
            }
        }
    }

    public final void a(C0587D c0587d, int i7) {
        this.f9520N.a(1);
        J3.m mVar = this.f9515I;
        if (i7 == -1) {
            i7 = ((ArrayList) mVar.f1396c).size();
        }
        k(mVar.a(i7, c0587d.f9480a, c0587d.f9481b), false);
    }

    public final void a0(boolean z7, boolean z8) {
        boolean z9;
        if (!z7 && this.f9528V) {
            z9 = false;
        } else {
            z9 = true;
        }
        C(z9, false, true, false);
        this.f9520N.a(z8 ? 1 : 0);
        this.f9542v.b(true);
        W(1);
    }

    public final void b(AbstractC0600d abstractC0600d) {
        boolean z7;
        boolean z8;
        if (!p(abstractC0600d)) {
            return;
        }
        androidx.leanback.app.C c5 = this.f9511D;
        if (abstractC0600d == ((AbstractC0600d) c5.f6159u)) {
            c5.f6160v = null;
            c5.f6159u = null;
            c5.f6155q = true;
        }
        int i7 = abstractC0600d.f9937w;
        if (i7 == 2) {
            if (i7 == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC0156a.k(z8);
            abstractC0600d.f9937w = 1;
            abstractC0600d.r();
        }
        if (abstractC0600d.f9937w == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        abstractC0600d.f9933s.d();
        abstractC0600d.f9937w = 0;
        abstractC0600d.f9938x = null;
        abstractC0600d.f9939y = null;
        abstractC0600d.f9928B = false;
        abstractC0600d.l();
        this.f9530Y--;
    }

    public final void b0() {
        AbstractC0600d[] abstractC0600dArr;
        int i7;
        boolean z7;
        androidx.leanback.app.C c5 = this.f9511D;
        c5.f6156r = false;
        Z2.A a7 = (Z2.A) c5.f6157s;
        if (a7.f4590r) {
            a7.c(a7.d());
            a7.f4590r = false;
        }
        for (AbstractC0600d abstractC0600d : this.f9537q) {
            if (p(abstractC0600d) && (i7 = abstractC0600d.f9937w) == 2) {
                if (i7 == 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.k(z7);
                abstractC0600d.f9937w = 1;
                abstractC0600d.r();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:289:0x0477, code lost:
        if (q() != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x052f, code lost:
        if (r0 >= r7.f9985h) goto L247;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x02eb A[EDGE_INSN: B:444:0x02eb->B:182:0x02eb ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C0591H.c():void");
    }

    public final void c0() {
        boolean z7;
        C0599c0 c0599c0 = this.f9514H.f9955j;
        if (!this.f9525S && (c0599c0 == null || !c0599c0.f9915a.a())) {
            z7 = false;
        } else {
            z7 = true;
        }
        boolean z8 = z7;
        p0 p0Var = this.f9519M;
        if (z8 != p0Var.f10047g) {
            this.f9519M = new p0(p0Var.f10043a, p0Var.f10044b, p0Var.f10045c, p0Var.d, p0Var.f10046e, p0Var.f, z8, p0Var.f10048h, p0Var.f10049i, p0Var.f10050j, p0Var.f10051k, p0Var.f10052l, p0Var.f10053m, p0Var.n, p0Var.f10055p, p0Var.f10056q, p0Var.f10057r, p0Var.f10058s, p0Var.f10054o);
        }
    }

    public final void d(boolean[] zArr) {
        AbstractC0600d[] abstractC0600dArr;
        Set set;
        C0603e0 c0603e0;
        C0599c0 c0599c0;
        int i7;
        AbstractC0600d[] abstractC0600dArr2;
        boolean z7;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Z2.q qVar;
        C0603e0 c0603e02 = this.f9514H;
        C0599c0 c0599c02 = c0603e02.f9954i;
        W2.x xVar = c0599c02.n;
        int i9 = 0;
        while (true) {
            abstractC0600dArr = this.f9537q;
            int length = abstractC0600dArr.length;
            set = this.f9538r;
            if (i9 >= length) {
                break;
            }
            if (!xVar.b(i9) && set.remove(abstractC0600dArr[i9])) {
                abstractC0600dArr[i9].w();
            }
            i9++;
        }
        int i10 = 0;
        while (i10 < abstractC0600dArr.length) {
            if (xVar.b(i10)) {
                boolean z12 = zArr[i10];
                AbstractC0600d abstractC0600d = abstractC0600dArr[i10];
                if (!p(abstractC0600d)) {
                    C0599c0 c0599c03 = c0603e02.f9954i;
                    if (c0599c03 == c0603e02.f9953h) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    W2.x xVar2 = c0599c03.n;
                    C0 c02 = xVar2.f3933b[i10];
                    W2.q qVar2 = xVar2.f3934c[i10];
                    if (qVar2 != null) {
                        i8 = qVar2.length();
                    } else {
                        i8 = 0;
                    }
                    K[] kArr = new K[i8];
                    for (int i11 = 0; i11 < i8; i11++) {
                        kArr[i11] = qVar2.h(i11);
                    }
                    if (X() && this.f9519M.f10046e == 3) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z12 && z8) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.f9530Y++;
                    set.add(abstractC0600d);
                    H2.d0 d0Var = c0599c03.f9917c[i10];
                    c0603e0 = c0603e02;
                    c0599c0 = c0599c02;
                    long j7 = this.f9532a0;
                    long e3 = c0599c03.e();
                    i7 = i10;
                    abstractC0600dArr2 = abstractC0600dArr;
                    long j8 = c0599c03.f9926o;
                    if (abstractC0600d.f9937w == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AbstractC0156a.k(z10);
                    abstractC0600d.f9934t = c02;
                    abstractC0600d.f9937w = 1;
                    abstractC0600d.m(z9, z7);
                    abstractC0600d.v(kArr, d0Var, e3, j8);
                    abstractC0600d.f9928B = false;
                    abstractC0600d.f9927A = j7;
                    abstractC0600d.n(z9, j7);
                    abstractC0600d.c(11, new C0586C(this));
                    androidx.leanback.app.C c5 = this.f9511D;
                    c5.getClass();
                    Z2.q g7 = abstractC0600d.g();
                    if (g7 != null && g7 != (qVar = (Z2.q) c5.f6160v)) {
                        if (qVar == null) {
                            c5.f6160v = g7;
                            c5.f6159u = abstractC0600d;
                            ((g2.N) g7).b((q0) ((Z2.A) c5.f6157s).f4593u);
                        } else {
                            throw new C0616l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z8) {
                        if (abstractC0600d.f9937w == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        AbstractC0156a.k(z11);
                        abstractC0600d.f9937w = 2;
                        abstractC0600d.q();
                    }
                    i10 = i7 + 1;
                    c0603e02 = c0603e0;
                    c0599c02 = c0599c0;
                    abstractC0600dArr = abstractC0600dArr2;
                }
            }
            c0603e0 = c0603e02;
            c0599c0 = c0599c02;
            i7 = i10;
            abstractC0600dArr2 = abstractC0600dArr;
            i10 = i7 + 1;
            c0603e02 = c0603e0;
            c0599c02 = c0599c0;
            abstractC0600dArr = abstractC0600dArr2;
        }
        c0599c02.f9919g = true;
    }

    public final void d0(W2.x xVar) {
        J0 j02 = this.f9519M.f10043a;
        W2.q[] qVarArr = xVar.f3934c;
        C0610i c0610i = this.f9542v;
        int i7 = c0610i.f;
        if (i7 == -1) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                AbstractC0600d[] abstractC0600dArr = this.f9537q;
                int i10 = 13107200;
                if (i8 < abstractC0600dArr.length) {
                    if (qVarArr[i8] != null) {
                        switch (abstractC0600dArr[i8].f9932r) {
                            case -2:
                                i10 = 0;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i10 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i10 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                i10 = 131072;
                                break;
                        }
                        i9 += i10;
                    }
                    i8++;
                } else {
                    i7 = Math.max(13107200, i9);
                }
            }
        }
        c0610i.f9985h = i7;
        c0610i.f9980a.a(i7);
    }

    public final long e(J0 j02, Object obj, long j7) {
        long elapsedRealtime;
        H0 h02 = this.f9509B;
        int i7 = j02.h(obj, h02).f9554s;
        I0 i02 = this.f9508A;
        j02.o(i7, i02);
        if (i02.f9587v == -9223372036854775807L || !i02.a() || !i02.f9590y) {
            return -9223372036854775807L;
        }
        long j8 = i02.f9588w;
        int i8 = Z2.H.f4603a;
        if (j8 == -9223372036854775807L) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = j8 + SystemClock.elapsedRealtime();
        }
        return Z2.H.J(elapsedRealtime - i02.f9587v) - (j7 + h02.f9556u);
    }

    public final void e0() {
        long j7;
        boolean z7;
        long max;
        long max2;
        long j8;
        float f;
        C0599c0 c0599c0 = this.f9514H.f9953h;
        if (c0599c0 == null) {
            return;
        }
        if (c0599c0.d) {
            j7 = c0599c0.f9915a.B();
        } else {
            j7 = -9223372036854775807L;
        }
        if (j7 != -9223372036854775807L) {
            E(j7);
            if (j7 != this.f9519M.f10057r) {
                p0 p0Var = this.f9519M;
                this.f9519M = n(p0Var.f10044b, j7, p0Var.f10045c, j7, true, 5);
            }
        } else {
            androidx.leanback.app.C c5 = this.f9511D;
            if (c0599c0 != this.f9514H.f9954i) {
                z7 = true;
            } else {
                z7 = false;
            }
            AbstractC0600d abstractC0600d = (AbstractC0600d) c5.f6159u;
            Z2.A a7 = (Z2.A) c5.f6157s;
            if (abstractC0600d != null && !abstractC0600d.j() && (((AbstractC0600d) c5.f6159u).k() || (!z7 && !((AbstractC0600d) c5.f6159u).i()))) {
                Z2.q qVar = (Z2.q) c5.f6160v;
                qVar.getClass();
                long d = qVar.d();
                if (c5.f6155q) {
                    if (d < a7.d()) {
                        if (a7.f4590r) {
                            a7.c(a7.d());
                            a7.f4590r = false;
                        }
                    } else {
                        c5.f6155q = false;
                        if (c5.f6156r) {
                            a7.e();
                        }
                    }
                }
                a7.c(d);
                q0 a8 = qVar.a();
                if (!a8.equals((q0) a7.f4593u)) {
                    a7.b(a8);
                    ((C0591H) c5.f6158t).f9544x.a(16, a8).b();
                }
            } else {
                c5.f6155q = true;
                if (c5.f6156r) {
                    a7.e();
                }
            }
            long d7 = c5.d();
            this.f9532a0 = d7;
            long j9 = d7 - c0599c0.f9926o;
            long j10 = this.f9519M.f10057r;
            if (!this.f9512E.isEmpty() && !this.f9519M.f10044b.a()) {
                if (this.f9534c0) {
                    this.f9534c0 = false;
                }
                p0 p0Var2 = this.f9519M;
                p0Var2.f10043a.b(p0Var2.f10044b.f1180a);
                int min = Math.min(this.f9533b0, this.f9512E.size());
                if (min > 0) {
                    AbstractC0515y1.v(this.f9512E.get(min - 1));
                }
                if (min < this.f9512E.size()) {
                    AbstractC0515y1.v(this.f9512E.get(min));
                }
                this.f9533b0 = min;
            }
            p0 p0Var3 = this.f9519M;
            p0Var3.f10057r = j9;
            p0Var3.f10058s = SystemClock.elapsedRealtime();
        }
        this.f9519M.f10055p = this.f9514H.f9955j.d();
        p0 p0Var4 = this.f9519M;
        long j11 = p0Var4.f10055p;
        C0599c0 c0599c02 = this.f9514H.f9955j;
        long j12 = 0;
        if (c0599c02 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j11 - (this.f9532a0 - c0599c02.f9926o));
        }
        p0Var4.f10056q = max;
        p0 p0Var5 = this.f9519M;
        if (p0Var5.f10052l && p0Var5.f10046e == 3 && Y(p0Var5.f10043a, p0Var5.f10044b)) {
            p0 p0Var6 = this.f9519M;
            float f7 = 1.0f;
            if (p0Var6.n.f10063q == 1.0f) {
                C0608h c0608h = this.f9516J;
                long e3 = e(p0Var6.f10043a, p0Var6.f10044b.f1180a, p0Var6.f10057r);
                long j13 = this.f9519M.f10055p;
                C0599c0 c0599c03 = this.f9514H.f9955j;
                if (c0599c03 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0L, j13 - (this.f9532a0 - c0599c03.f9926o));
                }
                if (c0608h.d != -9223372036854775807L) {
                    long j14 = e3 - max2;
                    if (c0608h.n == -9223372036854775807L) {
                        c0608h.n = j14;
                    } else {
                        float f8 = c0608h.f9966c;
                        long max3 = Math.max(j14, (((float) j14) * f) + (((float) j8) * f8));
                        c0608h.n = max3;
                        j12 = ((1.0f - f8) * ((float) Math.abs(j14 - max3))) + (f8 * ((float) c0608h.f9975o));
                    }
                    c0608h.f9975o = j12;
                    if (c0608h.f9974m == -9223372036854775807L || SystemClock.elapsedRealtime() - c0608h.f9974m >= 1000) {
                        c0608h.f9974m = SystemClock.elapsedRealtime();
                        long j15 = (c0608h.f9975o * 3) + c0608h.n;
                        if (c0608h.f9970i > j15) {
                            float J6 = (float) Z2.H.J(1000L);
                            long[] jArr = {j15, c0608h.f, c0608h.f9970i - (((c0608h.f9973l - 1.0f) * J6) + ((c0608h.f9971j - 1.0f) * J6))};
                            long j16 = jArr[0];
                            for (int i7 = 1; i7 < 3; i7++) {
                                long j17 = jArr[i7];
                                if (j17 > j16) {
                                    j16 = j17;
                                }
                            }
                            c0608h.f9970i = j16;
                        } else {
                            long k5 = Z2.H.k(e3 - (Math.max(0.0f, c0608h.f9973l - 1.0f) / 1.0E-7f), c0608h.f9970i, j15);
                            c0608h.f9970i = k5;
                            long j18 = c0608h.f9969h;
                            if (j18 != -9223372036854775807L && k5 > j18) {
                                c0608h.f9970i = j18;
                            }
                        }
                        long j19 = e3 - c0608h.f9970i;
                        if (Math.abs(j19) < c0608h.f9964a) {
                            c0608h.f9973l = 1.0f;
                        } else {
                            c0608h.f9973l = Z2.H.i((1.0E-7f * ((float) j19)) + 1.0f, c0608h.f9972k, c0608h.f9971j);
                        }
                    }
                    f7 = c0608h.f9973l;
                }
                if (this.f9511D.a().f10063q != f7) {
                    q0 q0Var = new q0(f7, this.f9519M.n.f10064r);
                    this.f9544x.f4597a.removeMessages(16);
                    this.f9511D.b(q0Var);
                    m(this.f9519M.n, this.f9511D.a().f10063q, false, false);
                }
            }
        }
    }

    public final Pair f(J0 j02) {
        long j7 = 0;
        if (j02.q()) {
            return Pair.create(p0.f10042t, 0L);
        }
        int a7 = j02.a(this.f9527U);
        Pair j8 = j02.j(this.f9508A, this.f9509B, a7, -9223372036854775807L);
        H2.A n = this.f9514H.n(j02, j8.first, 0L);
        long longValue = ((Long) j8.second).longValue();
        if (n.a()) {
            Object obj = n.f1180a;
            H0 h02 = this.f9509B;
            j02.h(obj, h02);
            if (n.f1182c == h02.f(n.f1181b)) {
                j7 = h02.f9558w.f1239s;
            }
            longValue = j7;
        }
        return Pair.create(n, Long.valueOf(longValue));
    }

    public final void f0(J0 j02, H2.A a7, J0 j03, H2.A a8, long j7, boolean z7) {
        Object obj;
        q0 q0Var;
        if (!Y(j02, a7)) {
            if (a7.a()) {
                q0Var = q0.f10062t;
            } else {
                q0Var = this.f9519M.n;
            }
            androidx.leanback.app.C c5 = this.f9511D;
            if (!c5.a().equals(q0Var)) {
                this.f9544x.f4597a.removeMessages(16);
                c5.b(q0Var);
                m(this.f9519M.n, q0Var.f10063q, false, false);
                return;
            }
            return;
        }
        Object obj2 = a7.f1180a;
        H0 h02 = this.f9509B;
        int i7 = j02.h(obj2, h02).f9554s;
        I0 i02 = this.f9508A;
        j02.o(i7, i02);
        T t5 = i02.f9576A;
        int i8 = Z2.H.f4603a;
        C0608h c0608h = this.f9516J;
        c0608h.getClass();
        c0608h.d = Z2.H.J(t5.f9749q);
        c0608h.f9968g = Z2.H.J(t5.f9750r);
        c0608h.f9969h = Z2.H.J(t5.f9751s);
        float f = t5.f9752t;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        c0608h.f9972k = f;
        float f7 = t5.f9753u;
        if (f7 == -3.4028235E38f) {
            f7 = 1.03f;
        }
        c0608h.f9971j = f7;
        if (f == 1.0f && f7 == 1.0f) {
            c0608h.d = -9223372036854775807L;
        }
        c0608h.a();
        if (j7 != -9223372036854775807L) {
            c0608h.f9967e = e(j02, obj2, j7);
        } else {
            Object obj3 = i02.f9582q;
            if (!j03.q()) {
                obj = j03.n(j03.h(a8.f1180a, h02).f9554s, i02, 0L).f9582q;
            } else {
                obj = null;
            }
            if (!Z2.H.a(obj, obj3) || z7) {
                c0608h.f9967e = -9223372036854775807L;
            } else {
                return;
            }
        }
        c0608h.a();
    }

    public final void g(InterfaceC0022x interfaceC0022x) {
        boolean z7;
        C0599c0 c0599c0 = this.f9514H.f9955j;
        if (c0599c0 != null && c0599c0.f9915a == interfaceC0022x) {
            long j7 = this.f9532a0;
            if (c0599c0 != null) {
                if (c0599c0.f9924l == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.k(z7);
                if (c0599c0.d) {
                    c0599c0.f9915a.G(j7 - c0599c0.f9926o);
                }
            }
            r();
        }
    }

    public final synchronized void g0(C0012m c0012m, long j7) {
        this.F.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j7;
        boolean z7 = false;
        while (!((Boolean) c0012m.get()).booleanValue() && j7 > 0) {
            try {
                this.F.getClass();
                wait(j7);
            } catch (InterruptedException unused) {
                z7 = true;
            }
            this.F.getClass();
            j7 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // H2.e0
    public final void h(H2.f0 f0Var) {
        this.f9544x.a(9, (InterfaceC0022x) f0Var).b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        p0 e3;
        IOException iOException;
        int i7;
        int i8;
        C0599c0 c0599c0;
        C0599c0 c0599c02;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i9 = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    R(message.arg2, 1, z7, true);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    J((C0590G) message.obj);
                    break;
                case 4:
                    S((q0) message.obj);
                    break;
                case 5:
                    this.f9518L = (D0) message.obj;
                    break;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    a0(false, true);
                    break;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    y();
                    return true;
                case 8:
                    l((InterfaceC0022x) message.obj);
                    break;
                case 9:
                    g((InterfaceC0022x) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    U(z8);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    N(z9, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    x0 x0Var = (x0) message.obj;
                    x0Var.getClass();
                    Looper looper = x0Var.f;
                    Looper looper2 = this.f9546z;
                    Z2.D d = this.f9544x;
                    if (looper == looper2) {
                        synchronized (x0Var) {
                        }
                        try {
                            x0Var.f10088a.c(x0Var.d, x0Var.f10091e);
                            x0Var.b(true);
                            int i10 = this.f9519M.f10046e;
                            if (i10 == 3 || i10 == 2) {
                                d.d(2);
                                break;
                            }
                        } catch (Throwable th) {
                            x0Var.b(true);
                            throw th;
                        }
                    } else {
                        d.a(15, x0Var).b();
                        break;
                    }
                case 15:
                    L((x0) message.obj);
                    break;
                case 16:
                    q0 q0Var = (q0) message.obj;
                    m(q0Var, q0Var.f10063q, true, false);
                    break;
                case 17:
                    O((C0587D) message.obj);
                    break;
                case 18:
                    a((C0587D) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC0515y1.v(message.obj);
                    v();
                    throw null;
                case 20:
                    A(message.arg1, message.arg2, (H2.g0) message.obj);
                    break;
                case 21:
                    V((H2.g0) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Q(z10);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    P(z11);
                    break;
                case 25:
                    B();
                    I(true);
                    break;
                case 26:
                    B();
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (C0001b e7) {
            iOException = e7;
            i7 = 1002;
            i(iOException, i7);
        } catch (C0145n e8) {
            C0145n c0145n = e8;
            i7 = c0145n.f4407q;
            iOException = c0145n;
            i(iOException, i7);
        } catch (C0616l e9) {
            C0616l c0616l = e9;
            int i11 = c0616l.f10004s;
            C0603e0 c0603e0 = this.f9514H;
            if (i11 == 1 && (c0599c02 = c0603e0.f9954i) != null) {
                c0616l = c0616l.a(c0599c02.f.f9941a);
            }
            if (c0616l.f10010y && this.f9535d0 == null) {
                AbstractC0156a.L("ExoPlayerImplInternal", "Recoverable renderer error", c0616l);
                this.f9535d0 = c0616l;
                Z2.D d7 = this.f9544x;
                Z2.C a7 = d7.a(25, c0616l);
                d7.getClass();
                Message message2 = a7.f4595a;
                message2.getClass();
                d7.f4597a.sendMessageAtFrontOfQueue(message2);
                a7.a();
            } else {
                C0616l c0616l2 = this.f9535d0;
                if (c0616l2 != null) {
                    c0616l2.addSuppressed(c0616l);
                    c0616l = this.f9535d0;
                }
                C0616l c0616l3 = c0616l;
                AbstractC0156a.r("ExoPlayerImplInternal", "Playback error", c0616l3);
                if (c0616l3.f10004s == 1 && c0603e0.f9953h != c0603e0.f9954i) {
                    while (true) {
                        c0599c0 = c0603e0.f9953h;
                        if (c0599c0 == c0603e0.f9954i) {
                            break;
                        }
                        c0603e0.a();
                    }
                    c0599c0.getClass();
                    C0601d0 c0601d0 = c0599c0.f;
                    H2.A a8 = c0601d0.f9941a;
                    long j7 = c0601d0.f9942b;
                    this.f9519M = n(a8, j7, c0601d0.f9943c, j7, true, 0);
                }
                a0(true, false);
                e3 = this.f9519M.e(c0616l3);
                this.f9519M = e3;
            }
        } catch (m0 e10) {
            boolean z12 = e10.f10017q;
            int i12 = e10.f10018r;
            if (i12 == 1) {
                if (z12) {
                    i8 = 3001;
                } else {
                    i8 = 3003;
                }
            } else {
                if (i12 == 4) {
                    if (z12) {
                        i8 = 3002;
                    } else {
                        i8 = 3004;
                    }
                }
                i(e10, i9);
            }
            i9 = i8;
            i(e10, i9);
        } catch (j2.j e11) {
            j2.j jVar = e11;
            i7 = jVar.f11827q;
            iOException = jVar;
            i(iOException, i7);
        } catch (IOException e12) {
            iOException = e12;
            i7 = 2000;
            i(iOException, i7);
        } catch (RuntimeException e13) {
            C0616l c0616l4 = new C0616l(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            AbstractC0156a.r("ExoPlayerImplInternal", "Playback error", c0616l4);
            a0(true, false);
            e3 = this.f9519M.e(c0616l4);
            this.f9519M = e3;
        }
        t();
        return true;
    }

    public final void i(IOException iOException, int i7) {
        C0616l c0616l = new C0616l(0, iOException, i7);
        C0599c0 c0599c0 = this.f9514H.f9953h;
        if (c0599c0 != null) {
            c0616l = c0616l.a(c0599c0.f.f9941a);
        }
        AbstractC0156a.r("ExoPlayerImplInternal", "Playback error", c0616l);
        a0(false, false);
        this.f9519M = this.f9519M.e(c0616l);
    }

    public final void j(boolean z7) {
        H2.A a7;
        long d;
        C0599c0 c0599c0 = this.f9514H.f9955j;
        if (c0599c0 == null) {
            a7 = this.f9519M.f10044b;
        } else {
            a7 = c0599c0.f.f9941a;
        }
        boolean z8 = !this.f9519M.f10051k.equals(a7);
        if (z8) {
            this.f9519M = this.f9519M.b(a7);
        }
        p0 p0Var = this.f9519M;
        if (c0599c0 == null) {
            d = p0Var.f10057r;
        } else {
            d = c0599c0.d();
        }
        p0Var.f10055p = d;
        p0 p0Var2 = this.f9519M;
        long j7 = p0Var2.f10055p;
        C0599c0 c0599c02 = this.f9514H.f9955j;
        long j8 = 0;
        if (c0599c02 != null) {
            j8 = Math.max(0L, j7 - (this.f9532a0 - c0599c02.f9926o));
        }
        p0Var2.f10056q = j8;
        if ((z8 || z7) && c0599c0 != null && c0599c0.d) {
            H2.A a8 = c0599c0.f.f9941a;
            d0(c0599c0.n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ee, code lost:
        if (r5.e(r6, r9) != 2) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f0, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01fe, code lost:
        if (r5.i(r3.f1181b) != false) goto L195;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e7 A[Catch: all -> 0x02ec, TryCatch #4 {all -> 0x02ec, blocks: (B:166:0x02e1, B:168:0x02e7, B:175:0x02fb, B:177:0x0306, B:179:0x030c, B:181:0x0316, B:182:0x0323, B:183:0x0326, B:187:0x0331), top: B:251:0x0280 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0433  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(e2.J0 r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C0591H.k(e2.J0, boolean):void");
    }

    public final void l(InterfaceC0022x interfaceC0022x) {
        C0603e0 c0603e0 = this.f9514H;
        C0599c0 c0599c0 = c0603e0.f9955j;
        if (c0599c0 != null && c0599c0.f9915a == interfaceC0022x) {
            float f = this.f9511D.a().f10063q;
            J0 j02 = this.f9519M.f10043a;
            c0599c0.d = true;
            c0599c0.f9925m = c0599c0.f9915a.g();
            W2.x g7 = c0599c0.g(f, j02);
            C0601d0 c0601d0 = c0599c0.f;
            long j7 = c0601d0.f9942b;
            long j8 = c0601d0.f9944e;
            if (j8 != -9223372036854775807L && j7 >= j8) {
                j7 = Math.max(0L, j8 - 1);
            }
            long a7 = c0599c0.a(g7, j7, false, new boolean[c0599c0.f9921i.length]);
            long j9 = c0599c0.f9926o;
            C0601d0 c0601d02 = c0599c0.f;
            c0599c0.f9926o = (c0601d02.f9942b - a7) + j9;
            c0599c0.f = c0601d02.b(a7);
            d0(c0599c0.n);
            if (c0599c0 == c0603e0.f9953h) {
                E(c0599c0.f.f9942b);
                d(new boolean[this.f9537q.length]);
                p0 p0Var = this.f9519M;
                H2.A a8 = p0Var.f10044b;
                long j10 = c0599c0.f.f9942b;
                this.f9519M = n(a8, j10, p0Var.f10045c, j10, false, 5);
            }
            r();
        }
    }

    public final void m(q0 q0Var, float f, boolean z7, boolean z8) {
        int i7;
        if (z7) {
            if (z8) {
                this.f9520N.a(1);
            }
            this.f9519M = this.f9519M.f(q0Var);
        }
        float f7 = q0Var.f10063q;
        C0599c0 c0599c0 = this.f9514H.f9953h;
        while (true) {
            i7 = 0;
            if (c0599c0 == null) {
                break;
            }
            W2.q[] qVarArr = c0599c0.n.f3934c;
            int length = qVarArr.length;
            while (i7 < length) {
                W2.q qVar = qVarArr[i7];
                if (qVar != null) {
                    qVar.j(f7);
                }
                i7++;
            }
            c0599c0 = c0599c0.f9924l;
        }
        AbstractC0600d[] abstractC0600dArr = this.f9537q;
        int length2 = abstractC0600dArr.length;
        while (i7 < length2) {
            AbstractC0600d abstractC0600d = abstractC0600dArr[i7];
            if (abstractC0600d != null) {
                abstractC0600d.x(f, q0Var.f10063q);
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [O3.y, O3.B] */
    public final p0 n(H2.A a7, long j7, long j8, long j9, boolean z7, int i7) {
        boolean z8;
        H2.n0 n0Var;
        W2.x xVar;
        O3.U u7;
        long max;
        H2.n0 n0Var2;
        W2.x xVar2;
        O3.U u8;
        int i8;
        boolean z9 = false;
        if (!this.f9534c0 && j7 == this.f9519M.f10057r && a7.equals(this.f9519M.f10044b)) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f9534c0 = z8;
        D();
        p0 p0Var = this.f9519M;
        H2.n0 n0Var3 = p0Var.f10048h;
        W2.x xVar3 = p0Var.f10049i;
        List list = p0Var.f10050j;
        if (this.f9515I.f1394a) {
            C0599c0 c0599c0 = this.f9514H.f9953h;
            if (c0599c0 == null) {
                n0Var2 = H2.n0.f1144t;
            } else {
                n0Var2 = c0599c0.f9925m;
            }
            if (c0599c0 == null) {
                xVar2 = this.f9541u;
            } else {
                xVar2 = c0599c0.n;
            }
            W2.q[] qVarArr = xVar2.f3934c;
            ?? abstractC0080y = new AbstractC0080y();
            int length = qVarArr.length;
            int i9 = 0;
            boolean z10 = false;
            while (i9 < length) {
                W2.q qVar = qVarArr[i9];
                if (qVar != null) {
                    C1461c c1461c = qVar.h(0).f9685z;
                    if (c1461c == null) {
                        abstractC0080y.a(new C1461c(new InterfaceC1460b[0]));
                    } else {
                        abstractC0080y.a(c1461c);
                        i8 = 1;
                        z10 = true;
                        i9 += i8;
                    }
                }
                i8 = 1;
                i9 += i8;
            }
            if (z10) {
                u8 = abstractC0080y.h();
            } else {
                O3.C c5 = O3.E.f2597r;
                u8 = O3.U.f2621u;
            }
            if (c0599c0 != null) {
                C0601d0 c0601d0 = c0599c0.f;
                if (c0601d0.f9943c != j8) {
                    c0599c0.f = c0601d0.a(j8);
                }
            }
            u7 = u8;
            n0Var = n0Var2;
            xVar = xVar2;
        } else if (!a7.equals(p0Var.f10044b)) {
            n0Var = H2.n0.f1144t;
            xVar = this.f9541u;
            u7 = O3.U.f2621u;
        } else {
            n0Var = n0Var3;
            xVar = xVar3;
            u7 = list;
        }
        if (z7) {
            C0588E c0588e = this.f9520N;
            if (c0588e.d && c0588e.f9489e != 5) {
                if (i7 == 5) {
                    z9 = true;
                }
                AbstractC0156a.f(z9);
            } else {
                c0588e.f9486a = true;
                c0588e.d = true;
                c0588e.f9489e = i7;
            }
        }
        p0 p0Var2 = this.f9519M;
        long j10 = p0Var2.f10055p;
        C0599c0 c0599c02 = this.f9514H.f9955j;
        if (c0599c02 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j10 - (this.f9532a0 - c0599c02.f9926o));
        }
        return p0Var2.c(a7, j7, j8, j9, max, n0Var, xVar, u7);
    }

    public final boolean o() {
        long z7;
        C0599c0 c0599c0 = this.f9514H.f9955j;
        if (c0599c0 == null) {
            return false;
        }
        if (!c0599c0.d) {
            z7 = 0;
        } else {
            z7 = c0599c0.f9915a.z();
        }
        if (z7 == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        C0599c0 c0599c0 = this.f9514H.f9953h;
        long j7 = c0599c0.f.f9944e;
        if (c0599c0.d && (j7 == -9223372036854775807L || this.f9519M.f10057r < j7 || !X())) {
            return true;
        }
        return false;
    }

    public final void r() {
        long z7;
        long max;
        boolean c5;
        boolean z8 = false;
        if (!o()) {
            c5 = false;
        } else {
            C0599c0 c0599c0 = this.f9514H.f9955j;
            if (!c0599c0.d) {
                z7 = 0;
            } else {
                z7 = c0599c0.f9915a.z();
            }
            C0599c0 c0599c02 = this.f9514H.f9955j;
            if (c0599c02 == null) {
                max = 0;
            } else {
                max = Math.max(0L, z7 - (this.f9532a0 - c0599c02.f9926o));
            }
            if (c0599c0 != this.f9514H.f9953h) {
                long j7 = c0599c0.f.f9942b;
            }
            c5 = this.f9542v.c(max, this.f9511D.a().f10063q);
            if (!c5 && max < 500000 && this.f9510C > 0) {
                this.f9514H.f9953h.f9915a.w(this.f9519M.f10057r);
                c5 = this.f9542v.c(max, this.f9511D.a().f10063q);
            }
        }
        this.f9525S = c5;
        if (c5) {
            C0599c0 c0599c03 = this.f9514H.f9955j;
            long j8 = this.f9532a0;
            if (c0599c03.f9924l == null) {
                z8 = true;
            }
            AbstractC0156a.k(z8);
            c0599c03.f9915a.C(j8 - c0599c03.f9926o);
        }
        c0();
    }

    @Override // H2.InterfaceC0021w
    public final void s(InterfaceC0022x interfaceC0022x) {
        this.f9544x.a(8, interfaceC0022x).b();
    }

    public final void t() {
        boolean z7;
        C0588E c0588e = this.f9520N;
        p0 p0Var = this.f9519M;
        boolean z8 = c0588e.f9486a;
        if (c0588e.f9487b != p0Var) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z9 = z8 | z7;
        c0588e.f9486a = z9;
        c0588e.f9487b = p0Var;
        if (z9) {
            C0585B c0585b = this.f9513G.f10069q;
            c0585b.f9475y.c(new A4.d(c0585b, 10, c0588e));
            this.f9520N = new C0588E(this.f9519M);
        }
    }

    public final void u() {
        k(this.f9515I.c(), true);
    }

    public final void v() {
        this.f9520N.a(1);
        throw null;
    }

    public final void w() {
        int i7;
        this.f9520N.a(1);
        int i8 = 0;
        C(false, false, false, true);
        this.f9542v.b(false);
        if (this.f9519M.f10043a.q()) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        W(i7);
        C0150t c0150t = (C0150t) this.f9543w;
        c0150t.getClass();
        J3.m mVar = this.f9515I;
        AbstractC0156a.k(!mVar.f1394a);
        mVar.f1403l = c0150t;
        while (true) {
            ArrayList arrayList = (ArrayList) mVar.f1396c;
            if (i8 < arrayList.size()) {
                C0617l0 c0617l0 = (C0617l0) arrayList.get(i8);
                mVar.g(c0617l0);
                ((HashSet) mVar.f1399h).add(c0617l0);
                i8++;
            } else {
                mVar.f1394a = true;
                this.f9544x.d(2);
                return;
            }
        }
    }

    public final synchronized boolean x() {
        if (!this.f9521O && this.f9546z.getThread().isAlive()) {
            this.f9544x.d(7);
            g0(new C0012m(1, this), this.f9517K);
            return this.f9521O;
        }
        return true;
    }

    public final void y() {
        C(true, false, true, false);
        z();
        this.f9542v.b(true);
        W(1);
        HandlerThread handlerThread = this.f9545y;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f9521O = true;
            notifyAll();
        }
    }

    public final void z() {
        boolean z7;
        for (int i7 = 0; i7 < this.f9537q.length; i7++) {
            AbstractC0600d abstractC0600d = this.f9539s[i7];
            synchronized (abstractC0600d.f9931q) {
                abstractC0600d.f9930D = null;
            }
            AbstractC0600d abstractC0600d2 = this.f9537q[i7];
            if (abstractC0600d2.f9937w == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            AbstractC0156a.k(z7);
            abstractC0600d2.o();
        }
    }
}
