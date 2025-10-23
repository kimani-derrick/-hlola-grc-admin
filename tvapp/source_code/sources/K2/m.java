package K2;

import H2.A;
import H2.AbstractC0000a;
import H2.C0016q;
import H2.InterfaceC0022x;
import O3.E;
import Y2.InterfaceC0143l;
import Y2.J;
import Y2.N;
import Y2.P;
import Y2.W;
import Z2.AbstractC0156a;
import Z2.H;
import android.net.Uri;
import android.os.Looper;
import e2.AbstractC0592I;
import e2.T;
import e2.U;
import e2.Z;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class m extends AbstractC0000a implements L2.r {

    /* renamed from: h  reason: collision with root package name */
    public final j f1735h;

    /* renamed from: i  reason: collision with root package name */
    public final U f1736i;

    /* renamed from: j  reason: collision with root package name */
    public final T4.c f1737j;

    /* renamed from: k  reason: collision with root package name */
    public final J3.e f1738k;

    /* renamed from: l  reason: collision with root package name */
    public final j2.q f1739l;

    /* renamed from: m  reason: collision with root package name */
    public final L4.f f1740m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1741o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1742p;

    /* renamed from: q  reason: collision with root package name */
    public final L2.c f1743q;

    /* renamed from: r  reason: collision with root package name */
    public final long f1744r;

    /* renamed from: s  reason: collision with root package name */
    public final Z f1745s;

    /* renamed from: t  reason: collision with root package name */
    public final long f1746t;

    /* renamed from: u  reason: collision with root package name */
    public T f1747u;

    /* renamed from: v  reason: collision with root package name */
    public W f1748v;

    static {
        AbstractC0592I.a("goog.exo.hls");
    }

    public m(Z z7, T4.c cVar, c cVar2, J3.e eVar, j2.q qVar, L4.f fVar, L2.c cVar3, long j7, boolean z8, int i7) {
        U u7 = z7.f9805r;
        u7.getClass();
        this.f1736i = u7;
        this.f1745s = z7;
        this.f1747u = z7.f9806s;
        this.f1737j = cVar;
        this.f1735h = cVar2;
        this.f1738k = eVar;
        this.f1739l = qVar;
        this.f1740m = fVar;
        this.f1743q = cVar3;
        this.f1744r = j7;
        this.n = z8;
        this.f1741o = i7;
        this.f1742p = false;
        this.f1746t = 0L;
    }

    public static L2.d r(E e3, long j7) {
        L2.d dVar = null;
        for (int i7 = 0; i7 < e3.size(); i7++) {
            L2.d dVar2 = (L2.d) e3.get(i7);
            int i8 = (dVar2.f1960u > j7 ? 1 : (dVar2.f1960u == j7 ? 0 : -1));
            if (i8 <= 0 && dVar2.f1948B) {
                dVar = dVar2;
            } else if (i8 > 0) {
                break;
            }
        }
        return dVar;
    }

    @Override // H2.AbstractC0000a
    public final InterfaceC0022x a(A a7, Y2.r rVar, long j7) {
        C.d dVar = new C.d((CopyOnWriteArrayList) this.f1011c.f326t, 0, a7);
        j2.n nVar = new j2.n(this.d.f11835c, 0, a7);
        W w7 = this.f1748v;
        f2.m mVar = this.f1013g;
        AbstractC0156a.l(mVar);
        return new l(this.f1735h, this.f1743q, this.f1737j, w7, this.f1739l, nVar, this.f1740m, dVar, rVar, this.f1738k, this.n, this.f1741o, this.f1742p, mVar, this.f1746t);
    }

    @Override // H2.AbstractC0000a
    public final Z g() {
        return this.f1745s;
    }

    @Override // H2.AbstractC0000a
    public final void i() {
        IOException iOException;
        IOException iOException2;
        L2.c cVar = this.f1743q;
        N n = cVar.f1944w;
        if (n != null) {
            IOException iOException3 = n.f4343c;
            if (iOException3 == null) {
                J j7 = n.f4342b;
                if (j7 != null && (iOException2 = j7.f4334t) != null && j7.f4335u > j7.f4331q) {
                    throw iOException2;
                }
            } else {
                throw iOException3;
            }
        }
        Uri uri = cVar.f1934A;
        if (uri != null) {
            L2.b bVar = (L2.b) cVar.f1941t.get(uri);
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
    }

    @Override // H2.AbstractC0000a
    public final void k(W w7) {
        this.f1748v = w7;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        f2.m mVar = this.f1013g;
        AbstractC0156a.l(mVar);
        j2.q qVar = this.f1739l;
        qVar.h(myLooper, mVar);
        qVar.m();
        boolean z7 = false;
        C.d dVar = new C.d((CopyOnWriteArrayList) this.f1011c.f326t, 0, (A) null);
        Uri uri = this.f1736i.f9761q;
        L2.c cVar = this.f1743q;
        cVar.getClass();
        cVar.f1945x = H.n(null);
        cVar.f1943v = dVar;
        cVar.f1946y = this;
        P p3 = new P(((InterfaceC0143l) cVar.f1938q.f3382r).f(), uri, cVar.f1939r.i());
        if (cVar.f1944w == null) {
            z7 = true;
        }
        AbstractC0156a.k(z7);
        N n = new N("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f1944w = n;
        L4.f fVar = cVar.f1940s;
        int i7 = p3.f4346c;
        n.d(p3, cVar, fVar.K(i7));
        dVar.s(new C0016q(p3.f4345b), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // H2.AbstractC0000a
    public final void m(InterfaceC0022x interfaceC0022x) {
        r[] rVarArr;
        q[] qVarArr;
        l lVar = (l) interfaceC0022x;
        lVar.f1726r.f1942u.remove(lVar);
        for (r rVar : lVar.f1721L) {
            if (rVar.f1781T) {
                for (q qVar : rVar.f1773L) {
                    qVar.i();
                    j2.k kVar = qVar.f1031h;
                    if (kVar != null) {
                        kVar.a(qVar.f1029e);
                        qVar.f1031h = null;
                        qVar.f1030g = null;
                    }
                }
            }
            rVar.f1810z.c(rVar);
            rVar.f1769H.removeCallbacksAndMessages(null);
            rVar.f1784X = true;
            rVar.f1770I.clear();
        }
        lVar.f1718I = null;
    }

    @Override // H2.AbstractC0000a
    public final void o() {
        L2.c cVar = this.f1743q;
        cVar.f1934A = null;
        cVar.f1935B = null;
        cVar.f1947z = null;
        cVar.f1937D = -9223372036854775807L;
        cVar.f1944w.c(null);
        cVar.f1944w = null;
        HashMap hashMap = cVar.f1941t;
        for (L2.b bVar : hashMap.values()) {
            bVar.f1924r.c(null);
        }
        cVar.f1945x.removeCallbacksAndMessages(null);
        cVar.f1945x = null;
        hashMap.clear();
        this.f1739l.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        if (r52.n != (-9223372036854775807L)) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object, K2.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(L2.i r52) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.m.s(L2.i):void");
    }
}
