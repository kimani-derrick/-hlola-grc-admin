package e1;

import h6.B;
import h6.D;
import h6.E;
import h6.G;
import h6.u;
import h6.v;
import java.util.regex.Pattern;
/* renamed from: e1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570d implements u {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable, java.lang.Object, v6.f, v6.g] */
    @Override // h6.u
    public final G a(m6.e eVar) {
        E e3;
        B b7 = eVar.f12450e;
        if (!M5.g.a(b7.f11071b, "GET") && (e3 = b7.d) != 0) {
            try {
                ?? obj = new Object();
                e3.c(obj);
                byte[] b8 = g6.o.f10858a.b(obj.Y(obj.f15388r));
                p6.l.i(obj, null);
                H.e b9 = b7.b();
                Pattern pattern = v.d;
                v r3 = p6.l.r("application/octet-stream");
                String str = b7.f11071b;
                int hashCode = str.hashCode();
                if (hashCode != 79599) {
                    if (hashCode != 2461856) {
                        if (hashCode == 2012838315 && str.equals("DELETE")) {
                            int length = b8.length;
                            M5.g.f(b8, "<this>");
                            i6.b.c(b8.length, 0, length);
                            b9.A("DELETE", new D(r3, length, b8, 0));
                        }
                    } else if (str.equals("POST")) {
                        int length2 = b8.length;
                        M5.g.f(b8, "<this>");
                        i6.b.c(b8.length, 0, length2);
                        b9.A("POST", new D(r3, length2, b8, 0));
                    }
                } else if (str.equals("PUT")) {
                    int length3 = b8.length;
                    M5.g.f(b8, "<this>");
                    i6.b.c(b8.length, 0, length3);
                    b9.A("PUT", new D(r3, length3, b8, 0));
                }
                return eVar.b(b9.q());
            } catch (Exception unused) {
                return eVar.b(b7);
            }
        }
        return eVar.b(b7);
    }
}
