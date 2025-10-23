package U4;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Set f3442a;

    public a(HashSet hashSet) {
        this.f3442a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return this.f3442a.equals(((a) obj).f3442a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3442a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f3442a + "}";
    }
}
