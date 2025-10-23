package M0;
/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: a  reason: collision with root package name */
    public final K0.l f2172a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2173b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2174c;

    public m(K0.l lVar, String str, int i7) {
        this.f2172a = lVar;
        this.f2173b = str;
        this.f2174c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (M5.g.a(this.f2172a, mVar.f2172a) && M5.g.a(this.f2173b, mVar.f2173b) && this.f2174c == mVar.f2174c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f2172a.hashCode() * 31;
        String str = this.f2173b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return s.h.b(this.f2174c) + ((hashCode + i7) * 31);
    }
}
