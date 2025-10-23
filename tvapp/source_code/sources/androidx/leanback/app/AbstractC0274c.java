package androidx.leanback.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.widget.AbstractC0283b0;
import androidx.leanback.widget.P;
import androidx.leanback.widget.VerticalGridView;
import w0.L;
import w0.k0;
/* renamed from: androidx.leanback.app.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0274c extends ComponentCallbacksC0269x {

    /* renamed from: n0  reason: collision with root package name */
    public P f6196n0;

    /* renamed from: o0  reason: collision with root package name */
    public VerticalGridView f6197o0;

    /* renamed from: p0  reason: collision with root package name */
    public AbstractC0283b0 f6198p0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f6201s0;

    /* renamed from: q0  reason: collision with root package name */
    public final androidx.leanback.widget.H f6199q0 = new androidx.leanback.widget.H();

    /* renamed from: r0  reason: collision with root package name */
    public int f6200r0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public final C0273b f6202t0 = new C0273b(this);

    /* renamed from: u0  reason: collision with root package name */
    public final C0272a f6203u0 = new C0272a(0, this);

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(g0(), viewGroup, false);
        this.f6197o0 = f0(inflate);
        if (this.f6201s0) {
            this.f6201s0 = false;
            j0();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void J() {
        this.f6117U = true;
        C0273b c0273b = this.f6202t0;
        if (c0273b.f6194a) {
            c0273b.f6194a = false;
            c0273b.f6195b.f6199q0.f15466a.unregisterObserver(c0273b);
        }
        this.f6197o0 = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void R(Bundle bundle) {
        bundle.putInt("currentSelectedPosition", this.f6200r0);
    }

    public abstract VerticalGridView f0(View view);

    public abstract int g0();

    public abstract void h0(k0 k0Var, int i7, int i8);

    public void i0() {
        VerticalGridView verticalGridView = this.f6197o0;
        if (verticalGridView != null) {
            verticalGridView.setLayoutFrozen(false);
            this.f6197o0.setAnimateChildLayout(true);
            this.f6197o0.setPruneChild(true);
            this.f6197o0.setFocusSearchDisabled(false);
            this.f6197o0.setScrollEnabled(true);
        }
    }

    public boolean j0() {
        VerticalGridView verticalGridView = this.f6197o0;
        if (verticalGridView == null) {
            this.f6201s0 = true;
            return false;
        }
        verticalGridView.setAnimateChildLayout(false);
        this.f6197o0.setScrollEnabled(false);
        return true;
    }

    public final void k0() {
        if (this.f6196n0 == null) {
            return;
        }
        L adapter = this.f6197o0.getAdapter();
        androidx.leanback.widget.H h7 = this.f6199q0;
        if (adapter != h7) {
            this.f6197o0.setAdapter(h7);
        }
        if (h7.a() == 0 && this.f6200r0 >= 0) {
            C0273b c0273b = this.f6202t0;
            c0273b.f6194a = true;
            c0273b.f6195b.f6199q0.f15466a.registerObserver(c0273b);
            return;
        }
        int i7 = this.f6200r0;
        if (i7 >= 0) {
            this.f6197o0.setSelectedPosition(i7);
        }
    }
}
