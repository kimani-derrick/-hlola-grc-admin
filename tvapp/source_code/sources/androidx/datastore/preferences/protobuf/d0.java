package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class d0 extends AbstractMap {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f5748w = 0;

    /* renamed from: q  reason: collision with root package name */
    public final int f5749q;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5752t;

    /* renamed from: u  reason: collision with root package name */
    public volatile i0 f5753u;

    /* renamed from: r  reason: collision with root package name */
    public List f5750r = Collections.emptyList();

    /* renamed from: s  reason: collision with root package name */
    public Map f5751s = Collections.emptyMap();

    /* renamed from: v  reason: collision with root package name */
    public Map f5754v = Collections.emptyMap();

    public d0(int i7) {
        this.f5749q = i7;
    }

    public final int a(Comparable comparable) {
        int i7;
        int size = this.f5750r.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((g0) this.f5750r.get(i8)).f5764q);
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            } else if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((g0) this.f5750r.get(i10)).f5764q);
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else if (compareTo2 > 0) {
                i9 = i10 + 1;
            } else {
                return i10;
            }
        }
        i7 = i9 + 1;
        return -i7;
    }

    public final void b() {
        if (!this.f5752t) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Map.Entry c(int i7) {
        return (Map.Entry) this.f5750r.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f5750r.isEmpty()) {
            this.f5750r.clear();
        }
        if (!this.f5751s.isEmpty()) {
            this.f5751s.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f5751s.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable d() {
        if (this.f5751s.isEmpty()) {
            return Q.f5714b;
        }
        return this.f5751s.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f5751s.isEmpty() && !(this.f5751s instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5751s = treeMap;
            this.f5754v = treeMap.descendingMap();
        }
        return (SortedMap) this.f5751s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f5753u == null) {
            this.f5753u = new i0(this, 0);
        }
        return this.f5753u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        int size = size();
        if (size != d0Var.size()) {
            return false;
        }
        int size2 = this.f5750r.size();
        if (size2 != d0Var.f5750r.size()) {
            return entrySet().equals(d0Var.entrySet());
        }
        for (int i7 = 0; i7 < size2; i7++) {
            if (!c(i7).equals(d0Var.c(i7))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f5751s.equals(d0Var.f5751s);
    }

    public final Object f(Comparable comparable, Object obj) {
        b();
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((g0) this.f5750r.get(a7)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f5750r.isEmpty();
        int i7 = this.f5749q;
        if (isEmpty && !(this.f5750r instanceof ArrayList)) {
            this.f5750r = new ArrayList(i7);
        }
        int i8 = -(a7 + 1);
        if (i8 >= i7) {
            return e().put(comparable, obj);
        }
        if (this.f5750r.size() == i7) {
            g0 g0Var = (g0) this.f5750r.remove(i7 - 1);
            e().put(g0Var.f5764q, g0Var.f5765r);
        }
        this.f5750r.add(i8, new g0(this, comparable, obj));
        return null;
    }

    public final Object g(int i7) {
        b();
        Object obj = ((g0) this.f5750r.remove(i7)).f5765r;
        if (!this.f5751s.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f5750r;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((g0) this.f5750r.get(a7)).f5765r;
        }
        return this.f5751s.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f5750r.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((g0) this.f5750r.get(i8)).hashCode();
        }
        if (this.f5751s.size() > 0) {
            return i7 + this.f5751s.hashCode();
        }
        return i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        AbstractC0515y1.v(obj);
        return f(null, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return g(a7);
        }
        if (this.f5751s.isEmpty()) {
            return null;
        }
        return this.f5751s.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5751s.size() + this.f5750r.size();
    }
}
