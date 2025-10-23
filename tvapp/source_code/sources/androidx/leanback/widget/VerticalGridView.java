package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import f0.AbstractC0659a;
/* loaded from: classes.dex */
public class VerticalGridView extends AbstractC0292g {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d1.z1(1);
        v0(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0659a.f10204j);
        setColumnWidth(obtainStyledAttributes);
        setNumColumns(obtainStyledAttributes.getInt(1, 1));
        obtainStyledAttributes.recycle();
    }

    public void setColumnWidth(int i7) {
        this.d1.A1(i7);
        requestLayout();
    }

    public void setNumColumns(int i7) {
        C0321y c0321y = this.d1;
        if (i7 >= 0) {
            c0321y.f6691V = i7;
            requestLayout();
            return;
        }
        c0321y.getClass();
        throw new IllegalArgumentException();
    }

    public void setColumnWidth(TypedArray typedArray) {
        if (typedArray.peekValue(0) != null) {
            setColumnWidth(typedArray.getLayoutDimension(0, 0));
        }
    }
}
