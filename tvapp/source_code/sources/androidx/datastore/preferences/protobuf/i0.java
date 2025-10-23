package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import o.C1050c;
import o.C1052e;
/* loaded from: classes.dex */
public class i0 extends AbstractSet {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5785q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Map f5786r;

    public /* synthetic */ i0(Map map, int i7) {
        this.f5785q = i7;
        this.f5786r = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f5785q) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    Object value = entry.getValue();
                    ((d0) this.f5786r).f((Comparable) entry.getKey(), value);
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f5785q) {
            case 0:
                ((d0) this.f5786r).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f5785q) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((d0) this.f5786r).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f5785q) {
            case 0:
                return new h0((d0) this.f5786r);
            default:
                return new C1050c((C1052e) this.f5786r);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f5785q) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((d0) this.f5786r).remove(entry.getKey());
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f5785q) {
            case 0:
                return ((d0) this.f5786r).size();
            default:
                return ((C1052e) this.f5786r).f12809s;
        }
    }
}
