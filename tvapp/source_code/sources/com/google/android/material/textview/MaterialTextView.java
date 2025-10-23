package com.google.android.material.textview;

import M3.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.boxhdo.android.tv.R;
import k.C0856H;
import k3.AbstractC0958a;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
public class MaterialTextView extends C0856H {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        TypedValue D6 = AbstractC0958a.D(context2, R.attr.textAppearanceLineHeightEnabled);
        if (D6 == null || D6.type != 18 || D6.data != 0) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC1272a.f14960p;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int m7 = m(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m7 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC1272a.f14959o);
                    int m8 = m(getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (m8 >= 0) {
                        setLineHeight(m8);
                    }
                }
            }
        }
    }

    public static int m(Context context, TypedArray typedArray, int... iArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < iArr.length && i7 < 0; i8++) {
            int i9 = iArr[i8];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i9, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i7 = dimensionPixelSize;
            } else {
                i7 = typedArray.getDimensionPixelSize(i9, -1);
            }
        }
        return i7;
    }

    @Override // k.C0856H, android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        TypedValue D6 = AbstractC0958a.D(context, R.attr.textAppearanceLineHeightEnabled);
        if (D6 == null || D6.type != 18 || D6.data != 0) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i7, AbstractC1272a.f14959o);
            int m7 = m(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m7 >= 0) {
                setLineHeight(m7);
            }
        }
    }
}
