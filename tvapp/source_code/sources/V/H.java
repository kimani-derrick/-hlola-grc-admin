package V;

import W5.AbstractC0117y;
import W5.C0098e;
import W5.C0109p;
import W5.InterfaceC0116x;
import W5.W;
import W5.f0;
import W5.j0;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import w4.l0;
import z5.C1527i;
/* loaded from: classes.dex */
public final class H implements InterfaceC0090i {

    /* renamed from: q  reason: collision with root package name */
    public final L5.a f3527q;

    /* renamed from: r  reason: collision with root package name */
    public final Y.h f3528r;

    /* renamed from: s  reason: collision with root package name */
    public final InterfaceC0083b f3529s;

    /* renamed from: t  reason: collision with root package name */
    public final Z5.n f3530t;

    /* renamed from: u  reason: collision with root package name */
    public final String f3531u;

    /* renamed from: v  reason: collision with root package name */
    public final C1527i f3532v;

    /* renamed from: w  reason: collision with root package name */
    public final Z5.w f3533w;

    /* renamed from: x  reason: collision with root package name */
    public List f3534x;

    /* renamed from: y  reason: collision with root package name */
    public final C4.b f3535y;

    /* renamed from: z  reason: collision with root package name */
    public static final LinkedHashSet f3526z = new LinkedHashSet();

    /* renamed from: A  reason: collision with root package name */
    public static final Object f3525A = new Object();

    public H(A1.j jVar, List list, InterfaceC0083b interfaceC0083b, InterfaceC0116x interfaceC0116x) {
        Y.h hVar = Y.h.f4307a;
        this.f3527q = jVar;
        this.f3528r = hVar;
        this.f3529s = interfaceC0083b;
        this.f3530t = new Z5.n(new v(this, null));
        this.f3531u = ".tmp";
        this.f3532v = new C1527i(new D0.h(4, this));
        this.f3533w = Z5.s.b(J.f3536a);
        this.f3534x = A5.k.l0(list);
        this.f3535y = new C4.b(interfaceC0116x, new A5.a(3, this), new r(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(V.H r8, V.n r9, D5.d r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.H.a(V.H, V.n, D5.d):java.lang.Object");
    }

    @Override // V.InterfaceC0090i
    public final Z5.b D() {
        return this.f3530t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [W5.j0, W5.n] */
    @Override // V.InterfaceC0090i
    public final Object F(L5.p pVar, D5.d dVar) {
        Object K6;
        ?? j0Var = new j0(true);
        j0Var.N(null);
        this.f3535y.N(new n(pVar, j0Var, (I) this.f3533w.getValue(), dVar.k()));
        do {
            K6 = j0Var.K();
            if (!(K6 instanceof W)) {
                if (!(K6 instanceof C0109p)) {
                    return AbstractC0117y.w(K6);
                }
                throw ((C0109p) K6).f4012a;
            }
        } while (j0Var.Y(K6) < 0);
        f0 f0Var = new f0(l0.x(dVar), j0Var);
        f0Var.w();
        f0Var.y(new C0098e(1, j0Var.P(false, true, new W5.J(2, f0Var))));
        return f0Var.v();
    }

    public final File b() {
        return (File) this.f3532v.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Type inference failed for: r13v8, types: [M5.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(D5.d r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.H.c(D5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(D5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof V.A
            if (r0 == 0) goto L13
            r0 = r5
            V.A r0 = (V.A) r0
            int r1 = r0.f3494w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3494w = r1
            goto L18
        L13:
            V.A r0 = new V.A
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3492u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f3494w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            V.H r0 = r0.f3491t
            k3.AbstractC0958a.H(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            k3.AbstractC0958a.H(r5)
            r0.f3491t = r4     // Catch: java.lang.Throwable -> L44
            r0.f3494w = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.c(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r1) goto L41
            return r1
        L41:
            z5.l r5 = z5.C1530l.f16479a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            Z5.w r0 = r0.f3533w
            V.k r1 = new V.k
            r1.<init>(r5)
            r0.f(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V.H.d(D5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(D5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof V.B
            if (r0 == 0) goto L13
            r0 = r5
            V.B r0 = (V.B) r0
            int r1 = r0.f3498w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3498w = r1
            goto L18
        L13:
            V.B r0 = new V.B
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3496u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f3498w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            V.H r0 = r0.f3495t
            k3.AbstractC0958a.H(r5)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r5 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            k3.AbstractC0958a.H(r5)
            r0.f3495t = r4     // Catch: java.lang.Throwable -> L41
            r0.f3498w = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.c(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L4d
            return r1
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            Z5.w r0 = r0.f3533w
            V.k r1 = new V.k
            r1.<init>(r5)
            r0.f(r1)
        L4d:
            z5.l r5 = z5.C1530l.f16479a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V.H.e(D5.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [V.C] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(D5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof V.C
            if (r0 == 0) goto L13
            r0 = r5
            V.C r0 = (V.C) r0
            int r1 = r0.f3503x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3503x = r1
            goto L18
        L13:
            V.C r0 = new V.C
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3501v
            E5.a r1 = E5.a.f612q
            int r2 = r0.f3503x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f3500u
            V.H r0 = r0.f3499t
            k3.AbstractC0958a.H(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            k3.AbstractC0958a.H(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L66
            java.io.File r2 = r4.b()     // Catch: java.io.FileNotFoundException -> L66
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L66
            Y.h r2 = r4.f3528r     // Catch: java.lang.Throwable -> L5e
            r0.f3499t = r4     // Catch: java.lang.Throwable -> L5e
            r0.f3500u = r5     // Catch: java.lang.Throwable -> L5e
            r0.f3503x = r3     // Catch: java.lang.Throwable -> L5e
            Y.b r0 = r2.a(r5)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            p6.l.i(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L68
        L5a:
            r1 = r5
            r5 = r0
            r0 = r4
            goto L60
        L5e:
            r0 = move-exception
            goto L5a
        L60:
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r2 = move-exception
            p6.l.i(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L66:
            r5 = move-exception
            r0 = r4
        L68:
            java.io.File r1 = r0.b()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L7d
            Y.h r5 = r0.f3528r
            r5.getClass()
            Y.b r5 = new Y.b
            r5.<init>(r3)
            return r5
        L7d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V.H.f(D5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(D5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof V.D
            if (r0 == 0) goto L13
            r0 = r8
            V.D r0 = (V.D) r0
            int r1 = r0.f3508x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3508x = r1
            goto L18
        L13:
            V.D r0 = new V.D
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3506v
            E5.a r1 = E5.a.f612q
            int r2 = r0.f3508x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f3505u
            java.lang.Object r0 = r0.f3504t
            V.a r0 = (V.C0082a) r0
            k3.AbstractC0958a.H(r8)     // Catch: java.io.IOException -> L33
            goto L85
        L33:
            r8 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f3505u
            V.a r2 = (V.C0082a) r2
            java.lang.Object r4 = r0.f3504t
            V.H r4 = (V.H) r4
            k3.AbstractC0958a.H(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f3504t
            V.H r2 = (V.H) r2
            k3.AbstractC0958a.H(r8)     // Catch: V.C0082a -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            k3.AbstractC0958a.H(r8)
            r0.f3504t = r7     // Catch: V.C0082a -> L62
            r0.f3508x = r5     // Catch: V.C0082a -> L62
            java.lang.Object r8 = r7.f(r0)     // Catch: V.C0082a -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            V.b r5 = r2.f3529s
            r0.f3504t = r2
            r0.f3505u = r8
            r0.f3508x = r4
            java.lang.Object r4 = r5.p(r8)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f3504t = r2     // Catch: java.io.IOException -> L86
            r0.f3505u = r8     // Catch: java.io.IOException -> L86
            r0.f3508x = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.i(r0, r8)     // Catch: java.io.IOException -> L86
            if (r0 != r1) goto L84
            return r1
        L84:
            r1 = r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r0 = r2
        L88:
            android.support.v4.media.session.b.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.H.g(D5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(D5.d r8, D5.i r9, L5.p r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof V.E
            if (r0 == 0) goto L13
            r0 = r8
            V.E r0 = (V.E) r0
            int r1 = r0.f3514y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3514y = r1
            goto L18
        L13:
            V.E r0 = new V.E
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3512w
            E5.a r1 = E5.a.f612q
            int r2 = r0.f3514y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.f3510u
            V.H r10 = r0.f3509t
            k3.AbstractC0958a.H(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r9 = r0.f3511v
            java.lang.Object r10 = r0.f3510u
            V.c r10 = (V.C0084c) r10
            V.H r2 = r0.f3509t
            k3.AbstractC0958a.H(r8)
            goto L6b
        L43:
            k3.AbstractC0958a.H(r8)
            Z5.w r8 = r7.f3533w
            java.lang.Object r8 = r8.getValue()
            V.c r8 = (V.C0084c) r8
            r8.a()
            V.F r2 = new V.F
            java.lang.Object r6 = r8.f3537a
            r2.<init>(r3, r10, r6)
            r0.f3509t = r7
            r0.f3510u = r8
            r0.f3511v = r6
            r0.f3514y = r5
            java.lang.Object r9 = W5.AbstractC0117y.y(r0, r9, r2)
            if (r9 != r1) goto L67
            return r1
        L67:
            r2 = r7
            r10 = r8
            r8 = r9
            r9 = r6
        L6b:
            r10.a()
            boolean r10 = M5.g.a(r9, r8)
            if (r10 == 0) goto L75
            goto L98
        L75:
            r0.f3509t = r2
            r0.f3510u = r8
            r0.f3511v = r3
            r0.f3514y = r4
            java.lang.Object r9 = r2.i(r0, r8)
            if (r9 != r1) goto L84
            return r1
        L84:
            r9 = r8
            r10 = r2
        L86:
            Z5.w r8 = r10.f3533w
            V.c r10 = new V.c
            if (r9 == 0) goto L91
            int r0 = r9.hashCode()
            goto L92
        L91:
            r0 = 0
        L92:
            r10.<init>(r0, r9)
            r8.f(r10)
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: V.H.h(D5.d, D5.i, L5.p):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[Catch: IOException -> 0x00b8, TryCatch #1 {IOException -> 0x00b8, blocks: (B:31:0x0093, B:34:0x00a1, B:35:0x00b7, B:24:0x006c, B:41:0x00bf), top: B:51:0x0023 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(D5.d r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.H.i(D5.d, java.lang.Object):java.lang.Object");
    }
}
