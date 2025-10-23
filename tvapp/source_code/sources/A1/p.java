package A1;

import java.util.List;
/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: a  reason: collision with root package name */
    public final List f47a;

    public p(List list) {
        M5.g.f(list, "data");
        this.f47a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && M5.g.a(this.f47a, ((p) obj).f47a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47a.hashCode();
    }

    public final String toString() {
        return "TvLoadMore(data=" + this.f47a + ")";
    }
}
