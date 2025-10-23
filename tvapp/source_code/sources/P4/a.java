package P4;

import r0.AbstractC1111a;
import s.h;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f2798a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2799b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2800c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2801e;

    public a(String str, String str2, String str3, b bVar, int i7) {
        this.f2798a = str;
        this.f2799b = str2;
        this.f2800c = str3;
        this.d = bVar;
        this.f2801e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f2798a;
        if (str != null ? str.equals(aVar.f2798a) : aVar.f2798a == null) {
            String str2 = this.f2799b;
            if (str2 != null ? str2.equals(aVar.f2799b) : aVar.f2799b == null) {
                String str3 = this.f2800c;
                if (str3 != null ? str3.equals(aVar.f2800c) : aVar.f2800c == null) {
                    b bVar = this.d;
                    if (bVar != null ? bVar.equals(aVar.d) : aVar.d == null) {
                        int i7 = this.f2801e;
                        if (i7 == 0) {
                            if (aVar.f2801e == 0) {
                                return true;
                            }
                        } else if (h.a(i7, aVar.f2801e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i7 = 0;
        String str = this.f2798a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f2799b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (i8 ^ hashCode2) * 1000003;
        String str3 = this.f2800c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        b bVar = this.d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i11 = (i10 ^ hashCode4) * 1000003;
        int i12 = this.f2801e;
        if (i12 != 0) {
            i7 = h.b(i12);
        }
        return i7 ^ i11;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f2798a + ", fid=" + this.f2799b + ", refreshToken=" + this.f2800c + ", authToken=" + this.d + ", responseCode=" + AbstractC1111a.D(this.f2801e) + "}";
    }
}
