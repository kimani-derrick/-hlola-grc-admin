package O3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: O3.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0066j extends C0061e implements SortedSet {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ P f2675s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0066j(P p3, SortedMap sortedMap) {
        super(p3, sortedMap);
        this.f2675s = p3;
    }

    public SortedMap b() {
        return (SortedMap) this.f2666q;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0066j(this.f2675s, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0066j(this.f2675s, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0066j(this.f2675s, b().tailMap(obj));
    }
}
