package b6;

import W5.AbstractC0092a;
import W5.AbstractC0117y;
import w4.l0;
/* loaded from: classes.dex */
public class s extends AbstractC0092a implements F5.d {

    /* renamed from: t  reason: collision with root package name */
    public final D5.d f7210t;

    public s(D5.d dVar, D5.i iVar) {
        super(iVar, true);
        this.f7210t = dVar;
    }

    @Override // W5.j0
    public final boolean Q() {
        return true;
    }

    @Override // F5.d
    public final F5.d g() {
        D5.d dVar = this.f7210t;
        if (dVar instanceof F5.d) {
            return (F5.d) dVar;
        }
        return null;
    }

    @Override // W5.j0
    public void t(Object obj) {
        a.i(l0.x(this.f7210t), AbstractC0117y.r(obj), null);
    }

    @Override // W5.j0
    public void u(Object obj) {
        this.f7210t.m(AbstractC0117y.r(obj));
    }
}
