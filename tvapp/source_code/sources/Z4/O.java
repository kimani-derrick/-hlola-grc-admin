package Z4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final String f4783a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4784b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4785c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final C0173j f4786e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4787g;

    public O(String str, String str2, int i7, long j7, C0173j c0173j, String str3, String str4) {
        M5.g.f(str, "sessionId");
        M5.g.f(str2, "firstSessionId");
        this.f4783a = str;
        this.f4784b = str2;
        this.f4785c = i7;
        this.d = j7;
        this.f4786e = c0173j;
        this.f = str3;
        this.f4787g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        if (M5.g.a(this.f4783a, o7.f4783a) && M5.g.a(this.f4784b, o7.f4784b) && this.f4785c == o7.f4785c && this.d == o7.d && M5.g.a(this.f4786e, o7.f4786e) && M5.g.a(this.f, o7.f) && M5.g.a(this.f4787g, o7.f4787g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.d;
        return this.f4787g.hashCode() + AbstractC0515y1.i((this.f4786e.hashCode() + ((((AbstractC0515y1.i(this.f4783a.hashCode() * 31, 31, this.f4784b) + this.f4785c) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f4783a + ", firstSessionId=" + this.f4784b + ", sessionIndex=" + this.f4785c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f4786e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.f4787g + ')';
    }
}
