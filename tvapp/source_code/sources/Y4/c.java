package Y4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b  reason: collision with root package name */
    public final String f4495b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4496c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4497e;
    public final long f;

    public c(String str, String str2, String str3, String str4, long j7) {
        this.f4495b = str;
        this.f4496c = str2;
        this.d = str3;
        this.f4497e = str4;
        this.f = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f4495b.equals(((c) eVar).f4495b)) {
            c cVar = (c) eVar;
            if (this.f4496c.equals(cVar.f4496c) && this.d.equals(cVar.d) && this.f4497e.equals(cVar.f4497e) && this.f == cVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f;
        return ((((((((this.f4495b.hashCode() ^ 1000003) * 1000003) ^ this.f4496c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f4497e.hashCode()) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f4495b);
        sb.append(", variantId=");
        sb.append(this.f4496c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.f4497e);
        sb.append(", templateVersion=");
        return AbstractC1111a.s(sb, this.f, "}");
    }
}
