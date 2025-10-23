package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import r0.AbstractC1111a;
/* renamed from: com.google.crypto.tink.shaded.protobuf.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532j extends B5.e {

    /* renamed from: A  reason: collision with root package name */
    public int f9130A;

    /* renamed from: B  reason: collision with root package name */
    public int f9131B;

    /* renamed from: u  reason: collision with root package name */
    public final InputStream f9132u;

    /* renamed from: v  reason: collision with root package name */
    public final byte[] f9133v;

    /* renamed from: w  reason: collision with root package name */
    public int f9134w;

    /* renamed from: x  reason: collision with root package name */
    public int f9135x;

    /* renamed from: y  reason: collision with root package name */
    public int f9136y;

    /* renamed from: z  reason: collision with root package name */
    public int f9137z;

    public C0532j(InputStream inputStream) {
        super(3);
        this.f9131B = Integer.MAX_VALUE;
        AbstractC0547z.a(inputStream, "input");
        this.f9132u = inputStream;
        this.f9133v = new byte[4096];
        this.f9134w = 0;
        this.f9136y = 0;
        this.f9130A = 0;
    }

    @Override // B5.e
    public final long A() {
        return B5.e.e(O());
    }

    @Override // B5.e
    public final String B() {
        String str;
        int N6 = N();
        byte[] bArr = this.f9133v;
        if (N6 > 0) {
            int i7 = this.f9134w;
            int i8 = this.f9136y;
            if (N6 <= i7 - i8) {
                str = new String(bArr, i8, N6, AbstractC0547z.f9165a);
                this.f9136y += N6;
                return str;
            }
        }
        if (N6 == 0) {
            return "";
        }
        if (N6 <= this.f9134w) {
            R(N6);
            str = new String(bArr, this.f9136y, N6, AbstractC0547z.f9165a);
            this.f9136y += N6;
            return str;
        }
        return new String(I(N6), AbstractC0547z.f9165a);
    }

    @Override // B5.e
    public final String C() {
        int N6 = N();
        int i7 = this.f9136y;
        int i8 = this.f9134w;
        int i9 = i8 - i7;
        byte[] bArr = this.f9133v;
        if (N6 <= i9 && N6 > 0) {
            this.f9136y = i7 + N6;
        } else if (N6 == 0) {
            return "";
        } else {
            i7 = 0;
            if (N6 <= i8) {
                R(N6);
                this.f9136y = N6;
            } else {
                bArr = I(N6);
            }
        }
        return q0.f9160a.g(bArr, i7, N6);
    }

    @Override // B5.e
    public final int D() {
        if (k()) {
            this.f9137z = 0;
            return 0;
        }
        int N6 = N();
        this.f9137z = N6;
        if ((N6 >>> 3) != 0) {
            return N6;
        }
        throw B.a();
    }

    @Override // B5.e
    public final int E() {
        return N();
    }

    @Override // B5.e
    public final long F() {
        return O();
    }

    public final byte[] I(int i7) {
        byte[] J6 = J(i7);
        if (J6 != null) {
            return J6;
        }
        int i8 = this.f9136y;
        int i9 = this.f9134w;
        int i10 = i9 - i8;
        this.f9130A += i9;
        this.f9136y = 0;
        this.f9134w = 0;
        ArrayList K6 = K(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f9133v, i8, bArr, 0, i10);
        Iterator it = K6.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] J(int i7) {
        if (i7 == 0) {
            return AbstractC0547z.f9166b;
        }
        if (i7 >= 0) {
            int i8 = this.f9130A;
            int i9 = this.f9136y;
            int i10 = i8 + i9 + i7;
            if (i10 - this.f294s <= 0) {
                int i11 = this.f9131B;
                if (i10 <= i11) {
                    int i12 = this.f9134w - i9;
                    int i13 = i7 - i12;
                    InputStream inputStream = this.f9132u;
                    if (i13 >= 4096) {
                        try {
                            if (i13 > inputStream.available()) {
                                return null;
                            }
                        } catch (B e3) {
                            e3.f9051q = true;
                            throw e3;
                        }
                    }
                    byte[] bArr = new byte[i7];
                    System.arraycopy(this.f9133v, this.f9136y, bArr, 0, i12);
                    this.f9130A += this.f9134w;
                    this.f9136y = 0;
                    this.f9134w = 0;
                    while (i12 < i7) {
                        try {
                            int read = inputStream.read(bArr, i12, i7 - i12);
                            if (read != -1) {
                                this.f9130A += read;
                                i12 += read;
                            } else {
                                throw B.g();
                            }
                        } catch (B e7) {
                            e7.f9051q = true;
                            throw e7;
                        }
                    }
                    return bArr;
                }
                S((i11 - i8) - i9);
                throw B.g();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw B.e();
    }

    public final ArrayList K(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, 4096);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.f9132u.read(bArr, i8, min - i8);
                if (read != -1) {
                    this.f9130A += read;
                    i8 += read;
                } else {
                    throw B.g();
                }
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int L() {
        int i7 = this.f9136y;
        if (this.f9134w - i7 < 4) {
            R(4);
            i7 = this.f9136y;
        }
        this.f9136y = i7 + 4;
        byte[] bArr = this.f9133v;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long M() {
        int i7 = this.f9136y;
        if (this.f9134w - i7 < 8) {
            R(8);
            i7 = this.f9136y;
        }
        this.f9136y = i7 + 8;
        byte[] bArr = this.f9133v;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int N() {
        int i7;
        int i8 = this.f9136y;
        int i9 = this.f9134w;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f9133v;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f9136y = i10;
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
                this.f9136y = i11;
                return i7;
            }
        }
        return (int) P();
    }

    public final long O() {
        long j7;
        long j8;
        long j9;
        long j10;
        int i7 = this.f9136y;
        int i8 = this.f9134w;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f9133v;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f9136y = i9;
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
                this.f9136y = i10;
                return j7;
            }
        }
        return P();
    }

    public final long P() {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f9136y == this.f9134w) {
                R(1);
            }
            int i8 = this.f9136y;
            this.f9136y = i8 + 1;
            byte b7 = this.f9133v[i8];
            j7 |= (b7 & Byte.MAX_VALUE) << i7;
            if ((b7 & 128) == 0) {
                return j7;
            }
        }
        throw B.d();
    }

    public final void Q() {
        int i7 = this.f9134w + this.f9135x;
        this.f9134w = i7;
        int i8 = this.f9130A + i7;
        int i9 = this.f9131B;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.f9135x = i10;
            this.f9134w = i7 - i10;
            return;
        }
        this.f9135x = 0;
    }

    public final void R(int i7) {
        if (!T(i7)) {
            if (i7 > (this.f294s - this.f9130A) - this.f9136y) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw B.g();
        }
    }

    public final void S(int i7) {
        int i8 = this.f9134w;
        int i9 = this.f9136y;
        if (i7 <= i8 - i9 && i7 >= 0) {
            this.f9136y = i9 + i7;
            return;
        }
        InputStream inputStream = this.f9132u;
        if (i7 >= 0) {
            int i10 = this.f9130A;
            int i11 = i10 + i9;
            int i12 = i11 + i7;
            int i13 = this.f9131B;
            if (i12 <= i13) {
                this.f9130A = i11;
                int i14 = i8 - i9;
                this.f9134w = 0;
                this.f9136y = 0;
                while (i14 < i7) {
                    long j7 = i7 - i14;
                    try {
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
                        } catch (B e3) {
                            e3.f9051q = true;
                            throw e3;
                        }
                    } catch (Throwable th) {
                        this.f9130A += i14;
                        Q();
                        throw th;
                    }
                }
                this.f9130A += i14;
                Q();
                if (i14 < i7) {
                    int i16 = this.f9134w;
                    int i17 = i16 - this.f9136y;
                    this.f9136y = i16;
                    while (true) {
                        R(1);
                        int i18 = i7 - i17;
                        int i19 = this.f9134w;
                        if (i18 > i19) {
                            i17 += i19;
                            this.f9136y = i19;
                        } else {
                            this.f9136y = i18;
                            return;
                        }
                    }
                }
            } else {
                S((i13 - i10) - i9);
                throw B.g();
            }
        } else {
            throw B.e();
        }
    }

    public final boolean T(int i7) {
        InputStream inputStream;
        int i8 = this.f9136y;
        int i9 = i8 + i7;
        int i10 = this.f9134w;
        if (i9 > i10) {
            int i11 = this.f9130A;
            int i12 = this.f294s;
            if (i7 > (i12 - i11) - i8 || i11 + i8 + i7 > this.f9131B) {
                return false;
            }
            byte[] bArr = this.f9133v;
            if (i8 > 0) {
                if (i10 > i8) {
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f9130A += i8;
                this.f9134w -= i8;
                this.f9136y = 0;
            }
            int i13 = this.f9134w;
            int min = Math.min(bArr.length - i13, (i12 - this.f9130A) - i13);
            try {
                int read = this.f9132u.read(bArr, i13, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f9134w += read;
                    Q();
                    if (this.f9134w >= i7) {
                        return true;
                    }
                    return T(i7);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (B e3) {
                e3.f9051q = true;
                throw e3;
            }
        }
        throw new IllegalStateException(AbstractC1111a.n(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    @Override // B5.e
    public final void c(int i7) {
        if (this.f9137z == i7) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // B5.e
    public final int i() {
        return this.f9130A + this.f9136y;
    }

    @Override // B5.e
    public final boolean k() {
        return this.f9136y == this.f9134w && !T(1);
    }

    @Override // B5.e
    public final void m(int i7) {
        this.f9131B = i7;
        Q();
    }

    @Override // B5.e
    public final int n(int i7) {
        if (i7 >= 0) {
            int i8 = this.f9130A + this.f9136y + i7;
            int i9 = this.f9131B;
            if (i8 <= i9) {
                this.f9131B = i8;
                Q();
                return i9;
            }
            throw B.g();
        }
        throw B.e();
    }

    @Override // B5.e
    public final boolean o() {
        return O() != 0;
    }

    @Override // B5.e
    public final C0529g p() {
        int N6 = N();
        int i7 = this.f9134w;
        int i8 = this.f9136y;
        int i9 = i7 - i8;
        byte[] bArr = this.f9133v;
        if (N6 <= i9 && N6 > 0) {
            C0529g f = AbstractC0530h.f(bArr, i8, N6);
            this.f9136y += N6;
            return f;
        } else if (N6 == 0) {
            return AbstractC0530h.f9118r;
        } else {
            byte[] J6 = J(N6);
            if (J6 != null) {
                return AbstractC0530h.f(J6, 0, J6.length);
            }
            int i10 = this.f9136y;
            int i11 = this.f9134w;
            int i12 = i11 - i10;
            this.f9130A += i11;
            this.f9136y = 0;
            this.f9134w = 0;
            ArrayList K6 = K(N6 - i12);
            byte[] bArr2 = new byte[N6];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            Iterator it = K6.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
                i12 += bArr3.length;
            }
            C0529g c0529g = AbstractC0530h.f9118r;
            return new C0529g(bArr2);
        }
    }

    @Override // B5.e
    public final double q() {
        return Double.longBitsToDouble(M());
    }

    @Override // B5.e
    public final int r() {
        return N();
    }

    @Override // B5.e
    public final int s() {
        return L();
    }

    @Override // B5.e
    public final long t() {
        return M();
    }

    @Override // B5.e
    public final float u() {
        return Float.intBitsToFloat(L());
    }

    @Override // B5.e
    public final int v() {
        return N();
    }

    @Override // B5.e
    public final long w() {
        return O();
    }

    @Override // B5.e
    public final int x() {
        return L();
    }

    @Override // B5.e
    public final long y() {
        return M();
    }

    @Override // B5.e
    public final int z() {
        return B5.e.d(N());
    }
}
