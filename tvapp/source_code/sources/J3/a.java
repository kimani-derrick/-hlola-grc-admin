package J3;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f1326a;

    public a(float f) {
        this.f1326a = f;
    }

    @Override // J3.c
    public final float a(RectF rectF) {
        return this.f1326a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f1326a == ((a) obj).f1326a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1326a)});
    }
}
