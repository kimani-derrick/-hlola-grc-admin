package com.google.android.material.button;

import A3.e;
import A3.f;
import A3.g;
import A3.h;
import F3.k;
import J3.j;
import K.O;
import M3.a;
import T4.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ int f8804A = 0;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f8805q;

    /* renamed from: r  reason: collision with root package name */
    public final g f8806r;

    /* renamed from: s  reason: collision with root package name */
    public final c f8807s;

    /* renamed from: t  reason: collision with root package name */
    public final LinkedHashSet f8808t;

    /* renamed from: u  reason: collision with root package name */
    public final e f8809u;

    /* renamed from: v  reason: collision with root package name */
    public Integer[] f8810v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8811w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8812x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8813y;

    /* renamed from: z  reason: collision with root package name */
    public int f8814z;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132017964), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f8805q = new ArrayList();
        this.f8806r = new g(this);
        this.f8807s = new c(1, this);
        this.f8808t = new LinkedHashSet();
        this.f8809u = new e(this);
        this.f8811w = false;
        TypedArray e3 = k.e(getContext(), attributeSet, AbstractC1272a.f14956k, R.attr.materialButtonToggleGroupStyle, 2132017964, new int[0]);
        setSingleSelection(e3.getBoolean(2, false));
        this.f8814z = e3.getResourceId(0, -1);
        this.f8813y = e3.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        e3.recycle();
        Field field = O.f1447a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (c(i7)) {
                return i7;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof MaterialButton) && c(i8)) {
                i7++;
            }
        }
        return i7;
    }

    private void setCheckedId(int i7) {
        this.f8814z = i7;
        b(i7, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            Field field = O.f1447a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f8798u.add(this.f8806r);
        materialButton.setOnPressedChangeListenerInternal(this.f8807s);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i7 = firstVisibleChildIndex + 1; i7 < getChildCount(); i7++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i7);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i7 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                layoutParams.setMarginEnd(0);
                layoutParams.setMarginStart(-min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                layoutParams.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.f8795D) {
            d(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        J3.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f8805q.add(new h(shapeAppearanceModel.f1386e, shapeAppearanceModel.f1388h, shapeAppearanceModel.f, shapeAppearanceModel.f1387g));
        O.i(materialButton, new f(0, this));
    }

    public final void b(int i7, boolean z7) {
        Iterator it = this.f8808t.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.timepicker.h) it.next()).a();
        }
    }

    public final boolean c(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    public final boolean d(int i7, boolean z7) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f8813y && checkedButtonIds.isEmpty()) {
            View findViewById = findViewById(i7);
            if (findViewById instanceof MaterialButton) {
                this.f8811w = true;
                ((MaterialButton) findViewById).setChecked(true);
                this.f8811w = false;
            }
            this.f8814z = i7;
            return false;
        }
        if (z7 && this.f8812x) {
            checkedButtonIds.remove(Integer.valueOf(i7));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                View findViewById2 = findViewById(intValue);
                if (findViewById2 instanceof MaterialButton) {
                    this.f8811w = true;
                    ((MaterialButton) findViewById2).setChecked(false);
                    this.f8811w = false;
                }
                b(intValue, false);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f8809u);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            treeMap.put((MaterialButton) getChildAt(i7), Integer.valueOf(i7));
        }
        this.f8810v = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z7;
        h hVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i7 = 0; i7 < childCount; i7++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i7);
            if (materialButton.getVisibility() != 8) {
                j e3 = materialButton.getShapeAppearanceModel().e();
                h hVar2 = (h) this.f8805q.get(i7);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    J3.a aVar = h.f88e;
                    if (i7 == firstVisibleChildIndex) {
                        if (z7) {
                            Field field = O.f1447a;
                            if (getLayoutDirection() == 1) {
                                hVar = new h(aVar, aVar, hVar2.f90b, hVar2.f91c);
                            } else {
                                hVar = new h(hVar2.f89a, hVar2.d, aVar, aVar);
                            }
                        } else {
                            hVar = new h(hVar2.f89a, aVar, hVar2.f90b, aVar);
                        }
                    } else if (i7 == lastVisibleChildIndex) {
                        if (z7) {
                            Field field2 = O.f1447a;
                            if (getLayoutDirection() == 1) {
                                hVar = new h(hVar2.f89a, hVar2.d, aVar, aVar);
                            } else {
                                hVar = new h(aVar, aVar, hVar2.f90b, hVar2.f91c);
                            }
                        } else {
                            hVar = new h(aVar, hVar2.d, aVar, hVar2.f91c);
                        }
                    } else {
                        hVar2 = null;
                    }
                    hVar2 = hVar;
                }
                if (hVar2 == null) {
                    e3.f1376e = new J3.a(0.0f);
                    e3.f = new J3.a(0.0f);
                    e3.f1377g = new J3.a(0.0f);
                    e3.f1378h = new J3.a(0.0f);
                } else {
                    e3.f1376e = hVar2.f89a;
                    e3.f1378h = hVar2.d;
                    e3.f = hVar2.f90b;
                    e3.f1377g = hVar2.f91c;
                }
                materialButton.setShapeAppearanceModel(e3.a());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f8812x) {
            return this.f8814z;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i7);
            if (materialButton.f8795D) {
                arrayList.add(Integer.valueOf(materialButton.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        Integer[] numArr = this.f8810v;
        if (numArr == null || i8 >= numArr.length) {
            Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
            return i8;
        }
        return numArr[i8].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i7 = this.f8814z;
        if (i7 != -1 && (materialButton = (MaterialButton) findViewById(i7)) != null) {
            materialButton.setChecked(true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f8812x) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) K3.f.c(1, visibleButtonCount, i7).f1836a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        e();
        a();
        super.onMeasure(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f8798u.remove(this.f8806r);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f8805q.remove(indexOfChild);
        }
        e();
        a();
    }

    public void setSelectionRequired(boolean z7) {
        this.f8813y = z7;
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }

    public void setSingleSelection(boolean z7) {
        if (this.f8812x != z7) {
            this.f8812x = z7;
            this.f8811w = true;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i7);
                materialButton.setChecked(false);
                b(materialButton.getId(), false);
            }
            this.f8811w = false;
            setCheckedId(-1);
        }
    }
}
