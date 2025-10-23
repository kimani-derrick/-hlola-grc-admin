package q1;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: a  reason: collision with root package name */
    public final String f13252a;

    public k(String str) {
        M5.g.f(str, "value");
        this.f13252a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && M5.g.a(this.f13252a, ((k) obj).f13252a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13252a.hashCode();
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("TVText(value="), this.f13252a, ")");
    }
}
