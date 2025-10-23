package o;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p.AbstractC1078a;
/* loaded from: classes.dex */
public class j {

    /* renamed from: q  reason: collision with root package name */
    public int[] f12807q;

    /* renamed from: r  reason: collision with root package name */
    public Object[] f12808r;

    /* renamed from: s  reason: collision with root package name */
    public int f12809s;

    public j() {
        this(0);
    }

    public final int a(Object obj) {
        int i7 = this.f12809s * 2;
        Object[] objArr = this.f12808r;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (M5.g.a(obj, objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i7) {
        int i8 = this.f12809s;
        int[] iArr = this.f12807q;
        if (iArr.length < i7) {
            int[] copyOf = Arrays.copyOf(iArr, i7);
            M5.g.e(copyOf, "copyOf(this, newSize)");
            this.f12807q = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12808r, i7 * 2);
            M5.g.e(copyOf2, "copyOf(this, newSize)");
            this.f12808r = copyOf2;
        }
        if (this.f12809s == i8) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final int c(int i7, Object obj) {
        int i8 = this.f12809s;
        if (i8 == 0) {
            return -1;
        }
        int a7 = AbstractC1078a.a(i8, i7, this.f12807q);
        if (a7 < 0) {
            return a7;
        }
        if (M5.g.a(obj, this.f12808r[a7 << 1])) {
            return a7;
        }
        int i9 = a7 + 1;
        while (i9 < i8 && this.f12807q[i9] == i7) {
            if (M5.g.a(obj, this.f12808r[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a7 - 1; i10 >= 0 && this.f12807q[i10] == i7; i10--) {
            if (M5.g.a(obj, this.f12808r[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final void clear() {
        if (this.f12809s > 0) {
            this.f12807q = AbstractC1078a.f13098a;
            this.f12808r = AbstractC1078a.f13099b;
            this.f12809s = 0;
        }
        if (this.f12809s <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i7 = this.f12809s;
        if (i7 == 0) {
            return -1;
        }
        int a7 = AbstractC1078a.a(i7, 0, this.f12807q);
        if (a7 < 0) {
            return a7;
        }
        if (this.f12808r[a7 << 1] == null) {
            return a7;
        }
        int i8 = a7 + 1;
        while (i8 < i7 && this.f12807q[i8] == 0) {
            if (this.f12808r[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a7 - 1; i9 >= 0 && this.f12807q[i9] == 0; i9--) {
            if (this.f12808r[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i7 = this.f12809s;
                if (i7 != ((j) obj).f12809s) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object f = f(i8);
                    Object i9 = i(i8);
                    Object obj2 = jVar.get(f);
                    if (i9 == null) {
                        if (obj2 != null || !jVar.containsKey(f)) {
                            return false;
                        }
                    } else if (!M5.g.a(i9, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f12809s != ((Map) obj).size()) {
                return false;
            } else {
                int i10 = this.f12809s;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object f7 = f(i11);
                    Object i12 = i(i11);
                    Object obj3 = ((Map) obj).get(f7);
                    if (i12 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(f7)) {
                            return false;
                        }
                    } else if (!M5.g.a(i12, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i7) {
        if (i7 >= 0 && i7 < this.f12809s) {
            return this.f12808r[i7 << 1];
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Expected index to be within 0..size()-1, but was ", i7).toString());
    }

    public final Object g(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f12809s)) {
            Object[] objArr = this.f12808r;
            int i9 = i7 << 1;
            Object obj = objArr[i9 + 1];
            if (i8 <= 1) {
                clear();
            } else {
                int i10 = i8 - 1;
                int[] iArr = this.f12807q;
                int i11 = 8;
                if (iArr.length > 8 && i8 < iArr.length / 3) {
                    if (i8 > 8) {
                        i11 = i8 + (i8 >> 1);
                    }
                    int[] copyOf = Arrays.copyOf(iArr, i11);
                    M5.g.e(copyOf, "copyOf(this, newSize)");
                    this.f12807q = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.f12808r, i11 << 1);
                    M5.g.e(copyOf2, "copyOf(this, newSize)");
                    this.f12808r = copyOf2;
                    if (i8 == this.f12809s) {
                        if (i7 > 0) {
                            A5.j.P(0, 0, i7, iArr, this.f12807q);
                            A5.j.Q(0, 0, i9, objArr, this.f12808r);
                        }
                        if (i7 < i10) {
                            int i12 = i7 + 1;
                            A5.j.P(i7, i12, i8, iArr, this.f12807q);
                            A5.j.Q(i9, i12 << 1, i8 << 1, objArr, this.f12808r);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    if (i7 < i10) {
                        int i13 = i7 + 1;
                        A5.j.P(i7, i13, i8, iArr, iArr);
                        Object[] objArr2 = this.f12808r;
                        A5.j.Q(i9, i13 << 1, i8 << 1, objArr2, objArr2);
                    }
                    Object[] objArr3 = this.f12808r;
                    int i14 = i10 << 1;
                    objArr3[i14] = null;
                    objArr3[i14 + 1] = null;
                }
                if (i8 == this.f12809s) {
                    this.f12809s = i10;
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            return obj;
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Expected index to be within 0..size()-1, but was ", i7).toString());
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.f12808r[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return this.f12808r[(d << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i7, Object obj) {
        if (i7 >= 0 && i7 < this.f12809s) {
            int i8 = (i7 << 1) + 1;
            Object[] objArr = this.f12808r;
            Object obj2 = objArr[i8];
            objArr[i8] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Expected index to be within 0..size()-1, but was ", i7).toString());
    }

    public final int hashCode() {
        int i7;
        int[] iArr = this.f12807q;
        Object[] objArr = this.f12808r;
        int i8 = this.f12809s;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            int i12 = iArr[i10];
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i11 += i7 ^ i12;
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public final Object i(int i7) {
        if (i7 >= 0 && i7 < this.f12809s) {
            return this.f12808r[(i7 << 1) + 1];
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Expected index to be within 0..size()-1, but was ", i7).toString());
    }

    public final boolean isEmpty() {
        if (this.f12809s <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i7;
        int e3;
        int i8 = this.f12809s;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        if (obj != null) {
            e3 = c(i7, obj);
        } else {
            e3 = e();
        }
        if (e3 >= 0) {
            int i9 = (e3 << 1) + 1;
            Object[] objArr = this.f12808r;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~e3;
        int[] iArr = this.f12807q;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i11);
            M5.g.e(copyOf, "copyOf(this, newSize)");
            this.f12807q = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12808r, i11 << 1);
            M5.g.e(copyOf2, "copyOf(this, newSize)");
            this.f12808r = copyOf2;
            if (i8 != this.f12809s) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i8) {
            int[] iArr2 = this.f12807q;
            int i12 = i10 + 1;
            A5.j.P(i12, i10, i8, iArr2, iArr2);
            Object[] objArr2 = this.f12808r;
            A5.j.Q(i12 << 1, i10 << 1, this.f12809s << 1, objArr2, objArr2);
        }
        int i13 = this.f12809s;
        if (i8 == i13) {
            int[] iArr3 = this.f12807q;
            if (i10 < iArr3.length) {
                iArr3[i10] = i7;
                Object[] objArr3 = this.f12808r;
                int i14 = i10 << 1;
                objArr3[i14] = obj;
                objArr3[i14 + 1] = obj2;
                this.f12809s = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f12809s;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12809s * 28);
        sb.append('{');
        int i7 = this.f12809s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object f = f(i8);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i9 = i(i8);
            if (i9 != sb) {
                sb.append(i9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        M5.g.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public j(int i7) {
        this.f12807q = i7 == 0 ? AbstractC1078a.f13098a : new int[i7];
        this.f12808r = i7 == 0 ? AbstractC1078a.f13099b : new Object[i7 << 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !M5.g.a(obj2, i(d))) {
            return false;
        }
        g(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !M5.g.a(obj2, i(d))) {
            return false;
        }
        h(d, obj3);
        return true;
    }
}
