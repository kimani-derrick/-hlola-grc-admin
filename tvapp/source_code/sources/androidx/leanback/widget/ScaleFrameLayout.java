package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ScaleFrameLayout extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    public float f6487q;

    /* renamed from: r  reason: collision with root package name */
    public float f6488r;

    /* renamed from: s  reason: collision with root package name */
    public float f6489s;

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6487q = 1.0f;
        this.f6488r = 1.0f;
        this.f6489s = 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setScaleX(this.f6489s);
        view.setScaleY(this.f6489s);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z7) {
        boolean addViewInLayout = super.addViewInLayout(view, i7, layoutParams, z7);
        if (addViewInLayout) {
            view.setScaleX(this.f6489s);
            view.setScaleY(this.f6489s);
        }
        return addViewInLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ScaleFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        float f = this.f6487q;
        int i9 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i9 == 0 && this.f6488r == 1.0f) {
            super.onMeasure(i7, i8);
            return;
        }
        if (i9 != 0) {
            i7 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i7) / f) + 0.5f), View.MeasureSpec.getMode(i7));
        }
        float f7 = this.f6488r;
        if (f7 != 1.0f) {
            i8 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i8) / f7) + 0.5f), View.MeasureSpec.getMode(i8));
        }
        super.onMeasure(i7, i8);
        setMeasuredDimension((int) ((getMeasuredWidth() * this.f6487q) + 0.5f), (int) ((getMeasuredHeight() * this.f6488r) + 0.5f));
    }

    public void setChildScale(float f) {
        if (this.f6489s != f) {
            this.f6489s = f;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                getChildAt(i7).setScaleX(f);
                getChildAt(i7).setScaleY(f);
            }
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float f) {
        if (f != this.f6487q) {
            this.f6487q = f;
            requestLayout();
        }
    }

    public void setLayoutScaleY(float f) {
        if (f != this.f6488r) {
            this.f6488r = f;
            requestLayout();
        }
    }
}
