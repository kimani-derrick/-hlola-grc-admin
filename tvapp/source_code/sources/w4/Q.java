package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class Q extends q0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15938a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15939b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15940c;

    public Q(long j7, String str, String str2) {
        this.f15938a = str;
        this.f15939b = str2;
        this.f15940c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f15938a.equals(((Q) q0Var).f15938a)) {
            Q q5 = (Q) q0Var;
            if (this.f15939b.equals(q5.f15939b) && this.f15940c == q5.f15940c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f15940c;
        return ((((this.f15938a.hashCode() ^ 1000003) * 1000003) ^ this.f15939b.hashCode()) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f15938a);
        sb.append(", code=");
        sb.append(this.f15939b);
        sb.append(", address=");
        return AbstractC1111a.s(sb, this.f15940c, "}");
    }
}
