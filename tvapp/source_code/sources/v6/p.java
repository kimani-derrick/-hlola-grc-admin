package v6;

import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class p implements F {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC1343h f15405q;

    /* renamed from: r  reason: collision with root package name */
    public final Inflater f15406r;

    /* renamed from: s  reason: collision with root package name */
    public int f15407s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15408t;

    public p(z zVar, Inflater inflater) {
        this.f15405q = zVar;
        this.f15406r = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
    @Override // v6.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(v6.C1341f r11, long r12) {
        /*
            r10 = this;
            java.lang.String r0 = "sink"
            M5.g.f(r11, r0)
        L5:
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto Lbd
            boolean r3 = r10.f15408t
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto Lb1
            v6.h r3 = r10.f15405q
            java.util.zip.Inflater r5 = r10.f15406r
            if (r2 != 0) goto L1a
        L17:
            r8 = r0
            goto L86
        L1a:
            v6.A r2 = r11.e0(r4)     // Catch: java.util.zip.DataFormatException -> L74
            int r4 = r2.f15356c     // Catch: java.util.zip.DataFormatException -> L74
            int r4 = 8192 - r4
            long r6 = (long) r4     // Catch: java.util.zip.DataFormatException -> L74
            long r6 = java.lang.Math.min(r12, r6)     // Catch: java.util.zip.DataFormatException -> L74
            int r4 = (int) r6     // Catch: java.util.zip.DataFormatException -> L74
            boolean r6 = r5.needsInput()     // Catch: java.util.zip.DataFormatException -> L74
            if (r6 != 0) goto L2f
            goto L4b
        L2f:
            boolean r6 = r3.M()     // Catch: java.util.zip.DataFormatException -> L74
            if (r6 == 0) goto L36
            goto L4b
        L36:
            v6.f r6 = r3.c()     // Catch: java.util.zip.DataFormatException -> L74
            v6.A r6 = r6.f15387q     // Catch: java.util.zip.DataFormatException -> L74
            M5.g.c(r6)     // Catch: java.util.zip.DataFormatException -> L74
            int r7 = r6.f15356c     // Catch: java.util.zip.DataFormatException -> L74
            int r8 = r6.f15355b     // Catch: java.util.zip.DataFormatException -> L74
            int r7 = r7 - r8
            r10.f15407s = r7     // Catch: java.util.zip.DataFormatException -> L74
            byte[] r6 = r6.f15354a     // Catch: java.util.zip.DataFormatException -> L74
            r5.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> L74
        L4b:
            byte[] r6 = r2.f15354a     // Catch: java.util.zip.DataFormatException -> L74
            int r7 = r2.f15356c     // Catch: java.util.zip.DataFormatException -> L74
            int r4 = r5.inflate(r6, r7, r4)     // Catch: java.util.zip.DataFormatException -> L74
            int r6 = r10.f15407s     // Catch: java.util.zip.DataFormatException -> L74
            if (r6 != 0) goto L58
            goto L66
        L58:
            int r7 = r5.getRemaining()     // Catch: java.util.zip.DataFormatException -> L74
            int r6 = r6 - r7
            int r7 = r10.f15407s     // Catch: java.util.zip.DataFormatException -> L74
            int r7 = r7 - r6
            r10.f15407s = r7     // Catch: java.util.zip.DataFormatException -> L74
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> L74
            r3.p(r6)     // Catch: java.util.zip.DataFormatException -> L74
        L66:
            if (r4 <= 0) goto L76
            int r6 = r2.f15356c     // Catch: java.util.zip.DataFormatException -> L74
            int r6 = r6 + r4
            r2.f15356c = r6     // Catch: java.util.zip.DataFormatException -> L74
            long r6 = r11.f15388r     // Catch: java.util.zip.DataFormatException -> L74
            long r8 = (long) r4     // Catch: java.util.zip.DataFormatException -> L74
            long r6 = r6 + r8
            r11.f15388r = r6     // Catch: java.util.zip.DataFormatException -> L74
            goto L86
        L74:
            r11 = move-exception
            goto Lab
        L76:
            int r4 = r2.f15355b     // Catch: java.util.zip.DataFormatException -> L74
            int r6 = r2.f15356c     // Catch: java.util.zip.DataFormatException -> L74
            if (r4 != r6) goto L17
            v6.A r4 = r2.a()     // Catch: java.util.zip.DataFormatException -> L74
            r11.f15387q = r4     // Catch: java.util.zip.DataFormatException -> L74
            v6.B.a(r2)     // Catch: java.util.zip.DataFormatException -> L74
            goto L17
        L86:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8b
            return r8
        L8b:
            boolean r0 = r5.finished()
            if (r0 != 0) goto La8
            boolean r0 = r5.needsDictionary()
            if (r0 == 0) goto L98
            goto La8
        L98:
            boolean r0 = r3.M()
            if (r0 != 0) goto La0
            goto L5
        La0:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "source exhausted prematurely"
            r11.<init>(r12)
            throw r11
        La8:
            r11 = -1
            return r11
        Lab:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            throw r12
        Lb1:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lbd:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r11 = r0.AbstractC1111a.o(r12, r11)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.p.L(v6.f, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15408t) {
            return;
        }
        this.f15406r.end();
        this.f15408t = true;
        this.f15405q.close();
    }

    @Override // v6.F
    public final H d() {
        return this.f15405q.d();
    }
}
