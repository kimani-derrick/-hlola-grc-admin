package com.boxhdo.android.tv.ui.mylist;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import H.e;
import M5.g;
import M5.p;
import W5.AbstractC0117y;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.BrowseFrameLayout;
import androidx.leanback.widget.C0280a;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.J;
import androidx.leanback.widget.L;
import androidx.leanback.widget.Q0;
import androidx.leanback.widget.U;
import androidx.leanback.widget.V;
import androidx.leanback.widget.Z;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.hostMain.TvMainFragment;
import com.boxhdo.domain.model.Movie;
import h4.b;
import j1.e0;
import j1.k0;
import java.util.Collection;
import p6.d;
import q1.InterfaceC1101c;
import w4.l0;
import x1.a;
import x1.f;
import x1.h;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvMyListFragment extends a implements InterfaceC1101c, U, V {

    /* renamed from: Y0  reason: collision with root package name */
    public final e f7865Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public e0 f7866Z0;

    /* renamed from: a1  reason: collision with root package name */
    public k0 f7867a1;

    /* renamed from: b1  reason: collision with root package name */
    public final C1527i f7868b1;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f7869c1;

    public TvMyListFragment() {
        InterfaceC1522d A6 = b.A(new j(new i(24, this), 14));
        this.f7865Y0 = l0.k(this, p.a(TvMyListViewModel.class), new k(A6, 24), new k(A6, 25), new l(this, 12, A6));
        this.f7868b1 = new C1527i(f.f16200r);
    }

    public static final void t0(TvMyListFragment tvMyListFragment, boolean z7) {
        View view = null;
        if (z7) {
            View view2 = tvMyListFragment.W;
            e0 e0Var = tvMyListFragment.f7866Z0;
            if (e0Var != null) {
                view = e0Var.f5662g;
            }
            d.C(view2, view);
            return;
        }
        View view3 = tvMyListFragment.W;
        e0 e0Var2 = tvMyListFragment.f7866Z0;
        if (e0Var2 != null) {
            view = e0Var2.f5662g;
        }
        d.E(view3, view);
    }

    @Override // androidx.leanback.app.AbstractC0278g, androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        A1.b bVar = new A1.b(1);
        bVar.d = false;
        bVar.k(7);
        q0(bVar);
        C0280a u02 = u0();
        this.f6182J0 = u02;
        Q0 q02 = this.f6184L0;
        if (q02 != null) {
            this.f6183K0.c(q02, u02);
            int i7 = this.f6188P0;
            if (i7 != -1) {
                this.f6184L0.f6466c.setSelectedPosition(i7);
            }
        }
        this.f6186N0 = this;
        A1.b bVar2 = this.f6183K0;
        if (bVar2 != null) {
            bVar2.f = this;
        }
        this.f6185M0 = this;
    }

    @Override // androidx.leanback.app.H, androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View view2;
        g.f(layoutInflater, "inflater");
        View H6 = super.H(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) H6;
        int i7 = e0.f11626t;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        e0 e0Var = (e0) androidx.databinding.d.K0(layoutInflater, R.layout.layout_no_result, viewGroup2, false, null);
        this.f7866Z0 = e0Var;
        if (e0Var != null && (view2 = e0Var.f5662g) != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                view2.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        int i8 = k0.f11667t;
        this.f7867a1 = (k0) androidx.databinding.d.K0(layoutInflater, R.layout.layout_shimmer_my_list, viewGroup2, false, null);
        Collection collection = (Collection) ((TvMyListViewModel) this.f7865Y0.getValue()).f7873j.getValue();
        if (collection == null || collection.isEmpty()) {
            k0 k0Var = this.f7867a1;
            if (k0Var != null) {
                view = k0Var.f5662g;
            } else {
                view = null;
            }
            d.C(H6, view);
        }
        AbstractC0117y.p(P.g(this), null, 0, new x1.e(this, null), 3);
        return H6;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void M(boolean z7) {
        KeyEvent.Callback callback;
        if (!z7) {
            View view = this.W;
            BrowseFrameLayout browseFrameLayout = null;
            if (view != null) {
                callback = view.findViewById(R.id.grid_frame);
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

    @Override // androidx.leanback.widget.U
    public final void c(Z z7, Object obj, L l7, J j7) {
        InterfaceC0342u interfaceC0342u;
        if (obj instanceof Movie) {
            Movie movie = (Movie) obj;
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
    }

    @Override // androidx.leanback.widget.V
    public final void g(Z z7, Object obj, C0297i0 c0297i0, Object obj2) {
        boolean z8;
        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) obj2;
        if (obj instanceof Movie) {
            int indexOf = u0().f6573c.indexOf(obj);
            if (indexOf % 7 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f7869c1 = z8;
            if (this.f6182J0.d() >= 20 && (this.f6182J0.d() / 7) - (indexOf / 7) <= 3) {
                TvMyListViewModel tvMyListViewModel = (TvMyListViewModel) this.f7865Y0.getValue();
                tvMyListViewModel.d(true, new h(tvMyListViewModel, (this.f6182J0.d() / 20) + 1, null));
            }
        }
    }

    @Override // q1.InterfaceC1101c
    public final void h() {
        InterfaceC0342u interfaceC0342u;
        if (this.f7869c1 || u0().f6573c.size() == 0) {
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
                tvMainFragment.w0();
            }
        }
    }

    public final C0280a u0() {
        return (C0280a) this.f7868b1.getValue();
    }
}
