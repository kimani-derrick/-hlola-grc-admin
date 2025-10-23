package v1;
/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15273a;

    public p(boolean z7) {
        this.f15273a = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && this.f15273a == ((p) obj).f15273a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z7 = this.f15273a;
        if (z7) {
            return 1;
        }
        return z7 ? 1 : 0;
    }

    public final String toString() {
        return "Success(isContinueWatch=" + this.f15273a + ")";
    }
}
