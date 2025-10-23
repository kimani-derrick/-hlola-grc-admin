package B5;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class a implements ListIterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final b f278q;

    /* renamed from: r  reason: collision with root package name */
    public int f279r;

    /* renamed from: s  reason: collision with root package name */
    public int f280s;

    /* renamed from: t  reason: collision with root package name */
    public int f281t;

    public a(b bVar, int i7) {
        int i8;
        M5.g.f(bVar, "list");
        this.f278q = bVar;
        this.f279r = i7;
        this.f280s = -1;
        i8 = ((AbstractList) bVar).modCount;
        this.f281t = i8;
    }

    public final void a() {
        int i7;
        i7 = ((AbstractList) this.f278q).modCount;
        if (i7 == this.f281t) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i7;
        a();
        int i8 = this.f279r;
        this.f279r = i8 + 1;
        b bVar = this.f278q;
        bVar.add(i8, obj);
        this.f280s = -1;
        i7 = ((AbstractList) bVar).modCount;
        this.f281t = i7;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f279r < this.f278q.f285s) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f279r > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i7 = this.f279r;
        b bVar = this.f278q;
        if (i7 < bVar.f285s) {
            this.f279r = i7 + 1;
            this.f280s = i7;
            return bVar.f283q[bVar.f284r + i7];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f279r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i7 = this.f279r;
        if (i7 > 0) {
            int i8 = i7 - 1;
            this.f279r = i8;
            this.f280s = i8;
            b bVar = this.f278q;
            return bVar.f283q[bVar.f284r + i8];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f279r - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i7;
        a();
        int i8 = this.f280s;
        if (i8 != -1) {
            b bVar = this.f278q;
            bVar.c(i8);
            this.f279r = this.f280s;
            this.f280s = -1;
            i7 = ((AbstractList) bVar).modCount;
            this.f281t = i7;
            return;
        }
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i7 = this.f280s;
        if (i7 != -1) {
            this.f278q.set(i7, obj);
            return;
        }
        throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
    }
}
