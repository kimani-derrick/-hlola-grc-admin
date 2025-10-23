package g2;

import Z2.AbstractC0156a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public final int f10623a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10624b;

    /* renamed from: c  reason: collision with root package name */
    public final float f10625c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10626e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10627g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10628h;

    /* renamed from: i  reason: collision with root package name */
    public final short[] f10629i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f10630j;

    /* renamed from: k  reason: collision with root package name */
    public int f10631k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f10632l;

    /* renamed from: m  reason: collision with root package name */
    public int f10633m;
    public short[] n;

    /* renamed from: o  reason: collision with root package name */
    public int f10634o;

    /* renamed from: p  reason: collision with root package name */
    public int f10635p;

    /* renamed from: q  reason: collision with root package name */
    public int f10636q;

    /* renamed from: r  reason: collision with root package name */
    public int f10637r;

    /* renamed from: s  reason: collision with root package name */
    public int f10638s;

    /* renamed from: t  reason: collision with root package name */
    public int f10639t;

    /* renamed from: u  reason: collision with root package name */
    public int f10640u;

    /* renamed from: v  reason: collision with root package name */
    public int f10641v;

    public S(int i7, int i8, float f, float f7, int i9) {
        this.f10623a = i7;
        this.f10624b = i8;
        this.f10625c = f;
        this.d = f7;
        this.f10626e = i7 / i9;
        this.f = i7 / 400;
        int i10 = i7 / 65;
        this.f10627g = i10;
        int i11 = i10 * 2;
        this.f10628h = i11;
        this.f10629i = new short[i11];
        this.f10630j = new short[i11 * i8];
        this.f10632l = new short[i11 * i8];
        this.n = new short[i11 * i8];
    }

    public static void e(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i9 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i10 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i13] = (short) (((sArr3[i14] * i16) + ((i7 - i16) * sArr2[i15])) / i7);
                i13 += i8;
                i15 += i8;
                i14 += i8;
            }
        }
    }

    public final void a(short[] sArr, int i7, int i8) {
        short[] c5 = c(this.f10632l, this.f10633m, i8);
        this.f10632l = c5;
        int i9 = this.f10624b;
        System.arraycopy(sArr, i7 * i9, c5, this.f10633m * i9, i9 * i8);
        this.f10633m += i8;
    }

    public final void b(short[] sArr, int i7, int i8) {
        int i9 = this.f10628h / i8;
        int i10 = this.f10624b;
        int i11 = i8 * i10;
        int i12 = i7 * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f10629i[i13] = (short) (i14 / i11);
        }
    }

    public final short[] c(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.f10624b;
        int i10 = length / i9;
        if (i7 + i8 <= i10) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    public final int d(short[] sArr, int i7, int i8, int i9) {
        int i10 = i7 * this.f10624b;
        int i11 = 255;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i8 <= i9) {
            int i15 = 0;
            for (int i16 = 0; i16 < i8; i16++) {
                i15 += Math.abs(sArr[i10 + i16] - sArr[(i10 + i8) + i16]);
            }
            if (i15 * i13 < i12 * i8) {
                i13 = i8;
                i12 = i15;
            }
            if (i15 * i11 > i14 * i8) {
                i11 = i8;
                i14 = i15;
            }
            i8++;
        }
        this.f10640u = i12 / i13;
        this.f10641v = i14 / i11;
        return i13;
    }

    public final void f() {
        int i7;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int i19 = this.f10633m;
        float f7 = this.f10625c;
        float f8 = this.d;
        float f9 = f7 / f8;
        float f10 = this.f10626e * f8;
        double d = f9;
        int i20 = (d > 1.00001d ? 1 : (d == 1.00001d ? 0 : -1));
        int i21 = this.f10623a;
        int i22 = this.f10624b;
        int i23 = 1;
        if (i20 <= 0 && d >= 0.99999d) {
            a(this.f10630j, 0, this.f10631k);
            this.f10631k = 0;
        } else {
            int i24 = this.f10631k;
            int i25 = this.f10628h;
            if (i24 >= i25) {
                int i26 = 0;
                while (true) {
                    int i27 = this.f10637r;
                    if (i27 > 0) {
                        int min = Math.min(i25, i27);
                        a(this.f10630j, i26, min);
                        this.f10637r -= min;
                        i26 += min;
                        i9 = i19;
                        f = f10;
                        i8 = i21;
                    } else {
                        short[] sArr = this.f10630j;
                        if (i21 > 4000) {
                            i7 = i21 / 4000;
                        } else {
                            i7 = i23;
                        }
                        int i28 = this.f10627g;
                        int i29 = this.f;
                        if (i22 == i23 && i7 == i23) {
                            i10 = d(sArr, i26, i29, i28);
                            i9 = i19;
                            f = f10;
                            i8 = i21;
                        } else {
                            b(sArr, i26, i7);
                            i8 = i21;
                            i9 = i19;
                            short[] sArr2 = this.f10629i;
                            f = f10;
                            int d7 = d(sArr2, 0, i29 / i7, i28 / i7);
                            if (i7 != 1) {
                                int i30 = d7 * i7;
                                int i31 = i7 * 4;
                                int i32 = i30 - i31;
                                int i33 = i30 + i31;
                                if (i32 >= i29) {
                                    i29 = i32;
                                }
                                if (i33 <= i28) {
                                    i28 = i33;
                                }
                                if (i22 == 1) {
                                    i10 = d(sArr, i26, i29, i28);
                                } else {
                                    b(sArr, i26, 1);
                                    i10 = d(sArr2, 0, i29, i28);
                                }
                            } else {
                                i10 = d7;
                            }
                        }
                        int i34 = this.f10640u;
                        int i35 = this.f10641v;
                        if (i34 == 0 || (i11 = this.f10638s) == 0 || i35 > i34 * 3 || i34 * 2 <= this.f10639t * 3) {
                            i11 = i10;
                        }
                        this.f10639t = i34;
                        this.f10638s = i10;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f10630j;
                            if (f9 >= 2.0f) {
                                i13 = (int) (i11 / (f9 - 1.0f));
                            } else {
                                this.f10637r = (int) (((2.0f - f9) * i11) / (f9 - 1.0f));
                                i13 = i11;
                            }
                            short[] c5 = c(this.f10632l, this.f10633m, i13);
                            this.f10632l = c5;
                            int i36 = i26;
                            e(i13, this.f10624b, c5, this.f10633m, sArr3, i36, sArr3, i26 + i11);
                            this.f10633m += i13;
                            i26 = i11 + i13 + i36;
                        } else {
                            int i37 = i26;
                            short[] sArr4 = this.f10630j;
                            if (f9 < 0.5f) {
                                i12 = (int) ((i11 * f9) / (1.0f - f9));
                            } else {
                                this.f10637r = (int) ((((2.0f * f9) - 1.0f) * i11) / (1.0f - f9));
                                i12 = i11;
                            }
                            int i38 = i11 + i12;
                            short[] c6 = c(this.f10632l, this.f10633m, i38);
                            this.f10632l = c6;
                            System.arraycopy(sArr4, i37 * i22, c6, this.f10633m * i22, i11 * i22);
                            e(i12, this.f10624b, this.f10632l, this.f10633m + i11, sArr4, i37 + i11, sArr4, i37);
                            this.f10633m += i38;
                            i26 = i37 + i12;
                        }
                    }
                    if (i26 + i25 > i24) {
                        break;
                    }
                    i21 = i8;
                    i19 = i9;
                    f10 = f;
                    i23 = 1;
                }
                int i39 = this.f10631k - i26;
                short[] sArr5 = this.f10630j;
                System.arraycopy(sArr5, i26 * i22, sArr5, 0, i39 * i22);
                this.f10631k = i39;
                if (f == 1.0f && this.f10633m != (i14 = i9)) {
                    int i40 = i8;
                    int i41 = (int) (i40 / f);
                    int i42 = i40;
                    while (true) {
                        if (i41 <= 16384 && i42 <= 16384) {
                            break;
                        }
                        i41 /= 2;
                        i42 /= 2;
                    }
                    int i43 = this.f10633m - i14;
                    short[] c7 = c(this.n, this.f10634o, i43);
                    this.n = c7;
                    System.arraycopy(this.f10632l, i14 * i22, c7, this.f10634o * i22, i43 * i22);
                    this.f10633m = i14;
                    this.f10634o += i43;
                    int i44 = 0;
                    while (true) {
                        i15 = this.f10634o;
                        i16 = i15 - 1;
                        if (i44 >= i16) {
                            break;
                        }
                        while (true) {
                            i17 = this.f10635p + 1;
                            int i45 = i17 * i41;
                            i18 = this.f10636q;
                            if (i45 <= i18 * i42) {
                                break;
                            }
                            this.f10632l = c(this.f10632l, this.f10633m, 1);
                            for (int i46 = 0; i46 < i22; i46++) {
                                short[] sArr6 = this.n;
                                int i47 = (i44 * i22) + i46;
                                short s6 = sArr6[i47];
                                short s7 = sArr6[i47 + i22];
                                int i48 = this.f10635p;
                                int i49 = i48 * i41;
                                int i50 = (i48 + 1) * i41;
                                int i51 = i50 - (this.f10636q * i42);
                                int i52 = i50 - i49;
                                this.f10632l[(this.f10633m * i22) + i46] = (short) ((((i52 - i51) * s7) + (s6 * i51)) / i52);
                            }
                            this.f10636q++;
                            this.f10633m++;
                        }
                        this.f10635p = i17;
                        if (i17 == i42) {
                            this.f10635p = 0;
                            if (i18 == i41) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            AbstractC0156a.k(z7);
                            this.f10636q = 0;
                        }
                        i44++;
                    }
                    if (i16 != 0) {
                        short[] sArr7 = this.n;
                        System.arraycopy(sArr7, i16 * i22, sArr7, 0, (i15 - i16) * i22);
                        this.f10634o -= i16;
                        return;
                    }
                    return;
                }
            }
        }
        i9 = i19;
        f = f10;
        i8 = i21;
        if (f == 1.0f) {
        }
    }
}
