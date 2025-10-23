package A1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.search.TvSearchFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class g extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f32u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSearchFragment f33v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(D5.d dVar, TvSearchFragment tvSearchFragment) {
        super(2, dVar);
        this.f33v = tvSearchFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        g gVar = new g(dVar, this.f33v);
        gVar.f32u = obj;
        return gVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((g) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        AbstractC0117y.p((InterfaceC0116x) this.f32u, null, 0, new f(null, this.f33v), 3);
        return C1530l.f16479a;
    }
}
