package B5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class i extends A5.g implements Serializable {

    /* renamed from: r  reason: collision with root package name */
    public static final i f313r;

    /* renamed from: q  reason: collision with root package name */
    public final f f314q;

    static {
        f fVar = f.f296D;
        f313r = new i(f.f296D);
    }

    public i() {
        this(new f());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f314q.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        M5.g.f(collection, "elements");
        this.f314q.c();
        return super.addAll(collection);
    }

    @Override // A5.g
    public final int b() {
        return this.f314q.f308y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f314q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f314q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f314q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f314q;
        fVar.getClass();
        return new c(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f314q;
        fVar.c();
        int g7 = fVar.g(obj);
        if (g7 >= 0) {
            fVar.k(g7);
            if (g7 >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        M5.g.f(collection, "elements");
        this.f314q.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        M5.g.f(collection, "elements");
        this.f314q.c();
        return super.retainAll(collection);
    }

    public i(f fVar) {
        M5.g.f(fVar, "backing");
        this.f314q = fVar;
    }
}
