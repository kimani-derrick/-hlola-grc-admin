package N4;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2521q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f2522r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f2523s;

    public /* synthetic */ c(d dVar) {
        this.f2521q = 0;
        this.f2522r = dVar;
        this.f2523s = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            r0 = 1
            int r1 = r7.f2521q
            switch(r1) {
                case 0: goto La5;
                case 1: goto L29;
                default: goto L6;
            }
        L6:
            java.lang.Object r1 = r7.f2522r
            a3.y r1 = (a3.y) r1
            r1.getClass()
            int r2 = Z2.H.f4603a
            e2.y r1 = r1.f5136c
            e2.B r1 = r1.f10095q
            boolean r2 = r1.f9460q0
            boolean r3 = r7.f2523s
            if (r2 != r3) goto L1a
            goto L28
        L1a:
            r1.f9460q0 = r3
            e2.v r2 = new e2.v
            r2.<init>(r0, r3)
            r0 = 23
            Z2.p r1 = r1.f9421B
            r1.e(r0, r2)
        L28:
            return
        L29:
            java.lang.Object r1 = r7.f2522r
            N4.d r1 = (N4.d) r1
            boolean r2 = r7.f2523s
            r1.getClass()
            java.lang.Object r3 = N4.d.f2524m
            monitor-enter(r3)
            h4.f r4 = r1.f2525a     // Catch: java.lang.Throwable -> L4c
            r4.a()     // Catch: java.lang.Throwable -> L4c
            android.content.Context r4 = r4.f10987a     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.measurement.K1 r4 = com.google.android.gms.internal.measurement.K1.m(r4)     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.measurement.K1 r5 = r1.f2527c     // Catch: java.lang.Throwable -> L9c
            O4.b r5 = r5.I()     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L4e
            r4.L()     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r0 = move-exception
            goto La3
        L4e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
            int r3 = r5.f2724b     // Catch: N4.f -> L5d
            r4 = 5
            if (r3 != r4) goto L55
            goto L58
        L55:
            r6 = 3
            if (r3 != r6) goto L5f
        L58:
            O4.b r2 = r1.j(r5)     // Catch: N4.f -> L5d
            goto L6d
        L5d:
            r0 = move-exception
            goto L98
        L5f:
            if (r2 != 0) goto L69
            N4.k r2 = r1.d     // Catch: N4.f -> L5d
            boolean r2 = r2.a(r5)     // Catch: N4.f -> L5d
            if (r2 == 0) goto L9b
        L69:
            O4.b r2 = r1.c(r5)     // Catch: N4.f -> L5d
        L6d:
            r1.g(r2)
            r1.n(r5, r2)
            r3 = 4
            int r5 = r2.f2724b
            if (r5 != r3) goto L7d
            java.lang.String r3 = r2.f2723a
            r1.m(r3)
        L7d:
            int r3 = r2.f2724b
            if (r3 != r4) goto L87
            N4.f r0 = new N4.f
            r0.<init>()
            goto L98
        L87:
            r4 = 2
            if (r3 == r4) goto L91
            if (r3 != r0) goto L8d
            goto L91
        L8d:
            r1.l(r2)
            goto L9b
        L91:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r0.<init>(r2)
        L98:
            r1.k(r0)
        L9b:
            return
        L9c:
            r0 = move-exception
            if (r4 == 0) goto La2
            r4.L()     // Catch: java.lang.Throwable -> L4c
        La2:
            throw r0     // Catch: java.lang.Throwable -> L4c
        La3:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
            throw r0
        La5:
            java.lang.Object r0 = r7.f2522r
            N4.d r0 = (N4.d) r0
            boolean r1 = r7.f2523s
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.c.run():void");
    }

    public /* synthetic */ c(Object obj, boolean z7, int i7) {
        this.f2521q = i7;
        this.f2522r = obj;
        this.f2523s = z7;
    }
}
