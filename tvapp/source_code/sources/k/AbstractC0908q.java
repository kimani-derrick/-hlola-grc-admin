package k;

import K.C0029e;
import K.C0031g;
import K.InterfaceC0028d;
import K.InterfaceC0042s;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import h6.C0761k;
/* renamed from: k.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0908q extends EditText implements InterfaceC0042s, P.s {

    /* renamed from: q  reason: collision with root package name */
    public final com.google.android.material.datepicker.c f12078q;

    /* renamed from: r  reason: collision with root package name */
    public final C0848D f12079r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.fragment.app.D f12080s;

    /* renamed from: t  reason: collision with root package name */
    public final P.r f12081t;

    /* renamed from: u  reason: collision with root package name */
    public final androidx.fragment.app.D f12082u;

    /* renamed from: v  reason: collision with root package name */
    public C0906p f12083v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [P.r, java.lang.Object] */
    public AbstractC0908q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC0859I0.a(context);
        AbstractC0857H0.a(this, getContext());
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f12078q = cVar;
        cVar.l(attributeSet, R.attr.editTextStyle);
        C0848D c0848d = new C0848D(this);
        this.f12079r = c0848d;
        c0848d.d(attributeSet, R.attr.editTextStyle);
        c0848d.b();
        androidx.fragment.app.D d = new androidx.fragment.app.D(18, false);
        d.f5883r = this;
        this.f12080s = d;
        this.f12081t = new Object();
        androidx.fragment.app.D d7 = new androidx.fragment.app.D((EditText) this);
        this.f12082u = d7;
        d7.E(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener D6 = d7.D(keyListener);
            if (D6 != keyListener) {
                super.setKeyListener(D6);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private C0906p getSuperCaller() {
        if (this.f12083v == null) {
            this.f12083v = new C0906p(this);
        }
        return this.f12083v;
    }

    @Override // K.InterfaceC0042s
    public final C0031g a(C0031g c0031g) {
        return this.f12081t.a(this, c0031g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f12078q;
        if (cVar != null) {
            cVar.a();
        }
        C0848D c0848d = this.f12079r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w4.l0.X(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f12078q;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f12078q;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0761k c0761k = this.f12079r.f11862h;
        if (c0761k != null) {
            return (ColorStateList) c0761k.f11169c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0761k c0761k = this.f12079r.f11862h;
        if (c0761k != null) {
            return (PorterDuff.Mode) c0761k.d;
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        androidx.fragment.app.D d;
        if (Build.VERSION.SDK_INT < 28 && (d = this.f12080s) != null) {
            TextClassifier textClassifier = (TextClassifier) d.f5884s;
            if (textClassifier == null) {
                return AbstractC0920w.a((TextView) d.f5883r);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r1 != null) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            k.D r1 = r7.f12079r
            r1.getClass()
            k.C0848D.f(r7, r0, r8)
            m3.g.A(r0, r8, r7)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = K.O.c(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            O.a.a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            H2.U r2 = new H2.U
            r6 = 2
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4d
            O.d r1 = new O.d
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = O.c.f2543a
            if (r1 < r5) goto L59
            java.lang.String[] r1 = O.a.b(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            O.e r1 = new O.e
            r1.<init>(r0, r2)
            goto L4b
        L77:
            androidx.fragment.app.D r1 = r7.f12082u
            a0.b r8 = r1.I(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0908q.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31 && i7 >= 24 && dragEvent.getLocalState() == null && K.O.c(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && AbstractC0918v.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        InterfaceC0028d interfaceC0028d;
        int i8;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31 && K.O.c(this) != null && (i7 == 16908322 || i7 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i9 >= 31) {
                    interfaceC0028d = new T4.c(primaryClip, 1);
                } else {
                    C0029e c0029e = new C0029e();
                    c0029e.f1476r = primaryClip;
                    c0029e.f1477s = 1;
                    interfaceC0028d = c0029e;
                }
                if (i7 == 16908322) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                interfaceC0028d.H(i8);
                K.O.e(this, interfaceC0028d.i());
            }
            return true;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f12078q;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        com.google.android.material.datepicker.c cVar = this.f12078q;
        if (cVar != null) {
            cVar.o(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f12079r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f12079r;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w4.l0.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f12082u.R(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f12082u.D(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f12078q;
        if (cVar != null) {
            cVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f12078q;
        if (cVar != null) {
            cVar.u(mode);
        }
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0848D c0848d = this.f12079r;
        c0848d.j(colorStateList);
        c0848d.b();
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0848D c0848d = this.f12079r;
        c0848d.k(mode);
        c0848d.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0848D c0848d = this.f12079r;
        if (c0848d != null) {
            c0848d.e(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        androidx.fragment.app.D d;
        if (Build.VERSION.SDK_INT >= 28 || (d = this.f12080s) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            d.f5884s = textClassifier;
        }
    }
}
