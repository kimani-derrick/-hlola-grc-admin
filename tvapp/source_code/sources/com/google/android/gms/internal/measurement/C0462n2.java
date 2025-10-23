package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import r0.AbstractC1111a;
/* renamed from: com.google.android.gms.internal.measurement.n2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462n2 extends W1 implements InterfaceC0472p2, G2, RandomAccess {

    /* renamed from: t  reason: collision with root package name */
    public static final C0462n2 f8616t = new C0462n2(0, false, new int[0]);

    /* renamed from: r  reason: collision with root package name */
    public int[] f8617r;

    /* renamed from: s  reason: collision with root package name */
    public int f8618s;

    public C0462n2(int i7, boolean z7, int[] iArr) {
        super(z7);
        this.f8617r = iArr;
        this.f8618s = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i7 < 0 || i7 > (i8 = this.f8618s)) {
            throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, this.f8618s, "Index:", ", Size:"));
        }
        int[] iArr = this.f8617r;
        if (i8 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i8 - i7);
        } else {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f8617r, i7, iArr2, i7 + 1, this.f8618s - i7);
            this.f8617r = iArr2;
        }
        this.f8617r[i7] = intValue;
        this.f8618s++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = AbstractC0467o2.f8631a;
        collection.getClass();
        if (!(collection instanceof C0462n2)) {
            return super.addAll(collection);
        }
        C0462n2 c0462n2 = (C0462n2) collection;
        int i7 = c0462n2.f8618s;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f8618s;
        if (Integer.MAX_VALUE - i8 >= i7) {
            int i9 = i8 + i7;
            int[] iArr = this.f8617r;
            if (i9 > iArr.length) {
                this.f8617r = Arrays.copyOf(iArr, i9);
            }
            System.arraycopy(c0462n2.f8617r, 0, this.f8617r, this.f8618s, c0462n2.f8618s);
            this.f8618s = i9;
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
        if (i7 >= this.f8618s) {
            return new C0462n2(this.f8618s, true, Arrays.copyOf(this.f8617r, i7));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0462n2) {
            C0462n2 c0462n2 = (C0462n2) obj;
            if (this.f8618s != c0462n2.f8618s) {
                return false;
            }
            int[] iArr = c0462n2.f8617r;
            for (int i7 = 0; i7 < this.f8618s; i7++) {
                if (this.f8617r[i7] != iArr[i7]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final int f(int i7) {
        h(i7);
        return this.f8617r[i7];
    }

    public final void g(int i7) {
        b();
        int i8 = this.f8618s;
        int[] iArr = this.f8617r;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f8617r = iArr2;
        }
        int[] iArr3 = this.f8617r;
        int i9 = this.f8618s;
        this.f8618s = i9 + 1;
        iArr3[i9] = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Integer.valueOf(f(i7));
    }

    public final void h(int i7) {
        if (i7 >= 0 && i7 < this.f8618s) {
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, this.f8618s, "Index:", ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f8618s; i8++) {
            i7 = (i7 * 31) + this.f8617r[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.f8618s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f8617r[i8] == intValue) {
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
        int[] iArr = this.f8617r;
        int i9 = iArr[i7];
        if (i7 < this.f8618s - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i8 - i7) - 1);
        }
        this.f8618s--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        b();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f8617r;
        System.arraycopy(iArr, i8, iArr, i7, this.f8618s - i8);
        this.f8618s -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        h(i7);
        int[] iArr = this.f8617r;
        int i8 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8618s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
