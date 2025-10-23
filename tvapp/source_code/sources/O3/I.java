package O3;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class I extends i0 {

    /* renamed from: q  reason: collision with root package name */
    public int f2603q;

    /* renamed from: r  reason: collision with root package name */
    public Object f2604r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2605s;

    /* renamed from: t  reason: collision with root package name */
    public final Iterator f2606t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f2607u;

    public I() {
        this.f2603q = 2;
    }

    public final Object a() {
        Object next;
        Object next2;
        switch (this.f2605s) {
            case 0:
                do {
                    Iterator it = this.f2606t;
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        this.f2603q = 3;
                        return null;
                    }
                } while (!((N3.h) this.f2607u).apply(next));
                return next;
            default:
                do {
                    Iterator it2 = this.f2606t;
                    if (it2.hasNext()) {
                        next2 = it2.next();
                    } else {
                        this.f2603q = 3;
                        return null;
                    }
                } while (!((d0) this.f2607u).f2665r.contains(next2));
                return next2;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f2603q;
        if (i7 != 4) {
            int b7 = s.h.b(i7);
            if (b7 == 0) {
                return true;
            }
            if (b7 == 2) {
                return false;
            }
            this.f2603q = 4;
            this.f2604r = a();
            if (this.f2603q == 3) {
                return false;
            }
            this.f2603q = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f2603q = 2;
            Object obj = this.f2604r;
            this.f2604r = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I(d0 d0Var) {
        this();
        this.f2605s = 1;
        this.f2607u = d0Var;
        this.f2606t = d0Var.f2664q.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I(Iterator it, N3.h hVar) {
        this();
        this.f2605s = 0;
        this.f2606t = it;
        this.f2607u = hVar;
    }
}
