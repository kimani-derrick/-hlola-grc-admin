package com.google.android.material.snackbar;

import K.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: q  reason: collision with root package name */
    public TextView f8927q;

    /* renamed from: r  reason: collision with root package name */
    public Button f8928r;

    /* renamed from: s  reason: collision with root package name */
    public final int f8929s;

    /* renamed from: t  reason: collision with root package name */
    public int f8930t;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1272a.f14965u);
        this.f8929s = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f8930t = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i7, int i8, int i9) {
        boolean z7;
        if (i7 != getOrientation()) {
            setOrientation(i7);
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f8927q.getPaddingTop() == i8 && this.f8927q.getPaddingBottom() == i9) {
            return z7;
        }
        TextView textView = this.f8927q;
        Field field = O.f1447a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i8, textView.getPaddingEnd(), i9);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i8, textView.getPaddingRight(), i9);
        return true;
    }

    public Button getActionView() {
        return this.f8928r;
    }

    public TextView getMessageView() {
        return this.f8927q;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f8927q = (TextView) findViewById(R.id.snackbar_text);
        this.f8928r = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int i9 = this.f8929s;
        if (i9 > 0 && getMeasuredWidth() > i9) {
            i7 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            super.onMeasure(i7, i8);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z7 = this.f8927q.getLayout().getLineCount() > 1;
        if (!z7 || this.f8930t <= 0 || this.f8928r.getMeasuredWidth() <= this.f8930t) {
            if (!z7) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i7, i8);
    }

    public void setMaxInlineActionWidth(int i7) {
        this.f8930t = i7;
    }
}
