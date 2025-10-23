package O3;

import a.AbstractC0189a;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class r extends AbstractSet {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2694q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0075t f2695r;

    public /* synthetic */ r(C0075t c0075t, int i7) {
        this.f2694q = i7;
        this.f2695r = c0075t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2694q) {
            case 0:
                this.f2695r.clear();
                return;
            default:
                this.f2695r.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2694q) {
            case 0:
                C0075t c0075t = this.f2695r;
                Map b7 = c0075t.b();
                if (b7 != null) {
                    return b7.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = c0075t.d(entry.getKey());
                    if (d != -1 && AbstractC0189a.r(c0075t.j()[d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f2695r.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2694q) {
            case 0:
                C0075t c0075t = this.f2695r;
                Map b7 = c0075t.b();
                if (b7 != null) {
                    return b7.entrySet().iterator();
                }
                return new C0073q(c0075t, 1);
            default:
                C0075t c0075t2 = this.f2695r;
                Map b8 = c0075t2.b();
                if (b8 != null) {
                    return b8.keySet().iterator();
                }
                return new C0073q(c0075t2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2694q) {
            case 0:
                C0075t c0075t = this.f2695r;
                Map b7 = c0075t.b();
                if (b7 != null) {
                    return b7.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0075t.f()) {
                        int c5 = c0075t.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0075t.f2700q;
                        Objects.requireNonNull(obj2);
                        int n = AbstractC0072p.n(key, value, c5, obj2, c0075t.h(), c0075t.i(), c0075t.j());
                        if (n != -1) {
                            c0075t.e(n, c5);
                            c0075t.f2705v--;
                            c0075t.f2704u += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0075t c0075t2 = this.f2695r;
                Map b8 = c0075t2.b();
                if (b8 != null) {
                    return b8.keySet().remove(obj);
                }
                if (c0075t2.g(obj) != C0075t.f2699z) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2694q) {
            case 0:
                return this.f2695r.size();
            default:
                return this.f2695r.size();
        }
    }
}
