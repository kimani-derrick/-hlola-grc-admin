package s1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: s1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135j extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f13561u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvHomeFragment f13562v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1135j(TvHomeFragment tvHomeFragment, D5.d dVar) {
        super(2, dVar);
        this.f13562v = tvHomeFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C1135j c1135j = new C1135j(this.f13562v, dVar);
        c1135j.f13561u = obj;
        return c1135j;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1135j) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f13561u;
        TvHomeFragment tvHomeFragment = this.f13562v;
        AbstractC0117y.p(interfaceC0116x, null, 0, new C1128c(tvHomeFragment, null), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new C1130e(tvHomeFragment, null), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new C1132g(tvHomeFragment, null), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new C1134i(tvHomeFragment, null), 3);
        return C1530l.f16479a;
    }
}
