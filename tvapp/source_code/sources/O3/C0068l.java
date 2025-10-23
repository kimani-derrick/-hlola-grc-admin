package O3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: O3.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0068l extends AbstractCollection implements List {

    /* renamed from: q  reason: collision with root package name */
    public final Object f2677q;

    /* renamed from: r  reason: collision with root package name */
    public Collection f2678r;

    /* renamed from: s  reason: collision with root package name */
    public final C0068l f2679s;

    /* renamed from: t  reason: collision with root package name */
    public final Collection f2680t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ P f2681u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ P f2682v;

    public C0068l(P p3, Object obj, List list, C0068l c0068l) {
        Collection collection;
        this.f2682v = p3;
        this.f2681u = p3;
        this.f2677q = obj;
        this.f2678r = list;
        this.f2679s = c0068l;
        if (c0068l == null) {
            collection = null;
        } else {
            collection = c0068l.f2678r;
        }
        this.f2680t = collection;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        c();
        boolean isEmpty = this.f2678r.isEmpty();
        ((List) this.f2678r).add(i7, obj);
        this.f2682v.f2618u++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f2678r).addAll(i7, collection);
        if (addAll) {
            this.f2682v.f2618u += this.f2678r.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        C0068l c0068l = this.f2679s;
        if (c0068l != null) {
            c0068l.b();
        } else {
            this.f2681u.f2617t.put(this.f2677q, this.f2678r);
        }
    }

    public final void c() {
        Collection collection;
        C0068l c0068l = this.f2679s;
        if (c0068l != null) {
            c0068l.c();
            if (c0068l.f2678r != this.f2680t) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f2678r.isEmpty() && (collection = (Collection) this.f2681u.f2617t.get(this.f2677q)) != null) {
            this.f2678r = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f2678r.clear();
        this.f2681u.f2618u -= size;
        f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        c();
        return this.f2678r.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        c();
        return this.f2678r.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f2678r.equals(obj);
    }

    public final void f() {
        C0068l c0068l = this.f2679s;
        if (c0068l != null) {
            c0068l.f();
        } else if (this.f2678r.isEmpty()) {
            this.f2681u.f2617t.remove(this.f2677q);
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        c();
        return ((List) this.f2678r).get(i7);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        c();
        return this.f2678r.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f2678r).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        c();
        return new C0059c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f2678r).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new C0067k(this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        c();
        Object remove = ((List) this.f2678r).remove(i7);
        P p3 = this.f2682v;
        p3.f2618u--;
        f();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f2678r.removeAll(collection);
        if (removeAll) {
            this.f2681u.f2618u += this.f2678r.size() - size;
            f();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f2678r.retainAll(collection);
        if (retainAll) {
            this.f2681u.f2618u += this.f2678r.size() - size;
            f();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        c();
        return ((List) this.f2678r).set(i7, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        c();
        return this.f2678r.size();
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        c();
        List subList = ((List) this.f2678r).subList(i7, i8);
        C0068l c0068l = this.f2679s;
        if (c0068l == null) {
            c0068l = this;
        }
        P p3 = this.f2682v;
        p3.getClass();
        boolean z7 = subList instanceof RandomAccess;
        Object obj = this.f2677q;
        if (z7) {
            return new C0068l(p3, obj, subList, c0068l);
        }
        return new C0068l(p3, obj, subList, c0068l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f2678r.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        c();
        return new C0067k(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        boolean remove = this.f2678r.remove(obj);
        if (remove) {
            P p3 = this.f2681u;
            p3.f2618u--;
            f();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.f2678r.isEmpty();
        boolean add = this.f2678r.add(obj);
        if (add) {
            this.f2681u.f2618u++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f2678r.addAll(collection);
        if (addAll) {
            this.f2681u.f2618u += this.f2678r.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }
}
