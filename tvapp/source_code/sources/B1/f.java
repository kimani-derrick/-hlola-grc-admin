package B1;

import L5.p;
import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.settings.TvSettingsFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f164u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSettingsFragment f165v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(D5.d dVar, TvSettingsFragment tvSettingsFragment) {
        super(2, dVar);
        this.f165v = tvSettingsFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        f fVar = new f(dVar, this.f165v);
        fVar.f164u = obj;
        return fVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((f) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f164u;
        TvSettingsFragment tvSettingsFragment = this.f165v;
        AbstractC0117y.p(interfaceC0116x, null, 0, new c(null, tvSettingsFragment), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new e(null, tvSettingsFragment), 3);
        return C1530l.f16479a;
    }
}
