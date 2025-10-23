package w4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
/* loaded from: classes.dex */
public final class M extends v0 {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f15922a;

    /* renamed from: b  reason: collision with root package name */
    public final List f15923b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15924c;
    public final Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final u0 f15925e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15926g;

    public M(t0 t0Var, List list, List list2, Boolean bool, u0 u0Var, List list3, int i7) {
        this.f15922a = t0Var;
        this.f15923b = list;
        this.f15924c = list2;
        this.d = bool;
        this.f15925e = u0Var;
        this.f = list3;
        this.f15926g = i7;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        u0 u0Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f15922a.equals(((M) v0Var).f15922a) && ((list = this.f15923b) != null ? list.equals(((M) v0Var).f15923b) : ((M) v0Var).f15923b == null) && ((list2 = this.f15924c) != null ? list2.equals(((M) v0Var).f15924c) : ((M) v0Var).f15924c == null) && ((bool = this.d) != null ? bool.equals(((M) v0Var).d) : ((M) v0Var).d == null) && ((u0Var = this.f15925e) != null ? u0Var.equals(((M) v0Var).f15925e) : ((M) v0Var).f15925e == null) && ((list3 = this.f) != null ? list3.equals(((M) v0Var).f) : ((M) v0Var).f == null) && this.f15926g == ((M) v0Var).f15926g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f15922a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        List list = this.f15923b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i8 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f15924c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i9 = (i8 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        u0 u0Var = this.f15925e;
        if (u0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = u0Var.hashCode();
        }
        int i11 = (i10 ^ hashCode4) * 1000003;
        List list3 = this.f;
        if (list3 != null) {
            i7 = list3.hashCode();
        }
        return ((i11 ^ i7) * 1000003) ^ this.f15926g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f15922a);
        sb.append(", customAttributes=");
        sb.append(this.f15923b);
        sb.append(", internalKeys=");
        sb.append(this.f15924c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f15925e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return AbstractC0515y1.n(sb, this.f15926g, "}");
    }
}
