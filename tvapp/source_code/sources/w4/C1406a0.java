package w4;
/* renamed from: w4.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1406a0 extends C0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f15965a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15966b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15967c;
    public final boolean d;

    public C1406a0(int i7, String str, String str2, boolean z7) {
        this.f15965a = i7;
        this.f15966b = str;
        this.f15967c = str2;
        this.d = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (this.f15965a == ((C1406a0) c02).f15965a) {
            C1406a0 c1406a0 = (C1406a0) c02;
            if (this.f15966b.equals(c1406a0.f15966b) && this.f15967c.equals(c1406a0.f15967c) && this.d == c1406a0.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f15965a ^ 1000003) * 1000003) ^ this.f15966b.hashCode()) * 1000003) ^ this.f15967c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f15965a + ", version=" + this.f15966b + ", buildVersion=" + this.f15967c + ", jailbroken=" + this.d + "}";
    }
}
