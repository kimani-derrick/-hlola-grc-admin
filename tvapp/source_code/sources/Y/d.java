package Y;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4302a;

    public d(String str) {
        this.f4302a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return M5.g.a(this.f4302a, ((d) obj).f4302a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4302a.hashCode();
    }

    public final String toString() {
        return this.f4302a;
    }
}
