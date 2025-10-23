package n1;

import com.boxhdo.domain.model.LatestVersion;
/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public final LatestVersion f12633a;

    public g(LatestVersion latestVersion) {
        this.f12633a = latestVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && M5.g.a(this.f12633a, ((g) obj).f12633a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12633a.hashCode();
    }

    public final String toString() {
        return "Update(latestVersion=" + this.f12633a + ")";
    }
}
