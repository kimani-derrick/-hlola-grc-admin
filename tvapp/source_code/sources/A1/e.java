package A1;

import android.view.View;
import android.widget.EditText;
import com.boxhdo.android.tv.ui.search.TvSearchFragment;
import j1.g0;
import j1.k0;
import java.util.List;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class e extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f28u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSearchFragment f29v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(D5.d dVar, TvSearchFragment tvSearchFragment) {
        super(2, dVar);
        this.f29v = tvSearchFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        e eVar = new e(dVar, this.f29v);
        eVar.f28u = obj;
        return eVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((e) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        EditText editText;
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f28u).a();
        if (a7 != null) {
            q qVar = (q) a7;
            if (!M5.g.a(qVar, n.f45a)) {
                boolean z7 = qVar instanceof o;
                View view = null;
                TvSearchFragment tvSearchFragment = this.f29v;
                if (z7) {
                    View view2 = tvSearchFragment.W;
                    k0 k0Var = tvSearchFragment.f7894b1;
                    if (k0Var != null) {
                        view = k0Var.f5662g;
                    }
                    p6.d.E(view2, view);
                    List list = ((o) qVar).f46a;
                    if (!list.isEmpty()) {
                        tvSearchFragment.u0(false);
                        tvSearchFragment.t0().f();
                        tvSearchFragment.t0().e(0, list);
                    } else {
                        tvSearchFragment.t0().f();
                        g0 g0Var = tvSearchFragment.f7895c1;
                        if (g0Var != null && (editText = g0Var.f11642r) != null) {
                            p6.d.H(editText);
                        }
                        tvSearchFragment.u0(true);
                    }
                } else if (qVar instanceof p) {
                    View view3 = tvSearchFragment.W;
                    k0 k0Var2 = tvSearchFragment.f7894b1;
                    if (k0Var2 != null) {
                        view = k0Var2.f5662g;
                    }
                    p6.d.E(view3, view);
                    tvSearchFragment.t0().e(tvSearchFragment.f6182J0.d(), ((p) qVar).f47a);
                }
            }
        }
        return C1530l.f16479a;
    }
}
