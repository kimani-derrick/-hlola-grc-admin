package e2;

import android.util.Pair;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class z0 extends J0 {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ int f10101A = 0;

    /* renamed from: r  reason: collision with root package name */
    public final int f10102r;

    /* renamed from: s  reason: collision with root package name */
    public final H2.g0 f10103s;

    /* renamed from: t  reason: collision with root package name */
    public final int f10104t;

    /* renamed from: u  reason: collision with root package name */
    public final int f10105u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f10106v;

    /* renamed from: w  reason: collision with root package name */
    public final int[] f10107w;

    /* renamed from: x  reason: collision with root package name */
    public final J0[] f10108x;

    /* renamed from: y  reason: collision with root package name */
    public final Object[] f10109y;

    /* renamed from: z  reason: collision with root package name */
    public final HashMap f10110z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z0(java.util.List r7, H2.g0 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            e2.J0[] r0 = new e2.J0[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            e2.f0 r4 = (e2.InterfaceC0605f0) r4
            int r5 = r3 + 1
            e2.J0 r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            e2.f0 r3 = (e2.InterfaceC0605f0) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.z0.<init>(java.util.List, H2.g0):void");
    }

    @Override // e2.J0
    public final int a(boolean z7) {
        if (this.f10102r == 0) {
            return -1;
        }
        int i7 = 0;
        if (z7) {
            int[] iArr = this.f10103s.f1064b;
            if (iArr.length > 0) {
                i7 = iArr[0];
            } else {
                i7 = -1;
            }
        }
        do {
            J0[] j0Arr = this.f10108x;
            if (j0Arr[i7].q()) {
                i7 = r(i7, z7);
            } else {
                return j0Arr[i7].a(z7) + this.f10107w[i7];
            }
        } while (i7 != -1);
        return -1;
    }

    @Override // e2.J0
    public final int b(Object obj) {
        int intValue;
        int b7;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f10110z.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (b7 = this.f10108x[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.f10106v[intValue] + b7;
    }

    @Override // e2.J0
    public final int c(boolean z7) {
        int i7;
        int i8 = this.f10102r;
        if (i8 == 0) {
            return -1;
        }
        if (z7) {
            int[] iArr = this.f10103s.f1064b;
            if (iArr.length > 0) {
                i7 = iArr[iArr.length - 1];
            } else {
                i7 = -1;
            }
        } else {
            i7 = i8 - 1;
        }
        do {
            J0[] j0Arr = this.f10108x;
            if (j0Arr[i7].q()) {
                i7 = s(i7, z7);
            } else {
                return j0Arr[i7].c(z7) + this.f10107w[i7];
            }
        } while (i7 != -1);
        return -1;
    }

    @Override // e2.J0
    public final int e(int i7, int i8, boolean z7) {
        int[] iArr = this.f10107w;
        int i9 = 0;
        int e3 = Z2.H.e(iArr, i7 + 1, false, false);
        int i10 = iArr[e3];
        J0[] j0Arr = this.f10108x;
        J0 j02 = j0Arr[e3];
        int i11 = i7 - i10;
        if (i8 != 2) {
            i9 = i8;
        }
        int e7 = j02.e(i11, i9, z7);
        if (e7 != -1) {
            return i10 + e7;
        }
        int r3 = r(e3, z7);
        while (r3 != -1 && j0Arr[r3].q()) {
            r3 = r(r3, z7);
        }
        if (r3 != -1) {
            return j0Arr[r3].a(z7) + iArr[r3];
        } else if (i8 != 2) {
            return -1;
        } else {
            return a(z7);
        }
    }

    @Override // e2.J0
    public final H0 g(int i7, H0 h02, boolean z7) {
        int[] iArr = this.f10106v;
        int e3 = Z2.H.e(iArr, i7 + 1, false, false);
        int i8 = this.f10107w[e3];
        this.f10108x[e3].g(i7 - iArr[e3], h02, z7);
        h02.f9554s += i8;
        if (z7) {
            Object obj = this.f10109y[e3];
            Object obj2 = h02.f9553r;
            obj2.getClass();
            h02.f9553r = Pair.create(obj, obj2);
        }
        return h02;
    }

    @Override // e2.J0
    public final H0 h(Object obj, H0 h02) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f10110z.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i7 = this.f10107w[intValue];
        this.f10108x[intValue].h(obj3, h02);
        h02.f9554s += i7;
        h02.f9553r = obj;
        return h02;
    }

    @Override // e2.J0
    public final int i() {
        return this.f10105u;
    }

    @Override // e2.J0
    public final int l(int i7, int i8, boolean z7) {
        int[] iArr = this.f10107w;
        int i9 = 0;
        int e3 = Z2.H.e(iArr, i7 + 1, false, false);
        int i10 = iArr[e3];
        J0[] j0Arr = this.f10108x;
        J0 j02 = j0Arr[e3];
        int i11 = i7 - i10;
        if (i8 != 2) {
            i9 = i8;
        }
        int l7 = j02.l(i11, i9, z7);
        if (l7 != -1) {
            return i10 + l7;
        }
        int s6 = s(e3, z7);
        while (s6 != -1 && j0Arr[s6].q()) {
            s6 = s(s6, z7);
        }
        if (s6 != -1) {
            return j0Arr[s6].c(z7) + iArr[s6];
        } else if (i8 != 2) {
            return -1;
        } else {
            return c(z7);
        }
    }

    @Override // e2.J0
    public final Object m(int i7) {
        int[] iArr = this.f10106v;
        int e3 = Z2.H.e(iArr, i7 + 1, false, false);
        return Pair.create(this.f10109y[e3], this.f10108x[e3].m(i7 - iArr[e3]));
    }

    @Override // e2.J0
    public final I0 n(int i7, I0 i02, long j7) {
        int[] iArr = this.f10107w;
        int e3 = Z2.H.e(iArr, i7 + 1, false, false);
        int i8 = iArr[e3];
        int i9 = this.f10106v[e3];
        this.f10108x[e3].n(i7 - i8, i02, j7);
        Object obj = this.f10109y[e3];
        if (!I0.f9561H.equals(i02.f9582q)) {
            obj = Pair.create(obj, i02.f9582q);
        }
        i02.f9582q = obj;
        i02.f9580E += i9;
        i02.F += i9;
        return i02;
    }

    @Override // e2.J0
    public final int p() {
        return this.f10104t;
    }

    public final int r(int i7, boolean z7) {
        if (z7) {
            H2.g0 g0Var = this.f10103s;
            int i8 = g0Var.f1065c[i7] + 1;
            int[] iArr = g0Var.f1064b;
            if (i8 >= iArr.length) {
                return -1;
            }
            return iArr[i8];
        } else if (i7 >= this.f10102r - 1) {
            return -1;
        } else {
            return i7 + 1;
        }
    }

    public final int s(int i7, boolean z7) {
        if (z7) {
            H2.g0 g0Var = this.f10103s;
            int i8 = g0Var.f1065c[i7] - 1;
            if (i8 < 0) {
                return -1;
            }
            return g0Var.f1064b[i8];
        } else if (i7 <= 0) {
            return -1;
        } else {
            return i7 - 1;
        }
    }

    public z0(J0[] j0Arr, Object[] objArr, H2.g0 g0Var) {
        this.f10103s = g0Var;
        this.f10102r = g0Var.f1064b.length;
        int length = j0Arr.length;
        this.f10108x = j0Arr;
        this.f10106v = new int[length];
        this.f10107w = new int[length];
        this.f10109y = objArr;
        this.f10110z = new HashMap();
        int length2 = j0Arr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < length2) {
            J0 j02 = j0Arr[i7];
            this.f10108x[i10] = j02;
            this.f10107w[i10] = i8;
            this.f10106v[i10] = i9;
            i8 += j02.p();
            i9 += this.f10108x[i10].i();
            this.f10110z.put(objArr[i10], Integer.valueOf(i10));
            i7++;
            i10++;
        }
        this.f10104t = i8;
        this.f10105u = i9;
    }
}
