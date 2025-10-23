package B5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class g extends A5.g {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f310q;

    /* renamed from: r  reason: collision with root package name */
    public final f f311r;

    public g(f fVar, int i7) {
        this.f310q = i7;
        switch (i7) {
            case 1:
                M5.g.f(fVar, "backing");
                this.f311r = fVar;
                return;
            default:
                M5.g.f(fVar, "backing");
                this.f311r = fVar;
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f310q) {
            case 0:
                M5.g.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f310q) {
            case 0:
                M5.g.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                M5.g.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // A5.g
    public final int b() {
        switch (this.f310q) {
            case 0:
                return this.f311r.f308y;
            default:
                return this.f311r.f308y;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f310q) {
            case 0:
                this.f311r.clear();
                return;
            default:
                this.f311r.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f310q) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                M5.g.f(entry, "element");
                return this.f311r.e(entry);
            default:
                return this.f311r.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f310q) {
            case 0:
                M5.g.f(collection, "elements");
                return this.f311r.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f310q) {
            case 0:
                return this.f311r.isEmpty();
            default:
                return this.f311r.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f310q) {
            case 0:
                f fVar = this.f311r;
                fVar.getClass();
                return new c(fVar, 0);
            default:
                f fVar2 = this.f311r;
                fVar2.getClass();
                return new c(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f310q) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                M5.g.f(entry, "element");
                f fVar = this.f311r;
                fVar.getClass();
                fVar.c();
                int g7 = fVar.g(entry.getKey());
                if (g7 < 0) {
                    return false;
                }
                Object[] objArr = fVar.f301r;
                M5.g.c(objArr);
                if (!M5.g.a(objArr[g7], entry.getValue())) {
                    return false;
                }
                fVar.k(g7);
                return true;
            default:
                f fVar2 = this.f311r;
                fVar2.c();
                int g8 = fVar2.g(obj);
                if (g8 >= 0) {
                    fVar2.k(g8);
                    if (g8 >= 0) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f310q) {
            case 0:
                M5.g.f(collection, "elements");
                this.f311r.c();
                return super.removeAll(collection);
            default:
                M5.g.f(collection, "elements");
                this.f311r.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f310q) {
            case 0:
                M5.g.f(collection, "elements");
                this.f311r.c();
                return super.retainAll(collection);
            default:
                M5.g.f(collection, "elements");
                this.f311r.c();
                return super.retainAll(collection);
        }
    }
}
