package G3;

import C.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import m3.g;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f755a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f756b;

    /* renamed from: c  reason: collision with root package name */
    public final String f757c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f758e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float f759g;

    /* renamed from: h  reason: collision with root package name */
    public final float f760h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f761i;

    /* renamed from: j  reason: collision with root package name */
    public final float f762j;

    /* renamed from: k  reason: collision with root package name */
    public float f763k;

    /* renamed from: l  reason: collision with root package name */
    public final int f764l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f765m = false;
    public Typeface n;

    public d(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC1272a.f14966v);
        this.f763k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f755a = g.p(context, obtainStyledAttributes, 3);
        g.p(context, obtainStyledAttributes, 4);
        g.p(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.f758e = obtainStyledAttributes.getInt(1, 1);
        int i8 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f764l = obtainStyledAttributes.getResourceId(i8, 0);
        this.f757c = obtainStyledAttributes.getString(i8);
        obtainStyledAttributes.getBoolean(14, false);
        this.f756b = g.p(context, obtainStyledAttributes, 6);
        this.f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f759g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f760h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i7, AbstractC1272a.f14959o);
        this.f761i = obtainStyledAttributes2.hasValue(0);
        this.f762j = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        Typeface typeface;
        String str;
        Typeface typeface2 = this.n;
        int i7 = this.d;
        if (typeface2 == null && (str = this.f757c) != null) {
            this.n = Typeface.create(str, i7);
        }
        if (this.n == null) {
            int i8 = this.f758e;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        typeface = Typeface.DEFAULT;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            this.n = typeface;
            this.n = Typeface.create(this.n, i7);
        }
    }

    public final Typeface b(Context context) {
        Typeface b7;
        if (this.f765m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                int i7 = this.f764l;
                ThreadLocal threadLocal = o.f343a;
                if (context.isRestricted()) {
                    b7 = null;
                } else {
                    b7 = o.b(context, i7, new TypedValue(), 0, null, false, false);
                }
                this.n = b7;
                if (b7 != null) {
                    this.n = Typeface.create(b7, this.d);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e3) {
                Log.d("TextAppearance", "Error loading font " + this.f757c, e3);
            }
        }
        a();
        this.f765m = true;
        return this.n;
    }

    public final void c(Context context, p6.d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i7 = this.f764l;
        if (i7 == 0) {
            this.f765m = true;
        }
        if (this.f765m) {
            dVar.w(this.n, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = o.f343a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                o.b(context, i7, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f765m = true;
            dVar.v(1);
        } catch (Exception e3) {
            Log.d("TextAppearance", "Error loading font " + this.f757c, e3);
            this.f765m = true;
            dVar.v(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i7 = this.f764l;
        if (i7 != 0) {
            ThreadLocal threadLocal = o.f343a;
            if (!context.isRestricted()) {
                typeface = o.b(context, i7, new TypedValue(), 0, null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void e(Context context, TextPaint textPaint, p6.d dVar) {
        int i7;
        int i8;
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f755a;
        if (colorStateList != null) {
            i7 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i7 = -16777216;
        }
        textPaint.setColor(i7);
        ColorStateList colorStateList2 = this.f756b;
        if (colorStateList2 != null) {
            i8 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i8 = 0;
        }
        textPaint.setShadowLayer(this.f760h, this.f, this.f759g, i8);
    }

    public final void f(Context context, TextPaint textPaint, p6.d dVar) {
        if (d(context)) {
            g(textPaint, b(context));
            return;
        }
        a();
        g(textPaint, this.n);
        c(context, new c(this, textPaint, dVar));
    }

    public final void g(TextPaint textPaint, Typeface typeface) {
        boolean z7;
        float f;
        textPaint.setTypeface(typeface);
        int i7 = (~typeface.getStyle()) & this.d;
        if ((i7 & 1) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        textPaint.setFakeBoldText(z7);
        if ((i7 & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f763k);
        if (this.f761i) {
            textPaint.setLetterSpacing(this.f762j);
        }
    }
}
