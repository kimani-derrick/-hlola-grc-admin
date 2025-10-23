package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class K2 extends W1 implements RandomAccess {

    /* renamed from: t  reason: collision with root package name */
    public static final K2 f8369t = new K2(new Object[0], 0, false);

    /* renamed from: r  reason: collision with root package name */
    public Object[] f8370r;

    /* renamed from: s  reason: collision with root package name */
    public int f8371s;

    public K2(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.f8370r = objArr;
        this.f8371s = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        b();
        if (i7 < 0 || i7 > (i8 = this.f8371s)) {
            throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, this.f8371s, "Index:", ", Size:"));
        }
        Object[] objArr = this.f8370r;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.f8370r, i7, objArr2, i7 + 1, this.f8371s - i7);
            this.f8370r = objArr2;
        }
        this.f8370r[i7] = obj;
        this.f8371s++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0481r2
    public final /* synthetic */ InterfaceC0481r2 d(int i7) {
        if (i7 >= this.f8371s) {
            return new K2(Arrays.copyOf(this.f8370r, i7), this.f8371s, true);
        }
        throw new IllegalArgumentException();
    }

    public final void f(int i7) {
        if (i7 >= 0 && i7 < this.f8371s) {
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, this.f8371s, "Index:", ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        f(i7);
        return this.f8370r[i7];
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8;
        b();
        f(i7);
        Object[] objArr = this.f8370r;
        Object obj = objArr[i7];
        if (i7 < this.f8371s - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.f8371s--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        b();
        f(i7);
        Object[] objArr = this.f8370r;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8371s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i7 = this.f8371s;
        Object[] objArr = this.f8370r;
        if (i7 == objArr.length) {
            this.f8370r = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8370r;
        int i8 = this.f8371s;
        this.f8371s = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
