package O3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: O3.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0065i extends C0060d implements SortedMap {

    /* renamed from: u  reason: collision with root package name */
    public SortedSet f2673u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ P f2674v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0065i(P p3, SortedMap sortedMap) {
        super(p3, sortedMap);
        this.f2674v = p3;
    }

    public SortedSet b() {
        return new C0066j(this.f2674v, d());
    }

    @Override // O3.C0060d, java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f2673u;
        if (sortedSet == null) {
            SortedSet b7 = b();
            this.f2673u = b7;
            return b7;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f2662s;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0065i(this.f2674v, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0065i(this.f2674v, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0065i(this.f2674v, d().tailMap(obj));
    }
}
