package S1;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a  reason: collision with root package name */
    public final long f3114a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f3115b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3116c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3117e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final w f3118g;

    public l(long j7, Integer num, long j8, byte[] bArr, String str, long j9, w wVar) {
        this.f3114a = j7;
        this.f3115b = num;
        this.f3116c = j8;
        this.d = bArr;
        this.f3117e = str;
        this.f = j9;
        this.f3118g = wVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f3114a == ((l) sVar).f3114a && ((num = this.f3115b) != null ? num.equals(((l) sVar).f3115b) : ((l) sVar).f3115b == null)) {
            l lVar = (l) sVar;
            if (this.f3116c == lVar.f3116c) {
                if (sVar instanceof l) {
                    bArr = ((l) sVar).d;
                } else {
                    bArr = lVar.d;
                }
                if (Arrays.equals(this.d, bArr)) {
                    String str = lVar.f3117e;
                    String str2 = this.f3117e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == lVar.f) {
                            w wVar = lVar.f3118g;
                            w wVar2 = this.f3118g;
                            if (wVar2 == null) {
                                if (wVar == null) {
                                    return true;
                                }
                            } else if (wVar2.equals(wVar)) {
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
        long j7 = this.f3114a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        int i8 = 0;
        Integer num = this.f3115b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j8 = this.f3116c;
        int hashCode3 = (((((i7 ^ hashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f3117e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j9 = this.f;
        int i9 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        w wVar = this.f3118g;
        if (wVar != null) {
            i8 = wVar.hashCode();
        }
        return i9 ^ i8;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f3114a + ", eventCode=" + this.f3115b + ", eventUptimeMs=" + this.f3116c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f3117e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.f3118g + "}";
    }
}
