package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class i0 extends AbstractList implements E, RandomAccess {

    /* renamed from: q  reason: collision with root package name */
    public final E f9129q;

    public i0(E e3) {
        this.f9129q = e3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final E e() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f9129q.get(i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final Object i(int i7) {
        return this.f9129q.i(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new h0(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final List k() {
        return this.f9129q.k();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new g0(this, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final void q(AbstractC0530h abstractC0530h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9129q.size();
    }
}
