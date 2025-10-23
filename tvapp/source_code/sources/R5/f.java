package R5;
/* loaded from: classes.dex */
public final class f extends d {
    static {
        new d(1L, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r4.f2930q > r4.f2931r) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof R5.f
            if (r0 == 0) goto L28
            long r0 = r9.f2930q
            long r2 = r9.f2931r
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            r4 = r10
            R5.f r4 = (R5.f) r4
            long r5 = r4.f2930q
            long r7 = r4.f2931r
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L18
            goto L26
        L18:
            R5.f r10 = (R5.f) r10
            long r4 = r10.f2930q
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r10.f2931r
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L28
        L26:
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j7 = this.f2930q;
        long j8 = this.f2931r;
        if (j7 > j8) {
            return -1;
        }
        return (int) ((31 * (j7 ^ (j7 >>> 32))) + ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        return this.f2930q + ".." + this.f2931r;
    }
}
