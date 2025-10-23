package K2;

import H2.InterfaceC0021w;
import H2.InterfaceC0022x;
import H2.f0;
import H2.n0;
import O3.AbstractC0072p;
import O3.E;
import Y2.N;
import Y2.W;
import Z2.H;
import android.net.Uri;
import android.util.SparseArray;
import e2.C0593J;
import e2.D0;
import e2.K;
import e2.m0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import x2.C1461c;
/* loaded from: classes.dex */
public final class l implements InterfaceC0022x, L2.q {

    /* renamed from: A  reason: collision with root package name */
    public final T4.c f1711A;

    /* renamed from: B  reason: collision with root package name */
    public final J3.e f1712B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f1713C;

    /* renamed from: D  reason: collision with root package name */
    public final int f1714D;

    /* renamed from: E  reason: collision with root package name */
    public final boolean f1715E;
    public final f2.m F;

    /* renamed from: G  reason: collision with root package name */
    public final T4.c f1716G = new T4.c(14, this);

    /* renamed from: H  reason: collision with root package name */
    public final long f1717H;

    /* renamed from: I  reason: collision with root package name */
    public InterfaceC0021w f1718I;

    /* renamed from: J  reason: collision with root package name */
    public int f1719J;

    /* renamed from: K  reason: collision with root package name */
    public n0 f1720K;

    /* renamed from: L  reason: collision with root package name */
    public r[] f1721L;

    /* renamed from: M  reason: collision with root package name */
    public r[] f1722M;

    /* renamed from: N  reason: collision with root package name */
    public int f1723N;

    /* renamed from: O  reason: collision with root package name */
    public T4.c f1724O;

    /* renamed from: q  reason: collision with root package name */
    public final j f1725q;

    /* renamed from: r  reason: collision with root package name */
    public final L2.c f1726r;

    /* renamed from: s  reason: collision with root package name */
    public final T4.c f1727s;

    /* renamed from: t  reason: collision with root package name */
    public final W f1728t;

    /* renamed from: u  reason: collision with root package name */
    public final j2.q f1729u;

    /* renamed from: v  reason: collision with root package name */
    public final j2.n f1730v;

    /* renamed from: w  reason: collision with root package name */
    public final L4.f f1731w;

    /* renamed from: x  reason: collision with root package name */
    public final C.d f1732x;

    /* renamed from: y  reason: collision with root package name */
    public final Y2.r f1733y;

    /* renamed from: z  reason: collision with root package name */
    public final IdentityHashMap f1734z;

    public l(j jVar, L2.c cVar, T4.c cVar2, W w7, j2.q qVar, j2.n nVar, L4.f fVar, C.d dVar, Y2.r rVar, J3.e eVar, boolean z7, int i7, boolean z8, f2.m mVar, long j7) {
        this.f1725q = jVar;
        this.f1726r = cVar;
        this.f1727s = cVar2;
        this.f1728t = w7;
        this.f1729u = qVar;
        this.f1730v = nVar;
        this.f1731w = fVar;
        this.f1732x = dVar;
        this.f1733y = rVar;
        this.f1712B = eVar;
        this.f1713C = z7;
        this.f1714D = i7;
        this.f1715E = z8;
        this.F = mVar;
        this.f1717H = j7;
        eVar.getClass();
        this.f1724O = new T4.c(7, new f0[0]);
        this.f1734z = new IdentityHashMap();
        this.f1711A = new T4.c(15);
        this.f1721L = new r[0];
        this.f1722M = new r[0];
    }

    public static K f(K k5, K k7, boolean z7) {
        String r3;
        C1461c c1461c;
        int i7;
        String str;
        int i8;
        int i9;
        String str2;
        int i10;
        int i11 = -1;
        if (k7 != null) {
            r3 = k7.f9684y;
            c1461c = k7.f9685z;
            i8 = k7.f9667O;
            i7 = k7.f9679t;
            i9 = k7.f9680u;
            str = k7.f9678s;
            str2 = k7.f9677r;
        } else {
            r3 = H.r(k5.f9684y, 1);
            c1461c = k5.f9685z;
            if (z7) {
                i8 = k5.f9667O;
                i7 = k5.f9679t;
                i9 = k5.f9680u;
                str = k5.f9678s;
                str2 = k5.f9677r;
            } else {
                i7 = 0;
                str = null;
                i8 = -1;
                i9 = 0;
                str2 = null;
            }
        }
        String d = Z2.r.d(r3);
        if (z7) {
            i10 = k5.f9681v;
        } else {
            i10 = -1;
        }
        if (z7) {
            i11 = k5.f9682w;
        }
        C0593J c0593j = new C0593J();
        c0593j.f9597a = k5.f9676q;
        c0593j.f9598b = str2;
        c0593j.f9604j = k5.f9654A;
        c0593j.f9605k = d;
        c0593j.f9602h = r3;
        c0593j.f9603i = c1461c;
        c0593j.f = i10;
        c0593j.f9601g = i11;
        c0593j.f9617x = i8;
        c0593j.d = i7;
        c0593j.f9600e = i9;
        c0593j.f9599c = str;
        return new K(c0593j);
    }

    @Override // H2.InterfaceC0022x
    public final long B() {
        return -9223372036854775807L;
    }

    @Override // H2.f0
    public final boolean C(long j7) {
        r[] rVarArr;
        if (this.f1720K == null) {
            for (r rVar : this.f1721L) {
                if (!rVar.f1781T) {
                    rVar.C(rVar.f1792f0);
                }
            }
            return false;
        }
        return this.f1724O.C(j7);
    }

    @Override // H2.f0
    public final void G(long j7) {
        this.f1724O.G(j7);
    }

    @Override // H2.f0
    public final boolean a() {
        return this.f1724O.a();
    }

    @Override // L2.q
    public final void b() {
        r[] rVarArr;
        for (r rVar : this.f1721L) {
            ArrayList arrayList = rVar.f1766D;
            if (!arrayList.isEmpty()) {
                k kVar = (k) AbstractC0072p.i(arrayList);
                int b7 = rVar.f1804t.b(kVar);
                if (b7 == 1) {
                    kVar.f1695L = true;
                } else if (b7 == 2 && !rVar.f1796j0) {
                    N n = rVar.f1810z;
                    if (n.b()) {
                        n.a();
                    }
                }
            }
        }
        this.f1718I.h(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
        if ((!L2.b.a(r4, r12)) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0055 A[SYNTHETIC] */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.net.Uri r17, H.j r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            K2.r[] r2 = r0.f1721L
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L9d
            r8 = r2[r6]
            K2.i r9 = r8.f1804t
            android.net.Uri[] r10 = r9.f1669e
            boolean r10 = Z2.H.l(r10, r1)
            if (r10 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L98
        L1d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            W2.q r12 = r9.f1680r
            K.p r12 = k3.AbstractC0958a.n(r12)
            L4.f r8 = r8.f1809y
            r8.getClass()
            r8 = r18
            Y2.H r12 = L4.f.J(r12, r8)
            if (r12 == 0) goto L41
            int r13 = r12.f4329a
            r14 = 2
            if (r13 != r14) goto L41
            long r12 = r12.f4330b
            goto L42
        L3f:
            r8 = r18
        L41:
            r12 = r10
        L42:
            r14 = 0
        L43:
            android.net.Uri[] r15 = r9.f1669e
            int r5 = r15.length
            r4 = -1
            if (r14 >= r5) goto L55
            r5 = r15[r14]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L52
            goto L56
        L52:
            int r14 = r14 + 1
            goto L43
        L55:
            r14 = r4
        L56:
            if (r14 != r4) goto L5a
        L58:
            r5 = 1
            goto L91
        L5a:
            W2.q r5 = r9.f1680r
            int r5 = r5.t(r14)
            if (r5 != r4) goto L63
            goto L58
        L63:
            boolean r4 = r9.f1682t
            android.net.Uri r14 = r9.f1678p
            boolean r14 = r1.equals(r14)
            r4 = r4 | r14
            r9.f1682t = r4
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L58
            W2.q r4 = r9.f1680r
            boolean r4 = r4.p(r12, r5)
            if (r4 == 0) goto L8f
            L2.c r4 = r9.f1670g
            java.util.HashMap r4 = r4.f1941t
            java.lang.Object r4 = r4.get(r1)
            L2.b r4 = (L2.b) r4
            if (r4 == 0) goto L8f
            boolean r4 = L2.b.a(r4, r12)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L97
            goto L91
        L8f:
            r5 = 1
            goto L97
        L91:
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L97
            r4 = r5
            goto L98
        L97:
            r4 = 0
        L98:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L9d:
            H2.w r1 = r0.f1718I
            r1.h(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.l.c(android.net.Uri, H.j, boolean):boolean");
    }

    public final r d(String str, int i7, Uri[] uriArr, K[] kArr, K k5, List list, Map map, long j7) {
        return new r(str, i7, this.f1716G, new i(this.f1725q, this.f1726r, uriArr, kArr, this.f1727s, this.f1728t, this.f1711A, this.f1717H, list, this.F), map, this.f1733y, j7, k5, this.f1729u, this.f1730v, this.f1731w, this.f1732x, this.f1714D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0117, code lost:
        if (r2[r11] != 1) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.HashMap] */
    @Override // H2.InterfaceC0022x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(H2.InterfaceC0021w r25, long r26) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.l.e(H2.w, long):void");
    }

    @Override // H2.InterfaceC0022x
    public final n0 g() {
        n0 n0Var = this.f1720K;
        n0Var.getClass();
        return n0Var;
    }

    @Override // H2.f0
    public final long m() {
        return this.f1724O.m();
    }

    @Override // H2.InterfaceC0022x
    public final void n() {
        r[] rVarArr;
        for (r rVar : this.f1721L) {
            rVar.D();
            if (rVar.f1796j0 && !rVar.f1781T) {
                throw m0.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // H2.InterfaceC0022x
    public final long u(long j7, D0 d02) {
        L2.i iVar;
        long j8;
        r[] rVarArr = this.f1722M;
        int length = rVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            r rVar = rVarArr[i7];
            if (rVar.f1778Q == 2) {
                i iVar2 = rVar.f1804t;
                int g7 = iVar2.f1680r.g();
                Uri[] uriArr = iVar2.f1669e;
                int length2 = uriArr.length;
                L2.c cVar = iVar2.f1670g;
                if (g7 < length2 && g7 != -1) {
                    iVar = cVar.a(uriArr[iVar2.f1680r.a()], true);
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    E e3 = iVar.f1981r;
                    if (!e3.isEmpty() && iVar.f2002c) {
                        long j9 = iVar.f1972h - cVar.f1937D;
                        long j10 = j7 - j9;
                        int d = H.d(e3, Long.valueOf(j10), true);
                        long j11 = ((L2.f) e3.get(d)).f1960u;
                        if (d != e3.size() - 1) {
                            j8 = ((L2.f) e3.get(d + 1)).f1960u;
                        } else {
                            j8 = j11;
                        }
                        return d02.a(j10, j11, j8) + j9;
                    }
                }
            } else {
                i7++;
            }
        }
        return j7;
    }

    @Override // H2.InterfaceC0022x
    public final long v(long j7) {
        r[] rVarArr = this.f1722M;
        if (rVarArr.length > 0) {
            boolean H6 = rVarArr[0].H(false, j7);
            int i7 = 1;
            while (true) {
                r[] rVarArr2 = this.f1722M;
                if (i7 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i7].H(H6, j7);
                i7++;
            }
            if (H6) {
                ((SparseArray) this.f1711A.f3382r).clear();
            }
        }
        return j7;
    }

    @Override // H2.InterfaceC0022x
    public final void w(long j7) {
        r[] rVarArr;
        for (r rVar : this.f1722M) {
            if (rVar.f1780S && !rVar.x()) {
                int length = rVar.f1773L.length;
                for (int i7 = 0; i7 < length; i7++) {
                    rVar.f1773L[i7].h(rVar.f1790d0[i7], j7);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0263  */
    @Override // H2.InterfaceC0022x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(W2.q[] r38, boolean[] r39, H2.d0[] r40, boolean[] r41, long r42) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.l.y(W2.q[], boolean[], H2.d0[], boolean[], long):long");
    }

    @Override // H2.f0
    public final long z() {
        return this.f1724O.z();
    }
}
