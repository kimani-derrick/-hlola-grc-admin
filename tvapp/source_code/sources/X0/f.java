package X0;

import W5.C0100g;
import W5.InterfaceC0099f;
import h6.G;
import h6.InterfaceC0755e;
import java.io.IOException;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f implements InterfaceC0755e, L5.l {

    /* renamed from: q  reason: collision with root package name */
    public final l6.i f4062q;

    /* renamed from: r  reason: collision with root package name */
    public final InterfaceC0099f f4063r;

    public f(l6.i iVar, C0100g c0100g) {
        this.f4062q = iVar;
        this.f4063r = c0100g;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        Throwable th = (Throwable) obj;
        try {
            this.f4062q.cancel();
        } catch (Throwable unused) {
        }
        return C1530l.f16479a;
    }

    @Override // h6.InterfaceC0755e
    public final void g(G g7) {
        this.f4063r.m(g7);
    }

    @Override // h6.InterfaceC0755e
    public final void i(l6.i iVar, IOException iOException) {
        if (!iVar.F) {
            this.f4063r.m(AbstractC0958a.m(iOException));
        }
    }
}
