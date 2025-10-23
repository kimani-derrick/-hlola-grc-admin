package Z4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Z4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4804a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4805b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4806c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final C0181s f4807e;
    public final List f;

    public C0164a(String str, String str2, String str3, String str4, C0181s c0181s, ArrayList arrayList) {
        M5.g.f(str2, "versionName");
        M5.g.f(str3, "appBuildVersion");
        this.f4804a = str;
        this.f4805b = str2;
        this.f4806c = str3;
        this.d = str4;
        this.f4807e = c0181s;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0164a)) {
            return false;
        }
        C0164a c0164a = (C0164a) obj;
        if (M5.g.a(this.f4804a, c0164a.f4804a) && M5.g.a(this.f4805b, c0164a.f4805b) && M5.g.a(this.f4806c, c0164a.f4806c) && M5.g.a(this.d, c0164a.d) && M5.g.a(this.f4807e, c0164a.f4807e) && M5.g.a(this.f, c0164a.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(this.f4804a.hashCode() * 31, 31, this.f4805b), 31, this.f4806c), 31, this.d);
        return this.f.hashCode() + ((this.f4807e.hashCode() + i7) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f4804a + ", versionName=" + this.f4805b + ", appBuildVersion=" + this.f4806c + ", deviceManufacturer=" + this.d + ", currentProcessDetails=" + this.f4807e + ", appProcessDetails=" + this.f + ')';
    }
}
