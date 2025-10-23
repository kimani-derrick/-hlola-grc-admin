package j6;

import M5.g;
import U5.n;
import androidx.fragment.app.D;
import h6.A;
import h6.B;
import h6.F;
import h6.G;
import h6.I;
import h6.q;
import h6.r;
import h6.u;
import l6.i;
import m6.e;
/* loaded from: classes.dex */
public final class b implements u {
    @Override // h6.u
    public final G a(e eVar) {
        r rVar;
        r rVar2;
        System.currentTimeMillis();
        B b7 = eVar.f12450e;
        g.f(b7, "request");
        D d = new D(b7, null, 16, false);
        if (b7.a().f11136j) {
            d = new D(null, null, 16, false);
        }
        i iVar = eVar.f12447a;
        boolean z7 = iVar instanceof i;
        B b8 = (B) d.f5883r;
        G g7 = (G) d.f5884s;
        if (b8 == null && g7 == null) {
            q qVar = new q(0);
            G g8 = new G(b7, A.f11063s, "Unsatisfiable Request (only-if-cached)", 504, null, qVar.c(), i6.b.f11392c, null, null, null, -1L, System.currentTimeMillis(), null);
            g.f(iVar, "call");
            return g8;
        } else if (b8 == null) {
            g.c(g7);
            F h7 = g7.h();
            G a7 = a.a(g7);
            F.b(a7, "cacheResponse");
            h7.f11086i = a7;
            G a8 = h7.a();
            g.f(iVar, "call");
            return a8;
        } else {
            if (g7 != null) {
                g.f(iVar, "call");
            }
            G b9 = eVar.b(b8);
            if (g7 != null) {
                if (b9.f11098t == 304) {
                    F h8 = g7.h();
                    q qVar2 = new q(0);
                    r rVar3 = g7.f11100v;
                    int size = rVar3.size();
                    int i7 = 0;
                    while (true) {
                        rVar = b9.f11100v;
                        if (i7 >= size) {
                            break;
                        }
                        int i8 = i7 + 1;
                        String f = rVar3.f(i7);
                        String h9 = rVar3.h(i7);
                        if (n.W("Warning", f)) {
                            rVar2 = rVar3;
                            if (n.b0(h9, "1", false)) {
                                i7 = i8;
                                rVar3 = rVar2;
                            }
                        } else {
                            rVar2 = rVar3;
                        }
                        if (n.W("Content-Length", f) || n.W("Content-Encoding", f) || n.W("Content-Type", f) || !a.b(f) || rVar.b(f) == null) {
                            qVar2.b(f, h9);
                        }
                        i7 = i8;
                        rVar3 = rVar2;
                    }
                    int i9 = 0;
                    int size2 = rVar.size();
                    while (true) {
                        int i10 = i9;
                        if (i10 >= size2) {
                            break;
                        }
                        i9 = i10 + 1;
                        String f7 = rVar.f(i10);
                        if (!n.W("Content-Length", f7) && !n.W("Content-Encoding", f7) && !n.W("Content-Type", f7) && a.b(f7)) {
                            qVar2.b(f7, rVar.h(i10));
                        }
                    }
                    h8.f = qVar2.c().g();
                    h8.f11088k = b9.f11091A;
                    h8.f11089l = b9.f11092B;
                    G a9 = a.a(g7);
                    F.b(a9, "cacheResponse");
                    h8.f11086i = a9;
                    G a10 = a.a(b9);
                    F.b(a10, "networkResponse");
                    h8.f11085h = a10;
                    h8.a();
                    I i11 = b9.f11101w;
                    g.c(i11);
                    i11.close();
                    g.c(null);
                    throw null;
                }
                I i12 = g7.f11101w;
                if (i12 != null) {
                    i6.b.d(i12);
                }
            }
            F h10 = b9.h();
            G a11 = a.a(g7);
            F.b(a11, "cacheResponse");
            h10.f11086i = a11;
            G a12 = a.a(b9);
            F.b(a12, "networkResponse");
            h10.f11085h = a12;
            return h10.a();
        }
    }
}
