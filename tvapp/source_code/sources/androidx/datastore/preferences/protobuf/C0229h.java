package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import r0.AbstractC1111a;
/* renamed from: androidx.datastore.preferences.protobuf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229h {

    /* renamed from: a  reason: collision with root package name */
    public int f5767a;
    public C0230i d;

    /* renamed from: e  reason: collision with root package name */
    public final InputStream f5770e;
    public final byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public int f5771g;

    /* renamed from: h  reason: collision with root package name */
    public int f5772h;

    /* renamed from: i  reason: collision with root package name */
    public int f5773i;

    /* renamed from: j  reason: collision with root package name */
    public int f5774j;

    /* renamed from: k  reason: collision with root package name */
    public int f5775k;

    /* renamed from: b  reason: collision with root package name */
    public final int f5768b = 100;

    /* renamed from: c  reason: collision with root package name */
    public final int f5769c = Integer.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f5776l = Integer.MAX_VALUE;

    public C0229h(FileInputStream fileInputStream) {
        Charset charset = AbstractC0246z.f5827a;
        this.f5770e = fileInputStream;
        this.f = new byte[4096];
        this.f5771g = 0;
        this.f5773i = 0;
        this.f5775k = 0;
    }

    public final String A() {
        String str;
        int t5 = t();
        byte[] bArr = this.f;
        if (t5 > 0) {
            int i7 = this.f5771g;
            int i8 = this.f5773i;
            if (t5 <= i7 - i8) {
                str = new String(bArr, i8, t5, AbstractC0246z.f5827a);
                this.f5773i += t5;
                return str;
            }
        }
        if (t5 == 0) {
            return "";
        }
        if (t5 <= this.f5771g) {
            G(t5);
            str = new String(bArr, this.f5773i, t5, AbstractC0246z.f5827a);
            this.f5773i += t5;
            return str;
        }
        return new String(o(t5), AbstractC0246z.f5827a);
    }

    public final String B() {
        int t5 = t();
        int i7 = this.f5773i;
        int i8 = this.f5771g;
        int i9 = i8 - i7;
        byte[] bArr = this.f;
        if (t5 <= i9 && t5 > 0) {
            this.f5773i = i7 + t5;
        } else if (t5 == 0) {
            return "";
        } else {
            i7 = 0;
            if (t5 <= i8) {
                G(t5);
                this.f5773i = t5;
            } else {
                bArr = o(t5);
            }
        }
        return v0.f5826a.f(bArr, i7, t5);
    }

    public final int C() {
        if (c()) {
            this.f5774j = 0;
            return 0;
        }
        int t5 = t();
        this.f5774j = t5;
        if ((t5 >>> 3) != 0) {
            return t5;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public final int D() {
        return t();
    }

    public final long E() {
        return u();
    }

    public final void F() {
        int i7 = this.f5771g + this.f5772h;
        this.f5771g = i7;
        int i8 = this.f5775k + i7;
        int i9 = this.f5776l;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.f5772h = i10;
            this.f5771g = i7 - i10;
            return;
        }
        this.f5772h = 0;
    }

    public final void G(int i7) {
        if (!J(i7)) {
            if (i7 > (this.f5769c - this.f5775k) - this.f5773i) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw B.f();
        }
    }

    public final boolean H(int i7) {
        int i8;
        int C3;
        int i9 = i7 & 7;
        int i10 = 0;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4) {
                            return false;
                        }
                        if (i9 == 5) {
                            I(4);
                            return true;
                        }
                        throw B.b();
                    }
                    do {
                        C3 = C();
                        if (C3 == 0) {
                            break;
                        }
                    } while (H(C3));
                    a(((i7 >>> 3) << 3) | 4);
                    return true;
                }
                i8 = t();
            } else {
                i8 = 8;
            }
            I(i8);
            return true;
        }
        int i11 = this.f5771g - this.f5773i;
        byte[] bArr = this.f;
        if (i11 >= 10) {
            while (i10 < 10) {
                int i12 = this.f5773i;
                this.f5773i = i12 + 1;
                if (bArr[i12] < 0) {
                    i10++;
                }
            }
            throw B.c();
        }
        while (i10 < 10) {
            if (this.f5773i == this.f5771g) {
                G(1);
            }
            int i13 = this.f5773i;
            this.f5773i = i13 + 1;
            if (bArr[i13] < 0) {
                i10++;
            }
        }
        throw B.c();
        return true;
    }

    public final void I(int i7) {
        int i8 = this.f5771g;
        int i9 = this.f5773i;
        if (i7 <= i8 - i9 && i7 >= 0) {
            this.f5773i = i9 + i7;
            return;
        }
        InputStream inputStream = this.f5770e;
        if (i7 >= 0) {
            int i10 = this.f5775k;
            int i11 = i10 + i9;
            int i12 = i11 + i7;
            int i13 = this.f5776l;
            if (i12 <= i13) {
                this.f5775k = i11;
                int i14 = i8 - i9;
                this.f5771g = 0;
                this.f5773i = 0;
                while (i14 < i7) {
                    long j7 = i7 - i14;
                    try {
                        long skip = inputStream.skip(j7);
                        int i15 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                        if (i15 >= 0 && skip <= j7) {
                            if (i15 == 0) {
                                break;
                            }
                            i14 += (int) skip;
                        } else {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                    } finally {
                        this.f5775k += i14;
                        F();
                    }
                }
                if (i14 < i7) {
                    int i16 = this.f5771g;
                    int i17 = i16 - this.f5773i;
                    this.f5773i = i16;
                    while (true) {
                        G(1);
                        int i18 = i7 - i17;
                        int i19 = this.f5771g;
                        if (i18 > i19) {
                            i17 += i19;
                            this.f5773i = i19;
                        } else {
                            this.f5773i = i18;
                            return;
                        }
                    }
                }
            } else {
                I((i13 - i10) - i9);
                throw B.f();
            }
        } else {
            throw B.d();
        }
    }

    public final boolean J(int i7) {
        InputStream inputStream;
        int i8 = this.f5773i;
        int i9 = i8 + i7;
        int i10 = this.f5771g;
        if (i9 > i10) {
            int i11 = this.f5775k;
            int i12 = this.f5769c;
            if (i7 > (i12 - i11) - i8 || i11 + i8 + i7 > this.f5776l) {
                return false;
            }
            byte[] bArr = this.f;
            if (i8 > 0) {
                if (i10 > i8) {
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f5775k += i8;
                this.f5771g -= i8;
                this.f5773i = 0;
            }
            int i13 = this.f5771g;
            int min = Math.min(bArr.length - i13, (i12 - this.f5775k) - i13);
            int read = this.f5770e.read(bArr, i13, min);
            if (read != 0 && read >= -1 && read <= bArr.length) {
                if (read <= 0) {
                    return false;
                }
                this.f5771g += read;
                F();
                if (this.f5771g >= i7) {
                    return true;
                }
                return J(i7);
            }
            throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
        }
        throw new IllegalStateException(AbstractC1111a.n(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    public final void a(int i7) {
        if (this.f5774j == i7) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    public final int b() {
        return this.f5775k + this.f5773i;
    }

    public final boolean c() {
        return this.f5773i == this.f5771g && !J(1);
    }

    public final void d(int i7) {
        this.f5776l = i7;
        F();
    }

    public final int e(int i7) {
        if (i7 >= 0) {
            int i8 = this.f5775k + this.f5773i + i7;
            int i9 = this.f5776l;
            if (i8 <= i9) {
                this.f5776l = i8;
                F();
                return i9;
            }
            throw B.f();
        }
        throw B.d();
    }

    public final boolean f() {
        return u() != 0;
    }

    public final C0228g g() {
        int t5 = t();
        int i7 = this.f5771g;
        int i8 = this.f5773i;
        int i9 = i7 - i8;
        byte[] bArr = this.f;
        if (t5 <= i9 && t5 > 0) {
            C0228g f = C0228g.f(bArr, i8, t5);
            this.f5773i += t5;
            return f;
        } else if (t5 == 0) {
            return C0228g.f5760s;
        } else {
            byte[] p3 = p(t5);
            if (p3 != null) {
                return C0228g.f(p3, 0, p3.length);
            }
            int i10 = this.f5773i;
            int i11 = this.f5771g;
            int i12 = i11 - i10;
            this.f5775k += i11;
            this.f5773i = 0;
            this.f5771g = 0;
            ArrayList q5 = q(t5 - i12);
            byte[] bArr2 = new byte[t5];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            Iterator it = q5.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
                i12 += bArr3.length;
            }
            C0228g c0228g = C0228g.f5760s;
            return new C0228g(bArr2);
        }
    }

    public final double h() {
        return Double.longBitsToDouble(s());
    }

    public final int i() {
        return t();
    }

    public final int j() {
        return r();
    }

    public final long k() {
        return s();
    }

    public final float l() {
        return Float.intBitsToFloat(r());
    }

    public final int m() {
        return t();
    }

    public final long n() {
        return u();
    }

    public final byte[] o(int i7) {
        byte[] p3 = p(i7);
        if (p3 != null) {
            return p3;
        }
        int i8 = this.f5773i;
        int i9 = this.f5771g;
        int i10 = i9 - i8;
        this.f5775k += i9;
        this.f5773i = 0;
        this.f5771g = 0;
        ArrayList q5 = q(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f, i8, bArr, 0, i10);
        Iterator it = q5.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] p(int i7) {
        if (i7 == 0) {
            return AbstractC0246z.f5828b;
        }
        if (i7 >= 0) {
            int i8 = this.f5775k;
            int i9 = this.f5773i;
            int i10 = i8 + i9 + i7;
            if (i10 - this.f5769c <= 0) {
                int i11 = this.f5776l;
                if (i10 <= i11) {
                    int i12 = this.f5771g - i9;
                    int i13 = i7 - i12;
                    InputStream inputStream = this.f5770e;
                    if (i13 >= 4096 && i13 > inputStream.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i7];
                    System.arraycopy(this.f, this.f5773i, bArr, 0, i12);
                    this.f5775k += this.f5771g;
                    this.f5773i = 0;
                    this.f5771g = 0;
                    while (i12 < i7) {
                        int read = inputStream.read(bArr, i12, i7 - i12);
                        if (read != -1) {
                            this.f5775k += read;
                            i12 += read;
                        } else {
                            throw B.f();
                        }
                    }
                    return bArr;
                }
                I((i11 - i8) - i9);
                throw B.f();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw B.d();
    }

    public final ArrayList q(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, 4096);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.f5770e.read(bArr, i8, min - i8);
                if (read != -1) {
                    this.f5775k += read;
                    i8 += read;
                } else {
                    throw B.f();
                }
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int r() {
        int i7 = this.f5773i;
        if (this.f5771g - i7 < 4) {
            G(4);
            i7 = this.f5773i;
        }
        this.f5773i = i7 + 4;
        byte[] bArr = this.f;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long s() {
        int i7 = this.f5773i;
        if (this.f5771g - i7 < 8) {
            G(8);
            i7 = this.f5773i;
        }
        this.f5773i = i7 + 8;
        byte[] bArr = this.f;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int t() {
        int i7;
        int i8 = this.f5773i;
        int i9 = this.f5771g;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f5773i = i10;
                return b7;
            } else if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b7;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b8 = bArr[i15];
                            int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f5773i = i11;
                return i7;
            }
        }
        return (int) v();
    }

    public final long u() {
        long j7;
        long j8;
        long j9;
        long j10;
        int i7 = this.f5773i;
        int i8 = this.f5771g;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f5773i = i9;
                return b7;
            } else if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b7;
                if (i11 < 0) {
                    j7 = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j7 = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j10 = (-2080896) ^ i15;
                        } else {
                            long j11 = i15;
                            i10 = i7 + 5;
                            long j12 = j11 ^ (bArr[i14] << 28);
                            if (j12 >= 0) {
                                j9 = 266354560;
                            } else {
                                i14 = i7 + 6;
                                long j13 = j12 ^ (bArr[i10] << 35);
                                if (j13 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j12 = j13 ^ (bArr[i14] << 42);
                                    if (j12 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i14 = i7 + 8;
                                        j13 = j12 ^ (bArr[i10] << 49);
                                        if (j13 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j14 = (j13 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                int i16 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j7 = j14;
                                        }
                                    }
                                }
                                j10 = j8 ^ j13;
                            }
                            j7 = j9 ^ j12;
                        }
                        i10 = i14;
                        j7 = j10;
                    }
                }
                this.f5773i = i10;
                return j7;
            }
        }
        return v();
    }

    public final long v() {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f5773i == this.f5771g) {
                G(1);
            }
            int i8 = this.f5773i;
            this.f5773i = i8 + 1;
            byte b7 = this.f[i8];
            j7 |= (b7 & Byte.MAX_VALUE) << i7;
            if ((b7 & 128) == 0) {
                return j7;
            }
        }
        throw B.c();
    }

    public final int w() {
        return r();
    }

    public final long x() {
        return s();
    }

    public final int y() {
        int t5 = t();
        return (-(t5 & 1)) ^ (t5 >>> 1);
    }

    public final long z() {
        long u7 = u();
        return (-(u7 & 1)) ^ (u7 >>> 1);
    }
}
