package Z3;

import g4.C0736a;
import java.util.Objects;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4730a;

    /* renamed from: b  reason: collision with root package name */
    public final C0736a f4731b;

    public t(Class cls, C0736a c0736a) {
        this.f4730a = cls;
        this.f4731b = c0736a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!tVar.f4730a.equals(this.f4730a) || !tVar.f4731b.equals(this.f4731b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f4730a, this.f4731b);
    }

    public final String toString() {
        return this.f4730a.getSimpleName() + ", object identifier: " + this.f4731b;
    }
}
