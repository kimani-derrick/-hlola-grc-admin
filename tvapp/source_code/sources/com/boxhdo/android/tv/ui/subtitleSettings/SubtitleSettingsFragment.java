package com.boxhdo.android.tv.ui.subtitleSettings;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import D0.h;
import D1.a;
import H.e;
import M5.p;
import W5.AbstractC0117y;
import androidx.databinding.d;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import h4.b;
import j1.AbstractC0815m;
import java.util.List;
import m3.g;
import q1.t;
import w4.l0;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class SubtitleSettingsFragment extends a<SubtitleSettingsViewModel, AbstractC0815m> {

    /* renamed from: u0  reason: collision with root package name */
    public final e f7908u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C1527i f7909v0;

    public SubtitleSettingsFragment() {
        InterfaceC1522d A6 = b.A(new j(new i(3, this), 3));
        this.f7908u0 = l0.k(this, p.a(SubtitleSettingsViewModel.class), new k(A6, 6), new k(A6, 7), new l(this, 3, A6));
        this.f7909v0 = new C1527i(new h(1, this));
    }

    @Override // q1.t
    public final int g0() {
        return R.layout.fragment_tv_choose_subtitle;
    }

    @Override // q1.t
    public final q1.i h0() {
        return (SubtitleSettingsViewModel) this.f7908u0.getValue();
    }

    @Override // q1.t
    public final void j0(int i7) {
        if (i7 == R.id.buttonBack) {
            t.p0(this);
        }
    }

    @Override // q1.t
    public final void k0() {
        AbstractC0117y.p(P.g(this), null, 0, new D1.i(null, this), 3);
    }

    @Override // q1.t
    public final List l0(d dVar) {
        return g.z(((AbstractC0815m) dVar).f11681r);
    }

    @Override // q1.t
    public final void o0() {
        ((AbstractC0815m) f0()).f11682s.setHasFixedSize(true);
        ((AbstractC0815m) f0()).f11682s.setAdapter((D1.e) this.f7909v0.getValue());
    }
}
