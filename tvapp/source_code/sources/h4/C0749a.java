package h4;

import r0.AbstractC1111a;
/* renamed from: h4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749a {

    /* renamed from: a  reason: collision with root package name */
    public final long f10978a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10979b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10980c;

    public C0749a(long j7, long j8, long j9) {
        this.f10978a = j7;
        this.f10979b = j8;
        this.f10980c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0749a)) {
            return false;
        }
        C0749a c0749a = (C0749a) obj;
        if (this.f10978a == c0749a.f10978a && this.f10979b == c0749a.f10979b && this.f10980c == c0749a.f10980c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f10978a;
        long j8 = this.f10979b;
        long j9 = this.f10980c;
        return ((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f10978a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f10979b);
        sb.append(", uptimeMillis=");
        return AbstractC1111a.s(sb, this.f10980c, "}");
    }
}
