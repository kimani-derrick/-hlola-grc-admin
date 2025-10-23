package y6;

import h6.I;
import n5.k;
import n5.o;
import u4.C1288l;
import v6.C1344i;
import v6.InterfaceC1343h;
import x6.InterfaceC1480m;
/* loaded from: classes.dex */
public final class c implements InterfaceC1480m {

    /* renamed from: r  reason: collision with root package name */
    public static final C1344i f16375r;

    /* renamed from: q  reason: collision with root package name */
    public final k f16376q;

    static {
        C1344i c1344i = C1344i.f15389t;
        f16375r = C1288l.c("EFBBBF");
    }

    public c(k kVar) {
        this.f16376q = kVar;
    }

    @Override // x6.InterfaceC1480m
    public final Object o(Object obj) {
        I i7 = (I) obj;
        InterfaceC1343h f = i7.f();
        try {
            C1344i c1344i = f16375r;
            if (f.U(c1344i)) {
                f.p(c1344i.f15390q.length);
            }
            o oVar = new o(f);
            Object b7 = this.f16376q.b(oVar);
            if (oVar.V() == 10) {
                i7.close();
                return b7;
            }
            throw new RuntimeException("JSON document was not fully consumed.");
        } catch (Throwable th) {
            i7.close();
            throw th;
        }
    }
}
