package com.boxhdo.android.tv.ui.network_detail;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import H.e;
import M5.g;
import M5.p;
import W5.AbstractC0117y;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.widget.AbstractC0287d0;
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
import com.boxhdo.domain.model.Network;
import com.boxhdo.domain.type.NetworkType;
import g5.b;
import h1.m;
import j1.m0;
import java.util.List;
import n0.C0999A;
import p6.d;
import q1.InterfaceC1101c;
import w4.l0;
import y1.AbstractC1490a;
import y1.C1491b;
import y1.f;
import y1.h;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvNetworkDetailFragment extends AbstractC1490a implements InterfaceC1101c, U, V {

    /* renamed from: Y0  reason: collision with root package name */
    public final C1527i f7874Y0 = new C1527i(C1491b.f16354r);

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f7875Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final e f7876a1;

    /* renamed from: b1  reason: collision with root package name */
    public final b f7877b1;

    /* renamed from: c1  reason: collision with root package name */
    public m0 f7878c1;

    public TvNetworkDetailFragment() {
        InterfaceC1522d A6 = h4.b.A(new j(new i(26, this), 15));
        this.f7876a1 = l0.k(this, p.a(TvNetworkDetailViewModel.class), new k(A6, 26), new k(A6, 27), new l(this, 13, A6));
        this.f7877b1 = new b(p.a(f.class), 5, new i(25, this));
    }

    @Override // androidx.leanback.app.AbstractC0278g, androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        C0280a c0280a = (C0280a) this.f7874Y0.getValue();
        this.f6182J0 = c0280a;
        Q0 q02 = this.f6184L0;
        if (q02 != null) {
            this.f6183K0.c(q02, c0280a);
            int i7 = this.f6188P0;
            if (i7 != -1) {
                this.f6184L0.f6466c.setSelectedPosition(i7);
            }
        }
        A1.b bVar = new A1.b(2);
        bVar.d = false;
        bVar.k(8);
        q0(bVar);
    }

    @Override // androidx.leanback.app.H, androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        g.f(layoutInflater, "inflater");
        View H6 = super.H(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) H6;
        TextView textView = new TextView(viewGroup2.getContext());
        textView.setTextSize(24.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(A.b.a(viewGroup2.getContext(), R.color.white));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, u().getDimensionPixelSize(R.dimen.dp_32), 0, 0);
        layoutParams.gravity = 48;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        b bVar = this.f7877b1;
        textView.setText(((f) bVar.getValue()).f16361a.f8047r);
        d.C(H6, textView);
        int i7 = m0.f11683t;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        this.f7878c1 = (m0) androidx.databinding.d.K0(layoutInflater, R.layout.layout_shimmer_network, viewGroup2, false, null);
        e eVar = this.f7876a1;
        if (((List) ((TvNetworkDetailViewModel) eVar.getValue()).f7879g.getValue()).isEmpty()) {
            m0 m0Var = this.f7878c1;
            if (m0Var != null) {
                view = m0Var.f5662g;
            } else {
                view = null;
            }
            d.C(H6, view);
        }
        this.f6186N0 = this;
        A1.b bVar2 = this.f6183K0;
        if (bVar2 != null) {
            bVar2.f = this;
        }
        this.f6185M0 = this;
        AbstractC0117y.p(P.g(this), null, 0, new y1.e(this, null), 3);
        TvNetworkDetailViewModel tvNetworkDetailViewModel = (TvNetworkDetailViewModel) eVar.getValue();
        NetworkType networkType = ((f) bVar.getValue()).f16362b;
        g.f(networkType, "networkType");
        Network network = ((f) bVar.getValue()).f16361a;
        g.f(network, "network");
        tvNetworkDetailViewModel.d(false, new h(true, tvNetworkDetailViewModel, networkType, network, null));
        return H6;
    }

    @Override // androidx.leanback.widget.U
    public final void c(Z z7, Object obj, L l7, J j7) {
        if (obj instanceof Movie) {
            Movie movie = (Movie) obj;
            C0999A o7 = l0.o(this);
            g.f(movie, "movie");
            o7.j(new m(movie));
        }
    }

    @Override // androidx.leanback.widget.V
    public final void g(Z z7, Object obj, C0297i0 c0297i0, Object obj2) {
        boolean z8;
        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) obj2;
        if (obj instanceof Movie) {
            int indexOf = ((C0280a) this.f7874Y0.getValue()).f6573c.indexOf(obj);
            if (indexOf % 8 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f7875Z0 = z8;
            if (this.f6182J0.d() >= 20 && (this.f6182J0.d() / 8) - (indexOf / 8) <= 3) {
                TvNetworkDetailViewModel tvNetworkDetailViewModel = (TvNetworkDetailViewModel) this.f7876a1.getValue();
                b bVar = this.f7877b1;
                NetworkType networkType = ((f) bVar.getValue()).f16362b;
                g.f(networkType, "networkType");
                Network network = ((f) bVar.getValue()).f16361a;
                g.f(network, "network");
                tvNetworkDetailViewModel.d(false, new h(false, tvNetworkDetailViewModel, networkType, network, null));
            }
        }
    }

    @Override // q1.InterfaceC1101c
    public final void h() {
        InterfaceC0342u interfaceC0342u;
        if (this.f7875Z0) {
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
}
