package T1;

import java.util.HashMap;
import java.util.Map;
import z4.C1518b;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f3236a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f3237b;

    /* renamed from: c  reason: collision with root package name */
    public final m f3238c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3239e;
    public final Map f;

    public h(String str, Integer num, m mVar, long j7, long j8, Map map) {
        this.f3236a = str;
        this.f3237b = num;
        this.f3238c = mVar;
        this.d = j7;
        this.f3239e = j8;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z4.b, java.lang.Object] */
    public final C1518b c() {
        ?? obj = new Object();
        String str = this.f3236a;
        if (str != null) {
            obj.f16461a = str;
            obj.f16462b = this.f3237b;
            obj.w(this.f3238c);
            obj.d = Long.valueOf(this.d);
            obj.f16464e = Long.valueOf(this.f3239e);
            obj.f = new HashMap(this.f);
            return obj;
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3236a.equals(hVar.f3236a)) {
            Integer num = hVar.f3237b;
            Integer num2 = this.f3237b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f3238c.equals(hVar.f3238c) && this.d == hVar.d && this.f3239e == hVar.f3239e && this.f.equals(hVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3236a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f3237b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j7 = this.d;
        long j8 = this.f3239e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f3238c.hashCode()) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f3236a + ", code=" + this.f3237b + ", encodedPayload=" + this.f3238c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f3239e + ", autoMetadata=" + this.f + "}";
    }
}
