package O3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class c0 extends T implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final T f2659q;

    public c0(T t5) {
        t5.getClass();
        this.f2659q = t5;
    }

    @Override // O3.T
    public final T a() {
        return this.f2659q;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f2659q.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f2659q.equals(((c0) obj).f2659q);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f2659q.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2659q);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
