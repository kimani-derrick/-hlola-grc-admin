package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.crypto.tink.shaded.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533k extends h4.b {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f9138e = Logger.getLogger(C0533k.class.getName());
    public static final boolean f = n0.f9150e;

    /* renamed from: a  reason: collision with root package name */
    public K f9139a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f9140b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9141c;
    public int d;

    public C0533k(int i7, byte[] bArr) {
        if (((bArr.length - i7) | i7) >= 0) {
            this.f9140b = bArr;
            this.d = 0;
            this.f9141c = i7;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i7)));
    }

    public static int J(int i7) {
        return b0(i7) + 1;
    }

    public static int K(int i7, AbstractC0530h abstractC0530h) {
        return L(abstractC0530h) + b0(i7);
    }

    public static int L(AbstractC0530h abstractC0530h) {
        int size = abstractC0530h.size();
        return d0(size) + size;
    }

    public static int M(int i7) {
        return b0(i7) + 8;
    }

    public static int N(int i7, int i8) {
        return T(i8) + b0(i7);
    }

    public static int O(int i7) {
        return b0(i7) + 4;
    }

    public static int P(int i7) {
        return b0(i7) + 8;
    }

    public static int Q(int i7) {
        return b0(i7) + 4;
    }

    public static int R(int i7, AbstractC0523a abstractC0523a, b0 b0Var) {
        return abstractC0523a.a(b0Var) + (b0(i7) * 2);
    }

    public static int S(int i7, int i8) {
        return T(i8) + b0(i7);
    }

    public static int T(int i7) {
        if (i7 >= 0) {
            return d0(i7);
        }
        return 10;
    }

    public static int U(long j7, int i7) {
        return f0(j7) + b0(i7);
    }

    public static int V(int i7) {
        return b0(i7) + 4;
    }

    public static int W(int i7) {
        return b0(i7) + 8;
    }

    public static int X(int i7, int i8) {
        return d0((i8 >> 31) ^ (i8 << 1)) + b0(i7);
    }

    public static int Y(long j7, int i7) {
        return f0((j7 >> 63) ^ (j7 << 1)) + b0(i7);
    }

    public static int Z(String str, int i7) {
        return a0(str) + b0(i7);
    }

    public static int a0(String str) {
        int length;
        try {
            length = q0.b(str);
        } catch (p0 unused) {
            length = str.getBytes(AbstractC0547z.f9165a).length;
        }
        return d0(length) + length;
    }

    public static int b0(int i7) {
        return d0(i7 << 3);
    }

    public static int c0(int i7, int i8) {
        return d0(i8) + b0(i7);
    }

    public static int d0(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        if ((i7 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int e0(long j7, int i7) {
        return f0(j7) + b0(i7);
    }

    public static int f0(long j7) {
        int i7;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i7 += 2;
            j7 >>>= 14;
        }
        if ((j7 & (-16384)) != 0) {
            return i7 + 1;
        }
        return i7;
    }

    public final void g0(byte b7) {
        try {
            byte[] bArr = this.f9140b;
            int i7 = this.d;
            this.d = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e3) {
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f9141c), 1), e3, 7);
        }
    }

    public final void h0(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, i7, this.f9140b, this.d, i8);
            this.d += i8;
        } catch (IndexOutOfBoundsException e3) {
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f9141c), Integer.valueOf(i8)), e3, 7);
        }
    }

    public final void i0(AbstractC0530h abstractC0530h) {
        q0(abstractC0530h.size());
        C0529g c0529g = (C0529g) abstractC0530h;
        h0(c0529g.f9116t, c0529g.n(), c0529g.size());
    }

    public final void j0(int i7, int i8) {
        p0(i7, 5);
        k0(i8);
    }

    public final void k0(int i7) {
        try {
            byte[] bArr = this.f9140b;
            int i8 = this.d;
            bArr[i8] = (byte) (i7 & 255);
            bArr[i8 + 1] = (byte) ((i7 >> 8) & 255);
            bArr[i8 + 2] = (byte) ((i7 >> 16) & 255);
            this.d = i8 + 4;
            bArr[i8 + 3] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f9141c), 1), e3, 7);
        }
    }

    public final void l0(long j7, int i7) {
        p0(i7, 1);
        m0(j7);
    }

    public final void m0(long j7) {
        try {
            byte[] bArr = this.f9140b;
            int i7 = this.d;
            bArr[i7] = (byte) (((int) j7) & 255);
            bArr[i7 + 1] = (byte) (((int) (j7 >> 8)) & 255);
            bArr[i7 + 2] = (byte) (((int) (j7 >> 16)) & 255);
            bArr[i7 + 3] = (byte) (((int) (j7 >> 24)) & 255);
            bArr[i7 + 4] = (byte) (((int) (j7 >> 32)) & 255);
            bArr[i7 + 5] = (byte) (((int) (j7 >> 40)) & 255);
            bArr[i7 + 6] = (byte) (((int) (j7 >> 48)) & 255);
            this.d = i7 + 8;
            bArr[i7 + 7] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f9141c), 1), e3, 7);
        }
    }

    public final void n0(int i7) {
        if (i7 >= 0) {
            q0(i7);
        } else {
            s0(i7);
        }
    }

    public final void o0(String str) {
        int i7;
        int i8 = this.d;
        try {
            int d02 = d0(str.length() * 3);
            int d03 = d0(str.length());
            int i9 = this.f9141c;
            byte[] bArr = this.f9140b;
            if (d03 == d02) {
                int i10 = i8 + d03;
                this.d = i10;
                i7 = q0.f9160a.i(str, bArr, i10, i9 - i10);
                this.d = i8;
                q0((i7 - i8) - d03);
            } else {
                q0(q0.b(str));
                int i11 = this.d;
                i7 = q0.f9160a.i(str, bArr, i11, i9 - i11);
            }
            this.d = i7;
        } catch (p0 e3) {
            this.d = i8;
            f9138e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC0547z.f9165a);
            try {
                q0(bytes.length);
                h0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e7) {
                throw new H1.d(e7);
            }
        } catch (IndexOutOfBoundsException e8) {
            throw new H1.d(e8);
        }
    }

    public final void p0(int i7, int i8) {
        q0((i7 << 3) | i8);
    }

    public final void q0(int i7) {
        while (true) {
            int i8 = i7 & (-128);
            byte[] bArr = this.f9140b;
            if (i8 == 0) {
                int i9 = this.d;
                this.d = i9 + 1;
                bArr[i9] = (byte) i7;
                return;
            }
            try {
                int i10 = this.d;
                this.d = i10 + 1;
                bArr[i10] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e3) {
                throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f9141c), 1), e3, 7);
            }
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f9141c), 1), e3, 7);
        }
    }

    public final void r0(long j7, int i7) {
        p0(i7, 0);
        s0(j7);
    }

    public final void s0(long j7) {
        boolean z7 = f;
        int i7 = this.f9141c;
        byte[] bArr = this.f9140b;
        if (z7 && i7 - this.d >= 10) {
            while ((j7 & (-128)) != 0) {
                int i8 = this.d;
                this.d = i8 + 1;
                n0.o(bArr, i8, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            int i9 = this.d;
            this.d = 1 + i9;
            n0.o(bArr, i9, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            try {
                int i10 = this.d;
                this.d = i10 + 1;
                bArr[i10] = (byte) ((((int) j7) & 127) | 128);
                j7 >>>= 7;
            } catch (IndexOutOfBoundsException e3) {
                throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i7), 1), e3, 7);
            }
        }
        int i11 = this.d;
        this.d = i11 + 1;
        bArr[i11] = (byte) j7;
    }
}
