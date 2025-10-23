package com.google.android.material.button;

import A3.a;
import A3.c;
import A3.d;
import F3.k;
import J3.j;
import J3.v;
import K.O;
import S.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.AbstractC0900m;
import m3.g;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
public class MaterialButton extends AbstractC0900m implements Checkable, v {

    /* renamed from: G  reason: collision with root package name */
    public static final int[] f8790G = {16842911};

    /* renamed from: H  reason: collision with root package name */
    public static final int[] f8791H = {16842912};

    /* renamed from: A  reason: collision with root package name */
    public int f8792A;

    /* renamed from: B  reason: collision with root package name */
    public int f8793B;

    /* renamed from: C  reason: collision with root package name */
    public int f8794C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f8795D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f8796E;
    public int F;

    /* renamed from: t  reason: collision with root package name */
    public final d f8797t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet f8798u;

    /* renamed from: v  reason: collision with root package name */
    public a f8799v;

    /* renamed from: w  reason: collision with root package name */
    public PorterDuff.Mode f8800w;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f8801x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f8802y;

    /* renamed from: z  reason: collision with root package name */
    public int f8803z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(M3.a.a(context, attributeSet, R.attr.materialButtonStyle, 2132017932), attributeSet);
        this.f8798u = new LinkedHashSet();
        this.f8795D = false;
        this.f8796E = false;
        Context context2 = getContext();
        TypedArray e3 = k.e(context2, attributeSet, AbstractC1272a.f14955j, R.attr.materialButtonStyle, 2132017932, new int[0]);
        this.f8794C = e3.getDimensionPixelSize(12, 0);
        int i7 = e3.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f8800w = k.f(i7, mode);
        this.f8801x = g.p(getContext(), e3, 14);
        this.f8802y = g.s(getContext(), e3, 10);
        this.F = e3.getInteger(11, 1);
        this.f8803z = e3.getDimensionPixelSize(13, 0);
        d dVar = new d(this, J3.k.b(context2, attributeSet, R.attr.materialButtonStyle, 2132017932).a());
        this.f8797t = dVar;
        dVar.f71c = e3.getDimensionPixelOffset(1, 0);
        dVar.d = e3.getDimensionPixelOffset(2, 0);
        dVar.f72e = e3.getDimensionPixelOffset(3, 0);
        dVar.f = e3.getDimensionPixelOffset(4, 0);
        if (e3.hasValue(8)) {
            int dimensionPixelSize = e3.getDimensionPixelSize(8, -1);
            dVar.f73g = dimensionPixelSize;
            float f = dimensionPixelSize;
            j e7 = dVar.f70b.e();
            e7.f1376e = new J3.a(f);
            e7.f = new J3.a(f);
            e7.f1377g = new J3.a(f);
            e7.f1378h = new J3.a(f);
            dVar.c(e7.a());
            dVar.f81p = true;
        }
        dVar.f74h = e3.getDimensionPixelSize(20, 0);
        dVar.f75i = k.f(e3.getInt(7, -1), mode);
        dVar.f76j = g.p(getContext(), e3, 6);
        dVar.f77k = g.p(getContext(), e3, 19);
        dVar.f78l = g.p(getContext(), e3, 16);
        dVar.f82q = e3.getBoolean(5, false);
        dVar.f84s = e3.getDimensionPixelSize(9, 0);
        Field field = O.f1447a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (e3.hasValue(0)) {
            dVar.f80o = true;
            setSupportBackgroundTintList(dVar.f76j);
            setSupportBackgroundTintMode(dVar.f75i);
        } else {
            dVar.e();
        }
        setPaddingRelative(paddingStart + dVar.f71c, paddingTop + dVar.f72e, paddingEnd + dVar.d, paddingBottom + dVar.f);
        e3.recycle();
        setCompoundDrawablePadding(this.f8794C);
        d(this.f8802y != null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        d dVar = this.f8797t;
        if (dVar != null && dVar.f82q) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        d dVar = this.f8797t;
        if (dVar != null && !dVar.f80o) {
            return true;
        }
        return false;
    }

    public final void c() {
        int i7 = this.F;
        boolean z7 = true;
        if (i7 != 1 && i7 != 2) {
            z7 = false;
        }
        if (z7) {
            setCompoundDrawablesRelative(this.f8802y, null, null, null);
        } else if (i7 != 3 && i7 != 4) {
            if (i7 == 16 || i7 == 32) {
                setCompoundDrawablesRelative(null, this.f8802y, null, null);
            }
        } else {
            setCompoundDrawablesRelative(null, null, this.f8802y, null);
        }
    }

    public final void d(boolean z7) {
        Drawable drawable = this.f8802y;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f8802y = mutate;
            E.a.h(mutate, this.f8801x);
            PorterDuff.Mode mode = this.f8800w;
            if (mode != null) {
                E.a.i(this.f8802y, mode);
            }
            int i7 = this.f8803z;
            if (i7 == 0) {
                i7 = this.f8802y.getIntrinsicWidth();
            }
            int i8 = this.f8803z;
            if (i8 == 0) {
                i8 = this.f8802y.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f8802y;
            int i9 = this.f8792A;
            int i10 = this.f8793B;
            drawable2.setBounds(i9, i10, i7 + i9, i8 + i10);
        }
        if (z7) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.F;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f8802y) || (((i11 == 3 || i11 == 4) && drawable5 != this.f8802y) || ((i11 == 16 || i11 == 32) && drawable4 != this.f8802y))) {
            c();
        }
    }

    public final void e(int i7, int i8) {
        boolean z7;
        boolean z8;
        if (this.f8802y != null && getLayout() != null) {
            int i9 = this.F;
            boolean z9 = true;
            if (i9 != 1 && i9 != 2) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!z7 && i9 != 3 && i9 != 4) {
                if (i9 == 16 || i9 == 32) {
                    this.f8792A = 0;
                    if (i9 == 16) {
                        this.f8793B = 0;
                        d(false);
                    }
                    int i10 = this.f8803z;
                    if (i10 == 0) {
                        i10 = this.f8802y.getIntrinsicHeight();
                    }
                    int textHeight = (((((i8 - getTextHeight()) - getPaddingTop()) - i10) - this.f8794C) - getPaddingBottom()) / 2;
                    if (this.f8793B != textHeight) {
                        this.f8793B = textHeight;
                        d(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f8793B = 0;
            if (i9 != 1 && i9 != 3) {
                int i11 = this.f8803z;
                if (i11 == 0) {
                    i11 = this.f8802y.getIntrinsicWidth();
                }
                int textWidth = i7 - getTextWidth();
                Field field = O.f1447a;
                int paddingEnd = ((((textWidth - getPaddingEnd()) - i11) - this.f8794C) - getPaddingStart()) / 2;
                if (getLayoutDirection() == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (this.F != 4) {
                    z9 = false;
                }
                if (z8 != z9) {
                    paddingEnd = -paddingEnd;
                }
                if (this.f8792A != paddingEnd) {
                    this.f8792A = paddingEnd;
                    d(false);
                    return;
                }
                return;
            }
            this.f8792A = 0;
            d(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f8797t.f73g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f8802y;
    }

    public int getIconGravity() {
        return this.F;
    }

    public int getIconPadding() {
        return this.f8794C;
    }

    public int getIconSize() {
        return this.f8803z;
    }

    public ColorStateList getIconTint() {
        return this.f8801x;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f8800w;
    }

    public int getInsetBottom() {
        return this.f8797t.f;
    }

    public int getInsetTop() {
        return this.f8797t.f72e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f8797t.f78l;
        }
        return null;
    }

    public J3.k getShapeAppearanceModel() {
        if (b()) {
            return this.f8797t.f70b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f8797t.f77k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f8797t.f74h;
        }
        return 0;
    }

    @Override // k.AbstractC0900m
    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f8797t.f76j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // k.AbstractC0900m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f8797t.f75i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f8795D;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            p6.d.F(this, this.f8797t.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f8790G);
        }
        if (this.f8795D) {
            View.mergeDrawableStates(onCreateDrawableState, f8791H);
        }
        return onCreateDrawableState;
    }

    @Override // k.AbstractC0900m, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f8795D);
    }

    @Override // k.AbstractC0900m, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f8795D);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // k.AbstractC0900m, android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f2938q);
        setChecked(cVar.f68s);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, S.b, A3.c] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f68s = this.f8795D;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        e(i7, i8);
    }

    @Override // k.AbstractC0900m, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (b()) {
            d dVar = this.f8797t;
            if (dVar.b(false) != null) {
                dVar.b(false).setTint(i7);
                return;
            }
            return;
        }
        super.setBackgroundColor(i7);
    }

    @Override // k.AbstractC0900m, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (b()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                d dVar = this.f8797t;
                dVar.f80o = true;
                ColorStateList colorStateList = dVar.f76j;
                MaterialButton materialButton = dVar.f69a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(dVar.f75i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // k.AbstractC0900m, android.view.View
    public void setBackgroundResource(int i7) {
        setBackgroundDrawable(i7 != 0 ? android.support.v4.media.session.b.i0(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z7) {
        if (b()) {
            this.f8797t.f82q = z7;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        int i7;
        if (a() && isEnabled() && this.f8795D != z7) {
            this.f8795D = z7;
            refreshDrawableState();
            if (this.f8796E) {
                return;
            }
            this.f8796E = true;
            Iterator it = this.f8798u.iterator();
            while (it.hasNext()) {
                boolean z8 = this.f8795D;
                MaterialButtonToggleGroup materialButtonToggleGroup = ((A3.g) it.next()).f87a;
                if (!materialButtonToggleGroup.f8811w) {
                    if (materialButtonToggleGroup.f8812x) {
                        if (z8) {
                            i7 = getId();
                        } else {
                            i7 = -1;
                        }
                        materialButtonToggleGroup.f8814z = i7;
                    }
                    if (materialButtonToggleGroup.d(getId(), z8)) {
                        materialButtonToggleGroup.b(getId(), this.f8795D);
                    }
                    materialButtonToggleGroup.invalidate();
                }
            }
            this.f8796E = false;
        }
    }

    public void setCornerRadius(int i7) {
        if (b()) {
            d dVar = this.f8797t;
            if (!dVar.f81p || dVar.f73g != i7) {
                dVar.f73g = i7;
                dVar.f81p = true;
                float f = i7;
                j e3 = dVar.f70b.e();
                e3.f1376e = new J3.a(f);
                e3.f = new J3.a(f);
                e3.f1377g = new J3.a(f);
                e3.f1378h = new J3.a(f);
                dVar.c(e3.a());
            }
        }
    }

    public void setCornerRadiusResource(int i7) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (b()) {
            this.f8797t.b(false).i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f8802y != drawable) {
            this.f8802y = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i7) {
        if (this.F != i7) {
            this.F = i7;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i7) {
        if (this.f8794C != i7) {
            this.f8794C = i7;
            setCompoundDrawablePadding(i7);
        }
    }

    public void setIconResource(int i7) {
        setIcon(i7 != 0 ? android.support.v4.media.session.b.i0(getContext(), i7) : null);
    }

    public void setIconSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f8803z != i7) {
            this.f8803z = i7;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f8801x != colorStateList) {
            this.f8801x = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f8800w != mode) {
            this.f8800w = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i7) {
        setIconTint(android.support.v4.media.session.b.h0(getContext(), i7));
    }

    public void setInsetBottom(int i7) {
        d dVar = this.f8797t;
        dVar.d(dVar.f72e, i7);
    }

    public void setInsetTop(int i7) {
        d dVar = this.f8797t;
        dVar.d(i7, dVar.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f8799v = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z7) {
        a aVar = this.f8799v;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((T4.c) aVar).f3382r).invalidate();
        }
        super.setPressed(z7);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            d dVar = this.f8797t;
            if (dVar.f78l != colorStateList) {
                dVar.f78l = colorStateList;
                MaterialButton materialButton = dVar.f69a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(H3.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i7) {
        if (b()) {
            setRippleColor(android.support.v4.media.session.b.h0(getContext(), i7));
        }
    }

    @Override // J3.v
    public void setShapeAppearanceModel(J3.k kVar) {
        if (b()) {
            this.f8797t.c(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z7) {
        if (b()) {
            d dVar = this.f8797t;
            dVar.n = z7;
            dVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            d dVar = this.f8797t;
            if (dVar.f77k != colorStateList) {
                dVar.f77k = colorStateList;
                dVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i7) {
        if (b()) {
            setStrokeColor(android.support.v4.media.session.b.h0(getContext(), i7));
        }
    }

    public void setStrokeWidth(int i7) {
        if (b()) {
            d dVar = this.f8797t;
            if (dVar.f74h != i7) {
                dVar.f74h = i7;
                dVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i7) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // k.AbstractC0900m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            d dVar = this.f8797t;
            if (dVar.f76j != colorStateList) {
                dVar.f76j = colorStateList;
                if (dVar.b(false) != null) {
                    E.a.h(dVar.b(false), dVar.f76j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // k.AbstractC0900m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            d dVar = this.f8797t;
            if (dVar.f75i != mode) {
                dVar.f75i = mode;
                if (dVar.b(false) != null && dVar.f75i != null) {
                    E.a.i(dVar.b(false), dVar.f75i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f8795D);
    }
}
