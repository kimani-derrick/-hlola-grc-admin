package o5;

import n5.k;
import n5.n;
import n5.q;
/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: a  reason: collision with root package name */
    public final k f12950a;

    public a(k kVar) {
        this.f12950a = kVar;
    }

    @Override // n5.k
    public final Object b(n nVar) {
        if (nVar.V() == 9) {
            nVar.y();
            return null;
        }
        return this.f12950a.b(nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        if (obj == null) {
            qVar.n();
        } else {
            this.f12950a.f(qVar, obj);
        }
    }

    public final String toString() {
        return this.f12950a + ".nullSafe()";
    }
}
