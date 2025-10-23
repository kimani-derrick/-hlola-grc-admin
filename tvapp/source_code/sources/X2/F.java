package X2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: A  reason: collision with root package name */
    public int f4114A;

    /* renamed from: B  reason: collision with root package name */
    public int f4115B;

    /* renamed from: C  reason: collision with root package name */
    public int f4116C;

    /* renamed from: D  reason: collision with root package name */
    public int f4117D;

    /* renamed from: E  reason: collision with root package name */
    public StaticLayout f4118E;
    public StaticLayout F;

    /* renamed from: G  reason: collision with root package name */
    public int f4119G;

    /* renamed from: H  reason: collision with root package name */
    public int f4120H;

    /* renamed from: I  reason: collision with root package name */
    public int f4121I;

    /* renamed from: J  reason: collision with root package name */
    public Rect f4122J;

    /* renamed from: a  reason: collision with root package name */
    public final float f4123a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4124b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4125c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4126e;
    public final TextPaint f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f4127g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f4128h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f4129i;

    /* renamed from: j  reason: collision with root package name */
    public Layout.Alignment f4130j;

    /* renamed from: k  reason: collision with root package name */
    public Bitmap f4131k;

    /* renamed from: l  reason: collision with root package name */
    public float f4132l;

    /* renamed from: m  reason: collision with root package name */
    public int f4133m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public float f4134o;

    /* renamed from: p  reason: collision with root package name */
    public int f4135p;

    /* renamed from: q  reason: collision with root package name */
    public float f4136q;

    /* renamed from: r  reason: collision with root package name */
    public float f4137r;

    /* renamed from: s  reason: collision with root package name */
    public int f4138s;

    /* renamed from: t  reason: collision with root package name */
    public int f4139t;

    /* renamed from: u  reason: collision with root package name */
    public int f4140u;

    /* renamed from: v  reason: collision with root package name */
    public int f4141v;

    /* renamed from: w  reason: collision with root package name */
    public int f4142w;

    /* renamed from: x  reason: collision with root package name */
    public float f4143x;

    /* renamed from: y  reason: collision with root package name */
    public float f4144y;

    /* renamed from: z  reason: collision with root package name */
    public float f4145z;

    public F(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f4126e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f4123a = round;
        this.f4124b = round;
        this.f4125c = round;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f4127g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f4128h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z7) {
        int i7;
        if (z7) {
            StaticLayout staticLayout = this.f4118E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.f4119G, this.f4120H);
                if (Color.alpha(this.f4140u) > 0) {
                    Paint paint = this.f4127g;
                    paint.setColor(this.f4140u);
                    canvas.drawRect(-this.f4121I, 0.0f, staticLayout.getWidth() + this.f4121I, staticLayout.getHeight(), paint);
                }
                int i8 = this.f4142w;
                TextPaint textPaint = this.f;
                boolean z8 = true;
                if (i8 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.f4123a);
                    textPaint.setColor(this.f4141v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f = this.f4124b;
                    if (i8 == 2) {
                        float f7 = this.f4125c;
                        textPaint.setShadowLayer(f, f7, f7, this.f4141v);
                    } else if (i8 == 3 || i8 == 4) {
                        if (i8 != 3) {
                            z8 = false;
                        }
                        int i9 = -1;
                        if (z8) {
                            i7 = -1;
                        } else {
                            i7 = this.f4141v;
                        }
                        if (z8) {
                            i9 = this.f4141v;
                        }
                        float f8 = f / 2.0f;
                        textPaint.setColor(this.f4138s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f9 = -f8;
                        textPaint.setShadowLayer(f, f9, f9, i7);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f, f8, f8, i9);
                    }
                }
                textPaint.setColor(this.f4138s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.f4122J.getClass();
        this.f4131k.getClass();
        canvas.drawBitmap(this.f4131k, (Rect) null, this.f4122J, this.f4128h);
    }
}
