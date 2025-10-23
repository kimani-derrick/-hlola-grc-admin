package V;

import W5.AbstractC0117y;
import W5.C0107n;
import W5.C0109p;
import java.util.concurrent.CancellationException;
import z5.C1530l;
/* loaded from: classes.dex */
public final class q extends M5.h implements L5.p {

    /* renamed from: r  reason: collision with root package name */
    public static final q f3565r = new M5.h(2);

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        Object a02;
        o oVar = (o) obj;
        Throwable th = (Throwable) obj2;
        M5.g.f(oVar, "msg");
        if (oVar instanceof n) {
            n nVar = (n) oVar;
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            C0107n c0107n = (C0107n) nVar.f3562b;
            c0107n.getClass();
            C0109p c0109p = new C0109p(th, false);
            do {
                a02 = c0107n.a0(c0107n.K(), c0109p);
                if (a02 == AbstractC0117y.d || a02 == AbstractC0117y.f4037e) {
                    break;
                }
            } while (a02 == AbstractC0117y.f);
        }
        return C1530l.f16479a;
    }
}
