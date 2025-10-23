package O3;

import a.AbstractC0189a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: O3.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070n extends AbstractCollection {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2683q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f2684r;

    public /* synthetic */ C0070n(int i7, Object obj) {
        this.f2683q = i7;
        this.f2684r = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f2683q) {
            case 0:
                ((AbstractC0071o) this.f2684r).b();
                return;
            case 1:
                ((C0075t) this.f2684r).clear();
                return;
            default:
                ((Map) this.f2684r).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f2683q) {
            case 0:
                return ((AbstractC0071o) this.f2684r).c(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((Map) this.f2684r).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f2683q) {
            case 2:
                return ((Map) this.f2684r).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2683q) {
            case 0:
                return ((AbstractC0071o) this.f2684r).f();
            case 1:
                C0075t c0075t = (C0075t) this.f2684r;
                Map b7 = c0075t.b();
                if (b7 != null) {
                    return b7.values().iterator();
                }
                return new C0073q(c0075t, 2);
            default:
                return new L(((Map) this.f2684r).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f2683q) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = (Map) this.f2684r;
                    for (Map.Entry entry : map.entrySet()) {
                        if (AbstractC0189a.r(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f2683q) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.f2684r;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f2683q) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.f2684r;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f2683q) {
            case 0:
                return ((AbstractC0071o) this.f2684r).e();
            case 1:
                return ((C0075t) this.f2684r).size();
            default:
                return ((Map) this.f2684r).size();
        }
    }

    public C0070n(Map map) {
        this.f2683q = 2;
        map.getClass();
        this.f2684r = map;
    }
}
