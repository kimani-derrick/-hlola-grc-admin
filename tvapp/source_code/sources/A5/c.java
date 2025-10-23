package A5;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class c extends b implements ListIterator {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ e f122t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i7) {
        super(0, eVar);
        this.f122t = eVar;
        int b7 = eVar.b();
        if (i7 >= 0 && i7 <= b7) {
            this.f120r = i7;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, b7, "index: ", ", size: "));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f120r > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f120r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f120r - 1;
            this.f120r = i7;
            return this.f122t.get(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f120r - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
