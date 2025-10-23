package Y4;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Set f4498a;

    public d(HashSet hashSet) {
        this.f4498a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f4498a.equals(((d) obj).f4498a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4498a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f4498a + "}";
    }
}
