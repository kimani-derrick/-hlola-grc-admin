package S0;

import W5.InterfaceC0116x;
import androidx.lifecycle.InterfaceC0341t;
import coil.request.ViewTargetRequestDelegate;
import coil.target.GenericViewTarget;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class q extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ r f3064u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, D5.d dVar) {
        super(2, dVar);
        this.f3064u = rVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new q(this.f3064u, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((q) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        r rVar = this.f3064u;
        ViewTargetRequestDelegate viewTargetRequestDelegate = rVar.f3067s;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.f7280u.b(null);
            GenericViewTarget genericViewTarget = viewTargetRequestDelegate.f7278s;
            boolean z7 = genericViewTarget instanceof InterfaceC0341t;
            P1.c cVar = viewTargetRequestDelegate.f7279t;
            if (z7) {
                cVar.v(genericViewTarget);
            }
            cVar.v(viewTargetRequestDelegate);
        }
        rVar.f3067s = null;
        return C1530l.f16479a;
    }
}
