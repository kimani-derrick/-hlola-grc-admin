package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class Z extends AbstractC0222b implements RandomAccess {

    /* renamed from: t  reason: collision with root package name */
    public static final Z f5736t;

    /* renamed from: r  reason: collision with root package name */
    public Object[] f5737r;

    /* renamed from: s  reason: collision with root package name */
    public int f5738s;

    static {
        Z z7 = new Z(0, new Object[0]);
        f5736t = z7;
        z7.f5742q = false;
    }

    public Z(int i7, Object[] objArr) {
        this.f5737r = objArr;
        this.f5738s = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        b();
        if (i7 < 0 || i7 > (i8 = this.f5738s)) {
            StringBuilder o7 = AbstractC0515y1.o(i7, "Index:", ", Size:");
            o7.append(this.f5738s);
            throw new IndexOutOfBoundsException(o7.toString());
        }
        Object[] objArr = this.f5737r;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.f5737r, i7, objArr2, i7 + 1, this.f5738s - i7);
            this.f5737r = objArr2;
        }
        this.f5737r[i7] = obj;
        this.f5738s++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i7) {
        if (i7 >= 0 && i7 < this.f5738s) {
            return;
        }
        StringBuilder o7 = AbstractC0515y1.o(i7, "Index:", ", Size:");
        o7.append(this.f5738s);
        throw new IndexOutOfBoundsException(o7.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        c(i7);
        return this.f5737r[i7];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0245y
    public final InterfaceC0245y j(int i7) {
        if (i7 >= this.f5738s) {
            return new Z(this.f5738s, Arrays.copyOf(this.f5737r, i7));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8;
        b();
        c(i7);
        Object[] objArr = this.f5737r;
        Object obj = objArr[i7];
        if (i7 < this.f5738s - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.f5738s--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        b();
        c(i7);
        Object[] objArr = this.f5737r;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5738s;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0222b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i7 = this.f5738s;
        Object[] objArr = this.f5737r;
        if (i7 == objArr.length) {
            this.f5737r = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5737r;
        int i8 = this.f5738s;
        this.f5738s = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
