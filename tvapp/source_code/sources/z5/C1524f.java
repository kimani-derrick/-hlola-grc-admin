package z5;

import java.io.Serializable;
/* renamed from: z5.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1524f implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final Object f16468q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f16469r;

    public C1524f(Object obj, Object obj2) {
        this.f16468q = obj;
        this.f16469r = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1524f)) {
            return false;
        }
        C1524f c1524f = (C1524f) obj;
        if (M5.g.a(this.f16468q, c1524f.f16468q) && M5.g.a(this.f16469r, c1524f.f16469r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f16468q;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        Object obj2 = this.f16469r;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        return "(" + this.f16468q + ", " + this.f16469r + ')';
    }
}
