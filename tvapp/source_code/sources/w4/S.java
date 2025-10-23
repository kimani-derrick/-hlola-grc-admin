package w4;

import java.util.List;
/* loaded from: classes.dex */
public final class S extends s0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15941a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15942b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15943c;

    public S(String str, int i7, List list) {
        this.f15941a = str;
        this.f15942b = i7;
        this.f15943c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f15941a.equals(((S) s0Var).f15941a)) {
            S s6 = (S) s0Var;
            if (this.f15942b == s6.f15942b && this.f15943c.equals(s6.f15943c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15941a.hashCode() ^ 1000003) * 1000003) ^ this.f15942b) * 1000003) ^ this.f15943c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f15941a + ", importance=" + this.f15942b + ", frames=" + this.f15943c + "}";
    }
}
