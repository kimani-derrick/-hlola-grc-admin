package n0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class x implements Iterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public int f12609q = -1;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12610r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ y f12611s;

    public x(y yVar) {
        this.f12611s = yVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12609q + 1 < this.f12611s.f12613A.k()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f12610r = true;
            o.k kVar = this.f12611s.f12613A;
            int i7 = this.f12609q + 1;
            this.f12609q = i7;
            Object l7 = kVar.l(i7);
            M5.g.e(l7, "nodes.valueAt(++index)");
            return (v) l7;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f12610r) {
            o.k kVar = this.f12611s.f12613A;
            ((v) kVar.l(this.f12609q)).f12601r = null;
            int i7 = this.f12609q;
            Object[] objArr = kVar.f12812s;
            Object obj = objArr[i7];
            Object obj2 = o.h.f12801b;
            if (obj != obj2) {
                objArr[i7] = obj2;
                kVar.f12810q = true;
            }
            this.f12609q = i7 - 1;
            this.f12610r = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element".toString());
    }
}
