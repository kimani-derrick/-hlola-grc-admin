package O3;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: O3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063g extends C0066j implements NavigableSet {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ P f2671t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063g(P p3, NavigableMap navigableMap) {
        super(p3, navigableMap);
        this.f2671t = p3;
    }

    @Override // O3.C0066j
    /* renamed from: c */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.f2666q);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C0061e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0063g(this.f2671t, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z7) {
        return new C0063g(this.f2671t, b().headMap(obj, z7));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C0059c c0059c = (C0059c) iterator();
        if (c0059c.hasNext()) {
            Object next = c0059c.next();
            c0059c.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        return new C0063g(this.f2671t, b().subMap(obj, z7, obj2, z8));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z7) {
        return new C0063g(this.f2671t, b().tailMap(obj, z7));
    }

    @Override // O3.C0066j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // O3.C0066j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // O3.C0066j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
