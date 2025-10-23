package O3;

import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class C extends i0 implements ListIterator {

    /* renamed from: q  reason: collision with root package name */
    public final int f2591q;

    /* renamed from: r  reason: collision with root package name */
    public int f2592r;

    /* renamed from: s  reason: collision with root package name */
    public final E f2593s;

    public C(E e3, int i7) {
        int size = e3.size();
        android.support.v4.media.session.b.l(i7, size);
        this.f2591q = size;
        this.f2592r = i7;
        this.f2593s = e3;
    }

    public final Object a(int i7) {
        return this.f2593s.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f2592r < this.f2591q) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f2592r > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f2592r;
            this.f2592r = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2592r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f2592r - 1;
            this.f2592r = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2592r - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
