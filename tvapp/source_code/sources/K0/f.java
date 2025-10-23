package K0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f1527a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1528b;

    public f(BitmapDrawable bitmapDrawable, boolean z7) {
        this.f1527a = bitmapDrawable;
        this.f1528b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (M5.g.a(this.f1527a, fVar.f1527a) && this.f1528b == fVar.f1528b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f1527a.hashCode() * 31;
        if (this.f1528b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }
}
