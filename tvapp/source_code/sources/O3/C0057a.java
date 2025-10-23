package O3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* renamed from: O3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057a implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public final Iterator f2641q;

    /* renamed from: r  reason: collision with root package name */
    public Object f2642r = null;

    /* renamed from: s  reason: collision with root package name */
    public Collection f2643s = null;

    /* renamed from: t  reason: collision with root package name */
    public Iterator f2644t = K.f2610q;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ P f2645u;

    public C0057a(P p3) {
        this.f2645u = p3;
        this.f2641q = p3.f2617t.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f2641q.hasNext() && !this.f2644t.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f2644t.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f2641q.next();
            this.f2642r = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f2643s = collection;
            this.f2644t = collection.iterator();
        }
        return this.f2644t.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2644t.remove();
        Collection collection = this.f2643s;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f2641q.remove();
        }
        P p3 = this.f2645u;
        p3.f2618u--;
    }

    public final Object a(Object obj, Object obj2) {
        return obj2;
    }
}
