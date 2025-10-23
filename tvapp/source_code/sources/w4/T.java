package w4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class T extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f15944a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15945b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15946c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15947e;

    public T(long j7, String str, String str2, long j8, int i7) {
        this.f15944a = j7;
        this.f15945b = str;
        this.f15946c = str2;
        this.d = j8;
        this.f15947e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f15944a == ((T) r0Var).f15944a) {
            T t5 = (T) r0Var;
            if (this.f15945b.equals(t5.f15945b)) {
                String str = t5.f15946c;
                String str2 = this.f15946c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == t5.d && this.f15947e == t5.f15947e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f15944a;
        int hashCode2 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f15945b.hashCode()) * 1000003;
        String str = this.f15946c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j8 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f15947e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f15944a);
        sb.append(", symbol=");
        sb.append(this.f15945b);
        sb.append(", file=");
        sb.append(this.f15946c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return AbstractC0515y1.n(sb, this.f15947e, "}");
    }
}
