package B1;

import com.boxhdo.domain.model.trakt.TraktProfile;
/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: a  reason: collision with root package name */
    public final TraktProfile f168a;

    public i(TraktProfile traktProfile) {
        M5.g.f(traktProfile, "traktProfile");
        this.f168a = traktProfile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && M5.g.a(this.f168a, ((i) obj).f168a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f168a.hashCode();
    }

    public final String toString() {
        return "GetTraktProfile(traktProfile=" + this.f168a + ")";
    }
}
