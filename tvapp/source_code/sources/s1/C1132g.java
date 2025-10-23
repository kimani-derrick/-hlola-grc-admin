package s1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import com.boxhdo.android.tv.ui.home.TvHomeViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: s1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132g extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13556u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvHomeFragment f13557v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1132g(TvHomeFragment tvHomeFragment, D5.d dVar) {
        super(2, dVar);
        this.f13557v = tvHomeFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1132g(this.f13557v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1132g) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13556u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            int i8 = TvHomeFragment.f7827L1;
            TvHomeFragment tvHomeFragment = this.f13557v;
            TvHomeViewModel T02 = tvHomeFragment.T0();
            C1131f c1131f = new C1131f(tvHomeFragment, null);
            this.f13556u = 1;
            if (Z5.s.e(T02.f7835l, c1131f, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
