package O3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
/* loaded from: classes.dex */
public final class Z implements Map, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final Z f2634w = new Z(null, new Object[0], 0);

    /* renamed from: q  reason: collision with root package name */
    public transient W f2635q;

    /* renamed from: r  reason: collision with root package name */
    public transient X f2636r;

    /* renamed from: s  reason: collision with root package name */
    public transient Y f2637s;

    /* renamed from: t  reason: collision with root package name */
    public final transient Object f2638t;

    /* renamed from: u  reason: collision with root package name */
    public final transient Object[] f2639u;

    /* renamed from: v  reason: collision with root package name */
    public final transient int f2640v;

    public Z(Object obj, Object[] objArr, int i7) {
        this.f2638t = obj;
        this.f2639u = objArr;
        this.f2640v = i7;
    }

    public static C.d a() {
        return new C.d(4, 4);
    }

    public static Z b(Map map) {
        int i7;
        if ((map instanceof Z) && !(map instanceof SortedMap)) {
            Z z7 = (Z) map;
            z7.getClass();
            return z7;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z8 = entrySet instanceof Collection;
        if (z8) {
            i7 = entrySet.size();
        } else {
            i7 = 4;
        }
        C.d dVar = new C.d(i7, 4);
        if (z8) {
            int size = entrySet.size() * 2;
            Object[] objArr = (Object[]) dVar.f325s;
            if (size > objArr.length) {
                dVar.f325s = Arrays.copyOf(objArr, AbstractC0080y.f(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            dVar.z(entry.getKey(), entry.getValue());
        }
        return dVar.c();
    }

    @Override // java.util.Map
    /* renamed from: c */
    public final H entrySet() {
        W w7 = this.f2635q;
        if (w7 == null) {
            W w8 = new W(this, this.f2639u, this.f2640v);
            this.f2635q = w8;
            return w8;
        }
        return w7;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d */
    public final AbstractC0081z values() {
        Y y3 = this.f2637s;
        if (y3 == null) {
            Y y4 = new Y(this.f2639u, 1, this.f2640v);
            this.f2637s = y4;
            return y4;
        }
        return y3;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC0072p.f(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r8.f2639u
            int r3 = r8.f2640v
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L3
            r9 = r2[r1]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r3 = r8.f2638t
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = O3.AbstractC0072p.p(r3)
        L37:
            r3 = r3 & r5
            r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L4d:
            int r3 = r3 + 1
            goto L37
        L50:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = O3.AbstractC0072p.p(r3)
        L62:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L62
        L7c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = O3.AbstractC0072p.p(r5)
        L88:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.Z.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0072p.j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        X x7 = this.f2636r;
        if (x7 == null) {
            X x8 = new X(this, new Y(this.f2639u, 0, this.f2640v));
            this.f2636r = x8;
            return x8;
        }
        return x7;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2640v;
    }

    public final String toString() {
        int i7 = this.f2640v;
        AbstractC0072p.c("size", i7);
        StringBuilder sb = new StringBuilder((int) Math.min(i7 * 8, 1073741824L));
        sb.append('{');
        boolean z7 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z7) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z7 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
