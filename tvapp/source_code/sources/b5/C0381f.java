package b5;
/* renamed from: b5.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381f {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f7148a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f7149b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7150c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f7151e;

    public C0381f(Boolean bool, Double d, Integer num, Integer num2, Long l7) {
        this.f7148a = bool;
        this.f7149b = d;
        this.f7150c = num;
        this.d = num2;
        this.f7151e = l7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0381f)) {
            return false;
        }
        C0381f c0381f = (C0381f) obj;
        if (M5.g.a(this.f7148a, c0381f.f7148a) && M5.g.a(this.f7149b, c0381f.f7149b) && M5.g.a(this.f7150c, c0381f.f7150c) && M5.g.a(this.d, c0381f.d) && M5.g.a(this.f7151e, c0381f.f7151e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i7 = 0;
        Boolean bool = this.f7148a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i8 = hashCode * 31;
        Double d = this.f7149b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Integer num = this.f7150c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Integer num2 = this.d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Long l7 = this.f7151e;
        if (l7 != null) {
            i7 = l7.hashCode();
        }
        return i11 + i7;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f7148a + ", sessionSamplingRate=" + this.f7149b + ", sessionRestartTimeout=" + this.f7150c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.f7151e + ')';
    }
}
