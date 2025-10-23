package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class n0 extends AbstractList implements E, RandomAccess {

    /* renamed from: q  reason: collision with root package name */
    public final E f5801q;

    public n0(E e3) {
        this.f5801q = e3;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final E e() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f5801q.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final Object i(int i7) {
        return this.f5801q.i(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new m0(this);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final List k() {
        return this.f5801q.k();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new l0(this, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final void p(C0228g c0228g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5801q.size();
    }
}
