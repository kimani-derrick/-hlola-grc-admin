package u4;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final String f15071a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15072b;

    public z(String str, String str2) {
        this.f15071a = str;
        this.f15072b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (M5.g.a(this.f15071a, zVar.f15071a) && M5.g.a(this.f15072b, zVar.f15072b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        String str = this.f15071a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = hashCode * 31;
        String str2 = this.f15072b;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.f15071a + ", authToken=" + this.f15072b + ')';
    }
}
