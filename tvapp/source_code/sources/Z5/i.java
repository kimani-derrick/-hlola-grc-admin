package Z5;
/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4905q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final Object f4906r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f4907s;

    /* renamed from: t  reason: collision with root package name */
    public final L5.p f4908t;

    public i(M5.l lVar, c cVar, L5.p pVar) {
        this.f4906r = lVar;
        this.f4907s = cVar;
        this.f4908t = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    @Override // Z5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r8, D5.d r9) {
        /*
            r7 = this;
            int r0 = r7.f4905q
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f4906r
            D5.i r0 = (D5.i) r0
            java.lang.Object r1 = r7.f4907s
            L5.p r2 = r7.f4908t
            a6.w r2 = (a6.w) r2
            java.lang.Object r8 = a6.c.a(r0, r8, r1, r2, r9)
            E5.a r9 = E5.a.f612q
            if (r8 != r9) goto L18
            goto L1a
        L18:
            z5.l r8 = z5.C1530l.f16479a
        L1a:
            return r8
        L1b:
            boolean r0 = r9 instanceof Z5.h
            if (r0 == 0) goto L2e
            r0 = r9
            Z5.h r0 = (Z5.h) r0
            int r1 = r0.f4904x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L2e
            int r1 = r1 - r2
            r0.f4904x = r1
            goto L33
        L2e:
            Z5.h r0 = new Z5.h
            r0.<init>(r7, r9)
        L33:
            java.lang.Object r9 = r0.f4902v
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4904x
            z5.l r3 = z5.C1530l.f16479a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L5b
            if (r2 == r6) goto L57
            if (r2 == r5) goto L4f
            if (r2 != r4) goto L47
            goto L57
        L47:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4f:
            java.lang.Object r8 = r0.f4901u
            Z5.i r2 = r0.f4900t
            k3.AbstractC0958a.H(r9)
            goto L85
        L57:
            k3.AbstractC0958a.H(r9)
            goto L73
        L5b:
            k3.AbstractC0958a.H(r9)
            java.lang.Object r9 = r7.f4906r
            M5.l r9 = (M5.l) r9
            boolean r9 = r9.f2312q
            if (r9 == 0) goto L75
            r0.f4904x = r6
            java.lang.Object r9 = r7.f4907s
            Z5.c r9 = (Z5.c) r9
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L73
            goto La4
        L73:
            r1 = r3
            goto La4
        L75:
            r0.f4900t = r7
            r0.f4901u = r8
            r0.f4904x = r5
            L5.p r9 = r7.f4908t
            java.lang.Object r9 = r9.j(r8, r0)
            if (r9 != r1) goto L84
            goto La4
        L84:
            r2 = r7
        L85:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L73
            java.lang.Object r9 = r2.f4906r
            M5.l r9 = (M5.l) r9
            r9.f2312q = r6
            r9 = 0
            r0.f4900t = r9
            r0.f4901u = r9
            r0.f4904x = r4
            java.lang.Object r9 = r2.f4907s
            Z5.c r9 = (Z5.c) r9
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L73
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.i.a(java.lang.Object, D5.d):java.lang.Object");
    }

    public i(c cVar, D5.i iVar) {
        this.f4906r = iVar;
        this.f4907s = b6.a.l(iVar);
        this.f4908t = new a6.w(cVar, null);
    }
}
