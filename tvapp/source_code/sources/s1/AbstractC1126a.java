package s1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.Y;
import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import k3.AbstractC0958a;
import q1.AbstractC1099a;
import w5.InterfaceC1437b;
/* renamed from: s1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1126a extends AbstractC1099a implements InterfaceC1437b {

    /* renamed from: D1  reason: collision with root package name */
    public dagger.hilt.android.internal.managers.i f13542D1;

    /* renamed from: E1  reason: collision with root package name */
    public boolean f13543E1;

    /* renamed from: F1  reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.g f13544F1;

    /* renamed from: G1  reason: collision with root package name */
    public final Object f13545G1 = new Object();

    /* renamed from: H1  reason: collision with root package name */
    public boolean f13546H1 = false;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void E(Activity activity) {
        boolean z7;
        this.f6117U = true;
        dagger.hilt.android.internal.managers.i iVar = this.f13542D1;
        if (iVar != null && dagger.hilt.android.internal.managers.g.b(iVar) != activity) {
            z7 = false;
        } else {
            z7 = true;
        }
        android.support.v4.media.session.b.p(z7, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S0();
        if (!this.f13546H1) {
            this.f13546H1 = true;
            TvHomeFragment tvHomeFragment = (TvHomeFragment) this;
            ((InterfaceC1138m) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        super.F(context);
        S0();
        if (!this.f13546H1) {
            this.f13546H1 = true;
            TvHomeFragment tvHomeFragment = (TvHomeFragment) this;
            ((InterfaceC1138m) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater L6 = super.L(bundle);
        return L6.cloneInContext(new dagger.hilt.android.internal.managers.i(L6, this));
    }

    public final void S0() {
        if (this.f13542D1 == null) {
            this.f13542D1 = new dagger.hilt.android.internal.managers.i(super.o(), this);
            this.f13543E1 = AbstractC0958a.v(super.o());
        }
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f13544F1 == null) {
            synchronized (this.f13545G1) {
                try {
                    if (this.f13544F1 == null) {
                        this.f13544F1 = new dagger.hilt.android.internal.managers.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f13544F1.k();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final Context o() {
        if (super.o() == null && !this.f13543E1) {
            return null;
        }
        S0();
        return this.f13542D1;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return android.support.v4.media.session.b.j0(this, super.r());
    }
}
