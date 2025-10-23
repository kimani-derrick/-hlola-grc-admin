package S1;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class j extends p {

    /* renamed from: a  reason: collision with root package name */
    public final List f3111a;

    public j(ArrayList arrayList) {
        this.f3111a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return this.f3111a.equals(((j) ((p) obj)).f3111a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3111a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f3111a + "}";
    }
}
