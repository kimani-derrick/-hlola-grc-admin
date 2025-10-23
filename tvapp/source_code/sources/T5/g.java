package T5;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class g implements Iterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public Object f3398q;

    /* renamed from: r  reason: collision with root package name */
    public int f3399r = -2;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ f f3400s;

    public g(f fVar) {
        this.f3400s = fVar;
    }

    public final void a() {
        Object c5;
        int i7;
        int i8 = this.f3399r;
        f fVar = this.f3400s;
        if (i8 == -2) {
            c5 = ((L5.a) fVar.f3396b).b();
        } else {
            L5.l lVar = fVar.f3397c;
            Object obj = this.f3398q;
            M5.g.c(obj);
            c5 = lVar.c(obj);
        }
        this.f3398q = c5;
        if (c5 == null) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f3399r = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3399r < 0) {
            a();
        }
        if (this.f3399r == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3399r < 0) {
            a();
        }
        if (this.f3399r != 0) {
            Object obj = this.f3398q;
            M5.g.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f3399r = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
