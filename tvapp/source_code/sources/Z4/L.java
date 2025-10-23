package Z4;
/* loaded from: classes.dex */
public final class L implements I {
    public static final double f = Math.random();

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f4773g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final h4.f f4774a;

    /* renamed from: b  reason: collision with root package name */
    public final N4.e f4775b;

    /* renamed from: c  reason: collision with root package name */
    public final b5.j f4776c;
    public final T4.c d;

    /* renamed from: e  reason: collision with root package name */
    public final D5.i f4777e;

    public L(h4.f fVar, N4.e eVar, b5.j jVar, T4.c cVar, D5.i iVar) {
        this.f4774a = fVar;
        this.f4775b = eVar;
        this.f4776c = jVar;
        this.d = cVar;
        this.f4777e = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(Z4.L r5, D5.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof Z4.K
            if (r0 == 0) goto L16
            r0 = r6
            Z4.K r0 = (Z4.K) r0
            int r1 = r0.f4772w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f4772w = r1
            goto L1b
        L16:
            Z4.K r0 = new Z4.K
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f4770u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4772w
            r3 = 1
            java.lang.String r4 = "SessionFirelogPublisher"
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            Z4.L r5 = r0.f4769t
            k3.AbstractC0958a.H(r6)
            goto L4b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            k3.AbstractC0958a.H(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r4, r6)
            r0.f4769t = r5
            r0.f4772w = r3
            b5.j r6 = r5.f4776c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4b
            goto L85
        L4b:
            b5.j r6 = r5.f4776c
            b5.o r0 = r6.f7159a
            java.lang.Boolean r0 = r0.i()
            if (r0 == 0) goto L5a
            boolean r6 = r0.booleanValue()
            goto L66
        L5a:
            b5.o r6 = r6.f7160b
            java.lang.Boolean r6 = r6.i()
            if (r6 == 0) goto L70
            boolean r6 = r6.booleanValue()
        L66:
            if (r6 != 0) goto L70
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r4, r5)
        L6d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L85
        L70:
            b5.j r5 = r5.f4776c
            double r5 = r5.a()
            double r0 = Z4.L.f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L7f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L85
        L7f:
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r5)
            goto L6d
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.L.a(Z4.L, D5.d):java.lang.Object");
    }
}
