package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* renamed from: o.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1049b implements Set {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C1052e f12784q;

    public C1049b(C1052e c1052e) {
        this.f12784q = c1052e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12784q.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12784q.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f12784q.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        C1052e c1052e = this.f12784q;
        int i7 = 0;
        for (int i8 = c1052e.f12809s - 1; i8 >= 0; i8--) {
            Object f = c1052e.f(i8);
            if (f == null) {
                hashCode = 0;
            } else {
                hashCode = f.hashCode();
            }
            i7 += hashCode;
        }
        return i7;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12784q.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1048a(this.f12784q, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1052e c1052e = this.f12784q;
        int d = c1052e.d(obj);
        if (d >= 0) {
            c1052e.g(d);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f12784q.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1052e c1052e = this.f12784q;
        int i7 = c1052e.f12809s;
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (!collection.contains(c1052e.f(i8))) {
                c1052e.g(i8);
            }
        }
        if (i7 != c1052e.f12809s) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12784q.f12809s;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1052e c1052e = this.f12784q;
        int i7 = c1052e.f12809s;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1052e.f(i8);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1052e c1052e = this.f12784q;
        int i7 = c1052e.f12809s;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1052e.f(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
