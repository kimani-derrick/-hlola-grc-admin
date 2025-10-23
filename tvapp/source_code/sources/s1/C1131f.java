package s1;

import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: s1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131f extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f13554u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvHomeFragment f13555v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1131f(TvHomeFragment tvHomeFragment, D5.d dVar) {
        super(2, dVar);
        this.f13555v = tvHomeFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C1131f c1131f = new C1131f(this.f13555v, dVar);
        c1131f.f13554u = obj;
        return c1131f;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1131f) h(dVar, (AbstractC1141p) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        AbstractC1141p abstractC1141p = (AbstractC1141p) this.f13554u;
        if (!M5.g.a(abstractC1141p, C1139n.f13566a) && (abstractC1141p instanceof C1140o)) {
            this.f13555v.O0(((C1140o) abstractC1141p).f13567a);
        }
        return C1530l.f16479a;
    }
}
