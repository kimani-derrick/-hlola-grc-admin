package Q1;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2846a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2847b;

    public a(Object obj, c cVar) {
        if (obj != null) {
            this.f2846a = obj;
            this.f2847b = cVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f2846a.equals(aVar.f2846a) && this.f2847b.equals(aVar.f2847b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2847b.hashCode() ^ (((1000003 * 1000003) ^ this.f2846a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f2846a + ", priority=" + this.f2847b + "}";
    }
}
