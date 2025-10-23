package S0;

import A5.u;
import java.util.Map;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static final p f3062b = new p(u.f136q);

    /* renamed from: a  reason: collision with root package name */
    public final Map f3063a;

    public p(Map map) {
        this.f3063a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            if (M5.g.a(this.f3063a, ((p) obj).f3063a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3063a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f3063a + ')';
    }
}
