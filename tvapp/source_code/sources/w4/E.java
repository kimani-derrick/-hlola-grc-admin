package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class E extends i0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15890a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15891b;

    public E(String str, String str2) {
        this.f15890a = str;
        this.f15891b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f15890a.equals(((E) i0Var).f15890a) && this.f15891b.equals(((E) i0Var).f15891b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15890a.hashCode() ^ 1000003) * 1000003) ^ this.f15891b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f15890a);
        sb.append(", value=");
        return AbstractC1111a.t(sb, this.f15891b, "}");
    }
}
