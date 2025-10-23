package o1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import androidx.lifecycle.Y;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import j1.AbstractC0811i;
import k3.AbstractC0958a;
import w4.l0;
import w5.InterfaceC1437b;
/* renamed from: o1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059d extends DialogInterface$OnCancelListenerC0263q implements InterfaceC1437b {

    /* renamed from: D0  reason: collision with root package name */
    public dagger.hilt.android.internal.managers.i f12843D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f12844E0;

    /* renamed from: F0  reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.g f12845F0;

    /* renamed from: I0  reason: collision with root package name */
    public AbstractC0811i f12847I0;
    public final Object G0 = new Object();

    /* renamed from: H0  reason: collision with root package name */
    public boolean f12846H0 = false;

    /* renamed from: J0  reason: collision with root package name */
    public final H.e f12848J0 = l0.k(this, M5.p.a(TvPlayerViewModel.class), new A1.i(10, this), new A1.i(11, this), new A1.i(12, this));

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void E(Activity activity) {
        boolean z7;
        this.f6117U = true;
        dagger.hilt.android.internal.managers.i iVar = this.f12843D0;
        if (iVar != null && dagger.hilt.android.internal.managers.g.b(iVar) != activity) {
            z7 = false;
        } else {
            z7 = true;
        }
        android.support.v4.media.session.b.p(z7, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j0();
        if (!this.f12846H0) {
            this.f12846H0 = true;
            ((InterfaceC1060e) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        super.F(context);
        j0();
        if (!this.f12846H0) {
            this.f12846H0 = true;
            ((InterfaceC1060e) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        M5.g.f(layoutInflater, "inflater");
        int i7 = AbstractC0811i.f11647t;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        AbstractC0811i abstractC0811i = (AbstractC0811i) androidx.databinding.d.K0(layoutInflater, R.layout.dialog_tv_select_speed, viewGroup, false, null);
        M5.g.e(abstractC0811i, "inflate(inflater, container, false)");
        this.f12847I0 = abstractC0811i;
        String valueOf = String.valueOf(((TvPlayerViewModel) this.f12848J0.getValue()).f7814t);
        RadioGroup radioGroup = abstractC0811i.f11648r;
        ((RadioButton) radioGroup.findViewWithTag(valueOf)).setChecked(true);
        radioGroup.setOnCheckedChangeListener(new C1056a(abstractC0811i, this, 1));
        abstractC0811i.f11649s.setOnClickListener(new C1.b(7, this));
        AbstractC0811i abstractC0811i2 = this.f12847I0;
        if (abstractC0811i2 != null) {
            return abstractC0811i2.f5662g;
        }
        M5.g.l("binding");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater L6 = super.L(bundle);
        return L6.cloneInContext(new dagger.hilt.android.internal.managers.i(L6, this));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void Q() {
        Window window;
        Window window2;
        this.f6117U = true;
        Dialog dialog = this.y0;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -2);
        }
        Dialog dialog2 = this.y0;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final void j0() {
        if (this.f12843D0 == null) {
            this.f12843D0 = new dagger.hilt.android.internal.managers.i(super.o(), this);
            this.f12844E0 = AbstractC0958a.v(super.o());
        }
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f12845F0 == null) {
            synchronized (this.G0) {
                try {
                    if (this.f12845F0 == null) {
                        this.f12845F0 = new dagger.hilt.android.internal.managers.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f12845F0.k();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final Context o() {
        if (super.o() == null && !this.f12844E0) {
            return null;
        }
        j0();
        return this.f12843D0;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return android.support.v4.media.session.b.j0(this, super.r());
    }
}
