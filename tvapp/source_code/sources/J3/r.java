package J3;

import android.graphics.Matrix;
import android.graphics.Path;
/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b  reason: collision with root package name */
    public float f1414b;

    /* renamed from: c  reason: collision with root package name */
    public float f1415c;

    @Override // J3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1416a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1414b, this.f1415c);
        path.transform(matrix);
    }
}
