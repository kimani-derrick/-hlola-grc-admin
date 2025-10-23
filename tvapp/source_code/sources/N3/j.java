package N3;
/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: q  reason: collision with root package name */
    public final Object f2500q;

    public j(Object obj) {
        this.f2500q = obj;
    }

    @Override // N3.g
    public final Object a() {
        return this.f2500q;
    }

    @Override // N3.g
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f2500q.equals(((j) obj).f2500q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2500q.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2500q);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
