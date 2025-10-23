package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class W extends x0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15955a;

    public W(String str) {
        this.f15955a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            return this.f15955a.equals(((W) ((x0) obj)).f15955a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15955a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("Log{content="), this.f15955a, "}");
    }
}
