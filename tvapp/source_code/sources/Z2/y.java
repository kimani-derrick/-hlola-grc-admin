package Z2;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.nio.charset.Charset;
import java.util.Arrays;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class y {
    public static final char[] d = {'\r', '\n'};

    /* renamed from: e  reason: collision with root package name */
    public static final char[] f4690e = {'\n'};
    public static final O3.H f = O3.H.r(5, N3.e.f2495a, N3.e.f2497c, N3.e.f, N3.e.d, N3.e.f2498e);

    /* renamed from: a  reason: collision with root package name */
    public byte[] f4691a;

    /* renamed from: b  reason: collision with root package name */
    public int f4692b;

    /* renamed from: c  reason: collision with root package name */
    public int f4693c;

    public y() {
        this.f4691a = H.f;
    }

    public final long A() {
        int i7;
        int i8;
        byte b7;
        int i9;
        long j7 = this.f4691a[this.f4692b];
        int i10 = 7;
        while (true) {
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j7) != 0) {
                i10--;
            } else if (i10 < 6) {
                j7 &= i9 - 1;
                i8 = 7 - i10;
            } else if (i10 == 7) {
                i8 = 1;
            }
        }
        i8 = 0;
        if (i8 != 0) {
            for (i7 = 1; i7 < i8; i7++) {
                if ((this.f4691a[this.f4692b + i7] & 192) == 128) {
                    j7 = (j7 << 6) | (b7 & 63);
                } else {
                    throw new NumberFormatException(AbstractC1111a.o(j7, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.f4692b += i8;
            return j7;
        }
        throw new NumberFormatException(AbstractC1111a.o(j7, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.f4691a;
            int i7 = this.f4692b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f4692b = i7 + 3;
                return N3.e.f2497c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f4691a;
            int i8 = this.f4692b;
            byte b7 = bArr2[i8];
            if (b7 == -2 && bArr2[i8 + 1] == -1) {
                this.f4692b = i8 + 2;
                return N3.e.d;
            } else if (b7 == -1 && bArr2[i8 + 1] == -2) {
                this.f4692b = i8 + 2;
                return N3.e.f2498e;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void C(int i7) {
        byte[] bArr = this.f4691a;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        D(i7, bArr);
    }

    public final void D(int i7, byte[] bArr) {
        this.f4691a = bArr;
        this.f4693c = i7;
        this.f4692b = 0;
    }

    public final void E(int i7) {
        boolean z7;
        if (i7 >= 0 && i7 <= this.f4691a.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        this.f4693c = i7;
    }

    public final void F(int i7) {
        boolean z7;
        if (i7 >= 0 && i7 <= this.f4693c) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        this.f4692b = i7;
    }

    public final void G(int i7) {
        F(this.f4692b + i7);
    }

    public final int a() {
        return this.f4693c - this.f4692b;
    }

    public final void b(int i7) {
        byte[] bArr = this.f4691a;
        if (i7 > bArr.length) {
            this.f4691a = Arrays.copyOf(bArr, i7);
        }
    }

    public final char c(Charset charset) {
        boolean contains = f.contains(charset);
        AbstractC0156a.e("Unsupported charset: " + charset, contains);
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        boolean z7;
        byte b7;
        int i7;
        byte b8;
        byte b9;
        boolean z8 = false;
        if ((charset.equals(N3.e.f2497c) || charset.equals(N3.e.f2495a)) && a() >= 1) {
            long j7 = this.f4691a[this.f4692b] & 255;
            char c5 = (char) j7;
            if (c5 == j7) {
                z7 = true;
            } else {
                z7 = false;
            }
            android.support.v4.media.session.b.e(j7, "Out of range: %s", z7);
            b7 = (byte) c5;
            i7 = 1;
        } else {
            i7 = 2;
            if ((charset.equals(N3.e.f) || charset.equals(N3.e.d)) && a() >= 2) {
                byte[] bArr = this.f4691a;
                int i8 = this.f4692b;
                b8 = bArr[i8];
                b9 = bArr[i8 + 1];
            } else if (!charset.equals(N3.e.f2498e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f4691a;
                int i9 = this.f4692b;
                b8 = bArr2[i9 + 1];
                b9 = bArr2[i9];
            }
            b7 = (byte) ((char) ((b9 & 255) | (b8 << 8)));
        }
        long j8 = b7;
        char c6 = (char) j8;
        if (c6 == j8) {
            z8 = true;
        }
        android.support.v4.media.session.b.e(j8, "Out of range: %s", z8);
        return (c6 << 16) + i7;
    }

    public final void e(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f4691a, this.f4692b, bArr, i7, i8);
        this.f4692b += i8;
    }

    public final char f(Charset charset, char[] cArr) {
        int d7 = d(charset);
        if (d7 != 0) {
            char c5 = (char) (d7 >> 16);
            for (char c6 : cArr) {
                if (c6 == c5) {
                    this.f4692b += d7 & 65535;
                    return c5;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        int i8 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24);
        this.f4692b = i7 + 4;
        return (bArr[i7 + 3] & 255) | i8 | ((bArr[i7 + 2] & 255) << 8);
    }

    public final String h(Charset charset) {
        int i7;
        boolean contains = f.contains(charset);
        AbstractC0156a.e("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = N3.e.f2495a;
        if (!charset.equals(charset2)) {
            B();
        }
        if (!charset.equals(N3.e.f2497c) && !charset.equals(charset2)) {
            if (!charset.equals(N3.e.f) && !charset.equals(N3.e.f2498e) && !charset.equals(N3.e.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i7 = 2;
        } else {
            i7 = 1;
        }
        int i8 = this.f4692b;
        while (true) {
            int i9 = this.f4693c;
            if (i8 < i9 - (i7 - 1)) {
                if ((charset.equals(N3.e.f2497c) || charset.equals(N3.e.f2495a)) && H.H(this.f4691a[i8])) {
                    break;
                }
                if (charset.equals(N3.e.f) || charset.equals(N3.e.d)) {
                    byte[] bArr = this.f4691a;
                    if (bArr[i8] == 0 && H.H(bArr[i8 + 1])) {
                        break;
                    }
                }
                if (charset.equals(N3.e.f2498e)) {
                    byte[] bArr2 = this.f4691a;
                    if (bArr2[i8 + 1] == 0 && H.H(bArr2[i8])) {
                        break;
                    }
                }
                i8 += i7;
            } else {
                i8 = i9;
                break;
            }
        }
        String s6 = s(i8 - this.f4692b, charset);
        if (this.f4692b == this.f4693c) {
            return s6;
        }
        if (f(charset, d) == '\r') {
            f(charset, f4690e);
        }
        return s6;
    }

    public final int i() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        int i8 = ((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255);
        this.f4692b = i7 + 4;
        return ((bArr[i7 + 3] & 255) << 24) | i8 | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long j() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        long j7 = (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40);
        this.f4692b = i7 + 8;
        return ((bArr[i7 + 7] & 255) << 56) | j7 | ((bArr[i7 + 6] & 255) << 48);
    }

    public final short k() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        this.f4692b = i7 + 2;
        return (short) (((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255));
    }

    public final long l() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        this.f4692b = i7 + 4;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final int m() {
        int i7 = i();
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalStateException(AbstractC0515y1.l("Top bit not zero: ", i7));
    }

    public final int n() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        this.f4692b = i7 + 2;
        return ((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255);
    }

    public final long o() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        long j7 = ((bArr[i7] & 255) << 56) | ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7 + 2] & 255) << 40) | ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7 + 4] & 255) << 24);
        this.f4692b = i7 + 8;
        return (bArr[i7 + 7] & 255) | j7 | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8);
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f4692b;
        while (i7 < this.f4693c && this.f4691a[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.f4691a;
        int i8 = this.f4692b;
        int i9 = H.f4603a;
        String str = new String(bArr, i8, i7 - i8, N3.e.f2497c);
        this.f4692b = i7;
        if (i7 < this.f4693c) {
            this.f4692b = i7 + 1;
        }
        return str;
    }

    public final String q(int i7) {
        int i8;
        if (i7 == 0) {
            return "";
        }
        int i9 = this.f4692b;
        int i10 = (i9 + i7) - 1;
        if (i10 < this.f4693c && this.f4691a[i10] == 0) {
            i8 = i7 - 1;
        } else {
            i8 = i7;
        }
        byte[] bArr = this.f4691a;
        int i11 = H.f4603a;
        String str = new String(bArr, i9, i8, N3.e.f2497c);
        this.f4692b += i7;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        this.f4692b = i7 + 2;
        return (short) ((bArr[i7 + 1] & 255) | ((bArr[i7] & 255) << 8));
    }

    public final String s(int i7, Charset charset) {
        String str = new String(this.f4691a, this.f4692b, i7, charset);
        this.f4692b += i7;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        this.f4692b = i7 + 1;
        return bArr[i7] & 255;
    }

    public final long v() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        this.f4692b = i7 + 4;
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public final int w() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        int i8 = (bArr[i7 + 1] & 255) << 8;
        this.f4692b = i7 + 3;
        return (bArr[i7 + 2] & 255) | i8 | ((bArr[i7] & 255) << 16);
    }

    public final int x() {
        int g7 = g();
        if (g7 >= 0) {
            return g7;
        }
        throw new IllegalStateException(AbstractC0515y1.l("Top bit not zero: ", g7));
    }

    public final long y() {
        long o7 = o();
        if (o7 >= 0) {
            return o7;
        }
        throw new IllegalStateException(AbstractC1111a.o(o7, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.f4691a;
        int i7 = this.f4692b;
        this.f4692b = i7 + 2;
        return (bArr[i7 + 1] & 255) | ((bArr[i7] & 255) << 8);
    }

    public y(int i7) {
        this.f4691a = new byte[i7];
        this.f4693c = i7;
    }

    public y(int i7, byte[] bArr) {
        this.f4691a = bArr;
        this.f4693c = i7;
    }

    public y(byte[] bArr) {
        this.f4691a = bArr;
        this.f4693c = bArr.length;
    }
}
