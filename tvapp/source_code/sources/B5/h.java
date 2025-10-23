package B5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class h extends AbstractCollection implements Collection, N5.b {

    /* renamed from: q  reason: collision with root package name */
    public final f f312q;

    public h(f fVar) {
        M5.g.f(fVar, "backing");
        this.f312q = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        M5.g.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f312q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f312q.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f312q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        f fVar = this.f312q;
        fVar.getClass();
        return new c(fVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f312q;
        fVar.c();
        int h7 = fVar.h(obj);
        if (h7 < 0) {
            return false;
        }
        fVar.k(h7);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        M5.g.f(collection, "elements");
        this.f312q.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        M5.g.f(collection, "elements");
        this.f312q.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f312q.f308y;
    }
}
