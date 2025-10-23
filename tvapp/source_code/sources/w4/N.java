package w4;

import java.util.List;
/* loaded from: classes.dex */
public final class N extends t0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f15927a;

    /* renamed from: b  reason: collision with root package name */
    public final p0 f15928b;

    /* renamed from: c  reason: collision with root package name */
    public final h0 f15929c;
    public final q0 d;

    /* renamed from: e  reason: collision with root package name */
    public final List f15930e;

    public N(List list, p0 p0Var, h0 h0Var, q0 q0Var, List list2) {
        this.f15927a = list;
        this.f15928b = p0Var;
        this.f15929c = h0Var;
        this.d = q0Var;
        this.f15930e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        List list = this.f15927a;
        if (list != null ? list.equals(((N) t0Var).f15927a) : ((N) t0Var).f15927a == null) {
            p0 p0Var = this.f15928b;
            if (p0Var != null ? p0Var.equals(((N) t0Var).f15928b) : ((N) t0Var).f15928b == null) {
                h0 h0Var = this.f15929c;
                if (h0Var != null ? h0Var.equals(((N) t0Var).f15929c) : ((N) t0Var).f15929c == null) {
                    if (this.d.equals(((N) t0Var).d) && this.f15930e.equals(((N) t0Var).f15930e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i7 = 0;
        List list = this.f15927a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i8 = (hashCode ^ 1000003) * 1000003;
        p0 p0Var = this.f15928b;
        if (p0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = p0Var.hashCode();
        }
        int i9 = (i8 ^ hashCode2) * 1000003;
        h0 h0Var = this.f15929c;
        if (h0Var != null) {
            i7 = h0Var.hashCode();
        }
        return ((((i7 ^ i9) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f15930e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f15927a + ", exception=" + this.f15928b + ", appExitInfo=" + this.f15929c + ", signal=" + this.d + ", binaries=" + this.f15930e + "}";
    }
}
