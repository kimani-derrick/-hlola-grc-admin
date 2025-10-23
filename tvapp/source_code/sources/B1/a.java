package B1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.d;
import androidx.lifecycle.Y;
import com.boxhdo.android.tv.ui.settings.TvSettingsFragment;
import k3.AbstractC0958a;
import q1.i;
import q1.t;
import w5.InterfaceC1437b;
/* loaded from: classes.dex */
public abstract class a<V extends q1.i, B extends androidx.databinding.d> extends t<V, B> implements InterfaceC1437b {

    /* renamed from: p0  reason: collision with root package name */
    public dagger.hilt.android.internal.managers.i f151p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f152q0;

    /* renamed from: r0  reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.g f153r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Object f154s0 = new Object();

    /* renamed from: t0  reason: collision with root package name */
    public boolean f155t0 = false;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void E(Activity activity) {
        boolean z7;
        this.f6117U = true;
        dagger.hilt.android.internal.managers.i iVar = this.f151p0;
        if (iVar != null && dagger.hilt.android.internal.managers.g.b(iVar) != activity) {
            z7 = false;
        } else {
            z7 = true;
        }
        android.support.v4.media.session.b.p(z7, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q0();
        if (!this.f155t0) {
            this.f155t0 = true;
            TvSettingsFragment tvSettingsFragment = (TvSettingsFragment) this;
            ((h) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        super.F(context);
        q0();
        if (!this.f155t0) {
            this.f155t0 = true;
            TvSettingsFragment tvSettingsFragment = (TvSettingsFragment) this;
            ((h) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater L6 = super.L(bundle);
        return L6.cloneInContext(new dagger.hilt.android.internal.managers.i(L6, this));
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f153r0 == null) {
            synchronized (this.f154s0) {
                try {
                    if (this.f153r0 == null) {
                        this.f153r0 = new dagger.hilt.android.internal.managers.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f153r0.k();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final Context o() {
        if (super.o() == null && !this.f152q0) {
            return null;
        }
        q0();
        return this.f151p0;
    }

    public final void q0() {
        if (this.f151p0 == null) {
            this.f151p0 = new dagger.hilt.android.internal.managers.i(super.o(), this);
            this.f152q0 = AbstractC0958a.v(super.o());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return android.support.v4.media.session.b.j0(this, super.r());
    }
}
