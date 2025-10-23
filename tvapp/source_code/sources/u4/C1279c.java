package u4;

import r0.AbstractC1111a;
/* renamed from: u4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1279c {

    /* renamed from: a  reason: collision with root package name */
    public final String f14988a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14989b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14990c;

    public C1279c(String str, String str2, String str3) {
        if (str != null) {
            this.f14988a = str;
            this.f14989b = str2;
            this.f14990c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1279c)) {
            return false;
        }
        C1279c c1279c = (C1279c) obj;
        if (this.f14988a.equals(c1279c.f14988a)) {
            String str = c1279c.f14989b;
            String str2 = this.f14989b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = c1279c.f14990c;
                String str4 = this.f14990c;
                if (str4 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str4.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f14988a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        String str = this.f14989b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f14990c;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i8 ^ i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f14988a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f14989b);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC1111a.t(sb, this.f14990c, "}");
    }
}
