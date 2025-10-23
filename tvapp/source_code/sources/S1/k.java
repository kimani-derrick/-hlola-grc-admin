package S1;
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a  reason: collision with root package name */
    public final q f3112a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3113b;

    public k(q qVar, a aVar) {
        this.f3112a = qVar;
        this.f3113b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        q qVar = this.f3112a;
        if (qVar != null ? qVar.equals(((k) rVar).f3112a) : ((k) rVar).f3112a == null) {
            a aVar = this.f3113b;
            k kVar = (k) rVar;
            if (aVar == null) {
                if (kVar.f3113b == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.f3113b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        q qVar = this.f3112a;
        if (qVar == null) {
            hashCode = 0;
        } else {
            hashCode = qVar.hashCode();
        }
        int i8 = (hashCode ^ 1000003) * 1000003;
        a aVar = this.f3113b;
        if (aVar != null) {
            i7 = aVar.hashCode();
        }
        return i7 ^ i8;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f3112a + ", androidClientInfo=" + this.f3113b + "}";
    }
}
