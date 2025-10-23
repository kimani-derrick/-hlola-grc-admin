package o1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class q extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12870u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerActivity f12871v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(D5.d dVar, TvPlayerActivity tvPlayerActivity) {
        super(2, dVar);
        this.f12871v = tvPlayerActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new q(dVar, this.f12871v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((q) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f12870u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvPlayerActivity tvPlayerActivity = this.f12871v;
            T4.c cVar = new T4.c(29, tvPlayerActivity.d0().f7806k);
            p pVar = new p(null, tvPlayerActivity);
            this.f12870u = 1;
            if (Z5.s.e(cVar, pVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
