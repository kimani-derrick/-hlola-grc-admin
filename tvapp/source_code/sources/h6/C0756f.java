package h6;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import u4.C1288l;
import v6.C1344i;
/* renamed from: h6.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756f {

    /* renamed from: a  reason: collision with root package name */
    public final String f11140a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11141b;

    /* renamed from: c  reason: collision with root package name */
    public final C1344i f11142c;

    public C0756f(String str, String str2) {
        C1344i b7;
        M5.g.f(str2, "pin");
        if ((U5.n.b0(str, "*.", false) && U5.f.j0(str, "*", 1, false, 4) == -1) || ((U5.n.b0(str, "**.", false) && U5.f.j0(str, "*", 2, false, 4) == -1) || U5.f.j0(str, "*", 0, false, 6) == -1)) {
            String H6 = h4.b.H(str);
            if (H6 != null) {
                this.f11140a = H6;
                if (U5.n.b0(str2, "sha1/", false)) {
                    this.f11141b = "sha1";
                    C1344i c1344i = C1344i.f15389t;
                    String substring = str2.substring(5);
                    M5.g.e(substring, "this as java.lang.String).substring(startIndex)");
                    b7 = C1288l.b(substring);
                    if (b7 == null) {
                        throw new IllegalArgumentException(M5.g.k(str2, "Invalid pin hash: "));
                    }
                } else if (U5.n.b0(str2, "sha256/", false)) {
                    this.f11141b = "sha256";
                    C1344i c1344i2 = C1344i.f15389t;
                    String substring2 = str2.substring(7);
                    M5.g.e(substring2, "this as java.lang.String).substring(startIndex)");
                    b7 = C1288l.b(substring2);
                    if (b7 == null) {
                        throw new IllegalArgumentException(M5.g.k(str2, "Invalid pin hash: "));
                    }
                } else {
                    throw new IllegalArgumentException(M5.g.k(str2, "pins must start with 'sha256/' or 'sha1/': "));
                }
                this.f11142c = b7;
                return;
            }
            throw new IllegalArgumentException(M5.g.k(str, "Invalid pattern: "));
        }
        throw new IllegalArgumentException(M5.g.k(str, "Unexpected pattern: ").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0756f)) {
            return false;
        }
        C0756f c0756f = (C0756f) obj;
        if (M5.g.a(this.f11140a, c0756f.f11140a) && M5.g.a(this.f11141b, c0756f.f11141b) && M5.g.a(this.f11142c, c0756f.f11142c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11142c.hashCode() + AbstractC0515y1.i(this.f11140a.hashCode() * 31, 31, this.f11141b);
    }

    public final String toString() {
        return this.f11141b + '/' + this.f11142c.a();
    }
}
