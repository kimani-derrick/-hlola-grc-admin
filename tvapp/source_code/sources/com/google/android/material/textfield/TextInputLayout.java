package com.google.android.material.textfield;

import E.a;
import F3.b;
import I.h;
import I.i;
import J3.f;
import J3.g;
import J3.k;
import K.O;
import L3.c;
import L3.d;
import L3.j;
import L3.q;
import L3.r;
import L3.t;
import L3.v;
import L3.w;
import L3.x;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import k.AbstractC0869T;
import k.C0856H;
import k.C0904o;
import k.C0915t0;
import k3.AbstractC0958a;
import v3.AbstractC1322a;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A  reason: collision with root package name */
    public int f8933A;

    /* renamed from: A0  reason: collision with root package name */
    public boolean f8934A0;

    /* renamed from: B  reason: collision with root package name */
    public boolean f8935B;

    /* renamed from: B0  reason: collision with root package name */
    public PorterDuff.Mode f8936B0;

    /* renamed from: C  reason: collision with root package name */
    public C0856H f8937C;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f8938C0;

    /* renamed from: D  reason: collision with root package name */
    public int f8939D;

    /* renamed from: D0  reason: collision with root package name */
    public ColorDrawable f8940D0;

    /* renamed from: E  reason: collision with root package name */
    public int f8941E;

    /* renamed from: E0  reason: collision with root package name */
    public int f8942E0;
    public CharSequence F;

    /* renamed from: F0  reason: collision with root package name */
    public Drawable f8943F0;

    /* renamed from: G  reason: collision with root package name */
    public boolean f8944G;
    public View.OnLongClickListener G0;

    /* renamed from: H  reason: collision with root package name */
    public C0856H f8945H;

    /* renamed from: H0  reason: collision with root package name */
    public View.OnLongClickListener f8946H0;

    /* renamed from: I  reason: collision with root package name */
    public ColorStateList f8947I;

    /* renamed from: I0  reason: collision with root package name */
    public final CheckableImageButton f8948I0;

    /* renamed from: J  reason: collision with root package name */
    public int f8949J;

    /* renamed from: J0  reason: collision with root package name */
    public ColorStateList f8950J0;

    /* renamed from: K  reason: collision with root package name */
    public ColorStateList f8951K;

    /* renamed from: K0  reason: collision with root package name */
    public ColorStateList f8952K0;

    /* renamed from: L  reason: collision with root package name */
    public ColorStateList f8953L;

    /* renamed from: L0  reason: collision with root package name */
    public ColorStateList f8954L0;

    /* renamed from: M  reason: collision with root package name */
    public CharSequence f8955M;

    /* renamed from: M0  reason: collision with root package name */
    public int f8956M0;

    /* renamed from: N  reason: collision with root package name */
    public final C0856H f8957N;

    /* renamed from: N0  reason: collision with root package name */
    public int f8958N0;

    /* renamed from: O  reason: collision with root package name */
    public CharSequence f8959O;

    /* renamed from: O0  reason: collision with root package name */
    public int f8960O0;

    /* renamed from: P  reason: collision with root package name */
    public final C0856H f8961P;

    /* renamed from: P0  reason: collision with root package name */
    public ColorStateList f8962P0;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f8963Q;

    /* renamed from: Q0  reason: collision with root package name */
    public int f8964Q0;

    /* renamed from: R  reason: collision with root package name */
    public CharSequence f8965R;

    /* renamed from: R0  reason: collision with root package name */
    public int f8966R0;

    /* renamed from: S  reason: collision with root package name */
    public boolean f8967S;

    /* renamed from: S0  reason: collision with root package name */
    public int f8968S0;

    /* renamed from: T  reason: collision with root package name */
    public g f8969T;

    /* renamed from: T0  reason: collision with root package name */
    public int f8970T0;

    /* renamed from: U  reason: collision with root package name */
    public g f8971U;
    public int U0;

    /* renamed from: V  reason: collision with root package name */
    public final k f8972V;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f8973V0;
    public final int W;

    /* renamed from: W0  reason: collision with root package name */
    public final b f8974W0;

    /* renamed from: X0  reason: collision with root package name */
    public boolean f8975X0;

    /* renamed from: Y0  reason: collision with root package name */
    public boolean f8976Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public ValueAnimator f8977Z0;

    /* renamed from: a0  reason: collision with root package name */
    public int f8978a0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f8979a1;

    /* renamed from: b0  reason: collision with root package name */
    public int f8980b0;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f8981b1;

    /* renamed from: c0  reason: collision with root package name */
    public int f8982c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f8983d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f8984e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f8985f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f8986g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f8987h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Rect f8988i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Rect f8989j0;

    /* renamed from: k0  reason: collision with root package name */
    public final RectF f8990k0;

    /* renamed from: l0  reason: collision with root package name */
    public Typeface f8991l0;

    /* renamed from: m0  reason: collision with root package name */
    public final CheckableImageButton f8992m0;

    /* renamed from: n0  reason: collision with root package name */
    public ColorStateList f8993n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f8994o0;

    /* renamed from: p0  reason: collision with root package name */
    public PorterDuff.Mode f8995p0;

    /* renamed from: q  reason: collision with root package name */
    public final FrameLayout f8996q;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f8997q0;

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f8998r;

    /* renamed from: r0  reason: collision with root package name */
    public ColorDrawable f8999r0;

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f9000s;

    /* renamed from: s0  reason: collision with root package name */
    public int f9001s0;

    /* renamed from: t  reason: collision with root package name */
    public final FrameLayout f9002t;

    /* renamed from: t0  reason: collision with root package name */
    public View.OnLongClickListener f9003t0;

    /* renamed from: u  reason: collision with root package name */
    public EditText f9004u;

    /* renamed from: u0  reason: collision with root package name */
    public final LinkedHashSet f9005u0;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f9006v;

    /* renamed from: v0  reason: collision with root package name */
    public int f9007v0;

    /* renamed from: w  reason: collision with root package name */
    public int f9008w;

    /* renamed from: w0  reason: collision with root package name */
    public final SparseArray f9009w0;

    /* renamed from: x  reason: collision with root package name */
    public int f9010x;

    /* renamed from: x0  reason: collision with root package name */
    public final CheckableImageButton f9011x0;

    /* renamed from: y  reason: collision with root package name */
    public final t f9012y;
    public final LinkedHashSet y0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f9013z;

    /* renamed from: z0  reason: collision with root package name */
    public ColorStateList f9014z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0612  */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v93 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r29, android.util.AttributeSet r30) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z7, ColorStateList colorStateList, boolean z8, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z7 || z8)) {
            drawable = drawable.mutate();
            if (z7) {
                a.h(drawable, colorStateList);
            }
            if (z8) {
                a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private r getEndIconDelegate() {
        SparseArray sparseArray = this.f9009w0;
        r rVar = (r) sparseArray.get(this.f9007v0);
        if (rVar == null) {
            return (r) sparseArray.get(0);
        }
        return rVar;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.f8948I0;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.f9007v0 != 0 && g()) {
            return this.f9011x0;
        }
        return null;
    }

    public static void j(ViewGroup viewGroup, boolean z7) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            childAt.setEnabled(z7);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z7);
            }
        }
    }

    public static void l(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z7;
        Field field = O.f1447a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z8 = false;
        int i7 = 1;
        if (onLongClickListener != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (hasOnClickListeners || z7) {
            z8 = true;
        }
        checkableImageButton.setFocusable(z8);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z7);
        if (!z8) {
            i7 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i7);
    }

    private void setEditText(EditText editText) {
        boolean z7;
        boolean z8;
        if (this.f9004u == null) {
            if (this.f9007v0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f9004u = editText;
            setMinWidth(this.f9008w);
            setMaxWidth(this.f9010x);
            h();
            setTextInputAccessibilityDelegate(new w(this));
            Typeface typeface = this.f9004u.getTypeface();
            b bVar = this.f8974W0;
            G3.a aVar = bVar.f693v;
            if (aVar != null) {
                aVar.f750c = true;
            }
            if (bVar.f690s != typeface) {
                bVar.f690s = typeface;
                z7 = true;
            } else {
                z7 = false;
            }
            if (bVar.f691t != typeface) {
                bVar.f691t = typeface;
                z8 = true;
            } else {
                z8 = false;
            }
            if (z7 || z8) {
                bVar.g();
            }
            float textSize = this.f9004u.getTextSize();
            if (bVar.f681i != textSize) {
                bVar.f681i = textSize;
                bVar.g();
            }
            int gravity = this.f9004u.getGravity();
            int i7 = (gravity & (-113)) | 48;
            if (bVar.f680h != i7) {
                bVar.f680h = i7;
                bVar.g();
            }
            if (bVar.f679g != gravity) {
                bVar.f679g = gravity;
                bVar.g();
            }
            this.f9004u.addTextChangedListener(new L3.a(1, this));
            if (this.f8952K0 == null) {
                this.f8952K0 = this.f9004u.getHintTextColors();
            }
            if (this.f8963Q) {
                if (TextUtils.isEmpty(this.f8965R)) {
                    CharSequence hint = this.f9004u.getHint();
                    this.f9006v = hint;
                    setHint(hint);
                    this.f9004u.setHint((CharSequence) null);
                }
                this.f8967S = true;
            }
            if (this.f8937C != null) {
                n(this.f9004u.getText().length());
            }
            q();
            this.f9012y.b();
            this.f8998r.bringToFront();
            this.f9000s.bringToFront();
            this.f9002t.bringToFront();
            this.f8948I0.bringToFront();
            Iterator it = this.f9005u0.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(this);
            }
            u();
            x();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            s(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z7) {
        int i7;
        int i8 = 8;
        if (z7) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f8948I0.setVisibility(i7);
        FrameLayout frameLayout = this.f9002t;
        if (!z7) {
            i8 = 0;
        }
        frameLayout.setVisibility(i8);
        x();
        if (this.f9007v0 == 0) {
            p();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f8965R)) {
            this.f8965R = charSequence;
            b bVar = this.f8974W0;
            if (charSequence == null || !TextUtils.equals(bVar.f694w, charSequence)) {
                bVar.f694w = charSequence;
                bVar.f695x = null;
                Bitmap bitmap = bVar.f697z;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.f697z = null;
                }
                bVar.g();
            }
            if (!this.f8973V0) {
                i();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z7) {
        if (this.f8944G == z7) {
            return;
        }
        if (z7) {
            C0856H c0856h = new C0856H(getContext(), null);
            this.f8945H = c0856h;
            c0856h.setId(R.id.textinput_placeholder);
            this.f8945H.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.f8949J);
            setPlaceholderTextColor(this.f8947I);
            C0856H c0856h2 = this.f8945H;
            if (c0856h2 != null) {
                this.f8996q.addView(c0856h2);
                this.f8945H.setVisibility(0);
            }
        } else {
            C0856H c0856h3 = this.f8945H;
            if (c0856h3 != null) {
                c0856h3.setVisibility(8);
            }
            this.f8945H = null;
        }
        this.f8944G = z7;
    }

    public final void a(float f) {
        b bVar = this.f8974W0;
        if (bVar.f677c == f) {
            return;
        }
        if (this.f8977Z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8977Z0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC1322a.f15313b);
            this.f8977Z0.setDuration(167L);
            this.f8977Z0.addUpdateListener(new L3.k(1, this));
        }
        this.f8977Z0.setFloatValues(bVar.f677c, f);
        this.f8977Z0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i7, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f8996q;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    public final void b() {
        int i7;
        int i8;
        int i9;
        int i10;
        g gVar = this.f8969T;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.f8972V);
        if (this.f8980b0 == 2 && (i9 = this.f8983d0) > -1 && (i10 = this.f8986g0) != 0) {
            g gVar2 = this.f8969T;
            gVar2.f1362q.f1340k = i9;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i10);
            f fVar = gVar2.f1362q;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i11 = this.f8987h0;
        if (this.f8980b0 == 1) {
            TypedValue D6 = AbstractC0958a.D(getContext(), R.attr.colorSurface);
            if (D6 != null) {
                i8 = D6.data;
            } else {
                i8 = 0;
            }
            i11 = D.a.b(this.f8987h0, i8);
        }
        this.f8987h0 = i11;
        this.f8969T.j(ColorStateList.valueOf(i11));
        if (this.f9007v0 == 3) {
            this.f9004u.getBackground().invalidateSelf();
        }
        g gVar3 = this.f8971U;
        if (gVar3 != null) {
            if (this.f8983d0 > -1 && (i7 = this.f8986g0) != 0) {
                gVar3.j(ColorStateList.valueOf(i7));
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        d(this.f9011x0, this.f8934A0, this.f9014z0, this.f8938C0, this.f8936B0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i7) {
        EditText editText = this.f9004u;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i7);
            return;
        }
        if (this.f9006v != null) {
            boolean z7 = this.f8967S;
            this.f8967S = false;
            CharSequence hint = editText.getHint();
            this.f9004u.setHint(this.f9006v);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i7);
                return;
            } finally {
                this.f9004u.setHint(hint);
                this.f8967S = z7;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i7);
        onProvideAutofillVirtualStructure(viewStructure, i7);
        FrameLayout frameLayout = this.f8996q;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i8 = 0; i8 < frameLayout.getChildCount(); i8++) {
            View childAt = frameLayout.getChildAt(i8);
            ViewStructure newChild = viewStructure.newChild(i8);
            childAt.dispatchProvideAutofillStructure(newChild, i7);
            if (childAt == this.f9004u) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f8981b1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f8981b1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8963Q) {
            b bVar = this.f8974W0;
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f695x != null && bVar.f676b) {
                bVar.f673N.getLineLeft(0);
                bVar.f665E.setTextSize(bVar.f662B);
                float f = bVar.f688q;
                float f7 = bVar.f689r;
                float f8 = bVar.f661A;
                if (f8 != 1.0f) {
                    canvas.scale(f8, f8, f, f7);
                }
                canvas.translate(f, f7);
                bVar.f673N.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        g gVar = this.f8971U;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f8983d0;
            this.f8971U.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f8979a1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f8979a1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            F3.b r3 = r4.f8974W0
            if (r3 == 0) goto L2f
            r3.f663C = r1
            android.content.res.ColorStateList r1 = r3.f684l
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f683k
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.g()
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f9004u
            if (r3 == 0) goto L47
            java.lang.reflect.Field r3 = K.O.f1447a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.s(r0, r2)
        L47:
            r4.q()
            r4.z()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f8979a1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (!this.f8963Q) {
            return 0;
        }
        int i7 = this.f8980b0;
        b bVar = this.f8974W0;
        if (i7 != 0 && i7 != 1) {
            if (i7 != 2) {
                return 0;
            }
            TextPaint textPaint = bVar.F;
            textPaint.setTextSize(bVar.f682j);
            textPaint.setTypeface(bVar.f690s);
            textPaint.setLetterSpacing(bVar.f672M);
            return (int) ((-textPaint.ascent()) / 2.0f);
        }
        TextPaint textPaint2 = bVar.F;
        textPaint2.setTextSize(bVar.f682j);
        textPaint2.setTypeface(bVar.f690s);
        textPaint2.setLetterSpacing(bVar.f672M);
        return (int) (-textPaint2.ascent());
    }

    public final boolean f() {
        return this.f8963Q && !TextUtils.isEmpty(this.f8965R) && (this.f8969T instanceof j);
    }

    public final boolean g() {
        return this.f9002t.getVisibility() == 0 && this.f9011x0.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f9004u;
        if (editText != null) {
            return e() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public g getBoxBackground() {
        int i7 = this.f8980b0;
        if (i7 != 1 && i7 != 2) {
            throw new IllegalStateException();
        }
        return this.f8969T;
    }

    public int getBoxBackgroundColor() {
        return this.f8987h0;
    }

    public int getBoxBackgroundMode() {
        return this.f8980b0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        g gVar = this.f8969T;
        return gVar.f1362q.f1332a.f1388h.a(gVar.f());
    }

    public float getBoxCornerRadiusBottomStart() {
        g gVar = this.f8969T;
        return gVar.f1362q.f1332a.f1387g.a(gVar.f());
    }

    public float getBoxCornerRadiusTopEnd() {
        g gVar = this.f8969T;
        return gVar.f1362q.f1332a.f.a(gVar.f());
    }

    public float getBoxCornerRadiusTopStart() {
        g gVar = this.f8969T;
        return gVar.f1362q.f1332a.f1386e.a(gVar.f());
    }

    public int getBoxStrokeColor() {
        return this.f8960O0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8962P0;
    }

    public int getBoxStrokeWidth() {
        return this.f8984e0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f8985f0;
    }

    public int getCounterMaxLength() {
        return this.f8933A;
    }

    public CharSequence getCounterOverflowDescription() {
        C0856H c0856h;
        if (this.f9013z && this.f8935B && (c0856h = this.f8937C) != null) {
            return c0856h.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f8951K;
    }

    public ColorStateList getCounterTextColor() {
        return this.f8951K;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8952K0;
    }

    public EditText getEditText() {
        return this.f9004u;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f9011x0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f9011x0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f9007v0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f9011x0;
    }

    public CharSequence getError() {
        t tVar = this.f9012y;
        if (tVar.f2111k) {
            return tVar.f2110j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f9012y.f2113m;
    }

    public int getErrorCurrentTextColors() {
        C0856H c0856h = this.f9012y.f2112l;
        if (c0856h != null) {
            return c0856h.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f8948I0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        C0856H c0856h = this.f9012y.f2112l;
        if (c0856h != null) {
            return c0856h.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        t tVar = this.f9012y;
        if (tVar.f2116q) {
            return tVar.f2115p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0856H c0856h = this.f9012y.f2117r;
        if (c0856h != null) {
            return c0856h.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f8963Q) {
            return this.f8965R;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        b bVar = this.f8974W0;
        TextPaint textPaint = bVar.F;
        textPaint.setTextSize(bVar.f682j);
        textPaint.setTypeface(bVar.f690s);
        textPaint.setLetterSpacing(bVar.f672M);
        return -textPaint.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f8974W0;
        return bVar.d(bVar.f684l);
    }

    public ColorStateList getHintTextColor() {
        return this.f8954L0;
    }

    public int getMaxWidth() {
        return this.f9010x;
    }

    public int getMinWidth() {
        return this.f9008w;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f9011x0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f9011x0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f8944G) {
            return this.F;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f8949J;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f8947I;
    }

    public CharSequence getPrefixText() {
        return this.f8955M;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f8957N.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f8957N;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f8992m0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f8992m0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f8959O;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f8961P.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f8961P;
    }

    public Typeface getTypeface() {
        return this.f8991l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.h():void");
    }

    public final void i() {
        h hVar;
        float f;
        float b7;
        float f7;
        float b8;
        if (!f()) {
            return;
        }
        RectF rectF = this.f8990k0;
        int width = this.f9004u.getWidth();
        int gravity = this.f9004u.getGravity();
        b bVar = this.f8974W0;
        CharSequence charSequence = bVar.f694w;
        Field field = O.f1447a;
        if (bVar.f675a.getLayoutDirection() == 1) {
            hVar = i.d;
        } else {
            hVar = i.f1204c;
        }
        boolean e3 = hVar.e(charSequence.length(), charSequence);
        bVar.f696y = e3;
        Rect rect = bVar.f678e;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !e3 : e3) {
                f = rect.right;
                b7 = bVar.b();
            } else {
                f7 = rect.left;
                rectF.left = f7;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !bVar.f696y : bVar.f696y) {
                        b8 = rect.right;
                    } else {
                        b8 = bVar.b() + f7;
                    }
                } else {
                    b8 = (width / 2.0f) + (bVar.b() / 2.0f);
                }
                rectF.right = b8;
                TextPaint textPaint = bVar.F;
                textPaint.setTextSize(bVar.f682j);
                textPaint.setTypeface(bVar.f690s);
                textPaint.setLetterSpacing(bVar.f672M);
                textPaint.ascent();
                float f8 = rectF.left;
                float f9 = this.W;
                rectF.left = f8 - f9;
                rectF.right += f9;
                int i7 = this.f8983d0;
                this.f8978a0 = i7;
                rectF.top = 0.0f;
                rectF.bottom = i7;
                rectF.offset(-getPaddingLeft(), 0.0f);
                j jVar = (j) this.f8969T;
                jVar.getClass();
                jVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
        } else {
            f = width / 2.0f;
            b7 = bVar.b() / 2.0f;
        }
        f7 = f - b7;
        rectF.left = f7;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        b8 = (width / 2.0f) + (bVar.b() / 2.0f);
        rectF.right = b8;
        TextPaint textPaint2 = bVar.F;
        textPaint2.setTextSize(bVar.f682j);
        textPaint2.setTypeface(bVar.f690s);
        textPaint2.setLetterSpacing(bVar.f672M);
        textPaint2.ascent();
        float f82 = rectF.left;
        float f92 = this.W;
        rectF.left = f82 - f92;
        rectF.right += f92;
        int i72 = this.f8983d0;
        this.f8978a0 = i72;
        rectF.top = 0.0f;
        rectF.bottom = i72;
        rectF.offset(-getPaddingLeft(), 0.0f);
        j jVar2 = (j) this.f8969T;
        jVar2.getClass();
        jVar2.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            a.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public final void m(TextView textView, int i7) {
        try {
            textView.setTextAppearance(i7);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2132017502);
        textView.setTextColor(A.b.a(getContext(), R.color.design_error));
    }

    public final void n(int i7) {
        boolean z7;
        int i8;
        I.b bVar;
        boolean z8 = this.f8935B;
        int i9 = this.f8933A;
        String str = null;
        if (i9 == -1) {
            this.f8937C.setText(String.valueOf(i7));
            this.f8937C.setContentDescription(null);
            this.f8935B = false;
        } else {
            if (i7 > i9) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f8935B = z7;
            Context context = getContext();
            C0856H c0856h = this.f8937C;
            int i10 = this.f8933A;
            if (this.f8935B) {
                i8 = R.string.character_counter_overflowed_content_description;
            } else {
                i8 = R.string.character_counter_content_description;
            }
            c0856h.setContentDescription(context.getString(i8, Integer.valueOf(i7), Integer.valueOf(i10)));
            if (z8 != this.f8935B) {
                o();
            }
            String str2 = I.b.d;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = I.b.f1192g;
            } else {
                bVar = I.b.f;
            }
            C0856H c0856h2 = this.f8937C;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i7), Integer.valueOf(this.f8933A));
            if (string == null) {
                bVar.getClass();
            } else {
                str = bVar.c(string, bVar.f1195c).toString();
            }
            c0856h2.setText(str);
        }
        if (this.f9004u != null && z8 != this.f8935B) {
            s(false, false);
            z();
            q();
        }
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0856H c0856h = this.f8937C;
        if (c0856h != null) {
            m(c0856h, this.f8935B ? this.f8939D : this.f8941E);
            if (!this.f8935B && (colorStateList2 = this.f8951K) != null) {
                this.f8937C.setTextColor(colorStateList2);
            }
            if (!this.f8935B || (colorStateList = this.f8953L) == null) {
                return;
            }
            this.f8937C.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
        if (r10 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
        r6 = r6 + (r1.getMeasuredWidth() - r1.getPaddingRight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
        if (r10 != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020f  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        EditText editText;
        int max;
        super.onMeasure(i7, i8);
        boolean z7 = false;
        if (this.f9004u != null && this.f9004u.getMeasuredHeight() < (max = Math.max(this.f9000s.getMeasuredHeight(), this.f8998r.getMeasuredHeight()))) {
            this.f9004u.setMinimumHeight(max);
            z7 = true;
        }
        boolean p3 = p();
        if (z7 || p3) {
            this.f9004u.post(new v(this, 1));
        }
        if (this.f8945H != null && (editText = this.f9004u) != null) {
            this.f8945H.setGravity(editText.getGravity());
            this.f8945H.setPadding(this.f9004u.getCompoundPaddingLeft(), this.f9004u.getCompoundPaddingTop(), this.f9004u.getCompoundPaddingRight(), this.f9004u.getCompoundPaddingBottom());
        }
        u();
        x();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        super.onRestoreInstanceState(xVar.f2938q);
        setError(xVar.f2124s);
        if (xVar.f2125t) {
            this.f9011x0.post(new v(this, 0));
        }
        setHint(xVar.f2126u);
        setHelperText(xVar.f2127v);
        setPlaceholderText(xVar.f2128w);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L3.x, android.os.Parcelable, S.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z7;
        ?? bVar = new S.b(super.onSaveInstanceState());
        if (this.f9012y.e()) {
            bVar.f2124s = getError();
        }
        if (this.f9007v0 != 0 && this.f9011x0.f8912t) {
            z7 = true;
        } else {
            z7 = false;
        }
        bVar.f2125t = z7;
        bVar.f2126u = getHint();
        bVar.f2127v = getHelperText();
        bVar.f2128w = getPlaceholderText();
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        C0856H c0856h;
        PorterDuffColorFilter b7;
        int i7;
        EditText editText = this.f9004u;
        if (editText == null || this.f8980b0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0869T.f11941a;
        Drawable mutate = background.mutate();
        t tVar = this.f9012y;
        if (tVar.e()) {
            C0856H c0856h2 = tVar.f2112l;
            if (c0856h2 != null) {
                i7 = c0856h2.getCurrentTextColor();
            } else {
                i7 = -1;
            }
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = C0904o.f12071b;
            synchronized (C0904o.class) {
                b7 = C0915t0.h(i7, mode);
            }
        } else if (this.f8935B && (c0856h = this.f8937C) != null) {
            b7 = C0904o.b(c0856h.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
        } else {
            mutate.clearColorFilter();
            this.f9004u.refreshDrawableState();
            return;
        }
        mutate.setColorFilter(b7);
    }

    public final void r() {
        if (this.f8980b0 != 1) {
            FrameLayout frameLayout = this.f8996q;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e3 = e();
            if (e3 != layoutParams.topMargin) {
                layoutParams.topMargin = e3;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r0 != null) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s(boolean, boolean):void");
    }

    public void setBoxBackgroundColor(int i7) {
        if (this.f8987h0 != i7) {
            this.f8987h0 = i7;
            this.f8964Q0 = i7;
            this.f8968S0 = i7;
            this.f8970T0 = i7;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i7) {
        setBoxBackgroundColor(A.b.a(getContext(), i7));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f8964Q0 = defaultColor;
        this.f8987h0 = defaultColor;
        this.f8966R0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f8968S0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f8970T0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i7) {
        if (i7 == this.f8980b0) {
            return;
        }
        this.f8980b0 = i7;
        if (this.f9004u != null) {
            h();
        }
    }

    public void setBoxStrokeColor(int i7) {
        if (this.f8960O0 != i7) {
            this.f8960O0 = i7;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f8960O0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            z();
        }
        this.f8956M0 = colorStateList.getDefaultColor();
        this.U0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f8958N0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f8960O0 = defaultColor;
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8962P0 != colorStateList) {
            this.f8962P0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i7) {
        this.f8984e0 = i7;
        z();
    }

    public void setBoxStrokeWidthFocused(int i7) {
        this.f8985f0 = i7;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i7) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i7));
    }

    public void setBoxStrokeWidthResource(int i7) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i7));
    }

    public void setCounterEnabled(boolean z7) {
        int length;
        if (this.f9013z != z7) {
            t tVar = this.f9012y;
            if (z7) {
                C0856H c0856h = new C0856H(getContext(), null);
                this.f8937C = c0856h;
                c0856h.setId(R.id.textinput_counter);
                Typeface typeface = this.f8991l0;
                if (typeface != null) {
                    this.f8937C.setTypeface(typeface);
                }
                this.f8937C.setMaxLines(1);
                tVar.a(this.f8937C, 2);
                ((ViewGroup.MarginLayoutParams) this.f8937C.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f8937C != null) {
                    EditText editText = this.f9004u;
                    if (editText == null) {
                        length = 0;
                    } else {
                        length = editText.getText().length();
                    }
                    n(length);
                }
            } else {
                tVar.h(this.f8937C, 2);
                this.f8937C = null;
            }
            this.f9013z = z7;
        }
    }

    public void setCounterMaxLength(int i7) {
        int length;
        if (this.f8933A != i7) {
            if (i7 <= 0) {
                i7 = -1;
            }
            this.f8933A = i7;
            if (this.f9013z && this.f8937C != null) {
                EditText editText = this.f9004u;
                if (editText == null) {
                    length = 0;
                } else {
                    length = editText.getText().length();
                }
                n(length);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i7) {
        if (this.f8939D != i7) {
            this.f8939D = i7;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f8953L != colorStateList) {
            this.f8953L = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i7) {
        if (this.f8941E != i7) {
            this.f8941E = i7;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f8951K != colorStateList) {
            this.f8951K = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f8952K0 = colorStateList;
        this.f8954L0 = colorStateList;
        if (this.f9004u != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        j(this, z7);
        super.setEnabled(z7);
    }

    public void setEndIconActivated(boolean z7) {
        this.f9011x0.setActivated(z7);
    }

    public void setEndIconCheckable(boolean z7) {
        this.f9011x0.setCheckable(z7);
    }

    public void setEndIconContentDescription(int i7) {
        setEndIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setEndIconDrawable(int i7) {
        setEndIconDrawable(i7 != 0 ? android.support.v4.media.session.b.i0(getContext(), i7) : null);
    }

    public void setEndIconMode(int i7) {
        boolean z7;
        int i8 = this.f9007v0;
        this.f9007v0 = i7;
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i8);
        }
        if (i7 != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        setEndIconVisible(z7);
        if (getEndIconDelegate().b(this.f8980b0)) {
            getEndIconDelegate().a();
            c();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f8980b0 + " is not supported by the end icon mode " + i7);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.G0;
        CheckableImageButton checkableImageButton = this.f9011x0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.G0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f9011x0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f9014z0 != colorStateList) {
            this.f9014z0 = colorStateList;
            this.f8934A0 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f8936B0 != mode) {
            this.f8936B0 = mode;
            this.f8938C0 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z7) {
        if (g() != z7) {
            this.f9011x0.setVisibility(z7 ? 0 : 8);
            x();
            p();
        }
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f9012y;
        if (!tVar.f2111k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            tVar.c();
            tVar.f2110j = charSequence;
            tVar.f2112l.setText(charSequence);
            int i7 = tVar.f2108h;
            if (i7 != 1) {
                tVar.f2109i = 1;
            }
            tVar.j(i7, tVar.f2109i, tVar.i(tVar.f2112l, charSequence));
            return;
        }
        tVar.g();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f9012y;
        tVar.f2113m = charSequence;
        C0856H c0856h = tVar.f2112l;
        if (c0856h != null) {
            c0856h.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z7) {
        t tVar = this.f9012y;
        if (tVar.f2111k != z7) {
            tVar.c();
            TextInputLayout textInputLayout = tVar.f2104b;
            if (z7) {
                C0856H c0856h = new C0856H(tVar.f2103a, null);
                tVar.f2112l = c0856h;
                c0856h.setId(R.id.textinput_error);
                tVar.f2112l.setTextAlignment(5);
                Typeface typeface = tVar.f2120u;
                if (typeface != null) {
                    tVar.f2112l.setTypeface(typeface);
                }
                int i7 = tVar.n;
                tVar.n = i7;
                C0856H c0856h2 = tVar.f2112l;
                if (c0856h2 != null) {
                    textInputLayout.m(c0856h2, i7);
                }
                ColorStateList colorStateList = tVar.f2114o;
                tVar.f2114o = colorStateList;
                C0856H c0856h3 = tVar.f2112l;
                if (c0856h3 != null && colorStateList != null) {
                    c0856h3.setTextColor(colorStateList);
                }
                CharSequence charSequence = tVar.f2113m;
                tVar.f2113m = charSequence;
                C0856H c0856h4 = tVar.f2112l;
                if (c0856h4 != null) {
                    c0856h4.setContentDescription(charSequence);
                }
                tVar.f2112l.setVisibility(4);
                tVar.f2112l.setAccessibilityLiveRegion(1);
                tVar.a(tVar.f2112l, 0);
            } else {
                tVar.g();
                tVar.h(tVar.f2112l, 0);
                tVar.f2112l = null;
                textInputLayout.q();
                textInputLayout.z();
            }
            tVar.f2111k = z7;
        }
    }

    public void setErrorIconDrawable(int i7) {
        setErrorIconDrawable(i7 != 0 ? android.support.v4.media.session.b.i0(getContext(), i7) : null);
        k(this.f8948I0, this.f8950J0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f8946H0;
        CheckableImageButton checkableImageButton = this.f8948I0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8946H0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f8948I0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f8950J0 = colorStateList;
        CheckableImageButton checkableImageButton = this.f8948I0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            a.h(drawable, colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.f8948I0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            a.i(drawable, mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i7) {
        t tVar = this.f9012y;
        tVar.n = i7;
        C0856H c0856h = tVar.f2112l;
        if (c0856h != null) {
            tVar.f2104b.m(c0856h, i7);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f9012y;
        tVar.f2114o = colorStateList;
        C0856H c0856h = tVar.f2112l;
        if (c0856h != null && colorStateList != null) {
            c0856h.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z7) {
        if (this.f8975X0 != z7) {
            this.f8975X0 = z7;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f9012y;
        if (isEmpty) {
            if (tVar.f2116q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f2116q) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f2115p = charSequence;
        tVar.f2117r.setText(charSequence);
        int i7 = tVar.f2108h;
        if (i7 != 2) {
            tVar.f2109i = 2;
        }
        tVar.j(i7, tVar.f2109i, tVar.i(tVar.f2117r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f9012y;
        tVar.f2119t = colorStateList;
        C0856H c0856h = tVar.f2117r;
        if (c0856h != null && colorStateList != null) {
            c0856h.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z7) {
        t tVar = this.f9012y;
        if (tVar.f2116q != z7) {
            tVar.c();
            if (z7) {
                C0856H c0856h = new C0856H(tVar.f2103a, null);
                tVar.f2117r = c0856h;
                c0856h.setId(R.id.textinput_helper_text);
                tVar.f2117r.setTextAlignment(5);
                Typeface typeface = tVar.f2120u;
                if (typeface != null) {
                    tVar.f2117r.setTypeface(typeface);
                }
                tVar.f2117r.setVisibility(4);
                tVar.f2117r.setAccessibilityLiveRegion(1);
                int i7 = tVar.f2118s;
                tVar.f2118s = i7;
                C0856H c0856h2 = tVar.f2117r;
                if (c0856h2 != null) {
                    c0856h2.setTextAppearance(i7);
                }
                ColorStateList colorStateList = tVar.f2119t;
                tVar.f2119t = colorStateList;
                C0856H c0856h3 = tVar.f2117r;
                if (c0856h3 != null && colorStateList != null) {
                    c0856h3.setTextColor(colorStateList);
                }
                tVar.a(tVar.f2117r, 1);
            } else {
                tVar.c();
                int i8 = tVar.f2108h;
                if (i8 == 2) {
                    tVar.f2109i = 0;
                }
                tVar.j(i8, tVar.f2109i, tVar.i(tVar.f2117r, null));
                tVar.h(tVar.f2117r, 1);
                tVar.f2117r = null;
                TextInputLayout textInputLayout = tVar.f2104b;
                textInputLayout.q();
                textInputLayout.z();
            }
            tVar.f2116q = z7;
        }
    }

    public void setHelperTextTextAppearance(int i7) {
        t tVar = this.f9012y;
        tVar.f2118s = i7;
        C0856H c0856h = tVar.f2117r;
        if (c0856h != null) {
            c0856h.setTextAppearance(i7);
        }
    }

    public void setHint(int i7) {
        setHint(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setHintAnimationEnabled(boolean z7) {
        this.f8976Y0 = z7;
    }

    public void setHintEnabled(boolean z7) {
        if (z7 != this.f8963Q) {
            this.f8963Q = z7;
            if (z7) {
                CharSequence hint = this.f9004u.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f8965R)) {
                        setHint(hint);
                    }
                    this.f9004u.setHint((CharSequence) null);
                }
                this.f8967S = true;
            } else {
                this.f8967S = false;
                if (!TextUtils.isEmpty(this.f8965R) && TextUtils.isEmpty(this.f9004u.getHint())) {
                    this.f9004u.setHint(this.f8965R);
                }
                setHintInternal(null);
            }
            if (this.f9004u != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i7) {
        b bVar = this.f8974W0;
        View view = bVar.f675a;
        G3.d dVar = new G3.d(view.getContext(), i7);
        ColorStateList colorStateList = dVar.f755a;
        if (colorStateList != null) {
            bVar.f684l = colorStateList;
        }
        float f = dVar.f763k;
        if (f != 0.0f) {
            bVar.f682j = f;
        }
        ColorStateList colorStateList2 = dVar.f756b;
        if (colorStateList2 != null) {
            bVar.f671L = colorStateList2;
        }
        bVar.f669J = dVar.f;
        bVar.f670K = dVar.f759g;
        bVar.f668I = dVar.f760h;
        bVar.f672M = dVar.f762j;
        G3.a aVar = bVar.f693v;
        if (aVar != null) {
            aVar.f750c = true;
        }
        T4.c cVar = new T4.c(6, bVar);
        dVar.a();
        bVar.f693v = new G3.a(cVar, dVar.n);
        dVar.c(view.getContext(), bVar.f693v);
        bVar.g();
        this.f8954L0 = bVar.f684l;
        if (this.f9004u != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8954L0 != colorStateList) {
            if (this.f8952K0 == null) {
                this.f8974W0.h(colorStateList);
            }
            this.f8954L0 = colorStateList;
            if (this.f9004u != null) {
                s(false, false);
            }
        }
    }

    public void setMaxWidth(int i7) {
        this.f9010x = i7;
        EditText editText = this.f9004u;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxWidth(i7);
    }

    public void setMaxWidthResource(int i7) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    public void setMinWidth(int i7) {
        this.f9008w = i7;
        EditText editText = this.f9004u;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinWidth(i7);
    }

    public void setMinWidthResource(int i7) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i7) {
        setPasswordVisibilityToggleContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i7) {
        setPasswordVisibilityToggleDrawable(i7 != 0 ? android.support.v4.media.session.b.i0(getContext(), i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z7) {
        if (z7 && this.f9007v0 != 1) {
            setEndIconMode(1);
        } else if (z7) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f9014z0 = colorStateList;
        this.f8934A0 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f8936B0 = mode;
        this.f8938C0 = true;
        c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i7 = 0;
        if (this.f8944G && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f8944G) {
                setPlaceholderTextEnabled(true);
            }
            this.F = charSequence;
        }
        EditText editText = this.f9004u;
        if (editText != null) {
            i7 = editText.getText().length();
        }
        t(i7);
    }

    public void setPlaceholderTextAppearance(int i7) {
        this.f8949J = i7;
        C0856H c0856h = this.f8945H;
        if (c0856h != null) {
            c0856h.setTextAppearance(i7);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f8947I != colorStateList) {
            this.f8947I = colorStateList;
            C0856H c0856h = this.f8945H;
            if (c0856h == null || colorStateList == null) {
                return;
            }
            c0856h.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f8955M = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8957N.setText(charSequence);
        v();
    }

    public void setPrefixTextAppearance(int i7) {
        this.f8957N.setTextAppearance(i7);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f8957N.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z7) {
        this.f8992m0.setCheckable(z7);
    }

    public void setStartIconContentDescription(int i7) {
        setStartIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setStartIconDrawable(int i7) {
        setStartIconDrawable(i7 != 0 ? android.support.v4.media.session.b.i0(getContext(), i7) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f9003t0;
        CheckableImageButton checkableImageButton = this.f8992m0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9003t0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f8992m0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f8993n0 != colorStateList) {
            this.f8993n0 = colorStateList;
            this.f8994o0 = true;
            d(this.f8992m0, true, colorStateList, this.f8997q0, this.f8995p0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f8995p0 != mode) {
            this.f8995p0 = mode;
            this.f8997q0 = true;
            d(this.f8992m0, this.f8994o0, this.f8993n0, true, mode);
        }
    }

    public void setStartIconVisible(boolean z7) {
        boolean z8;
        CheckableImageButton checkableImageButton = this.f8992m0;
        int i7 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 != z7) {
            if (!z7) {
                i7 = 8;
            }
            checkableImageButton.setVisibility(i7);
            u();
            p();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f8959O = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8961P.setText(charSequence);
        y();
    }

    public void setSuffixTextAppearance(int i7) {
        this.f8961P.setTextAppearance(i7);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f8961P.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(w wVar) {
        EditText editText = this.f9004u;
        if (editText != null) {
            O.i(editText, wVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z7;
        if (typeface != this.f8991l0) {
            this.f8991l0 = typeface;
            b bVar = this.f8974W0;
            G3.a aVar = bVar.f693v;
            boolean z8 = true;
            if (aVar != null) {
                aVar.f750c = true;
            }
            if (bVar.f690s != typeface) {
                bVar.f690s = typeface;
                z7 = true;
            } else {
                z7 = false;
            }
            if (bVar.f691t != typeface) {
                bVar.f691t = typeface;
            } else {
                z8 = false;
            }
            if (z7 || z8) {
                bVar.g();
            }
            t tVar = this.f9012y;
            if (typeface != tVar.f2120u) {
                tVar.f2120u = typeface;
                C0856H c0856h = tVar.f2112l;
                if (c0856h != null) {
                    c0856h.setTypeface(typeface);
                }
                C0856H c0856h2 = tVar.f2117r;
                if (c0856h2 != null) {
                    c0856h2.setTypeface(typeface);
                }
            }
            C0856H c0856h3 = this.f8937C;
            if (c0856h3 != null) {
                c0856h3.setTypeface(typeface);
            }
        }
    }

    public final void t(int i7) {
        if (i7 == 0 && !this.f8973V0) {
            C0856H c0856h = this.f8945H;
            if (c0856h != null && this.f8944G) {
                c0856h.setText(this.F);
                this.f8945H.setVisibility(0);
                this.f8945H.bringToFront();
                return;
            }
            return;
        }
        C0856H c0856h2 = this.f8945H;
        if (c0856h2 != null && this.f8944G) {
            c0856h2.setText((CharSequence) null);
            this.f8945H.setVisibility(4);
        }
    }

    public final void u() {
        int paddingStart;
        if (this.f9004u == null) {
            return;
        }
        if (this.f8992m0.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            EditText editText = this.f9004u;
            Field field = O.f1447a;
            paddingStart = editText.getPaddingStart();
        }
        C0856H c0856h = this.f8957N;
        int compoundPaddingTop = this.f9004u.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.f9004u.getCompoundPaddingBottom();
        Field field2 = O.f1447a;
        c0856h.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void v() {
        int i7;
        C0856H c0856h = this.f8957N;
        if (this.f8955M != null && !this.f8973V0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        c0856h.setVisibility(i7);
        p();
    }

    public final void w(boolean z7, boolean z8) {
        int defaultColor = this.f8962P0.getDefaultColor();
        int colorForState = this.f8962P0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f8962P0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z7) {
            this.f8986g0 = colorForState2;
        } else if (z8) {
            this.f8986g0 = colorForState;
        } else {
            this.f8986g0 = defaultColor;
        }
    }

    public final void x() {
        int i7;
        if (this.f9004u == null) {
            return;
        }
        if (!g() && this.f8948I0.getVisibility() != 0) {
            EditText editText = this.f9004u;
            Field field = O.f1447a;
            i7 = editText.getPaddingEnd();
        } else {
            i7 = 0;
        }
        C0856H c0856h = this.f8961P;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f9004u.getPaddingTop();
        int paddingBottom = this.f9004u.getPaddingBottom();
        Field field2 = O.f1447a;
        c0856h.setPaddingRelative(dimensionPixelSize, paddingTop, i7, paddingBottom);
    }

    public final void y() {
        boolean z7;
        C0856H c0856h = this.f8961P;
        int visibility = c0856h.getVisibility();
        int i7 = 0;
        if (this.f8959O != null && !this.f8973V0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            i7 = 8;
        }
        c0856h.setVisibility(i7);
        if (visibility != c0856h.getVisibility()) {
            getEndIconDelegate().c(z7);
        }
        p();
    }

    public final void z() {
        boolean z7;
        boolean z8;
        int i7;
        C0856H c0856h;
        int i8;
        int i9;
        EditText editText;
        EditText editText2;
        if (this.f8969T != null && this.f8980b0 != 0) {
            boolean z9 = false;
            if (!isFocused() && ((editText2 = this.f9004u) == null || !editText2.hasFocus())) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!isHovered() && ((editText = this.f9004u) == null || !editText.isHovered())) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean isEnabled = isEnabled();
            int i10 = -1;
            t tVar = this.f9012y;
            if (!isEnabled) {
                this.f8986g0 = this.U0;
            } else if (tVar.e()) {
                if (this.f8962P0 != null) {
                    w(z7, z8);
                } else {
                    C0856H c0856h2 = tVar.f2112l;
                    if (c0856h2 != null) {
                        i7 = c0856h2.getCurrentTextColor();
                    } else {
                        i7 = -1;
                    }
                    this.f8986g0 = i7;
                }
            } else {
                if (this.f8935B && (c0856h = this.f8937C) != null) {
                    if (this.f8962P0 != null) {
                        w(z7, z8);
                    } else {
                        i7 = c0856h.getCurrentTextColor();
                    }
                } else if (z7) {
                    i7 = this.f8960O0;
                } else if (z8) {
                    i7 = this.f8958N0;
                } else {
                    i7 = this.f8956M0;
                }
                this.f8986g0 = i7;
            }
            if (getErrorIconDrawable() != null && tVar.f2111k && tVar.e()) {
                z9 = true;
            }
            setErrorIconVisible(z9);
            k(this.f8948I0, this.f8950J0);
            k(this.f8992m0, this.f8993n0);
            ColorStateList colorStateList = this.f9014z0;
            CheckableImageButton checkableImageButton = this.f9011x0;
            k(checkableImageButton, colorStateList);
            r endIconDelegate = getEndIconDelegate();
            endIconDelegate.getClass();
            if (endIconDelegate instanceof q) {
                if (tVar.e() && getEndIconDrawable() != null) {
                    Drawable mutate = getEndIconDrawable().mutate();
                    C0856H c0856h3 = tVar.f2112l;
                    if (c0856h3 != null) {
                        i10 = c0856h3.getCurrentTextColor();
                    }
                    a.g(mutate, i10);
                    checkableImageButton.setImageDrawable(mutate);
                } else {
                    c();
                }
            }
            if (z7 && isEnabled()) {
                i8 = this.f8985f0;
            } else {
                i8 = this.f8984e0;
            }
            this.f8983d0 = i8;
            if (this.f8980b0 == 2 && f() && !this.f8973V0 && this.f8978a0 != this.f8983d0) {
                if (f()) {
                    ((j) this.f8969T).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                i();
            }
            if (this.f8980b0 == 1) {
                if (!isEnabled()) {
                    i9 = this.f8966R0;
                } else if (z8 && !z7) {
                    i9 = this.f8970T0;
                } else if (z7) {
                    i9 = this.f8968S0;
                } else {
                    i9 = this.f8964Q0;
                }
                this.f8987h0 = i9;
            }
            b();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f9011x0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f9011x0;
        checkableImageButton.setImageDrawable(drawable);
        k(checkableImageButton, this.f9014z0);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f8948I0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f9012y.f2111k);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f8963Q) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f9011x0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f9011x0.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f8992m0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f8992m0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            k(checkableImageButton, this.f8993n0);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }
}
