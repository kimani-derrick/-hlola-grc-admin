package O3;

import java.util.Map;
/* loaded from: classes.dex */
public final class W extends H {

    /* renamed from: t  reason: collision with root package name */
    public final transient Z f2625t;

    /* renamed from: u  reason: collision with root package name */
    public final transient Object[] f2626u;

    /* renamed from: v  reason: collision with root package name */
    public final transient int f2627v = 0;

    /* renamed from: w  reason: collision with root package name */
    public final transient int f2628w;

    public W(Z z7, Object[] objArr, int i7) {
        this.f2625t = z7;
        this.f2626u = objArr;
        this.f2628w = i7;
    }

    @Override // O3.AbstractC0081z
    public final int c(int i7, Object[] objArr) {
        return b().c(i7, objArr);
    }

    @Override // O3.AbstractC0081z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f2625t.get(key))) {
            return false;
        }
        return true;
    }

    @Override // O3.AbstractC0081z
    public final boolean l() {
        return true;
    }

    @Override // O3.AbstractC0081z
    public final i0 n() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2628w;
    }

    @Override // O3.H
    public final E t() {
        return new V(this);
    }
}
