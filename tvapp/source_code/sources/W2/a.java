package W2;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f3766a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3767b;

    public a(long j7, long j8) {
        this.f3766a = j7;
        this.f3767b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3766a == aVar.f3766a && this.f3767b == aVar.f3767b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3766a) * 31) + ((int) this.f3767b);
    }
}
