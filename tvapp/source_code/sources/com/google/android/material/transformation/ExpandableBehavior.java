package com.google.android.material.transformation;

import K.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import x.AbstractC1438a;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC1438a {
    public ExpandableBehavior() {
    }

    @Override // x.AbstractC1438a
    public abstract void b(View view);

    @Override // x.AbstractC1438a
    public final boolean d(View view, View view2) {
        AbstractC0515y1.v(view2);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i7) {
        Field field = O.f1447a;
        if (!view.isLaidOut()) {
            ArrayList j7 = coordinatorLayout.j(view);
            int size = j7.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view2 = (View) j7.get(i8);
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
