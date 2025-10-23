package O4;

import r0.AbstractC1111a;
import s.h;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f2722h = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f2723a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2724b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2725c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2726e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2727g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, O4.a] */
    static {
        ?? obj = new Object();
        obj.f2721g = 0L;
        obj.k(1);
        obj.f = 0L;
        obj.i();
    }

    public b(String str, int i7, String str2, String str3, long j7, long j8, String str4) {
        this.f2723a = str;
        this.f2724b = i7;
        this.f2725c = str2;
        this.d = str3;
        this.f2726e = j7;
        this.f = j8;
        this.f2727g = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, O4.a] */
    public final a a() {
        ?? obj = new Object();
        obj.f2718b = this.f2723a;
        obj.f2717a = this.f2724b;
        obj.f2719c = this.f2725c;
        obj.d = this.d;
        obj.f = Long.valueOf(this.f2726e);
        obj.f2721g = Long.valueOf(this.f);
        obj.f2720e = this.f2727g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f2723a;
        if (str != null ? str.equals(bVar.f2723a) : bVar.f2723a == null) {
            if (h.a(this.f2724b, bVar.f2724b)) {
                String str2 = bVar.f2725c;
                String str3 = this.f2725c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = bVar.d;
                    String str5 = this.d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f2726e == bVar.f2726e && this.f == bVar.f) {
                            String str6 = bVar.f2727g;
                            String str7 = this.f2727g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
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
        int i7 = 0;
        String str = this.f2723a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b7 = (((hashCode ^ 1000003) * 1000003) ^ h.b(this.f2724b)) * 1000003;
        String str2 = this.f2725c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i8 = (b7 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j7 = this.f2726e;
        long j8 = this.f;
        int i9 = (((((i8 ^ hashCode3) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str4 = this.f2727g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i7 ^ i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f2723a);
        sb.append(", registrationStatus=");
        sb.append(AbstractC1111a.C(this.f2724b));
        sb.append(", authToken=");
        sb.append(this.f2725c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.f2726e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return AbstractC1111a.t(sb, this.f2727g, "}");
    }
}
