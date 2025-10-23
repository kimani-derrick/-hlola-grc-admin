package L4;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f2129a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2130b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f2129a = str;
            this.f2130b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2129a.equals(aVar.f2129a) && this.f2130b.equals(aVar.f2130b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2129a.hashCode() ^ 1000003) * 1000003) ^ this.f2130b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f2129a + ", usedDates=" + this.f2130b + "}";
    }
}
