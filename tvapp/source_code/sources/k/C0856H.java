package k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import h6.C0761k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* renamed from: k.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0856H extends TextView implements P.s {

    /* renamed from: q  reason: collision with root package name */
    public final com.google.android.material.datepicker.c f11896q;

    /* renamed from: r  reason: collision with root package name */
    public final C0848D f11897r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.fragment.app.D f11898s;

    /* renamed from: t  reason: collision with root package name */
    public C0910r f11899t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11900u;

    /* renamed from: v  reason: collision with root package name */
    public C0852F f11901v;

    /* renamed from: w  reason: collision with root package name */
    public Future f11902w;

    public C0856H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private C0910r getEmojiTextViewHelper() {
        if (this.f11899t == null) {
            this.f11899t = new C0910r(this);
        }
        return this.f11899t;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f11896q;
        if (cVar != null) {
            cVar.a();
        }
        C0848D c0848d = this.f11897r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Y0.f11969a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0848D c0848d = this.f11897r;
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
        C0848D c0848d = this.f11897r;
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
        C0848D c0848d = this.f11897r;
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
        C0848D c0848d = this.f11897r;
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
        C0848D c0848d = this.f11897r;
        if (c0848d == null) {
            return 0;
        }
        return c0848d.f11863i.f11919a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w4.l0.X(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0850E getSuperCaller() {
        C0852F c0852f;
        if (this.f11901v == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                c0852f = new C0854G(this);
            } else if (i7 >= 26) {
                c0852f = new C0852F(0, this);
            }
            this.f11901v = c0852f;
        }
        return this.f11901v;
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f11896q;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f11896q;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0761k c0761k = this.f11897r.f11862h;
        if (c0761k != null) {
            return (ColorStateList) c0761k.f11169c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0761k c0761k = this.f11897r.f11862h;
        if (c0761k != null) {
            return (PorterDuff.Mode) c0761k.d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        l();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        androidx.fragment.app.D d;
        if (Build.VERSION.SDK_INT < 28 && (d = this.f11898s) != null) {
            TextClassifier textClassifier = (TextClassifier) d.f5884s;
            if (textClassifier == null) {
                return AbstractC0920w.a((TextView) d.f5883r);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public I.e getTextMetricsParamsCompat() {
        return w4.l0.u(this);
    }

    public final void l() {
        Future future = this.f11902w;
        if (future != null) {
            try {
                this.f11902w = null;
                AbstractC0515y1.v(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                w4.l0.u(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f11897r.getClass();
        C0848D.f(this, onCreateInputConnection, editorInfo);
        m3.g.A(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        C0848D c0848d = this.f11897r;
        if (c0848d != null && !Y0.f11969a) {
            c0848d.f11863i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        l();
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C0848D c0848d = this.f11897r;
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
        C0848D c0848d = this.f11897r;
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
        C0848D c0848d = this.f11897r;
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
        C0848D c0848d = this.f11897r;
        if (c0848d != null) {
            c0848d.i(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f11896q;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        com.google.android.material.datepicker.c cVar = this.f11896q;
        if (cVar != null) {
            cVar.o(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f11897r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f11897r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? android.support.v4.media.session.b.i0(context, i7) : null, i8 != 0 ? android.support.v4.media.session.b.i0(context, i8) : null, i9 != 0 ? android.support.v4.media.session.b.i0(context, i9) : null, i10 != 0 ? android.support.v4.media.session.b.i0(context, i10) : null);
        C0848D c0848d = this.f11897r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? android.support.v4.media.session.b.i0(context, i7) : null, i8 != 0 ? android.support.v4.media.session.b.i0(context, i8) : null, i9 != 0 ? android.support.v4.media.session.b.i0(context, i9) : null, i10 != 0 ? android.support.v4.media.session.b.i0(context, i10) : null);
        C0848D c0848d = this.f11897r;
        if (c0848d != null) {
            c0848d.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i7);
        } else {
            w4.l0.O(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i7);
        } else {
            w4.l0.P(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        android.support.v4.media.session.b.g(i7);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i7 != fontMetricsInt) {
            setLineSpacing(i7 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(I.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        w4.l0.u(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f11896q;
        if (cVar != null) {
            cVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f11896q;
        if (cVar != null) {
            cVar.u(mode);
        }
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0848D c0848d = this.f11897r;
        c0848d.j(colorStateList);
        c0848d.b();
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0848D c0848d = this.f11897r;
        c0848d.k(mode);
        c0848d.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0848D c0848d = this.f11897r;
        if (c0848d != null) {
            c0848d.e(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        androidx.fragment.app.D d;
        if (Build.VERSION.SDK_INT >= 28 || (d = this.f11898s) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            d.f5884s = textClassifier;
        }
    }

    public void setTextFuture(Future<I.f> future) {
        this.f11902w = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(I.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f1197b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i7 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i7 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i7 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i7 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i7 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i7 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i7 = 7;
            }
        }
        setTextDirection(i7);
        getPaint().set(eVar.f1196a);
        P.n.e(this, eVar.f1198c);
        P.n.h(this, eVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f) {
        boolean z7 = Y0.f11969a;
        if (z7) {
            super.setTextSize(i7, f);
            return;
        }
        C0848D c0848d = this.f11897r;
        if (c0848d != null && !z7) {
            C0866P c0866p = c0848d.f11863i;
            if (!c0866p.f()) {
                c0866p.g(i7, f);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typeface2;
        if (this.f11900u) {
            return;
        }
        if (typeface != null && i7 > 0) {
            Context context = getContext();
            h4.b bVar = D.h.f435a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i7);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f11900u = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f11900u = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0856H(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        AbstractC0859I0.a(context);
        this.f11900u = false;
        this.f11901v = null;
        AbstractC0857H0.a(this, getContext());
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f11896q = cVar;
        cVar.l(attributeSet, i7);
        C0848D c0848d = new C0848D(this);
        this.f11897r = c0848d;
        c0848d.d(attributeSet, i7);
        c0848d.b();
        androidx.fragment.app.D d = new androidx.fragment.app.D(18, false);
        d.f5883r = this;
        this.f11898s = d;
        getEmojiTextViewHelper().a(attributeSet, i7);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f11897r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f11897r;
        if (c0848d != null) {
            c0848d.b();
        }
    }
}
