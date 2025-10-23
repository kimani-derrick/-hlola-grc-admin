package U1;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3408a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3409b;

    public a(long j7, int i7) {
        if (i7 != 0) {
            this.f3408a = i7;
            this.f3409b = j7;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (s.h.a(this.f3408a, aVar.f3408a) && this.f3409b == aVar.f3409b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f3409b;
        return ((s.h.b(this.f3408a) ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(AbstractC1111a.F(this.f3408a));
        sb.append(", nextRequestWaitMillis=");
        return AbstractC1111a.s(sb, this.f3409b, "}");
    }
}
