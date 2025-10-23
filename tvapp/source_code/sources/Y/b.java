package Y;

import A5.k;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map f4297a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f4298b;

    public b(Map map, boolean z7) {
        M5.g.f(map, "preferencesMap");
        this.f4297a = map;
        this.f4298b = new AtomicBoolean(z7);
    }

    public final void a() {
        if (!this.f4298b.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }

    public final Object b(d dVar) {
        M5.g.f(dVar, "key");
        return this.f4297a.get(dVar);
    }

    public final void c(d dVar, Object obj) {
        M5.g.f(dVar, "key");
        a();
        Map map = this.f4297a;
        if (obj == null) {
            a();
            map.remove(dVar);
            return;
        }
        if (obj instanceof Set) {
            obj = Collections.unmodifiableSet(k.o0((Iterable) obj));
            M5.g.e(obj, "unmodifiableSet(value.toSet())");
        }
        map.put(dVar, obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return M5.g.a(this.f4297a, ((b) obj).f4297a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4297a.hashCode();
    }

    public final String toString() {
        return k.a0(this.f4297a.entrySet(), ",\n", "{\n", "\n}", a.f4296r, 24);
    }

    public /* synthetic */ b(boolean z7) {
        this(new LinkedHashMap(), z7);
    }
}
