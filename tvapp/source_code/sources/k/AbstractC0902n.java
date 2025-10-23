package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.widget.CheckBox;
import h6.C0761k;
/* renamed from: k.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0902n extends CheckBox implements P.s {

    /* renamed from: q  reason: collision with root package name */
    public final A0.e f12067q;

    /* renamed from: r  reason: collision with root package name */
    public final com.google.android.material.datepicker.c f12068r;

    /* renamed from: s  reason: collision with root package name */
    public final C0848D f12069s;

    /* renamed from: t  reason: collision with root package name */
    public C0910r f12070t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:3:0x0037, B:5:0x003d, B:7:0x0043, B:16:0x0068, B:18:0x006f, B:19:0x0076, B:21:0x007d, B:11:0x0051, B:13:0x0057, B:15:0x005d), top: B:29:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:3:0x0037, B:5:0x003d, B:7:0x0043, B:16:0x0068, B:18:0x006f, B:19:0x0076, B:21:0x007d, B:11:0x0051, B:13:0x0057, B:15:0x005d), top: B:29:0x0037 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC0902n(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            k.AbstractC0859I0.a(r10)
            r6 = 2130968768(0x7f0400c0, float:1.7546199E38)
            r9.<init>(r10, r11, r6)
            android.content.Context r10 = r9.getContext()
            k.AbstractC0857H0.a(r9, r10)
            A0.e r10 = new A0.e
            r10.<init>(r9)
            r9.f12067q = r10
            android.content.Context r10 = r9.getContext()
            int[] r2 = e.AbstractC0565a.f9348j
            r7 = 0
            g5.b r10 = g5.b.C(r10, r11, r2, r6, r7)
            java.lang.Object r0 = r10.f10842s
            r8 = r0
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            android.content.Context r1 = r9.getContext()
            java.lang.Object r0 = r10.f10842s
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r9
            r3 = r11
            r5 = r6
            K.O.h(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L51
            int r0 = r8.getResourceId(r0, r7)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L51
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L4f android.content.res.Resources.NotFoundException -> L51
            android.graphics.drawable.Drawable r0 = android.support.v4.media.session.b.i0(r1, r0)     // Catch: java.lang.Throwable -> L4f android.content.res.Resources.NotFoundException -> L51
            r9.setButtonDrawable(r0)     // Catch: java.lang.Throwable -> L4f android.content.res.Resources.NotFoundException -> L51
            goto L68
        L4f:
            r11 = move-exception
            goto La9
        L51:
            boolean r0 = r8.hasValue(r7)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L68
            int r0 = r8.getResourceId(r7, r7)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L68
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L4f
            android.graphics.drawable.Drawable r0 = android.support.v4.media.session.b.i0(r1, r0)     // Catch: java.lang.Throwable -> L4f
            r9.setButtonDrawable(r0)     // Catch: java.lang.Throwable -> L4f
        L68:
            r0 = 2
            boolean r1 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L76
            android.content.res.ColorStateList r0 = r10.y(r0)     // Catch: java.lang.Throwable -> L4f
            P.c.c(r9, r0)     // Catch: java.lang.Throwable -> L4f
        L76:
            r0 = 3
            boolean r1 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L8a
            r1 = -1
            int r0 = r8.getInt(r0, r1)     // Catch: java.lang.Throwable -> L4f
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = k.AbstractC0869T.b(r0, r1)     // Catch: java.lang.Throwable -> L4f
            P.c.d(r9, r0)     // Catch: java.lang.Throwable -> L4f
        L8a:
            r10.D()
            com.google.android.material.datepicker.c r10 = new com.google.android.material.datepicker.c
            r10.<init>(r9)
            r9.f12068r = r10
            r10.l(r11, r6)
            k.D r10 = new k.D
            r10.<init>(r9)
            r9.f12069s = r10
            r10.d(r11, r6)
            k.r r10 = r9.getEmojiTextViewHelper()
            r10.a(r11, r6)
            return
        La9:
            r10.D()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0902n.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C0910r getEmojiTextViewHelper() {
        if (this.f12070t == null) {
            this.f12070t = new C0910r(this);
        }
        return this.f12070t;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f12068r;
        if (cVar != null) {
            cVar.a();
        }
        C0848D c0848d = this.f12069s;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        A0.e eVar = this.f12067q;
        if (eVar != null) {
            eVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f12068r;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f12068r;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        A0.e eVar = this.f12067q;
        if (eVar != null) {
            return (ColorStateList) eVar.f10e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        A0.e eVar = this.f12067q;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0761k c0761k = this.f12069s.f11862h;
        if (c0761k != null) {
            return (ColorStateList) c0761k.f11169c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0761k c0761k = this.f12069s.f11862h;
        if (c0761k != null) {
            return (PorterDuff.Mode) c0761k.d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        ((p6.l) getEmojiTextViewHelper().f12087b.f4918q).G(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f12068r;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        com.google.android.material.datepicker.c cVar = this.f12068r;
        if (cVar != null) {
            cVar.o(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(android.support.v4.media.session.b.i0(getContext(), i7));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f12069s;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0848D c0848d = this.f12069s;
        if (c0848d != null) {
            c0848d.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z7) {
        ((p6.l) getEmojiTextViewHelper().f12087b.f4918q).H(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((p6.l) getEmojiTextViewHelper().f12087b.f4918q).v(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f12068r;
        if (cVar != null) {
            cVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f12068r;
        if (cVar != null) {
            cVar.u(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        A0.e eVar = this.f12067q;
        if (eVar != null) {
            eVar.f10e = colorStateList;
            eVar.f7a = true;
            eVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        A0.e eVar = this.f12067q;
        if (eVar != null) {
            eVar.f = mode;
            eVar.f8b = true;
            eVar.a();
        }
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0848D c0848d = this.f12069s;
        c0848d.j(colorStateList);
        c0848d.b();
    }

    @Override // P.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0848D c0848d = this.f12069s;
        c0848d.k(mode);
        c0848d.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        A0.e eVar = this.f12067q;
        if (eVar != null) {
            if (eVar.f9c) {
                eVar.f9c = false;
                return;
            }
            eVar.f9c = true;
            eVar.a();
        }
    }
}
