package x1;

import F5.i;
import L5.p;
import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.mylist.TvMyListFragment;
import com.boxhdo.android.tv.ui.mylist.TvMyListViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class c extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f16194u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMyListFragment f16195v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TvMyListFragment tvMyListFragment, D5.d dVar) {
        super(2, dVar);
        this.f16195v = tvMyListFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new c(this.f16195v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((c) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f16194u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvMyListFragment tvMyListFragment = this.f16195v;
            T4.c cVar = new T4.c(29, ((TvMyListViewModel) tvMyListFragment.f7865Y0.getValue()).f7873j);
            b bVar = new b(tvMyListFragment, null);
            this.f16194u = 1;
            if (s.e(cVar, bVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
