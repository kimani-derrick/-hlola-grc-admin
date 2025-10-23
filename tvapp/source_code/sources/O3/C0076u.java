package O3;

import java.io.Serializable;
import java.util.Comparator;
/* renamed from: O3.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076u extends T implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final Comparator f2709q;

    public C0076u(Comparator comparator) {
        this.f2709q = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f2709q.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0076u) {
            return this.f2709q.equals(((C0076u) obj).f2709q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2709q.hashCode();
    }

    public final String toString() {
        return this.f2709q.toString();
    }
}
