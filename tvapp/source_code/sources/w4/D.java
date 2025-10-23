package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class D extends g0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15887a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15888b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15889c;

    public D(String str, String str2, String str3) {
        this.f15887a = str;
        this.f15888b = str2;
        this.f15889c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f15887a.equals(((D) g0Var).f15887a)) {
            D d = (D) g0Var;
            if (this.f15888b.equals(d.f15888b) && this.f15889c.equals(d.f15889c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15887a.hashCode() ^ 1000003) * 1000003) ^ this.f15888b.hashCode()) * 1000003) ^ this.f15889c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f15887a);
        sb.append(", libraryName=");
        sb.append(this.f15888b);
        sb.append(", buildId=");
        return AbstractC1111a.t(sb, this.f15889c, "}");
    }
}
