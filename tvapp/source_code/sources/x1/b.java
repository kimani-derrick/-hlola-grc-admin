package x1;

import F5.i;
import L5.p;
import android.view.KeyEvent;
import com.boxhdo.android.tv.ui.mylist.TvMyListFragment;
import com.facebook.shimmer.ShimmerFrameLayout;
import j1.k0;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class b extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f16192u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMyListFragment f16193v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TvMyListFragment tvMyListFragment, D5.d dVar) {
        super(2, dVar);
        this.f16193v = tvMyListFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        b bVar = new b(this.f16193v, dVar);
        bVar.f16192u = obj;
        return bVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((b) h(dVar, (List) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        KeyEvent.Callback callback;
        AbstractC0958a.H(obj);
        List list = (List) this.f16192u;
        if (list != null) {
            TvMyListFragment tvMyListFragment = this.f16193v;
            k0 k0Var = tvMyListFragment.f7867a1;
            ShimmerFrameLayout shimmerFrameLayout = null;
            if (k0Var != null) {
                callback = k0Var.f5662g;
            } else {
                callback = null;
            }
            if (callback instanceof ShimmerFrameLayout) {
                shimmerFrameLayout = (ShimmerFrameLayout) callback;
            }
            if (shimmerFrameLayout != null) {
                p6.d.E(tvMyListFragment.W, shimmerFrameLayout);
            }
            List list2 = list;
            if (!list2.isEmpty()) {
                tvMyListFragment.u0().e(tvMyListFragment.u0().f6573c.size(), list2);
                TvMyListFragment.t0(tvMyListFragment, false);
            } else {
                TvMyListFragment.t0(tvMyListFragment, true);
            }
        }
        return C1530l.f16479a;
    }
}
