package v6;
/* loaded from: classes.dex */
public final class x implements F {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC1343h f15418q;

    /* renamed from: r  reason: collision with root package name */
    public final C1341f f15419r;

    /* renamed from: s  reason: collision with root package name */
    public A f15420s;

    /* renamed from: t  reason: collision with root package name */
    public int f15421t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15422u;

    /* renamed from: v  reason: collision with root package name */
    public long f15423v;

    public x(InterfaceC1343h interfaceC1343h) {
        int i7;
        M5.g.f(interfaceC1343h, "upstream");
        this.f15418q = interfaceC1343h;
        C1341f c5 = interfaceC1343h.c();
        this.f15419r = c5;
        A a7 = c5.f15387q;
        this.f15420s = a7;
        if (a7 != null) {
            i7 = a7.f15355b;
        } else {
            i7 = -1;
        }
        this.f15421t = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r3 == r5.f15355b) goto L14;
     */
    @Override // v6.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(v6.C1341f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            M5.g.f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L76
            boolean r3 = r8.f15422u
            r3 = r3 ^ 1
            if (r3 == 0) goto L6a
            v6.A r3 = r8.f15420s
            v6.f r4 = r8.f15419r
            if (r3 == 0) goto L31
            v6.A r5 = r4.f15387q
            if (r3 != r5) goto L25
            int r3 = r8.f15421t
            M5.g.c(r5)
            int r5 = r5.f15355b
            if (r3 != r5) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            long r0 = r8.f15423v
            r2 = 1
            long r0 = r0 + r2
            v6.h r2 = r8.f15418q
            boolean r0 = r2.t(r0)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            v6.A r0 = r8.f15420s
            if (r0 != 0) goto L52
            v6.A r0 = r4.f15387q
            if (r0 == 0) goto L52
            r8.f15420s = r0
            int r0 = r0.f15355b
            r8.f15421t = r0
        L52:
            long r0 = r4.f15388r
            long r2 = r8.f15423v
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            v6.f r2 = r8.f15419r
            long r4 = r8.f15423v
            r3 = r9
            r6 = r10
            r2.x(r3, r4, r6)
            long r0 = r8.f15423v
            long r0 = r0 + r10
            r8.f15423v = r0
            return r10
        L6a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L76:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = r0.AbstractC1111a.o(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.x.L(v6.f, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15422u = true;
    }

    @Override // v6.F
    public final H d() {
        return this.f15418q.d();
    }
}
