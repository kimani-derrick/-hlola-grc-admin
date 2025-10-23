package n1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.main.TvActivity;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class j extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12636u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvActivity f12637v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(D5.d dVar, TvActivity tvActivity) {
        super(2, dVar);
        this.f12637v = tvActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new j(dVar, this.f12637v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((j) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f12636u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f12636u = 1;
            if (AbstractC0117y.f(2000L, this) == aVar) {
                return aVar;
            }
        }
        this.f12637v.f7793V = false;
        return C1530l.f16479a;
    }
}
