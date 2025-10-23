package y1;

import F5.i;
import K1.v;
import L5.p;
import W5.InterfaceC0116x;
import Z5.w;
import com.boxhdo.android.tv.ui.network_detail.TvNetworkDetailViewModel;
import com.boxhdo.domain.model.Network;
import com.boxhdo.domain.model.Page;
import com.boxhdo.domain.type.NetworkType;
import java.util.ArrayList;
import java.util.Collection;
import k3.AbstractC0958a;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public Object f16363u;

    /* renamed from: v  reason: collision with root package name */
    public int f16364v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f16365w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ TvNetworkDetailViewModel f16366x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ NetworkType f16367y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Network f16368z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z7, TvNetworkDetailViewModel tvNetworkDetailViewModel, NetworkType networkType, Network network, D5.d dVar) {
        super(2, dVar);
        this.f16365w = z7;
        this.f16366x = tvNetworkDetailViewModel;
        this.f16367y = networkType;
        this.f16368z = network;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new h(this.f16365w, this.f16366x, this.f16367y, this.f16368z, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((h) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f16364v;
        TvNetworkDetailViewModel tvNetworkDetailViewModel = this.f16366x;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC0958a.H(obj);
                    return C1530l.f16479a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0958a.H(obj);
            a7 = ((C1526h) obj).f16471q;
        } else {
            AbstractC0958a.H(obj);
            if (this.f16365w) {
                tvNetworkDetailViewModel.f7880h = 1;
            }
            v vVar = tvNetworkDetailViewModel.f;
            int i8 = tvNetworkDetailViewModel.f7880h;
            this.f16364v = 1;
            a7 = vVar.a(this.f16367y, this.f16368z, i8, 20, this);
            if (a7 == aVar) {
                return aVar;
            }
        }
        if (!(a7 instanceof C1525g)) {
            Page page = (Page) a7;
            int i9 = tvNetworkDetailViewModel.f7880h;
            w wVar = tvNetworkDetailViewModel.f7879g;
            if (i9 == 1) {
                wVar.f(page.f8051c);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) wVar.getValue());
                arrayList.addAll(page.f8051c);
                wVar.f(arrayList);
            }
            tvNetworkDetailViewModel.f7880h++;
        }
        Throwable a8 = C1526h.a(a7);
        if (a8 != null) {
            this.f16363u = a7;
            this.f16364v = 2;
            if (tvNetworkDetailViewModel.e(a8, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
