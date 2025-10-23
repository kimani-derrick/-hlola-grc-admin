package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e.AbstractC0565a;
import h6.C0761k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* renamed from: k.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848D {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f11857a;

    /* renamed from: b  reason: collision with root package name */
    public C0761k f11858b;

    /* renamed from: c  reason: collision with root package name */
    public C0761k f11859c;
    public C0761k d;

    /* renamed from: e  reason: collision with root package name */
    public C0761k f11860e;
    public C0761k f;

    /* renamed from: g  reason: collision with root package name */
    public C0761k f11861g;

    /* renamed from: h  reason: collision with root package name */
    public C0761k f11862h;

    /* renamed from: i  reason: collision with root package name */
    public final C0866P f11863i;

    /* renamed from: j  reason: collision with root package name */
    public int f11864j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f11865k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f11866l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11867m;

    public C0848D(TextView textView) {
        this.f11857a = textView;
        this.f11863i = new C0866P(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, h6.k] */
    public static C0761k c(Context context, C0904o c0904o, int i7) {
        ColorStateList i8;
        synchronized (c0904o) {
            i8 = c0904o.f12073a.i(context, i7);
        }
        if (i8 != null) {
            ?? obj = new Object();
            obj.f11168b = true;
            obj.f11169c = i8;
            return obj;
        }
        return null;
    }

    public static void f(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i7;
        int i8;
        int i9;
        CharSequence subSequence;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i10 >= 30) {
                O.b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i10 >= 30) {
                O.b.a(editorInfo, text);
                return;
            }
            int i11 = editorInfo.initialSelStart;
            int i12 = editorInfo.initialSelEnd;
            if (i11 > i12) {
                i7 = i12;
            } else {
                i7 = i11;
            }
            if (i11 <= i12) {
                i11 = i12;
            }
            int length = text.length();
            if (i7 >= 0 && i11 <= length && (i8 = editorInfo.inputType & 4095) != 129 && i8 != 225 && i8 != 18) {
                if (length <= 2048) {
                    O.c.a(editorInfo, text, i7, i11);
                    return;
                }
                int i13 = i11 - i7;
                if (i13 > 1024) {
                    i9 = 0;
                } else {
                    i9 = i13;
                }
                int i14 = 2048 - i9;
                int min = Math.min(text.length() - i11, i14 - Math.min(i7, (int) (i14 * 0.8d)));
                int min2 = Math.min(i7, i14 - min);
                int i15 = i7 - min2;
                if (Character.isLowSurrogate(text.charAt(i15))) {
                    i15++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                    min--;
                }
                int i16 = min2 + i9;
                int i17 = i16 + min;
                if (i9 != i13) {
                    subSequence = TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i11, min + i11));
                } else {
                    subSequence = text.subSequence(i15, i17 + i15);
                }
                O.c.a(editorInfo, subSequence, min2, i16);
                return;
            }
            O.c.a(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, C0761k c0761k) {
        if (drawable != null && c0761k != null) {
            C0904o.d(drawable, c0761k, this.f11857a.getDrawableState());
        }
    }

    public final void b() {
        C0761k c0761k = this.f11858b;
        TextView textView = this.f11857a;
        if (c0761k != null || this.f11859c != null || this.d != null || this.f11860e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f11858b);
            a(compoundDrawables[1], this.f11859c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f11860e);
        }
        if (this.f != null || this.f11861g != null) {
            Drawable[] a7 = AbstractC0924y.a(textView);
            a(a7[0], this.f);
            a(a7[2], this.f11861g);
        }
    }

    public final void d(AttributeSet attributeSet, int i7) {
        C0904o c0904o;
        boolean z7;
        boolean z8;
        String str;
        String str2;
        boolean z9;
        float f;
        float f7;
        float f8;
        int i8;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int fontMetricsInt;
        ColorStateList colorStateList;
        int resourceId;
        int i9;
        int resourceId2;
        TextView textView = this.f11857a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0904o.f12071b;
        synchronized (C0904o.class) {
            try {
                if (C0904o.f12072c == null) {
                    C0904o.c();
                }
                c0904o = C0904o.f12072c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr = AbstractC0565a.f;
        int i10 = 0;
        g5.b C3 = g5.b.C(context, attributeSet, iArr, i7, 0);
        TextView textView2 = this.f11857a;
        K.O.h(textView2, textView2.getContext(), iArr, attributeSet, (TypedArray) C3.f10842s, i7);
        TypedArray typedArray = (TypedArray) C3.f10842s;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f11858b = c(context, c0904o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f11859c = c(context, c0904o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, c0904o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f11860e = c(context, c0904o, typedArray.getResourceId(2, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f = c(context, c0904o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f11861g = c(context, c0904o, typedArray.getResourceId(6, 0));
        }
        C3.D();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0565a.f9356s;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            g5.b bVar = new g5.b(context, 4, obtainStyledAttributes);
            if (!z10 && obtainStyledAttributes.hasValue(14)) {
                z8 = obtainStyledAttributes.getBoolean(14, false);
                z7 = true;
            } else {
                z7 = false;
                z8 = false;
            }
            l(context, bVar);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
            } else {
                str2 = null;
            }
            if (i11 >= 26 && obtainStyledAttributes.hasValue(13)) {
                str = obtainStyledAttributes.getString(13);
            } else {
                str = null;
            }
            bVar.D();
        } else {
            z7 = false;
            z8 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        g5.b bVar2 = new g5.b(context, 4, obtainStyledAttributes2);
        if (!z10 && obtainStyledAttributes2.hasValue(14)) {
            z9 = obtainStyledAttributes2.getBoolean(14, false);
            z7 = true;
        } else {
            z9 = z8;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (i11 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i11 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        l(context, bVar2);
        bVar2.D();
        if (!z10 && z7) {
            this.f11857a.setAllCaps(z9);
        }
        Typeface typeface = this.f11866l;
        if (typeface != null) {
            if (this.f11865k == -1) {
                textView.setTypeface(typeface, this.f11864j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            AbstractC0844B.d(textView, str);
        }
        if (str3 != null) {
            if (i11 >= 24) {
                AbstractC0842A.b(textView, AbstractC0842A.a(str3));
            } else {
                AbstractC0924y.c(textView, AbstractC0926z.a(str3.split(",")[0]));
            }
        }
        int[] iArr3 = AbstractC0565a.f9345g;
        C0866P c0866p = this.f11863i;
        Context context2 = c0866p.f11926j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, 0);
        TextView textView3 = c0866p.f11925i;
        K.O.h(textView3, textView3.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i7);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0866p.f11919a = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f7 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f7 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f8 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f8 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                while (true) {
                    i8 = -1;
                    if (i10 >= length) {
                        break;
                    }
                    iArr4[i10] = obtainTypedArray.getDimensionPixelSize(i10, -1);
                    i10++;
                }
                c0866p.f = C0866P.b(iArr4);
                c0866p.i();
            } else {
                i8 = -1;
            }
            obtainTypedArray.recycle();
        } else {
            i8 = -1;
        }
        obtainStyledAttributes3.recycle();
        if (c0866p.j()) {
            if (c0866p.f11919a == 1) {
                if (!c0866p.f11923g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f7 == -1.0f) {
                        i9 = 2;
                        f7 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i9 = 2;
                    }
                    if (f8 == -1.0f) {
                        f8 = TypedValue.applyDimension(i9, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    c0866p.k(f7, f8, f);
                }
                c0866p.h();
            }
        } else {
            c0866p.f11919a = 0;
        }
        if (Y0.f11969a && c0866p.f11919a != 0) {
            int[] iArr5 = c0866p.f;
            if (iArr5.length > 0) {
                if (AbstractC0844B.a(textView) != -1.0f) {
                    AbstractC0844B.b(textView, Math.round(c0866p.d), Math.round(c0866p.f11922e), Math.round(c0866p.f11921c), 0);
                } else {
                    AbstractC0844B.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, i8);
        if (resourceId4 != i8) {
            drawable = c0904o.a(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, i8);
        if (resourceId5 != i8) {
            drawable2 = c0904o.a(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, i8);
        if (resourceId6 != i8) {
            drawable3 = c0904o.a(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, i8);
        if (resourceId7 != i8) {
            drawable4 = c0904o.a(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, i8);
        if (resourceId8 != i8) {
            drawable5 = c0904o.a(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, i8);
        if (resourceId9 != i8) {
            drawable6 = c0904o.a(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a7 = AbstractC0924y.a(textView);
                Drawable drawable7 = a7[0];
                if (drawable7 == null && a7[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a7[1];
                    }
                    Drawable drawable8 = a7[2];
                    if (drawable4 == null) {
                        drawable4 = a7[3];
                    }
                    AbstractC0924y.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a8 = AbstractC0924y.a(textView);
            if (drawable5 == null) {
                drawable5 = a8[0];
            }
            if (drawable2 == null) {
                drawable2 = a8[1];
            }
            if (drawable6 == null) {
                drawable6 = a8[2];
            }
            if (drawable4 == null) {
                drawable4 = a8[3];
            }
            AbstractC0924y.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = android.support.v4.media.session.b.h0(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                P.n.f(textView, colorStateList);
            } else if (textView instanceof P.s) {
                ((P.s) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode b7 = AbstractC0869T.b(obtainStyledAttributes4.getInt(12, i8), null);
            if (Build.VERSION.SDK_INT >= 24) {
                P.n.g(textView, b7);
            } else if (textView instanceof P.s) {
                ((P.s) textView).setSupportCompoundDrawablesTintMode(b7);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i8);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i8);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, i8);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i8) {
            w4.l0.O(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i8) {
            w4.l0.P(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i8) {
            android.support.v4.media.session.b.g(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void e(Context context, int i7) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC0565a.f9356s);
        g5.b bVar = new g5.b(context, 4, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f11857a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        l(context, bVar);
        if (i8 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC0844B.d(textView, string);
        }
        bVar.D();
        Typeface typeface = this.f11866l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f11864j);
        }
    }

    public final void g(int i7, int i8, int i9, int i10) {
        C0866P c0866p = this.f11863i;
        if (c0866p.j()) {
            DisplayMetrics displayMetrics = c0866p.f11926j.getResources().getDisplayMetrics();
            c0866p.k(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (c0866p.h()) {
                c0866p.a();
            }
        }
    }

    public final void h(int[] iArr, int i7) {
        C0866P c0866p = this.f11863i;
        if (c0866p.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0866p.f11926j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                c0866p.f = C0866P.b(iArr2);
                if (!c0866p.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0866p.f11923g = false;
            }
            if (c0866p.h()) {
                c0866p.a();
            }
        }
    }

    public final void i(int i7) {
        C0866P c0866p = this.f11863i;
        if (c0866p.j()) {
            if (i7 != 0) {
                if (i7 == 1) {
                    DisplayMetrics displayMetrics = c0866p.f11926j.getResources().getDisplayMetrics();
                    c0866p.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c0866p.h()) {
                        c0866p.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(AbstractC0515y1.l("Unknown auto-size text type: ", i7));
            }
            c0866p.f11919a = 0;
            c0866p.d = -1.0f;
            c0866p.f11922e = -1.0f;
            c0866p.f11921c = -1.0f;
            c0866p.f = new int[0];
            c0866p.f11920b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h6.k] */
    public final void j(ColorStateList colorStateList) {
        boolean z7;
        if (this.f11862h == null) {
            this.f11862h = new Object();
        }
        C0761k c0761k = this.f11862h;
        c0761k.f11169c = colorStateList;
        if (colorStateList != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        c0761k.f11168b = z7;
        this.f11858b = c0761k;
        this.f11859c = c0761k;
        this.d = c0761k;
        this.f11860e = c0761k;
        this.f = c0761k;
        this.f11861g = c0761k;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h6.k] */
    public final void k(PorterDuff.Mode mode) {
        boolean z7;
        if (this.f11862h == null) {
            this.f11862h = new Object();
        }
        C0761k c0761k = this.f11862h;
        c0761k.d = mode;
        if (mode != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        c0761k.f11167a = z7;
        this.f11858b = c0761k;
        this.f11859c = c0761k;
        this.d = c0761k;
        this.f11860e = c0761k;
        this.f = c0761k;
        this.f11861g = c0761k;
    }

    public final void l(Context context, g5.b bVar) {
        String string;
        Typeface create;
        boolean z7;
        boolean z8;
        Typeface typeface;
        int i7 = this.f11864j;
        TypedArray typedArray = (TypedArray) bVar.f10842s;
        this.f11864j = typedArray.getInt(2, i7);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.f11865k = i9;
            if (i9 != -1) {
                this.f11864j &= 2;
            }
        }
        int i10 = 10;
        boolean z9 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f11867m = false;
                int i11 = typedArray.getInt(1, 1);
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            typeface = Typeface.MONOSPACE;
                        } else {
                            return;
                        }
                    } else {
                        typeface = Typeface.SERIF;
                    }
                } else {
                    typeface = Typeface.SANS_SERIF;
                }
                this.f11866l = typeface;
                return;
            }
            return;
        }
        this.f11866l = null;
        if (typedArray.hasValue(12)) {
            i10 = 12;
        }
        int i12 = this.f11865k;
        int i13 = this.f11864j;
        if (!context.isRestricted()) {
            try {
                Typeface A6 = bVar.A(i10, this.f11864j, new C0922x(this, i12, i13, new WeakReference(this.f11857a)));
                if (A6 != null) {
                    if (i8 >= 28 && this.f11865k != -1) {
                        Typeface create2 = Typeface.create(A6, 0);
                        int i14 = this.f11865k;
                        if ((this.f11864j & 2) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        A6 = AbstractC0846C.a(create2, i14, z8);
                    }
                    this.f11866l = A6;
                }
                if (this.f11866l == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.f11867m = z7;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f11866l == null && (string = typedArray.getString(i10)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f11865k != -1) {
                Typeface create3 = Typeface.create(string, 0);
                int i15 = this.f11865k;
                if ((this.f11864j & 2) != 0) {
                    z9 = true;
                }
                create = AbstractC0846C.a(create3, i15, z9);
            } else {
                create = Typeface.create(string, this.f11864j);
            }
            this.f11866l = create;
        }
    }
}
