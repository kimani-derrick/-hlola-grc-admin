package com.google.android.material.chip;

import B3.g;
import B3.h;
import B3.i;
import B3.j;
import F3.d;
import K3.f;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ChipGroup extends d {

    /* renamed from: A  reason: collision with root package name */
    public int f8833A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f8834B;

    /* renamed from: u  reason: collision with root package name */
    public int f8835u;

    /* renamed from: v  reason: collision with root package name */
    public int f8836v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8837w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8838x;

    /* renamed from: y  reason: collision with root package name */
    public final g f8839y;

    /* renamed from: z  reason: collision with root package name */
    public final j f8840z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r3 = 2130968753(0x7f0400b1, float:1.7546169E38)
            r0 = 2132017950(0x7f14031e, float:1.9674193E38)
            android.content.Context r10 = M3.a.a(r10, r11, r3, r0)
            r9.<init>(r10, r11, r3)
            r6 = 0
            r9.f702s = r6
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int[] r0 = u3.AbstractC1272a.f14953h
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r0, r6, r6)
            r7 = 1
            int r0 = r10.getDimensionPixelSize(r7, r6)
            r9.f700q = r0
            int r0 = r10.getDimensionPixelSize(r6, r6)
            r9.f701r = r0
            r10.recycle()
            B3.g r10 = new B3.g
            r10.<init>(r9)
            r9.f8839y = r10
            B3.j r10 = new B3.j
            r10.<init>(r9)
            r9.f8840z = r10
            r8 = -1
            r9.f8833A = r8
            r9.f8834B = r6
            android.content.Context r0 = r9.getContext()
            int[] r2 = u3.AbstractC1272a.f14950c
            r4 = 2132017950(0x7f14031e, float:1.9674193E38)
            int[] r5 = new int[r6]
            r1 = r11
            android.content.res.TypedArray r11 = F3.k.e(r0, r1, r2, r3, r4, r5)
            int r0 = r11.getDimensionPixelOffset(r7, r6)
            r1 = 2
            int r1 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingHorizontal(r1)
            r1 = 3
            int r0 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingVertical(r0)
            r0 = 5
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleLine(r0)
            r0 = 6
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleSelection(r0)
            r0 = 4
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSelectionRequired(r0)
            int r0 = r11.getResourceId(r6, r8)
            if (r0 == r8) goto L81
            r9.f8833A = r0
        L81:
            r11.recycle()
            super.setOnHierarchyChangeListener(r10)
            java.lang.reflect.Field r10 = K.O.f1447a
            r9.setImportantForAccessibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getChipCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) instanceof Chip) {
                i7++;
            }
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i7) {
        this.f8833A = i7;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i8 = this.f8833A;
                if (i8 != -1 && this.f8837w) {
                    c(i8, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i7, layoutParams);
    }

    public final void b(int i7) {
        int i8 = this.f8833A;
        if (i7 == i8) {
            return;
        }
        if (i8 != -1 && this.f8837w) {
            c(i8, false);
        }
        if (i7 != -1) {
            c(i7, true);
        }
        setCheckedId(i7);
    }

    public final void c(int i7, boolean z7) {
        View findViewById = findViewById(i7);
        if (findViewById instanceof Chip) {
            this.f8834B = true;
            ((Chip) findViewById).setChecked(z7);
            this.f8834B = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof h);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f8837w) {
            return this.f8833A;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f8837w) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f8835u;
    }

    public int getChipSpacingVertical() {
        return this.f8836v;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f8833A;
        if (i7 != -1) {
            c(i7, true);
            setCheckedId(this.f8833A);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        int i8;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f702s) {
            i7 = getChipCount();
        } else {
            i7 = -1;
        }
        int rowCount = getRowCount();
        if (this.f8837w) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.c(rowCount, i7, i8).f1836a);
    }

    public void setChipSpacing(int i7) {
        setChipSpacingHorizontal(i7);
        setChipSpacingVertical(i7);
    }

    public void setChipSpacingHorizontal(int i7) {
        if (this.f8835u != i7) {
            this.f8835u = i7;
            setItemSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i7) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingResource(int i7) {
        setChipSpacing(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingVertical(int i7) {
        if (this.f8836v != i7) {
            this.f8836v = i7;
            setLineSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i7) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i7));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i7) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f8840z.f254q = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z7) {
        this.f8838x = z7;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i7) {
        setSingleLine(getResources().getBoolean(i7));
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // F3.d
    public void setSingleLine(boolean z7) {
        super.setSingleLine(z7);
    }

    public void setSingleSelection(boolean z7) {
        if (this.f8837w != z7) {
            this.f8837w = z7;
            this.f8834B = true;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f8834B = false;
            setCheckedId(-1);
        }
    }

    public void setOnCheckedChangeListener(i iVar) {
    }
}
