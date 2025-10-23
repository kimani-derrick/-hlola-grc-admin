package P1;

import L3.k;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final k f2783a = new k(2, this);

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2784b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2785c;
    public final Matrix d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f2786e;
    public d f;

    public e() {
        Paint paint = new Paint();
        this.f2784b = paint;
        this.f2785c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        d dVar;
        ValueAnimator valueAnimator = this.f2786e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (dVar = this.f) != null && dVar.f2777o && getCallback() != null) {
            this.f2786e.start();
        }
    }

    public final void b() {
        d dVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (dVar = this.f) != null) {
            int i7 = dVar.f2770g;
            if (i7 <= 0) {
                i7 = Math.round(dVar.f2772i * width);
            }
            d dVar2 = this.f;
            int i8 = dVar2.f2771h;
            if (i8 <= 0) {
                i8 = Math.round(dVar2.f2773j * height);
            }
            d dVar3 = this.f;
            boolean z7 = true;
            if (dVar3.f != 1) {
                int i9 = dVar3.f2768c;
                if (i9 != 1 && i9 != 3) {
                    z7 = false;
                }
                if (z7) {
                    i7 = 0;
                }
                if (!z7) {
                    i8 = 0;
                }
                d dVar4 = this.f;
                radialGradient = new LinearGradient(0.0f, 0.0f, i7, i8, dVar4.f2767b, dVar4.f2766a, Shader.TileMode.CLAMP);
            } else {
                d dVar5 = this.f;
                radialGradient = new RadialGradient(i7 / 2.0f, i8 / 2.0f, (float) (Math.max(i7, i8) / Math.sqrt(2.0d)), dVar5.f2767b, dVar5.f2766a, Shader.TileMode.CLAMP);
            }
            this.f2784b.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float g7;
        float g8;
        if (this.f != null) {
            Paint paint = this.f2784b;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(this.f.f2776m));
                Rect rect = this.f2785c;
                float width = (rect.width() * tan) + rect.height();
                float height = (tan * rect.height()) + rect.width();
                ValueAnimator valueAnimator = this.f2786e;
                float f7 = 0.0f;
                if (valueAnimator != null) {
                    f = valueAnimator.getAnimatedFraction();
                } else {
                    f = 0.0f;
                }
                int i7 = this.f.f2768c;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            float f8 = -height;
                            g8 = AbstractC0515y1.g(height, f8, f, f8);
                        } else {
                            g7 = AbstractC0515y1.g(-width, width, f, width);
                        }
                    } else {
                        g8 = AbstractC0515y1.g(-height, height, f, height);
                    }
                    f7 = g8;
                    g7 = 0.0f;
                } else {
                    float f9 = -width;
                    g7 = AbstractC0515y1.g(width, f9, f, f9);
                }
                Matrix matrix = this.d;
                matrix.reset();
                matrix.setRotate(this.f.f2776m, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f7, g7);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        d dVar = this.f;
        if (dVar != null && (dVar.n || dVar.f2778p)) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2785c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
