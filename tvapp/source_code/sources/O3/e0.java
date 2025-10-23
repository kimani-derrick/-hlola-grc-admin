package O3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
/* loaded from: classes.dex */
public class e0 extends AbstractCollection implements Set {

    /* renamed from: q  reason: collision with root package name */
    public final Collection f2668q;

    /* renamed from: r  reason: collision with root package name */
    public final N3.h f2669r;

    public e0(Set set, N3.h hVar) {
        this.f2668q = set;
        this.f2669r = hVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f2669r.apply(obj)) {
            return this.f2668q.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            if (!this.f2669r.apply(obj)) {
                throw new IllegalArgumentException();
            }
        }
        return this.f2668q.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Collection collection = this.f2668q;
        boolean z7 = collection instanceof RandomAccess;
        N3.h hVar = this.f2669r;
        if (z7 && (collection instanceof List)) {
            List list = (List) collection;
            hVar.getClass();
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                Object obj = list.get(i8);
                if (!hVar.apply(obj)) {
                    if (i8 > i7) {
                        try {
                            list.set(i7, obj);
                        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                            AbstractC0072p.o(list, hVar, i7, i8);
                            return;
                        }
                    }
                    i7++;
                }
            }
            list.subList(i7, list.size()).clear();
            return;
        }
        Iterator it = collection.iterator();
        hVar.getClass();
        while (it.hasNext()) {
            if (hVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Collection collection = this.f2668q;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f2669r.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC0072p.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC0072p.j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f2668q.iterator();
        N3.h hVar = this.f2669r;
        android.support.v4.media.session.b.k(hVar, "predicate");
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (hVar.apply(it.next())) {
                if (i7 != -1) {
                    z7 = true;
                }
            } else {
                i7++;
            }
        }
        return !z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f2668q.iterator();
        it.getClass();
        N3.h hVar = this.f2669r;
        hVar.getClass();
        return new I(it, hVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f2668q.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f2668q.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f2669r.apply(next) && collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f2668q.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f2669r.apply(next) && !collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i7 = 0;
        for (Object obj : this.f2668q) {
            if (this.f2669r.apply(obj)) {
                i7++;
            }
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0072p.m(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0072p.m(iterator()).toArray(objArr);
    }
}
