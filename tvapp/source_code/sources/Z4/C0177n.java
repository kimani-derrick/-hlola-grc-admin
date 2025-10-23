package Z4;
/* renamed from: Z4.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177n {

    /* renamed from: a  reason: collision with root package name */
    public final String f4854a;

    public C0177n(String str) {
        this.f4854a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0177n) && M5.g.a(this.f4854a, ((C0177n) obj).f4854a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4854a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f4854a + ')';
    }
}
