package x1;

import F5.i;
import L5.p;
import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.mylist.TvMyListFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class d extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f16196u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMyListFragment f16197v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TvMyListFragment tvMyListFragment, D5.d dVar) {
        super(2, dVar);
        this.f16197v = tvMyListFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        d dVar2 = new d(this.f16197v, dVar);
        dVar2.f16196u = obj;
        return dVar2;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((d) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        AbstractC0117y.p((InterfaceC0116x) this.f16196u, null, 0, new c(this.f16197v, null), 3);
        return C1530l.f16479a;
    }
}
