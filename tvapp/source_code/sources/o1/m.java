package o1;

import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class m extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f12862u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerActivity f12863v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(D5.d dVar, TvPlayerActivity tvPlayerActivity) {
        super(2, dVar);
        this.f12863v = tvPlayerActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        m mVar = new m(dVar, this.f12863v);
        mVar.f12862u = obj;
        return mVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((m) h(dVar, (q1.m) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        int i7 = q1.g.f13228P;
        this.f12863v.Z((q1.m) this.f12862u, true);
        return C1530l.f16479a;
    }
}
