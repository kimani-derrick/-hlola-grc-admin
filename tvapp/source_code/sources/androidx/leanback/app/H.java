package androidx.leanback.app;

import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.BrowseFrameLayout;
import androidx.leanback.widget.C0321y;
import androidx.leanback.widget.P;
import androidx.leanback.widget.Q0;
import androidx.leanback.widget.U;
import androidx.leanback.widget.V;
import androidx.leanback.widget.VerticalGridView;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public class H extends AbstractC0278g {

    /* renamed from: J0  reason: collision with root package name */
    public P f6182J0;

    /* renamed from: K0  reason: collision with root package name */
    public A1.b f6183K0;

    /* renamed from: L0  reason: collision with root package name */
    public Q0 f6184L0;

    /* renamed from: M0  reason: collision with root package name */
    public V f6185M0;

    /* renamed from: N0  reason: collision with root package name */
    public U f6186N0;

    /* renamed from: O0  reason: collision with root package name */
    public Scene f6187O0;

    /* renamed from: P0  reason: collision with root package name */
    public int f6188P0 = -1;

    /* renamed from: Q0  reason: collision with root package name */
    public final k f6189Q0 = new k(this, 1);

    /* renamed from: R0  reason: collision with root package name */
    public final G f6190R0 = new G(this);

    /* renamed from: S0  reason: collision with root package name */
    public final G f6191S0 = new G(this);

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.lb_vertical_grid_fragment, viewGroup, false);
        f0(layoutInflater, (ViewGroup) viewGroup2.findViewById(R.id.grid_frame));
        this.f6217I0.f6157s = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.browse_grid_dock);
        Q0 d = this.f6183K0.d(viewGroup3);
        this.f6184L0 = d;
        viewGroup3.addView(d.f6572a);
        this.f6184L0.f6466c.setOnChildLaidOutListener(this.f6191S0);
        this.f6187O0 = m3.g.i(viewGroup3, new B(1, this));
        Q0 q02 = this.f6184L0;
        if (q02 != null) {
            this.f6183K0.c(q02, this.f6182J0);
            int i7 = this.f6188P0;
            if (i7 != -1) {
                this.f6184L0.f6466c.setSelectedPosition(i7);
            }
        }
        return viewGroup2;
    }

    @Override // androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public final void J() {
        super.J();
        this.f6184L0 = null;
    }

    @Override // androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public final void S() {
        super.S();
        ((BrowseFrameLayout) this.W.findViewById(R.id.grid_frame)).setOnFocusSearchListener((Z5.n) this.f6229s0.f11964g);
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final Transition j0() {
        return TransitionInflater.from(o()).inflateTransition(R.transition.lb_vertical_grid_entrance_transition);
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final void k0() {
        super.k0();
        this.G0.r(this.f6189Q0);
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final void l0() {
        super.l0();
        this.G0.getClass();
        g5.b.s(this.f6220v0, this.f6189Q0, this.f6211B0);
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final void p0(Object obj) {
        TransitionManager.go(this.f6187O0, (Transition) obj);
    }

    public final void q0(A1.b bVar) {
        this.f6183K0 = bVar;
        bVar.f21e = this.f6190R0;
        U u7 = this.f6186N0;
        if (u7 != null) {
            bVar.f = u7;
        }
    }

    public final void r0() {
        int i7;
        if (this.f6184L0.f6466c.G(this.f6188P0) == null) {
            return;
        }
        VerticalGridView verticalGridView = this.f6184L0.f6466c;
        int i8 = this.f6188P0;
        C0321y c0321y = verticalGridView.d1;
        androidx.leanback.widget.r rVar = c0321y.W;
        if (rVar != null && i8 != -1 && (i7 = rVar.f) >= 0) {
            if (i7 <= 0) {
                int i9 = rVar.k(i8).f259q;
                for (int y3 = c0321y.y() - 1; y3 >= 0; y3--) {
                    int a12 = C0321y.a1(c0321y.x(y3));
                    B4.b k5 = c0321y.W.k(a12);
                    if (k5 == null || k5.f259q != i9 || a12 >= i8) {
                    }
                }
            }
            i0(false);
            return;
        }
        i0(true);
    }
}
