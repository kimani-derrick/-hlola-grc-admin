package w4;
/* loaded from: classes.dex */
public final class U extends u0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15948a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15949b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15950c;
    public final boolean d;

    public U(int i7, int i8, String str, boolean z7) {
        this.f15948a = str;
        this.f15949b = i7;
        this.f15950c = i8;
        this.d = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f15948a.equals(((U) u0Var).f15948a)) {
            U u7 = (U) u0Var;
            if (this.f15949b == u7.f15949b && this.f15950c == u7.f15950c && this.d == u7.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f15948a.hashCode() ^ 1000003) * 1000003) ^ this.f15949b) * 1000003) ^ this.f15950c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f15948a + ", pid=" + this.f15949b + ", importance=" + this.f15950c + ", defaultProcess=" + this.d + "}";
    }
}
