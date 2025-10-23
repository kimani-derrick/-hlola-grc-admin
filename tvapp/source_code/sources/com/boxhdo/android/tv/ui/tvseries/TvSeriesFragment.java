package com.boxhdo.android.tv.ui.tvseries;

import A1.i;
import A1.j;
import A1.l;
import E1.a;
import E1.k;
import E1.q;
import H.e;
import M5.g;
import M5.p;
import W5.AbstractC0117y;
import W5.p0;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.app.F;
import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.AbstractC0299j0;
import androidx.leanback.widget.BrowseFrameLayout;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.G;
import androidx.leanback.widget.J;
import androidx.leanback.widget.L;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.Z;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.hostMain.TvMainFragment;
import com.boxhdo.domain.model.Movie;
import h4.b;
import q1.InterfaceC1101c;
import q1.InterfaceC1102d;
import w4.l0;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvSeriesFragment extends a implements InterfaceC1101c, InterfaceC1102d {

    /* renamed from: M1  reason: collision with root package name */
    public static final /* synthetic */ int f7912M1 = 0;
    public final C1527i I1 = new C1527i(k.f558r);

    /* renamed from: J1  reason: collision with root package name */
    public final e f7913J1;

    /* renamed from: K1  reason: collision with root package name */
    public boolean f7914K1;

    /* renamed from: L1  reason: collision with root package name */
    public View f7915L1;

    public TvSeriesFragment() {
        InterfaceC1522d A6 = b.A(new j(new i(4, this), 4));
        this.f7913J1 = l0.k(this, p.a(TvSeriesViewModel.class), new A1.k(A6, 8), new A1.k(A6, 9), new l(this, 4, A6));
        this.f7914K1 = true;
    }

    @Override // q1.AbstractC1099a
    public final void H0() {
        AbstractC0117y.p(P.g(this), null, 0, new E1.j(this, null), 3);
    }

    @Override // q1.AbstractC1099a
    public final void K0(Object obj, AbstractC0287d0 abstractC0287d0) {
        if (obj instanceof Movie) {
            M0((Movie) obj);
        }
    }

    @Override // q1.AbstractC1099a
    public final void L0(Z z7, Object obj) {
        View view;
        if (z7 != null) {
            view = z7.f6572a;
        } else {
            view = null;
        }
        this.f7915L1 = view;
        if (obj instanceof Movie) {
            TvSeriesViewModel T02 = T0();
            Movie movie = (Movie) obj;
            g.f(movie, "movie");
            p0 p0Var = T02.f7918i;
            if (p0Var != null) {
                p0Var.b(null);
            }
            T02.f7918i = T02.d(false, new q(true, T02, movie, null));
        }
    }

    @Override // q1.AbstractC1099a, androidx.fragment.app.ComponentCallbacksC0269x
    public final void M(boolean z7) {
        KeyEvent.Callback callback;
        super.M(z7);
        if (!z7) {
            this.f7914K1 = true;
            View view = this.W;
            BrowseFrameLayout browseFrameLayout = null;
            if (view != null) {
                callback = view.findViewById(R.id.browse_frame);
            } else {
                callback = null;
            }
            if (callback instanceof BrowseFrameLayout) {
                browseFrameLayout = (BrowseFrameLayout) callback;
            }
            if (browseFrameLayout != null) {
                browseFrameLayout.requestFocus();
            }
        }
    }

    @Override // q1.AbstractC1099a
    public final void M0(Movie movie) {
        InterfaceC0342u interfaceC0342u;
        g.f(movie, "movie");
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6109M;
        TvMainFragment tvMainFragment = null;
        if (componentCallbacksC0269x != null) {
            interfaceC0342u = componentCallbacksC0269x.f6109M;
        } else {
            interfaceC0342u = null;
        }
        if (interfaceC0342u instanceof TvMainFragment) {
            tvMainFragment = (TvMainFragment) interfaceC0342u;
        }
        if (tvMainFragment != null) {
            tvMainFragment.t0(movie);
        }
    }

    @Override // q1.AbstractC1099a, androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public final void Q() {
        VerticalGridView verticalGridView;
        super.Q();
        F t02 = t0();
        if (t02 != null && (verticalGridView = t02.f6197o0) != null) {
            ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(0, u().getDimensionPixelSize(R.dimen.dp_200), 0, 0);
                verticalGridView.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public final TvSeriesViewModel T0() {
        return (TvSeriesViewModel) this.f7913J1.getValue();
    }

    @Override // androidx.leanback.app.s, q1.InterfaceC1102d
    public final void b() {
        View view = this.f7915L1;
        if (view == null || view == null) {
            return;
        }
        view.post(new E1.b(0, this));
    }

    @Override // q1.AbstractC1099a, androidx.leanback.widget.U
    public final /* bridge */ /* synthetic */ void c(Z z7, Object obj, L l7, J j7) {
        K0(obj, j7);
    }

    @Override // q1.AbstractC1099a, androidx.leanback.widget.V
    public final /* bridge */ /* synthetic */ void g(Z z7, Object obj, C0297i0 c0297i0, Object obj2) {
        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) obj2;
        L0(z7, obj);
    }

    @Override // q1.InterfaceC1101c
    public final void h() {
        ComponentCallbacksC0269x componentCallbacksC0269x;
        G g7;
        C0297i0 k5;
        L l7;
        int i7;
        C0297i0 u02;
        View view;
        ComponentCallbacksC0269x componentCallbacksC0269x2 = this.f6109M;
        View view2 = null;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x = componentCallbacksC0269x2.f6109M;
        } else {
            componentCallbacksC0269x = null;
        }
        int i8 = t0().f6200r0;
        VerticalGridView verticalGridView = t0().f6197o0;
        if (verticalGridView == null || (g7 = (G) verticalGridView.G(i8)) == null) {
            k5 = null;
        } else {
            ((AbstractC0299j0) g7.f6366u).getClass();
            k5 = AbstractC0299j0.k(g7.f6367v);
        }
        if (k5 instanceof L) {
            l7 = (L) k5;
        } else {
            l7 = null;
        }
        if (l7 != null) {
            i7 = l7.n.getSelectedPosition();
        } else {
            i7 = -1;
        }
        if (componentCallbacksC0269x instanceof TvMainFragment) {
            if (u0() == null || ((u02 = u0()) != null && (view = u02.f6572a) != null && view.hasFocus() && i7 <= 0)) {
                C0297i0 u03 = u0();
                if (u03 != null) {
                    view2 = u03.f6572a;
                }
                this.f7915L1 = view2;
                ((TvMainFragment) componentCallbacksC0269x).w0();
            }
        }
    }
}
