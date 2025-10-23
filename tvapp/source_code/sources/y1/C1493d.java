package y1;

import F5.i;
import L5.p;
import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.network_detail.TvNetworkDetailFragment;
import com.boxhdo.android.tv.ui.network_detail.TvNetworkDetailViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: y1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1493d extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f16357u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvNetworkDetailFragment f16358v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1493d(TvNetworkDetailFragment tvNetworkDetailFragment, D5.d dVar) {
        super(2, dVar);
        this.f16358v = tvNetworkDetailFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1493d(this.f16358v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1493d) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f16357u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvNetworkDetailFragment tvNetworkDetailFragment = this.f16358v;
            T4.c cVar = new T4.c(29, ((TvNetworkDetailViewModel) tvNetworkDetailFragment.f7876a1.getValue()).f7879g);
            C1492c c1492c = new C1492c(tvNetworkDetailFragment, null);
            this.f16357u = 1;
            if (s.e(cVar, c1492c, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
