package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p.AbstractC1078a;
/* renamed from: o.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1053f implements Collection, Set, N5.b {

    /* renamed from: q  reason: collision with root package name */
    public int[] f12793q = AbstractC1078a.f13098a;

    /* renamed from: r  reason: collision with root package name */
    public Object[] f12794r = AbstractC1078a.f13099b;

    /* renamed from: s  reason: collision with root package name */
    public int f12795s;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int b7;
        boolean z7;
        int i8 = this.f12795s;
        if (obj == null) {
            b7 = h.b(this, null, 0);
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            b7 = h.b(this, obj, hashCode);
        }
        if (b7 >= 0) {
            return false;
        }
        int i9 = ~b7;
        int[] iArr = this.f12793q;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f12794r;
            int[] iArr2 = new int[i10];
            this.f12793q = iArr2;
            this.f12794r = new Object[i10];
            if (i8 == this.f12795s) {
                if (iArr2.length == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    A5.j.P(0, 0, iArr.length, iArr, iArr2);
                    A5.j.R(0, objArr.length, 6, objArr, this.f12794r);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i8) {
            int[] iArr3 = this.f12793q;
            int i11 = i9 + 1;
            A5.j.P(i11, i9, i8, iArr3, iArr3);
            Object[] objArr2 = this.f12794r;
            A5.j.Q(i11, i9, i8, objArr2, objArr2);
        }
        int i12 = this.f12795s;
        if (i8 == i12) {
            int[] iArr4 = this.f12793q;
            if (i9 < iArr4.length) {
                iArr4[i9] = i7;
                this.f12794r[i9] = obj;
                this.f12795s = i12 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        M5.g.f(collection, "elements");
        int size = collection.size() + this.f12795s;
        int i7 = this.f12795s;
        int[] iArr = this.f12793q;
        boolean z7 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f12794r;
            int[] iArr2 = new int[size];
            this.f12793q = iArr2;
            this.f12794r = new Object[size];
            int i8 = this.f12795s;
            if (i8 > 0) {
                A5.j.P(0, 0, i8, iArr, iArr2);
                A5.j.R(0, this.f12795s, 6, objArr, this.f12794r);
            }
        }
        if (this.f12795s == i7) {
            for (Object obj : collection) {
                z7 |= add(obj);
            }
            return z7;
        }
        throw new ConcurrentModificationException();
    }

    public final Object b(int i7) {
        int i8 = this.f12795s;
        Object[] objArr = this.f12794r;
        Object obj = objArr[i7];
        if (i8 <= 1) {
            clear();
        } else {
            int i9 = i8 - 1;
            int[] iArr = this.f12793q;
            int i10 = 8;
            if (iArr.length > 8 && i8 < iArr.length / 3) {
                if (i8 > 8) {
                    i10 = i8 + (i8 >> 1);
                }
                int[] iArr2 = new int[i10];
                this.f12793q = iArr2;
                this.f12794r = new Object[i10];
                if (i7 > 0) {
                    A5.j.P(0, 0, i7, iArr, iArr2);
                    A5.j.R(0, i7, 6, objArr, this.f12794r);
                }
                if (i7 < i9) {
                    int i11 = i7 + 1;
                    A5.j.P(i7, i11, i8, iArr, this.f12793q);
                    A5.j.Q(i7, i11, i8, objArr, this.f12794r);
                }
            } else {
                if (i7 < i9) {
                    int i12 = i7 + 1;
                    A5.j.P(i7, i12, i8, iArr, iArr);
                    Object[] objArr2 = this.f12794r;
                    A5.j.Q(i7, i12, i8, objArr2, objArr2);
                }
                this.f12794r[i9] = null;
            }
            if (i8 == this.f12795s) {
                this.f12795s = i9;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f12795s != 0) {
            this.f12793q = AbstractC1078a.f13098a;
            this.f12794r = AbstractC1078a.f13099b;
            this.f12795s = 0;
        }
        if (this.f12795s == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int b7;
        if (obj == null) {
            b7 = h.b(this, null, 0);
        } else {
            b7 = h.b(this, obj, obj.hashCode());
        }
        if (b7 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        M5.g.f(collection, "elements");
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f12795s == ((Set) obj).size()) {
            try {
                int i7 = this.f12795s;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (((Set) obj).contains(this.f12794r[i8])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f12793q;
        int i7 = this.f12795s;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f12795s <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1048a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b7;
        if (obj == null) {
            b7 = h.b(this, null, 0);
        } else {
            b7 = h.b(this, obj, obj.hashCode());
        }
        if (b7 < 0) {
            return false;
        }
        b(b7);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        M5.g.f(collection, "elements");
        boolean z7 = false;
        for (Object obj : collection) {
            z7 |= remove(obj);
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        M5.g.f(collection, "elements");
        boolean z7 = false;
        for (int i7 = this.f12795s - 1; -1 < i7; i7--) {
            if (!A5.k.T(collection, this.f12794r[i7])) {
                b(i7);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f12795s;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return A5.j.T(this.f12794r, 0, this.f12795s);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12795s * 14);
        sb.append('{');
        int i7 = this.f12795s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f12794r[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        M5.g.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        M5.g.f(objArr, "array");
        int i7 = this.f12795s;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        } else if (objArr.length > i7) {
            objArr[i7] = null;
        }
        A5.j.Q(0, 0, this.f12795s, this.f12794r, objArr);
        return objArr;
    }
}
