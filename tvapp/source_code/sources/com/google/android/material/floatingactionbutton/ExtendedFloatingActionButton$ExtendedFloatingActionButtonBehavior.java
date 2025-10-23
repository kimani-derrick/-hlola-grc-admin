package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import r0.AbstractC1111a;
import u3.AbstractC1272a;
import x.AbstractC1438a;
import x.C1441d;
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC1438a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // x.AbstractC1438a
    public final /* bridge */ /* synthetic */ boolean a(View view) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final void c(C1441d c1441d) {
        if (c1441d.f16134h == 0) {
            c1441d.f16134h = 80;
        }
    }

    @Override // x.AbstractC1438a
    public final boolean d(View view, View view2) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i7) {
        AbstractC1111a.w(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1272a.f);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
