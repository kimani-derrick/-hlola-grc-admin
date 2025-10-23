package A5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class y extends e {

    /* renamed from: q  reason: collision with root package name */
    public final List f140q;

    public y(List list) {
        this.f140q = list;
    }

    @Override // A5.e
    public final int b() {
        return this.f140q.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R5.a, R5.c] */
    @Override // java.util.List
    public final Object get(int i7) {
        if (new R5.a(0, l.K(this), 1).c(i7)) {
            return this.f140q.get(l.K(this) - i7);
        }
        StringBuilder o7 = AbstractC0515y1.o(i7, "Element index ", " must be in range [");
        o7.append(new R5.a(0, l.K(this), 1));
        o7.append("].");
        throw new IndexOutOfBoundsException(o7.toString());
    }

    @Override // A5.e, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new x(this, 0);
    }

    @Override // A5.e, java.util.List
    public final ListIterator listIterator() {
        return new x(this, 0);
    }

    @Override // A5.e, java.util.List
    public final ListIterator listIterator(int i7) {
        return new x(this, i7);
    }
}
