package O3;
/* loaded from: classes.dex */
public final class X extends H {

    /* renamed from: t  reason: collision with root package name */
    public final transient Z f2629t;

    /* renamed from: u  reason: collision with root package name */
    public final transient E f2630u;

    public X(Z z7, Y y3) {
        this.f2629t = z7;
        this.f2630u = y3;
    }

    @Override // O3.H, O3.AbstractC0081z
    public final E b() {
        return this.f2630u;
    }

    @Override // O3.AbstractC0081z
    public final int c(int i7, Object[] objArr) {
        return this.f2630u.c(i7, objArr);
    }

    @Override // O3.AbstractC0081z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (this.f2629t.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // O3.AbstractC0081z
    public final boolean l() {
        return true;
    }

    @Override // O3.AbstractC0081z
    public final i0 n() {
        return this.f2630u.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2629t.f2640v;
    }
}
