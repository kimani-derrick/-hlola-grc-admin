package o1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class t extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f12876u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerActivity f12877v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(D5.d dVar, TvPlayerActivity tvPlayerActivity) {
        super(2, dVar);
        this.f12877v = tvPlayerActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        t tVar = new t(dVar, this.f12877v);
        tVar.f12876u = obj;
        return tVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((t) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f12876u;
        TvPlayerActivity tvPlayerActivity = this.f12877v;
        AbstractC0117y.p(interfaceC0116x, null, 0, new l(null, tvPlayerActivity), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new n(null, tvPlayerActivity), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new o(null, tvPlayerActivity), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new q(null, tvPlayerActivity), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new s(null, tvPlayerActivity), 3);
        return C1530l.f16479a;
    }
}
