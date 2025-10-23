package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import r0.AbstractC1111a;
/* renamed from: com.google.android.gms.internal.measurement.z2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521z2 extends W1 implements InterfaceC0486s2, G2, RandomAccess {

    /* renamed from: t  reason: collision with root package name */
    public static final C0521z2 f8720t = new C0521z2(new long[0], 0, false);

    /* renamed from: r  reason: collision with root package name */
    public long[] f8721r;

    /* renamed from: s  reason: collision with root package name */
    public int f8722s;

    public C0521z2(long[] jArr, int i7, boolean z7) {
        super(z7);
        this.f8721r = jArr;
        this.f8722s = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        long longValue = ((Long) obj).longValue();
        b();
        if (i7 < 0 || i7 > (i8 = this.f8722s)) {
            throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, this.f8722s, "Index:", ", Size:"));
        }
        long[] jArr = this.f8721r;
        if (i8 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i7 + 1, i8 - i7);
        } else {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            System.arraycopy(this.f8721r, i7, jArr2, i7 + 1, this.f8722s - i7);
            this.f8721r = jArr2;
        }
        this.f8721r[i7] = longValue;
        this.f8722s++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = AbstractC0467o2.f8631a;
        collection.getClass();
        if (!(collection instanceof C0521z2)) {
            return super.addAll(collection);
        }
        C0521z2 c0521z2 = (C0521z2) collection;
        int i7 = c0521z2.f8722s;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f8722s;
        if (Integer.MAX_VALUE - i8 >= i7) {
            int i9 = i8 + i7;
            long[] jArr = this.f8721r;
            if (i9 > jArr.length) {
                this.f8721r = Arrays.copyOf(jArr, i9);
            }
            System.arraycopy(c0521z2.f8721r, 0, this.f8721r, this.f8722s, c0521z2.f8722s);
            this.f8722s = i9;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0481r2
    public final InterfaceC0481r2 d(int i7) {
        if (i7 >= this.f8722s) {
            return new C0521z2(Arrays.copyOf(this.f8721r, i7), this.f8722s, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0521z2) {
            C0521z2 c0521z2 = (C0521z2) obj;
            if (this.f8722s != c0521z2.f8722s) {
                return false;
            }
            long[] jArr = c0521z2.f8721r;
            for (int i7 = 0; i7 < this.f8722s; i7++) {
                if (this.f8721r[i7] != jArr[i7]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void f(long j7) {
        b();
        int i7 = this.f8722s;
        long[] jArr = this.f8721r;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[((i7 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.f8721r = jArr2;
        }
        long[] jArr3 = this.f8721r;
        int i8 = this.f8722s;
        this.f8722s = i8 + 1;
        jArr3[i8] = j7;
    }

    public final long g(int i7) {
        h(i7);
        return this.f8721r[i7];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Long.valueOf(g(i7));
    }

    public final void h(int i7) {
        if (i7 >= 0 && i7 < this.f8722s) {
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, this.f8722s, "Index:", ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f8722s; i8++) {
            i7 = (i7 * 31) + AbstractC0467o2.a(this.f8721r[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i7 = this.f8722s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f8721r[i8] == longValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        int i8;
        b();
        h(i7);
        long[] jArr = this.f8721r;
        long j7 = jArr[i7];
        if (i7 < this.f8722s - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (i8 - i7) - 1);
        }
        this.f8722s--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        b();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f8721r;
        System.arraycopy(jArr, i8, jArr, i7, this.f8722s - i8);
        this.f8722s -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        h(i7);
        long[] jArr = this.f8721r;
        long j7 = jArr[i7];
        jArr[i7] = longValue;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8722s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
