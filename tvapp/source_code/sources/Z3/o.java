package Z3;

import java.util.Objects;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4721a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f4722b;

    public o(Class cls, Class cls2) {
        this.f4721a = cls;
        this.f4722b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!oVar.f4721a.equals(this.f4721a) || !oVar.f4722b.equals(this.f4722b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f4721a, this.f4722b);
    }

    public final String toString() {
        return this.f4721a.getSimpleName() + " with primitive type: " + this.f4722b.getSimpleName();
    }
}
