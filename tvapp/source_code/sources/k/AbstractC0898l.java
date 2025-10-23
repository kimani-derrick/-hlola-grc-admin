package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.boxhdo.android.tv.R;
import h6.C0761k;
/* renamed from: k.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0898l extends AutoCompleteTextView implements P.s {

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f12060t = {16843126};

    /* renamed from: q  reason: collision with root package name */
    public final com.google.android.material.datepicker.c f12061q;

    /* renamed from: r  reason: collision with root package name */
    public final C0848D f12062r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.fragment.app.D f12063s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0898l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        AbstractC0859I0.a(context);
        AbstractC0857H0.a(this, getContext());
        g5.b C3 = g5.b.C(getContext(), attributeSet, f12060t, R.attr.autoCompleteTextViewStyle, 0);
        if (((TypedArray) C3.f10842s).hasValue(0)) {
            setDropDownBackgroundDrawable(C3.z(0));
        }
        C3.D();
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f12061q = cVar;
        cVar.l(attributeSet, R.attr.autoCompleteTextViewStyle);
        C0848D c0848d = new C0848D(this);
        this.f12062r = c0848d;
        c0848d.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        c0848d.b();
        androidx.fragment.app.D d = new androidx.fragment.app.D((EditText) this);
        this.f12063s = d;
        d.E(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener D6 = d.D(keyListener);
            if (D6 != keyListener) {
                super.setKeyListener(D6);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f12061q;
        if (cVar != null) {
            cVar.a();
        }
        C0848D c0848d = this.f12062r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w4.l0.X(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f12061q;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f12061q;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0761k c0761k = this.f12062r.f11862h;
        if (c0761k != null) {
            return (ColorStateList) c0761k.f11169c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0761k c0761k = this.f12062r.f11862h;
        if (c0761k != null) {
            return (PorterDuff.Mode) c0761k.d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        m3.g.A(onCreateInputConnection, editorInfo, this);
        return this.f12063s.I(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f12061q;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        com.google.android.material.datepicker.c cVar = this.f12061q;
        if (cVar != null) {
            cVar.o(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f12062r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f12062r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w4.l0.Z(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(android.support.v4.media.session.b.i0(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f12063s.R(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f12063s.D(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f12061q;
        if (cVar != null) {
            cVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f12061q;
        if (cVar != null) {
            cVar.u(mode);
        }
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0848D c0848d = this.f12062r;
        c0848d.j(colorStateList);
        c0848d.b();
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0848D c0848d = this.f12062r;
        c0848d.k(mode);
        c0848d.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0848D c0848d = this.f12062r;
        if (c0848d != null) {
            c0848d.e(context, i7);
        }
    }
}
