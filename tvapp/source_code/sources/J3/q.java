package J3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: h  reason: collision with root package name */
    public static final RectF f1409h = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final float f1410b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1411c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f1412e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f1413g;

    public q(float f, float f7, float f8, float f9) {
        this.f1410b = f;
        this.f1411c = f7;
        this.d = f8;
        this.f1412e = f9;
    }

    @Override // J3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1416a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f1409h;
        rectF.set(this.f1410b, this.f1411c, this.d, this.f1412e);
        path.arcTo(rectF, this.f, this.f1413g, false);
        path.transform(matrix);
    }
}
