package n0;
/* renamed from: n0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018i {

    /* renamed from: a  reason: collision with root package name */
    public final L f12537a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12538b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12539c;
    public final Object d;

    public C1018i(L l7, boolean z7, Object obj, boolean z8) {
        if (!l7.f12510a && z7) {
            throw new IllegalArgumentException(l7.b().concat(" does not allow nullable values").toString());
        }
        if (!z7 && z8 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + l7.b() + " has null value but is not nullable.").toString());
        }
        this.f12537a = l7;
        this.f12538b = z7;
        this.d = obj;
        this.f12539c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !M5.g.a(C1018i.class, obj.getClass())) {
            return false;
        }
        C1018i c1018i = (C1018i) obj;
        if (this.f12538b != c1018i.f12538b || this.f12539c != c1018i.f12539c || !M5.g.a(this.f12537a, c1018i.f12537a)) {
            return false;
        }
        Object obj2 = c1018i.d;
        Object obj3 = this.d;
        if (obj3 != null) {
            return M5.g.a(obj3, obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f12537a.hashCode() * 31) + (this.f12538b ? 1 : 0)) * 31) + (this.f12539c ? 1 : 0)) * 31;
        Object obj = this.d;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1018i.class.getSimpleName());
        sb.append(" Type: " + this.f12537a);
        sb.append(" Nullable: " + this.f12538b);
        if (this.f12539c) {
            sb.append(" DefaultValue: " + this.d);
        }
        String sb2 = sb.toString();
        M5.g.e(sb2, "sb.toString()");
        return sb2;
    }
}
