package s1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import com.boxhdo.android.tv.ui.home.TvHomeViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: s1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130e extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13552u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvHomeFragment f13553v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1130e(TvHomeFragment tvHomeFragment, D5.d dVar) {
        super(2, dVar);
        this.f13553v = tvHomeFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1130e(this.f13553v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1130e) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13552u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            int i8 = TvHomeFragment.f7827L1;
            TvHomeFragment tvHomeFragment = this.f13553v;
            TvHomeViewModel T02 = tvHomeFragment.T0();
            C1129d c1129d = new C1129d(tvHomeFragment, null);
            this.f13552u = 1;
            if (Z5.s.e(T02.f7833j, c1129d, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
