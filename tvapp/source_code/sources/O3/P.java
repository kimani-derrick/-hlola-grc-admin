package O3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
/* loaded from: classes.dex */
public final class P extends AbstractC0071o implements Serializable {

    /* renamed from: t  reason: collision with root package name */
    public transient Map f2617t;

    /* renamed from: u  reason: collision with root package name */
    public transient int f2618u;

    /* renamed from: v  reason: collision with root package name */
    public transient N3.l f2619v;

    @Override // O3.AbstractC0071o
    public final Map a() {
        Map map = this.f2687s;
        if (map == null) {
            Map g7 = g();
            this.f2687s = g7;
            return g7;
        }
        return map;
    }

    @Override // O3.AbstractC0071o
    public final void b() {
        Map map = this.f2617t;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f2618u = 0;
    }

    @Override // O3.AbstractC0071o
    public final Set d() {
        Map map = this.f2617t;
        if (map instanceof NavigableMap) {
            return new C0063g(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new C0066j(this, (SortedMap) map);
        }
        return new C0061e(this, map);
    }

    @Override // O3.AbstractC0071o
    public final int e() {
        return this.f2618u;
    }

    @Override // O3.AbstractC0071o
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // O3.AbstractC0071o
    public final Iterator f() {
        return new C0057a(this);
    }

    public final Map g() {
        Map map = this.f2617t;
        if (map instanceof NavigableMap) {
            return new C0062f(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new C0065i(this, (SortedMap) map);
        }
        return new C0060d(this, map);
    }

    public final Collection h() {
        return new C0070n(0, this);
    }

    public final boolean i(Object obj, Object obj2) {
        Map map = this.f2617t;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            List list = (List) this.f2619v.get();
            if (list.add(obj2)) {
                this.f2618u++;
                map.put(obj, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.f2618u++;
            return true;
        } else {
            return false;
        }
    }

    public final Collection j() {
        Collection collection = this.f2686r;
        if (collection == null) {
            Collection h7 = h();
            this.f2686r = h7;
            return h7;
        }
        return collection;
    }
}
