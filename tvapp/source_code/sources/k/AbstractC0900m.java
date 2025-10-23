package k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.boxhdo.android.tv.R;
import h6.C0761k;
/* renamed from: k.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0900m extends Button implements P.s {

    /* renamed from: q  reason: collision with root package name */
    public final com.google.android.material.datepicker.c f12064q;

    /* renamed from: r  reason: collision with root package name */
    public final C0848D f12065r;

    /* renamed from: s  reason: collision with root package name */
    public C0910r f12066s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0900m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        AbstractC0859I0.a(context);
        AbstractC0857H0.a(this, getContext());
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f12064q = cVar;
        cVar.l(attributeSet, R.attr.materialButtonStyle);
        C0848D c0848d = new C0848D(this);
        this.f12065r = c0848d;
        c0848d.d(attributeSet, R.attr.materialButtonStyle);
        c0848d.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.materialButtonStyle);
    }

    private C0910r getEmojiTextViewHelper() {
        if (this.f12066s == null) {
            this.f12066s = new C0910r(this);
        }
        return this.f12066s;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f12064q;
        if (cVar != null) {
            cVar.a();
        }
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Y0.f11969a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            return Math.round(c0848d.f11863i.f11922e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (Y0.f11969a) {
            return super.getAutoSizeMinTextSize();
        }
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            return Math.round(c0848d.f11863i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (Y0.f11969a) {
            return super.getAutoSizeStepGranularity();
        }
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            return Math.round(c0848d.f11863i.f11921c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (Y0.f11969a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            return c0848d.f11863i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (Y0.f11969a) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C0848D c0848d = this.f12065r;
        if (c0848d == null) {
            return 0;
        }
        return c0848d.f11863i.f11919a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w4.l0.X(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f12064q;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f12064q;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0761k c0761k = this.f12065r.f11862h;
        if (c0761k != null) {
            return (ColorStateList) c0761k.f11169c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0761k c0761k = this.f12065r.f11862h;
        if (c0761k != null) {
            return (PorterDuff.Mode) c0761k.d;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        C0848D c0848d = this.f12065r;
        if (c0848d != null && !Y0.f11969a) {
            c0848d.f11863i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C0848D c0848d = this.f12065r;
        if (c0848d != null && !Y0.f11969a) {
            C0866P c0866p = c0848d.f11863i;
            if (c0866p.f()) {
                c0866p.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        ((p6.l) getEmojiTextViewHelper().f12087b.f4918q).G(z7);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (Y0.f11969a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            c0848d.g(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (Y0.f11969a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            c0848d.h(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (Y0.f11969a) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            c0848d.i(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f12064q;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        com.google.android.material.datepicker.c cVar = this.f12064q;
        if (cVar != null) {
            cVar.o(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w4.l0.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        ((p6.l) getEmojiTextViewHelper().f12087b.f4918q).H(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((p6.l) getEmojiTextViewHelper().f12087b.f4918q).v(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z7) {
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            c0848d.f11857a.setAllCaps(z7);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f12064q;
        if (cVar != null) {
            cVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f12064q;
        if (cVar != null) {
            cVar.u(mode);
        }
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0848D c0848d = this.f12065r;
        c0848d.j(colorStateList);
        c0848d.b();
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0848D c0848d = this.f12065r;
        c0848d.k(mode);
        c0848d.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0848D c0848d = this.f12065r;
        if (c0848d != null) {
            c0848d.e(context, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f) {
        boolean z7 = Y0.f11969a;
        if (z7) {
            super.setTextSize(i7, f);
            return;
        }
        C0848D c0848d = this.f12065r;
        if (c0848d != null && !z7) {
            C0866P c0866p = c0848d.f11863i;
            if (!c0866p.f()) {
                c0866p.g(i7, f);
            }
        }
    }
}
