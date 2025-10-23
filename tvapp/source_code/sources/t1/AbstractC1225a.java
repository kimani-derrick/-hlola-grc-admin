package t1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.d;
import androidx.lifecycle.Y;
import com.boxhdo.android.tv.ui.hostMain.TvMainFragment;
import dagger.hilt.android.internal.managers.g;
import k3.AbstractC0958a;
import q1.i;
import q1.t;
import w5.InterfaceC1437b;
/* renamed from: t1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1225a<V extends i, B extends androidx.databinding.d> extends t<V, B> implements InterfaceC1437b {

    /* renamed from: p0  reason: collision with root package name */
    public dagger.hilt.android.internal.managers.i f14518p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f14519q0;

    /* renamed from: r0  reason: collision with root package name */
    public volatile g f14520r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Object f14521s0 = new Object();

    /* renamed from: t0  reason: collision with root package name */
    public boolean f14522t0 = false;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void E(Activity activity) {
        boolean z7;
        this.f6117U = true;
        dagger.hilt.android.internal.managers.i iVar = this.f14518p0;
        if (iVar != null && g.b(iVar) != activity) {
            z7 = false;
        } else {
            z7 = true;
        }
        android.support.v4.media.session.b.p(z7, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q0();
        if (!this.f14522t0) {
            this.f14522t0 = true;
            TvMainFragment tvMainFragment = (TvMainFragment) this;
            ((InterfaceC1229e) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        super.F(context);
        q0();
        if (!this.f14522t0) {
            this.f14522t0 = true;
            TvMainFragment tvMainFragment = (TvMainFragment) this;
            ((InterfaceC1229e) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater L6 = super.L(bundle);
        return L6.cloneInContext(new dagger.hilt.android.internal.managers.i(L6, this));
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f14520r0 == null) {
            synchronized (this.f14521s0) {
                try {
                    if (this.f14520r0 == null) {
                        this.f14520r0 = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f14520r0.k();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final Context o() {
        if (super.o() == null && !this.f14519q0) {
            return null;
        }
        q0();
        return this.f14518p0;
    }

    public final void q0() {
        if (this.f14518p0 == null) {
            this.f14518p0 = new dagger.hilt.android.internal.managers.i(super.o(), this);
            this.f14519q0 = AbstractC0958a.v(super.o());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return android.support.v4.media.session.b.j0(this, super.r());
    }
}
