package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import e.AbstractC0565a;
/* renamed from: k.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0883d0 extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public Drawable f11987A;

    /* renamed from: B  reason: collision with root package name */
    public int f11988B;

    /* renamed from: C  reason: collision with root package name */
    public int f11989C;

    /* renamed from: D  reason: collision with root package name */
    public int f11990D;

    /* renamed from: E  reason: collision with root package name */
    public int f11991E;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11992q;

    /* renamed from: r  reason: collision with root package name */
    public int f11993r;

    /* renamed from: s  reason: collision with root package name */
    public int f11994s;

    /* renamed from: t  reason: collision with root package name */
    public int f11995t;

    /* renamed from: u  reason: collision with root package name */
    public int f11996u;

    /* renamed from: v  reason: collision with root package name */
    public int f11997v;

    /* renamed from: w  reason: collision with root package name */
    public float f11998w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11999x;

    /* renamed from: y  reason: collision with root package name */
    public int[] f12000y;

    /* renamed from: z  reason: collision with root package name */
    public int[] f12001z;

    public AbstractC0883d0(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f11992q = true;
        this.f11993r = -1;
        this.f11994s = 0;
        this.f11996u = 8388659;
        int[] iArr = AbstractC0565a.f9349k;
        g5.b C3 = g5.b.C(context, attributeSet, iArr, i7, 0);
        K.O.h(this, context, iArr, attributeSet, (TypedArray) C3.f10842s, i7);
        TypedArray typedArray = (TypedArray) C3.f10842s;
        int i8 = typedArray.getInt(1, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = typedArray.getInt(0, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z7 = typedArray.getBoolean(2, true);
        if (!z7) {
            setBaselineAligned(z7);
        }
        this.f11998w = typedArray.getFloat(4, -1.0f);
        this.f11993r = typedArray.getInt(3, -1);
        this.f11999x = typedArray.getBoolean(7, false);
        setDividerDrawable(C3.z(5));
        this.f11990D = typedArray.getInt(8, 0);
        this.f11991E = typedArray.getDimensionPixelSize(6, 0);
        C3.D();
    }

    public final void b(Canvas canvas, int i7) {
        this.f11987A.setBounds(getPaddingLeft() + this.f11991E, i7, (getWidth() - getPaddingRight()) - this.f11991E, this.f11989C + i7);
        this.f11987A.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0881c0;
    }

    public final void d(Canvas canvas, int i7) {
        this.f11987A.setBounds(i7, getPaddingTop() + this.f11991E, this.f11988B + i7, (getHeight() - getPaddingBottom()) - this.f11991E);
        this.f11987A.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k.c0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k.c0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: e */
    public C0881c0 generateDefaultLayoutParams() {
        int i7 = this.f11995t;
        if (i7 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i7 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.c0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f */
    public C0881c0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.c0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: g */
    public C0881c0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f11993r < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f11993r;
        if (childCount > i8) {
            View childAt = getChildAt(i8);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f11993r == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i9 = this.f11994s;
            if (this.f11995t == 1 && (i7 = this.f11996u & 112) != 48) {
                if (i7 != 16) {
                    if (i7 == 80) {
                        i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f11997v;
                    }
                } else {
                    i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f11997v) / 2;
                }
            }
            return i9 + ((LinearLayout.LayoutParams) ((C0881c0) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f11993r;
    }

    public Drawable getDividerDrawable() {
        return this.f11987A;
    }

    public int getDividerPadding() {
        return this.f11991E;
    }

    public int getDividerWidth() {
        return this.f11988B;
    }

    public int getGravity() {
        return this.f11996u;
    }

    public int getOrientation() {
        return this.f11995t;
    }

    public int getShowDividers() {
        return this.f11990D;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f11998w;
    }

    public final boolean h(int i7) {
        if (i7 == 0) {
            if ((this.f11990D & 1) == 0) {
                return false;
            }
            return true;
        } else if (i7 == getChildCount()) {
            if ((this.f11990D & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f11990D & 2) == 0) {
            return false;
        } else {
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                if (getChildAt(i8).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        int left2;
        int bottom;
        if (this.f11987A == null) {
            return;
        }
        int i8 = 0;
        if (this.f11995t == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i8 < virtualChildCount) {
                View childAt = getChildAt(i8);
                if (childAt != null && childAt.getVisibility() != 8 && h(i8)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0881c0) childAt.getLayoutParams())).topMargin) - this.f11989C);
                }
                i8++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f11989C;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0881c0) childAt2.getLayoutParams())).bottomMargin;
                }
                b(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a7 = Y0.a(this);
        while (i8 < virtualChildCount2) {
            View childAt3 = getChildAt(i8);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i8)) {
                C0881c0 c0881c0 = (C0881c0) childAt3.getLayoutParams();
                if (a7) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) c0881c0).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0881c0).leftMargin) - this.f11988B;
                }
                d(canvas, left2);
            }
            i8++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a7) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    i7 = getPaddingRight();
                    right = (left - i7) - this.f11988B;
                }
            } else {
                C0881c0 c0881c02 = (C0881c0) childAt4.getLayoutParams();
                if (a7) {
                    left = childAt4.getLeft();
                    i7 = ((LinearLayout.LayoutParams) c0881c02).leftMargin;
                    right = (left - i7) - this.f11988B;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0881c02).rightMargin;
                }
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0883d0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x029d, code lost:
        if (r15 > 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a0, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a1, code lost:
        r9.measure(r11, android.view.View.MeasureSpec.makeMeasureSpec(r15, r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02b1, code lost:
        if (r15 < 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b4, code lost:
        r12 = android.view.View.combineMeasuredStates(r12, r9.getMeasuredState() & (-256));
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d9, code lost:
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0700, code lost:
        if (r9 > 0) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0703, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0704, code lost:
        r15.measure(android.view.View.MeasureSpec.makeMeasureSpec(r9, r7), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0714, code lost:
        if (r9 < 0) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0717, code lost:
        r12 = android.view.View.combineMeasuredStates(r12, r15.getMeasuredState() & (-16777216));
        r1 = r1;
        r7 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:440:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0883d0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z7) {
        this.f11992q = z7;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f11993r = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f11987A) {
            return;
        }
        this.f11987A = drawable;
        boolean z7 = false;
        if (drawable != null) {
            this.f11988B = drawable.getIntrinsicWidth();
            this.f11989C = drawable.getIntrinsicHeight();
        } else {
            this.f11988B = 0;
            this.f11989C = 0;
        }
        if (drawable == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f11991E = i7;
    }

    public void setGravity(int i7) {
        if (this.f11996u != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f11996u = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f11996u;
        if ((8388615 & i9) != i8) {
            this.f11996u = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f11999x = z7;
    }

    public void setOrientation(int i7) {
        if (this.f11995t != i7) {
            this.f11995t = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f11990D) {
            requestLayout();
        }
        this.f11990D = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f11996u;
        if ((i9 & 112) != i8) {
            this.f11996u = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f11998w = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
