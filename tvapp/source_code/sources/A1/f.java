package A1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.search.TvSearchFragment;
import com.boxhdo.android.tv.ui.search.TvSearchViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f30u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSearchFragment f31v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(D5.d dVar, TvSearchFragment tvSearchFragment) {
        super(2, dVar);
        this.f31v = tvSearchFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new f(dVar, this.f31v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((f) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f30u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvSearchFragment tvSearchFragment = this.f31v;
            T4.c cVar = new T4.c(29, ((TvSearchViewModel) tvSearchFragment.f7891Y0.getValue()).f7897g);
            e eVar = new e(null, tvSearchFragment);
            this.f30u = 1;
            if (Z5.s.e(cVar, eVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
