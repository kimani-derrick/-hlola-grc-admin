package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import k.View$OnLayoutChangeListenerC0925y0;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new View$OnLayoutChangeListenerC0925y0(1, this);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, x.AbstractC1438a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i7) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, x.AbstractC1438a
    public final boolean o(View view, int i7, int i8) {
        AbstractC1111a.w(view);
        throw null;
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new View$OnLayoutChangeListenerC0925y0(1, this);
        new Rect();
    }
}
