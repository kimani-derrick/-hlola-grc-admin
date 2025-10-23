package J3;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f1327a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1328b;

    public b(float f, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1327a;
            f += ((b) cVar).f1328b;
        }
        this.f1327a = cVar;
        this.f1328b = f;
    }

    @Override // J3.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f1327a.a(rectF) + this.f1328b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1327a.equals(bVar.f1327a) && this.f1328b == bVar.f1328b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1327a, Float.valueOf(this.f1328b)});
    }
}
