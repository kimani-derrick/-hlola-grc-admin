package H2;
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final int f940a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f941b;

    public Q(int i7, boolean z7) {
        this.f940a = i7;
        this.f941b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q.class != obj.getClass()) {
            return false;
        }
        Q q5 = (Q) obj;
        if (this.f940a == q5.f940a && this.f941b == q5.f941b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f940a * 31) + (this.f941b ? 1 : 0);
    }
}
