package T0;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f3206c;

    /* renamed from: a  reason: collision with root package name */
    public final h4.b f3207a;

    /* renamed from: b  reason: collision with root package name */
    public final h4.b f3208b;

    static {
        b bVar = b.f3201a;
        f3206c = new f(bVar, bVar);
    }

    public f(h4.b bVar, h4.b bVar2) {
        this.f3207a = bVar;
        this.f3208b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (M5.g.a(this.f3207a, fVar.f3207a) && M5.g.a(this.f3208b, fVar.f3208b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3208b.hashCode() + (this.f3207a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f3207a + ", height=" + this.f3208b + ')';
    }
}
