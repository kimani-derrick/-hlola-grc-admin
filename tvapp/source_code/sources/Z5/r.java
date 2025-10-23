package Z5;

import W5.C0098e;
import W5.C0100g;
import java.util.Arrays;
import w4.l0;
import z5.C1530l;
/* loaded from: classes.dex */
public class r extends a6.b implements o, c, b {

    /* renamed from: A  reason: collision with root package name */
    public int f4930A;

    /* renamed from: t  reason: collision with root package name */
    public final int f4931t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4932u;

    /* renamed from: v  reason: collision with root package name */
    public final int f4933v;

    /* renamed from: w  reason: collision with root package name */
    public Object[] f4934w;

    /* renamed from: x  reason: collision with root package name */
    public long f4935x;

    /* renamed from: y  reason: collision with root package name */
    public long f4936y;

    /* renamed from: z  reason: collision with root package name */
    public int f4937z;

    public r(int i7, int i8, int i9) {
        this.f4931t = i7;
        this.f4932u = i8;
        this.f4933v = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x007a, B:34:0x0082, B:38:0x0095, B:41:0x009c, B:42:0x00a2, B:43:0x00a3, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a6.b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [Z5.c] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [a6.d] */
    /* JADX WARN: Type inference failed for: r9v5, types: [Z5.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b1 -> B:16:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(Z5.r r8, Z5.c r9, D5.d r10) {
        /*
            boolean r0 = r10 instanceof Z5.q
            if (r0 == 0) goto L13
            r0 = r10
            Z5.q r0 = (Z5.q) r0
            int r1 = r0.f4929z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4929z = r1
            goto L18
        L13:
            Z5.q r0 = new Z5.q
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4927x
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4929z
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            W5.a0 r8 = r0.f4926w
            Z5.t r9 = r0.f4925v
            Z5.c r2 = r0.f4924u
            Z5.r r5 = r0.f4923t
            k3.AbstractC0958a.H(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L77
        L38:
            r8 = move-exception
            goto Lb7
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            W5.a0 r8 = r0.f4926w
            Z5.t r9 = r0.f4925v
            Z5.c r2 = r0.f4924u
            Z5.r r5 = r0.f4923t
            k3.AbstractC0958a.H(r10)     // Catch: java.lang.Throwable -> L38
            goto L7a
        L4f:
            Z5.t r9 = r0.f4925v
            Z5.c r8 = r0.f4924u
            Z5.r r2 = r0.f4923t
            k3.AbstractC0958a.H(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb7
        L5e:
            k3.AbstractC0958a.H(r10)
            a6.d r10 = r8.b()
            Z5.t r10 = (Z5.t) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            D5.i r2 = r0.f731r     // Catch: java.lang.Throwable -> Lb4
            M5.g.c(r2)     // Catch: java.lang.Throwable -> Lb4
            W5.v r5 = W5.C0114v.f4028r     // Catch: java.lang.Throwable -> Lb4
            D5.g r2 = r2.f(r5)     // Catch: java.lang.Throwable -> Lb4
            W5.a0 r2 = (W5.InterfaceC0093a0) r2     // Catch: java.lang.Throwable -> Lb4
        L77:
            r5 = r8
            r8 = r2
            r2 = r10
        L7a:
            java.lang.Object r10 = r5.q(r9)     // Catch: java.lang.Throwable -> L38
            B0.d r6 = Z5.s.f4938a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L93
            r0.f4923t = r5     // Catch: java.lang.Throwable -> L38
            r0.f4924u = r2     // Catch: java.lang.Throwable -> L38
            r0.f4925v = r9     // Catch: java.lang.Throwable -> L38
            r0.f4926w = r8     // Catch: java.lang.Throwable -> L38
            r0.f4929z = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.f(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L7a
            return
        L93:
            if (r8 == 0) goto La3
            boolean r6 = r8.a()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9c
            goto La3
        L9c:
            W5.j0 r8 = (W5.j0) r8     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.CancellationException r8 = r8.E()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La3:
            r0.f4923t = r5     // Catch: java.lang.Throwable -> L38
            r0.f4924u = r2     // Catch: java.lang.Throwable -> L38
            r0.f4925v = r9     // Catch: java.lang.Throwable -> L38
            r0.f4926w = r8     // Catch: java.lang.Throwable -> L38
            r0.f4929z = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return
        Lb4:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb7:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.r.h(Z5.r, Z5.c, D5.d):void");
    }

    @Override // Z5.c
    public final Object a(Object obj, D5.d dVar) {
        D5.d[] dVarArr;
        p pVar;
        if (n(obj)) {
            return C1530l.f16479a;
        }
        C0100g c0100g = new C0100g(1, l0.x(dVar));
        c0100g.w();
        D5.d[] dVarArr2 = a6.c.f5199a;
        synchronized (this) {
            try {
                if (o(obj)) {
                    c0100g.m(C1530l.f16479a);
                    dVarArr = k(dVarArr2);
                    pVar = null;
                } else {
                    p pVar2 = new p(this, this.f4937z + this.f4930A + l(), obj, c0100g);
                    j(pVar2);
                    this.f4930A++;
                    if (this.f4932u == 0) {
                        dVarArr2 = k(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    pVar = pVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            c0100g.y(new C0098e(1, pVar));
        }
        for (D5.d dVar2 : dVarArr) {
            if (dVar2 != null) {
                dVar2.m(C1530l.f16479a);
            }
        }
        Object v5 = c0100g.v();
        E5.a aVar = E5.a.f612q;
        if (v5 != aVar) {
            v5 = C1530l.f16479a;
        }
        if (v5 != aVar) {
            return C1530l.f16479a;
        }
        return v5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a6.d, Z5.t, java.lang.Object] */
    @Override // a6.b
    public final a6.d c() {
        ?? obj = new Object();
        obj.f4941a = -1L;
        return obj;
    }

    @Override // a6.b
    public final a6.d[] d() {
        return new t[2];
    }

    public final Object f(t tVar, q qVar) {
        C0100g c0100g = new C0100g(1, l0.x(qVar));
        c0100g.w();
        synchronized (this) {
            if (p(tVar) < 0) {
                tVar.f4942b = c0100g;
            } else {
                c0100g.m(C1530l.f16479a);
            }
        }
        Object v5 = c0100g.v();
        if (v5 == E5.a.f612q) {
            return v5;
        }
        return C1530l.f16479a;
    }

    public final void g() {
        if (this.f4932u == 0 && this.f4930A <= 1) {
            return;
        }
        Object[] objArr = this.f4934w;
        M5.g.c(objArr);
        while (this.f4930A > 0) {
            long l7 = l();
            int i7 = this.f4937z;
            int i8 = this.f4930A;
            if (objArr[((int) ((l7 + (i7 + i8)) - 1)) & (objArr.length - 1)] == s.f4938a) {
                this.f4930A = i8 - 1;
                s.c(objArr, l() + this.f4937z + this.f4930A, null);
            } else {
                return;
            }
        }
    }

    public final void i() {
        a6.d[] dVarArr;
        Object[] objArr = this.f4934w;
        M5.g.c(objArr);
        s.c(objArr, l(), null);
        this.f4937z--;
        long l7 = l() + 1;
        if (this.f4935x < l7) {
            this.f4935x = l7;
        }
        if (this.f4936y < l7) {
            if (this.f5197r != 0 && (dVarArr = this.f5196q) != null) {
                for (a6.d dVar : dVarArr) {
                    if (dVar != null) {
                        t tVar = (t) dVar;
                        long j7 = tVar.f4941a;
                        if (j7 >= 0 && j7 < l7) {
                            tVar.f4941a = l7;
                        }
                    }
                }
            }
            this.f4936y = l7;
        }
    }

    public final void j(Object obj) {
        int i7 = this.f4937z + this.f4930A;
        Object[] objArr = this.f4934w;
        if (objArr == null) {
            objArr = m(null, 0, 2);
        } else if (i7 >= objArr.length) {
            objArr = m(objArr, i7, objArr.length * 2);
        }
        s.c(objArr, l() + i7, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final D5.d[] k(D5.d[] dVarArr) {
        a6.d[] dVarArr2;
        t tVar;
        C0100g c0100g;
        int length = dVarArr.length;
        if (this.f5197r != 0 && (dVarArr2 = this.f5196q) != null) {
            int length2 = dVarArr2.length;
            int i7 = 0;
            dVarArr = dVarArr;
            while (i7 < length2) {
                a6.d dVar = dVarArr2[i7];
                if (dVar != null && (c0100g = (tVar = (t) dVar).f4942b) != null && p(tVar) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        M5.g.e(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = c0100g;
                    tVar.f4942b = null;
                    length++;
                }
                i7++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long l() {
        return Math.min(this.f4936y, this.f4935x);
    }

    public final Object[] m(Object[] objArr, int i7, int i8) {
        if (i8 > 0) {
            Object[] objArr2 = new Object[i8];
            this.f4934w = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long l7 = l();
            for (int i9 = 0; i9 < i7; i9++) {
                long j7 = i9 + l7;
                s.c(objArr2, j7, objArr[((int) j7) & (objArr.length - 1)]);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean n(Object obj) {
        int i7;
        boolean z7;
        D5.d[] dVarArr = a6.c.f5199a;
        synchronized (this) {
            if (o(obj)) {
                dVarArr = k(dVarArr);
                z7 = true;
            } else {
                z7 = false;
            }
        }
        for (D5.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.m(C1530l.f16479a);
            }
        }
        return z7;
    }

    public final boolean o(Object obj) {
        int i7 = this.f5197r;
        int i8 = this.f4931t;
        if (i7 == 0) {
            if (i8 != 0) {
                j(obj);
                int i9 = this.f4937z + 1;
                this.f4937z = i9;
                if (i9 > i8) {
                    i();
                }
                this.f4936y = l() + this.f4937z;
            }
            return true;
        }
        int i10 = this.f4937z;
        int i11 = this.f4932u;
        if (i10 >= i11 && this.f4936y <= this.f4935x) {
            int b7 = s.h.b(this.f4933v);
            if (b7 != 0) {
                if (b7 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        j(obj);
        int i12 = this.f4937z + 1;
        this.f4937z = i12;
        if (i12 > i11) {
            i();
        }
        long l7 = l() + this.f4937z;
        long j7 = this.f4935x;
        if (((int) (l7 - j7)) > i8) {
            r(j7 + 1, this.f4936y, l() + this.f4937z, l() + this.f4937z + this.f4930A);
        }
        return true;
    }

    public final long p(t tVar) {
        long j7 = tVar.f4941a;
        if (j7 < l() + this.f4937z) {
            return j7;
        }
        if (this.f4932u > 0 || j7 > l() || this.f4930A == 0) {
            return -1L;
        }
        return j7;
    }

    public final Object q(t tVar) {
        Object obj;
        D5.d[] dVarArr = a6.c.f5199a;
        synchronized (this) {
            try {
                long p3 = p(tVar);
                if (p3 < 0) {
                    obj = s.f4938a;
                } else {
                    long j7 = tVar.f4941a;
                    Object[] objArr = this.f4934w;
                    M5.g.c(objArr);
                    Object obj2 = objArr[((int) p3) & (objArr.length - 1)];
                    if (obj2 instanceof p) {
                        obj2 = ((p) obj2).f4921s;
                    }
                    tVar.f4941a = p3 + 1;
                    Object obj3 = obj2;
                    dVarArr = s(j7);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (D5.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.m(C1530l.f16479a);
            }
        }
        return obj;
    }

    public final void r(long j7, long j8, long j9, long j10) {
        long min = Math.min(j8, j7);
        for (long l7 = l(); l7 < min; l7++) {
            Object[] objArr = this.f4934w;
            M5.g.c(objArr);
            s.c(objArr, l7, null);
        }
        this.f4935x = j7;
        this.f4936y = j8;
        this.f4937z = (int) (j9 - min);
        this.f4930A = (int) (j10 - j9);
    }

    public final D5.d[] s(long j7) {
        int i7;
        long j8;
        long j9;
        D5.d[] dVarArr;
        long j10;
        boolean z7;
        long j11;
        a6.d[] dVarArr2;
        int i8 = (j7 > this.f4936y ? 1 : (j7 == this.f4936y ? 0 : -1));
        D5.d[] dVarArr3 = a6.c.f5199a;
        if (i8 > 0) {
            return dVarArr3;
        }
        long l7 = l();
        long j12 = this.f4937z + l7;
        int i9 = this.f4932u;
        if (i9 == 0 && this.f4930A > 0) {
            j12++;
        }
        if (this.f5197r != 0 && (dVarArr2 = this.f5196q) != null) {
            for (a6.d dVar : dVarArr2) {
                if (dVar != null) {
                    long j13 = ((t) dVar).f4941a;
                    if (j13 >= 0 && j13 < j12) {
                        j12 = j13;
                    }
                }
            }
        }
        if (j12 <= this.f4936y) {
            return dVarArr3;
        }
        long l8 = l() + this.f4937z;
        if (this.f5197r > 0) {
            i7 = Math.min(this.f4930A, i9 - ((int) (l8 - j12)));
        } else {
            i7 = this.f4930A;
        }
        long j14 = this.f4930A + l8;
        B0.d dVar2 = s.f4938a;
        if (i7 > 0) {
            D5.d[] dVarArr4 = new D5.d[i7];
            Object[] objArr = this.f4934w;
            M5.g.c(objArr);
            long j15 = l8;
            int i10 = 0;
            while (true) {
                if (l8 < j14) {
                    j8 = j12;
                    Object obj = objArr[((int) l8) & (objArr.length - 1)];
                    if (obj != dVar2) {
                        M5.g.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        p pVar = (p) obj;
                        int i11 = i10 + 1;
                        j9 = j14;
                        dVarArr4[i10] = pVar.f4922t;
                        s.c(objArr, l8, dVar2);
                        s.c(objArr, j15, pVar.f4921s);
                        j11 = 1;
                        j15++;
                        if (i11 >= i7) {
                            break;
                        }
                        i10 = i11;
                    } else {
                        j9 = j14;
                        j11 = 1;
                    }
                    l8 += j11;
                    j12 = j8;
                    j14 = j9;
                } else {
                    j8 = j12;
                    j9 = j14;
                    break;
                }
            }
            dVarArr = dVarArr4;
            l8 = j15;
        } else {
            j8 = j12;
            j9 = j14;
            dVarArr = dVarArr3;
        }
        int i12 = (int) (l8 - l7);
        if (this.f5197r == 0) {
            j10 = l8;
        } else {
            j10 = j8;
        }
        long max = Math.max(this.f4935x, l8 - Math.min(this.f4931t, i12));
        if (i9 == 0 && max < j9) {
            Object[] objArr2 = this.f4934w;
            M5.g.c(objArr2);
            if (M5.g.a(objArr2[((int) max) & (objArr2.length - 1)], dVar2)) {
                l8++;
                max++;
            }
        }
        r(max, j10, l8, j9);
        g();
        if (dVarArr.length == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return k(dVarArr);
        }
        return dVarArr;
    }

    @Override // Z5.b
    public final Object t(c cVar, D5.d dVar) {
        h(this, cVar, dVar);
        return E5.a.f612q;
    }
}
