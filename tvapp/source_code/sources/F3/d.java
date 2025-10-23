package F3;

import K.O;
import android.view.View;
import android.view.ViewGroup;
import com.boxhdo.android.tv.R;
import com.google.android.material.chip.ChipGroup;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public abstract class d extends ViewGroup {

    /* renamed from: q  reason: collision with root package name */
    public int f700q;

    /* renamed from: r  reason: collision with root package name */
    public int f701r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f702s;

    /* renamed from: t  reason: collision with root package name */
    public int f703t;

    public int getItemSpacing() {
        return this.f701r;
    }

    public int getLineSpacing() {
        return this.f700q;
    }

    public int getRowCount() {
        return this.f703t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        boolean z8;
        int paddingLeft;
        int paddingRight;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            this.f703t = 0;
            return;
        }
        this.f703t = 1;
        Field field = O.f1447a;
        if (getLayoutDirection() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z8) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i13 = (i9 - i7) - paddingRight;
        int i14 = paddingLeft;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.getMarginStart();
                    i11 = marginLayoutParams.getMarginEnd();
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i14 + i12;
                if (!this.f702s && measuredWidth > i13) {
                    i15 = this.f700q + paddingTop;
                    this.f703t++;
                    i14 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f703t - 1));
                int i17 = i14 + i12;
                int measuredWidth2 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z8) {
                    i17 = i13 - measuredWidth2;
                    measuredWidth2 = (i13 - i14) - i12;
                }
                childAt.layout(i17, i15, measuredWidth2, measuredHeight);
                i14 += childAt.getMeasuredWidth() + i12 + i11 + this.f701r;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i9 = Integer.MAX_VALUE;
        } else {
            i9 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i9 - getPaddingRight();
        int i13 = paddingTop;
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i7, i8);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i11 = marginLayoutParams.leftMargin;
                    i10 = marginLayoutParams.rightMargin;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i11 > paddingRight && !((ChipGroup) this).f702s) {
                    i12 = getPaddingLeft();
                    i13 = this.f700q + paddingTop;
                } else {
                    i12 = i16;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i12 + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i13;
                if (measuredWidth > i14) {
                    i14 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i11 + i10 + this.f701r + i12;
                if (i15 == getChildCount() - 1) {
                    i14 += i10;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i14;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i7) {
        this.f701r = i7;
    }

    public void setLineSpacing(int i7) {
        this.f700q = i7;
    }

    public void setSingleLine(boolean z7) {
        this.f702s = z7;
    }
}
