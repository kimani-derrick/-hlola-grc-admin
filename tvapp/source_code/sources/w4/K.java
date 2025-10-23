package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class K extends n0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f15911a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15912b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15913c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f15914e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15915g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15916h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15917i;

    public K(int i7, String str, int i8, long j7, long j8, boolean z7, int i9, String str2, String str3) {
        this.f15911a = i7;
        this.f15912b = str;
        this.f15913c = i8;
        this.d = j7;
        this.f15914e = j8;
        this.f = z7;
        this.f15915g = i9;
        this.f15916h = str2;
        this.f15917i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f15911a == ((K) n0Var).f15911a) {
            K k5 = (K) n0Var;
            if (this.f15912b.equals(k5.f15912b) && this.f15913c == k5.f15913c && this.d == k5.d && this.f15914e == k5.f15914e && this.f == k5.f && this.f15915g == k5.f15915g && this.f15916h.equals(k5.f15916h) && this.f15917i.equals(k5.f15917i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j7 = this.d;
        long j8 = this.f15914e;
        int hashCode = (((((((((this.f15911a ^ 1000003) * 1000003) ^ this.f15912b.hashCode()) * 1000003) ^ this.f15913c) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        if (this.f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f15915g) * 1000003) ^ this.f15916h.hashCode()) * 1000003) ^ this.f15917i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f15911a);
        sb.append(", model=");
        sb.append(this.f15912b);
        sb.append(", cores=");
        sb.append(this.f15913c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.f15914e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.f15915g);
        sb.append(", manufacturer=");
        sb.append(this.f15916h);
        sb.append(", modelClass=");
        return AbstractC1111a.t(sb, this.f15917i, "}");
    }
}
