package Z5;

import K.C0029e;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
import z5.C1530l;
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final B0.d f4938a = new B0.d(6, "NO_VALUE", false);

    /* renamed from: b  reason: collision with root package name */
    public static final B0.d f4939b = new B0.d(6, "NONE", false);

    /* renamed from: c  reason: collision with root package name */
    public static final B0.d f4940c = new B0.d(6, "PENDING", false);

    public static r a(int i7, int i8, int i9) {
        int i10;
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = 1;
        }
        if (i7 >= 0) {
            if (i7 <= 0 && i8 != 1) {
                throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(AbstractC1111a.G(i8)).toString());
            }
            if (i7 < 0) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = i7;
            }
            return new r(i7, i10, i8);
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("replay cannot be negative, but was ", i7).toString());
    }

    public static final w b(Object obj) {
        if (obj == null) {
            obj = a6.c.f5200b;
        }
        return new w(obj);
    }

    public static final void c(Object[] objArr, long j7, Object obj) {
        objArr[((int) j7) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (((W5.h0) r7).d() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (M5.g.a(r6.E(), r1) == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, M5.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable d(Z5.b r5, Z5.c r6, D5.d r7) {
        /*
            boolean r0 = r7 instanceof Z5.f
            if (r0 == 0) goto L13
            r0 = r7
            Z5.f r0 = (Z5.f) r0
            int r1 = r0.f4895v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4895v = r1
            goto L18
        L13:
            Z5.f r0 = new Z5.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4894u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4895v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            M5.o r5 = r0.f4893t
            k3.AbstractC0958a.H(r7)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r6 = move-exception
            r1 = r6
            goto L52
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            k3.AbstractC0958a.H(r7)
            M5.o r7 = new M5.o
            r7.<init>()
            Z4.B r2 = new Z4.B     // Catch: java.lang.Throwable -> L4f
            r4 = 1
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4f
            r0.f4893t = r7     // Catch: java.lang.Throwable -> L4f
            r0.f4895v = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = r5.t(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r5 != r1) goto L4d
            goto L91
        L4d:
            r1 = 0
            goto L91
        L4f:
            r5 = move-exception
            r1 = r5
            r5 = r7
        L52:
            java.lang.Object r5 = r5.f2315q
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5e
            boolean r6 = M5.g.a(r5, r1)
            if (r6 != 0) goto L8e
        L5e:
            D5.i r6 = r0.f731r
            M5.g.c(r6)
            W5.v r7 = W5.C0114v.f4028r
            D5.g r6 = r6.f(r7)
            W5.a0 r6 = (W5.InterfaceC0093a0) r6
            if (r6 == 0) goto L8f
            W5.j0 r6 = (W5.j0) r6
            java.lang.Object r7 = r6.K()
            boolean r0 = r7 instanceof W5.C0109p
            if (r0 != 0) goto L83
            boolean r0 = r7 instanceof W5.h0
            if (r0 == 0) goto L8f
            W5.h0 r7 = (W5.h0) r7
            boolean r7 = r7.d()
            if (r7 == 0) goto L8f
        L83:
            java.util.concurrent.CancellationException r6 = r6.E()
            boolean r6 = M5.g.a(r6, r1)
            if (r6 != 0) goto L8e
            goto L8f
        L8e:
            throw r1
        L8f:
            if (r5 != 0) goto L92
        L91:
            return r1
        L92:
            boolean r6 = r1 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L9a
            android.support.v4.media.session.b.a(r5, r1)
            throw r5
        L9a:
            android.support.v4.media.session.b.a(r1, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.s.d(Z5.b, Z5.c, D5.d):java.io.Serializable");
    }

    public static final Object e(b bVar, L5.p pVar, D5.d dVar) {
        int i7 = k.f4913a;
        j jVar = new j(pVar, null);
        D5.j jVar2 = D5.j.f531q;
        Object t5 = ((C0029e) new C0029e(jVar, bVar, jVar2, -2, 1).c(jVar2, 0, 1)).t(a6.o.f5231q, dVar);
        E5.a aVar = E5.a.f612q;
        C1530l c1530l = C1530l.f16479a;
        if (t5 != aVar) {
            t5 = c1530l;
        }
        if (t5 == aVar) {
            return t5;
        }
        return c1530l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0055, B:28:0x006a, B:30:0x0072, B:32:0x0078, B:34:0x007e, B:37:0x008f, B:38:0x0097, B:39:0x0098, B:40:0x00a3, B:20:0x0048, B:23:0x004f), top: B:55:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Type inference failed for: r0v2, types: [Z5.d, D5.d] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r9v4, types: [Y5.p] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Y5.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008c -> B:14:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(Z5.c r8, Y5.n r9, boolean r10, D5.d r11) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.s.f(Z5.c, Y5.n, boolean, D5.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, M5.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(Z5.b r6, D5.d r7) {
        /*
            boolean r0 = r7 instanceof Z5.l
            if (r0 == 0) goto L13
            r0 = r7
            Z5.l r0 = (Z5.l) r0
            int r1 = r0.f4917w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4917w = r1
            goto L18
        L13:
            Z5.l r0 = new Z5.l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4916v
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4917w
            B0.d r3 = a6.c.f5200b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            V.u r6 = r0.f4915u
            M5.o r0 = r0.f4914t
            k3.AbstractC0958a.H(r7)     // Catch: a6.a -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            k3.AbstractC0958a.H(r7)
            M5.o r7 = new M5.o
            r7.<init>()
            r7.f2315q = r3
            V.u r2 = new V.u
            r5 = 2
            r2.<init>(r5, r7)
            r0.f4914t = r7     // Catch: a6.a -> L56
            r0.f4915u = r2     // Catch: a6.a -> L56
            r0.f4917w = r4     // Catch: a6.a -> L56
            java.lang.Object r6 = r6.t(r2, r0)     // Catch: a6.a -> L56
            if (r6 != r1) goto L54
            goto L62
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            Z5.c r1 = r7.f5195q
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r1 = r0.f2315q
            if (r1 == r3) goto L63
        L62:
            return r1
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.s.g(Z5.b, D5.d):java.lang.Object");
    }
}
