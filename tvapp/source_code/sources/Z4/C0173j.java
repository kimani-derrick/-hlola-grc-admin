package Z4;
/* renamed from: Z4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173j {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC0172i f4842a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC0172i f4843b;

    /* renamed from: c  reason: collision with root package name */
    public final double f4844c;

    public C0173j(EnumC0172i enumC0172i, EnumC0172i enumC0172i2, double d) {
        this.f4842a = enumC0172i;
        this.f4843b = enumC0172i2;
        this.f4844c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0173j)) {
            return false;
        }
        C0173j c0173j = (C0173j) obj;
        if (this.f4842a == c0173j.f4842a && this.f4843b == c0173j.f4843b && Double.compare(this.f4844c, c0173j.f4844c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4843b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f4844c);
        return ((hashCode + (this.f4842a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f4842a + ", crashlytics=" + this.f4843b + ", sessionSamplingRate=" + this.f4844c + ')';
    }
}
