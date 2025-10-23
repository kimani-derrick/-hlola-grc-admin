package Z3;

import java.util.Objects;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4732a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f4733b;

    public u(Class cls, Class cls2) {
        this.f4732a = cls;
        this.f4733b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!uVar.f4732a.equals(this.f4732a) || !uVar.f4733b.equals(this.f4733b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f4732a, this.f4733b);
    }

    public final String toString() {
        return this.f4732a.getSimpleName() + " with serialization type: " + this.f4733b.getSimpleName();
    }
}
