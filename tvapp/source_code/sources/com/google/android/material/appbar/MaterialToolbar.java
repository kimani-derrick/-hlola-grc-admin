package com.google.android.material.appbar;

import F3.k;
import J3.g;
import K.D;
import K.O;
import M3.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import p6.d;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: j0  reason: collision with root package name */
    public Integer f8735j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f8736k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8737l0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2132018026), attributeSet, 0);
        Context context2 = getContext();
        TypedArray e3 = k.e(context2, attributeSet, AbstractC1272a.f14961q, R.attr.toolbarStyle, 2132018026, new int[0]);
        if (e3.hasValue(0)) {
            setNavigationIconTint(e3.getColor(0, -1));
        }
        this.f8736k0 = e3.getBoolean(2, false);
        this.f8737l0 = e3.getBoolean(1, false);
        e3.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.h(context2);
            Field field = O.f1447a;
            gVar.i(D.i(this));
            setBackground(gVar);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            d.F(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (this.f8736k0 || this.f8737l0) {
            TextView d = k.d(this, getTitle());
            TextView d7 = k.d(this, getSubtitle());
            if (d != null || d7 != null) {
                int measuredWidth = getMeasuredWidth();
                int i11 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8 && childAt != d && childAt != d7) {
                        if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f8736k0 && d != null) {
                    u(d, pair);
                }
                if (this.f8737l0 && d7 != null) {
                    u(d7, pair);
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (drawable != null && (num = this.f8735j0) != null) {
            E.a.g(drawable, num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i7) {
        this.f8735j0 = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z7) {
        if (this.f8737l0 != z7) {
            this.f8737l0 = z7;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z7) {
        if (this.f8736k0 != z7) {
            this.f8736k0 = z7;
            requestLayout();
        }
    }

    public final void u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i7 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i8 = measuredWidth2 + i7;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i7, 0), Math.max(i8 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i7 += max;
            i8 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i8 - i7, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i7, textView.getTop(), i8, textView.getBottom());
    }
}
