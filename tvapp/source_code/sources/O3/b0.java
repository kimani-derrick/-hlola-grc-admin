package O3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class b0 extends T implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public static final b0 f2654q = new T();

    @Override // O3.T
    public final T a() {
        return S.f2620q;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
