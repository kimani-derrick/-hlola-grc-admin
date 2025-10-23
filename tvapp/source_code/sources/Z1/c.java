package Z1;

import java.util.Set;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f4547a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4548b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f4549c;

    public c(long j7, long j8, Set set) {
        this.f4547a = j7;
        this.f4548b = j8;
        this.f4549c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4547a == cVar.f4547a && this.f4548b == cVar.f4548b && this.f4549c.equals(cVar.f4549c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f4547a;
        long j8 = this.f4548b;
        return ((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f4549c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4547a + ", maxAllowedDelay=" + this.f4548b + ", flags=" + this.f4549c + "}";
    }
}
