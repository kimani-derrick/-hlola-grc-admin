package K2;

import H2.C0001b;
import H2.C0020v;
import H2.X;
import H2.Y;
import H2.b0;
import H2.f0;
import H2.m0;
import H2.n0;
import K.C0040p;
import O3.AbstractC0072p;
import Y2.F;
import Y2.I;
import Y2.J;
import Y2.L;
import Y2.N;
import Z2.AbstractC0156a;
import Z2.H;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import e2.C0593J;
import e2.K;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k2.C0945j;
import k2.InterfaceC0948m;
import k2.InterfaceC0955t;
import k2.w;
import k3.AbstractC0958a;
import x2.C1461c;
/* loaded from: classes.dex */
public final class r implements I, L, f0, InterfaceC0948m, b0 {

    /* renamed from: o0  reason: collision with root package name */
    public static final Set f1762o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A  reason: collision with root package name */
    public final C.d f1763A;

    /* renamed from: B  reason: collision with root package name */
    public final int f1764B;

    /* renamed from: C  reason: collision with root package name */
    public final A0.f f1765C;

    /* renamed from: D  reason: collision with root package name */
    public final ArrayList f1766D;

    /* renamed from: E  reason: collision with root package name */
    public final List f1767E;
    public final o F;

    /* renamed from: G  reason: collision with root package name */
    public final o f1768G;

    /* renamed from: H  reason: collision with root package name */
    public final Handler f1769H;

    /* renamed from: I  reason: collision with root package name */
    public final ArrayList f1770I;

    /* renamed from: J  reason: collision with root package name */
    public final Map f1771J;

    /* renamed from: K  reason: collision with root package name */
    public J2.a f1772K;

    /* renamed from: L  reason: collision with root package name */
    public q[] f1773L;

    /* renamed from: M  reason: collision with root package name */
    public int[] f1774M;

    /* renamed from: N  reason: collision with root package name */
    public final HashSet f1775N;

    /* renamed from: O  reason: collision with root package name */
    public final SparseIntArray f1776O;

    /* renamed from: P  reason: collision with root package name */
    public p f1777P;

    /* renamed from: Q  reason: collision with root package name */
    public int f1778Q;

    /* renamed from: R  reason: collision with root package name */
    public int f1779R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f1780S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f1781T;

    /* renamed from: U  reason: collision with root package name */
    public int f1782U;

    /* renamed from: V  reason: collision with root package name */
    public K f1783V;
    public K W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f1784X;

    /* renamed from: Y  reason: collision with root package name */
    public n0 f1785Y;

    /* renamed from: Z  reason: collision with root package name */
    public Set f1786Z;

    /* renamed from: a0  reason: collision with root package name */
    public int[] f1787a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f1788b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1789c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean[] f1790d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean[] f1791e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f1792f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f1793g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1794h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1795i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1796j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1797k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f1798l0;

    /* renamed from: m0  reason: collision with root package name */
    public j2.i f1799m0;

    /* renamed from: n0  reason: collision with root package name */
    public k f1800n0;

    /* renamed from: q  reason: collision with root package name */
    public final String f1801q;

    /* renamed from: r  reason: collision with root package name */
    public final int f1802r;

    /* renamed from: s  reason: collision with root package name */
    public final T4.c f1803s;

    /* renamed from: t  reason: collision with root package name */
    public final i f1804t;

    /* renamed from: u  reason: collision with root package name */
    public final Y2.r f1805u;

    /* renamed from: v  reason: collision with root package name */
    public final K f1806v;

    /* renamed from: w  reason: collision with root package name */
    public final j2.q f1807w;

    /* renamed from: x  reason: collision with root package name */
    public final j2.n f1808x;

    /* renamed from: y  reason: collision with root package name */
    public final L4.f f1809y;

    /* renamed from: z  reason: collision with root package name */
    public final N f1810z = new N("Loader:HlsSampleStreamWrapper");

    /* JADX WARN: Type inference failed for: r1v12, types: [K2.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [K2.o] */
    /* JADX WARN: Type inference failed for: r1v2, types: [A0.f, java.lang.Object] */
    public r(String str, int i7, T4.c cVar, i iVar, Map map, Y2.r rVar, long j7, K k5, j2.q qVar, j2.n nVar, L4.f fVar, C.d dVar, int i8) {
        this.f1801q = str;
        this.f1802r = i7;
        this.f1803s = cVar;
        this.f1804t = iVar;
        this.f1771J = map;
        this.f1805u = rVar;
        this.f1806v = k5;
        this.f1807w = qVar;
        this.f1808x = nVar;
        this.f1809y = fVar;
        this.f1763A = dVar;
        this.f1764B = i8;
        ?? obj = new Object();
        obj.f12b = null;
        obj.f11a = false;
        obj.f13c = null;
        this.f1765C = obj;
        this.f1774M = new int[0];
        Set set = f1762o0;
        this.f1775N = new HashSet(set.size());
        this.f1776O = new SparseIntArray(set.size());
        this.f1773L = new q[0];
        this.f1791e0 = new boolean[0];
        this.f1790d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f1766D = arrayList;
        this.f1767E = Collections.unmodifiableList(arrayList);
        this.f1770I = new ArrayList();
        this.F = new Runnable(this) { // from class: K2.o

            /* renamed from: r  reason: collision with root package name */
            public final /* synthetic */ r f1753r;

            {
                this.f1753r = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1753r.A();
                        return;
                    default:
                        r rVar2 = this.f1753r;
                        rVar2.f1780S = true;
                        rVar2.A();
                        return;
                }
            }
        };
        this.f1768G = new Runnable(this) { // from class: K2.o

            /* renamed from: r  reason: collision with root package name */
            public final /* synthetic */ r f1753r;

            {
                this.f1753r = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1753r.A();
                        return;
                    default:
                        r rVar2 = this.f1753r;
                        rVar2.f1780S = true;
                        rVar2.A();
                        return;
                }
            }
        };
        this.f1769H = H.n(null);
        this.f1792f0 = j7;
        this.f1793g0 = j7;
    }

    public static C0945j j(int i7, int i8) {
        AbstractC0156a.K("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i8);
        return new C0945j();
    }

    public static K o(K k5, K k7, boolean z7) {
        String str;
        String str2;
        int i7;
        int i8;
        if (k5 == null) {
            return k7;
        }
        String str3 = k7.f9655B;
        int h7 = Z2.r.h(str3);
        String str4 = k5.f9684y;
        if (H.q(str4, h7) == 1) {
            str2 = H.r(str4, h7);
            str = Z2.r.d(str2);
        } else {
            String b7 = Z2.r.b(str4, str3);
            str = str3;
            str2 = b7;
        }
        C0593J a7 = k7.a();
        a7.f9597a = k5.f9676q;
        a7.f9598b = k5.f9677r;
        a7.f9599c = k5.f9678s;
        a7.d = k5.f9679t;
        a7.f9600e = k5.f9680u;
        if (z7) {
            i7 = k5.f9681v;
        } else {
            i7 = -1;
        }
        a7.f = i7;
        if (z7) {
            i8 = k5.f9682w;
        } else {
            i8 = -1;
        }
        a7.f9601g = i8;
        a7.f9602h = str2;
        if (h7 == 2) {
            a7.f9609p = k5.f9659G;
            a7.f9610q = k5.f9660H;
            a7.f9611r = k5.f9661I;
        }
        if (str != null) {
            a7.f9605k = str;
        }
        int i9 = k5.f9667O;
        if (i9 != -1 && h7 == 1) {
            a7.f9617x = i9;
        }
        C1461c c1461c = k5.f9685z;
        if (c1461c != null) {
            C1461c c1461c2 = k7.f9685z;
            if (c1461c2 != null) {
                c1461c = c1461c2.a(c1461c.f16206q);
            }
            a7.f9603i = c1461c;
        }
        return new K(a7);
    }

    public static int s(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 3;
        }
        if (i7 == 3) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        boolean z7;
        int i7;
        K o7;
        int i8 = 0;
        if (!this.f1784X && this.f1787a0 == null && this.f1780S) {
            for (q qVar : this.f1773L) {
                if (qVar.s() == null) {
                    return;
                }
            }
            n0 n0Var = this.f1785Y;
            if (n0Var != null) {
                int i9 = n0Var.f1146q;
                int[] iArr = new int[i9];
                this.f1787a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = 0;
                    while (true) {
                        q[] qVarArr = this.f1773L;
                        if (i11 < qVarArr.length) {
                            K s6 = qVarArr[i11].s();
                            AbstractC0156a.l(s6);
                            K k5 = this.f1785Y.a(i10).f1136t[0];
                            String str = k5.f9655B;
                            String str2 = s6.f9655B;
                            int h7 = Z2.r.h(str2);
                            if (h7 != 3) {
                                if (h7 == Z2.r.h(str)) {
                                    break;
                                }
                                i11++;
                            } else {
                                if (!H.a(str2, str)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || s6.f9672T == k5.f9672T) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    this.f1787a0[i10] = i11;
                }
                Iterator it = this.f1770I.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).a();
                }
                return;
            }
            int length = this.f1773L.length;
            int i12 = 0;
            int i13 = -1;
            int i14 = -2;
            while (true) {
                int i15 = 2;
                if (i12 >= length) {
                    break;
                }
                K s7 = this.f1773L[i12].s();
                AbstractC0156a.l(s7);
                String str3 = s7.f9655B;
                if (!Z2.r.k(str3)) {
                    if (Z2.r.i(str3)) {
                        i15 = 1;
                    } else if (Z2.r.j(str3)) {
                        i15 = 3;
                    } else {
                        i15 = -2;
                    }
                }
                if (s(i15) > s(i14)) {
                    i13 = i12;
                    i14 = i15;
                } else if (i15 == i14 && i13 != -1) {
                    i13 = -1;
                }
                i12++;
            }
            m0 m0Var = this.f1804t.f1671h;
            int i16 = m0Var.f1133q;
            this.f1788b0 = -1;
            this.f1787a0 = new int[length];
            for (int i17 = 0; i17 < length; i17++) {
                this.f1787a0[i17] = i17;
            }
            m0[] m0VarArr = new m0[length];
            int i18 = 0;
            while (i18 < length) {
                K s8 = this.f1773L[i18].s();
                AbstractC0156a.l(s8);
                String str4 = this.f1801q;
                K k7 = this.f1806v;
                if (i18 == i13) {
                    K[] kArr = new K[i16];
                    for (int i19 = i8; i19 < i16; i19++) {
                        K k8 = m0Var.f1136t[i19];
                        if (i14 == 1 && k7 != null) {
                            k8 = k8.d(k7);
                        }
                        if (i16 == 1) {
                            o7 = s8.d(k8);
                        } else {
                            o7 = o(k8, s8, true);
                        }
                        kArr[i19] = o7;
                    }
                    m0VarArr[i18] = new m0(str4, kArr);
                    this.f1788b0 = i18;
                    i7 = 0;
                } else {
                    k7 = (i14 == 2 && Z2.r.i(s8.f9655B)) ? null : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i18 < i13 ? i18 : i18 - 1);
                    i7 = 0;
                    m0VarArr[i18] = new m0(sb.toString(), o(k7, s8, false));
                }
                i18++;
                i8 = i7;
            }
            int i20 = i8;
            this.f1785Y = k(m0VarArr);
            if (this.f1786Z == null) {
                z7 = 1;
            } else {
                z7 = i20;
            }
            AbstractC0156a.k(z7);
            this.f1786Z = Collections.emptySet();
            this.f1781T = true;
            this.f1803s.S();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a  */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.io.IOException, H2.b] */
    @Override // H2.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r59) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.r.C(long):boolean");
    }

    public final void D() {
        IOException iOException;
        IOException iOException2;
        N n = this.f1810z;
        IOException iOException3 = n.f4343c;
        if (iOException3 == null) {
            J j7 = n.f4342b;
            if (j7 != null && (iOException2 = j7.f4334t) != null && j7.f4335u > j7.f4331q) {
                throw iOException2;
            }
            i iVar = this.f1804t;
            C0001b c0001b = iVar.f1677o;
            if (c0001b == null) {
                Uri uri = iVar.f1678p;
                if (uri != null && iVar.f1682t) {
                    L2.b bVar = (L2.b) iVar.f1670g.f1941t.get(uri);
                    N n7 = bVar.f1924r;
                    IOException iOException4 = n7.f4343c;
                    if (iOException4 == null) {
                        J j8 = n7.f4342b;
                        if (j8 != null && (iOException = j8.f4334t) != null && j8.f4335u > j8.f4331q) {
                            throw iOException;
                        }
                        IOException iOException5 = bVar.f1932z;
                        if (iOException5 != null) {
                            throw iOException5;
                        }
                        return;
                    }
                    throw iOException4;
                }
                return;
            }
            throw c0001b;
        }
        throw iOException3;
    }

    public final void E(m0[] m0VarArr, int... iArr) {
        this.f1785Y = k(m0VarArr);
        this.f1786Z = new HashSet();
        for (int i7 : iArr) {
            this.f1786Z.add(this.f1785Y.a(i7));
        }
        this.f1788b0 = 0;
        Handler handler = this.f1769H;
        T4.c cVar = this.f1803s;
        Objects.requireNonNull(cVar);
        handler.post(new E1.b(1, cVar));
        this.f1781T = true;
    }

    public final void F() {
        for (q qVar : this.f1773L) {
            qVar.z(this.f1794h0);
        }
        this.f1794h0 = false;
    }

    @Override // H2.f0
    public final void G(long j7) {
        int size;
        N n = this.f1810z;
        if (n.f4343c != null || x()) {
            return;
        }
        boolean b7 = n.b();
        i iVar = this.f1804t;
        List list = this.f1767E;
        if (b7) {
            this.f1772K.getClass();
            J2.a aVar = this.f1772K;
            if (iVar.f1677o == null && iVar.f1680r.c(j7, aVar, list)) {
                n.a();
                return;
            }
            return;
        }
        int size2 = list.size();
        while (size2 > 0 && iVar.b((k) list.get(size2 - 1)) == 2) {
            size2--;
        }
        if (size2 < list.size()) {
            p(size2);
        }
        if (iVar.f1677o == null && iVar.f1680r.length() >= 2) {
            size = iVar.f1680r.n(j7, list);
        } else {
            size = list.size();
        }
        if (size < this.f1766D.size()) {
            p(size);
        }
    }

    public final boolean H(boolean z7, long j7) {
        this.f1792f0 = j7;
        if (x()) {
            this.f1793g0 = j7;
            return true;
        }
        if (this.f1780S && !z7) {
            int length = this.f1773L.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (this.f1773L[i7].C(false, j7) || (!this.f1791e0[i7] && this.f1789c0)) {
                }
            }
            return false;
        }
        this.f1793g0 = j7;
        this.f1796j0 = false;
        this.f1766D.clear();
        N n = this.f1810z;
        if (n.b()) {
            if (this.f1780S) {
                for (q qVar : this.f1773L) {
                    qVar.i();
                }
            }
            n.a();
        } else {
            n.f4343c = null;
            F();
        }
        return true;
    }

    @Override // H2.f0
    public final boolean a() {
        return this.f1810z.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void b(Y2.K k5) {
        J2.a aVar = (J2.a) k5;
        this.f1772K = null;
        i iVar = this.f1804t;
        iVar.getClass();
        if (aVar instanceof e) {
            e eVar = (e) aVar;
            iVar.n = eVar.f1655j;
            Uri uri = eVar.f1318b.f4422a;
            byte[] bArr = eVar.f1657l;
            bArr.getClass();
            T4.c cVar = iVar.f1673j;
            cVar.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((d) cVar.f3382r).put(uri, bArr);
        }
        long j7 = aVar.f1317a;
        Uri uri2 = aVar.f1323i.f4367s;
        ?? obj = new Object();
        this.f1809y.getClass();
        this.f1763A.n(obj, aVar.f1319c, this.f1802r, aVar.d, aVar.f1320e, aVar.f, aVar.f1321g, aVar.f1322h);
        if (!this.f1781T) {
            C(this.f1792f0);
        } else {
            this.f1803s.h(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void c(Y2.K k5, boolean z7) {
        J2.a aVar = (J2.a) k5;
        this.f1772K = null;
        long j7 = aVar.f1317a;
        Uri uri = aVar.f1323i.f4367s;
        ?? obj = new Object();
        this.f1809y.getClass();
        this.f1763A.l(obj, aVar.f1319c, this.f1802r, aVar.d, aVar.f1320e, aVar.f, aVar.f1321g, aVar.f1322h);
        if (!z7) {
            if (x() || this.f1782U == 0) {
                F();
            }
            if (this.f1782U > 0) {
                this.f1803s.h(this);
            }
        }
    }

    @Override // Y2.L
    public final void d() {
        q[] qVarArr;
        for (q qVar : this.f1773L) {
            qVar.z(true);
            j2.k kVar = qVar.f1031h;
            if (kVar != null) {
                kVar.a(qVar.f1029e);
                qVar.f1031h = null;
                qVar.f1030g = null;
            }
        }
    }

    @Override // H2.b0
    public final void f() {
        this.f1769H.post(this.F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final Y2.H h(Y2.K k5, IOException iOException, int i7) {
        boolean z7;
        Y2.H h7;
        Y2.H h8;
        boolean z8;
        int i8;
        J2.a aVar = (J2.a) k5;
        boolean z9 = aVar instanceof k;
        if (z9 && !((k) aVar).f1695L && (iOException instanceof F) && ((i8 = ((F) iOException).f4325t) == 410 || i8 == 404)) {
            return N.d;
        }
        long j7 = aVar.f1323i.f4366r;
        Uri uri = aVar.f1323i.f4367s;
        ?? obj = new Object();
        H.S(aVar.f1321g);
        H.S(aVar.f1322h);
        H.j jVar = new H.j(i7, (Object) iOException);
        i iVar = this.f1804t;
        C0040p n = AbstractC0958a.n(iVar.f1680r);
        this.f1809y.getClass();
        Y2.H J6 = L4.f.J(n, jVar);
        boolean z10 = false;
        if (J6 != null && J6.f4329a == 2) {
            W2.q qVar = iVar.f1680r;
            z7 = qVar.p(J6.f4330b, qVar.t(iVar.f1671h.a(aVar.d)));
        } else {
            z7 = false;
        }
        if (z7) {
            if (z9 && j7 == 0) {
                ArrayList arrayList = this.f1766D;
                if (((k) arrayList.remove(arrayList.size() - 1)) == aVar) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0156a.k(z8);
                if (arrayList.isEmpty()) {
                    this.f1793g0 = this.f1792f0;
                } else {
                    ((k) AbstractC0072p.i(arrayList)).f1694K = true;
                }
            }
            h8 = N.f4340e;
        } else {
            long L6 = L4.f.L(jVar);
            if (L6 != -9223372036854775807L) {
                h7 = new Y2.H(0, L6, false);
            } else {
                h7 = N.f;
            }
            h8 = h7;
        }
        int i9 = h8.f4329a;
        if (i9 == 0 || i9 == 1) {
            z10 = true;
        }
        boolean z11 = !z10;
        this.f1763A.p(obj, aVar.f1319c, this.f1802r, aVar.d, aVar.f1320e, aVar.f, aVar.f1321g, aVar.f1322h, iOException, z11);
        if (z11) {
            this.f1772K = null;
        }
        if (z7) {
            if (!this.f1781T) {
                C(this.f1792f0);
            } else {
                this.f1803s.h(this);
            }
        }
        return h8;
    }

    public final void i() {
        AbstractC0156a.k(this.f1781T);
        this.f1785Y.getClass();
        this.f1786Z.getClass();
    }

    public final n0 k(m0[] m0VarArr) {
        for (int i7 = 0; i7 < m0VarArr.length; i7++) {
            m0 m0Var = m0VarArr[i7];
            K[] kArr = new K[m0Var.f1133q];
            for (int i8 = 0; i8 < m0Var.f1133q; i8++) {
                K k5 = m0Var.f1136t[i8];
                int o7 = this.f1807w.o(k5);
                C0593J a7 = k5.a();
                a7.F = o7;
                kArr[i8] = a7.a();
            }
            m0VarArr[i7] = new m0(m0Var.f1134r, kArr);
        }
        return new n0(m0VarArr);
    }

    @Override // k2.InterfaceC0948m
    public final void l() {
        this.f1797k0 = true;
        this.f1769H.post(this.f1768G);
    }

    @Override // H2.f0
    public final long m() {
        if (this.f1796j0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f1793g0;
        }
        long j7 = this.f1792f0;
        k r3 = r();
        if (!r3.f1692I) {
            ArrayList arrayList = this.f1766D;
            if (arrayList.size() > 1) {
                r3 = (k) arrayList.get(arrayList.size() - 2);
            } else {
                r3 = null;
            }
        }
        if (r3 != null) {
            j7 = Math.max(j7, r3.f1322h);
        }
        if (this.f1780S) {
            for (q qVar : this.f1773L) {
                j7 = Math.max(j7, qVar.m());
            }
        }
        return j7;
    }

    public final void p(int i7) {
        ArrayList arrayList;
        boolean z7;
        AbstractC0156a.k(!this.f1810z.b());
        int i8 = i7;
        loop0: while (true) {
            arrayList = this.f1766D;
            if (i8 < arrayList.size()) {
                int i9 = i8;
                while (true) {
                    if (i9 < arrayList.size()) {
                        if (((k) arrayList.get(i9)).n) {
                            break;
                        }
                        i9++;
                    } else {
                        k kVar = (k) arrayList.get(i8);
                        for (int i10 = 0; i10 < this.f1773L.length; i10++) {
                            if (this.f1773L[i10].p() > kVar.e(i10)) {
                                break;
                            }
                        }
                        break loop0;
                    }
                }
            } else {
                i8 = -1;
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            return;
        }
        long j7 = r().f1322h;
        k kVar2 = (k) arrayList.get(i8);
        int size = arrayList.size();
        int i11 = H.f4603a;
        if (i8 >= 0 && size <= arrayList.size() && i8 <= size) {
            if (i8 != size) {
                arrayList.subList(i8, size).clear();
            }
            for (int i12 = 0; i12 < this.f1773L.length; i12++) {
                int e3 = kVar2.e(i12);
                q qVar = this.f1773L[i12];
                long j8 = qVar.j(e3);
                Y y3 = qVar.f1026a;
                if (j8 <= y3.f1005g) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.f(z7);
                y3.f1005g = j8;
                int i13 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
                int i14 = y3.f1002b;
                if (i13 != 0) {
                    X x7 = y3.d;
                    if (j8 != x7.f997q) {
                        while (y3.f1005g > x7.f998r) {
                            x7 = (X) x7.f1000t;
                        }
                        X x8 = (X) x7.f1000t;
                        x8.getClass();
                        y3.a(x8);
                        X x9 = new X(x7.f998r, i14);
                        x7.f1000t = x9;
                        if (y3.f1005g == x7.f998r) {
                            x7 = x9;
                        }
                        y3.f = x7;
                        if (y3.f1004e == x8) {
                            y3.f1004e = x9;
                        }
                    }
                }
                y3.a(y3.d);
                X x10 = new X(y3.f1005g, i14);
                y3.d = x10;
                y3.f1004e = x10;
                y3.f = x10;
            }
            if (arrayList.isEmpty()) {
                this.f1793g0 = this.f1792f0;
            } else {
                ((k) AbstractC0072p.i(arrayList)).f1694K = true;
            }
            this.f1796j0 = false;
            int i15 = this.f1778Q;
            long j9 = kVar2.f1321g;
            C.d dVar = this.f1763A;
            dVar.getClass();
            dVar.B(new C0020v(1, i15, null, 3, null, H.S(j9), H.S(j7)));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [k2.j] */
    @Override // k2.InterfaceC0948m
    public final w q(int i7, int i8) {
        k kVar;
        q qVar;
        Integer valueOf = Integer.valueOf(i8);
        Set set = f1762o0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f1775N;
        SparseIntArray sparseIntArray = this.f1776O;
        boolean z7 = false;
        q qVar2 = null;
        if (contains) {
            AbstractC0156a.f(set.contains(Integer.valueOf(i8)));
            int i9 = sparseIntArray.get(i8, -1);
            if (i9 != -1) {
                if (hashSet.add(Integer.valueOf(i8))) {
                    this.f1774M[i9] = i7;
                }
                if (this.f1774M[i9] == i7) {
                    qVar = this.f1773L[i9];
                } else {
                    qVar = j(i7, i8);
                }
                qVar2 = qVar;
            }
        } else {
            int i10 = 0;
            while (true) {
                q[] qVarArr = this.f1773L;
                if (i10 >= qVarArr.length) {
                    break;
                } else if (this.f1774M[i10] == i7) {
                    qVar2 = qVarArr[i10];
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (qVar2 == null) {
            if (this.f1797k0) {
                return j(i7, i8);
            }
            int length = this.f1773L.length;
            if (i8 == 1 || i8 == 2) {
                z7 = true;
            }
            qVar2 = new q(this.f1805u, this.f1807w, this.f1808x, this.f1771J);
            qVar2.f1042t = this.f1792f0;
            if (z7) {
                qVar2.f1761I = this.f1799m0;
                qVar2.f1048z = true;
            }
            long j7 = this.f1798l0;
            if (qVar2.F != j7) {
                qVar2.F = j7;
                qVar2.f1048z = true;
            }
            if (this.f1800n0 != null) {
                qVar2.f1022C = kVar.f1696k;
            }
            qVar2.f = this;
            int i11 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f1774M, i11);
            this.f1774M = copyOf;
            copyOf[length] = i7;
            q[] qVarArr2 = this.f1773L;
            int i12 = H.f4603a;
            Object[] copyOf2 = Arrays.copyOf(qVarArr2, qVarArr2.length + 1);
            copyOf2[qVarArr2.length] = qVar2;
            this.f1773L = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f1791e0, i11);
            this.f1791e0 = copyOf3;
            copyOf3[length] = z7;
            this.f1789c0 |= z7;
            hashSet.add(Integer.valueOf(i8));
            sparseIntArray.append(i8, length);
            if (s(i8) > s(this.f1778Q)) {
                this.f1779R = length;
                this.f1778Q = i8;
            }
            this.f1790d0 = Arrays.copyOf(this.f1790d0, i11);
        }
        if (i8 == 5) {
            if (this.f1777P == null) {
                this.f1777P = new p(qVar2, this.f1764B);
            }
            return this.f1777P;
        }
        return qVar2;
    }

    public final k r() {
        ArrayList arrayList = this.f1766D;
        return (k) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (this.f1793g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // H2.f0
    public final long z() {
        if (x()) {
            return this.f1793g0;
        }
        if (this.f1796j0) {
            return Long.MIN_VALUE;
        }
        return r().f1322h;
    }

    @Override // k2.InterfaceC0948m
    public final void t(InterfaceC0955t interfaceC0955t) {
    }
}
