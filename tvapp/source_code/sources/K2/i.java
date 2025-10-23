package K2;

import H2.C0001b;
import H2.m0;
import O3.C;
import O3.E;
import O3.U;
import O3.Z;
import Y2.C0148q;
import Y2.InterfaceC0143l;
import Y2.InterfaceC0144m;
import Y2.W;
import Z2.AbstractC0156a;
import Z2.H;
import android.net.Uri;
import android.util.Pair;
import e2.K;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final j f1666a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0144m f1667b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC0144m f1668c;
    public final T4.c d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri[] f1669e;
    public final K[] f;

    /* renamed from: g  reason: collision with root package name */
    public final L2.c f1670g;

    /* renamed from: h  reason: collision with root package name */
    public final m0 f1671h;

    /* renamed from: i  reason: collision with root package name */
    public final List f1672i;

    /* renamed from: k  reason: collision with root package name */
    public final f2.m f1674k;

    /* renamed from: l  reason: collision with root package name */
    public final long f1675l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1676m;

    /* renamed from: o  reason: collision with root package name */
    public C0001b f1677o;

    /* renamed from: p  reason: collision with root package name */
    public Uri f1678p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1679q;

    /* renamed from: r  reason: collision with root package name */
    public W2.q f1680r;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1682t;

    /* renamed from: j  reason: collision with root package name */
    public final T4.c f1673j = new T4.c(13);
    public byte[] n = H.f;

    /* renamed from: s  reason: collision with root package name */
    public long f1681s = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [K2.g, W2.q, W2.c] */
    public i(j jVar, L2.c cVar, Uri[] uriArr, K[] kArr, T4.c cVar2, W w7, T4.c cVar3, long j7, List list, f2.m mVar) {
        this.f1666a = jVar;
        this.f1670g = cVar;
        this.f1669e = uriArr;
        this.f = kArr;
        this.d = cVar3;
        this.f1675l = j7;
        this.f1672i = list;
        this.f1674k = mVar;
        InterfaceC0144m f = ((InterfaceC0143l) cVar2.f3382r).f();
        this.f1667b = f;
        if (w7 != null) {
            f.m(w7);
        }
        this.f1668c = ((InterfaceC0143l) cVar2.f3382r).f();
        this.f1671h = new m0("", kArr);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (int i8 = 0; i8 < uriArr.length; i8++) {
            if ((kArr[i8].f9680u & 16384) == 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        m0 m0Var = this.f1671h;
        int[] B02 = android.support.v4.media.session.b.B0(arrayList);
        ?? cVar4 = new W2.c(m0Var, B02);
        K k5 = m0Var.f1136t[B02[0]];
        while (true) {
            if (i7 < cVar4.f3783b) {
                if (cVar4.d[i7] == k5) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        cVar4.f1662g = i7;
        this.f1680r = cVar4;
    }

    public final J2.c[] a(k kVar, long j7) {
        int a7;
        boolean z7;
        int i7;
        List list;
        if (kVar == null) {
            a7 = -1;
        } else {
            a7 = this.f1671h.a(kVar.d);
        }
        int length = this.f1680r.length();
        J2.c[] cVarArr = new J2.c[length];
        boolean z8 = false;
        int i8 = 0;
        while (i8 < length) {
            int k5 = this.f1680r.k(i8);
            Uri uri = this.f1669e[k5];
            L2.c cVar = this.f1670g;
            if (!cVar.e(uri)) {
                cVarArr[i8] = J2.c.f1325b;
                i7 = i8;
            } else {
                L2.i a8 = cVar.a(uri, z8);
                a8.getClass();
                long j8 = a8.f1972h - cVar.f1937D;
                if (k5 != a7) {
                    z7 = true;
                } else {
                    z7 = z8;
                }
                i7 = i8;
                Pair c5 = c(kVar, z7, a8, j8, j7);
                long longValue = ((Long) c5.first).longValue();
                int intValue = ((Integer) c5.second).intValue();
                int i9 = (int) (longValue - a8.f1975k);
                if (i9 >= 0) {
                    E e3 = a8.f1981r;
                    if (e3.size() >= i9) {
                        ArrayList arrayList = new ArrayList();
                        if (i9 < e3.size()) {
                            if (intValue != -1) {
                                L2.f fVar = (L2.f) e3.get(i9);
                                if (intValue == 0) {
                                    arrayList.add(fVar);
                                } else if (intValue < fVar.f1954C.size()) {
                                    E e7 = fVar.f1954C;
                                    arrayList.addAll(e7.subList(intValue, e7.size()));
                                }
                                i9++;
                            }
                            arrayList.addAll(e3.subList(i9, e3.size()));
                            intValue = 0;
                        }
                        if (a8.n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            E e8 = a8.f1982s;
                            if (intValue < e8.size()) {
                                arrayList.addAll(e8.subList(intValue, e8.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        cVarArr[i7] = new f(j8, list);
                    }
                }
                C c6 = E.f2597r;
                list = U.f2621u;
                cVarArr[i7] = new f(j8, list);
            }
            i8 = i7 + 1;
            z8 = false;
        }
        return cVarArr;
    }

    public final int b(k kVar) {
        E e3;
        if (kVar.f1699o == -1) {
            return 1;
        }
        L2.i a7 = this.f1670g.a(this.f1669e[this.f1671h.a(kVar.d)], false);
        a7.getClass();
        int i7 = (int) (kVar.f1324j - a7.f1975k);
        if (i7 < 0) {
            return 1;
        }
        E e7 = a7.f1981r;
        if (i7 < e7.size()) {
            e3 = ((L2.f) e7.get(i7)).f1954C;
        } else {
            e3 = a7.f1982s;
        }
        int size = e3.size();
        int i8 = kVar.f1699o;
        if (i8 >= size) {
            return 2;
        }
        L2.d dVar = (L2.d) e3.get(i8);
        if (dVar.f1949C) {
            return 0;
        }
        if (H.a(Uri.parse(AbstractC0156a.G(a7.f2000a, dVar.f1956q)), kVar.f1318b.f4422a)) {
            return 1;
        }
        return 2;
    }

    public final Pair c(k kVar, boolean z7, L2.i iVar, long j7, long j8) {
        long j9;
        E e3;
        long j10 = 1;
        boolean z8 = true;
        int i7 = -1;
        if (kVar != null && !z7) {
            boolean z9 = kVar.f1692I;
            long j11 = kVar.f1324j;
            int i8 = kVar.f1699o;
            if (z9) {
                if (i8 == -1) {
                    if (j11 != -1) {
                        j11++;
                    } else {
                        j11 = -1;
                    }
                }
                Long valueOf = Long.valueOf(j11);
                if (i8 != -1) {
                    i7 = i8 + 1;
                }
                return new Pair(valueOf, Integer.valueOf(i7));
            }
            return new Pair(Long.valueOf(j11), Integer.valueOf(i8));
        }
        long j12 = j7 + iVar.f1984u;
        if (kVar != null && !this.f1679q) {
            j9 = kVar.f1321g;
        } else {
            j9 = j8;
        }
        boolean z10 = iVar.f1978o;
        long j13 = iVar.f1975k;
        E e7 = iVar.f1981r;
        if (!z10 && j9 >= j12) {
            return new Pair(Long.valueOf(j13 + e7.size()), -1);
        }
        long j14 = j9 - j7;
        Long valueOf2 = Long.valueOf(j14);
        int i9 = 0;
        if (this.f1670g.f1936C && kVar != null) {
            z8 = false;
        }
        int d = H.d(e7, valueOf2, z8);
        long j15 = d + j13;
        if (d >= 0) {
            L2.f fVar = (L2.f) e7.get(d);
            int i10 = (j14 > (fVar.f1960u + fVar.f1958s) ? 1 : (j14 == (fVar.f1960u + fVar.f1958s) ? 0 : -1));
            E e8 = iVar.f1982s;
            if (i10 < 0) {
                e3 = fVar.f1954C;
            } else {
                e3 = e8;
            }
            while (true) {
                if (i9 >= e3.size()) {
                    break;
                }
                L2.d dVar = (L2.d) e3.get(i9);
                if (j14 < dVar.f1960u + dVar.f1958s) {
                    if (dVar.f1948B) {
                        if (e3 != e8) {
                            j10 = 0;
                        }
                        j15 += j10;
                        i7 = i9;
                    }
                } else {
                    i9++;
                }
            }
        }
        return new Pair(Long.valueOf(j15), Integer.valueOf(i7));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [J2.a, K2.e] */
    public final e d(Uri uri, int i7, boolean z7) {
        if (uri == null) {
            return null;
        }
        T4.c cVar = this.f1673j;
        byte[] bArr = (byte[]) ((d) cVar.f3382r).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) cVar.f3382r).put(uri, bArr);
            return null;
        }
        Z z8 = Z.f2634w;
        Collections.emptyMap();
        C0148q c0148q = new C0148q(uri, 0L, 1, null, z8, 0L, -1L, null, 1, null);
        K k5 = this.f[i7];
        int f = this.f1680r.f();
        Object l7 = this.f1680r.l();
        byte[] bArr3 = this.n;
        ?? aVar = new J2.a(this.f1668c, c0148q, 3, k5, f, l7, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = H.f;
        }
        aVar.f1655j = bArr3;
        return aVar;
    }
}
