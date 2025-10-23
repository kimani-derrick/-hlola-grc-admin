package F1;

import W5.AbstractC0117y;
import W5.G;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.update.TVUpdateViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class v extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f658u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TVUpdateViewModel f659v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(TVUpdateViewModel tVUpdateViewModel, D5.d dVar) {
        super(2, dVar);
        this.f659v = tVUpdateViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new v(this.f659v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((v) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f658u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            d6.c cVar = G.f3946b;
            u uVar = new u(this.f659v, null);
            this.f658u = 1;
            if (AbstractC0117y.y(this, cVar, uVar) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
