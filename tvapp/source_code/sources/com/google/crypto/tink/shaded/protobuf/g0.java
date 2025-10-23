package com.google.crypto.tink.shaded.protobuf;

import java.util.ListIterator;
/* loaded from: classes.dex */
public final class g0 implements ListIterator {

    /* renamed from: q  reason: collision with root package name */
    public final ListIterator f9117q;

    public g0(i0 i0Var, int i7) {
        this.f9117q = i0Var.f9129q.listIterator(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9117q.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9117q.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f9117q.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9117q.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f9117q.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9117q.previousIndex();
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
