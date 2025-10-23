package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class X extends z0 {

    /* renamed from: a  reason: collision with root package name */
    public final y0 f15956a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15957b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15958c;
    public final long d;

    public X(y0 y0Var, String str, String str2, long j7) {
        this.f15956a = y0Var;
        this.f15957b = str;
        this.f15958c = str2;
        this.d = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f15956a.equals(((X) z0Var).f15956a)) {
            X x7 = (X) z0Var;
            if (this.f15957b.equals(x7.f15957b) && this.f15958c.equals(x7.f15958c) && this.d == x7.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.d;
        return ((((((this.f15956a.hashCode() ^ 1000003) * 1000003) ^ this.f15957b.hashCode()) * 1000003) ^ this.f15958c.hashCode()) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f15956a);
        sb.append(", parameterKey=");
        sb.append(this.f15957b);
        sb.append(", parameterValue=");
        sb.append(this.f15958c);
        sb.append(", templateVersion=");
        return AbstractC1111a.s(sb, this.d, "}");
    }
}
