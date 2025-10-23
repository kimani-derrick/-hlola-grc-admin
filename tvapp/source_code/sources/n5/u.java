package n5;

import java.util.Map;
/* loaded from: classes.dex */
public final class u implements Map.Entry {

    /* renamed from: q  reason: collision with root package name */
    public u f12735q;

    /* renamed from: r  reason: collision with root package name */
    public u f12736r;

    /* renamed from: s  reason: collision with root package name */
    public u f12737s;

    /* renamed from: t  reason: collision with root package name */
    public u f12738t;

    /* renamed from: u  reason: collision with root package name */
    public u f12739u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f12740v;

    /* renamed from: w  reason: collision with root package name */
    public final int f12741w;

    /* renamed from: x  reason: collision with root package name */
    public Object f12742x;

    /* renamed from: y  reason: collision with root package name */
    public int f12743y;

    public u() {
        this.f12740v = null;
        this.f12741w = -1;
        this.f12739u = this;
        this.f12738t = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f12740v;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f12742x;
        Object value = entry.getValue();
        if (obj3 == null) {
            if (value != null) {
                return false;
            }
        } else if (!obj3.equals(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12740v;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12742x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f12740v;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f12742x;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i7 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f12742x;
        this.f12742x = obj;
        return obj2;
    }

    public final String toString() {
        return this.f12740v + "=" + this.f12742x;
    }

    public u(u uVar, Object obj, int i7, u uVar2, u uVar3) {
        this.f12735q = uVar;
        this.f12740v = obj;
        this.f12741w = i7;
        this.f12743y = 1;
        this.f12738t = uVar2;
        this.f12739u = uVar3;
        uVar3.f12738t = this;
        uVar2.f12739u = this;
    }
}
