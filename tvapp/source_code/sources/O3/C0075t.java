package O3;

import a.AbstractC0189a;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* renamed from: O3.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075t extends AbstractMap implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public static final Object f2699z = new Object();

    /* renamed from: q  reason: collision with root package name */
    public transient Object f2700q;

    /* renamed from: r  reason: collision with root package name */
    public transient int[] f2701r;

    /* renamed from: s  reason: collision with root package name */
    public transient Object[] f2702s;

    /* renamed from: t  reason: collision with root package name */
    public transient Object[] f2703t;

    /* renamed from: u  reason: collision with root package name */
    public transient int f2704u;

    /* renamed from: v  reason: collision with root package name */
    public transient int f2705v;

    /* renamed from: w  reason: collision with root package name */
    public transient r f2706w;

    /* renamed from: x  reason: collision with root package name */
    public transient r f2707x;

    /* renamed from: y  reason: collision with root package name */
    public transient C0070n f2708y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, O3.t] */
    public static C0075t a(int i7) {
        ?? abstractMap = new AbstractMap();
        if (i7 >= 0) {
            abstractMap.f2704u = android.support.v4.media.session.b.t(i7, 1);
            return abstractMap;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final Map b() {
        Object obj = this.f2700q;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f2704u & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f2704u += 32;
        Map b7 = b();
        if (b7 != null) {
            this.f2704u = android.support.v4.media.session.b.t(size(), 3);
            b7.clear();
            this.f2700q = null;
        } else {
            Arrays.fill(i(), 0, this.f2705v, (Object) null);
            Arrays.fill(j(), 0, this.f2705v, (Object) null);
            Object obj = this.f2700q;
            Objects.requireNonNull(obj);
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(h(), 0, this.f2705v, 0);
        }
        this.f2705v = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map b7 = b();
        if (b7 != null) {
            return b7.containsKey(obj);
        }
        if (d(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map b7 = b();
        if (b7 != null) {
            return b7.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f2705v; i7++) {
            if (AbstractC0189a.r(obj, j()[i7])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int q5 = AbstractC0072p.q(obj);
        int c5 = c();
        Object obj2 = this.f2700q;
        Objects.requireNonNull(obj2);
        int r3 = AbstractC0072p.r(q5 & c5, obj2);
        if (r3 == 0) {
            return -1;
        }
        int i7 = ~c5;
        int i8 = q5 & i7;
        do {
            int i9 = r3 - 1;
            int i10 = h()[i9];
            if ((i10 & i7) == i8 && AbstractC0189a.r(obj, i()[i9])) {
                return i9;
            }
            r3 = i10 & c5;
        } while (r3 != 0);
        return -1;
    }

    public final void e(int i7, int i8) {
        Object obj = this.f2700q;
        Objects.requireNonNull(obj);
        int[] h7 = h();
        Object[] i9 = i();
        Object[] j7 = j();
        int size = size();
        int i10 = size - 1;
        if (i7 < i10) {
            Object obj2 = i9[i10];
            i9[i7] = obj2;
            j7[i7] = j7[i10];
            i9[i10] = null;
            j7[i10] = null;
            h7[i7] = h7[i10];
            h7[i10] = 0;
            int q5 = AbstractC0072p.q(obj2) & i8;
            int r3 = AbstractC0072p.r(q5, obj);
            if (r3 == size) {
                AbstractC0072p.s(q5, i7 + 1, obj);
                return;
            }
            while (true) {
                int i11 = r3 - 1;
                int i12 = h7[i11];
                int i13 = i12 & i8;
                if (i13 == size) {
                    h7[i11] = AbstractC0072p.l(i12, i7 + 1, i8);
                    return;
                }
                r3 = i13;
            }
        } else {
            i9[i7] = null;
            j7[i7] = null;
            h7[i7] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        r rVar = this.f2707x;
        if (rVar == null) {
            r rVar2 = new r(this, 0);
            this.f2707x = rVar2;
            return rVar2;
        }
        return rVar;
    }

    public final boolean f() {
        if (this.f2700q == null) {
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        boolean f = f();
        Object obj2 = f2699z;
        if (f) {
            return obj2;
        }
        int c5 = c();
        Object obj3 = this.f2700q;
        Objects.requireNonNull(obj3);
        int n = AbstractC0072p.n(obj, null, c5, obj3, h(), i(), null);
        if (n == -1) {
            return obj2;
        }
        Object obj4 = j()[n];
        e(n, c5);
        this.f2705v--;
        this.f2704u += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map b7 = b();
        if (b7 != null) {
            return b7.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        return j()[d];
    }

    public final int[] h() {
        int[] iArr = this.f2701r;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f2702s;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f2703t;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i7, int i8, int i9, int i10) {
        Object e3 = AbstractC0072p.e(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            AbstractC0072p.s(i9 & i11, i10 + 1, e3);
        }
        Object obj = this.f2700q;
        Objects.requireNonNull(obj);
        int[] h7 = h();
        for (int i12 = 0; i12 <= i7; i12++) {
            int r3 = AbstractC0072p.r(i12, obj);
            while (r3 != 0) {
                int i13 = r3 - 1;
                int i14 = h7[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int r5 = AbstractC0072p.r(i16, e3);
                AbstractC0072p.s(i16, r3, e3);
                h7[i13] = AbstractC0072p.l(i15, r5, i11);
                r3 = i14 & i7;
            }
        }
        this.f2700q = e3;
        this.f2704u = AbstractC0072p.l(this.f2704u, 32 - Integer.numberOfLeadingZeros(i11), 31);
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        r rVar = this.f2706w;
        if (rVar == null) {
            r rVar2 = new r(this, 1);
            this.f2706w = rVar2;
            return rVar2;
        }
        return rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fc -> B:37:0x00e2). Please submit an issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0075t.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map b7 = b();
        if (b7 != null) {
            return b7.remove(obj);
        }
        Object g7 = g(obj);
        if (g7 == f2699z) {
            return null;
        }
        return g7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map b7 = b();
        if (b7 != null) {
            return b7.size();
        }
        return this.f2705v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0070n c0070n = this.f2708y;
        if (c0070n == null) {
            C0070n c0070n2 = new C0070n(1, this);
            this.f2708y = c0070n2;
            return c0070n2;
        }
        return c0070n;
    }
}
