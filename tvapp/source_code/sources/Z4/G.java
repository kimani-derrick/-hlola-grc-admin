package Z4;
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final O f4756a;

    /* renamed from: b  reason: collision with root package name */
    public final C0165b f4757b;

    public G(O o7, C0165b c0165b) {
        this.f4756a = o7;
        this.f4757b = c0165b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g7 = (G) obj;
        g7.getClass();
        if (M5.g.a(this.f4756a, g7.f4756a) && M5.g.a(this.f4757b, g7.f4757b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4756a.hashCode();
        return this.f4757b.hashCode() + ((hashCode + (EnumC0174k.f4845r.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC0174k.f4845r + ", sessionData=" + this.f4756a + ", applicationInfo=" + this.f4757b + ')';
    }
}
