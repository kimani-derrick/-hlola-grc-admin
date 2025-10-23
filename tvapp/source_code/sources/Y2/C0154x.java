package Y2;

import O3.AbstractC0072p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: Y2.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154x implements Map {

    /* renamed from: q  reason: collision with root package name */
    public final Map f4468q;

    public C0154x(Map map) {
        this.f4468q = map;
    }

    public final boolean a(Object obj) {
        Iterator it = entrySet().iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f4468q.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f4468q.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC0072p.h(this.f4468q.entrySet(), new C0153w(1));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && AbstractC0072p.f(this, obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f4468q.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0072p.j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f4468q;
        if (map.isEmpty()) {
            return true;
        }
        if (map.size() == 1 && map.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC0072p.h(this.f4468q.keySet(), new C0153w(0));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f4468q.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f4468q.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f4468q.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f4468q;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f4468q.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f4468q.values();
    }
}
