package w4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
/* loaded from: classes.dex */
public final class P extends p0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15934a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15935b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15936c;
    public final p0 d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15937e;

    public P(String str, String str2, List list, p0 p0Var, int i7) {
        this.f15934a = str;
        this.f15935b = str2;
        this.f15936c = list;
        this.d = p0Var;
        this.f15937e = i7;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (this.f15934a.equals(((P) p0Var).f15934a) && ((str = this.f15935b) != null ? str.equals(((P) p0Var).f15935b) : ((P) p0Var).f15935b == null)) {
            P p3 = (P) p0Var;
            if (this.f15936c.equals(p3.f15936c)) {
                p0 p0Var2 = p3.d;
                p0 p0Var3 = this.d;
                if (p0Var3 != null ? p0Var3.equals(p0Var2) : p0Var2 == null) {
                    if (this.f15937e == p3.f15937e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15934a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        String str = this.f15935b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f15936c.hashCode()) * 1000003;
        p0 p0Var = this.d;
        if (p0Var != null) {
            i7 = p0Var.hashCode();
        }
        return ((hashCode3 ^ i7) * 1000003) ^ this.f15937e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f15934a);
        sb.append(", reason=");
        sb.append(this.f15935b);
        sb.append(", frames=");
        sb.append(this.f15936c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return AbstractC0515y1.n(sb, this.f15937e, "}");
    }
}
