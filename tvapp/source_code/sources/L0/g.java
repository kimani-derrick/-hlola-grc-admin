package L0;

import U5.n;
import W5.AbstractC0117y;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p6.l;
import v6.InterfaceC1342g;
import v6.r;
import v6.w;
import v6.y;
import w4.l0;
import z5.C1530l;
/* loaded from: classes.dex */
public final class g implements Closeable, Flushable {

    /* renamed from: G  reason: collision with root package name */
    public static final U5.d f1877G = new U5.d("[a-z0-9_-]{1,120}");

    /* renamed from: A  reason: collision with root package name */
    public boolean f1878A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f1879B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f1880C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f1881D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f1882E;
    public final e F;

    /* renamed from: q  reason: collision with root package name */
    public final w f1883q;

    /* renamed from: r  reason: collision with root package name */
    public final long f1884r;

    /* renamed from: s  reason: collision with root package name */
    public final w f1885s;

    /* renamed from: t  reason: collision with root package name */
    public final w f1886t;

    /* renamed from: u  reason: collision with root package name */
    public final w f1887u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f1888v;

    /* renamed from: w  reason: collision with root package name */
    public final b6.e f1889w;

    /* renamed from: x  reason: collision with root package name */
    public long f1890x;

    /* renamed from: y  reason: collision with root package name */
    public int f1891y;

    /* renamed from: z  reason: collision with root package name */
    public InterfaceC1342g f1892z;

    public g(long j7, d6.c cVar, r rVar, w wVar) {
        this.f1883q = wVar;
        this.f1884r = j7;
        if (j7 > 0) {
            this.f1885s = wVar.c("journal");
            this.f1886t = wVar.c("journal.tmp");
            this.f1887u = wVar.c("journal.bkp");
            this.f1888v = new LinkedHashMap(0, 0.75f, true);
            this.f1889w = AbstractC0117y.a(p6.d.A(AbstractC0117y.b(), cVar.X(1)));
            this.F = new e(rVar);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static void X(String str) {
        U5.d dVar = f1877G;
        dVar.getClass();
        M5.g.f(str, "input");
        if (dVar.f3486q.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public static final void a(g gVar, b bVar, boolean z7) {
        long j7;
        synchronized (gVar) {
            c cVar = (c) bVar.f1863b;
            if (M5.g.a(cVar.f1869g, bVar)) {
                if (z7 && !cVar.f) {
                    for (int i7 = 0; i7 < 2; i7++) {
                        if (((boolean[]) bVar.f1864c)[i7] && !gVar.F.f((w) cVar.d.get(i7))) {
                            bVar.b(false);
                            break;
                        }
                    }
                    for (int i8 = 0; i8 < 2; i8++) {
                        w wVar = (w) cVar.d.get(i8);
                        w wVar2 = (w) cVar.f1867c.get(i8);
                        if (gVar.F.f(wVar)) {
                            gVar.F.b(wVar, wVar2);
                        } else {
                            e eVar = gVar.F;
                            w wVar3 = (w) cVar.f1867c.get(i8);
                            if (!eVar.f(wVar3)) {
                                X0.e.a(eVar.k(wVar3));
                            }
                        }
                        long j8 = cVar.f1866b[i8];
                        Long l7 = (Long) gVar.F.h(wVar2).f14615e;
                        if (l7 != null) {
                            j7 = l7.longValue();
                        } else {
                            j7 = 0;
                        }
                        cVar.f1866b[i8] = j7;
                        gVar.f1890x = (gVar.f1890x - j8) + j7;
                    }
                } else {
                    for (int i9 = 0; i9 < 2; i9++) {
                        gVar.F.e((w) cVar.d.get(i9));
                    }
                }
                cVar.f1869g = null;
                if (cVar.f) {
                    gVar.V(cVar);
                } else {
                    gVar.f1891y++;
                    InterfaceC1342g interfaceC1342g = gVar.f1892z;
                    M5.g.c(interfaceC1342g);
                    if (!z7 && !cVar.f1868e) {
                        gVar.f1888v.remove(cVar.f1865a);
                        interfaceC1342g.G("REMOVE");
                        interfaceC1342g.N(32);
                        interfaceC1342g.G(cVar.f1865a);
                        interfaceC1342g.N(10);
                        interfaceC1342g.flush();
                        if (gVar.f1890x <= gVar.f1884r || gVar.f1891y >= 2000) {
                            gVar.n();
                        }
                    }
                    cVar.f1868e = true;
                    interfaceC1342g.G("CLEAN");
                    interfaceC1342g.N(32);
                    interfaceC1342g.G(cVar.f1865a);
                    for (long j9 : cVar.f1866b) {
                        interfaceC1342g.N(32).I(j9);
                    }
                    interfaceC1342g.N(10);
                    interfaceC1342g.flush();
                    if (gVar.f1890x <= gVar.f1884r) {
                    }
                    gVar.n();
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public final void O(String str) {
        String substring;
        int i02 = U5.f.i0(str, ' ', 0, false, 6);
        if (i02 != -1) {
            int i7 = i02 + 1;
            int i03 = U5.f.i0(str, ' ', i7, false, 4);
            LinkedHashMap linkedHashMap = this.f1888v;
            if (i03 == -1) {
                substring = str.substring(i7);
                M5.g.e(substring, "this as java.lang.String).substring(startIndex)");
                if (i02 == 6 && n.b0(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i7, i03);
                M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new c(this, substring);
                linkedHashMap.put(substring, obj);
            }
            c cVar = (c) obj;
            if (i03 != -1 && i02 == 5 && n.b0(str, "CLEAN", false)) {
                String substring2 = str.substring(i03 + 1);
                M5.g.e(substring2, "this as java.lang.String).substring(startIndex)");
                List t02 = U5.f.t0(substring2, new char[]{' '});
                cVar.f1868e = true;
                cVar.f1869g = null;
                int size = t02.size();
                cVar.f1871i.getClass();
                if (size == 2) {
                    try {
                        int size2 = t02.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            cVar.f1866b[i8] = Long.parseLong((String) t02.get(i8));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        throw new IOException("unexpected journal line: " + t02);
                    }
                }
                throw new IOException("unexpected journal line: " + t02);
            } else if (i03 == -1 && i02 == 5 && n.b0(str, "DIRTY", false)) {
                cVar.f1869g = new b(this, cVar);
                return;
            } else if (i03 == -1 && i02 == 4 && n.b0(str, "READ", false)) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final void V(c cVar) {
        InterfaceC1342g interfaceC1342g;
        int i7 = cVar.f1870h;
        String str = cVar.f1865a;
        if (i7 > 0 && (interfaceC1342g = this.f1892z) != null) {
            interfaceC1342g.G("DIRTY");
            interfaceC1342g.N(32);
            interfaceC1342g.G(str);
            interfaceC1342g.N(10);
            interfaceC1342g.flush();
        }
        if (cVar.f1870h <= 0 && cVar.f1869g == null) {
            for (int i8 = 0; i8 < 2; i8++) {
                this.F.e((w) cVar.f1867c.get(i8));
                long j7 = this.f1890x;
                long[] jArr = cVar.f1866b;
                this.f1890x = j7 - jArr[i8];
                jArr[i8] = 0;
            }
            this.f1891y++;
            InterfaceC1342g interfaceC1342g2 = this.f1892z;
            if (interfaceC1342g2 != null) {
                interfaceC1342g2.G("REMOVE");
                interfaceC1342g2.N(32);
                interfaceC1342g2.G(str);
                interfaceC1342g2.N(10);
            }
            this.f1888v.remove(str);
            if (this.f1891y >= 2000) {
                n();
                return;
            }
            return;
        }
        cVar.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        V(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f1890x
            long r2 = r4.f1884r
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f1888v
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            L0.c r1 = (L0.c) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.V(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f1881D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.g.W():void");
    }

    public final synchronized void Y() {
        long[] jArr;
        try {
            InterfaceC1342g interfaceC1342g = this.f1892z;
            if (interfaceC1342g != null) {
                interfaceC1342g.close();
            }
            y b7 = l.b(this.F.k(this.f1886t));
            Throwable th = null;
            b7.G("libcore.io.DiskLruCache");
            b7.N(10);
            b7.G("1");
            b7.N(10);
            b7.I(1);
            b7.N(10);
            b7.I(2);
            b7.N(10);
            b7.N(10);
            for (c cVar : this.f1888v.values()) {
                if (cVar.f1869g != null) {
                    b7.G("DIRTY");
                    b7.N(32);
                    b7.G(cVar.f1865a);
                } else {
                    b7.G("CLEAN");
                    b7.N(32);
                    b7.G(cVar.f1865a);
                    for (long j7 : cVar.f1866b) {
                        b7.N(32);
                        b7.I(j7);
                    }
                }
                b7.N(10);
            }
            C1530l c1530l = C1530l.f16479a;
            try {
                b7.close();
            } catch (Throwable th2) {
                th = th2;
            }
            if (th == null) {
                M5.g.c(c1530l);
                if (this.F.f(this.f1885s)) {
                    this.F.b(this.f1885s, this.f1887u);
                    this.F.b(this.f1886t, this.f1885s);
                    this.F.e(this.f1887u);
                } else {
                    this.F.b(this.f1886t, this.f1885s);
                }
                this.f1892z = r();
                this.f1891y = 0;
                this.f1878A = false;
                this.f1882E = false;
            } else {
                throw th;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void b() {
        if (!this.f1880C) {
            return;
        }
        throw new IllegalStateException("cache is closed".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f1879B && !this.f1880C) {
                for (c cVar : (c[]) this.f1888v.values().toArray(new c[0])) {
                    b bVar = cVar.f1869g;
                    if (bVar != null) {
                        c cVar2 = (c) bVar.f1863b;
                        if (M5.g.a(cVar2.f1869g, bVar)) {
                            cVar2.f = true;
                        }
                    }
                }
                W();
                AbstractC0117y.d(this.f1889w);
                InterfaceC1342g interfaceC1342g = this.f1892z;
                M5.g.c(interfaceC1342g);
                interfaceC1342g.close();
                this.f1892z = null;
                this.f1880C = true;
                return;
            }
            this.f1880C = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized b f(String str) {
        b bVar;
        try {
            b();
            X(str);
            j();
            c cVar = (c) this.f1888v.get(str);
            if (cVar != null) {
                bVar = cVar.f1869g;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                return null;
            }
            if (cVar != null && cVar.f1870h != 0) {
                return null;
            }
            if (!this.f1881D && !this.f1882E) {
                InterfaceC1342g interfaceC1342g = this.f1892z;
                M5.g.c(interfaceC1342g);
                interfaceC1342g.G("DIRTY");
                interfaceC1342g.N(32);
                interfaceC1342g.G(str);
                interfaceC1342g.N(10);
                interfaceC1342g.flush();
                if (this.f1878A) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(this, str);
                    this.f1888v.put(str, cVar);
                }
                b bVar2 = new b(this, cVar);
                cVar.f1869g = bVar2;
                return bVar2;
            }
            n();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f1879B) {
            return;
        }
        b();
        W();
        InterfaceC1342g interfaceC1342g = this.f1892z;
        M5.g.c(interfaceC1342g);
        interfaceC1342g.flush();
    }

    public final synchronized d h(String str) {
        d a7;
        b();
        X(str);
        j();
        c cVar = (c) this.f1888v.get(str);
        if (cVar != null && (a7 = cVar.a()) != null) {
            this.f1891y++;
            InterfaceC1342g interfaceC1342g = this.f1892z;
            M5.g.c(interfaceC1342g);
            interfaceC1342g.G("READ");
            interfaceC1342g.N(32);
            interfaceC1342g.G(str);
            interfaceC1342g.N(10);
            if (this.f1891y >= 2000) {
                n();
            }
            return a7;
        }
        return null;
    }

    public final synchronized void j() {
        try {
            if (this.f1879B) {
                return;
            }
            this.F.e(this.f1886t);
            if (this.F.f(this.f1887u)) {
                if (this.F.f(this.f1885s)) {
                    this.F.e(this.f1887u);
                } else {
                    this.F.b(this.f1887u, this.f1885s);
                }
            }
            if (this.F.f(this.f1885s)) {
                try {
                    y();
                    x();
                    this.f1879B = true;
                    return;
                } catch (IOException unused) {
                    close();
                    l0.l(this.F, this.f1883q);
                    this.f1880C = false;
                }
            }
            Y();
            this.f1879B = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void n() {
        AbstractC0117y.p(this.f1889w, null, 0, new f(this, null), 3);
    }

    public final y r() {
        e eVar = this.F;
        eVar.getClass();
        w wVar = this.f1885s;
        M5.g.f(wVar, "file");
        return l.b(new h(eVar.f1875b.a(wVar), new A5.a(1, this)));
    }

    public final void x() {
        Iterator it = this.f1888v.values().iterator();
        long j7 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i7 = 0;
            if (cVar.f1869g == null) {
                while (i7 < 2) {
                    j7 += cVar.f1866b[i7];
                    i7++;
                }
            } else {
                cVar.f1869g = null;
                while (i7 < 2) {
                    e eVar = this.F;
                    eVar.e((w) cVar.f1867c.get(i7));
                    eVar.e((w) cVar.d.get(i7));
                    i7++;
                }
                it.remove();
            }
        }
        this.f1890x = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            L0.e r2 = r13.F
            v6.w r3 = r13.f1885s
            v6.F r2 = r2.l(r3)
            v6.z r2 = p6.l.c(r2)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            java.lang.String r6 = r2.o(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = r2.o(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = r2.o(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = r2.o(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = r2.o(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r11 = "libcore.io.DiskLruCache"
            boolean r11 = M5.g.a(r11, r6)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            java.lang.String r11 = "1"
            boolean r11 = M5.g.a(r11, r7)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            r11 = 1
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L61
            boolean r11 = M5.g.a(r11, r8)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            r11 = 2
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L61
            boolean r11 = M5.g.a(r11, r9)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            int r11 = r10.length()     // Catch: java.lang.Throwable -> L61
            if (r11 > 0) goto L84
            r0 = 0
        L57:
            java.lang.String r1 = r2.o(r3)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            r13.O(r1)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            int r0 = r0 + 1
            goto L57
        L61:
            r0 = move-exception
            goto Lb3
        L63:
            java.util.LinkedHashMap r1 = r13.f1888v     // Catch: java.lang.Throwable -> L61
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L61
            int r0 = r0 - r1
            r13.f1891y = r0     // Catch: java.lang.Throwable -> L61
            boolean r0 = r2.M()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L76
            r13.Y()     // Catch: java.lang.Throwable -> L61
            goto L7c
        L76:
            v6.y r0 = r13.r()     // Catch: java.lang.Throwable -> L61
            r13.f1892z = r0     // Catch: java.lang.Throwable -> L61
        L7c:
            z5.l r0 = z5.C1530l.f16479a     // Catch: java.lang.Throwable -> L61
            r2.close()     // Catch: java.lang.Throwable -> L82
            goto Lbe
        L82:
            r5 = move-exception
            goto Lbe
        L84:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r4.append(r6)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r7)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r8)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r9)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r10)     // Catch: java.lang.Throwable -> L61
            r0 = 93
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L61
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L61
            throw r3     // Catch: java.lang.Throwable -> L61
        Lb3:
            r2.close()     // Catch: java.lang.Throwable -> Lb7
            goto Lbb
        Lb7:
            r1 = move-exception
            android.support.v4.media.session.b.a(r0, r1)
        Lbb:
            r12 = r5
            r5 = r0
            r0 = r12
        Lbe:
            if (r5 != 0) goto Lc4
            M5.g.c(r0)
            return
        Lc4:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.g.y():void");
    }
}
