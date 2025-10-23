package O3;

import java.util.Objects;
/* loaded from: classes.dex */
public final class Y extends E {

    /* renamed from: s  reason: collision with root package name */
    public final transient Object[] f2631s;

    /* renamed from: t  reason: collision with root package name */
    public final transient int f2632t;

    /* renamed from: u  reason: collision with root package name */
    public final transient int f2633u;

    public Y(Object[] objArr, int i7, int i8) {
        this.f2631s = objArr;
        this.f2632t = i7;
        this.f2633u = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        android.support.v4.media.session.b.h(i7, this.f2633u);
        Object obj = this.f2631s[(i7 * 2) + this.f2632t];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // O3.AbstractC0081z
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2633u;
    }
}
