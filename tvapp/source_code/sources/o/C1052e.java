package o;

import androidx.datastore.preferences.protobuf.i0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: o.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052e extends j implements Map {

    /* renamed from: t  reason: collision with root package name */
    public i0 f12790t;

    /* renamed from: u  reason: collision with root package name */
    public C1049b f12791u;

    /* renamed from: v  reason: collision with root package name */
    public C1051d f12792v;

    @Override // o.j, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // o.j, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i0 i0Var = this.f12790t;
        if (i0Var == null) {
            i0 i0Var2 = new i0(this, 1);
            this.f12790t = i0Var2;
            return i0Var2;
        }
        return i0Var;
    }

    @Override // o.j, java.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    public final boolean j(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i7 = this.f12809s;
        for (Object obj : collection) {
            super.remove(obj);
        }
        if (i7 != this.f12809s) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1049b c1049b = this.f12791u;
        if (c1049b == null) {
            C1049b c1049b2 = new C1049b(this);
            this.f12791u = c1049b2;
            return c1049b2;
        }
        return c1049b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f12809s);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.j, java.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public final Collection values() {
        C1051d c1051d = this.f12792v;
        if (c1051d == null) {
            C1051d c1051d2 = new C1051d(this);
            this.f12792v = c1051d2;
            return c1051d2;
        }
        return c1051d;
    }
}
