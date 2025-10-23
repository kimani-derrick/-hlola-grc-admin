package M0;

import U5.n;
import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import h6.B;
import h6.C0753c;
import h6.F;
import h6.G;
import h6.I;
import h6.v;
import java.io.IOException;
import r0.AbstractC1111a;
import u4.C1288l;
import v6.C1344i;
import v6.w;
import v6.y;
import v6.z;
import z5.C1530l;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class l implements g {
    public static final C0753c f = new C0753c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g  reason: collision with root package name */
    public static final C0753c f2167g = new C0753c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* renamed from: a  reason: collision with root package name */
    public final String f2168a;

    /* renamed from: b  reason: collision with root package name */
    public final S0.k f2169b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1522d f2170c;
    public final InterfaceC1522d d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2171e;

    public l(String str, S0.k kVar, InterfaceC1522d interfaceC1522d, InterfaceC1522d interfaceC1522d2, boolean z7) {
        this.f2168a = str;
        this.f2169b = kVar;
        this.f2170c = interfaceC1522d;
        this.d = interfaceC1522d2;
        this.f2171e = z7;
    }

    public static String d(String str, v vVar) {
        String str2;
        String b7;
        if (vVar != null) {
            str2 = vVar.f11213a;
        } else {
            str2 = null;
        }
        if ((str2 == null || n.b0(str2, "text/plain", false)) && (b7 = X0.e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b7;
        }
        if (str2 == null) {
            return null;
        }
        return U5.f.z0(str2, ';');
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0206 A[Catch: Exception -> 0x0203, TryCatch #3 {Exception -> 0x0203, blocks: (B:93:0x01d7, B:95:0x01dd, B:99:0x01ff, B:103:0x0206, B:104:0x020f), top: B:117:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0214 A[Catch: Exception -> 0x00d4, TryCatch #2 {Exception -> 0x00d4, blocks: (B:105:0x0210, B:106:0x0213, B:67:0x015b, B:107:0x0214, B:108:0x021d, B:36:0x009d, B:38:0x00a8, B:47:0x00d8, B:49:0x00dc, B:53:0x00f5, B:63:0x0141, B:55:0x010b, B:57:0x0117, B:58:0x0120, B:41:0x00be, B:43:0x00c6, B:60:0x0128, B:61:0x0133, B:62:0x0134), top: B:116:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[Catch: Exception -> 0x00d4, TRY_ENTER, TryCatch #2 {Exception -> 0x00d4, blocks: (B:105:0x0210, B:106:0x0213, B:67:0x015b, B:107:0x0214, B:108:0x021d, B:36:0x009d, B:38:0x00a8, B:47:0x00d8, B:49:0x00dc, B:53:0x00f5, B:63:0x0141, B:55:0x010b, B:57:0x0117, B:58:0x0120, B:41:0x00be, B:43:0x00c6, B:60:0x0128, B:61:0x0133, B:62:0x0134), top: B:116:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134 A[Catch: Exception -> 0x00d4, TryCatch #2 {Exception -> 0x00d4, blocks: (B:105:0x0210, B:106:0x0213, B:67:0x015b, B:107:0x0214, B:108:0x021d, B:36:0x009d, B:38:0x00a8, B:47:0x00d8, B:49:0x00dc, B:53:0x00f5, B:63:0x0141, B:55:0x010b, B:57:0x0117, B:58:0x0120, B:41:0x00be, B:43:0x00c6, B:60:0x0128, B:61:0x0133, B:62:0x0134), top: B:116:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dd A[Catch: Exception -> 0x0203, TryCatch #3 {Exception -> 0x0203, blocks: (B:93:0x01d7, B:95:0x01dd, B:99:0x01ff, B:103:0x0206, B:104:0x020f), top: B:117:0x01d7 }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // M0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(D5.d r19) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.l.a(D5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h6.B r6, D5.d r7) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.l.b(h6.B, D5.d):java.lang.Object");
    }

    public final v6.k c() {
        Object value = this.d.getValue();
        M5.g.c(value);
        return ((L0.j) value).f1896a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f A[LOOP:0: B:10:0x0069->B:12:0x006f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h6.B e() {
        /*
            r6 = this;
            H.e r0 = new H.e
            r1 = 6
            r0.<init>(r1)
            java.lang.String r1 = r6.f2168a
            java.lang.String r2 = "url"
            M5.g.f(r1, r2)
            java.lang.String r2 = "ws:"
            r3 = 1
            boolean r2 = U5.n.b0(r1, r2, r3)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            if (r2 == 0) goto L27
            r2 = 3
            java.lang.String r1 = r1.substring(r2)
            M5.g.e(r1, r4)
            java.lang.String r2 = "http:"
        L22:
            java.lang.String r1 = M5.g.k(r1, r2)
            goto L3a
        L27:
            java.lang.String r2 = "wss:"
            boolean r2 = U5.n.b0(r1, r2, r3)
            if (r2 == 0) goto L3a
            r2 = 4
            java.lang.String r1 = r1.substring(r2)
            M5.g.e(r1, r4)
            java.lang.String r2 = "https:"
            goto L22
        L3a:
            java.lang.String r2 = "<this>"
            M5.g.f(r1, r2)
            h6.s r2 = new h6.s
            r2.<init>()
            r3 = 0
            r2.e(r3, r1)
            h6.t r1 = r2.a()
            r0.f778s = r1
            S0.k r1 = r6.f2169b
            h6.r r2 = r1.f3049j
            java.lang.String r3 = "headers"
            M5.g.f(r2, r3)
            h6.q r2 = r2.g()
            r0.f779t = r2
            S0.p r2 = r1.f3050k
            java.util.Map r2 = r2.f3063a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L69:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L88
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.Class<kotlin.Any>"
            M5.g.d(r4, r5)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r3 = r3.getValue()
            r0.D(r4, r3)
            goto L69
        L88:
            int r2 = r1.n
            boolean r3 = r0.AbstractC1111a.i(r2)
            int r1 = r1.f3053o
            boolean r1 = r0.AbstractC1111a.i(r1)
            if (r1 != 0) goto L9e
            if (r3 == 0) goto L9e
            h6.c r1 = h6.C0753c.f11128o
        L9a:
            r0.t(r1)
            goto Lb5
        L9e:
            if (r1 == 0) goto Lae
            if (r3 != 0) goto Lae
            boolean r1 = r0.AbstractC1111a.k(r2)
            if (r1 == 0) goto Lab
            h6.c r1 = h6.C0753c.n
            goto L9a
        Lab:
            h6.c r1 = M0.l.f
            goto L9a
        Lae:
            if (r1 != 0) goto Lb5
            if (r3 != 0) goto Lb5
            h6.c r1 = M0.l.f2167g
            goto L9a
        Lb5:
            h6.B r0 = r0.q()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.l.e():h6.B");
    }

    public final R0.b f(L0.i iVar) {
        try {
            v6.k c5 = c();
            L0.d dVar = iVar.f1895q;
            if (!dVar.f1873r) {
                z c6 = p6.l.c(c5.l((w) dVar.f1872q.f1867c.get(0)));
                R0.b bVar = new R0.b(c6);
                try {
                    c6.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                if (th == null) {
                    M5.g.c(bVar);
                    return bVar;
                }
                throw th;
            }
            throw new IllegalStateException("snapshot is closed".toString());
        } catch (IOException unused) {
            return null;
        }
    }

    public final K0.k g(L0.i iVar) {
        L0.d dVar = iVar.f1895q;
        if (!dVar.f1873r) {
            w wVar = (w) dVar.f1872q.f1867c.get(1);
            v6.k c5 = c();
            String str = this.f2169b.f3048i;
            if (str == null) {
                str = this.f2168a;
            }
            return new K0.k(wVar, c5, str, iVar);
        }
        throw new IllegalStateException("snapshot is closed".toString());
    }

    public final L0.i h(L0.i iVar, B b7, G g7, R0.b bVar) {
        T4.c cVar;
        Throwable th;
        C1530l c1530l;
        Long l7;
        C1530l c1530l2;
        L0.b f7;
        Throwable th2 = null;
        if (AbstractC1111a.k(this.f2169b.n) && (!this.f2171e || (!b7.a().f11130b && !g7.a().f11130b && !M5.g.a(g7.f11100v.b("Vary"), "*")))) {
            if (iVar != null) {
                L0.d dVar = iVar.f1895q;
                L0.g gVar = dVar.f1874s;
                synchronized (gVar) {
                    dVar.close();
                    f7 = gVar.f(dVar.f1872q.f1865a);
                }
                if (f7 != null) {
                    cVar = new T4.c(16, f7);
                }
                cVar = null;
            } else {
                L0.j jVar = (L0.j) this.d.getValue();
                if (jVar != null) {
                    String str = this.f2169b.f3048i;
                    if (str == null) {
                        str = this.f2168a;
                    }
                    L0.g gVar2 = jVar.f1897b;
                    C1344i c1344i = C1344i.f15389t;
                    L0.b f8 = gVar2.f(C1288l.e(str).c("SHA-256").e());
                    if (f8 != null) {
                        cVar = new T4.c(16, f8);
                    }
                }
                cVar = null;
            }
            if (cVar == null) {
                return null;
            }
            try {
                try {
                    if (g7.f11098t == 304 && bVar != null) {
                        F h7 = g7.h();
                        h7.f = m3.g.f(bVar.f, g7.f11100v).g();
                        G a7 = h7.a();
                        y b8 = p6.l.b(c().k(((L0.b) cVar.f3382r).g(0)));
                        try {
                            new R0.b(a7).a(b8);
                            c1530l2 = C1530l.f16479a;
                            try {
                                b8.close();
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } catch (Throwable th4) {
                            try {
                                b8.close();
                            } catch (Throwable th5) {
                                android.support.v4.media.session.b.a(th4, th5);
                            }
                            th2 = th4;
                            c1530l2 = null;
                        }
                        if (th2 == null) {
                            M5.g.c(c1530l2);
                        } else {
                            throw th2;
                        }
                    } else {
                        y b9 = p6.l.b(c().k(((L0.b) cVar.f3382r).g(0)));
                        try {
                            new R0.b(g7).a(b9);
                            c1530l = C1530l.f16479a;
                            try {
                                b9.close();
                                th = null;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            try {
                                b9.close();
                            } catch (Throwable th8) {
                                android.support.v4.media.session.b.a(th7, th8);
                            }
                            th = th7;
                            c1530l = null;
                        }
                        if (th == null) {
                            M5.g.c(c1530l);
                            y b10 = p6.l.b(c().k(((L0.b) cVar.f3382r).g(1)));
                            try {
                                I i7 = g7.f11101w;
                                M5.g.c(i7);
                                l7 = Long.valueOf(i7.f().R(b10));
                                try {
                                    b10.close();
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            } catch (Throwable th10) {
                                try {
                                    b10.close();
                                } catch (Throwable th11) {
                                    android.support.v4.media.session.b.a(th10, th11);
                                }
                                th2 = th10;
                                l7 = null;
                            }
                            if (th2 == null) {
                                M5.g.c(l7);
                            } else {
                                throw th2;
                            }
                        } else {
                            throw th;
                        }
                    }
                    L0.i K6 = cVar.K();
                    X0.e.a(g7);
                    return K6;
                } catch (Exception e3) {
                    Bitmap.Config[] configArr = X0.e.f4059a;
                    try {
                        ((L0.b) cVar.f3382r).b(false);
                    } catch (Exception unused) {
                    }
                    throw e3;
                }
            } catch (Throwable th12) {
                X0.e.a(g7);
                throw th12;
            }
        }
        if (iVar != null) {
            X0.e.a(iVar);
        }
        return null;
    }
}
