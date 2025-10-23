package Q0;

import android.graphics.Bitmap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f2834a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f2835b;

    public c(Bitmap bitmap, Map map) {
        this.f2834a = bitmap;
        this.f2835b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (M5.g.a(this.f2834a, cVar.f2834a) && M5.g.a(this.f2835b, cVar.f2835b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2835b.hashCode() + (this.f2834a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f2834a + ", extras=" + this.f2835b + ')';
    }
}
