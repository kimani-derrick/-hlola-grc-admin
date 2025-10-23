package w4;
/* loaded from: classes.dex */
public final class B extends F0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f15870b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15871c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15872e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15873g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15874h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15875i;

    /* renamed from: j  reason: collision with root package name */
    public final String f15876j;

    /* renamed from: k  reason: collision with root package name */
    public final E0 f15877k;

    /* renamed from: l  reason: collision with root package name */
    public final k0 f15878l;

    /* renamed from: m  reason: collision with root package name */
    public final h0 f15879m;

    public B(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, E0 e02, k0 k0Var, h0 h0Var) {
        this.f15870b = str;
        this.f15871c = str2;
        this.d = i7;
        this.f15872e = str3;
        this.f = str4;
        this.f15873g = str5;
        this.f15874h = str6;
        this.f15875i = str7;
        this.f15876j = str8;
        this.f15877k = e02;
        this.f15878l = k0Var;
        this.f15879m = h0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J3.j, java.lang.Object] */
    @Override // w4.F0
    public final J3.j a() {
        ?? obj = new Object();
        obj.f1373a = this.f15870b;
        obj.f1374b = this.f15871c;
        obj.f1375c = Integer.valueOf(this.d);
        obj.d = this.f15872e;
        obj.f1376e = this.f;
        obj.f = this.f15873g;
        obj.f1377g = this.f15874h;
        obj.f1378h = this.f15875i;
        obj.f1379i = this.f15876j;
        obj.f1380j = this.f15877k;
        obj.f1381k = this.f15878l;
        obj.f1382l = this.f15879m;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        if (this.f15870b.equals(((B) f02).f15870b)) {
            B b7 = (B) f02;
            if (this.f15871c.equals(b7.f15871c) && this.d == b7.d && this.f15872e.equals(b7.f15872e)) {
                String str = b7.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = b7.f15873g;
                    String str4 = this.f15873g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = b7.f15874h;
                        String str6 = this.f15874h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f15875i.equals(b7.f15875i) && this.f15876j.equals(b7.f15876j)) {
                                E0 e02 = b7.f15877k;
                                E0 e03 = this.f15877k;
                                if (e03 != null ? e03.equals(e02) : e02 == null) {
                                    k0 k0Var = b7.f15878l;
                                    k0 k0Var2 = this.f15878l;
                                    if (k0Var2 != null ? k0Var2.equals(k0Var) : k0Var == null) {
                                        h0 h0Var = b7.f15879m;
                                        h0 h0Var2 = this.f15879m;
                                        if (h0Var2 == null) {
                                            if (h0Var == null) {
                                                return true;
                                            }
                                        } else if (h0Var2.equals(h0Var)) {
                                            return true;
                                        }
                                    }
                                }
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
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.f15870b.hashCode() ^ 1000003) * 1000003) ^ this.f15871c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f15872e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f15873g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (i8 ^ hashCode2) * 1000003;
        String str3 = this.f15874h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i9 ^ hashCode3) * 1000003) ^ this.f15875i.hashCode()) * 1000003) ^ this.f15876j.hashCode()) * 1000003;
        E0 e02 = this.f15877k;
        if (e02 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = e02.hashCode();
        }
        int i10 = (hashCode7 ^ hashCode4) * 1000003;
        k0 k0Var = this.f15878l;
        if (k0Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = k0Var.hashCode();
        }
        int i11 = (i10 ^ hashCode5) * 1000003;
        h0 h0Var = this.f15879m;
        if (h0Var != null) {
            i7 = h0Var.hashCode();
        }
        return i11 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f15870b + ", gmpAppId=" + this.f15871c + ", platform=" + this.d + ", installationUuid=" + this.f15872e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.f15873g + ", appQualitySessionId=" + this.f15874h + ", buildVersion=" + this.f15875i + ", displayVersion=" + this.f15876j + ", session=" + this.f15877k + ", ndkPayload=" + this.f15878l + ", appExitInfo=" + this.f15879m + "}";
    }
}
