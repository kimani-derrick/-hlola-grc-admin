package Y5;
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f4533a;

    public g(Throwable th) {
        this.f4533a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (M5.g.a(this.f4533a, ((g) obj).f4533a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f4533a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // Y5.h
    public final String toString() {
        return "Closed(" + this.f4533a + ')';
    }
}
