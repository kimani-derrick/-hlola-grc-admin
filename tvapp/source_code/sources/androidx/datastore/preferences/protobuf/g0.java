package androidx.datastore.preferences.protobuf;

import java.util.Map;
/* loaded from: classes.dex */
public final class g0 implements Map.Entry, Comparable {

    /* renamed from: q  reason: collision with root package name */
    public final Comparable f5764q;

    /* renamed from: r  reason: collision with root package name */
    public Object f5765r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ d0 f5766s;

    public g0(d0 d0Var, Comparable comparable, Object obj) {
        this.f5766s = d0Var;
        this.f5764q = comparable;
        this.f5765r = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5764q.compareTo(((g0) obj).f5764q);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f5764q;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f5765r;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5764q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5765r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f5764q;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5765r;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i7 = d0.f5748w;
        this.f5766s.b();
        Object obj2 = this.f5765r;
        this.f5765r = obj;
        return obj2;
    }

    public final String toString() {
        return this.f5764q + "=" + this.f5765r;
    }
}
