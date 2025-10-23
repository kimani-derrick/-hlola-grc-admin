package w4;
/* renamed from: w4.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416f0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16011a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16012b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16013c;

    public C1416f0(String str, String str2, boolean z7) {
        if (str != null) {
            this.f16011a = str;
            if (str2 != null) {
                this.f16012b = str2;
                this.f16013c = z7;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1416f0)) {
            return false;
        }
        C1416f0 c1416f0 = (C1416f0) obj;
        if (this.f16011a.equals(c1416f0.f16011a) && this.f16012b.equals(c1416f0.f16012b) && this.f16013c == c1416f0.f16013c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((this.f16011a.hashCode() ^ 1000003) * 1000003) ^ this.f16012b.hashCode()) * 1000003;
        if (this.f16013c) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f16011a + ", osCodeName=" + this.f16012b + ", isRooted=" + this.f16013c + "}";
    }
}
