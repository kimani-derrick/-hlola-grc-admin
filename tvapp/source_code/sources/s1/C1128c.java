package s1;

import W5.InterfaceC0116x;
import Z5.u;
import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import com.boxhdo.android.tv.ui.home.TvHomeViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: s1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128c extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13548u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvHomeFragment f13549v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128c(TvHomeFragment tvHomeFragment, D5.d dVar) {
        super(2, dVar);
        this.f13549v = tvHomeFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1128c(this.f13549v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        ((C1128c) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
        return E5.a.f612q;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13548u;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0958a.H(obj);
        } else {
            AbstractC0958a.H(obj);
            int i8 = TvHomeFragment.f7827L1;
            TvHomeFragment tvHomeFragment = this.f13549v;
            TvHomeViewModel T02 = tvHomeFragment.T0();
            C1127b c1127b = new C1127b(tvHomeFragment);
            this.f13548u = 1;
            if (((u) T02.f7831h.f3382r).t(c1127b, this) == aVar) {
                return aVar;
            }
        }
        throw new RuntimeException();
    }
}
