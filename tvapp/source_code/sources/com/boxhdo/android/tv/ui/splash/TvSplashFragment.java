package com.boxhdo.android.tv.ui.splash;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import C1.a;
import C1.h;
import H.e;
import M5.g;
import M5.p;
import S0.f;
import W5.AbstractC0117y;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import h4.b;
import j1.AbstractC0785C;
import q1.m;
import w4.l0;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvSplashFragment extends a<TvSplashViewModel, AbstractC0785C> {

    /* renamed from: u0  reason: collision with root package name */
    public final e f7905u0;

    public TvSplashFragment() {
        InterfaceC1522d A6 = b.A(new j(new i(2, this), 2));
        this.f7905u0 = l0.k(this, p.a(TvSplashViewModel.class), new k(A6, 4), new k(A6, 5), new l(this, 2, A6));
    }

    @Override // q1.t
    public final int g0() {
        return R.layout.fragment_tv_splash;
    }

    @Override // q1.t
    public final q1.i h0() {
        return (TvSplashViewModel) this.f7905u0.getValue();
    }

    @Override // q1.t
    public final void k0() {
        AbstractC0117y.p(P.g(this), null, 0, new C1.e(null, this), 3);
    }

    @Override // q1.t
    public final void n0(m mVar, boolean z7) {
        g.f(mVar, "TVUiText");
        super.n0(mVar, z7);
        Button button = ((AbstractC0785C) f0()).f11543r;
        g.e(button, "binding.buttonRetry");
        button.setVisibility(0);
        ProgressBar progressBar = ((AbstractC0785C) f0()).f11545t;
        g.e(progressBar, "binding.loading");
        progressBar.setVisibility(8);
    }

    @Override // q1.t
    public final void o0() {
        ImageView imageView = ((AbstractC0785C) f0()).f11544s;
        g.e(imageView, "binding.imageLogo");
        Integer valueOf = Integer.valueOf((int) R.mipmap.ic_launcher);
        J0.j a7 = J0.a.a(imageView.getContext());
        f fVar = new f(imageView.getContext());
        fVar.f2984c = valueOf;
        fVar.b(imageView);
        fVar.f2991l = p6.l.R(A5.j.Z(new V0.a[]{new V0.a(u().getDimensionPixelSize(R.dimen.dp_8))}));
        a7.b(fVar.a());
        ((AbstractC0785C) f0()).f11543r.setOnClickListener(new C1.b(0, this));
        TvSplashViewModel tvSplashViewModel = (TvSplashViewModel) this.f7905u0.getValue();
        tvSplashViewModel.d(false, new h(tvSplashViewModel, null));
    }
}
