package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.measurement.d2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412d2 extends AbstractC0447k2 {
    public static final Logger f = Logger.getLogger(C0412d2.class.getName());

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f8535g = Q2.f8401e;

    /* renamed from: b  reason: collision with root package name */
    public C0516y2 f8536b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f8537c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public int f8538e;

    public C0412d2(int i7, byte[] bArr) {
        if (((bArr.length - i7) | i7) >= 0) {
            this.f8537c = bArr;
            this.f8538e = 0;
            this.d = i7;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i7)));
    }

    public static int A(long j7, int i7) {
        return z(j7) + F(i7 << 3);
    }

    public static int B(int i7) {
        return F(i7 << 3);
    }

    public static int C(int i7, int i8) {
        return F(i8) + F(i7 << 3);
    }

    public static int F(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int e(int i7) {
        return F(i7 << 3) + 4;
    }

    public static int f(int i7, int i8) {
        return z(i8) + F(i7 << 3);
    }

    public static int g(int i7, V1 v12, L2 l22) {
        return v12.a(l22) + (F(i7 << 3) << 1);
    }

    public static int h(int i7, C0407c2 c0407c2) {
        int F = F(i7 << 3);
        int h7 = c0407c2.h();
        return F(h7) + h7 + F;
    }

    public static int i(String str) {
        int length;
        try {
            length = R2.a(str);
        } catch (S2 unused) {
            length = str.getBytes(AbstractC0467o2.f8631a).length;
        }
        return F(length) + length;
    }

    public static int j(String str, int i7) {
        return i(str) + F(i7 << 3);
    }

    public static int l(int i7) {
        return F(i7 << 3) + 1;
    }

    public static int m(int i7) {
        return F(i7 << 3) + 8;
    }

    public static int n(int i7) {
        return F(i7 << 3) + 8;
    }

    public static int p(int i7) {
        return F(i7 << 3) + 4;
    }

    public static int q(long j7, int i7) {
        return z(j7) + F(i7 << 3);
    }

    public static int t(int i7) {
        return F(i7 << 3) + 8;
    }

    public static int u(int i7, int i8) {
        return z(i8) + F(i7 << 3);
    }

    public static int w(int i7) {
        return F(i7 << 3) + 4;
    }

    public static int x(long j7, int i7) {
        return z((j7 >> 63) ^ (j7 << 1)) + F(i7 << 3);
    }

    public static int y(int i7, int i8) {
        return F((i8 >> 31) ^ (i8 << 1)) + F(i7 << 3);
    }

    public static int z(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public final void D(long j7) {
        try {
            byte[] bArr = this.f8537c;
            int i7 = this.f8538e;
            bArr[i7] = (byte) j7;
            bArr[i7 + 1] = (byte) (j7 >> 8);
            bArr[i7 + 2] = (byte) (j7 >> 16);
            bArr[i7 + 3] = (byte) (j7 >> 24);
            bArr[i7 + 4] = (byte) (j7 >> 32);
            bArr[i7 + 5] = (byte) (j7 >> 40);
            bArr[i7 + 6] = (byte) (j7 >> 48);
            this.f8538e = i7 + 8;
            bArr[i7 + 7] = (byte) (j7 >> 56);
        } catch (IndexOutOfBoundsException e3) {
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8538e), Integer.valueOf(this.d), 1), e3, 6);
        }
    }

    public final void E(long j7, int i7) {
        M(i7, 1);
        D(j7);
    }

    public final void G(int i7, int i8) {
        M(i7, 5);
        H(i8);
    }

    public final void H(int i7) {
        try {
            byte[] bArr = this.f8537c;
            int i8 = this.f8538e;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            this.f8538e = i8 + 4;
            bArr[i8 + 3] = (byte) (i7 >>> 24);
        } catch (IndexOutOfBoundsException e3) {
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8538e), Integer.valueOf(this.d), 1), e3, 6);
        }
    }

    public final void I(int i7, int i8) {
        M(i7, 0);
        L(i8);
    }

    public final void J(long j7) {
        boolean z7 = f8535g;
        byte[] bArr = this.f8537c;
        if (z7 && o() >= 10) {
            while ((j7 & (-128)) != 0) {
                int i7 = this.f8538e;
                this.f8538e = i7 + 1;
                Q2.f8400c.c(bArr, Q2.f + i7, (byte) (((int) j7) | 128));
                j7 >>>= 7;
            }
            int i8 = this.f8538e;
            this.f8538e = 1 + i8;
            Q2.f8400c.c(bArr, Q2.f + i8, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            try {
                int i9 = this.f8538e;
                this.f8538e = i9 + 1;
                bArr[i9] = (byte) (((int) j7) | 128);
                j7 >>>= 7;
            } catch (IndexOutOfBoundsException e3) {
                throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8538e), Integer.valueOf(this.d), 1), e3, 6);
            }
        }
        int i10 = this.f8538e;
        this.f8538e = i10 + 1;
        bArr[i10] = (byte) j7;
    }

    public final void K(long j7, int i7) {
        M(i7, 0);
        J(j7);
    }

    public final void L(int i7) {
        if (i7 >= 0) {
            N(i7);
        } else {
            J(i7);
        }
    }

    public final void M(int i7, int i8) {
        N((i7 << 3) | i8);
    }

    public final void N(int i7) {
        while (true) {
            int i8 = i7 & (-128);
            byte[] bArr = this.f8537c;
            if (i8 == 0) {
                int i9 = this.f8538e;
                this.f8538e = i9 + 1;
                bArr[i9] = (byte) i7;
                return;
            }
            try {
                int i10 = this.f8538e;
                this.f8538e = i10 + 1;
                bArr[i10] = (byte) (i7 | 128);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e3) {
                throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8538e), Integer.valueOf(this.d), 1), e3, 6);
            }
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8538e), Integer.valueOf(this.d), 1), e3, 6);
        }
    }

    public final void O(int i7, int i8) {
        M(i7, 0);
        N(i8);
    }

    public final void k(byte b7) {
        try {
            byte[] bArr = this.f8537c;
            int i7 = this.f8538e;
            this.f8538e = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e3) {
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8538e), Integer.valueOf(this.d), 1), e3, 6);
        }
    }

    public final int o() {
        return this.d - this.f8538e;
    }

    public final void r(C0407c2 c0407c2) {
        N(c0407c2.h());
        v(c0407c2.f8529r, c0407c2.l(), c0407c2.h());
    }

    public final void s(String str) {
        int i7 = this.f8538e;
        try {
            int F = F(str.length() * 3);
            int F4 = F(str.length());
            byte[] bArr = this.f8537c;
            if (F4 == F) {
                int i8 = i7 + F4;
                this.f8538e = i8;
                int b7 = R2.b(str, bArr, i8, o());
                this.f8538e = i7;
                N((b7 - i7) - F4);
                this.f8538e = b7;
                return;
            }
            N(R2.a(str));
            this.f8538e = R2.b(str, bArr, this.f8538e, o());
        } catch (S2 e3) {
            this.f8538e = i7;
            f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC0467o2.f8631a);
            try {
                N(bytes.length);
                v(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e7) {
                throw new H1.d(e7);
            }
        } catch (IndexOutOfBoundsException e8) {
            throw new H1.d(e8);
        }
    }

    public final void v(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, i7, this.f8537c, this.f8538e, i8);
            this.f8538e += i8;
        } catch (IndexOutOfBoundsException e3) {
            throw new H1.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8538e), Integer.valueOf(this.d), Integer.valueOf(i8)), e3, 6);
        }
    }
}
