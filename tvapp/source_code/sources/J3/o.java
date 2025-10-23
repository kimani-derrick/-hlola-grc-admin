package J3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* loaded from: classes.dex */
public final class o extends t {

    /* renamed from: b  reason: collision with root package name */
    public final q f1406b;

    public o(q qVar) {
        this.f1406b = qVar;
    }

    @Override // J3.t
    public final void a(Matrix matrix, I3.a aVar, int i7, Canvas canvas) {
        boolean z7;
        q qVar = this.f1406b;
        float f = qVar.f;
        float f7 = qVar.f1413g;
        RectF rectF = new RectF(qVar.f1410b, qVar.f1411c, qVar.d, qVar.f1412e);
        aVar.getClass();
        if (f7 < 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        Path path = aVar.f1251g;
        int[] iArr = I3.a.f1245k;
        if (z7) {
            iArr[0] = 0;
            iArr[1] = aVar.f;
            iArr[2] = aVar.f1250e;
            iArr[3] = aVar.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f7);
            path.close();
            float f8 = -i7;
            rectF.inset(f8, f8);
            iArr[0] = 0;
            iArr[1] = aVar.d;
            iArr[2] = aVar.f1250e;
            iArr[3] = aVar.f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f9 = 1.0f - (i7 / width);
            float[] fArr = I3.a.f1246l;
            fArr[1] = f9;
            fArr[2] = ((1.0f - f9) / 2.0f) + f9;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar.f1248b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z7) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f1252h);
            }
            canvas.drawArc(rectF, f, f7, true, paint);
            canvas.restore();
        }
    }
}
