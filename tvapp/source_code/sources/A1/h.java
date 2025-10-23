package A1;

import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.search.TvSearchFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f34u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSearchFragment f35v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(D5.d dVar, TvSearchFragment tvSearchFragment) {
        super(2, dVar);
        this.f35v = tvSearchFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new h(dVar, this.f35v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((h) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f34u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            TvSearchFragment tvSearchFragment = this.f35v;
            g gVar = new g(null, tvSearchFragment);
            this.f34u = 1;
            if (P.k(tvSearchFragment, enumC0337o, gVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
