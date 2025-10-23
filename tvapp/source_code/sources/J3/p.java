package J3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: b  reason: collision with root package name */
    public final r f1407b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1408c;
    public final float d;

    public p(r rVar, float f, float f7) {
        this.f1407b = rVar;
        this.f1408c = f;
        this.d = f7;
    }

    @Override // J3.t
    public final void a(Matrix matrix, I3.a aVar, int i7, Canvas canvas) {
        r rVar = this.f1407b;
        float f = rVar.f1415c;
        float f7 = this.d;
        float f8 = rVar.f1414b;
        float f9 = this.f1408c;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f7, f8 - f9), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f9, f7);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i7;
        rectF.offset(0.0f, -i7);
        int[] iArr = I3.a.f1243i;
        iArr[0] = aVar.f;
        iArr[1] = aVar.f1250e;
        iArr[2] = aVar.d;
        Paint paint = aVar.f1249c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, I3.a.f1244j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f1407b;
        return (float) Math.toDegrees(Math.atan((rVar.f1415c - this.d) / (rVar.f1414b - this.f1408c)));
    }
}
