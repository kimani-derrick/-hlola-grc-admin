package w4;

import java.util.List;
/* loaded from: classes.dex */
public final class Z extends A0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f15961a;

    public Z(List list) {
        this.f15961a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            return this.f15961a.equals(((Z) ((A0) obj)).f15961a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15961a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f15961a + "}";
    }
}
