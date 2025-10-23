package A1;

import java.util.List;
/* loaded from: classes.dex */
public final class o extends q {

    /* renamed from: a  reason: collision with root package name */
    public final List f46a;

    public o(List list) {
        M5.g.f(list, "data");
        this.f46a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && M5.g.a(this.f46a, ((o) obj).f46a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46a.hashCode();
    }

    public final String toString() {
        return "TvFirstLoad(data=" + this.f46a + ")";
    }
}
