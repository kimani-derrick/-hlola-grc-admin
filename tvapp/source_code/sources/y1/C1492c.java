package y1;

import F5.i;
import L5.p;
import android.view.View;
import androidx.leanback.widget.C0280a;
import com.boxhdo.android.tv.ui.network_detail.TvNetworkDetailFragment;
import j1.m0;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1527i;
import z5.C1530l;
/* renamed from: y1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492c extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f16355u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvNetworkDetailFragment f16356v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1492c(TvNetworkDetailFragment tvNetworkDetailFragment, D5.d dVar) {
        super(2, dVar);
        this.f16356v = tvNetworkDetailFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C1492c c1492c = new C1492c(this.f16356v, dVar);
        c1492c.f16355u = obj;
        return c1492c;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1492c) h(dVar, (List) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        View view;
        AbstractC0958a.H(obj);
        List list = (List) this.f16355u;
        TvNetworkDetailFragment tvNetworkDetailFragment = this.f16356v;
        m0 m0Var = tvNetworkDetailFragment.f7878c1;
        if (m0Var != null && (view = m0Var.f5662g) != null) {
            p6.d.E(tvNetworkDetailFragment.W, view);
        }
        C1527i c1527i = tvNetworkDetailFragment.f7874Y0;
        ((C0280a) c1527i.getValue()).e(((C0280a) c1527i.getValue()).f6573c.size(), list);
        return C1530l.f16479a;
    }
}
