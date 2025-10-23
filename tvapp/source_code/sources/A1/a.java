package A1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.leanback.app.H;
import androidx.lifecycle.Y;
import com.boxhdo.android.tv.ui.search.TvSearchFragment;
import k3.AbstractC0958a;
import w5.InterfaceC1437b;
/* loaded from: classes.dex */
public abstract class a extends H implements InterfaceC1437b {

    /* renamed from: T0  reason: collision with root package name */
    public dagger.hilt.android.internal.managers.i f14T0;
    public boolean U0;

    /* renamed from: V0  reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.g f15V0;

    /* renamed from: W0  reason: collision with root package name */
    public final Object f16W0 = new Object();

    /* renamed from: X0  reason: collision with root package name */
    public boolean f17X0 = false;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void E(Activity activity) {
        boolean z7;
        this.f6117U = true;
        dagger.hilt.android.internal.managers.i iVar = this.f14T0;
        if (iVar != null && dagger.hilt.android.internal.managers.g.b(iVar) != activity) {
            z7 = false;
        } else {
            z7 = true;
        }
        android.support.v4.media.session.b.p(z7, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        if (!this.f17X0) {
            this.f17X0 = true;
            TvSearchFragment tvSearchFragment = (TvSearchFragment) this;
            ((m) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        super.F(context);
        s0();
        if (!this.f17X0) {
            this.f17X0 = true;
            TvSearchFragment tvSearchFragment = (TvSearchFragment) this;
            ((m) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater L6 = super.L(bundle);
        return L6.cloneInContext(new dagger.hilt.android.internal.managers.i(L6, this));
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f15V0 == null) {
            synchronized (this.f16W0) {
                try {
                    if (this.f15V0 == null) {
                        this.f15V0 = new dagger.hilt.android.internal.managers.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f15V0.k();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final Context o() {
        if (super.o() == null && !this.U0) {
            return null;
        }
        s0();
        return this.f14T0;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return android.support.v4.media.session.b.j0(this, super.r());
    }

    public final void s0() {
        if (this.f14T0 == null) {
            this.f14T0 = new dagger.hilt.android.internal.managers.i(super.o(), this);
            this.U0 = AbstractC0958a.v(super.o());
        }
    }
}
