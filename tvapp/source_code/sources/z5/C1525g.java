package z5;

import java.io.Serializable;
/* renamed from: z5.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525g implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final Throwable f16470q;

    public C1525g(Throwable th) {
        M5.g.f(th, "exception");
        this.f16470q = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1525g) {
            if (M5.g.a(this.f16470q, ((C1525g) obj).f16470q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16470q.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f16470q + ')';
    }
}
