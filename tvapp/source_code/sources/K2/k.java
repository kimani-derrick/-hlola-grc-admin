package K2;

import O3.C;
import O3.E;
import O3.U;
import Y2.C0148q;
import Y2.InterfaceC0144m;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import android.net.Uri;
import android.text.TextUtils;
import e2.C0593J;
import e2.K;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import k2.C0943h;
import k2.InterfaceC0946k;
import r2.C1117d;
import u2.C1265a;
import u2.C1267c;
import u2.C1268d;
import u2.D;
import x2.C1461c;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class k extends J2.b {

    /* renamed from: M  reason: collision with root package name */
    public static final AtomicInteger f1684M = new AtomicInteger();

    /* renamed from: A  reason: collision with root package name */
    public final boolean f1685A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f1686B;

    /* renamed from: C  reason: collision with root package name */
    public final long f1687C;

    /* renamed from: D  reason: collision with root package name */
    public b f1688D;

    /* renamed from: E  reason: collision with root package name */
    public r f1689E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f1690G;

    /* renamed from: H  reason: collision with root package name */
    public volatile boolean f1691H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f1692I;

    /* renamed from: J  reason: collision with root package name */
    public E f1693J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f1694K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f1695L;

    /* renamed from: k  reason: collision with root package name */
    public final int f1696k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1697l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f1698m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1699o;

    /* renamed from: p  reason: collision with root package name */
    public final InterfaceC0144m f1700p;

    /* renamed from: q  reason: collision with root package name */
    public final C0148q f1701q;

    /* renamed from: r  reason: collision with root package name */
    public final b f1702r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f1703s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f1704t;

    /* renamed from: u  reason: collision with root package name */
    public final Z2.E f1705u;

    /* renamed from: v  reason: collision with root package name */
    public final j f1706v;

    /* renamed from: w  reason: collision with root package name */
    public final List f1707w;

    /* renamed from: x  reason: collision with root package name */
    public final j2.i f1708x;

    /* renamed from: y  reason: collision with root package name */
    public final C2.i f1709y;

    /* renamed from: z  reason: collision with root package name */
    public final y f1710z;

    public k(j jVar, InterfaceC0144m interfaceC0144m, C0148q c0148q, K k5, boolean z7, InterfaceC0144m interfaceC0144m2, C0148q c0148q2, boolean z8, Uri uri, List list, int i7, Object obj, long j7, long j8, long j9, int i8, boolean z9, int i9, boolean z10, boolean z11, Z2.E e3, long j10, j2.i iVar, b bVar, C2.i iVar2, y yVar, boolean z12, f2.m mVar) {
        super(interfaceC0144m, c0148q, k5, i7, obj, j7, j8, j9);
        this.f1685A = z7;
        this.f1699o = i8;
        this.f1695L = z9;
        this.f1697l = i9;
        this.f1701q = c0148q2;
        this.f1700p = interfaceC0144m2;
        this.f1690G = c0148q2 != null;
        this.f1686B = z8;
        this.f1698m = uri;
        this.f1703s = z11;
        this.f1705u = e3;
        this.f1687C = j10;
        this.f1704t = z10;
        this.f1706v = jVar;
        this.f1707w = list;
        this.f1708x = iVar;
        this.f1702r = bVar;
        this.f1709y = iVar2;
        this.f1710z = yVar;
        this.n = z12;
        C c5 = E.f2597r;
        this.f1693J = U.f2621u;
        this.f1696k = f1684M.getAndIncrement();
    }

    public static byte[] d(String str) {
        int i7;
        if (p6.l.T(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i7 = byteArray.length - 16;
        } else {
            i7 = 0;
        }
        System.arraycopy(byteArray, i7, bArr, (16 - byteArray.length) + i7, byteArray.length - i7);
        return bArr;
    }

    @Override // Y2.K
    public final void a() {
        b bVar;
        this.f1689E.getClass();
        if (this.f1688D == null && (bVar = this.f1702r) != null) {
            InterfaceC0946k interfaceC0946k = bVar.f1650a;
            if ((interfaceC0946k instanceof D) || (interfaceC0946k instanceof s2.j)) {
                this.f1688D = bVar;
                this.f1690G = false;
            }
        }
        if (this.f1690G) {
            InterfaceC0144m interfaceC0144m = this.f1700p;
            interfaceC0144m.getClass();
            C0148q c0148q = this.f1701q;
            c0148q.getClass();
            c(interfaceC0144m, c0148q, this.f1686B, false);
            this.F = 0;
            this.f1690G = false;
        }
        if (!this.f1691H) {
            if (!this.f1704t) {
                c(this.f1323i, this.f1318b, this.f1685A, true);
            }
            this.f1692I = !this.f1691H;
        }
    }

    @Override // Y2.K
    public final void b() {
        this.f1691H = true;
    }

    public final void c(InterfaceC0144m interfaceC0144m, C0148q c0148q, boolean z7, boolean z8) {
        C0148q c0148q2;
        InterfaceC0144m interfaceC0144m2;
        boolean z9;
        long j7;
        long j8;
        boolean z10 = false;
        int i7 = this.F;
        if (z7) {
            if (i7 != 0) {
                z10 = true;
            }
            interfaceC0144m2 = interfaceC0144m;
            z9 = z8;
            c0148q2 = c0148q;
        } else {
            long j9 = i7;
            long j10 = c0148q.f4426g;
            long j11 = -1;
            if (j10 != -1) {
                j11 = j10 - j9;
            }
            long j12 = j11;
            if (j9 == 0 && j10 == j12) {
                c0148q2 = c0148q;
            } else {
                c0148q2 = new C0148q(c0148q.f4422a, c0148q.f4423b, c0148q.f4424c, c0148q.d, c0148q.f4425e, c0148q.f + j9, j12, c0148q.f4427h, c0148q.f4428i, c0148q.f4429j);
            }
            interfaceC0144m2 = interfaceC0144m;
            z9 = z8;
        }
        try {
            C0943h f = f(interfaceC0144m2, c0148q2, z9);
            if (z10) {
                f.d(this.F);
            }
            do {
                try {
                    if (this.f1691H) {
                        break;
                    }
                } catch (EOFException e3) {
                    if ((this.d.f9680u & 16384) != 0) {
                        this.f1688D.f1650a.h(0L, 0L);
                        j7 = f.f12166t;
                        j8 = c0148q.f;
                    } else {
                        throw e3;
                    }
                }
            } while (this.f1688D.f1650a.d(f, b.d) == 0);
            j7 = f.f12166t;
            j8 = c0148q.f;
            this.F = (int) (j7 - j8);
        } finally {
            p6.d.e(interfaceC0144m);
        }
    }

    public final int e(int i7) {
        AbstractC0156a.k(!this.n);
        if (i7 >= this.f1693J.size()) {
            return 0;
        }
        return ((Integer) this.f1693J.get(i7)).intValue();
    }

    public final C0943h f(InterfaceC0144m interfaceC0144m, C0148q c0148q, boolean z7) {
        int i7;
        long j7;
        String str;
        long j8;
        b bVar;
        ArrayList arrayList;
        InterfaceC0946k c1265a;
        int i8;
        InterfaceC1460b interfaceC1460b;
        int i9;
        long j9;
        boolean z8;
        InterfaceC0946k c1117d;
        InterfaceC1460b[] interfaceC1460bArr;
        long c5 = interfaceC0144m.c(c0148q);
        if (z7) {
            try {
                this.f1705u.g(this.f1703s, this.f1321g, this.f1687C);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e3) {
                throw new IOException(e3);
            }
        }
        C0943h c0943h = new C0943h(interfaceC0144m, c0148q.f, c5);
        int i10 = 1;
        if (this.f1688D == null) {
            y yVar = this.f1710z;
            c0943h.f12168v = 0;
            try {
                yVar.C(10);
                c0943h.i(yVar.f4691a, 0, 10, false);
                if (yVar.w() == 4801587) {
                    yVar.G(3);
                    int t5 = yVar.t();
                    int i11 = t5 + 10;
                    byte[] bArr = yVar.f4691a;
                    if (i11 > bArr.length) {
                        yVar.C(i11);
                        System.arraycopy(bArr, 0, yVar.f4691a, 0, 10);
                    }
                    c0943h.i(yVar.f4691a, 10, t5, false);
                    C1461c J6 = this.f1709y.J(t5, yVar.f4691a);
                    if (J6 != null) {
                        for (InterfaceC1460b interfaceC1460b2 : J6.f16206q) {
                            if (interfaceC1460b2 instanceof C2.m) {
                                C2.m mVar = (C2.m) interfaceC1460b2;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f414r)) {
                                    System.arraycopy(mVar.f415s, 0, yVar.f4691a, 0, 8);
                                    yVar.F(0);
                                    yVar.E(8);
                                    j7 = yVar.o() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j7 = -9223372036854775807L;
            c0943h.f12168v = 0;
            Z2.E e7 = this.f1705u;
            b bVar2 = this.f1702r;
            if (bVar2 != null) {
                InterfaceC0946k interfaceC0946k = bVar2.f1650a;
                if (!(interfaceC0946k instanceof D) && !(interfaceC0946k instanceof s2.j)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                AbstractC0156a.k(!z8);
                boolean z9 = interfaceC0946k instanceof v;
                Z2.E e8 = bVar2.f1652c;
                K k5 = bVar2.f1651b;
                if (z9) {
                    c1117d = new v(k5.f9678s, e8);
                } else if (interfaceC0946k instanceof C1268d) {
                    c1117d = new C1268d();
                } else if (interfaceC0946k instanceof C1265a) {
                    c1117d = new C1265a();
                } else if (interfaceC0946k instanceof C1267c) {
                    c1117d = new C1267c();
                } else if (interfaceC0946k instanceof C1117d) {
                    c1117d = new C1117d();
                } else {
                    throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC0946k.getClass().getSimpleName()));
                }
                bVar = new b(c1117d, k5, e8);
                j8 = j7;
                i7 = 0;
            } else {
                Map n = interfaceC0144m.n();
                ((c) this.f1706v).getClass();
                K k7 = this.d;
                int y3 = AbstractC0156a.y(k7.f9655B);
                List list = (List) n.get("Content-Type");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                int y4 = AbstractC0156a.y(str);
                int z10 = AbstractC0156a.z(c0148q.f4422a);
                int i12 = 7;
                ArrayList arrayList2 = new ArrayList(7);
                c.a(y3, arrayList2);
                c.a(y4, arrayList2);
                c.a(z10, arrayList2);
                int[] iArr = c.f1653b;
                for (int i13 = 0; i13 < 7; i13++) {
                    c.a(iArr[i13], arrayList2);
                }
                c0943h.f12168v = 0;
                int i14 = 0;
                InterfaceC0946k interfaceC0946k2 = null;
                while (true) {
                    if (i14 < arrayList2.size()) {
                        int intValue = ((Integer) arrayList2.get(i14)).intValue();
                        if (intValue != 0) {
                            if (intValue != i10) {
                                if (intValue != 2) {
                                    if (intValue != i12) {
                                        List list2 = this.f1707w;
                                        if (intValue != 8) {
                                            if (intValue != 11) {
                                                if (intValue != 13) {
                                                    arrayList = arrayList2;
                                                    j8 = j7;
                                                    c1265a = null;
                                                } else {
                                                    c1265a = new v(k7.f9678s, e7);
                                                    arrayList = arrayList2;
                                                }
                                            } else {
                                                if (list2 != null) {
                                                    i9 = 48;
                                                } else {
                                                    C0593J c0593j = new C0593J();
                                                    c0593j.f9605k = "application/cea-608";
                                                    list2 = Collections.singletonList(new K(c0593j));
                                                    i9 = 16;
                                                }
                                                String str2 = k7.f9684y;
                                                if (!TextUtils.isEmpty(str2)) {
                                                    arrayList = arrayList2;
                                                    if (Z2.r.b(str2, "audio/mp4a-latm") == null) {
                                                        i9 |= 2;
                                                    }
                                                    if (Z2.r.b(str2, "video/avc") == null) {
                                                        i9 |= 4;
                                                    }
                                                } else {
                                                    arrayList = arrayList2;
                                                }
                                                c1265a = new D(2, e7, new l6.n(i9, list2));
                                            }
                                            j8 = j7;
                                        } else {
                                            arrayList = arrayList2;
                                            C1461c c1461c = k7.f9685z;
                                            j8 = j7;
                                            if (c1461c != null) {
                                                int i15 = 0;
                                                while (true) {
                                                    InterfaceC1460b[] interfaceC1460bArr2 = c1461c.f16206q;
                                                    if (i15 >= interfaceC1460bArr2.length) {
                                                        break;
                                                    }
                                                    if (interfaceC1460bArr2[i15] instanceof u) {
                                                        if (!((u) interfaceC1460b).f1820s.isEmpty()) {
                                                            i8 = 4;
                                                        }
                                                    } else {
                                                        i15++;
                                                    }
                                                }
                                            }
                                            i8 = 0;
                                            if (list2 == null) {
                                                list2 = Collections.emptyList();
                                            }
                                            c1265a = new s2.j(i8, e7, list2);
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                        j8 = j7;
                                        c1265a = new C1117d(0L);
                                    }
                                } else {
                                    arrayList = arrayList2;
                                    j8 = j7;
                                    c1265a = new C1268d();
                                }
                            } else {
                                arrayList = arrayList2;
                                j8 = j7;
                                c1265a = new C1267c();
                            }
                        } else {
                            arrayList = arrayList2;
                            j8 = j7;
                            c1265a = new C1265a();
                        }
                        c1265a.getClass();
                        try {
                            if (c1265a.j(c0943h)) {
                                bVar = new b(c1265a, k7, e7);
                                break;
                            }
                        } catch (EOFException unused3) {
                        } finally {
                            c0943h.f12168v = 0;
                        }
                        if (interfaceC0946k2 == null && (intValue == y3 || intValue == y4 || intValue == z10 || intValue == 11)) {
                            interfaceC0946k2 = c1265a;
                        }
                        i14++;
                        arrayList2 = arrayList;
                        j7 = j8;
                        i10 = 1;
                        i12 = 7;
                    } else {
                        j8 = j7;
                        i7 = 0;
                        interfaceC0946k2.getClass();
                        bVar = new b(interfaceC0946k2, k7, e7);
                        break;
                    }
                }
            }
            this.f1688D = bVar;
            InterfaceC0946k interfaceC0946k3 = bVar.f1650a;
            if (!(interfaceC0946k3 instanceof C1268d) && !(interfaceC0946k3 instanceof C1265a) && !(interfaceC0946k3 instanceof C1267c) && !(interfaceC0946k3 instanceof C1117d)) {
                r rVar = this.f1689E;
                if (rVar.f1798l0 != 0) {
                    rVar.f1798l0 = 0L;
                    q[] qVarArr = rVar.f1773L;
                    int length = qVarArr.length;
                    for (int i16 = i7; i16 < length; i16++) {
                        q qVar = qVarArr[i16];
                        if (qVar.F != 0) {
                            qVar.F = 0L;
                            qVar.f1048z = true;
                        }
                    }
                }
            } else {
                r rVar2 = this.f1689E;
                if (j8 != -9223372036854775807L) {
                    j9 = e7.b(j8);
                } else {
                    j9 = this.f1321g;
                }
                if (rVar2.f1798l0 != j9) {
                    rVar2.f1798l0 = j9;
                    q[] qVarArr2 = rVar2.f1773L;
                    int length2 = qVarArr2.length;
                    for (int i17 = i7; i17 < length2; i17++) {
                        q qVar2 = qVarArr2[i17];
                        if (qVar2.F != j9) {
                            qVar2.F = j9;
                            qVar2.f1048z = true;
                        }
                    }
                }
            }
            this.f1689E.f1775N.clear();
            this.f1688D.f1650a.e(this.f1689E);
        } else {
            i7 = 0;
        }
        r rVar3 = this.f1689E;
        j2.i iVar = rVar3.f1799m0;
        j2.i iVar2 = this.f1708x;
        if (!H.a(iVar, iVar2)) {
            rVar3.f1799m0 = iVar2;
            int i18 = i7;
            while (true) {
                q[] qVarArr3 = rVar3.f1773L;
                if (i18 >= qVarArr3.length) {
                    break;
                }
                if (rVar3.f1791e0[i18]) {
                    q qVar3 = qVarArr3[i18];
                    qVar3.f1761I = iVar2;
                    qVar3.f1048z = true;
                }
                i18++;
            }
        }
        return c0943h;
    }
}
