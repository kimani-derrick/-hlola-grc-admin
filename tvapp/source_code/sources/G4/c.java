package G4;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f766a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f767b;

    public c(String str, Map map) {
        this.f766a = str;
        this.f767b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f766a.equals(cVar.f766a) && this.f767b.equals(cVar.f767b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f767b.hashCode() + (this.f766a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f766a + ", properties=" + this.f767b.values() + "}";
    }
}
