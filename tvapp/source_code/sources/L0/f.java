package L0;

import L5.p;
import W5.InterfaceC0116x;
import java.io.IOException;
import k3.AbstractC0958a;
import p6.l;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f1876u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, D5.d dVar) {
        super(2, dVar);
        this.f1876u = gVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new f(this.f1876u, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((f) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [v6.D, java.lang.Object] */
    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        g gVar = this.f1876u;
        synchronized (gVar) {
            if (gVar.f1879B && !gVar.f1880C) {
                try {
                    gVar.W();
                } catch (IOException unused) {
                    gVar.f1881D = true;
                }
                try {
                    if (gVar.f1891y >= 2000) {
                        gVar.Y();
                    }
                } catch (IOException unused2) {
                    gVar.f1882E = true;
                    gVar.f1892z = l.b(new Object());
                }
                return C1530l.f16479a;
            }
            return C1530l.f16479a;
        }
    }
}
