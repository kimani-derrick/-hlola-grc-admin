package B5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import w4.l0;
/* loaded from: classes.dex */
public final class f implements Map, Serializable, N5.d {

    /* renamed from: D  reason: collision with root package name */
    public static final f f296D;

    /* renamed from: A  reason: collision with root package name */
    public h f297A;

    /* renamed from: B  reason: collision with root package name */
    public g f298B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f299C;

    /* renamed from: q  reason: collision with root package name */
    public Object[] f300q;

    /* renamed from: r  reason: collision with root package name */
    public Object[] f301r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f302s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f303t;

    /* renamed from: u  reason: collision with root package name */
    public int f304u;

    /* renamed from: v  reason: collision with root package name */
    public int f305v;

    /* renamed from: w  reason: collision with root package name */
    public int f306w;

    /* renamed from: x  reason: collision with root package name */
    public int f307x;

    /* renamed from: y  reason: collision with root package name */
    public int f308y;

    /* renamed from: z  reason: collision with root package name */
    public g f309z;

    static {
        f fVar = new f(0);
        fVar.f299C = true;
        f296D = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i7 = i(obj);
            int i8 = this.f304u * 2;
            int length = this.f303t.length / 2;
            if (i8 > length) {
                i8 = length;
            }
            int i9 = 0;
            while (true) {
                int[] iArr = this.f303t;
                int i10 = iArr[i7];
                if (i10 <= 0) {
                    int i11 = this.f305v;
                    Object[] objArr = this.f300q;
                    if (i11 >= objArr.length) {
                        f(1);
                    } else {
                        int i12 = i11 + 1;
                        this.f305v = i12;
                        objArr[i11] = obj;
                        this.f302s[i11] = i7;
                        iArr[i7] = i12;
                        this.f308y++;
                        this.f307x++;
                        if (i9 > this.f304u) {
                            this.f304u = i9;
                        }
                        return i11;
                    }
                } else if (M5.g.a(this.f300q[i10 - 1], obj)) {
                    return -i10;
                } else {
                    i9++;
                    if (i9 > i8) {
                        j(this.f303t.length * 2);
                        break;
                    }
                    int i13 = i7 - 1;
                    if (i7 == 0) {
                        i7 = this.f303t.length - 1;
                    } else {
                        i7 = i13;
                    }
                }
            }
        }
    }

    public final f b() {
        c();
        this.f299C = true;
        if (this.f308y > 0) {
            return this;
        }
        f fVar = f296D;
        M5.g.d(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (!this.f299C) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        R5.b it = new R5.a(0, this.f305v - 1, 1).iterator();
        while (it.f2927s) {
            int a7 = it.a();
            int[] iArr = this.f302s;
            int i7 = iArr[a7];
            if (i7 >= 0) {
                this.f303t[i7] = 0;
                iArr[a7] = -1;
            }
        }
        l0.N(this.f300q, 0, this.f305v);
        Object[] objArr = this.f301r;
        if (objArr != null) {
            l0.N(objArr, 0, this.f305v);
        }
        this.f308y = 0;
        this.f305v = 0;
        this.f307x++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean d(Collection collection) {
        M5.g.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        M5.g.f(entry, "entry");
        int g7 = g(entry.getKey());
        if (g7 < 0) {
            return false;
        }
        Object[] objArr = this.f301r;
        M5.g.c(objArr);
        return M5.g.a(objArr[g7], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f298B;
        if (gVar == null) {
            g gVar2 = new g(this, 0);
            this.f298B = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f308y != map.size() || !d(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i7) {
        Object[] objArr;
        Object[] objArr2 = this.f300q;
        int length = objArr2.length;
        int i8 = this.f305v;
        int i9 = length - i8;
        int i10 = i8 - this.f308y;
        if (i9 < i7 && i9 + i10 >= i7 && i10 >= objArr2.length / 4) {
            j(this.f303t.length);
            return;
        }
        int i11 = i8 + i7;
        if (i11 >= 0) {
            if (i11 > objArr2.length) {
                int length2 = objArr2.length;
                int i12 = length2 + (length2 >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                if (i12 - 2147483639 > 0) {
                    if (i11 > 2147483639) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i12);
                M5.g.e(copyOf, "copyOf(...)");
                this.f300q = copyOf;
                Object[] objArr3 = this.f301r;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i12);
                    M5.g.e(objArr, "copyOf(...)");
                } else {
                    objArr = null;
                }
                this.f301r = objArr;
                int[] copyOf2 = Arrays.copyOf(this.f302s, i12);
                M5.g.e(copyOf2, "copyOf(...)");
                this.f302s = copyOf2;
                if (i12 < 1) {
                    i12 = 1;
                }
                int highestOneBit = Integer.highestOneBit(i12 * 3);
                if (highestOneBit > this.f303t.length) {
                    j(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int g(Object obj) {
        int i7 = i(obj);
        int i8 = this.f304u;
        while (true) {
            int i9 = this.f303t[i7];
            if (i9 == 0) {
                return -1;
            }
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (M5.g.a(this.f300q[i10], obj)) {
                    return i10;
                }
            }
            i8--;
            if (i8 < 0) {
                return -1;
            }
            int i11 = i7 - 1;
            if (i7 == 0) {
                i7 = this.f303t.length - 1;
            } else {
                i7 = i11;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g7 = g(obj);
        if (g7 < 0) {
            return null;
        }
        Object[] objArr = this.f301r;
        M5.g.c(objArr);
        return objArr[g7];
    }

    public final int h(Object obj) {
        int i7 = this.f305v;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f302s[i7] >= 0) {
                Object[] objArr = this.f301r;
                M5.g.c(objArr);
                if (M5.g.a(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i7;
        int i8;
        c cVar = new c(this, 0);
        int i9 = 0;
        while (cVar.hasNext()) {
            int i10 = cVar.f292q;
            f fVar = (f) cVar.f295t;
            if (i10 < fVar.f305v) {
                cVar.f292q = i10 + 1;
                cVar.f293r = i10;
                Object obj = fVar.f300q[i10];
                if (obj != null) {
                    i7 = obj.hashCode();
                } else {
                    i7 = 0;
                }
                Object[] objArr = fVar.f301r;
                M5.g.c(objArr);
                Object obj2 = objArr[cVar.f293r];
                if (obj2 != null) {
                    i8 = obj2.hashCode();
                } else {
                    i8 = 0;
                }
                cVar.j();
                i9 += i7 ^ i8;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i9;
    }

    public final int i(Object obj) {
        int i7;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        return (i7 * (-1640531527)) >>> this.f306w;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f308y == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r3[r0] = r7;
        r6.f302s[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r7) {
        /*
            r6 = this;
            int r0 = r6.f307x
            int r0 = r0 + 1
            r6.f307x = r0
            int r0 = r6.f305v
            int r1 = r6.f308y
            r2 = 0
            if (r0 <= r1) goto L3a
            java.lang.Object[] r0 = r6.f301r
            r1 = r2
            r3 = r1
        L11:
            int r4 = r6.f305v
            if (r1 >= r4) goto L2c
            int[] r4 = r6.f302s
            r4 = r4[r1]
            if (r4 < 0) goto L29
            java.lang.Object[] r4 = r6.f300q
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L27
            r4 = r0[r1]
            r0[r3] = r4
        L27:
            int r3 = r3 + 1
        L29:
            int r1 = r1 + 1
            goto L11
        L2c:
            java.lang.Object[] r1 = r6.f300q
            w4.l0.N(r1, r3, r4)
            if (r0 == 0) goto L38
            int r1 = r6.f305v
            w4.l0.N(r0, r3, r1)
        L38:
            r6.f305v = r3
        L3a:
            int[] r0 = r6.f303t
            int r1 = r0.length
            if (r7 == r1) goto L4c
            int[] r0 = new int[r7]
            r6.f303t = r0
            int r7 = java.lang.Integer.numberOfLeadingZeros(r7)
            int r7 = r7 + 1
            r6.f306w = r7
            goto L50
        L4c:
            int r7 = r0.length
            java.util.Arrays.fill(r0, r2, r7, r2)
        L50:
            int r7 = r6.f305v
            if (r2 >= r7) goto L84
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.f300q
            r0 = r0[r2]
            int r0 = r6.i(r0)
            int r1 = r6.f304u
        L60:
            int[] r3 = r6.f303t
            r4 = r3[r0]
            if (r4 != 0) goto L6e
            r3[r0] = r7
            int[] r1 = r6.f302s
            r1[r2] = r0
            r2 = r7
            goto L50
        L6e:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L7c
            int r4 = r0 + (-1)
            if (r0 != 0) goto L7a
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L60
        L7a:
            r0 = r4
            goto L60
        L7c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r7.<init>(r0)
            throw r7
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.f.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f300q
            java.lang.String r1 = "<this>"
            M5.g.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.f302s
            r0 = r0[r12]
            int r1 = r11.f304u
            int r1 = r1 * 2
            int[] r2 = r11.f303t
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1a
            r1 = r2
        L1a:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1e:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L28
            int[] r0 = r11.f303t
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L29
        L28:
            r0 = r5
        L29:
            int r4 = r4 + 1
            int r5 = r11.f304u
            r6 = -1
            if (r4 <= r5) goto L35
            int[] r0 = r11.f303t
            r0[r1] = r2
            goto L66
        L35:
            int[] r5 = r11.f303t
            r7 = r5[r0]
            if (r7 != 0) goto L3e
            r5[r1] = r2
            goto L66
        L3e:
            if (r7 >= 0) goto L45
            r5[r1] = r6
        L42:
            r1 = r0
            r4 = r2
            goto L5f
        L45:
            java.lang.Object[] r5 = r11.f300q
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.i(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f303t
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L5f
            r9[r1] = r7
            int[] r4 = r11.f302s
            r4[r8] = r1
            goto L42
        L5f:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1e
            int[] r0 = r11.f303t
            r0[r1] = r6
        L66:
            int[] r0 = r11.f302s
            r0[r12] = r6
            int r12 = r11.f308y
            int r12 = r12 + r6
            r11.f308y = r12
            int r12 = r11.f307x
            int r12 = r12 + 1
            r11.f307x = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.f.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f309z;
        if (gVar == null) {
            g gVar2 = new g(this, 1);
            this.f309z = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a7 = a(obj);
        Object[] objArr = this.f301r;
        if (objArr == null) {
            int length = this.f300q.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.f301r = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
        }
        if (a7 < 0) {
            int i7 = (-a7) - 1;
            Object obj3 = objArr[i7];
            objArr[i7] = obj2;
            return obj3;
        }
        objArr[a7] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        M5.g.f(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a7 = a(entry.getKey());
                Object[] objArr = this.f301r;
                if (objArr == null) {
                    int length = this.f300q.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.f301r = objArr;
                    } else {
                        throw new IllegalArgumentException("capacity must be non-negative.".toString());
                    }
                }
                if (a7 >= 0) {
                    objArr[a7] = entry.getValue();
                } else {
                    int i7 = (-a7) - 1;
                    if (!M5.g.a(entry.getValue(), objArr[i7])) {
                        objArr[i7] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g7 = g(obj);
        if (g7 < 0) {
            g7 = -1;
        } else {
            k(g7);
        }
        if (g7 < 0) {
            return null;
        }
        Object[] objArr = this.f301r;
        M5.g.c(objArr);
        Object obj2 = objArr[g7];
        objArr[g7] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f308y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f308y * 3) + 2);
        sb.append("{");
        c cVar = new c(this, 0);
        int i7 = 0;
        while (cVar.hasNext()) {
            if (i7 > 0) {
                sb.append(", ");
            }
            int i8 = cVar.f292q;
            f fVar = (f) cVar.f295t;
            if (i8 < fVar.f305v) {
                cVar.f292q = i8 + 1;
                cVar.f293r = i8;
                Object obj = fVar.f300q[i8];
                if (obj == fVar) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = fVar.f301r;
                M5.g.c(objArr);
                Object obj2 = objArr[cVar.f293r];
                if (obj2 == fVar) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                cVar.j();
                i7++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        M5.g.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f297A;
        if (hVar == null) {
            h hVar2 = new h(this);
            this.f297A = hVar2;
            return hVar2;
        }
        return hVar;
    }

    public f(int i7) {
        if (i7 >= 0) {
            Object[] objArr = new Object[i7];
            int[] iArr = new int[i7];
            int highestOneBit = Integer.highestOneBit((i7 < 1 ? 1 : i7) * 3);
            this.f300q = objArr;
            this.f301r = null;
            this.f302s = iArr;
            this.f303t = new int[highestOneBit];
            this.f304u = 2;
            this.f305v = 0;
            this.f306w = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
