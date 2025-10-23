package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class O extends o0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f15931a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15932b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15933c;
    public final String d;

    public O(long j7, long j8, String str, String str2) {
        this.f15931a = j7;
        this.f15932b = j8;
        this.f15933c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f15931a == ((O) o0Var).f15931a) {
            O o7 = (O) o0Var;
            if (this.f15932b == o7.f15932b && this.f15933c.equals(o7.f15933c)) {
                String str = o7.d;
                String str2 = this.d;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f15931a;
        long j8 = this.f15932b;
        int hashCode2 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f15933c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f15931a);
        sb.append(", size=");
        sb.append(this.f15932b);
        sb.append(", name=");
        sb.append(this.f15933c);
        sb.append(", uuid=");
        return AbstractC1111a.t(sb, this.d, "}");
    }
}
