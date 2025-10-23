package O3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: O3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0061e extends g0 {

    /* renamed from: q  reason: collision with root package name */
    public final Map f2666q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ P f2667r;

    public C0061e(P p3, Map map) {
        this.f2667r = p3;
        map.getClass();
        this.f2666q = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0059c c0059c = (C0059c) it;
            if (c0059c.hasNext()) {
                c0059c.next();
                c0059c.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2666q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f2666q.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f2666q.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2666q.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2666q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0059c(this, this.f2666q.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f2666q.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f2667r.f2618u -= size;
            if (size > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2666q.size();
    }
}
