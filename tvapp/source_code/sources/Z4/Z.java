package Z4;
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public static final Z f4803a = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(5:29|30|31|32|(1:34)(1:35))|23|24|25|(1:27)|13|14|15|16))|43|6|7|(0)(0)|23|24|25|(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
        android.util.Log.w("InstallationId", "Error getting Firebase installation id .", r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(N4.e r9, D5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Z4.C0179p
            if (r0 == 0) goto L13
            r0 = r10
            Z4.p r0 = (Z4.C0179p) r0
            int r1 = r0.f4858w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4858w = r1
            goto L18
        L13:
            Z4.p r0 = new Z4.p
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4856u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4858w
            java.lang.String r3 = ""
            java.lang.String r4 = "InstallationId"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r9 = r0.f4855t
            java.lang.String r9 = (java.lang.String) r9
            k3.AbstractC0958a.H(r10)     // Catch: java.lang.Exception -> L33
            goto L95
        L33:
            r10 = move-exception
            goto L9e
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f4855t
            N4.e r9 = (N4.e) r9
            k3.AbstractC0958a.H(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L78
        L48:
            k3.AbstractC0958a.H(r10)
            r10 = r9
            N4.d r10 = (N4.d) r10     // Catch: java.lang.Exception -> L46
            t3.o r9 = r10.f()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            M5.g.e(r9, r2)     // Catch: java.lang.Exception -> L76
            r0.f4855t = r10     // Catch: java.lang.Exception -> L76
            r0.f4858w = r6     // Catch: java.lang.Exception -> L76
            java.lang.Object r9 = p6.d.a(r9, r0)     // Catch: java.lang.Exception -> L76
            if (r9 != r1) goto L62
            return r1
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            N4.a r10 = (N4.a) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.f2516a     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            M5.g.e(r10, r2)     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7f
        L72:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L78
        L76:
            r9 = move-exception
            goto L72
        L78:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r4, r2, r10)
            r10 = r9
            r9 = r3
        L7f:
            N4.d r10 = (N4.d) r10     // Catch: java.lang.Exception -> L33
            t3.o r10 = r10.d()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "firebaseInstallations.id"
            M5.g.e(r10, r2)     // Catch: java.lang.Exception -> L33
            r0.f4855t = r9     // Catch: java.lang.Exception -> L33
            r0.f4858w = r5     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = p6.d.a(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r1) goto L95
            return r1
        L95:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            M5.g.e(r10, r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            r3 = r10
            goto La3
        L9e:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r4, r0, r10)
        La3:
            Z4.q r10 = new Z4.q
            r10.<init>(r3, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.Z.a(N4.e, D5.d):java.lang.Object");
    }
}
