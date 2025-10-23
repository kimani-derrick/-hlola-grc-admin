package y1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.leanback.app.H;
import androidx.lifecycle.Y;
import com.boxhdo.android.tv.ui.network_detail.TvNetworkDetailFragment;
import dagger.hilt.android.internal.managers.i;
import k3.AbstractC0958a;
import w5.InterfaceC1437b;
/* renamed from: y1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1490a extends H implements InterfaceC1437b {

    /* renamed from: T0  reason: collision with root package name */
    public i f16350T0;
    public boolean U0;

    /* renamed from: V0  reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.g f16351V0;

    /* renamed from: W0  reason: collision with root package name */
    public final Object f16352W0 = new Object();

    /* renamed from: X0  reason: collision with root package name */
    public boolean f16353X0 = false;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void E(Activity activity) {
        boolean z7;
        this.f6117U = true;
        i iVar = this.f16350T0;
        if (iVar != null && dagger.hilt.android.internal.managers.g.b(iVar) != activity) {
            z7 = false;
        } else {
            z7 = true;
        }
        android.support.v4.media.session.b.p(z7, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        if (!this.f16353X0) {
            this.f16353X0 = true;
            TvNetworkDetailFragment tvNetworkDetailFragment = (TvNetworkDetailFragment) this;
            ((g) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        super.F(context);
        s0();
        if (!this.f16353X0) {
            this.f16353X0 = true;
            TvNetworkDetailFragment tvNetworkDetailFragment = (TvNetworkDetailFragment) this;
            ((g) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater L6 = super.L(bundle);
        return L6.cloneInContext(new i(L6, this));
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f16351V0 == null) {
            synchronized (this.f16352W0) {
                try {
                    if (this.f16351V0 == null) {
                        this.f16351V0 = new dagger.hilt.android.internal.managers.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f16351V0.k();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final Context o() {
        if (super.o() == null && !this.U0) {
            return null;
        }
        s0();
        return this.f16350T0;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return android.support.v4.media.session.b.j0(this, super.r());
    }

    public final void s0() {
        if (this.f16350T0 == null) {
            this.f16350T0 = new i(super.o(), this);
            this.U0 = AbstractC0958a.v(super.o());
        }
    }
}
