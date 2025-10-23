package com.boxhdo.android.tv.ui.search;

import A1.a;
import A1.d;
import A1.h;
import A1.i;
import A1.j;
import A1.k;
import A1.l;
import A1.r;
import A5.t;
import H.e;
import M5.g;
import M5.p;
import U5.f;
import W5.AbstractC0117y;
import W5.p0;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import com.boxhdo.android.tv.ui.search.TvSearchFragment;
import com.boxhdo.android.tv.ui.search.TvSearchViewModel;
import com.boxhdo.domain.model.Movie;
import h4.b;
import j1.e0;
import j1.g0;
import j1.k0;
import q1.C1104f;
import q1.InterfaceC1100b;
import q1.InterfaceC1101c;
import q1.InterfaceC1102d;
import q1.InterfaceC1103e;
import w4.l0;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvSearchFragment extends a implements InterfaceC1101c, U, V, InterfaceC1102d, InterfaceC1103e, InterfaceC1100b {

    /* renamed from: Y0  reason: collision with root package name */
    public final e f7891Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public final C1527i f7892Z0;

    /* renamed from: a1  reason: collision with root package name */
    public e0 f7893a1;

    /* renamed from: b1  reason: collision with root package name */
    public k0 f7894b1;

    /* renamed from: c1  reason: collision with root package name */
    public g0 f7895c1;
    public boolean d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f7896e1;

    public TvSearchFragment() {
        InterfaceC1522d A6 = b.A(new j(new i(0, this), 0));
        this.f7891Y0 = l0.k(this, p.a(TvSearchViewModel.class), new k(A6, 0), new k(A6, 1), new l(this, 0, A6));
        this.f7892Z0 = new C1527i(d.f27r);
    }

    @Override // androidx.leanback.app.AbstractC0278g, androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        C0280a t02 = t0();
        this.f6182J0 = t02;
        Q0 q02 = this.f6184L0;
        if (q02 != null) {
            this.f6183K0.c(q02, t02);
            int i7 = this.f6188P0;
            if (i7 != -1) {
                this.f6184L0.f6466c.setSelectedPosition(i7);
            }
        }
        A1.b bVar = new A1.b(0);
        bVar.d = false;
        bVar.k(7);
        q0(bVar);
    }

    @Override // androidx.leanback.app.H, androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        final EditText editText;
        View view2;
        View view3;
        TextView textView;
        g.f(layoutInflater, "inflater");
        View H6 = super.H(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) H6;
        int i7 = g0.f11641s;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        g0 g0Var = (g0) androidx.databinding.d.K0(layoutInflater, R.layout.layout_search, viewGroup2, false, null);
        this.f7895c1 = g0Var;
        if (g0Var != null) {
            view = g0Var.f5662g;
        } else {
            view = null;
        }
        p6.d.C(H6, view);
        int i8 = e0.f11626t;
        e0 e0Var = (e0) androidx.databinding.d.K0(layoutInflater, R.layout.layout_no_result, viewGroup2, false, null);
        this.f7893a1 = e0Var;
        if (e0Var != null && (textView = e0Var.f11628s) != null) {
            textView.setText(R.string.message_no_result);
        }
        e0 e0Var2 = this.f7893a1;
        if (e0Var2 != null && (view3 = e0Var2.f5662g) != null) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                view3.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        int i9 = k0.f11667t;
        k0 k0Var = (k0) androidx.databinding.d.K0(layoutInflater, R.layout.layout_shimmer_my_list, viewGroup2, false, null);
        this.f7894b1 = k0Var;
        if (k0Var != null && (view2 = k0Var.f5662g) != null) {
            view2.setPadding(u().getDimensionPixelSize(R.dimen.dp_94), u().getDimensionPixelSize(R.dimen.dp_120), 0, 0);
        }
        this.f6186N0 = this;
        A1.b bVar = this.f6183K0;
        if (bVar != null) {
            bVar.f = this;
        }
        this.f6185M0 = this;
        g0 g0Var2 = this.f7895c1;
        if (g0Var2 != null && (editText = g0Var2.f11642r) != null) {
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: A1.c
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView2, int i10, KeyEvent keyEvent) {
                    View view4;
                    String str;
                    TvSearchFragment tvSearchFragment = TvSearchFragment.this;
                    M5.g.f(tvSearchFragment, "this$0");
                    EditText editText2 = editText;
                    M5.g.f(editText2, "$this_apply");
                    boolean z7 = false;
                    if (i10 == 3) {
                        M5.g.e(textView2, "v");
                        p6.d.p(textView2);
                        tvSearchFragment.u0(false);
                        tvSearchFragment.t0().f();
                        View view5 = tvSearchFragment.W;
                        k0 k0Var2 = tvSearchFragment.f7894b1;
                        if (k0Var2 != null) {
                            view4 = k0Var2.f5662g;
                        } else {
                            view4 = null;
                        }
                        p6.d.C(view5, view4);
                        TvSearchViewModel tvSearchViewModel = (TvSearchViewModel) tvSearchFragment.f7891Y0.getValue();
                        Editable text = editText2.getText();
                        if (text != null) {
                            str = text.toString();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        String obj = U5.f.C0(str).toString();
                        M5.g.f(obj, "query");
                        p0 p0Var = tvSearchViewModel.f7898h;
                        if (p0Var != null) {
                            p0Var.b(null);
                        }
                        z7 = true;
                        if (U5.n.X(obj)) {
                            tvSearchViewModel.f7897g.f(new C1104f(new o(t.f135q)));
                        } else {
                            tvSearchViewModel.f7898h = tvSearchViewModel.d(true, new s(tvSearchViewModel, obj, null));
                        }
                    }
                    return z7;
                }
            });
        }
        AbstractC0117y.p(P.g(this), null, 0, new h(null, this), 3);
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

    @Override // androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public final void Q() {
        EditText editText;
        super.Q();
        g0 g0Var = this.f7895c1;
        if (g0Var == null || (editText = g0Var.f11642r) == null) {
            return;
        }
        p6.d.H(editText);
    }

    @Override // q1.InterfaceC1102d
    public final void b() {
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

    @Override // q1.InterfaceC1100b
    public final void d() {
        EditText editText;
        g0 g0Var;
        EditText editText2;
        g0 g0Var2 = this.f7895c1;
        if (g0Var2 == null || (editText = g0Var2.f11642r) == null || !editText.isFocused() || (g0Var = this.f7895c1) == null || (editText2 = g0Var.f11642r) == null) {
            return;
        }
        p6.d.p(editText2);
    }

    @Override // androidx.leanback.widget.V
    public final void g(Z z7, Object obj, C0297i0 c0297i0, Object obj2) {
        boolean z8;
        boolean z9;
        String str;
        EditText editText;
        Editable text;
        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) obj2;
        if (obj instanceof Movie) {
            int indexOf = t0().f6573c.indexOf(obj);
            if (indexOf % 7 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.d1 = z8;
            if (indexOf < 7) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f7896e1 = z9;
            if (this.f6182J0.d() >= 50 && (this.f6182J0.d() / 7) - (indexOf / 7) <= 3) {
                TvSearchViewModel tvSearchViewModel = (TvSearchViewModel) this.f7891Y0.getValue();
                g0 g0Var = this.f7895c1;
                if (g0Var != null && (editText = g0Var.f11642r) != null && (text = editText.getText()) != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                String obj3 = f.C0(str).toString();
                int d = (this.f6182J0.d() / 50) + 1;
                g.f(obj3, "query");
                p0 p0Var = tvSearchViewModel.f7898h;
                if (p0Var != null) {
                    p0Var.b(null);
                }
                tvSearchViewModel.f7898h = tvSearchViewModel.d(false, new r(tvSearchViewModel, obj3, d, null));
            }
        }
    }

    @Override // q1.InterfaceC1101c
    public final void h() {
        InterfaceC0342u interfaceC0342u;
        g0 g0Var;
        EditText editText;
        if (this.d1 || ((g0Var = this.f7895c1) != null && (editText = g0Var.f11642r) != null && editText.isFocused())) {
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

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, q1.InterfaceC1103e
    public final void i() {
        g0 g0Var;
        EditText editText;
        if (!this.f7896e1 || (g0Var = this.f7895c1) == null || (editText = g0Var.f11642r) == null) {
            return;
        }
        p6.d.H(editText);
    }

    public final C0280a t0() {
        return (C0280a) this.f7892Z0.getValue();
    }

    public final void u0(boolean z7) {
        View view = null;
        if (z7) {
            View view2 = this.W;
            e0 e0Var = this.f7893a1;
            if (e0Var != null) {
                view = e0Var.f5662g;
            }
            p6.d.C(view2, view);
            return;
        }
        View view3 = this.W;
        e0 e0Var2 = this.f7893a1;
        if (e0Var2 != null) {
            view = e0Var2.f5662g;
        }
        p6.d.E(view3, view);
    }
}
