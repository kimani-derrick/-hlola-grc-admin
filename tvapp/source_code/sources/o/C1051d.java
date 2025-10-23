package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: o.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051d implements Collection {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C1052e f12789q;

    public C1051d(C1052e c1052e) {
        this.f12789q = c1052e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f12789q.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f12789q.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12789q.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1048a(this.f12789q, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1052e c1052e = this.f12789q;
        int a7 = c1052e.a(obj);
        if (a7 >= 0) {
            c1052e.g(a7);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1052e c1052e = this.f12789q;
        int i7 = c1052e.f12809s;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < i7) {
            if (collection.contains(c1052e.i(i8))) {
                c1052e.g(i8);
                i8--;
                i7--;
                z7 = true;
            }
            i8++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1052e c1052e = this.f12789q;
        int i7 = c1052e.f12809s;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < i7) {
            if (!collection.contains(c1052e.i(i8))) {
                c1052e.g(i8);
                i8--;
                i7--;
                z7 = true;
            }
            i8++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12789q.f12809s;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1052e c1052e = this.f12789q;
        int i7 = c1052e.f12809s;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1052e.i(i8);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1052e c1052e = this.f12789q;
        int i7 = c1052e.f12809s;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1052e.i(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
