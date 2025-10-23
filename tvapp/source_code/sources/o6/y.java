package o6;

import v6.C1341f;
import v6.H;
/* loaded from: classes.dex */
public final class y implements v6.F {

    /* renamed from: q  reason: collision with root package name */
    public final long f13086q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f13087r;

    /* renamed from: s  reason: collision with root package name */
    public final C1341f f13088s;

    /* renamed from: t  reason: collision with root package name */
    public final C1341f f13089t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f13090u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ A f13091v;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, v6.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, v6.f] */
    public y(A a7, long j7, boolean z7) {
        M5.g.f(a7, "this$0");
        this.f13091v = a7;
        this.f13086q = j7;
        this.f13087r = z7;
        this.f13088s = new Object();
        this.f13089t = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
        throw new java.io.IOException("stream closed");
     */
    @Override // v6.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(v6.C1341f r16, long r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            java.lang.String r4 = "sink"
            M5.g.f(r0, r4)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto La6
        L10:
            o6.A r6 = r1.f13091v
            monitor-enter(r6)
            o6.z r7 = r6.f12968k     // Catch: java.lang.Throwable -> L94
            r7.h()     // Catch: java.lang.Throwable -> L94
            o6.b r7 = r6.f()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L35
            boolean r7 = r1.f13087r     // Catch: java.lang.Throwable -> L33
            if (r7 != 0) goto L35
            java.io.IOException r7 = r6.n     // Catch: java.lang.Throwable -> L33
            if (r7 != 0) goto L36
            o6.F r7 = new o6.F     // Catch: java.lang.Throwable -> L33
            o6.b r8 = r6.f()     // Catch: java.lang.Throwable -> L33
            M5.g.c(r8)     // Catch: java.lang.Throwable -> L33
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            goto L9e
        L35:
            r7 = 0
        L36:
            boolean r8 = r1.f13090u     // Catch: java.lang.Throwable -> L33
            if (r8 != 0) goto L96
            v6.f r8 = r1.f13089t     // Catch: java.lang.Throwable -> L33
            long r9 = r8.f15388r     // Catch: java.lang.Throwable -> L33
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r12 = -1
            r14 = 0
            if (r11 <= 0) goto L72
            long r9 = java.lang.Math.min(r2, r9)     // Catch: java.lang.Throwable -> L33
            long r8 = r8.L(r0, r9)     // Catch: java.lang.Throwable -> L33
            long r10 = r6.f12962c     // Catch: java.lang.Throwable -> L33
            long r10 = r10 + r8
            r6.f12962c = r10     // Catch: java.lang.Throwable -> L33
            long r4 = r6.d     // Catch: java.lang.Throwable -> L33
            long r10 = r10 - r4
            if (r7 != 0) goto L7d
            o6.s r4 = r6.f12961b     // Catch: java.lang.Throwable -> L33
            o6.E r4 = r4.f13045H     // Catch: java.lang.Throwable -> L33
            int r4 = r4.a()     // Catch: java.lang.Throwable -> L33
            int r4 = r4 / 2
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L33
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 < 0) goto L7d
            o6.s r4 = r6.f12961b     // Catch: java.lang.Throwable -> L33
            int r5 = r6.f12960a     // Catch: java.lang.Throwable -> L33
            r4.O(r10, r5)     // Catch: java.lang.Throwable -> L33
            long r4 = r6.f12962c     // Catch: java.lang.Throwable -> L33
            r6.d = r4     // Catch: java.lang.Throwable -> L33
            goto L7d
        L72:
            boolean r4 = r1.f13087r     // Catch: java.lang.Throwable -> L33
            if (r4 != 0) goto L7c
            if (r7 != 0) goto L7c
            r6.l()     // Catch: java.lang.Throwable -> L33
            r14 = 1
        L7c:
            r8 = r12
        L7d:
            o6.z r4 = r6.f12968k     // Catch: java.lang.Throwable -> L94
            r4.l()     // Catch: java.lang.Throwable -> L94
            monitor-exit(r6)
            if (r14 == 0) goto L88
            r4 = 0
            goto L10
        L88:
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L90
            r15.a(r8)
            return r8
        L90:
            if (r7 != 0) goto L93
            return r12
        L93:
            throw r7
        L94:
            r0 = move-exception
            goto La4
        L96:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "stream closed"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33
            throw r0     // Catch: java.lang.Throwable -> L33
        L9e:
            o6.z r2 = r6.f12968k     // Catch: java.lang.Throwable -> L94
            r2.l()     // Catch: java.lang.Throwable -> L94
            throw r0     // Catch: java.lang.Throwable -> L94
        La4:
            monitor-exit(r6)
            throw r0
        La6:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            java.lang.String r0 = M5.g.k(r2, r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.y.L(v6.f, long):long");
    }

    public final void a(long j7) {
        byte[] bArr = i6.b.f11390a;
        this.f13091v.f12961b.r(j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j7;
        A a7 = this.f13091v;
        synchronized (a7) {
            this.f13090u = true;
            C1341f c1341f = this.f13089t;
            j7 = c1341f.f15388r;
            c1341f.b();
            a7.notifyAll();
        }
        if (j7 > 0) {
            a(j7);
        }
        this.f13091v.a();
    }

    @Override // v6.F
    public final H d() {
        return this.f13091v.f12968k;
    }
}
