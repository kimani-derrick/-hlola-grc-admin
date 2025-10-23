package V;

import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: V.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087f extends F5.i implements L5.l {

    /* renamed from: u  reason: collision with root package name */
    public int f3547u;

    @Override // L5.l
    public final Object c(Object obj) {
        F5.i iVar = new F5.i(1, (D5.d) obj);
        C1530l c1530l = C1530l.f16479a;
        iVar.p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        int i7 = this.f3547u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
                return C1530l.f16479a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0958a.H(obj);
        this.f3547u = 1;
        throw null;
    }
}
