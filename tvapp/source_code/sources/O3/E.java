package O3;

import a.AbstractC0189a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public abstract class E extends AbstractC0081z implements List, RandomAccess {

    /* renamed from: r  reason: collision with root package name */
    public static final C f2597r = new C(U.f2621u, 0);

    public static U o(int i7, Object[] objArr) {
        if (i7 == 0) {
            return U.f2621u;
        }
        return new U(i7, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.y, O3.B] */
    public static B r() {
        return new AbstractC0080y();
    }

    public static E s(Collection collection) {
        if (collection instanceof AbstractC0081z) {
            E b7 = ((AbstractC0081z) collection).b();
            if (b7.l()) {
                Object[] array = b7.toArray(AbstractC0081z.f2716q);
                return o(array.length, array);
            }
            return b7;
        }
        Object[] array2 = collection.toArray();
        AbstractC0072p.b(array2.length, array2);
        return o(array2.length, array2);
    }

    public static U t(Object[] objArr) {
        if (objArr.length == 0) {
            return U.f2621u;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC0072p.b(objArr2.length, objArr2);
        return o(objArr2.length, objArr2);
    }

    public static U v() {
        return U.f2621u;
    }

    public static U w(Long l7, Long l8, Long l9, Long l10, Long l11) {
        Object[] objArr = {l7, l8, l9, l10, l11};
        AbstractC0072p.b(5, objArr);
        return o(5, objArr);
    }

    public static U x(Object obj) {
        Object[] objArr = {obj};
        AbstractC0072p.b(1, objArr);
        return o(1, objArr);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // O3.AbstractC0081z
    public int c(int i7, Object[] objArr) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // O3.AbstractC0081z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (AbstractC0189a.r(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object obj2 : this) {
                    if (it.hasNext()) {
                        if (!AbstractC0189a.r(obj2, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~(get(i8).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // O3.AbstractC0081z, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // O3.AbstractC0081z
    public final i0 n() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u */
    public final C listIterator(int i7) {
        android.support.v4.media.session.b.l(i7, size());
        if (isEmpty()) {
            return f2597r;
        }
        return new C(this, i7);
    }

    @Override // java.util.List
    /* renamed from: y */
    public E subList(int i7, int i8) {
        android.support.v4.media.session.b.m(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == size()) {
            return this;
        }
        if (i9 == 0) {
            return U.f2621u;
        }
        return new D(this, i7, i9);
    }

    @Override // O3.AbstractC0081z
    public final E b() {
        return this;
    }
}
