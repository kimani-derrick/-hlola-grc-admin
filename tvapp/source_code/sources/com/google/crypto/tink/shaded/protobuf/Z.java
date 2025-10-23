package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class Z extends AbstractC0524b implements RandomAccess {

    /* renamed from: t  reason: collision with root package name */
    public static final Z f9097t;

    /* renamed from: r  reason: collision with root package name */
    public Object[] f9098r;

    /* renamed from: s  reason: collision with root package name */
    public int f9099s;

    static {
        Z z7 = new Z(0, new Object[0]);
        f9097t = z7;
        z7.f9103q = false;
    }

    public Z(int i7, Object[] objArr) {
        this.f9098r = objArr;
        this.f9099s = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        b();
        if (i7 < 0 || i7 > (i8 = this.f9099s)) {
            StringBuilder o7 = AbstractC0515y1.o(i7, "Index:", ", Size:");
            o7.append(this.f9099s);
            throw new IndexOutOfBoundsException(o7.toString());
        }
        Object[] objArr = this.f9098r;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.f9098r, i7, objArr2, i7 + 1, this.f9099s - i7);
            this.f9098r = objArr2;
        }
        this.f9098r[i7] = obj;
        this.f9099s++;
        ((AbstractList) this).modCount++;
    }

    public final void f(int i7) {
        if (i7 >= 0 && i7 < this.f9099s) {
            return;
        }
        StringBuilder o7 = AbstractC0515y1.o(i7, "Index:", ", Size:");
        o7.append(this.f9099s);
        throw new IndexOutOfBoundsException(o7.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        f(i7);
        return this.f9098r[i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0546y
    public final InterfaceC0546y j(int i7) {
        if (i7 >= this.f9099s) {
            return new Z(this.f9099s, Arrays.copyOf(this.f9098r, i7));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0524b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8;
        b();
        f(i7);
        Object[] objArr = this.f9098r;
        Object obj = objArr[i7];
        if (i7 < this.f9099s - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.f9099s--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        b();
        f(i7);
        Object[] objArr = this.f9098r;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9099s;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0524b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i7 = this.f9099s;
        Object[] objArr = this.f9098r;
        if (i7 == objArr.length) {
            this.f9098r = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9098r;
        int i8 = this.f9099s;
        this.f9099s = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
