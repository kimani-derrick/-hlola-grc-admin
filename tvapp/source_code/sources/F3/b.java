package F3;

import K.O;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e0.C0566a;
import java.lang.reflect.Field;
import v3.AbstractC1322a;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: A  reason: collision with root package name */
    public float f661A;

    /* renamed from: B  reason: collision with root package name */
    public float f662B;

    /* renamed from: C  reason: collision with root package name */
    public int[] f663C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f664D;

    /* renamed from: E  reason: collision with root package name */
    public final TextPaint f665E;
    public final TextPaint F;

    /* renamed from: G  reason: collision with root package name */
    public TimeInterpolator f666G;

    /* renamed from: H  reason: collision with root package name */
    public TimeInterpolator f667H;

    /* renamed from: I  reason: collision with root package name */
    public float f668I;

    /* renamed from: J  reason: collision with root package name */
    public float f669J;

    /* renamed from: K  reason: collision with root package name */
    public float f670K;

    /* renamed from: L  reason: collision with root package name */
    public ColorStateList f671L;

    /* renamed from: M  reason: collision with root package name */
    public float f672M;

    /* renamed from: N  reason: collision with root package name */
    public StaticLayout f673N;

    /* renamed from: O  reason: collision with root package name */
    public CharSequence f674O;

    /* renamed from: a  reason: collision with root package name */
    public final View f675a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f676b;

    /* renamed from: c  reason: collision with root package name */
    public float f677c;
    public final Rect d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f678e;
    public final RectF f;

    /* renamed from: g  reason: collision with root package name */
    public int f679g = 16;

    /* renamed from: h  reason: collision with root package name */
    public int f680h = 16;

    /* renamed from: i  reason: collision with root package name */
    public float f681i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f682j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f683k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f684l;

    /* renamed from: m  reason: collision with root package name */
    public float f685m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public float f686o;

    /* renamed from: p  reason: collision with root package name */
    public float f687p;

    /* renamed from: q  reason: collision with root package name */
    public float f688q;

    /* renamed from: r  reason: collision with root package name */
    public float f689r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f690s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f691t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f692u;

    /* renamed from: v  reason: collision with root package name */
    public G3.a f693v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f694w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f695x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f696y;

    /* renamed from: z  reason: collision with root package name */
    public Bitmap f697z;

    public b(View view) {
        this.f675a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f665E = textPaint;
        this.F = new TextPaint(textPaint);
        this.f678e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    public static int a(float f, int i7, int i8) {
        float f7 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i8) * f) + (Color.alpha(i7) * f7)), (int) ((Color.red(i8) * f) + (Color.red(i7) * f7)), (int) ((Color.green(i8) * f) + (Color.green(i7) * f7)), (int) ((Color.blue(i8) * f) + (Color.blue(i7) * f7)));
    }

    public static float e(float f, float f7, float f8, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f8 = timeInterpolator.getInterpolation(f8);
        }
        LinearInterpolator linearInterpolator = AbstractC1322a.f15312a;
        return AbstractC0515y1.g(f7, f, f8, f);
    }

    public final float b() {
        if (this.f694w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.f682j);
        textPaint.setTypeface(this.f690s);
        textPaint.setLetterSpacing(this.f672M);
        CharSequence charSequence = this.f694w;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void c(float f) {
        boolean z7;
        boolean z8;
        float f7;
        boolean z9;
        boolean z10;
        I.h hVar;
        if (this.f694w == null) {
            return;
        }
        float width = this.f678e.width();
        float width2 = this.d.width();
        if (Math.abs(f - this.f682j) < 0.001f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            f7 = this.f682j;
            this.f661A = 1.0f;
            Typeface typeface = this.f692u;
            Typeface typeface2 = this.f690s;
            if (typeface != typeface2) {
                this.f692u = typeface2;
                z9 = true;
            } else {
                z9 = false;
            }
        } else {
            float f8 = this.f681i;
            Typeface typeface3 = this.f692u;
            Typeface typeface4 = this.f691t;
            if (typeface3 != typeface4) {
                this.f692u = typeface4;
                z8 = true;
            } else {
                z8 = false;
            }
            if (Math.abs(f - f8) < 0.001f) {
                this.f661A = 1.0f;
            } else {
                this.f661A = f / this.f681i;
            }
            float f9 = this.f682j / this.f681i;
            if (width2 * f9 > width) {
                width = Math.min(width / f9, width2);
            } else {
                width = width2;
            }
            f7 = f8;
            z9 = z8;
        }
        if (width > 0.0f) {
            if (this.f662B == f7 && !this.f664D && !z9) {
                z9 = false;
            } else {
                z9 = true;
            }
            this.f662B = f7;
            this.f664D = false;
        }
        if (this.f695x == null || z9) {
            TextPaint textPaint = this.f665E;
            textPaint.setTextSize(this.f662B);
            textPaint.setTypeface(this.f692u);
            if (this.f661A != 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setLinearText(z10);
            CharSequence charSequence = this.f694w;
            Field field = O.f1447a;
            if (this.f675a.getLayoutDirection() == 1) {
                hVar = I.i.d;
            } else {
                hVar = I.i.f1204c;
            }
            boolean e3 = hVar.e(charSequence.length(), charSequence);
            this.f696y = e3;
            g gVar = new g(this.f694w, textPaint, (int) width);
            gVar.f718l = TextUtils.TruncateAt.END;
            gVar.f717k = e3;
            gVar.f712e = Layout.Alignment.ALIGN_NORMAL;
            gVar.f716j = false;
            gVar.f = 1;
            gVar.f713g = 0.0f;
            gVar.f714h = 1.0f;
            gVar.f715i = 1;
            StaticLayout a7 = gVar.a();
            a7.getClass();
            this.f673N = a7;
            this.f695x = a7.getText();
        }
    }

    public final int d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f663C;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void f() {
        boolean z7;
        Rect rect = this.f678e;
        if (rect.width() > 0 && rect.height() > 0) {
            Rect rect2 = this.d;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z7 = true;
                this.f676b = z7;
            }
        }
        z7 = false;
        this.f676b = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.b.g():void");
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f684l != colorStateList) {
            this.f684l = colorStateList;
            g();
        }
    }

    public final void i(float f) {
        int d;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f677c) {
            this.f677c = f;
            RectF rectF = this.f;
            Rect rect = this.d;
            Rect rect2 = this.f678e;
            rectF.left = e(rect.left, rect2.left, f, this.f666G);
            rectF.top = e(this.f685m, this.n, f, this.f666G);
            rectF.right = e(rect.right, rect2.right, f, this.f666G);
            rectF.bottom = e(rect.bottom, rect2.bottom, f, this.f666G);
            this.f688q = e(this.f686o, this.f687p, f, this.f666G);
            this.f689r = e(this.f685m, this.n, f, this.f666G);
            j(e(this.f681i, this.f682j, f, this.f667H));
            C0566a c0566a = AbstractC1322a.f15313b;
            e(0.0f, 1.0f, 1.0f - f, c0566a);
            Field field = O.f1447a;
            View view = this.f675a;
            view.postInvalidateOnAnimation();
            e(1.0f, 0.0f, f, c0566a);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f684l;
            ColorStateList colorStateList2 = this.f683k;
            TextPaint textPaint = this.f665E;
            if (colorStateList != colorStateList2) {
                d = a(f, d(colorStateList2), d(this.f684l));
            } else {
                d = d(colorStateList);
            }
            textPaint.setColor(d);
            float f7 = this.f672M;
            if (f7 != 0.0f) {
                f7 = e(0.0f, f7, f, c0566a);
            }
            textPaint.setLetterSpacing(f7);
            textPaint.setShadowLayer(e(0.0f, this.f668I, f, null), e(0.0f, this.f669J, f, null), e(0.0f, this.f670K, f, null), a(f, d(null), d(this.f671L)));
            view.postInvalidateOnAnimation();
        }
    }

    public final void j(float f) {
        c(f);
        Field field = O.f1447a;
        this.f675a.postInvalidateOnAnimation();
    }
}
