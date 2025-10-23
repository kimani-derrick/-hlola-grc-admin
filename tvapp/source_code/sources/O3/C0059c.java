package O3;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* renamed from: O3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0059c implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2655q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final Iterator f2656r;

    /* renamed from: s  reason: collision with root package name */
    public Object f2657s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f2658t;

    public C0059c(C0060d c0060d) {
        this.f2658t = c0060d;
        this.f2656r = c0060d.f2662s.entrySet().iterator();
    }

    public void a() {
        C0068l c0068l = (C0068l) this.f2658t;
        c0068l.c();
        if (c0068l.f2678r == ((Collection) this.f2657s)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2655q) {
            case 0:
                return this.f2656r.hasNext();
            case 1:
                return this.f2656r.hasNext();
            default:
                a();
                return this.f2656r.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2655q) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f2656r.next();
                this.f2657s = (Collection) entry.getValue();
                return ((C0060d) this.f2658t).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f2656r.next();
                this.f2657s = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f2656r.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z7;
        boolean z8;
        switch (this.f2655q) {
            case 0:
                if (((Collection) this.f2657s) != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                android.support.v4.media.session.b.o("no calls to next() since the last call to remove()", z7);
                this.f2656r.remove();
                ((C0060d) this.f2658t).f2663t.f2618u -= ((Collection) this.f2657s).size();
                ((Collection) this.f2657s).clear();
                this.f2657s = null;
                return;
            case 1:
                if (((Map.Entry) this.f2657s) != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                android.support.v4.media.session.b.o("no calls to next() since the last call to remove()", z8);
                Collection collection = (Collection) ((Map.Entry) this.f2657s).getValue();
                this.f2656r.remove();
                ((C0061e) this.f2658t).f2667r.f2618u -= collection.size();
                collection.clear();
                this.f2657s = null;
                return;
            default:
                this.f2656r.remove();
                C0068l c0068l = (C0068l) this.f2658t;
                P p3 = c0068l.f2681u;
                p3.f2618u--;
                c0068l.f();
                return;
        }
    }

    public C0059c(C0061e c0061e, Iterator it) {
        this.f2658t = c0061e;
        this.f2656r = it;
    }

    public C0059c(C0068l c0068l) {
        this.f2658t = c0068l;
        Collection collection = c0068l.f2678r;
        this.f2657s = collection;
        this.f2656r = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public C0059c(C0068l c0068l, ListIterator listIterator) {
        this.f2658t = c0068l;
        this.f2657s = c0068l.f2678r;
        this.f2656r = listIterator;
    }
}
