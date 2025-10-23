package A5;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: t  reason: collision with root package name */
    public static final Object[] f128t = new Object[0];

    /* renamed from: q  reason: collision with root package name */
    public int f129q;

    /* renamed from: r  reason: collision with root package name */
    public Object[] f130r = f128t;

    /* renamed from: s  reason: collision with root package name */
    public int f131s;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        int i9 = this.f131s;
        if (i7 < 0 || i7 > i9) {
            throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i9, "index: ", ", size: "));
        }
        if (i7 == i9) {
            g(obj);
        } else if (i7 == 0) {
            f(obj);
        } else {
            l(i9 + 1);
            int r3 = r(this.f129q + i7);
            int i10 = this.f131s;
            if (i7 < ((i10 + 1) >> 1)) {
                if (r3 == 0) {
                    Object[] objArr = this.f130r;
                    M5.g.f(objArr, "<this>");
                    r3 = objArr.length;
                }
                int i11 = r3 - 1;
                int i12 = this.f129q;
                if (i12 == 0) {
                    Object[] objArr2 = this.f130r;
                    M5.g.f(objArr2, "<this>");
                    i8 = objArr2.length - 1;
                } else {
                    i8 = i12 - 1;
                }
                int i13 = this.f129q;
                Object[] objArr3 = this.f130r;
                if (i11 >= i13) {
                    objArr3[i8] = objArr3[i13];
                    j.Q(i13, i13 + 1, i11 + 1, objArr3, objArr3);
                } else {
                    j.Q(i13 - 1, i13, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f130r;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    j.Q(0, 1, i11 + 1, objArr4, objArr4);
                }
                this.f130r[i11] = obj;
                this.f129q = i8;
            } else {
                int r5 = r(i10 + this.f129q);
                Object[] objArr5 = this.f130r;
                if (r3 < r5) {
                    j.Q(r3 + 1, r3, r5, objArr5, objArr5);
                } else {
                    j.Q(1, 0, r5, objArr5, objArr5);
                    Object[] objArr6 = this.f130r;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    j.Q(r3 + 1, r3, objArr6.length - 1, objArr6, objArr6);
                }
                this.f130r[r3] = obj;
            }
            this.f131s++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        M5.g.f(collection, "elements");
        int i8 = this.f131s;
        if (i7 >= 0 && i7 <= i8) {
            if (collection.isEmpty()) {
                return false;
            }
            int i9 = this.f131s;
            if (i7 == i9) {
                return addAll(collection);
            }
            l(collection.size() + i9);
            int r3 = r(this.f131s + this.f129q);
            int r5 = r(this.f129q + i7);
            int size = collection.size();
            if (i7 < ((this.f131s + 1) >> 1)) {
                int i10 = this.f129q;
                int i11 = i10 - size;
                if (r5 < i10) {
                    Object[] objArr = this.f130r;
                    j.Q(i11, i10, objArr.length, objArr, objArr);
                    Object[] objArr2 = this.f130r;
                    if (size >= r5) {
                        j.Q(objArr2.length - size, 0, r5, objArr2, objArr2);
                    } else {
                        j.Q(objArr2.length - size, 0, size, objArr2, objArr2);
                        Object[] objArr3 = this.f130r;
                        j.Q(0, size, r5, objArr3, objArr3);
                    }
                } else if (i11 >= 0) {
                    Object[] objArr4 = this.f130r;
                    j.Q(i11, i10, r5, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f130r;
                    i11 += objArr5.length;
                    int i12 = r5 - i10;
                    int length = objArr5.length - i11;
                    if (length >= i12) {
                        j.Q(i11, i10, r5, objArr5, objArr5);
                    } else {
                        j.Q(i11, i10, i10 + length, objArr5, objArr5);
                        Object[] objArr6 = this.f130r;
                        j.Q(0, this.f129q + length, r5, objArr6, objArr6);
                    }
                }
                this.f129q = i11;
                r5 -= size;
                if (r5 < 0) {
                    r5 += this.f130r.length;
                }
            } else {
                int i13 = r5 + size;
                if (r5 < r3) {
                    int i14 = size + r3;
                    Object[] objArr7 = this.f130r;
                    if (i14 > objArr7.length) {
                        if (i13 >= objArr7.length) {
                            i13 -= objArr7.length;
                        } else {
                            int length2 = r3 - (i14 - objArr7.length);
                            j.Q(0, length2, r3, objArr7, objArr7);
                            Object[] objArr8 = this.f130r;
                            j.Q(i13, r5, length2, objArr8, objArr8);
                        }
                    }
                    j.Q(i13, r5, r3, objArr7, objArr7);
                } else {
                    Object[] objArr9 = this.f130r;
                    j.Q(size, 0, r3, objArr9, objArr9);
                    Object[] objArr10 = this.f130r;
                    if (i13 >= objArr10.length) {
                        j.Q(i13 - objArr10.length, r5, objArr10.length, objArr10, objArr10);
                    } else {
                        j.Q(0, objArr10.length - size, objArr10.length, objArr10, objArr10);
                        Object[] objArr11 = this.f130r;
                        j.Q(i13, r5, objArr11.length - size, objArr11, objArr11);
                    }
                }
            }
            h(r5, collection);
            return true;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "index: ", ", size: "));
    }

    @Override // A5.f
    public final int b() {
        return this.f131s;
    }

    @Override // A5.f
    public final Object c(int i7) {
        int i8 = this.f131s;
        if (i7 >= 0 && i7 < i8) {
            if (i7 == l.K(this)) {
                return t();
            }
            if (i7 == 0) {
                return s();
            }
            int r3 = r(this.f129q + i7);
            Object[] objArr = this.f130r;
            Object obj = objArr[r3];
            if (i7 < (this.f131s >> 1)) {
                int i9 = this.f129q;
                if (r3 >= i9) {
                    j.Q(i9 + 1, i9, r3, objArr, objArr);
                } else {
                    j.Q(1, 0, r3, objArr, objArr);
                    Object[] objArr2 = this.f130r;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i10 = this.f129q;
                    j.Q(i10 + 1, i10, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f130r;
                int i11 = this.f129q;
                objArr3[i11] = null;
                this.f129q = n(i11);
            } else {
                int r5 = r(l.K(this) + this.f129q);
                Object[] objArr4 = this.f130r;
                int i12 = r3 + 1;
                if (r3 <= r5) {
                    j.Q(r3, i12, r5 + 1, objArr4, objArr4);
                } else {
                    j.Q(r3, i12, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f130r;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    j.Q(0, 1, r5 + 1, objArr5, objArr5);
                }
                this.f130r[r5] = null;
            }
            this.f131s--;
            return obj;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int r3 = r(this.f131s + this.f129q);
        int i7 = this.f129q;
        if (i7 < r3) {
            j.U(this.f130r, i7, r3);
        } else if (!isEmpty()) {
            Object[] objArr = this.f130r;
            j.U(objArr, this.f129q, objArr.length);
            j.U(this.f130r, 0, r3);
        }
        this.f129q = 0;
        this.f131s = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void f(Object obj) {
        l(this.f131s + 1);
        int i7 = this.f129q;
        if (i7 == 0) {
            Object[] objArr = this.f130r;
            M5.g.f(objArr, "<this>");
            i7 = objArr.length;
        }
        int i8 = i7 - 1;
        this.f129q = i8;
        this.f130r[i8] = obj;
        this.f131s++;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f130r[this.f129q];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void g(Object obj) {
        l(b() + 1);
        this.f130r[r(b() + this.f129q)] = obj;
        this.f131s = b() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int b7 = b();
        if (i7 >= 0 && i7 < b7) {
            return this.f130r[r(this.f129q + i7)];
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, b7, "index: ", ", size: "));
    }

    public final void h(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f130r.length;
        while (i7 < length && it.hasNext()) {
            this.f130r[i7] = it.next();
            i7++;
        }
        int i8 = this.f129q;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f130r[i9] = it.next();
        }
        this.f131s = collection.size() + b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int r3 = r(b() + this.f129q);
        int i7 = this.f129q;
        if (i7 < r3) {
            while (i7 < r3) {
                if (!M5.g.a(obj, this.f130r[i7])) {
                    i7++;
                }
            }
            return -1;
        } else if (i7 >= r3) {
            int length = this.f130r.length;
            while (true) {
                if (i7 < length) {
                    if (M5.g.a(obj, this.f130r[i7])) {
                        break;
                    }
                    i7++;
                } else {
                    for (int i8 = 0; i8 < r3; i8++) {
                        if (M5.g.a(obj, this.f130r[i8])) {
                            i7 = i8 + this.f130r.length;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i7 - this.f129q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final void l(int i7) {
        if (i7 >= 0) {
            Object[] objArr = this.f130r;
            if (i7 <= objArr.length) {
                return;
            }
            if (objArr == f128t) {
                if (i7 < 10) {
                    i7 = 10;
                }
                this.f130r = new Object[i7];
                return;
            }
            int length = objArr.length;
            int i8 = length + (length >> 1);
            if (i8 - i7 < 0) {
                i8 = i7;
            }
            if (i8 - 2147483639 > 0) {
                if (i7 > 2147483639) {
                    i8 = Integer.MAX_VALUE;
                } else {
                    i8 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i8];
            j.Q(0, this.f129q, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f130r;
            int length2 = objArr3.length;
            int i9 = this.f129q;
            j.Q(length2 - i9, 0, i9, objArr3, objArr2);
            this.f129q = 0;
            this.f130r = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f130r[r(l.K(this) + this.f129q)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int r3 = r(this.f131s + this.f129q);
        int i7 = this.f129q;
        if (i7 < r3) {
            length = r3 - 1;
            if (i7 <= length) {
                while (!M5.g.a(obj, this.f130r[length])) {
                    if (length != i7) {
                        length--;
                    }
                }
                return length - this.f129q;
            }
            return -1;
        }
        if (i7 > r3) {
            int i8 = r3 - 1;
            while (true) {
                if (-1 < i8) {
                    if (M5.g.a(obj, this.f130r[i8])) {
                        length = i8 + this.f130r.length;
                        break;
                    }
                    i8--;
                } else {
                    Object[] objArr = this.f130r;
                    M5.g.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i9 = this.f129q;
                    if (i9 <= length) {
                        while (!M5.g.a(obj, this.f130r[length])) {
                            if (length != i9) {
                                length--;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public final int n(int i7) {
        Object[] objArr = this.f130r;
        M5.g.f(objArr, "<this>");
        if (i7 == objArr.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final Object o() {
        if (isEmpty()) {
            return null;
        }
        return this.f130r[r(l.K(this) + this.f129q)];
    }

    public final int r(int i7) {
        Object[] objArr = this.f130r;
        if (i7 >= objArr.length) {
            return i7 - objArr.length;
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int r3;
        M5.g.f(collection, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f130r.length != 0) {
            int r5 = r(this.f131s + this.f129q);
            int i7 = this.f129q;
            if (i7 < r5) {
                r3 = i7;
                while (i7 < r5) {
                    Object obj = this.f130r[i7];
                    if (!collection.contains(obj)) {
                        this.f130r[r3] = obj;
                        r3++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                j.U(this.f130r, r3, r5);
            } else {
                int length = this.f130r.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f130r;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (!collection.contains(obj2)) {
                        this.f130r[i8] = obj2;
                        i8++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                r3 = r(i8);
                for (int i9 = 0; i9 < r5; i9++) {
                    Object[] objArr2 = this.f130r;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (!collection.contains(obj3)) {
                        this.f130r[r3] = obj3;
                        r3 = n(r3);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                int i10 = r3 - this.f129q;
                if (i10 < 0) {
                    i10 += this.f130r.length;
                }
                this.f131s = i10;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int r3;
        M5.g.f(collection, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f130r.length != 0) {
            int r5 = r(this.f131s + this.f129q);
            int i7 = this.f129q;
            if (i7 < r5) {
                r3 = i7;
                while (i7 < r5) {
                    Object obj = this.f130r[i7];
                    if (collection.contains(obj)) {
                        this.f130r[r3] = obj;
                        r3++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                j.U(this.f130r, r3, r5);
            } else {
                int length = this.f130r.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f130r;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f130r[i8] = obj2;
                        i8++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                r3 = r(i8);
                for (int i9 = 0; i9 < r5; i9++) {
                    Object[] objArr2 = this.f130r;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f130r[r3] = obj3;
                        r3 = n(r3);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                int i10 = r3 - this.f129q;
                if (i10 < 0) {
                    i10 += this.f130r.length;
                }
                this.f131s = i10;
            }
        }
        return z7;
    }

    public final Object s() {
        if (!isEmpty()) {
            Object[] objArr = this.f130r;
            int i7 = this.f129q;
            Object obj = objArr[i7];
            objArr[i7] = null;
            this.f129q = n(i7);
            this.f131s = b() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int b7 = b();
        if (i7 >= 0 && i7 < b7) {
            int r3 = r(this.f129q + i7);
            Object[] objArr = this.f130r;
            Object obj2 = objArr[r3];
            objArr[r3] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, b7, "index: ", ", size: "));
    }

    public final Object t() {
        if (!isEmpty()) {
            int r3 = r(l.K(this) + this.f129q);
            Object[] objArr = this.f130r;
            Object obj = objArr[r3];
            objArr[r3] = null;
            this.f131s = b() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        M5.g.f(objArr, "array");
        int length = objArr.length;
        int i7 = this.f131s;
        if (length < i7) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
            M5.g.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int r3 = r(this.f131s + this.f129q);
        int i8 = this.f129q;
        if (i8 < r3) {
            j.R(i8, r3, 2, this.f130r, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f130r;
            j.Q(0, this.f129q, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f130r;
            j.Q(objArr3.length - this.f129q, 0, r3, objArr3, objArr);
        }
        int i9 = this.f131s;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        M5.g.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        l(collection.size() + b());
        h(r(b() + this.f129q), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g(obj);
        return true;
    }
}
