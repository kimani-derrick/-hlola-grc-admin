package S1;

import java.util.List;
/* loaded from: classes.dex */
public final class m extends t {

    /* renamed from: a  reason: collision with root package name */
    public final long f3119a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3120b;

    /* renamed from: c  reason: collision with root package name */
    public final r f3121c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3122e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final x f3123g;

    public m(long j7, long j8, r rVar, Integer num, String str, List list, x xVar) {
        this.f3119a = j7;
        this.f3120b = j8;
        this.f3121c = rVar;
        this.d = num;
        this.f3122e = str;
        this.f = list;
        this.f3123g = xVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f3119a == ((m) tVar).f3119a) {
            m mVar = (m) tVar;
            if (this.f3120b == mVar.f3120b) {
                r rVar = mVar.f3121c;
                r rVar2 = this.f3121c;
                if (rVar2 != null ? rVar2.equals(rVar) : rVar == null) {
                    Integer num = mVar.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = mVar.f3122e;
                        String str2 = this.f3122e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = mVar.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                x xVar = mVar.f3123g;
                                x xVar2 = this.f3123g;
                                if (xVar2 == null) {
                                    if (xVar == null) {
                                        return true;
                                    }
                                } else if (xVar2.equals(xVar)) {
                                    return true;
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
        long j7 = this.f3119a;
        long j8 = this.f3120b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        int i8 = 0;
        r rVar = this.f3121c;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        int i9 = (i7 ^ hashCode) * 1000003;
        Integer num = this.d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str = this.f3122e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        List list = this.f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        x xVar = this.f3123g;
        if (xVar != null) {
            i8 = xVar.hashCode();
        }
        return i12 ^ i8;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f3119a + ", requestUptimeMs=" + this.f3120b + ", clientInfo=" + this.f3121c + ", logSource=" + this.d + ", logSourceName=" + this.f3122e + ", logEvents=" + this.f + ", qosTier=" + this.f3123g + "}";
    }
}
