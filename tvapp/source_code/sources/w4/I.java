package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class I extends m0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15907a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15908b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15909c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15910e;
    public final String f;

    public I(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f15907a = str;
        this.f15908b = str2;
        this.f15909c = str3;
        this.d = str4;
        this.f15910e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f15907a.equals(((I) m0Var).f15907a)) {
            I i7 = (I) m0Var;
            if (this.f15908b.equals(i7.f15908b)) {
                String str = i7.f15909c;
                String str2 = this.f15909c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = i7.d;
                    String str4 = this.d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = i7.f15910e;
                        String str6 = this.f15910e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = i7.f;
                            String str8 = this.f;
                            if (str8 == null) {
                                if (str7 == null) {
                                    return true;
                                }
                            } else if (str8.equals(str7)) {
                                return true;
                            }
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
        int hashCode4 = (((this.f15907a.hashCode() ^ 1000003) * 1000003) ^ this.f15908b.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f15909c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (i8 ^ hashCode2) * 1000003;
        String str3 = this.f15910e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        String str4 = this.f;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f15907a);
        sb.append(", version=");
        sb.append(this.f15908b);
        sb.append(", displayVersion=");
        sb.append(this.f15909c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.f15910e);
        sb.append(", developmentPlatformVersion=");
        return AbstractC1111a.t(sb, this.f, "}");
    }
}
