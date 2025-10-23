package com.google.android.material.timepicker;

import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import u3.AbstractC1272a;
import v.C1305f;
import v.C1306g;
import v.C1310k;
/* loaded from: classes.dex */
public abstract class f extends ConstraintLayout {
    public final e F;

    /* renamed from: G  reason: collision with root package name */
    public int f9045G;

    /* renamed from: H  reason: collision with root package name */
    public final J3.g f9046H;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        J3.g gVar = new J3.g();
        this.f9046H = gVar;
        J3.h hVar = new J3.h(0.5f);
        J3.j e3 = gVar.f1362q.f1332a.e();
        e3.f1376e = hVar;
        e3.f = hVar;
        e3.f1377g = hVar;
        e3.f1378h = hVar;
        gVar.setShapeAppearanceModel(e3.a());
        this.f9046H.j(ColorStateList.valueOf(-1));
        J3.g gVar2 = this.f9046H;
        Field field = O.f1447a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1272a.f14962r, R.attr.materialClockStyle, 0);
        this.f9045G = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.F = new e(this);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (view.getId() == -1) {
            Field field = O.f1447a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.F;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public final void f() {
        int childCount = getChildCount();
        int i7 = 1;
        for (int i8 = 0; i8 < childCount; i8++) {
            if ("skip".equals(getChildAt(i8).getTag())) {
                i7++;
            }
        }
        C1310k c1310k = new C1310k();
        c1310k.b(this);
        float f = 0.0f;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i10 = this.f9045G;
                HashMap hashMap = c1310k.f15237c;
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new C1305f());
                }
                C1306g c1306g = ((C1305f) hashMap.get(Integer.valueOf(id))).d;
                c1306g.f15212w = R.id.circle_center;
                c1306g.f15213x = i10;
                c1306g.f15214y = f;
                f = (360.0f / (childCount - i7)) + f;
            }
        }
        c1310k.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.F;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i7) {
        this.f9046H.j(ColorStateList.valueOf(i7));
    }
}
