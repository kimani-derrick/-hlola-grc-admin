package J3;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f1372a;

    public h(float f) {
        this.f1372a = f;
    }

    @Override // J3.c
    public final float a(RectF rectF) {
        return rectF.height() * this.f1372a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f1372a == ((h) obj).f1372a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1372a)});
    }
}
