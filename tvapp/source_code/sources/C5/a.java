package C5;

import M5.g;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: r  reason: collision with root package name */
    public static final a f425r = new a(0);

    /* renamed from: s  reason: collision with root package name */
    public static final a f426s = new a(1);

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f427q;

    public /* synthetic */ a(int i7) {
        this.f427q = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        switch (this.f427q) {
            case 0:
                g.f(comparable, "a");
                g.f(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                g.f(comparable, "a");
                g.f(comparable2, "b");
                return comparable2.compareTo(comparable);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f427q) {
            case 0:
                return f426s;
            default:
                return f425r;
        }
    }
}
