package O3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: O3.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073q implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public int f2688q;

    /* renamed from: r  reason: collision with root package name */
    public int f2689r;

    /* renamed from: s  reason: collision with root package name */
    public int f2690s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0075t f2691t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f2692u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0075t f2693v;

    public C0073q(C0075t c0075t, int i7) {
        int i8;
        this.f2692u = i7;
        this.f2693v = c0075t;
        this.f2691t = c0075t;
        this.f2688q = c0075t.f2704u;
        if (c0075t.isEmpty()) {
            i8 = -1;
        } else {
            i8 = 0;
        }
        this.f2689r = i8;
        this.f2690s = -1;
    }

    public final Object a(int i7) {
        switch (this.f2692u) {
            case 0:
                return this.f2693v.i()[i7];
            case 1:
                return new C0074s(this.f2693v, i7);
            default:
                return this.f2693v.j()[i7];
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2689r >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0075t c0075t = this.f2691t;
        if (c0075t.f2704u == this.f2688q) {
            if (hasNext()) {
                int i7 = this.f2689r;
                this.f2690s = i7;
                Object a7 = a(i7);
                int i8 = this.f2689r + 1;
                if (i8 >= c0075t.f2705v) {
                    i8 = -1;
                }
                this.f2689r = i8;
                return a7;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z7;
        C0075t c0075t = this.f2691t;
        if (c0075t.f2704u == this.f2688q) {
            if (this.f2690s >= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            android.support.v4.media.session.b.o("no calls to next() since the last call to remove()", z7);
            this.f2688q += 32;
            c0075t.remove(c0075t.i()[this.f2690s]);
            this.f2689r--;
            this.f2690s = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
