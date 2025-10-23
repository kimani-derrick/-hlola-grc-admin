package com.boxhdo.android.tv.ui.playerLoading;

import A1.j;
import A1.k;
import A1.l;
import H.e;
import M5.p;
import W5.AbstractC0117y;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.d;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import androidx.lifecycle.P;
import androidx.lifecycle.Y;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.type.MediaType;
import dagger.hilt.android.internal.managers.g;
import dagger.hilt.android.internal.managers.i;
import g5.b;
import j1.AbstractC0813k;
import k3.AbstractC0958a;
import w4.l0;
import w5.InterfaceC1437b;
import z1.C1504c;
import z1.C1505d;
import z1.C1511j;
import z1.C1512k;
import z1.InterfaceC1507f;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class PlayerLoadingFragment extends DialogInterface$OnCancelListenerC0263q implements InterfaceC1437b {

    /* renamed from: D0  reason: collision with root package name */
    public i f7881D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f7882E0;

    /* renamed from: F0  reason: collision with root package name */
    public volatile g f7883F0;
    public final Object G0 = new Object();

    /* renamed from: H0  reason: collision with root package name */
    public boolean f7884H0 = false;

    /* renamed from: I0  reason: collision with root package name */
    public final e f7885I0;

    /* renamed from: J0  reason: collision with root package name */
    public final b f7886J0;

    /* renamed from: K0  reason: collision with root package name */
    public AbstractC0813k f7887K0;

    public PlayerLoadingFragment() {
        InterfaceC1522d A6 = h4.b.A(new j(new A1.i(28, this), 16));
        this.f7885I0 = l0.k(this, p.a(PlayerLoadingViewModel.class), new k(A6, 28), new k(A6, 29), new l(this, 14, A6));
        this.f7886J0 = new b(p.a(C1505d.class), 5, new A1.i(27, this));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void E(Activity activity) {
        boolean z7;
        this.f6117U = true;
        i iVar = this.f7881D0;
        if (iVar != null && g.b(iVar) != activity) {
            z7 = false;
        } else {
            z7 = true;
        }
        android.support.v4.media.session.b.p(z7, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k0();
        if (!this.f7884H0) {
            this.f7884H0 = true;
            ((InterfaceC1507f) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        super.F(context);
        k0();
        if (!this.f7884H0) {
            this.f7884H0 = true;
            ((InterfaceC1507f) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to 1, 2132017420");
        }
        this.f6073r0 = 1;
        this.f6074s0 = R.style.FullScreenDialogStyle;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        M5.g.f(layoutInflater, "inflater");
        int i7 = AbstractC0813k.f11666r;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        AbstractC0813k abstractC0813k = (AbstractC0813k) d.K0(layoutInflater, R.layout.fragment_player_loading, viewGroup, false, null);
        M5.g.e(abstractC0813k, "inflate(inflater, container, false)");
        this.f7887K0 = abstractC0813k;
        long j7 = j0().f16408c;
        long j8 = j0().d;
        MediaType mediaType = j0().f16407b;
        int i8 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        e eVar = this.f7885I0;
        if (i8 > 0) {
            PlayerLoadingViewModel playerLoadingViewModel = (PlayerLoadingViewModel) eVar.getValue();
            playerLoadingViewModel.d(false, new C1511j(playerLoadingViewModel, j8, j0().f16410g, null));
        } else {
            PlayerLoadingViewModel playerLoadingViewModel2 = (PlayerLoadingViewModel) eVar.getValue();
            long j9 = j0().f16410g;
            M5.g.f(mediaType, "mediaType");
            playerLoadingViewModel2.d(false, new C1512k(playerLoadingViewModel2, mediaType, j7, j9, null));
        }
        AbstractC0117y.p(P.g(this), null, 0, new C1504c(null, this), 3);
        AbstractC0813k abstractC0813k2 = this.f7887K0;
        if (abstractC0813k2 != null) {
            View view = abstractC0813k2.f5662g;
            M5.g.e(view, "binding.root");
            return view;
        }
        M5.g.l("binding");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater L6 = super.L(bundle);
        return L6.cloneInContext(new i(L6, this));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q
    public final Dialog g0(Bundle bundle) {
        Dialog g02 = super.g0(bundle);
        Window window = g02.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return g02;
    }

    public final C1505d j0() {
        return (C1505d) this.f7886J0.getValue();
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f7883F0 == null) {
            synchronized (this.G0) {
                try {
                    if (this.f7883F0 == null) {
                        this.f7883F0 = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f7883F0.k();
    }

    public final void k0() {
        if (this.f7881D0 == null) {
            this.f7881D0 = new i(super.o(), this);
            this.f7882E0 = AbstractC0958a.v(super.o());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final Context o() {
        if (super.o() == null && !this.f7882E0) {
            return null;
        }
        k0();
        return this.f7881D0;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return android.support.v4.media.session.b.j0(this, super.r());
    }
}
