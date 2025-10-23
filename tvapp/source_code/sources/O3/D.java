package O3;

import java.util.Iterator;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class D extends E {

    /* renamed from: s  reason: collision with root package name */
    public final transient int f2594s;

    /* renamed from: t  reason: collision with root package name */
    public final transient int f2595t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ E f2596u;

    public D(E e3, int i7, int i8) {
        this.f2596u = e3;
        this.f2594s = i7;
        this.f2595t = i8;
    }

    @Override // O3.AbstractC0081z
    public final Object[] f() {
        return this.f2596u.f();
    }

    @Override // O3.AbstractC0081z
    public final int g() {
        return this.f2596u.h() + this.f2594s + this.f2595t;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        android.support.v4.media.session.b.h(i7, this.f2595t);
        return this.f2596u.get(i7 + this.f2594s);
    }

    @Override // O3.AbstractC0081z
    public final int h() {
        return this.f2596u.h() + this.f2594s;
    }

    @Override // O3.E, O3.AbstractC0081z, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // O3.AbstractC0081z
    public final boolean l() {
        return true;
    }

    @Override // O3.E, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2595t;
    }

    @Override // O3.E, java.util.List
    /* renamed from: y */
    public final E subList(int i7, int i8) {
        android.support.v4.media.session.b.m(i7, i8, this.f2595t);
        int i9 = this.f2594s;
        return this.f2596u.subList(i7 + i9, i8 + i9);
    }

    @Override // O3.E, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
        return listIterator(i7);
    }
}
