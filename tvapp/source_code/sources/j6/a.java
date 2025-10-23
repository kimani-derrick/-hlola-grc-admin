package j6;

import U5.n;
import h6.F;
import h6.G;
import h6.I;
/* loaded from: classes.dex */
public final class a {
    public static final G a(G g7) {
        I i7;
        if (g7 == null) {
            i7 = null;
        } else {
            i7 = g7.f11101w;
        }
        if (i7 != null) {
            F h7 = g7.h();
            h7.f11084g = null;
            return h7.a();
        }
        return g7;
    }

    public static boolean b(String str) {
        if (!n.W("Connection", str) && !n.W("Keep-Alive", str) && !n.W("Proxy-Authenticate", str) && !n.W("Proxy-Authorization", str) && !n.W("TE", str) && !n.W("Trailers", str) && !n.W("Transfer-Encoding", str) && !n.W("Upgrade", str)) {
            return true;
        }
        return false;
    }
}
