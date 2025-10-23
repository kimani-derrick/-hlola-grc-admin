package O3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class S extends T implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public static final S f2620q = new T();

    @Override // O3.T
    public final T a() {
        return b0.f2654q;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
