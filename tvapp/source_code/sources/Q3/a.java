package Q3;

import android.support.v4.media.session.b;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class a extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final int[] f2858q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2859r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2860s;

    public a(int i7, int i8, int[] iArr) {
        this.f2858q = iArr;
        this.f2859r = i7;
        this.f2860s = i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (b.o0(((Integer) obj).intValue(), this.f2859r, this.f2860s, this.f2858q) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.f2858q[this.f2859r + i7] != aVar.f2858q[aVar.f2859r + i7]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        b.h(i7, size());
        return Integer.valueOf(this.f2858q[this.f2859r + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = this.f2859r; i8 < this.f2860s; i8++) {
            i7 = (i7 * 31) + this.f2858q[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int[] iArr = this.f2858q;
            int i7 = this.f2859r;
            int o02 = b.o0(intValue, i7, this.f2860s, iArr);
            if (o02 >= 0) {
                return o02 - i7;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i7;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i8 = this.f2860s;
            while (true) {
                i8--;
                i7 = this.f2859r;
                if (i8 >= i7) {
                    if (this.f2858q[i8] == intValue) {
                        break;
                    }
                } else {
                    i8 = -1;
                    break;
                }
            }
            if (i8 >= 0) {
                return i8 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Integer num = (Integer) obj;
        b.h(i7, size());
        int i8 = this.f2859r + i7;
        int[] iArr = this.f2858q;
        int i9 = iArr[i8];
        num.getClass();
        iArr[i8] = num.intValue();
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2860s - this.f2859r;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        b.m(i7, i8, size());
        if (i7 == i8) {
            return Collections.emptyList();
        }
        int i9 = this.f2859r;
        return new a(i7 + i9, i9 + i8, this.f2858q);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f2858q;
        int i7 = this.f2859r;
        int i8 = iArr[i7];
        while (true) {
            sb.append(i8);
            i7++;
            if (i7 < this.f2860s) {
                sb.append(", ");
                i8 = iArr[i7];
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
