package com.google.android.material.timepicker;

import K.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.boxhdo.android.tv.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import java.util.HashMap;
import v.C1305f;
import v.C1306g;
import v.C1310k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: G  reason: collision with root package name */
    public static final /* synthetic */ int f9041G = 0;
    public final MaterialButtonToggleGroup F;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g gVar = new g(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.F = materialButtonToggleGroup;
        materialButtonToggleGroup.f8808t.add(new h(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        j jVar = new j(new GestureDetector(getContext(), new i(this)));
        chip.setOnTouchListener(jVar);
        chip2.setOnTouchListener(jVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(gVar);
        chip2.setOnClickListener(gVar);
    }

    public final void f() {
        char c5;
        if (this.F.getVisibility() == 0) {
            C1310k c1310k = new C1310k();
            c1310k.b(this);
            Field field = O.f1447a;
            if (getLayoutDirection() == 0) {
                c5 = 2;
            } else {
                c5 = 1;
            }
            HashMap hashMap = c1310k.f15237c;
            if (hashMap.containsKey(Integer.valueOf((int) R.id.material_clock_display))) {
                C1305f c1305f = (C1305f) hashMap.get(Integer.valueOf((int) R.id.material_clock_display));
                switch (c5) {
                    case 1:
                        C1306g c1306g = c1305f.d;
                        c1306g.f15196h = -1;
                        c1306g.f15194g = -1;
                        c1306g.f15162C = -1;
                        c1306g.f15167I = -1;
                        break;
                    case 2:
                        C1306g c1306g2 = c1305f.d;
                        c1306g2.f15200j = -1;
                        c1306g2.f15198i = -1;
                        c1306g2.f15163D = -1;
                        c1306g2.f15169K = -1;
                        break;
                    case 3:
                        C1306g c1306g3 = c1305f.d;
                        c1306g3.f15202l = -1;
                        c1306g3.f15201k = -1;
                        c1306g3.f15164E = -1;
                        c1306g3.f15168J = -1;
                        break;
                    case 4:
                        C1306g c1306g4 = c1305f.d;
                        c1306g4.f15203m = -1;
                        c1306g4.n = -1;
                        c1306g4.F = -1;
                        c1306g4.f15170L = -1;
                        break;
                    case 5:
                        c1305f.d.f15204o = -1;
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        C1306g c1306g5 = c1305f.d;
                        c1306g5.f15205p = -1;
                        c1306g5.f15206q = -1;
                        c1306g5.f15166H = -1;
                        c1306g5.f15172N = -1;
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        C1306g c1306g6 = c1305f.d;
                        c1306g6.f15207r = -1;
                        c1306g6.f15208s = -1;
                        c1306g6.f15165G = -1;
                        c1306g6.f15171M = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            c1310k.a(this);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (view == this && i7 == 0) {
            f();
        }
    }
}
