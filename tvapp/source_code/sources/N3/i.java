package N3;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final List f2499q;

    public i(List list) {
        this.f2499q = list;
    }

    @Override // N3.h
    public final boolean apply(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.f2499q;
            if (i7 < list.size()) {
                if (!((h) list.get(i7)).apply(obj)) {
                    return false;
                }
                i7++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f2499q.equals(((i) obj).f2499q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2499q.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z7 = true;
        for (Object obj : this.f2499q) {
            if (!z7) {
                sb.append(',');
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
