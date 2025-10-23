package O3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: O3.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0071o {

    /* renamed from: q  reason: collision with root package name */
    public transient Set f2685q;

    /* renamed from: r  reason: collision with root package name */
    public transient Collection f2686r;

    /* renamed from: s  reason: collision with root package name */
    public transient Map f2687s;

    public abstract Map a();

    public abstract void b();

    public boolean c(Object obj) {
        for (Collection collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set d();

    public abstract int e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0071o) {
            return a().equals(((AbstractC0071o) obj).a());
        }
        return false;
    }

    public abstract Iterator f();

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
