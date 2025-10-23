package N2;

import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2471a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f2472b;

    /* renamed from: c  reason: collision with root package name */
    public int f2473c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f2474e;

    public f() {
        this.f2471a = 1;
        this.f2472b = H.f;
    }

    public void a() {
        boolean z7;
        int i7;
        boolean z8;
        int i8;
        switch (this.f2471a) {
            case 1:
                int i9 = this.f2473c;
                if (i9 >= 0 && (i9 < (i7 = this.f2474e) || (i9 == i7 && this.d == 0))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.k(z7);
                return;
            default:
                int i10 = this.d;
                if (i10 >= 0 && (i10 < (i8 = this.f2473c) || (i10 == i8 && this.f2474e == 0))) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0156a.k(z8);
                return;
        }
    }

    public int b() {
        return ((this.f2474e - this.f2473c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.f2473c++;
        a();
    }

    public boolean d(int i7) {
        int i8 = this.d;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f2474e + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f2473c) {
                break;
            } else if (q(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.f2473c;
        if (i10 < i12) {
            return true;
        }
        if (i10 == i12 && i11 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z7;
        int i7 = this.d;
        int i8 = this.f2474e;
        int i9 = 0;
        while (this.d < this.f2473c && !h()) {
            i9++;
        }
        if (this.d == this.f2473c) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.d = i7;
        this.f2474e = i8;
        if (z7 || !d((i9 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z7;
        if (this.d == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        return this.f2473c;
    }

    public int g() {
        return (this.f2473c * 8) + this.d;
    }

    public boolean h() {
        boolean z7;
        boolean z8;
        boolean z9;
        switch (this.f2471a) {
            case 1:
                if ((this.f2472b[this.f2473c] & (128 >> this.d)) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                r();
                return z7;
            case 2:
                if ((this.f2472b[this.d] & (128 >> this.f2474e)) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                r();
                return z8;
            default:
                if ((((this.f2472b[this.d] & 255) >> this.f2474e) & 1) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                s(1);
                return z9;
        }
    }

    public int i(int i7) {
        switch (this.f2471a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                this.d += i7;
                int i8 = 0;
                while (true) {
                    int i9 = this.d;
                    if (i9 > 8) {
                        int i10 = i9 - 8;
                        this.d = i10;
                        byte[] bArr = this.f2472b;
                        int i11 = this.f2473c;
                        this.f2473c = i11 + 1;
                        i8 |= (bArr[i11] & 255) << i10;
                    } else {
                        byte[] bArr2 = this.f2472b;
                        int i12 = this.f2473c;
                        int i13 = ((-1) >>> (32 - i7)) & (i8 | ((bArr2[i12] & 255) >> (8 - i9)));
                        if (i9 == 8) {
                            this.d = 0;
                            this.f2473c = i12 + 1;
                        }
                        a();
                        return i13;
                    }
                }
            case 2:
                this.f2474e += i7;
                int i14 = 0;
                while (true) {
                    int i15 = this.f2474e;
                    int i16 = 2;
                    if (i15 > 8) {
                        int i17 = i15 - 8;
                        this.f2474e = i17;
                        byte[] bArr3 = this.f2472b;
                        int i18 = this.d;
                        i14 |= (bArr3[i18] & 255) << i17;
                        if (!q(i18 + 1)) {
                            i16 = 1;
                        }
                        this.d = i18 + i16;
                    } else {
                        byte[] bArr4 = this.f2472b;
                        int i19 = this.d;
                        int i20 = ((-1) >>> (32 - i7)) & (i14 | ((bArr4[i19] & 255) >> (8 - i15)));
                        if (i15 == 8) {
                            this.f2474e = 0;
                            if (!q(i19 + 1)) {
                                i16 = 1;
                            }
                            this.d = i19 + i16;
                        }
                        a();
                        return i20;
                    }
                }
            default:
                int i21 = this.d;
                int min = Math.min(i7, 8 - this.f2474e);
                int i22 = i21 + 1;
                byte[] bArr5 = this.f2472b;
                int i23 = ((bArr5[i21] & 255) >> this.f2474e) & (255 >> (8 - min));
                while (min < i7) {
                    i23 |= (bArr5[i22] & 255) << min;
                    min += 8;
                    i22++;
                }
                int i24 = i23 & ((-1) >>> (32 - i7));
                s(i7);
                return i24;
        }
    }

    public void j(int i7, byte[] bArr) {
        int i8 = i7 >> 3;
        for (int i9 = 0; i9 < i8; i9++) {
            byte[] bArr2 = this.f2472b;
            int i10 = this.f2473c;
            int i11 = i10 + 1;
            this.f2473c = i11;
            byte b7 = bArr2[i10];
            int i12 = this.d;
            byte b8 = (byte) (b7 << i12);
            bArr[i9] = b8;
            bArr[i9] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b8);
        }
        int i13 = i7 & 7;
        if (i13 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i8] & (255 >> i13));
        bArr[i8] = b9;
        int i14 = this.d;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f2472b;
            int i15 = this.f2473c;
            this.f2473c = i15 + 1;
            bArr[i8] = (byte) (b9 | ((bArr3[i15] & 255) << i14));
            this.d = i14 - 8;
        }
        int i16 = this.d + i13;
        this.d = i16;
        byte[] bArr4 = this.f2472b;
        int i17 = this.f2473c;
        bArr[i8] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i8]);
        if (i16 == 8) {
            this.d = 0;
            this.f2473c = i17 + 1;
        }
        a();
    }

    public void k(int i7, byte[] bArr) {
        boolean z7;
        if (this.d == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        System.arraycopy(this.f2472b, this.f2473c, bArr, 0, i7);
        this.f2473c += i7;
        a();
    }

    public int l() {
        int i7 = 0;
        int i8 = 0;
        while (!h()) {
            i8++;
        }
        int i9 = (1 << i8) - 1;
        if (i8 > 0) {
            i7 = i(i8);
        }
        return i9 + i7;
    }

    public int m() {
        int i7;
        int l7 = l();
        if (l7 % 2 == 0) {
            i7 = -1;
        } else {
            i7 = 1;
        }
        return ((l7 + 1) / 2) * i7;
    }

    public void n(int i7, byte[] bArr) {
        this.f2472b = bArr;
        this.f2473c = 0;
        this.d = 0;
        this.f2474e = i7;
    }

    public void o(y yVar) {
        n(yVar.f4693c, yVar.f4691a);
        p(yVar.f4692b * 8);
    }

    public void p(int i7) {
        int i8 = i7 / 8;
        this.f2473c = i8;
        this.d = i7 - (i8 * 8);
        a();
    }

    public boolean q(int i7) {
        if (2 <= i7 && i7 < this.f2473c) {
            byte[] bArr = this.f2472b;
            if (bArr[i7] == 3 && bArr[i7 - 2] == 0 && bArr[i7 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void r() {
        switch (this.f2471a) {
            case 1:
                int i7 = this.d + 1;
                this.d = i7;
                if (i7 == 8) {
                    this.d = 0;
                    this.f2473c++;
                }
                a();
                return;
            default:
                int i8 = 1;
                int i9 = this.f2474e + 1;
                this.f2474e = i9;
                if (i9 == 8) {
                    this.f2474e = 0;
                    int i10 = this.d;
                    if (q(i10 + 1)) {
                        i8 = 2;
                    }
                    this.d = i10 + i8;
                }
                a();
                return;
        }
    }

    public void s(int i7) {
        int i8;
        switch (this.f2471a) {
            case 1:
                int i9 = i7 / 8;
                int i10 = this.f2473c + i9;
                this.f2473c = i10;
                int i11 = (i7 - (i9 * 8)) + this.d;
                this.d = i11;
                if (i11 > 7) {
                    this.f2473c = i10 + 1;
                    this.d = i11 - 8;
                }
                a();
                return;
            case 2:
                int i12 = this.d;
                int i13 = i7 / 8;
                int i14 = i12 + i13;
                this.d = i14;
                int i15 = (i7 - (i13 * 8)) + this.f2474e;
                this.f2474e = i15;
                if (i15 > 7) {
                    this.d = i14 + 1;
                    this.f2474e = i15 - 8;
                }
                while (true) {
                    i12++;
                    if (i12 <= this.d) {
                        if (q(i12)) {
                            this.d++;
                            i12 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            default:
                int i16 = i7 / 8;
                int i17 = this.d + i16;
                this.d = i17;
                int i18 = (i7 - (i16 * 8)) + this.f2474e;
                this.f2474e = i18;
                boolean z7 = true;
                if (i18 > 7) {
                    this.d = i17 + 1;
                    this.f2474e = i18 - 8;
                }
                int i19 = this.d;
                if (i19 < 0 || (i19 >= (i8 = this.f2473c) && (i19 != i8 || this.f2474e != 0))) {
                    z7 = false;
                }
                AbstractC0156a.k(z7);
                return;
        }
    }

    public void t(int i7) {
        boolean z7;
        if (this.d == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        this.f2473c += i7;
        a();
    }

    public f(int i7, int i8) {
        this.f2471a = 0;
        this.f2473c = i7;
        this.d = i8;
        this.f2472b = new byte[(i8 * 2) - 1];
        this.f2474e = 0;
    }

    public f(int i7, byte[] bArr) {
        this.f2471a = 1;
        this.f2472b = bArr;
        this.f2474e = i7;
    }

    public f(byte[] bArr) {
        this.f2471a = 3;
        this.f2472b = bArr;
        this.f2473c = bArr.length;
    }

    public f(byte[] bArr, int i7, int i8) {
        this.f2471a = 2;
        this.f2472b = bArr;
        this.d = i7;
        this.f2473c = i8;
        this.f2474e = 0;
        a();
    }
}
