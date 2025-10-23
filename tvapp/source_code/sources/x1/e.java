package x1;

import F5.i;
import L5.p;
import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.mylist.TvMyListFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class e extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f16198u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMyListFragment f16199v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TvMyListFragment tvMyListFragment, D5.d dVar) {
        super(2, dVar);
        this.f16199v = tvMyListFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new e(this.f16199v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((e) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f16198u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            TvMyListFragment tvMyListFragment = this.f16199v;
            d dVar = new d(tvMyListFragment, null);
            this.f16198u = 1;
            if (P.k(tvMyListFragment, enumC0337o, dVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
