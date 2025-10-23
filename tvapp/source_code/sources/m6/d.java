package m6;

import M5.g;
import U5.n;
import h6.G;
import u4.C1288l;
import v6.C1344i;
/* loaded from: classes.dex */
public abstract class d {
    static {
        C1344i c1344i = C1344i.f15389t;
        C1288l.e("\"\\");
        C1288l.e("\t ,=");
    }

    public static final boolean a(G g7) {
        if (g.a(g7.f11095q.f11071b, "HEAD")) {
            return false;
        }
        int i7 = g7.f11098t;
        if (((i7 >= 100 && i7 < 200) || i7 == 204 || i7 == 304) && i6.b.k(g7) == -1 && !n.W("chunked", G.b(g7, "Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f9, code lost:
        if (r3.f3486q.matcher(r0).matches() == false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(h6.n r34, h6.t r35, h6.r r36) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.d.b(h6.n, h6.t, h6.r):void");
    }
}
