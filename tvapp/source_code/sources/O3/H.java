package O3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* loaded from: classes.dex */
public abstract class H extends AbstractC0081z implements Set {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f2601s = 0;

    /* renamed from: r  reason: collision with root package name */
    public transient E f2602r;

    public static int o(int i7) {
        int max = Math.max(i7, 2);
        boolean z7 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z7 = false;
        }
        if (z7) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static H r(int i7, Object... objArr) {
        if (i7 != 0) {
            if (i7 != 1) {
                int o7 = o(i7);
                Object[] objArr2 = new Object[o7];
                int i8 = o7 - 1;
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < i7; i11++) {
                    Object obj = objArr[i11];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int p3 = AbstractC0072p.p(hashCode);
                        while (true) {
                            int i12 = p3 & i8;
                            Object obj2 = objArr2[i12];
                            if (obj2 == null) {
                                objArr[i10] = obj;
                                objArr2[i12] = obj;
                                i9 += hashCode;
                                i10++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                p3++;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(20);
                        sb.append("at index ");
                        sb.append(i11);
                        throw new NullPointerException(sb.toString());
                    }
                }
                Arrays.fill(objArr, i10, i7, (Object) null);
                if (i10 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new h0(obj3);
                } else if (o(i10) < o7 / 2) {
                    return r(i10, objArr);
                } else {
                    int length = objArr.length;
                    if (i10 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i10);
                    }
                    return new a0(i9, i8, i10, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new h0(obj4);
        }
        return a0.f2647z;
    }

    public static H s(Collection collection) {
        if ((collection instanceof H) && !(collection instanceof SortedSet)) {
            H h7 = (H) collection;
            if (!h7.l()) {
                return h7;
            }
        }
        Object[] array = collection.toArray();
        return r(array.length, array);
    }

    public static H u(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        boolean z7;
        if (objArr.length <= 2147483641) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            int length = objArr.length + 6;
            Object[] objArr2 = new Object[length];
            objArr2[0] = str;
            objArr2[1] = str2;
            objArr2[2] = str3;
            objArr2[3] = str4;
            objArr2[4] = str5;
            objArr2[5] = str6;
            System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
            return r(length, objArr2);
        }
        throw new IllegalArgumentException("the total number of elements must fit in an int");
    }

    @Override // O3.AbstractC0081z
    public E b() {
        E e3 = this.f2602r;
        if (e3 == null) {
            E t5 = t();
            this.f2602r = t5;
            return t5;
        }
        return e3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof H) && (this instanceof a0)) {
            H h7 = (H) obj;
            h7.getClass();
            if ((h7 instanceof a0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC0072p.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0072p.j(this);
    }

    public E t() {
        Object[] array = toArray(AbstractC0081z.f2716q);
        C c5 = E.f2597r;
        return E.o(array.length, array);
    }
}
