package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.google.crypto.tink.shaded.protobuf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531i extends B5.e {

    /* renamed from: A  reason: collision with root package name */
    public int f9122A;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f9123u;

    /* renamed from: v  reason: collision with root package name */
    public int f9124v;

    /* renamed from: w  reason: collision with root package name */
    public int f9125w;

    /* renamed from: x  reason: collision with root package name */
    public int f9126x;

    /* renamed from: y  reason: collision with root package name */
    public final int f9127y;

    /* renamed from: z  reason: collision with root package name */
    public int f9128z;

    public C0531i(byte[] bArr, int i7, int i8, boolean z7) {
        super(3);
        this.f9122A = Integer.MAX_VALUE;
        this.f9123u = bArr;
        this.f9124v = i8 + i7;
        this.f9126x = i7;
        this.f9127y = i7;
    }

    @Override // B5.e
    public final long A() {
        return B5.e.e(L());
    }

    @Override // B5.e
    public final String B() {
        int K6 = K();
        if (K6 > 0) {
            int i7 = this.f9124v;
            int i8 = this.f9126x;
            if (K6 <= i7 - i8) {
                String str = new String(this.f9123u, i8, K6, AbstractC0547z.f9165a);
                this.f9126x += K6;
                return str;
            }
        }
        if (K6 == 0) {
            return "";
        }
        if (K6 < 0) {
            throw B.e();
        }
        throw B.g();
    }

    @Override // B5.e
    public final String C() {
        int K6 = K();
        if (K6 > 0) {
            int i7 = this.f9124v;
            int i8 = this.f9126x;
            if (K6 <= i7 - i8) {
                String g7 = q0.f9160a.g(this.f9123u, i8, K6);
                this.f9126x += K6;
                return g7;
            }
        }
        if (K6 == 0) {
            return "";
        }
        if (K6 <= 0) {
            throw B.e();
        }
        throw B.g();
    }

    @Override // B5.e
    public final int D() {
        if (k()) {
            this.f9128z = 0;
            return 0;
        }
        int K6 = K();
        this.f9128z = K6;
        if ((K6 >>> 3) != 0) {
            return K6;
        }
        throw B.a();
    }

    @Override // B5.e
    public final int E() {
        return K();
    }

    @Override // B5.e
    public final long F() {
        return L();
    }

    public final int I() {
        int i7 = this.f9126x;
        if (this.f9124v - i7 >= 4) {
            this.f9126x = i7 + 4;
            byte[] bArr = this.f9123u;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }
        throw B.g();
    }

    public final long J() {
        int i7 = this.f9126x;
        if (this.f9124v - i7 >= 8) {
            this.f9126x = i7 + 8;
            byte[] bArr = this.f9123u;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }
        throw B.g();
    }

    public final int K() {
        int i7;
        int i8 = this.f9126x;
        int i9 = this.f9124v;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f9123u;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f9126x = i10;
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
                this.f9126x = i11;
                return i7;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j7;
        long j8;
        long j9;
        long j10;
        int i7 = this.f9126x;
        int i8 = this.f9124v;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f9123u;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f9126x = i9;
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
                this.f9126x = i10;
                return j7;
            }
        }
        return M();
    }

    public final long M() {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i8 = this.f9126x;
            if (i8 != this.f9124v) {
                this.f9126x = i8 + 1;
                byte b7 = this.f9123u[i8];
                j7 |= (b7 & Byte.MAX_VALUE) << i7;
                if ((b7 & 128) == 0) {
                    return j7;
                }
            } else {
                throw B.g();
            }
        }
        throw B.d();
    }

    public final void N() {
        int i7 = this.f9124v + this.f9125w;
        this.f9124v = i7;
        int i8 = i7 - this.f9127y;
        int i9 = this.f9122A;
        if (i8 <= i9) {
            this.f9125w = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f9125w = i10;
        this.f9124v = i7 - i10;
    }

    @Override // B5.e
    public final void c(int i7) {
        if (this.f9128z == i7) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // B5.e
    public final int i() {
        return this.f9126x - this.f9127y;
    }

    @Override // B5.e
    public final boolean k() {
        return this.f9126x == this.f9124v;
    }

    @Override // B5.e
    public final void m(int i7) {
        this.f9122A = i7;
        N();
    }

    @Override // B5.e
    public final int n(int i7) {
        if (i7 >= 0) {
            int i8 = i() + i7;
            if (i8 >= 0) {
                int i9 = this.f9122A;
                if (i8 <= i9) {
                    this.f9122A = i8;
                    N();
                    return i9;
                }
                throw B.g();
            }
            throw B.f();
        }
        throw B.e();
    }

    @Override // B5.e
    public final boolean o() {
        return L() != 0;
    }

    @Override // B5.e
    public final C0529g p() {
        byte[] bArr;
        int K6 = K();
        byte[] bArr2 = this.f9123u;
        if (K6 > 0) {
            int i7 = this.f9124v;
            int i8 = this.f9126x;
            if (K6 <= i7 - i8) {
                C0529g f = AbstractC0530h.f(bArr2, i8, K6);
                this.f9126x += K6;
                return f;
            }
        }
        if (K6 == 0) {
            return AbstractC0530h.f9118r;
        }
        if (K6 > 0) {
            int i9 = this.f9124v;
            int i10 = this.f9126x;
            if (K6 <= i9 - i10) {
                int i11 = K6 + i10;
                this.f9126x = i11;
                bArr = Arrays.copyOfRange(bArr2, i10, i11);
                C0529g c0529g = AbstractC0530h.f9118r;
                return new C0529g(bArr);
            }
        }
        if (K6 <= 0) {
            if (K6 == 0) {
                bArr = AbstractC0547z.f9166b;
                C0529g c0529g2 = AbstractC0530h.f9118r;
                return new C0529g(bArr);
            }
            throw B.e();
        }
        throw B.g();
    }

    @Override // B5.e
    public final double q() {
        return Double.longBitsToDouble(J());
    }

    @Override // B5.e
    public final int r() {
        return K();
    }

    @Override // B5.e
    public final int s() {
        return I();
    }

    @Override // B5.e
    public final long t() {
        return J();
    }

    @Override // B5.e
    public final float u() {
        return Float.intBitsToFloat(I());
    }

    @Override // B5.e
    public final int v() {
        return K();
    }

    @Override // B5.e
    public final long w() {
        return L();
    }

    @Override // B5.e
    public final int x() {
        return I();
    }

    @Override // B5.e
    public final long y() {
        return J();
    }

    @Override // B5.e
    public final int z() {
        return B5.e.d(K());
    }
}
