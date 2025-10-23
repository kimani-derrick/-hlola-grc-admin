package K1;

import f1.C0694v;
/* renamed from: K1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051b {

    /* renamed from: a  reason: collision with root package name */
    public final C0694v f1571a;

    public C0051b(C0694v c0694v) {
        M5.g.f(c0694v, "movieRepository");
        this.f1571a = c0694v;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(com.boxhdo.domain.model.Movie r19, D5.d r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof K1.C0050a
            if (r3 == 0) goto L19
            r3 = r2
            K1.a r3 = (K1.C0050a) r3
            int r4 = r3.f1570v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f1570v = r4
            goto L1e
        L19:
            K1.a r3 = new K1.a
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f1568t
            E5.a r4 = E5.a.f612q
            int r5 = r3.f1570v
            r6 = 1
            if (r5 == 0) goto L35
            if (r5 != r6) goto L2d
            k3.AbstractC0958a.H(r2)
            goto L89
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            k3.AbstractC0958a.H(r2)
            c1.b r2 = new c1.b
            long r8 = r1.f8029q
            com.boxhdo.domain.type.MediaType r5 = r1.f8037y
            java.lang.String r11 = r5.f8099q
            java.lang.String r15 = r19.a()
            java.lang.String r16 = r19.d()
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            java.lang.String r7 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L64
            java.util.Locale r12 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L64
            r10.<init>(r7, r12)     // Catch: java.lang.Exception -> L64
            java.lang.String r5 = r10.format(r5)     // Catch: java.lang.Exception -> L64
            java.lang.String r7 = "{\n    val dateFormat = S…dateFormat.format(this)\n}"
            M5.g.e(r5, r7)     // Catch: java.lang.Exception -> L64
        L61:
            r17 = r5
            goto L67
        L64:
            java.lang.String r5 = ""
            goto L61
        L67:
            java.lang.String r13 = r1.f8030r
            java.lang.String r14 = r1.f8035w
            java.lang.String r10 = r1.f8032t
            java.lang.String r12 = r1.f8031s
            r7 = r2
            r7.<init>(r8, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.f1570v = r6
            f1.v r1 = r0.f1571a
            r1.getClass()
            n5.y r5 = g1.b.f10508a
            f1.a r5 = new f1.a
            r6 = 0
            r5.<init>(r1, r2, r6)
            java.lang.Object r2 = g1.b.a(r5, r3)
            if (r2 != r4) goto L89
            return r4
        L89:
            Y0.c r2 = (Y0.c) r2
            java.io.Serializable r1 = a.AbstractC0189a.v(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.C0051b.a(com.boxhdo.domain.model.Movie, D5.d):java.io.Serializable");
    }
}
