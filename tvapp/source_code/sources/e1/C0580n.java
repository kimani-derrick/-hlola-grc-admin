package e1;

import a1.C0197a;
import x5.C1467a;
/* renamed from: e1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580n {

    /* renamed from: a  reason: collision with root package name */
    public final C1467a f9402a;

    /* renamed from: b  reason: collision with root package name */
    public final C0197a f9403b;

    /* renamed from: c  reason: collision with root package name */
    public final e6.d f9404c;

    public C0580n(C1467a c1467a, C0197a c0197a) {
        M5.g.f(c1467a, "traktAuthService");
        M5.g.f(c0197a, "encryptedPreference");
        this.f9402a = c1467a;
        this.f9403b = c0197a;
        this.f9404c = e6.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(D5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof e1.C0576j
            if (r0 == 0) goto L13
            r0 = r8
            e1.j r0 = (e1.C0576j) r0
            int r1 = r0.f9387z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9387z = r1
            goto L18
        L13:
            e1.j r0 = new e1.j
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f9385x
            E5.a r1 = E5.a.f612q
            int r2 = r0.f9387z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r1 = r0.f9384w
            java.lang.String r2 = r0.f9383v
            z5.f[] r3 = r0.f9382u
            z5.f[] r0 = r0.f9381t
            k3.AbstractC0958a.H(r8)
            goto L70
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            k3.AbstractC0958a.H(r8)
            r8 = 3
            z5.f[] r8 = new z5.C1524f[r8]
            z5.f r2 = new z5.f
            java.lang.String r4 = "trakt-api-version"
            java.lang.String r5 = "2"
            r2.<init>(r4, r5)
            r4 = 0
            r8[r4] = r2
            g6.o r2 = g6.o.f10858a
            java.lang.String r2 = r2.P()
            z5.f r5 = new z5.f
            java.lang.String r6 = "trakt-api-key"
            r5.<init>(r6, r2)
            r8[r3] = r5
            r0.f9381t = r8
            r0.f9382u = r8
            java.lang.String r2 = "Authorization"
            r0.f9383v = r2
            r5 = 2
            r0.f9384w = r5
            r0.f9387z = r3
            java.lang.Object r0 = r7.b(r4, r0)
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r3 = r8
            r1 = r5
            r8 = r0
            r0 = r3
        L70:
            z5.f r4 = new z5.f
            r4.<init>(r2, r8)
            r3[r1] = r4
            java.lang.String r8 = "pairs"
            M5.g.f(r0, r8)
            int r8 = r0.length
            if (r8 <= 0) goto L8d
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r1 = r0.length
            int r1 = A5.w.J(r1)
            r8.<init>(r1)
            A5.w.L(r8, r0)
            goto L8f
        L8d:
            A5.u r8 = A5.u.f136q
        L8f:
            java.io.Serializable r8 = (java.io.Serializable) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0580n.a(D5.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r6, D5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e1.C0577k
            if (r0 == 0) goto L13
            r0 = r7
            e1.k r0 = (e1.C0577k) r0
            int r1 = r0.f9391w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9391w = r1
            goto L18
        L13:
            e1.k r0 = new e1.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f9389u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f9391w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.f9388t
            k3.AbstractC0958a.H(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            k3.AbstractC0958a.H(r7)
            g6.o r7 = g6.o.f10858a
            java.lang.String r7 = r7.o()
            r0.f9388t = r7
            r0.f9391w = r3
            java.lang.Object r6 = r5.c(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r4 = r7
            r7 = r6
            r6 = r4
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = " "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0580n.b(boolean, D5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:24:0x0063, B:26:0x006b, B:28:0x006f, B:32:0x0078, B:34:0x0090, B:38:0x0099, B:40:0x009d, B:41:0x00a1, B:44:0x00a7, B:46:0x00ac, B:54:0x00c3, B:55:0x00c8, B:56:0x00c9, B:57:0x00ce), top: B:62:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:24:0x0063, B:26:0x006b, B:28:0x006f, B:32:0x0078, B:34:0x0090, B:38:0x0099, B:40:0x009d, B:41:0x00a1, B:44:0x00a7, B:46:0x00ac, B:54:0x00c3, B:55:0x00c8, B:56:0x00c9, B:57:0x00ce), top: B:62:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r18, D5.d r19) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0580n.c(boolean, D5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, D5.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof e1.C0579m
            if (r0 == 0) goto L13
            r0 = r12
            e1.m r0 = (e1.C0579m) r0
            int r1 = r0.f9401w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9401w = r1
            goto L18
        L13:
            e1.m r0 = new e1.m
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f9399u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f9401w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            e1.n r11 = r0.f9398t
            k3.AbstractC0958a.H(r12)     // Catch: x6.C1483p -> L72
            goto L5f
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            k3.AbstractC0958a.H(r12)
            x5.a r12 = r10.f9402a     // Catch: x6.C1483p -> L71
            java.lang.Object r12 = r12.get()     // Catch: x6.C1483p -> L71
            e1.o r12 = (e1.InterfaceC0581o) r12     // Catch: x6.C1483p -> L71
            com.boxhdo.android.data.model.request.trakt.TraktRefreshTokenRequest r2 = new com.boxhdo.android.data.model.request.trakt.TraktRefreshTokenRequest     // Catch: x6.C1483p -> L71
            g6.o r4 = g6.o.f10858a     // Catch: x6.C1483p -> L71
            java.lang.String r5 = r4.P()     // Catch: x6.C1483p -> L71
            java.lang.String r6 = r4.S()     // Catch: x6.C1483p -> L71
            java.lang.String r8 = "refresh_token"
            java.lang.String r9 = r4.R()     // Catch: x6.C1483p -> L71
            r4 = r2
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: x6.C1483p -> L71
            r0.f9398t = r10     // Catch: x6.C1483p -> L71
            r0.f9401w = r3     // Catch: x6.C1483p -> L71
            java.lang.Object r12 = r12.a(r2, r0)     // Catch: x6.C1483p -> L71
            if (r12 != r1) goto L5e
            return r1
        L5e:
            r11 = r10
        L5f:
            com.boxhdo.android.data.model.response.trakt.TraktLoginResponse r12 = (com.boxhdo.android.data.model.response.trakt.TraktLoginResponse) r12     // Catch: x6.C1483p -> L72
            a1.a r11 = r11.f9403b
            w4.l0.R(r11, r12)
            java.lang.String r11 = r12.f7728a
            if (r11 == 0) goto L6b
            return r11
        L6b:
            H1.d r11 = new H1.d
            r11.<init>()
            throw r11
        L71:
            r11 = r10
        L72:
            a1.a r12 = r11.f9403b
            r0 = 0
            w4.l0.R(r12, r0)
            a1.a r11 = r11.f9403b
            w4.l0.S(r11, r0)
            H1.d r11 = new H1.d
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0580n.d(java.lang.String, D5.d):java.lang.Object");
    }
}
