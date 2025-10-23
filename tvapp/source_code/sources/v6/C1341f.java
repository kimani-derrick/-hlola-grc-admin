package v6;

import a.AbstractC0189a;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import r0.AbstractC1111a;
/* renamed from: v6.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341f implements InterfaceC1343h, InterfaceC1342g, Cloneable, ByteChannel {

    /* renamed from: q  reason: collision with root package name */
    public A f15387q;

    /* renamed from: r  reason: collision with root package name */
    public long f15388r;

    @Override // v6.InterfaceC1343h
    public final String D() {
        return o(Long.MAX_VALUE);
    }

    @Override // v6.InterfaceC1343h
    public final void F(long j7) {
        if (this.f15388r >= j7) {
            return;
        }
        throw new EOFException();
    }

    @Override // v6.InterfaceC1342g
    public final /* bridge */ /* synthetic */ InterfaceC1342g G(String str) {
        o0(str);
        return this;
    }

    @Override // v6.InterfaceC1343h
    public final int H() {
        int readInt = readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // v6.InterfaceC1342g
    public final /* bridge */ /* synthetic */ InterfaceC1342g I(long j7) {
        j0(j7);
        return this;
    }

    @Override // v6.InterfaceC1343h
    public final long J(C1344i c1344i) {
        M5.g.f(c1344i, "bytes");
        return V(c1344i, 0L);
    }

    @Override // v6.F
    public final long L(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "sink");
        if (j7 >= 0) {
            long j8 = this.f15388r;
            if (j8 == 0) {
                return -1L;
            }
            if (j7 > j8) {
                j7 = j8;
            }
            c1341f.v(this, j7);
            return j7;
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "byteCount < 0: ").toString());
    }

    @Override // v6.InterfaceC1343h
    public final boolean M() {
        if (this.f15388r == 0) {
            return true;
        }
        return false;
    }

    @Override // v6.InterfaceC1342g
    public final /* bridge */ /* synthetic */ InterfaceC1342g N(int i7) {
        i0(i7);
        return this;
    }

    public final long O(byte b7, long j7, long j8) {
        A a7;
        long j9 = 0;
        if (0 <= j7 && j7 <= j8) {
            long j10 = this.f15388r;
            if (j8 > j10) {
                j8 = j10;
            }
            if (j7 == j8 || (a7 = this.f15387q) == null) {
                return -1L;
            }
            if (j10 - j7 < j7) {
                while (j10 > j7) {
                    a7 = a7.f15358g;
                    M5.g.c(a7);
                    j10 -= a7.f15356c - a7.f15355b;
                }
                while (j10 < j8) {
                    int min = (int) Math.min(a7.f15356c, (a7.f15355b + j8) - j10);
                    for (int i7 = (int) ((a7.f15355b + j7) - j10); i7 < min; i7++) {
                        if (a7.f15354a[i7] == b7) {
                            return (i7 - a7.f15355b) + j10;
                        }
                    }
                    j10 += a7.f15356c - a7.f15355b;
                    a7 = a7.f;
                    M5.g.c(a7);
                    j7 = j10;
                }
                return -1L;
            }
            while (true) {
                long j11 = (a7.f15356c - a7.f15355b) + j9;
                if (j11 > j7) {
                    break;
                }
                a7 = a7.f;
                M5.g.c(a7);
                j9 = j11;
            }
            while (j9 < j8) {
                int min2 = (int) Math.min(a7.f15356c, (a7.f15355b + j8) - j9);
                for (int i8 = (int) ((a7.f15355b + j7) - j9); i8 < min2; i8++) {
                    if (a7.f15354a[i8] == b7) {
                        return (i8 - a7.f15355b) + j9;
                    }
                }
                j9 += a7.f15356c - a7.f15355b;
                a7 = a7.f;
                M5.g.c(a7);
                j7 = j9;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f15388r + " fromIndex=" + j7 + " toIndex=" + j8).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4 A[EDGE_INSN: B:42:0x00a4->B:37:0x00a4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, v6.f] */
    @Override // v6.InterfaceC1343h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Q() {
        /*
            r18 = this;
            r0 = r18
            r1 = 4
            r2 = 48
            r3 = 0
            r4 = 1
            long r5 = r0.f15388r
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto Lab
            r9 = r3
            r10 = r9
            r5 = r7
        L12:
            v6.A r11 = r0.f15387q
            M5.g.c(r11)
            int r12 = r11.f15355b
            int r13 = r11.f15356c
        L1b:
            if (r12 >= r13) goto L90
            byte[] r14 = r11.f15354a
            r14 = r14[r12]
            if (r14 < r2) goto L2a
            r15 = 57
            if (r14 > r15) goto L2a
            int r15 = r14 + (-48)
            goto L3f
        L2a:
            r15 = 97
            if (r14 < r15) goto L35
            r15 = 102(0x66, float:1.43E-43)
            if (r14 > r15) goto L35
            int r15 = r14 + (-87)
            goto L3f
        L35:
            r15 = 65
            if (r14 < r15) goto L68
            r15 = 70
            if (r14 > r15) goto L68
            int r15 = r14 + (-55)
        L3f:
            r16 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r16 = r5 & r16
            int r16 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r16 != 0) goto L4d
            long r5 = r5 << r1
            long r14 = (long) r15
            long r5 = r5 | r14
            int r12 = r12 + r4
            int r9 = r9 + r4
            goto L1b
        L4d:
            v6.f r1 = new v6.f
            r1.<init>()
            r1.k0(r5)
            r1.i0(r14)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.b0()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L68:
            if (r9 == 0) goto L6c
            r10 = r4
            goto L90
        L6c:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            char[] r5 = w6.h.f16123a
            int r1 = r14 >> 4
            r1 = r1 & 15
            char r1 = r5[r1]
            r6 = r14 & 15
            char r5 = r5[r6]
            r6 = 2
            char[] r6 = new char[r6]
            r6[r3] = r1
            r6[r4] = r5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L90:
            if (r12 != r13) goto L9c
            v6.A r12 = r11.a()
            r0.f15387q = r12
            v6.B.a(r11)
            goto L9e
        L9c:
            r11.f15355b = r12
        L9e:
            if (r10 != 0) goto La4
            v6.A r11 = r0.f15387q
            if (r11 != 0) goto L12
        La4:
            long r1 = r0.f15388r
            long r3 = (long) r9
            long r1 = r1 - r3
            r0.f15388r = r1
            return r5
        Lab:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.C1341f.Q():long");
    }

    @Override // v6.InterfaceC1343h
    public final long R(InterfaceC1342g interfaceC1342g) {
        long j7 = this.f15388r;
        if (j7 > 0) {
            interfaceC1342g.v(this, j7);
        }
        return j7;
    }

    @Override // v6.InterfaceC1343h
    public final String S(Charset charset) {
        return a0(this.f15388r, charset);
    }

    @Override // v6.InterfaceC1343h
    public final InputStream T() {
        return new C1340e(this, 0);
    }

    @Override // v6.InterfaceC1343h
    public final boolean U(C1344i c1344i) {
        M5.g.f(c1344i, "bytes");
        byte[] bArr = c1344i.f15390q;
        int length = bArr.length;
        if (length < 0 || this.f15388r < length || bArr.length < length) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            if (y(i7) != bArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final long V(C1344i c1344i, long j7) {
        long j8 = j7;
        M5.g.f(c1344i, "bytes");
        byte[] bArr = c1344i.f15390q;
        if (bArr.length > 0) {
            long j9 = 0;
            if (j8 >= 0) {
                A a7 = this.f15387q;
                if (a7 != null) {
                    long j10 = this.f15388r;
                    if (j10 - j8 < j8) {
                        while (j10 > j8) {
                            a7 = a7.f15358g;
                            M5.g.c(a7);
                            j10 -= a7.f15356c - a7.f15355b;
                        }
                        byte b7 = bArr[0];
                        int length = bArr.length;
                        long j11 = (this.f15388r - length) + 1;
                        while (j10 < j11) {
                            int min = (int) Math.min(a7.f15356c, (a7.f15355b + j11) - j10);
                            for (int i7 = (int) ((a7.f15355b + j8) - j10); i7 < min; i7++) {
                                if (a7.f15354a[i7] == b7 && w6.g.a(a7, i7 + 1, bArr, length)) {
                                    return (i7 - a7.f15355b) + j10;
                                }
                            }
                            j10 += a7.f15356c - a7.f15355b;
                            a7 = a7.f;
                            M5.g.c(a7);
                            j8 = j10;
                        }
                    } else {
                        while (true) {
                            long j12 = (a7.f15356c - a7.f15355b) + j9;
                            if (j12 > j8) {
                                break;
                            }
                            a7 = a7.f;
                            M5.g.c(a7);
                            j9 = j12;
                        }
                        byte b8 = bArr[0];
                        int length2 = bArr.length;
                        long j13 = (this.f15388r - length2) + 1;
                        while (j9 < j13) {
                            int min2 = (int) Math.min(a7.f15356c, (a7.f15355b + j13) - j9);
                            for (int i8 = (int) ((a7.f15355b + j8) - j9); i8 < min2; i8++) {
                                if (a7.f15354a[i8] == b8 && w6.g.a(a7, i8 + 1, bArr, length2)) {
                                    return (i8 - a7.f15355b) + j9;
                                }
                            }
                            j9 += a7.f15356c - a7.f15355b;
                            a7 = a7.f;
                            M5.g.c(a7);
                            j8 = j9;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(AbstractC1111a.o(j8, "fromIndex < 0: ").toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public final long W(C1344i c1344i, long j7) {
        int i7;
        int i8;
        M5.g.f(c1344i, "targetBytes");
        long j8 = 0;
        if (j7 >= 0) {
            A a7 = this.f15387q;
            if (a7 == null) {
                return -1L;
            }
            long j9 = this.f15388r;
            int i9 = ((j9 - j7) > j7 ? 1 : ((j9 - j7) == j7 ? 0 : -1));
            byte[] bArr = c1344i.f15390q;
            if (i9 < 0) {
                while (j9 > j7) {
                    a7 = a7.f15358g;
                    M5.g.c(a7);
                    j9 -= a7.f15356c - a7.f15355b;
                }
                if (bArr.length == 2) {
                    byte b7 = bArr[0];
                    byte b8 = bArr[1];
                    while (j9 < this.f15388r) {
                        i8 = (int) ((a7.f15355b + j7) - j9);
                        int i10 = a7.f15356c;
                        while (i8 < i10) {
                            byte b9 = a7.f15354a[i8];
                            if (b9 != b7 && b9 != b8) {
                                i8++;
                            }
                        }
                        j9 += a7.f15356c - a7.f15355b;
                        a7 = a7.f;
                        M5.g.c(a7);
                        j7 = j9;
                    }
                    return -1L;
                }
                while (j9 < this.f15388r) {
                    i8 = (int) ((a7.f15355b + j7) - j9);
                    int i11 = a7.f15356c;
                    while (i8 < i11) {
                        byte b10 = a7.f15354a[i8];
                        for (byte b11 : bArr) {
                            if (b10 != b11) {
                            }
                        }
                        i8++;
                    }
                    j9 += a7.f15356c - a7.f15355b;
                    a7 = a7.f;
                    M5.g.c(a7);
                    j7 = j9;
                }
                return -1L;
                return (i8 - a7.f15355b) + j9;
            }
            while (true) {
                long j10 = (a7.f15356c - a7.f15355b) + j8;
                if (j10 > j7) {
                    break;
                }
                a7 = a7.f;
                M5.g.c(a7);
                j8 = j10;
            }
            if (bArr.length == 2) {
                byte b12 = bArr[0];
                byte b13 = bArr[1];
                while (j8 < this.f15388r) {
                    i7 = (int) ((a7.f15355b + j7) - j8);
                    int i12 = a7.f15356c;
                    while (i7 < i12) {
                        byte b14 = a7.f15354a[i7];
                        if (b14 != b12 && b14 != b13) {
                            i7++;
                        }
                    }
                    j8 += a7.f15356c - a7.f15355b;
                    a7 = a7.f;
                    M5.g.c(a7);
                    j7 = j8;
                }
                return -1L;
            }
            while (j8 < this.f15388r) {
                i7 = (int) ((a7.f15355b + j7) - j8);
                int i13 = a7.f15356c;
                while (i7 < i13) {
                    byte b15 = a7.f15354a[i7];
                    for (byte b16 : bArr) {
                        if (b15 != b16) {
                        }
                    }
                    i7++;
                }
                j8 += a7.f15356c - a7.f15355b;
                a7 = a7.f;
                M5.g.c(a7);
                j7 = j8;
            }
            return -1L;
            return (i7 - a7.f15355b) + j8;
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "fromIndex < 0: ").toString());
    }

    public final int X(byte[] bArr, int i7, int i8) {
        M5.g.f(bArr, "sink");
        AbstractC0189a.m(bArr.length, i7, i8);
        A a7 = this.f15387q;
        if (a7 == null) {
            return -1;
        }
        int min = Math.min(i8, a7.f15356c - a7.f15355b);
        int i9 = a7.f15355b;
        A5.j.O(i7, i9, i9 + min, a7.f15354a, bArr);
        int i10 = a7.f15355b + min;
        a7.f15355b = i10;
        this.f15388r -= min;
        if (i10 == a7.f15356c) {
            this.f15387q = a7.a();
            B.a(a7);
        }
        return min;
    }

    public final byte[] Y(long j7) {
        if (j7 >= 0 && j7 <= 2147483647L) {
            if (this.f15388r >= j7) {
                int i7 = (int) j7;
                byte[] bArr = new byte[i7];
                int i8 = 0;
                while (i8 < i7) {
                    int X6 = X(bArr, i8, i7 - i8);
                    if (X6 != -1) {
                        i8 += X6;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "byteCount: ").toString());
    }

    public final short Z() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final String a0(long j7, Charset charset) {
        M5.g.f(charset, "charset");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 >= 0 && j7 <= 2147483647L) {
            if (this.f15388r >= j7) {
                if (i7 == 0) {
                    return "";
                }
                A a7 = this.f15387q;
                M5.g.c(a7);
                int i8 = a7.f15355b;
                if (i8 + j7 > a7.f15356c) {
                    return new String(Y(j7), charset);
                }
                int i9 = (int) j7;
                String str = new String(a7.f15354a, i8, i9, charset);
                int i10 = a7.f15355b + i9;
                a7.f15355b = i10;
                this.f15388r -= j7;
                if (i10 == a7.f15356c) {
                    this.f15387q = a7.a();
                    B.a(a7);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "byteCount: ").toString());
    }

    public final void b() {
        p(this.f15388r);
    }

    public final String b0() {
        return a0(this.f15388r, U5.a.f3474a);
    }

    public final int c0() {
        int i7;
        int i8;
        int i9;
        if (this.f15388r != 0) {
            byte y3 = y(0L);
            if ((y3 & 128) == 0) {
                i7 = y3 & Byte.MAX_VALUE;
                i8 = 0;
                i9 = 1;
            } else if ((y3 & 224) == 192) {
                i7 = y3 & 31;
                i9 = 2;
                i8 = 128;
            } else if ((y3 & 240) == 224) {
                i7 = y3 & 15;
                i9 = 3;
                i8 = 2048;
            } else if ((y3 & 248) == 240) {
                i7 = y3 & 7;
                i8 = 65536;
                i9 = 4;
            } else {
                p(1L);
                return 65533;
            }
            long j7 = i9;
            if (this.f15388r >= j7) {
                for (int i10 = 1; i10 < i9; i10++) {
                    long j8 = i10;
                    byte y4 = y(j8);
                    if ((y4 & 192) == 128) {
                        i7 = (i7 << 6) | (y4 & 63);
                    } else {
                        p(j8);
                        return 65533;
                    }
                }
                p(j7);
                if (i7 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i7 && i7 < 57344) || i7 < i8) {
                    return 65533;
                }
                return i7;
            }
            StringBuilder o7 = AbstractC0515y1.o(i9, "size < ", ": ");
            o7.append(this.f15388r);
            o7.append(" (to read code point prefixed 0x");
            char[] cArr = w6.h.f16123a;
            o7.append(new String(new char[]{cArr[(y3 >> 4) & 15], cArr[y3 & 15]}));
            o7.append(')');
            throw new EOFException(o7.toString());
        }
        throw new EOFException();
    }

    @Override // v6.F
    public final H d() {
        return H.d;
    }

    public final C1344i d0(int i7) {
        if (i7 == 0) {
            return C1344i.f15389t;
        }
        AbstractC0189a.m(this.f15388r, 0L, i7);
        A a7 = this.f15387q;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            M5.g.c(a7);
            int i11 = a7.f15356c;
            int i12 = a7.f15355b;
            if (i11 != i12) {
                i9 += i11 - i12;
                i10++;
                a7 = a7.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i10];
        int[] iArr = new int[i10 * 2];
        A a8 = this.f15387q;
        int i13 = 0;
        while (i8 < i7) {
            M5.g.c(a8);
            bArr[i13] = a8.f15354a;
            i8 += a8.f15356c - a8.f15355b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = a8.f15355b;
            a8.d = true;
            i13++;
            a8 = a8.f;
        }
        return new C(bArr, iArr);
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g e(byte[] bArr) {
        M5.g.f(bArr, "source");
        g0(bArr, 0, bArr.length);
        return this;
    }

    public final A e0(int i7) {
        if (i7 >= 1 && i7 <= 8192) {
            A a7 = this.f15387q;
            if (a7 == null) {
                A b7 = B.b();
                this.f15387q = b7;
                b7.f15358g = b7;
                b7.f = b7;
                return b7;
            }
            A a8 = a7.f15358g;
            M5.g.c(a8);
            if (a8.f15356c + i7 <= 8192 && a8.f15357e) {
                return a8;
            }
            A b8 = B.b();
            a8.b(b8);
            return b8;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1341f) {
                long j7 = this.f15388r;
                C1341f c1341f = (C1341f) obj;
                if (j7 == c1341f.f15388r) {
                    if (j7 != 0) {
                        A a7 = this.f15387q;
                        M5.g.c(a7);
                        A a8 = c1341f.f15387q;
                        M5.g.c(a8);
                        int i7 = a7.f15355b;
                        int i8 = a8.f15355b;
                        long j8 = 0;
                        while (j8 < this.f15388r) {
                            long min = Math.min(a7.f15356c - i7, a8.f15356c - i8);
                            long j9 = 0;
                            while (j9 < min) {
                                int i9 = i7 + 1;
                                byte b7 = a7.f15354a[i7];
                                int i10 = i8 + 1;
                                if (b7 == a8.f15354a[i8]) {
                                    j9++;
                                    i8 = i10;
                                    i7 = i9;
                                }
                            }
                            if (i7 == a7.f15356c) {
                                A a9 = a7.f;
                                M5.g.c(a9);
                                i7 = a9.f15355b;
                                a7 = a9;
                            }
                            if (i8 == a8.f15356c) {
                                a8 = a8.f;
                                M5.g.c(a8);
                                i8 = a8.f15355b;
                            }
                            j8 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void f0(C1344i c1344i) {
        M5.g.f(c1344i, "byteString");
        c1344i.r(this, c1344i.d());
    }

    @Override // v6.InterfaceC1342g
    public final /* bridge */ /* synthetic */ InterfaceC1342g g(byte[] bArr, int i7, int i8) {
        g0(bArr, i7, i8);
        return this;
    }

    public final void g0(byte[] bArr, int i7, int i8) {
        M5.g.f(bArr, "source");
        long j7 = i8;
        AbstractC0189a.m(bArr.length, i7, j7);
        int i9 = i8 + i7;
        while (i7 < i9) {
            A e02 = e0(1);
            int min = Math.min(i9 - i7, 8192 - e02.f15356c);
            int i10 = i7 + min;
            A5.j.O(e02.f15356c, i7, i10, bArr, e02.f15354a);
            e02.f15356c += min;
            i7 = i10;
        }
        this.f15388r += j7;
    }

    public final void h0(F f) {
        M5.g.f(f, "source");
        do {
        } while (f.L(this, 8192L) != -1);
    }

    public final int hashCode() {
        A a7 = this.f15387q;
        if (a7 == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = a7.f15356c;
            for (int i9 = a7.f15355b; i9 < i8; i9++) {
                i7 = (i7 * 31) + a7.f15354a[i9];
            }
            a7 = a7.f;
            M5.g.c(a7);
        } while (a7 != this.f15387q);
        return i7;
    }

    @Override // v6.InterfaceC1342g
    public final /* bridge */ /* synthetic */ InterfaceC1342g i(C1344i c1344i) {
        f0(c1344i);
        return this;
    }

    public final void i0(int i7) {
        A e02 = e0(1);
        int i8 = e02.f15356c;
        e02.f15356c = i8 + 1;
        e02.f15354a[i8] = (byte) i7;
        this.f15388r++;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(long j7) {
        boolean z7;
        byte[] bArr;
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 == 0) {
            i0(48);
            return;
        }
        int i8 = 1;
        if (i7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                o0("-9223372036854775808");
                return;
            }
            z7 = true;
        } else {
            z7 = false;
        }
        if (j7 < 100000000) {
            if (j7 < 10000) {
                if (j7 < 100) {
                    if (j7 >= 10) {
                        i8 = 2;
                    }
                } else if (j7 < 1000) {
                    i8 = 3;
                } else {
                    i8 = 4;
                }
            } else if (j7 < 1000000) {
                if (j7 < 100000) {
                    i8 = 5;
                } else {
                    i8 = 6;
                }
            } else if (j7 < 10000000) {
                i8 = 7;
            } else {
                i8 = 8;
            }
        } else if (j7 < 1000000000000L) {
            if (j7 < 10000000000L) {
                if (j7 < 1000000000) {
                    i8 = 9;
                } else {
                    i8 = 10;
                }
            } else if (j7 < 100000000000L) {
                i8 = 11;
            } else {
                i8 = 12;
            }
        } else if (j7 < 1000000000000000L) {
            if (j7 < 10000000000000L) {
                i8 = 13;
            } else if (j7 < 100000000000000L) {
                i8 = 14;
            } else {
                i8 = 15;
            }
        } else if (j7 < 100000000000000000L) {
            if (j7 < 10000000000000000L) {
                i8 = 16;
            } else {
                i8 = 17;
            }
        } else if (j7 < 1000000000000000000L) {
            i8 = 18;
        } else {
            i8 = 19;
        }
        if (z7) {
            i8++;
        }
        A e02 = e0(i8);
        int i9 = e02.f15356c + i8;
        while (true) {
            int i10 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
            bArr = e02.f15354a;
            if (i10 == 0) {
                break;
            }
            long j8 = 10;
            i9--;
            bArr[i9] = w6.g.f16122a[(int) (j7 % j8)];
            j7 /= j8;
        }
        if (z7) {
            bArr[i9 - 1] = 45;
        }
        e02.f15356c += i8;
        this.f15388r += i8;
    }

    @Override // v6.InterfaceC1342g
    public final /* bridge */ /* synthetic */ InterfaceC1342g k(long j7) {
        k0(j7);
        return this;
    }

    public final void k0(long j7) {
        if (j7 == 0) {
            i0(48);
            return;
        }
        long j8 = (j7 >>> 1) | j7;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i7 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        A e02 = e0(i7);
        int i8 = e02.f15356c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            e02.f15354a[i9] = w6.g.f16122a[(int) (15 & j7)];
            j7 >>>= 4;
        }
        e02.f15356c += i7;
        this.f15388r += i7;
    }

    @Override // v6.InterfaceC1343h
    public final C1344i l(long j7) {
        if (j7 >= 0 && j7 <= 2147483647L) {
            if (this.f15388r >= j7) {
                if (j7 >= 4096) {
                    C1344i d02 = d0((int) j7);
                    p(j7);
                    return d02;
                }
                return new C1344i(Y(j7));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "byteCount: ").toString());
    }

    public final void l0(int i7) {
        A e02 = e0(4);
        int i8 = e02.f15356c;
        byte[] bArr = e02.f15354a;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        e02.f15356c = i8 + 4;
        this.f15388r += 4;
    }

    @Override // v6.InterfaceC1343h
    public final long m() {
        long j7;
        if (this.f15388r >= 8) {
            A a7 = this.f15387q;
            M5.g.c(a7);
            int i7 = a7.f15355b;
            int i8 = a7.f15356c;
            if (i8 - i7 < 8) {
                j7 = ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            } else {
                byte[] bArr = a7.f15354a;
                long j8 = ((bArr[i7] & 255) << 56) | ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7 + 2] & 255) << 40);
                int i9 = i7 + 7;
                int i10 = i7 + 8;
                long j9 = j8 | ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7 + 4] & 255) << 24) | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8) | (bArr[i9] & 255);
                this.f15388r -= 8;
                if (i10 == i8) {
                    this.f15387q = a7.a();
                    B.a(a7);
                } else {
                    a7.f15355b = i10;
                }
                j7 = j9;
            }
            return ((j7 & 255) << 56) | (((-72057594037927936L) & j7) >>> 56) | ((71776119061217280L & j7) >>> 40) | ((280375465082880L & j7) >>> 24) | ((1095216660480L & j7) >>> 8) | ((4278190080L & j7) << 8) | ((16711680 & j7) << 24) | ((65280 & j7) << 40);
        }
        throw new EOFException();
    }

    public final void m0(int i7) {
        A e02 = e0(2);
        int i8 = e02.f15356c;
        byte[] bArr = e02.f15354a;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 1] = (byte) (i7 & 255);
        e02.f15356c = i8 + 2;
        this.f15388r += 2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v6.f] */
    /* renamed from: n */
    public final C1341f clone() {
        ?? obj = new Object();
        if (this.f15388r != 0) {
            A a7 = this.f15387q;
            M5.g.c(a7);
            A c5 = a7.c();
            obj.f15387q = c5;
            c5.f15358g = c5;
            c5.f = c5;
            for (A a8 = a7.f; a8 != a7; a8 = a8.f) {
                A a9 = c5.f15358g;
                M5.g.c(a9);
                M5.g.c(a8);
                a9.b(a8.c());
            }
            obj.f15388r = this.f15388r;
        }
        return obj;
    }

    public final void n0(int i7, int i8, String str) {
        char charAt;
        long j7;
        long j8;
        char c5;
        M5.g.f(str, "string");
        if (i7 >= 0) {
            if (i8 >= i7) {
                if (i8 <= str.length()) {
                    while (i7 < i8) {
                        char charAt2 = str.charAt(i7);
                        if (charAt2 < 128) {
                            A e02 = e0(1);
                            int i9 = e02.f15356c - i7;
                            int min = Math.min(i8, 8192 - i9);
                            int i10 = i7 + 1;
                            byte[] bArr = e02.f15354a;
                            bArr[i7 + i9] = (byte) charAt2;
                            while (true) {
                                i7 = i10;
                                if (i7 >= min || (charAt = str.charAt(i7)) >= 128) {
                                    break;
                                }
                                i10 = i7 + 1;
                                bArr[i7 + i9] = (byte) charAt;
                            }
                            int i11 = e02.f15356c;
                            int i12 = (i9 + i7) - i11;
                            e02.f15356c = i11 + i12;
                            this.f15388r += i12;
                        } else {
                            if (charAt2 < 2048) {
                                A e03 = e0(2);
                                int i13 = e03.f15356c;
                                byte[] bArr2 = e03.f15354a;
                                bArr2[i13] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                                e03.f15356c = i13 + 2;
                                j7 = this.f15388r;
                                j8 = 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i14 = i7 + 1;
                                if (i14 < i8) {
                                    c5 = str.charAt(i14);
                                } else {
                                    c5 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c5 && c5 < 57344) {
                                    int i15 = (((charAt2 & 1023) << 10) | (c5 & 1023)) + 65536;
                                    A e04 = e0(4);
                                    int i16 = e04.f15356c;
                                    byte[] bArr3 = e04.f15354a;
                                    bArr3[i16] = (byte) ((i15 >> 18) | 240);
                                    bArr3[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                                    bArr3[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                                    bArr3[i16 + 3] = (byte) ((i15 & 63) | 128);
                                    e04.f15356c = i16 + 4;
                                    this.f15388r += 4;
                                    i7 += 2;
                                } else {
                                    i0(63);
                                    i7 = i14;
                                }
                            } else {
                                A e05 = e0(3);
                                int i17 = e05.f15356c;
                                byte[] bArr4 = e05.f15354a;
                                bArr4[i17] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                                e05.f15356c = i17 + 3;
                                j7 = this.f15388r;
                                j8 = 3;
                            }
                            this.f15388r = j7 + j8;
                            i7++;
                        }
                    }
                    return;
                }
                StringBuilder o7 = AbstractC0515y1.o(i8, "endIndex > string.length: ", " > ");
                o7.append(str.length());
                throw new IllegalArgumentException(o7.toString().toString());
            }
            throw new IllegalArgumentException(AbstractC1111a.m(i8, i7, "endIndex < beginIndex: ", " < ").toString());
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("beginIndex < 0: ", i7).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, v6.f] */
    @Override // v6.InterfaceC1343h
    public final String o(long j7) {
        if (j7 >= 0) {
            long j8 = Long.MAX_VALUE;
            if (j7 != Long.MAX_VALUE) {
                j8 = j7 + 1;
            }
            long O5 = O((byte) 10, 0L, j8);
            if (O5 != -1) {
                return w6.g.b(this, O5);
            }
            if (j8 < this.f15388r && y(j8 - 1) == 13 && y(j8) == 10) {
                return w6.g.b(this, j8);
            }
            ?? obj = new Object();
            x(obj, 0L, Math.min(32, this.f15388r));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f15388r, j7) + " content=" + obj.l(obj.f15388r).e() + (char) 8230);
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "limit < 0: ").toString());
    }

    public final void o0(String str) {
        M5.g.f(str, "string");
        n0(0, str.length(), str);
    }

    @Override // v6.InterfaceC1343h
    public final void p(long j7) {
        while (j7 > 0) {
            A a7 = this.f15387q;
            if (a7 != null) {
                int min = (int) Math.min(j7, a7.f15356c - a7.f15355b);
                long j8 = min;
                this.f15388r -= j8;
                j7 -= j8;
                int i7 = a7.f15355b + min;
                a7.f15355b = i7;
                if (i7 == a7.f15356c) {
                    this.f15387q = a7.a();
                    B.a(a7);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final void p0(int i7) {
        String str;
        long j7;
        long j8;
        int i8 = 0;
        if (i7 < 128) {
            i0(i7);
            return;
        }
        if (i7 < 2048) {
            A e02 = e0(2);
            int i9 = e02.f15356c;
            byte[] bArr = e02.f15354a;
            bArr[i9] = (byte) ((i7 >> 6) | 192);
            bArr[1 + i9] = (byte) ((i7 & 63) | 128);
            e02.f15356c = i9 + 2;
            j7 = this.f15388r;
            j8 = 2;
        } else if (55296 <= i7 && i7 < 57344) {
            i0(63);
            return;
        } else if (i7 < 65536) {
            A e03 = e0(3);
            int i10 = e03.f15356c;
            byte[] bArr2 = e03.f15354a;
            bArr2[i10] = (byte) ((i7 >> 12) | 224);
            bArr2[1 + i10] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[2 + i10] = (byte) ((i7 & 63) | 128);
            e03.f15356c = i10 + 3;
            j7 = this.f15388r;
            j8 = 3;
        } else if (i7 <= 1114111) {
            A e04 = e0(4);
            int i11 = e04.f15356c;
            byte[] bArr3 = e04.f15354a;
            bArr3[i11] = (byte) ((i7 >> 18) | 240);
            bArr3[1 + i11] = (byte) (((i7 >> 12) & 63) | 128);
            bArr3[2 + i11] = (byte) (((i7 >> 6) & 63) | 128);
            bArr3[3 + i11] = (byte) ((i7 & 63) | 128);
            e04.f15356c = i11 + 4;
            j7 = this.f15388r;
            j8 = 4;
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
            if (i7 != 0) {
                char[] cArr = w6.h.f16123a;
                char[] cArr2 = {cArr[(i7 >> 28) & 15], cArr[(i7 >> 24) & 15], cArr[(i7 >> 20) & 15], cArr[(i7 >> 16) & 15], cArr[(i7 >> 12) & 15], cArr[(i7 >> 8) & 15], cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
                while (i8 < 8 && cArr2[i8] == '0') {
                    i8++;
                }
                if (i8 >= 0) {
                    if (i8 <= 8) {
                        str = new String(cArr2, i8, 8 - i8);
                    } else {
                        throw new IllegalArgumentException(AbstractC1111a.n(i8, "startIndex: ", " > endIndex: 8"));
                    }
                } else {
                    throw new IndexOutOfBoundsException(AbstractC1111a.n(i8, "startIndex: ", ", endIndex: 8, size: 8"));
                }
            } else {
                str = "0";
            }
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f15388r = j7 + j8;
    }

    @Override // v6.InterfaceC1342g
    public final /* bridge */ /* synthetic */ InterfaceC1342g q(int i7, int i8, String str) {
        n0(i7, i8, str);
        return this;
    }

    public final long r() {
        long j7 = this.f15388r;
        if (j7 == 0) {
            return 0L;
        }
        A a7 = this.f15387q;
        M5.g.c(a7);
        A a8 = a7.f15358g;
        M5.g.c(a8);
        int i7 = a8.f15356c;
        if (i7 < 8192 && a8.f15357e) {
            j7 -= i7 - a8.f15355b;
        }
        return j7;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        M5.g.f(byteBuffer, "sink");
        A a7 = this.f15387q;
        if (a7 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), a7.f15356c - a7.f15355b);
        byteBuffer.put(a7.f15354a, a7.f15355b, min);
        int i7 = a7.f15355b + min;
        a7.f15355b = i7;
        this.f15388r -= min;
        if (i7 == a7.f15356c) {
            this.f15387q = a7.a();
            B.a(a7);
        }
        return min;
    }

    @Override // v6.InterfaceC1343h
    public final byte readByte() {
        if (this.f15388r != 0) {
            A a7 = this.f15387q;
            M5.g.c(a7);
            int i7 = a7.f15355b;
            int i8 = a7.f15356c;
            int i9 = i7 + 1;
            byte b7 = a7.f15354a[i7];
            this.f15388r--;
            if (i9 == i8) {
                this.f15387q = a7.a();
                B.a(a7);
            } else {
                a7.f15355b = i9;
            }
            return b7;
        }
        throw new EOFException();
    }

    @Override // v6.InterfaceC1343h
    public final int readInt() {
        if (this.f15388r >= 4) {
            A a7 = this.f15387q;
            M5.g.c(a7);
            int i7 = a7.f15355b;
            int i8 = a7.f15356c;
            if (i8 - i7 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = a7.f15354a;
            int i9 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24);
            int i10 = i7 + 3;
            int i11 = i7 + 4;
            int i12 = i9 | ((bArr[i7 + 2] & 255) << 8) | (bArr[i10] & 255);
            this.f15388r -= 4;
            if (i11 == i8) {
                this.f15387q = a7.a();
                B.a(a7);
            } else {
                a7.f15355b = i11;
            }
            return i12;
        }
        throw new EOFException();
    }

    @Override // v6.InterfaceC1343h
    public final short readShort() {
        if (this.f15388r >= 2) {
            A a7 = this.f15387q;
            M5.g.c(a7);
            int i7 = a7.f15355b;
            int i8 = a7.f15356c;
            if (i8 - i7 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i9 = i7 + 1;
            byte[] bArr = a7.f15354a;
            int i10 = i7 + 2;
            int i11 = (bArr[i9] & 255) | ((bArr[i7] & 255) << 8);
            this.f15388r -= 2;
            if (i10 == i8) {
                this.f15387q = a7.a();
                B.a(a7);
            } else {
                a7.f15355b = i10;
            }
            return (short) i11;
        }
        throw new EOFException();
    }

    @Override // v6.InterfaceC1342g
    public final /* bridge */ /* synthetic */ InterfaceC1342g s(int i7) {
        m0(i7);
        return this;
    }

    @Override // v6.InterfaceC1343h
    public final boolean t(long j7) {
        if (this.f15388r >= j7) {
            return true;
        }
        return false;
    }

    public final String toString() {
        long j7 = this.f15388r;
        if (j7 <= 2147483647L) {
            return d0((int) j7).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f15388r).toString());
    }

    @Override // v6.InterfaceC1343h
    public final long u(C1344i c1344i) {
        M5.g.f(c1344i, "targetBytes");
        return W(c1344i, 0L);
    }

    @Override // v6.D
    public final void v(C1341f c1341f, long j7) {
        A a7;
        A a8;
        A b7;
        int i7;
        M5.g.f(c1341f, "source");
        if (c1341f != this) {
            AbstractC0189a.m(c1341f.f15388r, 0L, j7);
            while (j7 > 0) {
                A a9 = c1341f.f15387q;
                M5.g.c(a9);
                int i8 = a9.f15356c;
                M5.g.c(c1341f.f15387q);
                int i9 = (j7 > (i8 - a7.f15355b) ? 1 : (j7 == (i8 - a7.f15355b) ? 0 : -1));
                int i10 = 0;
                if (i9 < 0) {
                    A a10 = this.f15387q;
                    if (a10 != null) {
                        a8 = a10.f15358g;
                    } else {
                        a8 = null;
                    }
                    if (a8 != null && a8.f15357e) {
                        long j8 = a8.f15356c + j7;
                        if (a8.d) {
                            i7 = 0;
                        } else {
                            i7 = a8.f15355b;
                        }
                        if (j8 - i7 <= 8192) {
                            A a11 = c1341f.f15387q;
                            M5.g.c(a11);
                            a11.d(a8, (int) j7);
                            c1341f.f15388r -= j7;
                            this.f15388r += j7;
                            return;
                        }
                    }
                    A a12 = c1341f.f15387q;
                    M5.g.c(a12);
                    int i11 = (int) j7;
                    if (i11 > 0 && i11 <= a12.f15356c - a12.f15355b) {
                        if (i11 >= 1024) {
                            b7 = a12.c();
                        } else {
                            b7 = B.b();
                            int i12 = a12.f15355b;
                            A5.j.O(0, i12, i12 + i11, a12.f15354a, b7.f15354a);
                        }
                        b7.f15356c = b7.f15355b + i11;
                        a12.f15355b += i11;
                        A a13 = a12.f15358g;
                        M5.g.c(a13);
                        a13.b(b7);
                        c1341f.f15387q = b7;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                A a14 = c1341f.f15387q;
                M5.g.c(a14);
                long j9 = a14.f15356c - a14.f15355b;
                c1341f.f15387q = a14.a();
                A a15 = this.f15387q;
                if (a15 == null) {
                    this.f15387q = a14;
                    a14.f15358g = a14;
                    a14.f = a14;
                } else {
                    A a16 = a15.f15358g;
                    M5.g.c(a16);
                    a16.b(a14);
                    A a17 = a14.f15358g;
                    if (a17 != a14) {
                        M5.g.c(a17);
                        if (a17.f15357e) {
                            int i13 = a14.f15356c - a14.f15355b;
                            A a18 = a14.f15358g;
                            M5.g.c(a18);
                            int i14 = 8192 - a18.f15356c;
                            A a19 = a14.f15358g;
                            M5.g.c(a19);
                            if (!a19.d) {
                                A a20 = a14.f15358g;
                                M5.g.c(a20);
                                i10 = a20.f15355b;
                            }
                            if (i13 <= i14 + i10) {
                                A a21 = a14.f15358g;
                                M5.g.c(a21);
                                a14.d(a21, i13);
                                a14.a();
                                B.a(a14);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                c1341f.f15388r -= j9;
                this.f15388r += j9;
                j7 -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // v6.InterfaceC1342g
    public final /* bridge */ /* synthetic */ InterfaceC1342g w(int i7) {
        l0(i7);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        M5.g.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i7 = remaining;
        while (i7 > 0) {
            A e02 = e0(1);
            int min = Math.min(i7, 8192 - e02.f15356c);
            byteBuffer.get(e02.f15354a, e02.f15356c, min);
            i7 -= min;
            e02.f15356c += min;
        }
        this.f15388r += remaining;
        return remaining;
    }

    public final void x(C1341f c1341f, long j7, long j8) {
        M5.g.f(c1341f, "out");
        AbstractC0189a.m(this.f15388r, j7, j8);
        if (j8 != 0) {
            c1341f.f15388r += j8;
            A a7 = this.f15387q;
            while (true) {
                M5.g.c(a7);
                long j9 = a7.f15356c - a7.f15355b;
                if (j7 < j9) {
                    break;
                }
                j7 -= j9;
                a7 = a7.f;
            }
            while (j8 > 0) {
                M5.g.c(a7);
                A c5 = a7.c();
                int i7 = c5.f15355b + ((int) j7);
                c5.f15355b = i7;
                c5.f15356c = Math.min(i7 + ((int) j8), c5.f15356c);
                A a8 = c1341f.f15387q;
                if (a8 == null) {
                    c5.f15358g = c5;
                    c5.f = c5;
                    c1341f.f15387q = c5;
                } else {
                    A a9 = a8.f15358g;
                    M5.g.c(a9);
                    a9.b(c5);
                }
                j8 -= c5.f15356c - c5.f15355b;
                a7 = a7.f;
                j7 = 0;
            }
        }
    }

    public final byte y(long j7) {
        AbstractC0189a.m(this.f15388r, j7, 1L);
        A a7 = this.f15387q;
        if (a7 != null) {
            long j8 = this.f15388r;
            if (j8 - j7 < j7) {
                while (j8 > j7) {
                    a7 = a7.f15358g;
                    M5.g.c(a7);
                    j8 -= a7.f15356c - a7.f15355b;
                }
                return a7.f15354a[(int) ((a7.f15355b + j7) - j8)];
            }
            long j9 = 0;
            while (true) {
                int i7 = a7.f15356c;
                int i8 = a7.f15355b;
                long j10 = (i7 - i8) + j9;
                if (j10 <= j7) {
                    a7 = a7.f;
                    M5.g.c(a7);
                    j9 = j10;
                } else {
                    return a7.f15354a[(int) ((i8 + j7) - j9)];
                }
            }
        } else {
            M5.g.c(null);
            throw null;
        }
    }

    @Override // v6.InterfaceC1343h
    public final int z(u uVar) {
        M5.g.f(uVar, "options");
        int c5 = w6.g.c(this, uVar, false);
        if (c5 == -1) {
            return -1;
        }
        p(uVar.f15414q[c5].d());
        return c5;
    }

    @Override // v6.InterfaceC1343h, v6.InterfaceC1342g
    public final C1341f c() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, v6.D
    public final void close() {
    }

    @Override // v6.InterfaceC1342g, v6.D, java.io.Flushable
    public final void flush() {
    }
}
