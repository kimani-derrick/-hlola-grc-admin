package M5;
/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class f2310a;

    public i(Class cls) {
        g.f(cls, "jClass");
        this.f2310a = cls;
    }

    @Override // M5.c
    public final Class a() {
        return this.f2310a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (g.a(this.f2310a, ((i) obj).f2310a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2310a.hashCode();
    }

    public final String toString() {
        return this.f2310a.toString() + " (Kotlin reflection is not available)";
    }
}
