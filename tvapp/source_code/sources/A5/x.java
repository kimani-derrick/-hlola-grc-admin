package A5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class x implements ListIterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final ListIterator f138q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ y f139r;

    /* JADX WARN: Type inference failed for: r1v0, types: [R5.a, R5.c] */
    public x(y yVar, int i7) {
        this.f139r = yVar;
        List list = yVar.f140q;
        if (new R5.a(0, yVar.size(), 1).c(i7)) {
            this.f138q = list.listIterator(yVar.size() - i7);
            return;
        }
        StringBuilder o7 = AbstractC0515y1.o(i7, "Position index ", " must be in range [");
        o7.append(new R5.a(0, yVar.size(), 1));
        o7.append("].");
        throw new IndexOutOfBoundsException(o7.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f138q.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f138q.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f138q.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return l.K(this.f139r) - this.f138q.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f138q.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return l.K(this.f139r) - this.f138q.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
