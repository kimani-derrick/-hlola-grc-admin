package T0;
/* loaded from: classes.dex */
public final class a extends h4.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f3200a;

    public a(int i7) {
        this.f3200a = i7;
        if (i7 > 0) {
            return;
        }
        throw new IllegalArgumentException("px must be > 0.".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.f3200a == ((a) obj).f3200a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3200a;
    }

    public final String toString() {
        return String.valueOf(this.f3200a);
    }
}
