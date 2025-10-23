package F1;

import com.boxhdo.android.tv.ui.update.TVUpdateFragment;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f632u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TVUpdateFragment f633v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(D5.d dVar, TVUpdateFragment tVUpdateFragment) {
        super(2, dVar);
        this.f633v = tVUpdateFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        f fVar = new f(dVar, this.f633v);
        fVar.f632u = obj;
        return fVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((f) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f632u).a();
        if (a7 != null) {
            s sVar = (s) a7;
            TVUpdateFragment tVUpdateFragment = this.f633v;
            tVUpdateFragment.x0(false);
            if (sVar instanceof p) {
                tVUpdateFragment.v0(((p) sVar).f649a);
            } else if (sVar instanceof q) {
                tVUpdateFragment.w0(((q) sVar).f650a);
            }
        }
        return C1530l.f16479a;
    }
}
