package z5;

import java.io.Serializable;
/* renamed from: z5.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1526h implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final Object f16471q;

    public static final Throwable a(Object obj) {
        if (obj instanceof C1525g) {
            return ((C1525g) obj).f16470q;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1526h)) {
            return false;
        }
        if (!M5.g.a(this.f16471q, ((C1526h) obj).f16471q)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f16471q;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f16471q;
        if (obj instanceof C1525g) {
            return ((C1525g) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
