package O3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
/* renamed from: O3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0060d extends AbstractMap {

    /* renamed from: q  reason: collision with root package name */
    public transient C0058b f2660q;

    /* renamed from: r  reason: collision with root package name */
    public transient C0070n f2661r;

    /* renamed from: s  reason: collision with root package name */
    public final transient Map f2662s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ P f2663t;

    public C0060d(P p3, Map map) {
        this.f2663t = p3;
        this.f2662s = map;
    }

    public final A a(Map.Entry entry) {
        C0068l c0068l;
        Object key = entry.getKey();
        P p3 = this.f2663t;
        p3.getClass();
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            c0068l = new C0068l(p3, key, list, null);
        } else {
            c0068l = new C0068l(p3, key, list, null);
        }
        return new A(key, c0068l);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        P p3 = this.f2663t;
        if (this.f2662s == p3.f2617t) {
            p3.b();
            return;
        }
        C0059c c0059c = new C0059c(this);
        while (c0059c.hasNext()) {
            c0059c.next();
            c0059c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f2662s;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0058b c0058b = this.f2660q;
        if (c0058b == null) {
            C0058b c0058b2 = new C0058b(this);
            this.f2660q = c0058b2;
            return c0058b2;
        }
        return c0058b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f2662s.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        C0068l c0068l;
        Map map = this.f2662s;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        P p3 = this.f2663t;
        p3.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            c0068l = new C0068l(p3, obj, list, null);
        } else {
            c0068l = new C0068l(p3, obj, list, null);
        }
        return c0068l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f2662s.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        P p3 = this.f2663t;
        Set set = p3.f2685q;
        if (set == null) {
            Set d = p3.d();
            p3.f2685q = d;
            return d;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f2662s.remove(obj);
        if (collection == null) {
            return null;
        }
        P p3 = this.f2663t;
        List list = (List) p3.f2619v.get();
        list.addAll(collection);
        p3.f2618u -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2662s.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f2662s.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0070n c0070n = this.f2661r;
        if (c0070n == null) {
            C0070n c0070n2 = new C0070n(this);
            this.f2661r = c0070n2;
            return c0070n2;
        }
        return c0070n;
    }
}
