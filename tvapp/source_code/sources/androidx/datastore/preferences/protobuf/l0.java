package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;
/* loaded from: classes.dex */
public final class l0 implements ListIterator {

    /* renamed from: q  reason: collision with root package name */
    public final ListIterator f5796q;

    public l0(n0 n0Var, int i7) {
        this.f5796q = n0Var.f5801q.listIterator(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5796q.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5796q.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f5796q.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5796q.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f5796q.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5796q.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
