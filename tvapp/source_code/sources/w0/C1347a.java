package w0;
/* renamed from: w0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1347a {

    /* renamed from: a  reason: collision with root package name */
    public int f15499a;

    /* renamed from: b  reason: collision with root package name */
    public int f15500b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15501c;
    public int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1347a)) {
            return false;
        }
        C1347a c1347a = (C1347a) obj;
        int i7 = this.f15499a;
        if (i7 != c1347a.f15499a) {
            return false;
        }
        if (i7 == 8 && Math.abs(this.d - this.f15500b) == 1 && this.d == c1347a.f15500b && this.f15500b == c1347a.d) {
            return true;
        }
        if (this.d != c1347a.d || this.f15500b != c1347a.f15500b) {
            return false;
        }
        Object obj2 = this.f15501c;
        Object obj3 = c1347a.f15501c;
        if (obj2 != null) {
            if (!obj2.equals(obj3)) {
                return false;
            }
        } else if (obj3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f15499a * 31) + this.f15500b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i7 = this.f15499a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f15500b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.f15501c);
        sb.append("]");
        return sb.toString();
    }
}
