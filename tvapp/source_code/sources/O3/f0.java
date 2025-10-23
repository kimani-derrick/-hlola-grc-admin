package O3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* loaded from: classes.dex */
public final class f0 extends e0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f2668q).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f2668q.iterator();
        it.getClass();
        N3.h hVar = this.f2669r;
        hVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (hVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.e0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new e0(((SortedSet) this.f2668q).headSet(obj), this.f2669r);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f2668q;
        while (true) {
            Object last = sortedSet.last();
            if (this.f2669r.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.e0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new e0(((SortedSet) this.f2668q).subSet(obj, obj2), this.f2669r);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.e0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new e0(((SortedSet) this.f2668q).tailSet(obj), this.f2669r);
    }
}
