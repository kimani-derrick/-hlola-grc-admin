package p1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.d;
import androidx.lifecycle.Y;
import dagger.hilt.android.internal.managers.g;
import k3.AbstractC0958a;
import q1.i;
import q1.t;
import w5.InterfaceC1437b;
/* renamed from: p1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1080a<V extends i, B extends androidx.databinding.d> extends t<V, B> implements InterfaceC1437b {

    /* renamed from: p0  reason: collision with root package name */
    public dagger.hilt.android.internal.managers.i f13110p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f13111q0;

    /* renamed from: r0  reason: collision with root package name */
    public volatile g f13112r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Object f13113s0 = new Object();

    /* renamed from: t0  reason: collision with root package name */
    public boolean f13114t0 = false;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void E(Activity activity) {
        boolean z7;
        this.f6117U = true;
        dagger.hilt.android.internal.managers.i iVar = this.f13110p0;
        if (iVar != null && g.b(iVar) != activity) {
            z7 = false;
        } else {
            z7 = true;
        }
        android.support.v4.media.session.b.p(z7, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q0();
        if (!this.f13114t0) {
            this.f13114t0 = true;
            C1083d c1083d = (C1083d) this;
            ((InterfaceC1084e) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        super.F(context);
        q0();
        if (!this.f13114t0) {
            this.f13114t0 = true;
            C1083d c1083d = (C1083d) this;
            ((InterfaceC1084e) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater L6 = super.L(bundle);
        return L6.cloneInContext(new dagger.hilt.android.internal.managers.i(L6, this));
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f13112r0 == null) {
            synchronized (this.f13113s0) {
                try {
                    if (this.f13112r0 == null) {
                        this.f13112r0 = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f13112r0.k();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final Context o() {
        if (super.o() == null && !this.f13111q0) {
            return null;
        }
        q0();
        return this.f13110p0;
    }

    public final void q0() {
        if (this.f13110p0 == null) {
            this.f13110p0 = new dagger.hilt.android.internal.managers.i(super.o(), this);
            this.f13111q0 = AbstractC0958a.v(super.o());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return android.support.v4.media.session.b.j0(this, super.r());
    }
}
