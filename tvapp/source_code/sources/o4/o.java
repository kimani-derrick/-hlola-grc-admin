package o4;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Class f12948a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f12949b;

    public o(Class cls, Class cls2) {
        this.f12948a = cls;
        this.f12949b = cls2;
    }

    public static o a(Class cls) {
        return new o(n.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f12949b.equals(oVar.f12949b)) {
            return false;
        }
        return this.f12948a.equals(oVar.f12948a);
    }

    public final int hashCode() {
        return this.f12948a.hashCode() + (this.f12949b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f12949b;
        Class cls2 = this.f12948a;
        if (cls2 == n.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
