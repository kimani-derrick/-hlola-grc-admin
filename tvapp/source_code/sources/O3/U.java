package O3;

import java.util.Objects;
/* loaded from: classes.dex */
public final class U extends E {

    /* renamed from: u  reason: collision with root package name */
    public static final U f2621u = new U(0, new Object[0]);

    /* renamed from: s  reason: collision with root package name */
    public final transient Object[] f2622s;

    /* renamed from: t  reason: collision with root package name */
    public final transient int f2623t;

    public U(int i7, Object[] objArr) {
        this.f2622s = objArr;
        this.f2623t = i7;
    }

    @Override // O3.E, O3.AbstractC0081z
    public final int c(int i7, Object[] objArr) {
        Object[] objArr2 = this.f2622s;
        int i8 = this.f2623t;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // O3.AbstractC0081z
    public final Object[] f() {
        return this.f2622s;
    }

    @Override // O3.AbstractC0081z
    public final int g() {
        return this.f2623t;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        android.support.v4.media.session.b.h(i7, this.f2623t);
        Object obj = this.f2622s[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // O3.AbstractC0081z
    public final int h() {
        return 0;
    }

    @Override // O3.AbstractC0081z
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2623t;
    }
}
