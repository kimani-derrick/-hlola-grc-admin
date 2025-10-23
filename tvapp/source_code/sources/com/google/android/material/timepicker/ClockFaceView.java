package com.google.android.material.timepicker;

import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import java.util.Arrays;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
class ClockFaceView extends f implements d {

    /* renamed from: I  reason: collision with root package name */
    public final ClockHandView f9017I;

    /* renamed from: J  reason: collision with root package name */
    public final Rect f9018J;

    /* renamed from: K  reason: collision with root package name */
    public final RectF f9019K;

    /* renamed from: L  reason: collision with root package name */
    public final SparseArray f9020L;

    /* renamed from: M  reason: collision with root package name */
    public final c f9021M;

    /* renamed from: N  reason: collision with root package name */
    public final int[] f9022N;

    /* renamed from: O  reason: collision with root package name */
    public final float[] f9023O;

    /* renamed from: P  reason: collision with root package name */
    public final int f9024P;

    /* renamed from: Q  reason: collision with root package name */
    public final int f9025Q;

    /* renamed from: R  reason: collision with root package name */
    public final int f9026R;

    /* renamed from: S  reason: collision with root package name */
    public final int f9027S;

    /* renamed from: T  reason: collision with root package name */
    public final String[] f9028T;

    /* renamed from: U  reason: collision with root package name */
    public float f9029U;

    /* renamed from: V  reason: collision with root package name */
    public final ColorStateList f9030V;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9018J = new Rect();
        this.f9019K = new RectF();
        SparseArray sparseArray = new SparseArray();
        this.f9020L = sparseArray;
        this.f9023O = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1272a.d, R.attr.materialClockStyle, 2132018021);
        Resources resources = getResources();
        ColorStateList p3 = m3.g.p(context, obtainStyledAttributes, 1);
        this.f9030V = p3;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f9017I = clockHandView;
        this.f9024P = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = p3.getColorForState(new int[]{16842913}, p3.getDefaultColor());
        this.f9022N = new int[]{colorForState, colorForState, p3.getDefaultColor()};
        clockHandView.f9031q.add(this);
        int defaultColor = android.support.v4.media.session.b.h0(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList p5 = m3.g.p(context, obtainStyledAttributes, 0);
        setBackgroundColor(p5 != null ? p5.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f9021M = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f9028T = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i7 = 0; i7 < Math.max(this.f9028T.length, size); i7++) {
            TextView textView = (TextView) sparseArray.get(i7);
            if (i7 >= this.f9028T.length) {
                removeView(textView);
                sparseArray.remove(i7);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i7, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f9028T[i7]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i7));
                O.i(textView, this.f9021M);
                textView.setTextColor(this.f9030V);
            }
        }
        this.f9025Q = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f9026R = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f9027S = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void g() {
        RadialGradient radialGradient;
        RectF rectF = this.f9017I.f9035u;
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f9020L;
            if (i7 < sparseArray.size()) {
                TextView textView = (TextView) sparseArray.get(i7);
                if (textView != null) {
                    Rect rect = this.f9018J;
                    textView.getDrawingRect(rect);
                    rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                    offsetDescendantRectToMyCoords(textView, rect);
                    RectF rectF2 = this.f9019K;
                    rectF2.set(rect);
                    if (!RectF.intersects(rectF, rectF2)) {
                        radialGradient = null;
                    } else {
                        radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.f9022N, this.f9023O, Shader.TileMode.CLAMP);
                    }
                    textView.getPaint().setShader(radialGradient);
                    textView.invalidate();
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) K3.f.c(1, this.f9028T.length, 1).f1836a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f9027S / Math.max(Math.max(this.f9025Q / displayMetrics.heightPixels, this.f9026R / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
