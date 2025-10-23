package w2;
/* renamed from: w2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385g extends i2.g {

    /* renamed from: A  reason: collision with root package name */
    public int f15770A;

    /* renamed from: B  reason: collision with root package name */
    public int f15771B;

    /* renamed from: z  reason: collision with root package name */
    public long f15772z;

    @Override // i2.g
    public final void f() {
        super.f();
        this.f15770A = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(i2.g r6) {
        /*
            r5 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r6.d(r0)
            r1 = 1
            r0 = r0 ^ r1
            Z2.AbstractC0156a.f(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r6.d(r0)
            r0 = r0 ^ r1
            Z2.AbstractC0156a.f(r0)
            r0 = 4
            boolean r0 = r6.d(r0)
            r0 = r0 ^ r1
            Z2.AbstractC0156a.f(r0)
            int r0 = r5.f15770A
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = r1
            goto L26
        L25:
            r3 = r2
        L26:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L2b
            goto L52
        L2b:
            int r3 = r5.f15771B
            if (r0 < r3) goto L30
            goto L51
        L30:
            boolean r0 = r6.d(r4)
            boolean r3 = r5.d(r4)
            if (r0 == r3) goto L3b
            goto L51
        L3b:
            java.nio.ByteBuffer r0 = r6.f11351t
            if (r0 == 0) goto L52
            java.nio.ByteBuffer r3 = r5.f11351t
            if (r3 == 0) goto L52
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L52
        L51:
            return r2
        L52:
            int r0 = r5.f15770A
            int r2 = r0 + 1
            r5.f15770A = r2
            if (r0 != 0) goto L66
            long r2 = r6.f11353v
            r5.f11353v = r2
            boolean r0 = r6.d(r1)
            if (r0 == 0) goto L66
            r5.f11331r = r1
        L66:
            boolean r0 = r6.d(r4)
            if (r0 == 0) goto L6e
            r5.f11331r = r4
        L6e:
            java.nio.ByteBuffer r0 = r6.f11351t
            if (r0 == 0) goto L7e
            int r2 = r0.remaining()
            r5.i(r2)
            java.nio.ByteBuffer r2 = r5.f11351t
            r2.put(r0)
        L7e:
            long r2 = r6.f11353v
            r5.f15772z = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C1385g.l(i2.g):boolean");
    }
}
