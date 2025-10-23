package L3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes.dex */
public final class j extends J3.g {

    /* renamed from: N  reason: collision with root package name */
    public final Paint f2073N;

    /* renamed from: O  reason: collision with root package name */
    public final RectF f2074O;

    /* renamed from: P  reason: collision with root package name */
    public int f2075P;

    public j(J3.k kVar) {
        super(kVar == null ? new J3.k() : kVar);
        Paint paint = new Paint(1);
        this.f2073N = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f2074O = new RectF();
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.f2075P = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.f2074O, this.f2073N);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f2075P);
        }
    }

    public final void n(float f, float f7, float f8, float f9) {
        RectF rectF = this.f2074O;
        if (f != rectF.left || f7 != rectF.top || f8 != rectF.right || f9 != rectF.bottom) {
            rectF.set(f, f7, f8, f9);
            invalidateSelf();
        }
    }
}
