package W5;
/* renamed from: W5.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110q {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4013a;

    /* renamed from: b  reason: collision with root package name */
    public final L5.l f4014b;

    public C0110q(Object obj, L5.l lVar) {
        this.f4013a = obj;
        this.f4014b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0110q)) {
            return false;
        }
        C0110q c0110q = (C0110q) obj;
        if (M5.g.a(this.f4013a, c0110q.f4013a) && M5.g.a(this.f4014b, c0110q.f4014b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f4013a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f4014b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f4013a + ", onCancellation=" + this.f4014b + ')';
    }
}
