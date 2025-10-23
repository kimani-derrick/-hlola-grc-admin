package u1;

import com.boxhdo.domain.model.trakt.TraktDevice;
/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: a  reason: collision with root package name */
    public final TraktDevice f14689a;

    public i(TraktDevice traktDevice) {
        M5.g.f(traktDevice, "traktDevice");
        this.f14689a = traktDevice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && M5.g.a(this.f14689a, ((i) obj).f14689a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14689a.hashCode();
    }

    public final String toString() {
        return "GenerateCode(traktDevice=" + this.f14689a + ")";
    }
}
