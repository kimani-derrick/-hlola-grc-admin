package E1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.tvseries.TvSeriesFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class i extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f554u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSeriesFragment f555v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TvSeriesFragment tvSeriesFragment, D5.d dVar) {
        super(2, dVar);
        this.f555v = tvSeriesFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        i iVar = new i(this.f555v, dVar);
        iVar.f554u = obj;
        return iVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((i) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f554u;
        TvSeriesFragment tvSeriesFragment = this.f555v;
        AbstractC0117y.p(interfaceC0116x, null, 0, new d(tvSeriesFragment, null), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new f(tvSeriesFragment, null), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new h(tvSeriesFragment, null), 3);
        return C1530l.f16479a;
    }
}
