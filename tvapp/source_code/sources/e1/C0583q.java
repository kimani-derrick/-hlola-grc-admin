package e1;

import W5.AbstractC0117y;
import h6.B;
import h6.G;
import h6.InterfaceC0752b;
import h6.J;
import x5.C1467a;
/* renamed from: e1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583q implements InterfaceC0752b {

    /* renamed from: q  reason: collision with root package name */
    public final C1467a f9411q;

    /* renamed from: r  reason: collision with root package name */
    public final e6.d f9412r = e6.e.a();

    public C0583q(C1467a c1467a) {
        this.f9411q = c1467a;
    }

    @Override // h6.InterfaceC0752b
    public final B i(J j7, G g7) {
        M5.g.f(g7, "response");
        return (B) AbstractC0117y.t(new C0582p(this, g7, null));
    }
}
