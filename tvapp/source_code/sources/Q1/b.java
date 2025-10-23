package Q1;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2848a;

    public b(String str) {
        if (str != null) {
            this.f2848a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f2848a.equals(((b) obj).f2848a);
    }

    public final int hashCode() {
        return this.f2848a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("Encoding{name=\""), this.f2848a, "\"}");
    }
}
