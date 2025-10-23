package com.google.android.material.datepicker;

import H2.C0002c;
import K.O;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import w0.I;
import w0.n0;
/* loaded from: classes.dex */
public final class j<S> extends r {

    /* renamed from: o0  reason: collision with root package name */
    public int f8867o0;

    /* renamed from: p0  reason: collision with root package name */
    public b f8868p0;

    /* renamed from: q0  reason: collision with root package name */
    public m f8869q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f8870r0;

    /* renamed from: s0  reason: collision with root package name */
    public C0002c f8871s0;

    /* renamed from: t0  reason: collision with root package name */
    public RecyclerView f8872t0;

    /* renamed from: u0  reason: collision with root package name */
    public RecyclerView f8873u0;

    /* renamed from: v0  reason: collision with root package name */
    public View f8874v0;

    /* renamed from: w0  reason: collision with root package name */
    public View f8875w0;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        if (bundle == null) {
            bundle = this.f6139v;
        }
        this.f8867o0 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC0515y1.t(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f8868p0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f8869q0 = (m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7;
        int i8;
        I i9;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(o(), this.f8867o0);
        this.f8871s0 = new C0002c(contextThemeWrapper, 25);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        m mVar = this.f8868p0.f8844q;
        if (k.k0(contextThemeWrapper, 16843277)) {
            i7 = R.layout.mtrl_calendar_vertical;
            i8 = 1;
        } else {
            i7 = R.layout.mtrl_calendar_horizontal;
            i8 = 0;
        }
        View inflate = cloneInContext.inflate(i7, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        O.i(gridView, new P.i(1));
        gridView.setAdapter((ListAdapter) new e());
        gridView.setNumColumns(mVar.f8893t);
        gridView.setEnabled(false);
        this.f8873u0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        o();
        this.f8873u0.setLayoutManager(new f(this, i8, i8));
        this.f8873u0.setTag("MONTHS_VIEW_GROUP_TAG");
        q qVar = new q(contextThemeWrapper, this.f8868p0, new Z5.n(this));
        this.f8873u0.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f8872t0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f8872t0.setLayoutManager(new GridLayoutManager(integer));
            this.f8872t0.setAdapter(new w(this));
            this.f8872t0.h(new g(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            O.i(materialButton, new A3.f(3, this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f8874v0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f8875w0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            g0(1);
            materialButton.setText(this.f8869q0.h(inflate.getContext()));
            this.f8873u0.i(new h(this, qVar, materialButton));
            materialButton.setOnClickListener(new L3.e(5, this));
            materialButton3.setOnClickListener(new i(this, qVar, 0));
            materialButton2.setOnClickListener(new i(this, qVar, 1));
        }
        if (!k.k0(contextThemeWrapper, 16843277) && (recyclerView2 = (i9 = new I()).f15460a) != (recyclerView = this.f8873u0)) {
            n0 n0Var = i9.f15461b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f6962z0;
                if (arrayList != null) {
                    arrayList.remove(n0Var);
                }
                i9.f15460a.setOnFlingListener(null);
            }
            i9.f15460a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    i9.f15460a.i(n0Var);
                    i9.f15460a.setOnFlingListener(i9);
                    new Scroller(i9.f15460a.getContext(), new DecelerateInterpolator());
                    i9.f();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        this.f8873u0.j0(qVar.f8905e.f8844q.i(this.f8869q0));
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void R(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f8867o0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f8868p0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f8869q0);
    }

    public final void f0(m mVar) {
        boolean z7;
        RecyclerView recyclerView;
        H.a aVar;
        q qVar = (q) this.f8873u0.getAdapter();
        int i7 = qVar.f8905e.f8844q.i(mVar);
        int i8 = i7 - qVar.f8905e.f8844q.i(this.f8869q0);
        boolean z8 = false;
        if (Math.abs(i8) > 3) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i8 > 0) {
            z8 = true;
        }
        this.f8869q0 = mVar;
        if (z7 && z8) {
            this.f8873u0.j0(i7 - 3);
            recyclerView = this.f8873u0;
            aVar = new H.a(i7, 3, this);
        } else if (z7) {
            this.f8873u0.j0(i7 + 3);
            recyclerView = this.f8873u0;
            aVar = new H.a(i7, 3, this);
        } else {
            recyclerView = this.f8873u0;
            aVar = new H.a(i7, 3, this);
        }
        recyclerView.post(aVar);
    }

    public final void g0(int i7) {
        this.f8870r0 = i7;
        if (i7 == 2) {
            this.f8872t0.getLayoutManager().K0(this.f8869q0.f8892s - ((w) this.f8872t0.getAdapter()).d.f8868p0.f8844q.f8892s);
            this.f8874v0.setVisibility(0);
            this.f8875w0.setVisibility(8);
        } else if (i7 == 1) {
            this.f8874v0.setVisibility(8);
            this.f8875w0.setVisibility(0);
            f0(this.f8869q0);
        }
    }
}
