package O3;
/* loaded from: classes.dex */
public final class h0 extends H {

    /* renamed from: t  reason: collision with root package name */
    public final transient Object f2672t;

    public h0(Object obj) {
        obj.getClass();
        this.f2672t = obj;
    }

    @Override // O3.H, O3.AbstractC0081z
    public final E b() {
        return E.x(this.f2672t);
    }

    @Override // O3.AbstractC0081z
    public final int c(int i7, Object[] objArr) {
        objArr[i7] = this.f2672t;
        return i7 + 1;
    }

    @Override // O3.AbstractC0081z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f2672t.equals(obj);
    }

    @Override // O3.H, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2672t.hashCode();
    }

    @Override // O3.AbstractC0081z
    public final boolean l() {
        return false;
    }

    @Override // O3.AbstractC0081z
    public final i0 n() {
        return new J(this.f2672t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f2672t.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
