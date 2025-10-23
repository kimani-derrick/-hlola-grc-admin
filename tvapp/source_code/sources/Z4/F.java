package Z4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final String f4753a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4754b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4755c;
    public final long d;

    public F(String str, String str2, int i7, long j7) {
        M5.g.f(str, "sessionId");
        M5.g.f(str2, "firstSessionId");
        this.f4753a = str;
        this.f4754b = str2;
        this.f4755c = i7;
        this.d = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f = (F) obj;
        if (M5.g.a(this.f4753a, f.f4753a) && M5.g.a(this.f4754b, f.f4754b) && this.f4755c == f.f4755c && this.d == f.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.d;
        return ((AbstractC0515y1.i(this.f4753a.hashCode() * 31, 31, this.f4754b) + this.f4755c) * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f4753a + ", firstSessionId=" + this.f4754b + ", sessionIndex=" + this.f4755c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
