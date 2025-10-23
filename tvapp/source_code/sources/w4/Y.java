package w4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class Y extends y0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15959a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15960b;

    public Y(String str, String str2) {
        this.f15959a = str;
        this.f15960b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f15959a.equals(((Y) y0Var).f15959a) && this.f15960b.equals(((Y) y0Var).f15960b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15959a.hashCode() ^ 1000003) * 1000003) ^ this.f15960b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f15959a);
        sb.append(", variantId=");
        return AbstractC1111a.t(sb, this.f15960b, "}");
    }
}
