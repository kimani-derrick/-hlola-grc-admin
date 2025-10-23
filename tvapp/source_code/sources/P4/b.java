package P4;

import r0.AbstractC1111a;
import s.h;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2802a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2803b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2804c;

    public b(int i7, long j7, String str) {
        this.f2802a = str;
        this.f2803b = j7;
        this.f2804c = i7;
    }

    public static C.d a() {
        C.d dVar = new C.d();
        dVar.f326t = 0L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f2802a;
        if (str != null ? str.equals(bVar.f2802a) : bVar.f2802a == null) {
            if (this.f2803b == bVar.f2803b) {
                int i7 = bVar.f2804c;
                int i8 = this.f2804c;
                if (i8 == 0) {
                    if (i7 == 0) {
                        return true;
                    }
                } else if (h.a(i8, i7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        String str = this.f2802a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j7 = this.f2803b;
        int i8 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        int i9 = this.f2804c;
        if (i9 != 0) {
            i7 = h.b(i9);
        }
        return i7 ^ i8;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f2802a + ", tokenExpirationTimestamp=" + this.f2803b + ", responseCode=" + AbstractC1111a.E(this.f2804c) + "}";
    }
}
