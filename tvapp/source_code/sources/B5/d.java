package B5;

import java.util.Map;
/* loaded from: classes.dex */
public final class d implements Map.Entry, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final f f290q;

    /* renamed from: r  reason: collision with root package name */
    public final int f291r;

    public d(f fVar, int i7) {
        M5.g.f(fVar, "map");
        this.f290q = fVar;
        this.f291r = i7;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (M5.g.a(entry.getKey(), getKey()) && M5.g.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f290q.f300q[this.f291r];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f290q.f301r;
        M5.g.c(objArr);
        return objArr[this.f291r];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i7;
        Object key = getKey();
        int i8 = 0;
        if (key != null) {
            i7 = key.hashCode();
        } else {
            i7 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i8 = value.hashCode();
        }
        return i7 ^ i8;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        f fVar = this.f290q;
        fVar.c();
        Object[] objArr = fVar.f301r;
        if (objArr == null) {
            int length = fVar.f300q.length;
            if (length >= 0) {
                objArr = new Object[length];
                fVar.f301r = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
        }
        int i7 = this.f291r;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
