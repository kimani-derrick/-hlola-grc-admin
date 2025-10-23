package B5;

import A5.j;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import r0.AbstractC1111a;
import w4.l0;
/* loaded from: classes.dex */
public final class b extends A5.f implements RandomAccess, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final b f282w;

    /* renamed from: q  reason: collision with root package name */
    public Object[] f283q;

    /* renamed from: r  reason: collision with root package name */
    public final int f284r;

    /* renamed from: s  reason: collision with root package name */
    public int f285s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f286t;

    /* renamed from: u  reason: collision with root package name */
    public final b f287u;

    /* renamed from: v  reason: collision with root package name */
    public final b f288v;

    static {
        b bVar = new b(0);
        bVar.f286t = true;
        f282w = bVar;
    }

    public b() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        n();
        l();
        int i8 = this.f285s;
        if (i7 >= 0 && i7 <= i8) {
            h(this.f284r + i7, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        M5.g.f(collection, "elements");
        n();
        l();
        int i8 = this.f285s;
        if (i7 >= 0 && i7 <= i8) {
            int size = collection.size();
            g(this.f284r + i7, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "index: ", ", size: "));
    }

    @Override // A5.f
    public final int b() {
        l();
        return this.f285s;
    }

    @Override // A5.f
    public final Object c(int i7) {
        n();
        l();
        int i8 = this.f285s;
        if (i7 >= 0 && i7 < i8) {
            return r(this.f284r + i7);
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        n();
        l();
        s(this.f284r, this.f285s);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        l();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f283q;
            int i7 = this.f285s;
            if (i7 != list.size()) {
                return false;
            }
            for (int i8 = 0; i8 < i7; i8++) {
                if (!M5.g.a(objArr[this.f284r + i8], list.get(i8))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void g(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        b bVar = this.f287u;
        if (bVar != null) {
            bVar.g(i7, collection, i8);
            this.f283q = bVar.f283q;
            this.f285s += i8;
            return;
        }
        o(i7, i8);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f283q[i7 + i9] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        l();
        int i8 = this.f285s;
        if (i7 >= 0 && i7 < i8) {
            return this.f283q[this.f284r + i7];
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "index: ", ", size: "));
    }

    public final void h(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f287u;
        if (bVar != null) {
            bVar.h(i7, obj);
            this.f283q = bVar.f283q;
            this.f285s++;
            return;
        }
        o(i7, 1);
        this.f283q[i7] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7;
        l();
        Object[] objArr = this.f283q;
        int i8 = this.f285s;
        int i9 = 1;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[this.f284r + i10];
            int i11 = i9 * 31;
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i9 = i11 + i7;
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        l();
        for (int i7 = 0; i7 < this.f285s; i7++) {
            if (M5.g.a(this.f283q[this.f284r + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        l();
        if (this.f285s == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void l() {
        b bVar = this.f288v;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        l();
        for (int i7 = this.f285s - 1; i7 >= 0; i7--) {
            if (M5.g.a(this.f283q[this.f284r + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void n() {
        b bVar;
        if (!this.f286t && ((bVar = this.f288v) == null || !bVar.f286t)) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void o(int i7, int i8) {
        int i9 = this.f285s + i8;
        if (i9 >= 0) {
            Object[] objArr = this.f283q;
            if (i9 > objArr.length) {
                int length = objArr.length;
                int i10 = length + (length >> 1);
                if (i10 - i9 < 0) {
                    i10 = i9;
                }
                if (i10 - 2147483639 > 0) {
                    if (i9 > 2147483639) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr, i10);
                M5.g.e(copyOf, "copyOf(...)");
                this.f283q = copyOf;
            }
            Object[] objArr2 = this.f283q;
            j.Q(i7 + i8, i7, this.f284r + this.f285s, objArr2, objArr2);
            this.f285s += i8;
            return;
        }
        throw new OutOfMemoryError();
    }

    public final Object r(int i7) {
        int i8;
        ((AbstractList) this).modCount++;
        b bVar = this.f287u;
        if (bVar != null) {
            this.f285s--;
            return bVar.r(i7);
        }
        Object[] objArr = this.f283q;
        Object obj = objArr[i7];
        j.Q(i7, i7 + 1, this.f285s + this.f284r, objArr, objArr);
        Object[] objArr2 = this.f283q;
        M5.g.f(objArr2, "<this>");
        objArr2[(i8 + this.f285s) - 1] = null;
        this.f285s--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        n();
        l();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        M5.g.f(collection, "elements");
        n();
        l();
        if (t(this.f284r, this.f285s, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        M5.g.f(collection, "elements");
        n();
        l();
        if (t(this.f284r, this.f285s, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public final void s(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f287u;
        if (bVar != null) {
            bVar.s(i7, i8);
        } else {
            Object[] objArr = this.f283q;
            j.Q(i7, i7 + i8, this.f285s, objArr, objArr);
            Object[] objArr2 = this.f283q;
            int i9 = this.f285s;
            l0.N(objArr2, i9 - i8, i9);
        }
        this.f285s -= i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        n();
        l();
        int i8 = this.f285s;
        if (i7 >= 0 && i7 < i8) {
            Object[] objArr = this.f283q;
            int i9 = this.f284r;
            Object obj2 = objArr[i9 + i7];
            objArr[i9 + i7] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        b bVar;
        h4.b.f(i7, i8, this.f285s);
        Object[] objArr = this.f283q;
        int i9 = this.f284r + i7;
        int i10 = i8 - i7;
        boolean z7 = this.f286t;
        b bVar2 = this.f288v;
        if (bVar2 == null) {
            bVar = this;
        } else {
            bVar = bVar2;
        }
        return new b(objArr, i9, i10, z7, this, bVar);
    }

    public final int t(int i7, int i8, Collection collection, boolean z7) {
        int i9;
        b bVar = this.f287u;
        if (bVar != null) {
            i9 = bVar.t(i7, i8, collection, z7);
        } else {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8) {
                int i12 = i7 + i10;
                if (collection.contains(this.f283q[i12]) == z7) {
                    Object[] objArr = this.f283q;
                    i10++;
                    objArr[i11 + i7] = objArr[i12];
                    i11++;
                } else {
                    i10++;
                }
            }
            int i13 = i8 - i11;
            Object[] objArr2 = this.f283q;
            j.Q(i7 + i11, i8 + i7, this.f285s, objArr2, objArr2);
            Object[] objArr3 = this.f283q;
            int i14 = this.f285s;
            l0.N(objArr3, i14 - i13, i14);
            i9 = i13;
        }
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f285s -= i9;
        return i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        l();
        Object[] objArr = this.f283q;
        int i7 = this.f285s;
        int i8 = this.f284r;
        return j.T(objArr, i8, i7 + i8);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        l();
        Object[] objArr = this.f283q;
        int i7 = this.f285s;
        StringBuilder sb = new StringBuilder((i7 * 3) + 2);
        sb.append("[");
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.f284r + i8];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        M5.g.e(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i7) {
        this(new Object[i7], 0, 0, false, null, null);
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        l();
        int i8 = this.f285s;
        if (i7 >= 0 && i7 <= i8) {
            return new a(this, i7);
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        M5.g.f(objArr, "destination");
        l();
        int length = objArr.length;
        int i7 = this.f285s;
        int i8 = this.f284r;
        if (length < i7) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f283q, i8, i7 + i8, objArr.getClass());
            M5.g.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        j.Q(0, i8, i7 + i8, this.f283q, objArr);
        int i9 = this.f285s;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    public b(Object[] objArr, int i7, int i8, boolean z7, b bVar, b bVar2) {
        this.f283q = objArr;
        this.f284r = i7;
        this.f285s = i8;
        this.f286t = z7;
        this.f287u = bVar;
        this.f288v = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        n();
        l();
        h(this.f284r + this.f285s, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        M5.g.f(collection, "elements");
        n();
        l();
        int size = collection.size();
        g(this.f284r + this.f285s, collection, size);
        return size > 0;
    }
}
