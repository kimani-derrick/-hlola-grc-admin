package w4;
/* renamed from: w4.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1412d0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15994a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15995b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15996c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15997e;
    public final androidx.fragment.app.D f;

    public C1412d0(String str, String str2, String str3, String str4, int i7, androidx.fragment.app.D d) {
        if (str != null) {
            this.f15994a = str;
            if (str2 != null) {
                this.f15995b = str2;
                if (str3 != null) {
                    this.f15996c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f15997e = i7;
                        if (d != null) {
                            this.f = d;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1412d0)) {
            return false;
        }
        C1412d0 c1412d0 = (C1412d0) obj;
        if (this.f15994a.equals(c1412d0.f15994a) && this.f15995b.equals(c1412d0.f15995b) && this.f15996c.equals(c1412d0.f15996c) && this.d.equals(c1412d0.d) && this.f15997e == c1412d0.f15997e && this.f.equals(c1412d0.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f15994a.hashCode() ^ 1000003) * 1000003) ^ this.f15995b.hashCode()) * 1000003) ^ this.f15996c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f15997e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f15994a + ", versionCode=" + this.f15995b + ", versionName=" + this.f15996c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f15997e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
