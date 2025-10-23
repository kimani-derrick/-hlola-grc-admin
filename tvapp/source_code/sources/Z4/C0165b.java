package Z4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* renamed from: Z4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4808a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4809b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4810c;
    public final C0164a d;

    public C0165b(String str, String str2, String str3, C0164a c0164a) {
        this.f4808a = str;
        this.f4809b = str2;
        this.f4810c = str3;
        this.d = c0164a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0165b)) {
            return false;
        }
        C0165b c0165b = (C0165b) obj;
        if (M5.g.a(this.f4808a, c0165b.f4808a) && M5.g.a(this.f4809b, c0165b.f4809b) && M5.g.a("2.0.1", "2.0.1") && M5.g.a(this.f4810c, c0165b.f4810c) && M5.g.a(this.d, c0165b.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = AbstractC0515y1.i((((this.f4809b.hashCode() + (this.f4808a.hashCode() * 31)) * 31) + 47594039) * 31, 31, this.f4810c);
        return this.d.hashCode() + ((r.f4862r.hashCode() + i7) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f4808a + ", deviceModel=" + this.f4809b + ", sessionSdkVersion=2.0.1, osVersion=" + this.f4810c + ", logEnvironment=" + r.f4862r + ", androidAppInfo=" + this.d + ')';
    }
}
