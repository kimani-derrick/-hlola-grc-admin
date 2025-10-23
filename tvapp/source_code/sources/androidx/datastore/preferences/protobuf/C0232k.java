package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: androidx.datastore.preferences.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232k extends Q {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f5791h = Logger.getLogger(C0232k.class.getName());

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f5792i = s0.f;

    /* renamed from: c  reason: collision with root package name */
    public K f5793c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5794e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final OutputStream f5795g;

    public C0232k(V.p pVar, int i7) {
        if (i7 >= 0) {
            int max = Math.max(i7, 20);
            this.d = new byte[max];
            this.f5794e = max;
            this.f5795g = pVar;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int A(int i7, AbstractC0220a abstractC0220a, InterfaceC0223b0 interfaceC0223b0) {
        return abstractC0220a.b(interfaceC0223b0) + (K(i7) * 2);
    }

    public static int B(int i7, int i8) {
        return C(i8) + K(i7);
    }

    public static int C(int i7) {
        if (i7 >= 0) {
            return M(i7);
        }
        return 10;
    }

    public static int D(long j7, int i7) {
        return O(j7) + K(i7);
    }

    public static int E(int i7) {
        return K(i7) + 4;
    }

    public static int F(int i7) {
        return K(i7) + 8;
    }

    public static int G(int i7, int i8) {
        return M((i8 >> 31) ^ (i8 << 1)) + K(i7);
    }

    public static int H(long j7, int i7) {
        return O((j7 >> 63) ^ (j7 << 1)) + K(i7);
    }

    public static int I(String str, int i7) {
        return J(str) + K(i7);
    }

    public static int J(String str) {
        int length;
        try {
            length = v0.b(str);
        } catch (u0 unused) {
            length = str.getBytes(AbstractC0246z.f5827a).length;
        }
        return M(length) + length;
    }

    public static int K(int i7) {
        return M(i7 << 3);
    }

    public static int L(int i7, int i8) {
        return M(i8) + K(i7);
    }

    public static int M(int i7) {
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

    public static int N(long j7, int i7) {
        return O(j7) + K(i7);
    }

    public static int O(long j7) {
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

    public static int s(int i7) {
        return K(i7) + 1;
    }

    public static int t(int i7, C0228g c0228g) {
        return u(c0228g) + K(i7);
    }

    public static int u(C0228g c0228g) {
        int size = c0228g.size();
        return M(size) + size;
    }

    public static int v(int i7) {
        return K(i7) + 8;
    }

    public static int w(int i7, int i8) {
        return C(i8) + K(i7);
    }

    public static int x(int i7) {
        return K(i7) + 4;
    }

    public static int y(int i7) {
        return K(i7) + 8;
    }

    public static int z(int i7) {
        return K(i7) + 4;
    }

    public final void P() {
        this.f5795g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void Q(int i7) {
        if (this.f5794e - this.f < i7) {
            P();
        }
    }

    public final void R(String str, u0 u0Var) {
        f5791h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) u0Var);
        byte[] bytes = str.getBytes(AbstractC0246z.f5827a);
        try {
            k0(bytes.length);
            m(bytes, 0, bytes.length);
        } catch (C0231j e3) {
            throw e3;
        } catch (IndexOutOfBoundsException e7) {
            throw new C0231j(e7);
        }
    }

    public final void S(byte b7) {
        if (this.f == this.f5794e) {
            P();
        }
        int i7 = this.f;
        this.f = i7 + 1;
        this.d[i7] = b7;
    }

    public final void T(byte[] bArr, int i7, int i8) {
        int i9 = this.f;
        int i10 = this.f5794e;
        int i11 = i10 - i9;
        byte[] bArr2 = this.d;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i11);
        int i12 = i7 + i11;
        int i13 = i8 - i11;
        this.f = i10;
        P();
        if (i13 > i10) {
            this.f5795g.write(bArr, i12, i13);
            return;
        }
        System.arraycopy(bArr, i12, bArr2, 0, i13);
        this.f = i13;
    }

    public final void U(int i7, boolean z7) {
        Q(11);
        p(i7, 0);
        byte b7 = z7 ? (byte) 1 : (byte) 0;
        int i8 = this.f;
        this.f = i8 + 1;
        this.d[i8] = b7;
    }

    public final void V(int i7, byte[] bArr) {
        k0(i7);
        T(bArr, 0, i7);
    }

    public final void W(int i7, C0228g c0228g) {
        i0(i7, 2);
        X(c0228g);
    }

    public final void X(C0228g c0228g) {
        k0(c0228g.size());
        m(c0228g.f5763r, c0228g.g(), c0228g.size());
    }

    public final void Y(int i7, int i8) {
        Q(14);
        p(i7, 5);
        n(i8);
    }

    public final void Z(int i7) {
        Q(4);
        n(i7);
    }

    public final void a0(long j7, int i7) {
        Q(18);
        p(i7, 1);
        o(j7);
    }

    public final void b0(long j7) {
        Q(8);
        o(j7);
    }

    public final void c0(int i7, int i8) {
        Q(20);
        p(i7, 0);
        if (i8 >= 0) {
            q(i8);
        } else {
            r(i8);
        }
    }

    public final void d0(int i7) {
        if (i7 >= 0) {
            k0(i7);
        } else {
            m0(i7);
        }
    }

    public final void e0(int i7, AbstractC0220a abstractC0220a, InterfaceC0223b0 interfaceC0223b0) {
        i0(i7, 2);
        k0(abstractC0220a.b(interfaceC0223b0));
        interfaceC0223b0.i(abstractC0220a, this.f5793c);
    }

    public final void f0(AbstractC0220a abstractC0220a) {
        k0(abstractC0220a.a());
        abstractC0220a.c(this);
    }

    public final void g0(String str, int i7) {
        i0(i7, 2);
        h0(str);
    }

    public final void h0(String str) {
        try {
            int length = str.length() * 3;
            int M6 = M(length);
            int i7 = M6 + length;
            int i8 = this.f5794e;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int g7 = v0.f5826a.g(str, bArr, 0, length);
                k0(g7);
                T(bArr, 0, g7);
                return;
            }
            if (i7 > i8 - this.f) {
                P();
            }
            int M7 = M(str.length());
            int i9 = this.f;
            byte[] bArr2 = this.d;
            try {
                if (M7 == M6) {
                    int i10 = i9 + M7;
                    this.f = i10;
                    int g8 = v0.f5826a.g(str, bArr2, i10, i8 - i10);
                    this.f = i9;
                    q((g8 - i9) - M7);
                    this.f = g8;
                } else {
                    int b7 = v0.b(str);
                    q(b7);
                    this.f = v0.f5826a.g(str, bArr2, this.f, b7);
                }
            } catch (u0 e3) {
                this.f = i9;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new C0231j(e7);
            }
        } catch (u0 e8) {
            R(str, e8);
        }
    }

    public final void i0(int i7, int i8) {
        k0((i7 << 3) | i8);
    }

    public final void j0(int i7, int i8) {
        Q(20);
        p(i7, 0);
        q(i8);
    }

    public final void k0(int i7) {
        Q(5);
        q(i7);
    }

    public final void l0(long j7, int i7) {
        Q(20);
        p(i7, 0);
        r(j7);
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final void m(byte[] bArr, int i7, int i8) {
        T(bArr, i7, i8);
    }

    public final void m0(long j7) {
        Q(10);
        r(j7);
    }

    public final void n(int i7) {
        int i8 = this.f;
        byte[] bArr = this.d;
        bArr[i8] = (byte) (i7 & 255);
        bArr[i8 + 1] = (byte) ((i7 >> 8) & 255);
        bArr[i8 + 2] = (byte) ((i7 >> 16) & 255);
        this.f = i8 + 4;
        bArr[i8 + 3] = (byte) ((i7 >> 24) & 255);
    }

    public final void o(long j7) {
        int i7 = this.f;
        byte[] bArr = this.d;
        bArr[i7] = (byte) (j7 & 255);
        bArr[i7 + 1] = (byte) ((j7 >> 8) & 255);
        bArr[i7 + 2] = (byte) ((j7 >> 16) & 255);
        bArr[i7 + 3] = (byte) (255 & (j7 >> 24));
        bArr[i7 + 4] = (byte) (((int) (j7 >> 32)) & 255);
        bArr[i7 + 5] = (byte) (((int) (j7 >> 40)) & 255);
        bArr[i7 + 6] = (byte) (((int) (j7 >> 48)) & 255);
        this.f = i7 + 8;
        bArr[i7 + 7] = (byte) (((int) (j7 >> 56)) & 255);
    }

    public final void p(int i7, int i8) {
        q((i7 << 3) | i8);
    }

    public final void q(int i7) {
        boolean z7 = f5792i;
        byte[] bArr = this.d;
        if (z7) {
            while ((i7 & (-128)) != 0) {
                int i8 = this.f;
                this.f = i8 + 1;
                s0.m(bArr, i8, (byte) ((i7 & 127) | 128));
                i7 >>>= 7;
            }
            int i9 = this.f;
            this.f = i9 + 1;
            s0.m(bArr, i9, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i10 = this.f;
            this.f = i10 + 1;
            bArr[i10] = (byte) ((i7 & 127) | 128);
            i7 >>>= 7;
        }
        int i11 = this.f;
        this.f = i11 + 1;
        bArr[i11] = (byte) i7;
    }

    public final void r(long j7) {
        boolean z7 = f5792i;
        byte[] bArr = this.d;
        if (z7) {
            while ((j7 & (-128)) != 0) {
                int i7 = this.f;
                this.f = i7 + 1;
                s0.m(bArr, i7, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            int i8 = this.f;
            this.f = i8 + 1;
            s0.m(bArr, i8, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            int i9 = this.f;
            this.f = i9 + 1;
            bArr[i9] = (byte) ((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        int i10 = this.f;
        this.f = i10 + 1;
        bArr[i10] = (byte) j7;
    }
}
