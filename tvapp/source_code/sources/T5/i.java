package T5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class i implements Iterator, D5.d, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public int f3401q;

    /* renamed from: r  reason: collision with root package name */
    public Object f3402r;

    /* renamed from: s  reason: collision with root package name */
    public Iterator f3403s;

    /* renamed from: t  reason: collision with root package name */
    public D5.d f3404t;

    public final RuntimeException a() {
        int i7 = this.f3401q;
        if (i7 != 4) {
            if (i7 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f3401q);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i7 = this.f3401q;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        return true;
                    }
                    if (i7 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f3403s;
                M5.g.c(it);
                if (it.hasNext()) {
                    this.f3401q = 2;
                    return true;
                }
                this.f3403s = null;
            }
            this.f3401q = 5;
            D5.d dVar = this.f3404t;
            M5.g.c(dVar);
            this.f3404t = null;
            dVar.m(C1530l.f16479a);
        }
    }

    @Override // D5.d
    public final D5.i k() {
        return D5.j.f531q;
    }

    @Override // D5.d
    public final void m(Object obj) {
        AbstractC0958a.H(obj);
        this.f3401q = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f3401q;
        if (i7 != 0 && i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    this.f3401q = 0;
                    Object obj = this.f3402r;
                    this.f3402r = null;
                    return obj;
                }
                throw a();
            }
            this.f3401q = 1;
            Iterator it = this.f3403s;
            M5.g.c(it);
            return it.next();
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
