package o1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import W5.p0;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class j extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f12856u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerActivity f12857v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(D5.d dVar, TvPlayerActivity tvPlayerActivity) {
        super(2, dVar);
        this.f12857v = tvPlayerActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        j jVar = new j(dVar, this.f12857v);
        jVar.f12856u = obj;
        return jVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((j) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        int Y6;
        AbstractC0958a.H(obj);
        TvPlayerActivity tvPlayerActivity = this.f12857v;
        p0 p3 = AbstractC0117y.p((InterfaceC0116x) this.f12856u, null, 0, new i(null, tvPlayerActivity), 3);
        tvPlayerActivity.f7801X = p3;
        p0 p0Var = p3;
        do {
            Y6 = p0Var.Y(p0Var.K());
            if (Y6 == 0) {
                break;
            }
        } while (Y6 != 1);
        return C1530l.f16479a;
    }
}
