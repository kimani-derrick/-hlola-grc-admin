package S1;
/* loaded from: classes.dex */
public final class o extends w {

    /* renamed from: a  reason: collision with root package name */
    public final v f3125a;

    /* renamed from: b  reason: collision with root package name */
    public final u f3126b;

    public o(v vVar, u uVar) {
        this.f3125a = vVar;
        this.f3126b = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        v vVar = this.f3125a;
        if (vVar != null ? vVar.equals(((o) wVar).f3125a) : ((o) wVar).f3125a == null) {
            u uVar = this.f3126b;
            o oVar = (o) wVar;
            if (uVar == null) {
                if (oVar.f3126b == null) {
                    return true;
                }
            } else if (uVar.equals(oVar.f3126b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        v vVar = this.f3125a;
        if (vVar == null) {
            hashCode = 0;
        } else {
            hashCode = vVar.hashCode();
        }
        int i8 = (hashCode ^ 1000003) * 1000003;
        u uVar = this.f3126b;
        if (uVar != null) {
            i7 = uVar.hashCode();
        }
        return i7 ^ i8;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f3125a + ", mobileSubtype=" + this.f3126b + "}";
    }
}
