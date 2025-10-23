package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class l<S> extends r {

    /* renamed from: o0  reason: collision with root package name */
    public int f8888o0;

    /* renamed from: p0  reason: collision with root package name */
    public b f8889p0;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        if (bundle == null) {
            bundle = this.f6139v;
        }
        this.f8888o0 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC0515y1.t(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f8889p0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(o(), this.f8888o0));
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void R(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f8888o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f8889p0);
    }
}
