package n1;

import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.activity.main.TVViewModel;
import com.boxhdo.android.tv.ui.activity.main.TvActivity;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class m extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12641u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvActivity f12642v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(D5.d dVar, TvActivity tvActivity) {
        super(2, dVar);
        this.f12642v = tvActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new m(dVar, this.f12642v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((m) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f12641u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvActivity tvActivity = this.f12642v;
            T4.c cVar = new T4.c(29, ((TVViewModel) tvActivity.f7791T.getValue()).f7786k);
            l lVar = new l(null, tvActivity);
            this.f12641u = 1;
            if (s.e(cVar, lVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
