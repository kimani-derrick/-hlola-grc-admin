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
public class FloatingActionButton$BaseBehavior<T> extends AbstractC1438a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // x.AbstractC1438a
    public final boolean a(View view) {
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

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1272a.f14952g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
