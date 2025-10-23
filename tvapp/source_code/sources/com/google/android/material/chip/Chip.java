package com.google.android.material.chip;

import B3.b;
import B3.d;
import B3.e;
import B3.f;
import H3.a;
import J3.k;
import J3.v;
import K.O;
import L.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import k.AbstractC0902n;
/* loaded from: classes.dex */
public class Chip extends AbstractC0902n implements e, v {

    /* renamed from: K  reason: collision with root package name */
    public static final Rect f8815K = new Rect();

    /* renamed from: L  reason: collision with root package name */
    public static final int[] f8816L = {16842913};

    /* renamed from: M  reason: collision with root package name */
    public static final int[] f8817M = {16842911};

    /* renamed from: A  reason: collision with root package name */
    public boolean f8818A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f8819B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f8820C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f8821D;

    /* renamed from: E  reason: collision with root package name */
    public int f8822E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public final d f8823G;

    /* renamed from: H  reason: collision with root package name */
    public final Rect f8824H;

    /* renamed from: I  reason: collision with root package name */
    public final RectF f8825I;

    /* renamed from: J  reason: collision with root package name */
    public final b f8826J;

    /* renamed from: u  reason: collision with root package name */
    public f f8827u;

    /* renamed from: v  reason: collision with root package name */
    public InsetDrawable f8828v;

    /* renamed from: w  reason: collision with root package name */
    public RippleDrawable f8829w;

    /* renamed from: x  reason: collision with root package name */
    public View.OnClickListener f8830x;

    /* renamed from: y  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f8831y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8832z;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f8825I;
        rectF.setEmpty();
        if (d() && this.f8830x != null) {
            f fVar = this.f8827u;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f = fVar.f247t0 + fVar.f246s0 + fVar.f232e0 + fVar.f245r0 + fVar.f244q0;
                if (E.b.a(fVar) == 0) {
                    float f7 = bounds.right;
                    rectF.right = f7;
                    rectF.left = f7 - f;
                } else {
                    float f8 = bounds.left;
                    rectF.left = f8;
                    rectF.right = f8 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f8824H;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private G3.d getTextAppearance() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f196A0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z7) {
        if (this.f8819B != z7) {
            this.f8819B = z7;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z7) {
        if (this.f8818A != z7) {
            this.f8818A = z7;
            refreshDrawableState();
        }
    }

    public final void c(int i7) {
        int i8;
        this.F = i7;
        int i9 = 0;
        if (!this.f8821D) {
            InsetDrawable insetDrawable = this.f8828v;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f8828v = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = a.f1184a;
                    g();
                    return;
                }
                return;
            }
            int[] iArr2 = a.f1184a;
            g();
            return;
        }
        int max = Math.max(0, i7 - ((int) this.f8827u.f212P));
        int max2 = Math.max(0, i7 - this.f8827u.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f8828v;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f8828v = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = a.f1184a;
                    g();
                    return;
                }
                return;
            }
            int[] iArr4 = a.f1184a;
            g();
            return;
        }
        if (max2 > 0) {
            i8 = max2 / 2;
        } else {
            i8 = 0;
        }
        if (max > 0) {
            i9 = max / 2;
        }
        int i10 = i9;
        if (this.f8828v != null) {
            Rect rect = new Rect();
            this.f8828v.getPadding(rect);
            if (rect.top == i10 && rect.bottom == i10 && rect.left == i8 && rect.right == i8) {
                int[] iArr5 = a.f1184a;
                g();
                return;
            }
        }
        if (getMinHeight() != i7) {
            setMinHeight(i7);
        }
        if (getMinWidth() != i7) {
            setMinWidth(i7);
        }
        this.f8828v = new InsetDrawable((Drawable) this.f8827u, i8, i10, i8, i10);
        int[] iArr6 = a.f1184a;
        g();
    }

    public final boolean d() {
        f fVar = this.f8827u;
        if (fVar != null) {
            Drawable drawable = fVar.f229b0;
            if (drawable != null) {
                if (drawable instanceof E.d) {
                    ((E.e) ((E.d) drawable)).getClass();
                    drawable = null;
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            java.lang.Class<T.b> r2 = T.b.class
            java.lang.String r3 = "Unable to send Accessibility Exit event"
            java.lang.String r4 = "Chip"
            int r5 = r12.getAction()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 10
            B3.d r8 = r11.f8823G
            if (r5 != r7) goto L4e
            java.lang.String r5 = "m"
            java.lang.reflect.Field r5 = r2.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            r5.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            java.lang.Object r5 = r5.get(r8)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            int r5 = r5.intValue()     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            if (r5 == r6) goto L4e
            java.lang.String r5 = "r"
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            r9[r0] = r10     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r9)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            r2.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            r9[r0] = r5     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            r2.invoke(r8, r9)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L48 java.lang.NoSuchMethodException -> L4a
            goto L9c
        L44:
            r2 = move-exception
            goto L4b
        L46:
            r2 = move-exception
            goto L4b
        L48:
            r2 = move-exception
            goto L4b
        L4a:
            r2 = move-exception
        L4b:
            android.util.Log.e(r4, r3, r2)
        L4e:
            android.view.accessibility.AccessibilityManager r2 = r8.f3170h
            boolean r3 = r2.isEnabled()
            if (r3 == 0) goto L96
            boolean r2 = r2.isTouchExplorationEnabled()
            if (r2 != 0) goto L5d
            goto L96
        L5d:
            int r2 = r12.getAction()
            r3 = 7
            if (r2 == r3) goto L73
            r3 = 9
            if (r2 == r3) goto L73
            if (r2 == r7) goto L6b
            goto L96
        L6b:
            int r2 = r8.f3175m
            if (r2 == r6) goto L96
            r8.r(r6)
            goto L9c
        L73:
            float r2 = r12.getX()
            float r3 = r12.getY()
            com.google.android.material.chip.Chip r4 = r8.f193q
            boolean r5 = r4.d()
            if (r5 == 0) goto L8f
            android.graphics.RectF r4 = a(r4)
            boolean r2 = r4.contains(r2, r3)
            if (r2 == 0) goto L8f
            r2 = r1
            goto L90
        L8f:
            r2 = r0
        L90:
            r8.r(r2)
            if (r2 == r6) goto L96
            goto L9c
        L96:
            boolean r12 = super.dispatchHoverEvent(r12)
            if (r12 == 0) goto L9d
        L9c:
            r0 = r1
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
        if (r7 == false) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            B3.d r0 = r9.f8823G
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            if (r1 == r2) goto L97
            int r1 = r10.getKeyCode()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 61
            r5 = 0
            if (r1 == r4) goto L7a
            r4 = 0
            r6 = 66
            if (r1 == r6) goto L4d
            switch(r1) {
                case 19: goto L21;
                case 20: goto L21;
                case 21: goto L21;
                case 22: goto L21;
                case 23: goto L4d;
                default: goto L1f;
            }
        L1f:
            goto L97
        L21:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L97
            r7 = 19
            if (r1 == r7) goto L39
            r7 = 21
            if (r1 == r7) goto L36
            r7 = 22
            if (r1 == r7) goto L3b
            r6 = 130(0x82, float:1.82E-43)
            goto L3b
        L36:
            r6 = 17
            goto L3b
        L39:
            r6 = 33
        L3b:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r7 = r4
        L41:
            if (r4 >= r1) goto L90
            boolean r8 = r0.m(r6, r5)
            if (r8 == 0) goto L90
            int r4 = r4 + 1
            r7 = r2
            goto L41
        L4d:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L97
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L97
            int r1 = r0.f3174l
            if (r1 == r3) goto L92
            com.google.android.material.chip.Chip r5 = r0.f193q
            if (r1 != 0) goto L66
            boolean r1 = r5.performClick()
            goto L92
        L66:
            if (r1 != r2) goto L92
            r5.playSoundEffect(r4)
            android.view.View$OnClickListener r1 = r5.f8830x
            if (r1 == 0) goto L73
            r1.onClick(r5)
            r4 = r2
        L73:
            B3.d r1 = r5.f8823G
            r1.q(r2, r2)
            r1 = r4
            goto L92
        L7a:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L86
            r1 = 2
            boolean r7 = r0.m(r1, r5)
            goto L90
        L86:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto L97
            boolean r7 = r0.m(r2, r5)
        L90:
            if (r7 == 0) goto L97
        L92:
            int r0 = r0.f3174l
            if (r0 == r3) goto L97
            return r2
        L97:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // k.AbstractC0902n, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f8827u;
        if (fVar != null && f.t(fVar.f229b0)) {
            f fVar2 = this.f8827u;
            ?? isEnabled = isEnabled();
            int i7 = isEnabled;
            if (this.f8820C) {
                i7 = isEnabled + 1;
            }
            int i8 = i7;
            if (this.f8819B) {
                i8 = i7 + 1;
            }
            int i9 = i8;
            if (this.f8818A) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (isChecked()) {
                i10 = i9 + 1;
            }
            int[] iArr = new int[i10];
            int i11 = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i11 = 1;
            }
            if (this.f8820C) {
                iArr[i11] = 16842908;
                i11++;
            }
            if (this.f8819B) {
                iArr[i11] = 16843623;
                i11++;
            }
            if (this.f8818A) {
                iArr[i11] = 16842919;
                i11++;
            }
            if (isChecked()) {
                iArr[i11] = 16842913;
            }
            if (!Arrays.equals(fVar2.f211O0, iArr)) {
                fVar2.f211O0 = iArr;
                if (fVar2.T() && fVar2.v(fVar2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    public final boolean e() {
        f fVar = this.f8827u;
        if (fVar != null && fVar.f234g0) {
            return true;
        }
        return false;
    }

    public final void f() {
        d dVar;
        f fVar;
        if (d() && (fVar = this.f8827u) != null && fVar.f228a0 && this.f8830x != null) {
            dVar = this.f8823G;
        } else {
            dVar = null;
        }
        O.i(this, dVar);
    }

    public final void g() {
        this.f8829w = new RippleDrawable(a.a(this.f8827u.f220T), getBackgroundDrawable(), null);
        f fVar = this.f8827u;
        if (fVar.f213P0) {
            fVar.f213P0 = false;
            fVar.f215Q0 = null;
            fVar.onStateChange(fVar.getState());
        }
        RippleDrawable rippleDrawable = this.f8829w;
        Field field = O.f1447a;
        setBackground(rippleDrawable);
        h();
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f8828v;
        return insetDrawable == null ? this.f8827u : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f236i0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f237j0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f210O;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return Math.max(0.0f, fVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f8827u;
    }

    public float getChipEndPadding() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f247t0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f8827u;
        if (fVar == null || (drawable = fVar.W) == null) {
            return null;
        }
        if (drawable instanceof E.d) {
            ((E.e) ((E.d) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f226Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f225X;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f212P;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f240m0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f216R;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f218S;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f8827u;
        if (fVar == null || (drawable = fVar.f229b0) == null) {
            return null;
        }
        if (drawable instanceof E.d) {
            ((E.e) ((E.d) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f233f0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f246s0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f232e0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f245r0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f231d0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f219S0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        d dVar = this.f8823G;
        if (dVar.f3174l != 1 && dVar.f3173k != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public v3.b getHideMotionSpec() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f239l0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f242o0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f241n0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f220T;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f8827u.f1362q.f1332a;
    }

    public v3.b getShowMotionSpec() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f238k0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f244q0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f8827u;
        if (fVar != null) {
            return fVar.f243p0;
        }
        return 0.0f;
    }

    public final void h() {
        f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.f8827u) != null) {
            int q5 = (int) (fVar.q() + fVar.f247t0 + fVar.f244q0);
            f fVar2 = this.f8827u;
            int p3 = (int) (fVar2.p() + fVar2.f240m0 + fVar2.f243p0);
            if (this.f8828v != null) {
                Rect rect = new Rect();
                this.f8828v.getPadding(rect);
                p3 += rect.left;
                q5 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            Field field = O.f1447a;
            setPaddingRelative(p3, paddingTop, q5, paddingBottom);
        }
    }

    public final void i() {
        TextPaint paint = getPaint();
        f fVar = this.f8827u;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        G3.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f8826J);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p6.d.F(this, this.f8827u);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f8816L);
        }
        if (e()) {
            View.mergeDrawableStates(onCreateDrawableState, f8817M);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        d dVar = this.f8823G;
        int i8 = dVar.f3174l;
        if (i8 != Integer.MIN_VALUE) {
            dVar.j(i8);
        }
        if (z7) {
            dVar.m(i7, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!e() && !isClickable()) {
            str = "android.view.View";
        } else if (e()) {
            str = "android.widget.CompoundButton";
        } else {
            str = "android.widget.Button";
        }
        accessibilityNodeInfo.setClassName(str);
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i8 = -1;
            if (chipGroup.f702s) {
                i7 = 0;
                for (int i9 = 0; i9 < chipGroup.getChildCount(); i9++) {
                    if (chipGroup.getChildAt(i9) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i9)) == this) {
                            break;
                        }
                        i7++;
                    }
                }
            }
            i7 = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i8 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) h.a(isChecked(), i8, 1, i7, 1).f1853a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        PointerIcon systemIcon;
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            return systemIcon;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        if (this.f8822E != i7) {
            this.f8822E = i7;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r0 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L47
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L40
            goto L4d
        L21:
            boolean r0 = r5.f8818A
            if (r0 == 0) goto L4d
            if (r1 != 0) goto L53
            r5.setCloseIconPressed(r2)
            goto L53
        L2b:
            boolean r0 = r5.f8818A
            if (r0 == 0) goto L40
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f8830x
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            B3.d r0 = r5.f8823G
            r0.q(r3, r3)
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            r5.setCloseIconPressed(r2)
            if (r0 != 0) goto L53
            goto L4d
        L47:
            if (r1 == 0) goto L4d
            r5.setCloseIconPressed(r3)
            goto L53
        L4d:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L54
        L53:
            r2 = r3
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f8829w) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // k.AbstractC0902n, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f8829w) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // k.AbstractC0902n, android.view.View
    public void setBackgroundResource(int i7) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.w(z7);
        }
    }

    public void setCheckableResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.w(fVar.f248u0.getResources().getBoolean(i7));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        f fVar = this.f8827u;
        if (fVar == null) {
            this.f8832z = z7;
        } else if (fVar.f234g0) {
            boolean isChecked = isChecked();
            super.setChecked(z7);
            if (isChecked != z7 && (onCheckedChangeListener = this.f8831y) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z7);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z7) {
        setCheckedIconVisible(z7);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i7) {
        setCheckedIconVisible(i7);
    }

    public void setCheckedIconResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.x(android.support.v4.media.session.b.i0(fVar.f248u0, i7));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.y(android.support.v4.media.session.b.h0(fVar.f248u0, i7));
        }
    }

    public void setCheckedIconVisible(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.z(fVar.f248u0.getResources().getBoolean(i7));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f8827u;
        if (fVar != null && fVar.f210O != colorStateList) {
            fVar.f210O = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i7) {
        ColorStateList h02;
        f fVar = this.f8827u;
        if (fVar != null && fVar.f210O != (h02 = android.support.v4.media.session.b.h0(fVar.f248u0, i7))) {
            fVar.f210O = h02;
            fVar.onStateChange(fVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.A(fVar.f248u0.getResources().getDimension(i7));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f8827u;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f217R0 = new WeakReference(null);
            }
            this.f8827u = fVar;
            fVar.f221T0 = false;
            fVar.f217R0 = new WeakReference(this);
            c(this.F);
        }
    }

    public void setChipEndPadding(float f) {
        f fVar = this.f8827u;
        if (fVar != null && fVar.f247t0 != f) {
            fVar.f247t0 = f;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipEndPaddingResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            float dimension = fVar.f248u0.getResources().getDimension(i7);
            if (fVar.f247t0 != dimension) {
                fVar.f247t0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z7) {
        setChipIconVisible(z7);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i7) {
        setChipIconVisible(i7);
    }

    public void setChipIconResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.B(android.support.v4.media.session.b.i0(fVar.f248u0, i7));
        }
    }

    public void setChipIconSize(float f) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.C(f);
        }
    }

    public void setChipIconSizeResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.C(fVar.f248u0.getResources().getDimension(i7));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.D(android.support.v4.media.session.b.h0(fVar.f248u0, i7));
        }
    }

    public void setChipIconVisible(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.E(fVar.f248u0.getResources().getBoolean(i7));
        }
    }

    public void setChipMinHeight(float f) {
        f fVar = this.f8827u;
        if (fVar != null && fVar.f212P != f) {
            fVar.f212P = f;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipMinHeightResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            float dimension = fVar.f248u0.getResources().getDimension(i7);
            if (fVar.f212P != dimension) {
                fVar.f212P = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        f fVar = this.f8827u;
        if (fVar != null && fVar.f240m0 != f) {
            fVar.f240m0 = f;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipStartPaddingResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            float dimension = fVar.f248u0.getResources().getDimension(i7);
            if (fVar.f240m0 != dimension) {
                fVar.f240m0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.F(android.support.v4.media.session.b.h0(fVar.f248u0, i7));
        }
    }

    public void setChipStrokeWidth(float f) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.G(f);
        }
    }

    public void setChipStrokeWidthResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.G(fVar.f248u0.getResources().getDimension(i7));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i7) {
        setText(getResources().getString(i7));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.H(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        I.b bVar;
        f fVar = this.f8827u;
        if (fVar != null && fVar.f233f0 != charSequence) {
            String str = I.b.d;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = I.b.f1192g;
            } else {
                bVar = I.b.f;
            }
            fVar.f233f0 = bVar.c(charSequence, bVar.f1195c);
            fVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z7) {
        setCloseIconVisible(z7);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i7) {
        setCloseIconVisible(i7);
    }

    public void setCloseIconEndPadding(float f) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.I(fVar.f248u0.getResources().getDimension(i7));
        }
    }

    public void setCloseIconResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.H(android.support.v4.media.session.b.i0(fVar.f248u0, i7));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.J(f);
        }
    }

    public void setCloseIconSizeResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.J(fVar.f248u0.getResources().getDimension(i7));
        }
    }

    public void setCloseIconStartPadding(float f) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.K(fVar.f248u0.getResources().getDimension(i7));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.L(android.support.v4.media.session.b.h0(fVar.f248u0, i7));
        }
    }

    public void setCloseIconVisible(int i7) {
        setCloseIconVisible(getResources().getBoolean(i7));
    }

    @Override // k.AbstractC0902n, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // k.AbstractC0902n, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f8827u == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            f fVar = this.f8827u;
            if (fVar != null) {
                fVar.f219S0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z7) {
        this.f8821D = z7;
        c(this.F);
    }

    @Override // android.widget.TextView
    public void setGravity(int i7) {
        if (i7 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i7);
        }
    }

    public void setHideMotionSpec(v3.b bVar) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.f239l0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.f239l0 = v3.b.a(fVar.f248u0, i7);
        }
    }

    public void setIconEndPadding(float f) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.N(f);
        }
    }

    public void setIconEndPaddingResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.N(fVar.f248u0.getResources().getDimension(i7));
        }
    }

    public void setIconStartPadding(float f) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.O(f);
        }
    }

    public void setIconStartPaddingResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.O(fVar.f248u0.getResources().getDimension(i7));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
        if (this.f8827u == null) {
            return;
        }
        super.setLayoutDirection(i7);
    }

    @Override // android.widget.TextView
    public void setLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i7) {
        super.setMaxWidth(i7);
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.U0 = i7;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i7);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f8831y = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f8830x = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        if (!this.f8827u.f213P0) {
            g();
        }
    }

    public void setRippleColorResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.P(android.support.v4.media.session.b.h0(fVar.f248u0, i7));
            if (!this.f8827u.f213P0) {
                g();
            }
        }
    }

    @Override // J3.v
    public void setShapeAppearanceModel(k kVar) {
        this.f8827u.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(v3.b bVar) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.f238k0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.f238k0 = v3.b.a(fVar.f248u0, i7);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z7) {
        if (!z7) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z7);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        f fVar = this.f8827u;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (fVar.f221T0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        f fVar2 = this.f8827u;
        if (fVar2 != null && !TextUtils.equals(fVar2.f222U, charSequence)) {
            fVar2.f222U = charSequence;
            fVar2.f196A0.d = true;
            fVar2.invalidateSelf();
            fVar2.u();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.Q(new G3.d(fVar.f248u0, i7));
        }
        i();
    }

    public void setTextAppearanceResource(int i7) {
        setTextAppearance(getContext(), i7);
    }

    public void setTextEndPadding(float f) {
        f fVar = this.f8827u;
        if (fVar != null && fVar.f244q0 != f) {
            fVar.f244q0 = f;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setTextEndPaddingResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            float dimension = fVar.f248u0.getResources().getDimension(i7);
            if (fVar.f244q0 != dimension) {
                fVar.f244q0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setTextStartPadding(float f) {
        f fVar = this.f8827u;
        if (fVar != null && fVar.f243p0 != f) {
            fVar.f243p0 = f;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setTextStartPaddingResource(int i7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            float dimension = fVar.f248u0.getResources().getDimension(i7);
            if (fVar.f243p0 != dimension) {
                fVar.f243p0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.M(z7);
        }
        f();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCheckedIconVisible(boolean z7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.z(z7);
        }
    }

    public void setChipIconVisible(boolean z7) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.E(z7);
        }
    }

    public void setTextAppearance(G3.d dVar) {
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        i();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        f fVar = this.f8827u;
        if (fVar != null) {
            fVar.Q(new G3.d(fVar.f248u0, i7));
        }
        i();
    }
}
