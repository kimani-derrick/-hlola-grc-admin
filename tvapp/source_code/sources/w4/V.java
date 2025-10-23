package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class V extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final Double f15951a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15952b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15953c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f15954e;
    public final long f;

    public V(Double d, int i7, boolean z7, int i8, long j7, long j8) {
        this.f15951a = d;
        this.f15952b = i7;
        this.f15953c = z7;
        this.d = i8;
        this.f15954e = j7;
        this.f = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        Double d = this.f15951a;
        if (d != null ? d.equals(((V) w0Var).f15951a) : ((V) w0Var).f15951a == null) {
            if (this.f15952b == ((V) w0Var).f15952b) {
                V v5 = (V) w0Var;
                if (this.f15953c == v5.f15953c && this.d == v5.d && this.f15954e == v5.f15954e && this.f == v5.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7;
        Double d = this.f15951a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i8 = (((hashCode ^ 1000003) * 1000003) ^ this.f15952b) * 1000003;
        if (this.f15953c) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        long j7 = this.f15954e;
        long j8 = this.f;
        return ((((((i8 ^ i7) * 1000003) ^ this.d) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f15951a);
        sb.append(", batteryVelocity=");
        sb.append(this.f15952b);
        sb.append(", proximityOn=");
        sb.append(this.f15953c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.f15954e);
        sb.append(", diskUsed=");
        return AbstractC1111a.s(sb, this.f, "}");
    }
}
