package com.boxhdo.android.tv.ui.settings;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import B1.a;
import B1.g;
import B1.m;
import B1.n;
import H.e;
import M5.p;
import W5.AbstractC0117y;
import androidx.databinding.d;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.hostMain.TvMainFragment;
import h4.b;
import j1.AbstractC0783A;
import java.util.List;
import n0.C1010a;
import q1.InterfaceC1101c;
import w4.l0;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvSettingsFragment extends a<TvSettingsViewModel, AbstractC0783A> implements InterfaceC1101c {

    /* renamed from: u0  reason: collision with root package name */
    public final e f7899u0;

    public TvSettingsFragment() {
        InterfaceC1522d A6 = b.A(new j(new i(1, this), 1));
        this.f7899u0 = l0.k(this, p.a(TvSettingsViewModel.class), new k(A6, 2), new k(A6, 3), new l(this, 1, A6));
    }

    @Override // q1.t, androidx.fragment.app.ComponentCallbacksC0269x
    public final void M(boolean z7) {
        super.M(z7);
        if (!z7) {
            r0();
            ((AbstractC0783A) f0()).f11538t.requestFocus();
            TvSettingsViewModel h02 = h0();
            h02.d(false, new m(h02, null));
        }
    }

    @Override // q1.t, androidx.fragment.app.ComponentCallbacksC0269x
    public final void Q() {
        super.Q();
        r0();
        ((AbstractC0783A) f0()).f11538t.requestFocus();
        TvSettingsViewModel h02 = h0();
        h02.d(false, new m(h02, null));
    }

    @Override // q1.t
    public final int g0() {
        return R.layout.fragment_tv_settings;
    }

    @Override // q1.InterfaceC1101c
    public final void h() {
        InterfaceC0342u interfaceC0342u;
        if (((AbstractC0783A) f0()).f11538t.isFocused() || ((AbstractC0783A) f0()).f11537s.isFocused()) {
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

    @Override // q1.t
    public final void j0(int i7) {
        InterfaceC0342u interfaceC0342u;
        InterfaceC0342u interfaceC0342u2;
        TvMainFragment tvMainFragment = null;
        if (i7 == R.id.layoutLogin) {
            if (h0().f.f2197a.a()) {
                TvSettingsViewModel h02 = h0();
                h02.d(false, new n(h02, null));
                return;
            }
            ComponentCallbacksC0269x componentCallbacksC0269x = this.f6109M;
            if (componentCallbacksC0269x != null) {
                interfaceC0342u2 = componentCallbacksC0269x.f6109M;
            } else {
                interfaceC0342u2 = null;
            }
            if (interfaceC0342u2 instanceof TvMainFragment) {
                tvMainFragment = (TvMainFragment) interfaceC0342u2;
            }
            if (tvMainFragment != null) {
                tvMainFragment.i0(new C1010a(R.id.goToLogin));
            }
        } else if (i7 == R.id.layoutChooseSubtitle) {
            ComponentCallbacksC0269x componentCallbacksC0269x2 = this.f6109M;
            if (componentCallbacksC0269x2 != null) {
                interfaceC0342u = componentCallbacksC0269x2.f6109M;
            } else {
                interfaceC0342u = null;
            }
            if (interfaceC0342u instanceof TvMainFragment) {
                tvMainFragment = (TvMainFragment) interfaceC0342u;
            }
            if (tvMainFragment != null) {
                tvMainFragment.i0(new C1010a(R.id.goToSubtitleSettings));
            }
        }
    }

    @Override // q1.t
    public final void k0() {
        AbstractC0117y.p(P.g(this), null, 0, new g(null, this), 3);
    }

    @Override // q1.t
    public final List l0(d dVar) {
        AbstractC0783A abstractC0783A = (AbstractC0783A) dVar;
        return A5.l.L(abstractC0783A.f11538t, abstractC0783A.f11537s);
    }

    @Override // q1.t
    public final void o0() {
    }

    public final void r0() {
        int i7;
        if (h0().f.f2197a.a()) {
            i7 = R.string.logout_trakt;
        } else {
            i7 = R.string.login_trakt;
        }
        ((AbstractC0783A) f0()).f11536r.setText(v(i7));
        if (!h0().f.f2197a.a()) {
            ((AbstractC0783A) f0()).f11540v.setText("");
            return;
        }
        TvSettingsViewModel h02 = h0();
        h02.d(false, new B1.l(h02, null));
    }

    @Override // q1.t
    /* renamed from: s0 */
    public final TvSettingsViewModel h0() {
        return (TvSettingsViewModel) this.f7899u0.getValue();
    }
}
