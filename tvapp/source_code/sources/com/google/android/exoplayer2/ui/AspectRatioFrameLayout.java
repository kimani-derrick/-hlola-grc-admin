package com.google.android.exoplayer2.ui;

import X2.AbstractC0124f;
import X2.InterfaceC0119a;
import X2.RunnableC0120b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
@Deprecated
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f8128t = 0;

    /* renamed from: q  reason: collision with root package name */
    public final RunnableC0120b f8129q;

    /* renamed from: r  reason: collision with root package name */
    public float f8130r;

    /* renamed from: s  reason: collision with root package name */
    public int f8131s;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8131s = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0124f.f4172a, 0, 0);
            try {
                this.f8131s = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f8129q = new RunnableC0120b(this);
    }

    public int getResizeMode() {
        return this.f8131s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r4 > 0.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 > 0.0f) goto L27;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f8130r
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f8130r
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            X2.b r6 = r8.f8129q
            if (r3 > 0) goto L39
            boolean r9 = r6.f4157r
            if (r9 != 0) goto L38
            r6.f4157r = r5
            java.lang.Object r9 = r6.f4158s
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r9 = (com.google.android.exoplayer2.ui.AspectRatioFrameLayout) r9
            r9.post(r6)
        L38:
            return
        L39:
            int r3 = r8.f8131s
            if (r3 == 0) goto L54
            if (r3 == r5) goto L4f
            r7 = 2
            if (r3 == r7) goto L4a
            r7 = 4
            if (r3 == r7) goto L46
            goto L59
        L46:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L4f
        L4a:
            float r9 = r8.f8130r
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L59
        L4f:
            float r10 = r8.f8130r
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L59
        L54:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L4a
            goto L4f
        L59:
            boolean r10 = r6.f4157r
            if (r10 != 0) goto L66
            r6.f4157r = r5
            java.lang.Object r10 = r6.f4158s
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r10 = (com.google.android.exoplayer2.ui.AspectRatioFrameLayout) r10
            r10.post(r6)
        L66:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.f8130r != f) {
            this.f8130r = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i7) {
        if (this.f8131s != i7) {
            this.f8131s = i7;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC0119a interfaceC0119a) {
    }
}
