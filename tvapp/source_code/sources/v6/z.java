package v6;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class z implements InterfaceC1343h {

    /* renamed from: q  reason: collision with root package name */
    public final F f15427q;

    /* renamed from: r  reason: collision with root package name */
    public final C1341f f15428r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15429s;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, v6.f] */
    public z(F f) {
        M5.g.f(f, "source");
        this.f15427q = f;
        this.f15428r = new Object();
    }

    @Override // v6.InterfaceC1343h
    public final String D() {
        return o(Long.MAX_VALUE);
    }

    @Override // v6.InterfaceC1343h
    public final void F(long j7) {
        if (t(j7)) {
            return;
        }
        throw new EOFException();
    }

    @Override // v6.InterfaceC1343h
    public final int H() {
        F(4L);
        return this.f15428r.H();
    }

    @Override // v6.InterfaceC1343h
    public final long J(C1344i c1344i) {
        M5.g.f(c1344i, "bytes");
        if (!this.f15429s) {
            long j7 = 0;
            while (true) {
                C1341f c1341f = this.f15428r;
                long V6 = c1341f.V(c1344i, j7);
                if (V6 == -1) {
                    long j8 = c1341f.f15388r;
                    if (this.f15427q.L(c1341f, 8192L) == -1) {
                        return -1L;
                    }
                    j7 = Math.max(j7, (j8 - c1344i.f15390q.length) + 1);
                } else {
                    return V6;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // v6.F
    public final long L(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "sink");
        if (j7 >= 0) {
            if (!this.f15429s) {
                C1341f c1341f2 = this.f15428r;
                if (c1341f2.f15388r == 0 && this.f15427q.L(c1341f2, 8192L) == -1) {
                    return -1L;
                }
                return c1341f2.L(c1341f, Math.min(j7, c1341f2.f15388r));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "byteCount < 0: ").toString());
    }

    @Override // v6.InterfaceC1343h
    public final boolean M() {
        if (!this.f15429s) {
            C1341f c1341f = this.f15428r;
            if (c1341f.M() && this.f15427q.L(c1341f, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        w4.l0.c(16);
        w4.l0.c(16);
        r1 = java.lang.Integer.toString(r2, 16);
        M5.g.e(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // v6.InterfaceC1343h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Q() {
        /*
            r6 = this;
            r0 = 1
            r6.F(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.t(r2)
            v6.f r3 = r6.f15428r
            if (r2 == 0) goto L51
            long r4 = (long) r0
            byte r2 = r3.y(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L51
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            w4.l0.c(r1)
            w4.l0.c(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            M5.g.e(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L51:
            long r0 = r3.Q()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.z.Q():long");
    }

    @Override // v6.InterfaceC1343h
    public final long R(InterfaceC1342g interfaceC1342g) {
        C1341f c1341f;
        long j7 = 0;
        while (true) {
            F f = this.f15427q;
            c1341f = this.f15428r;
            if (f.L(c1341f, 8192L) == -1) {
                break;
            }
            long r3 = c1341f.r();
            if (r3 > 0) {
                j7 += r3;
                interfaceC1342g.v(c1341f, r3);
            }
        }
        long j8 = c1341f.f15388r;
        if (j8 > 0) {
            long j9 = j7 + j8;
            interfaceC1342g.v(c1341f, j8);
            return j9;
        }
        return j7;
    }

    @Override // v6.InterfaceC1343h
    public final String S(Charset charset) {
        C1341f c1341f = this.f15428r;
        c1341f.h0(this.f15427q);
        return c1341f.a0(c1341f.f15388r, charset);
    }

    @Override // v6.InterfaceC1343h
    public final InputStream T() {
        return new C1340e(this, 1);
    }

    @Override // v6.InterfaceC1343h
    public final boolean U(C1344i c1344i) {
        M5.g.f(c1344i, "bytes");
        byte[] bArr = c1344i.f15390q;
        int length = bArr.length;
        if (!this.f15429s) {
            if (length >= 0 && bArr.length >= length) {
                for (int i7 = 0; i7 < length; i7++) {
                    long j7 = i7;
                    if (t(1 + j7) && this.f15428r.y(j7) == bArr[i7]) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long a(byte b7, long j7, long j8) {
        if (!this.f15429s) {
            long j9 = 0;
            if (0 <= j8) {
                while (j9 < j8) {
                    long O5 = this.f15428r.O(b7, j9, j8);
                    if (O5 != -1) {
                        return O5;
                    }
                    C1341f c1341f = this.f15428r;
                    long j10 = c1341f.f15388r;
                    if (j10 >= j8 || this.f15427q.L(c1341f, 8192L) == -1) {
                        return -1L;
                    }
                    j9 = Math.max(j9, j10);
                }
                return -1L;
            }
            throw new IllegalArgumentException(AbstractC1111a.o(j8, "fromIndex=0 toIndex=").toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final short b() {
        F(2L);
        return this.f15428r.Z();
    }

    @Override // v6.InterfaceC1343h, v6.InterfaceC1342g
    public final C1341f c() {
        return this.f15428r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f15429s) {
            this.f15429s = true;
            this.f15427q.close();
            this.f15428r.b();
        }
    }

    @Override // v6.F
    public final H d() {
        return this.f15427q.d();
    }

    public final String f(long j7) {
        F(j7);
        C1341f c1341f = this.f15428r;
        c1341f.getClass();
        return c1341f.a0(j7, U5.a.f3474a);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f15429s;
    }

    @Override // v6.InterfaceC1343h
    public final C1344i l(long j7) {
        F(j7);
        return this.f15428r.l(j7);
    }

    @Override // v6.InterfaceC1343h
    public final long m() {
        F(8L);
        return this.f15428r.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, v6.f] */
    @Override // v6.InterfaceC1343h
    public final String o(long j7) {
        long j8;
        ?? obj;
        if (j7 >= 0) {
            if (j7 == Long.MAX_VALUE) {
                j8 = Long.MAX_VALUE;
            } else {
                j8 = j7 + 1;
            }
            long a7 = a((byte) 10, 0L, j8);
            int i7 = (a7 > (-1L) ? 1 : (a7 == (-1L) ? 0 : -1));
            C1341f c1341f = this.f15428r;
            if (i7 != 0) {
                return w6.g.b(c1341f, a7);
            }
            if (j8 < Long.MAX_VALUE && t(j8) && c1341f.y(j8 - 1) == 13 && t(1 + j8) && c1341f.y(j8) == 10) {
                return w6.g.b(c1341f, j8);
            }
            c1341f.x(new Object(), 0L, Math.min(32, c1341f.f15388r));
            throw new EOFException("\\n not found: limit=" + Math.min(c1341f.f15388r, j7) + " content=" + obj.l(obj.f15388r).e() + (char) 8230);
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "limit < 0: ").toString());
    }

    @Override // v6.InterfaceC1343h
    public final void p(long j7) {
        if (!this.f15429s) {
            while (j7 > 0) {
                C1341f c1341f = this.f15428r;
                if (c1341f.f15388r == 0 && this.f15427q.L(c1341f, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j7, c1341f.f15388r);
                c1341f.p(min);
                j7 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        M5.g.f(byteBuffer, "sink");
        C1341f c1341f = this.f15428r;
        if (c1341f.f15388r == 0 && this.f15427q.L(c1341f, 8192L) == -1) {
            return -1;
        }
        return c1341f.read(byteBuffer);
    }

    @Override // v6.InterfaceC1343h
    public final byte readByte() {
        F(1L);
        return this.f15428r.readByte();
    }

    @Override // v6.InterfaceC1343h
    public final int readInt() {
        F(4L);
        return this.f15428r.readInt();
    }

    @Override // v6.InterfaceC1343h
    public final short readShort() {
        F(2L);
        return this.f15428r.readShort();
    }

    @Override // v6.InterfaceC1343h
    public final boolean t(long j7) {
        C1341f c1341f;
        if (j7 >= 0) {
            if (!this.f15429s) {
                do {
                    c1341f = this.f15428r;
                    if (c1341f.f15388r >= j7) {
                        return true;
                    }
                } while (this.f15427q.L(c1341f, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "byteCount < 0: ").toString());
    }

    public final String toString() {
        return "buffer(" + this.f15427q + ')';
    }

    @Override // v6.InterfaceC1343h
    public final long u(C1344i c1344i) {
        M5.g.f(c1344i, "targetBytes");
        if (!this.f15429s) {
            long j7 = 0;
            while (true) {
                C1341f c1341f = this.f15428r;
                long W = c1341f.W(c1344i, j7);
                if (W == -1) {
                    long j8 = c1341f.f15388r;
                    if (this.f15427q.L(c1341f, 8192L) == -1) {
                        return -1L;
                    }
                    j7 = Math.max(j7, j8);
                } else {
                    return W;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        return -1;
     */
    @Override // v6.InterfaceC1343h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z(v6.u r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            M5.g.f(r8, r0)
            boolean r0 = r7.f15429s
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L36
        Lb:
            v6.f r0 = r7.f15428r
            int r2 = w6.g.c(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L26
            if (r2 == r4) goto L24
            v6.i[] r8 = r8.f15414q
            r8 = r8[r2]
            int r8 = r8.d()
            long r3 = (long) r8
            r0.p(r3)
            goto L35
        L24:
            r2 = r4
            goto L35
        L26:
            v6.F r2 = r7.f15427q
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.L(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
            goto L24
        L35:
            return r2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.z.z(v6.u):int");
    }
}
