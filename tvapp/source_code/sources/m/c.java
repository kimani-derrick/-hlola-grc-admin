package m;

import java.util.Map;
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: q  reason: collision with root package name */
    public final Object f12369q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f12370r;

    /* renamed from: s  reason: collision with root package name */
    public c f12371s;

    /* renamed from: t  reason: collision with root package name */
    public c f12372t;

    public c(Object obj, Object obj2) {
        this.f12369q = obj;
        this.f12370r = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12369q.equals(cVar.f12369q) && this.f12370r.equals(cVar.f12370r)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12369q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12370r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12369q.hashCode() ^ this.f12370r.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f12369q + "=" + this.f12370r;
    }
}
