package J3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f1404b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f1405c;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f1404b = arrayList;
        this.f1405c = matrix;
    }

    @Override // J3.t
    public final void a(Matrix matrix, I3.a aVar, int i7, Canvas canvas) {
        for (t tVar : this.f1404b) {
            tVar.a(this.f1405c, aVar, i7, canvas);
        }
    }
}
