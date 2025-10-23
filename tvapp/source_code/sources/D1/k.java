package D1;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: a  reason: collision with root package name */
    public final String f495a;

    public k(String str) {
        M5.g.f(str, "lang");
        this.f495a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && M5.g.a(this.f495a, ((k) obj).f495a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f495a.hashCode();
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("GetDefaultSubtitle(lang="), this.f495a, ")");
    }
}
