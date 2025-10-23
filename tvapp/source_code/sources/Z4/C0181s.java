package Z4;
/* renamed from: Z4.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181s {

    /* renamed from: a  reason: collision with root package name */
    public final String f4865a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4866b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4867c;
    public final boolean d;

    public C0181s(int i7, int i8, String str, boolean z7) {
        this.f4865a = str;
        this.f4866b = i7;
        this.f4867c = i8;
        this.d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0181s)) {
            return false;
        }
        C0181s c0181s = (C0181s) obj;
        if (M5.g.a(this.f4865a, c0181s.f4865a) && this.f4866b == c0181s.f4866b && this.f4867c == c0181s.f4867c && this.d == c0181s.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((this.f4865a.hashCode() * 31) + this.f4866b) * 31) + this.f4867c) * 31;
        boolean z7 = this.d;
        int i7 = z7;
        if (z7 != 0) {
            i7 = 1;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f4865a + ", pid=" + this.f4866b + ", importance=" + this.f4867c + ", isDefaultProcess=" + this.d + ')';
    }
}
