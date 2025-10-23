package com.boxhdo.android.tv.ui.login;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import H.e;
import M5.p;
import U5.f;
import W5.AbstractC0117y;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import h4.b;
import j1.AbstractC0819q;
import u1.AbstractC1255a;
import u1.C1258d;
import w4.l0;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvLoginFragment extends AbstractC1255a<TvLoginViewModel, AbstractC0819q> {

    /* renamed from: u0  reason: collision with root package name */
    public final e f7843u0;

    public TvLoginFragment() {
        InterfaceC1522d A6 = b.A(new j(new i(20, this), 11));
        this.f7843u0 = l0.k(this, p.a(TvLoginViewModel.class), new k(A6, 18), new k(A6, 19), new l(this, 9, A6));
    }

    @Override // q1.t
    public final int g0() {
        return R.layout.fragment_tv_login;
    }

    @Override // q1.t
    public final q1.i h0() {
        return (TvLoginViewModel) this.f7843u0.getValue();
    }

    @Override // q1.t
    public final void k0() {
        AbstractC0117y.p(P.g(this), null, 0, new C1258d(null, this), 3);
    }

    @Override // q1.t
    public final void o0() {
        SpannableString spannableString = new SpannableString(v(R.string.message_trakt_login));
        spannableString.setSpan(new ForegroundColorSpan(A.b.a(((AbstractC0819q) f0()).f11713r.getContext(), R.color.colorPrimary)), f.j0(spannableString, "\"", 0, false, 6), f.m0(spannableString, "\"", 6) + 1, 34);
        ((AbstractC0819q) f0()).f11713r.setText(spannableString);
        ((AbstractC0819q) f0()).f11714s.setText(u().getString(R.string.message_input_code, ""));
    }
}
