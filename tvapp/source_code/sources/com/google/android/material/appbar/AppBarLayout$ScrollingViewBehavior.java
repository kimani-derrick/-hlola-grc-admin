package com.google.android.material.appbar;

import K.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import u3.AbstractC1272a;
import w3.AbstractC1403a;
import x.AbstractC1438a;
import x.C1441d;
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1403a {

    /* renamed from: c  reason: collision with root package name */
    public final int f8734c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
        }
    }

    @Override // x.AbstractC1438a
    public final boolean d(View view, View view2) {
        int i7;
        AbstractC1438a abstractC1438a = ((C1441d) view2.getLayoutParams()).f16129a;
        if (abstractC1438a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC1438a).getClass();
            int i8 = this.f8734c;
            if (i8 == 0 || (i7 = (int) (0.0f * i8)) < 0) {
                i8 = 0;
            } else if (i7 <= i8) {
                i8 = i7;
            }
            int i9 = bottom - i8;
            Field field = O.f1447a;
            view.offsetTopAndBottom(i9);
        }
        return false;
    }

    @Override // x.AbstractC1438a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view) {
        int i7 = view.getLayoutParams().height;
        if (i7 == -1 || i7 == -2) {
            s(coordinatorLayout.j(view));
            return false;
        }
        return false;
    }

    @Override // x.AbstractC1438a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // w3.AbstractC1403a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i7) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i7);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1272a.f14963s);
        this.f8734c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
