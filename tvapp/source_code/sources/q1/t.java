package q1;

import W5.AbstractC0117y;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.d;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.lifecycle.P;
import java.util.List;
import q1.i;
import w4.l0;
/* loaded from: classes.dex */
public abstract class t<V extends i, B extends androidx.databinding.d> extends ComponentCallbacksC0269x implements View.OnClickListener {

    /* renamed from: n0  reason: collision with root package name */
    public androidx.databinding.d f13266n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f13267o0 = true;

    public static void p0(t tVar) {
        tVar.getClass();
        l0.o(tVar).k();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        M5.g.f(layoutInflater, "inflater");
        androidx.databinding.d b7 = androidx.databinding.b.b(layoutInflater, g0(), viewGroup, false);
        M5.g.e(b7, "inflate(inflater, layoutResId, container, false)");
        this.f13266n0 = b7;
        f0().P0(w());
        AbstractC0117y.p(P.g(w()), null, 0, new s(this, null), 3);
        for (View view : l0(f0())) {
            view.setOnClickListener(this);
        }
        o0();
        View view2 = f0().f5662g;
        M5.g.e(view2, "binding.root");
        return view2;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void M(boolean z7) {
        int i7;
        ViewGroup viewGroup = null;
        if (z7) {
            View view = this.W;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            }
            if (viewGroup != null) {
                i7 = 393216;
            } else {
                return;
            }
        } else {
            View view2 = this.W;
            if (view2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup != null) {
                i7 = 131072;
            } else {
                return;
            }
        }
        viewGroup.setDescendantFocusability(i7);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void O() {
        this.f6117U = true;
        this.f13267o0 = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void Q() {
        this.f6117U = true;
        this.f13267o0 = true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void U(View view, Bundle bundle) {
        M5.g.f(view, "view");
        k0();
    }

    public final androidx.databinding.d f0() {
        androidx.databinding.d dVar = this.f13266n0;
        if (dVar != null) {
            return dVar;
        }
        M5.g.l("binding");
        throw null;
    }

    public abstract int g0();

    public abstract i h0();

    public final void i0(n0.w wVar) {
        try {
            l0.o(this).j(wVar);
        } catch (Exception unused) {
        }
    }

    public List l0(androidx.databinding.d dVar) {
        return A5.t.f135q;
    }

    public void n0(m mVar, boolean z7) {
        M5.g.f(mVar, "TVUiText");
        g m7 = m();
        if (!(m7 instanceof g)) {
            m7 = null;
        }
        if (m7 != null) {
            m7.Z(mVar, z7);
        }
    }

    public abstract void o0();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f13267o0 && !((Boolean) h0().f13241e.getValue()).booleanValue() && view != null) {
            j0(view.getId());
        }
    }

    public void k0() {
    }

    public void j0(int i7) {
    }

    public void m0(boolean z7) {
    }
}
