package w6;

import v6.A;
import v6.C1341f;
import v6.u;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f16122a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(U5.a.f3474a);
        M5.g.e(bytes, "this as java.lang.String).getBytes(charset)");
        f16122a = bytes;
    }

    public static final boolean a(A a7, int i7, byte[] bArr, int i8) {
        int i9 = a7.f15356c;
        byte[] bArr2 = a7.f15354a;
        for (int i10 = 1; i10 < i8; i10++) {
            if (i7 == i9) {
                a7 = a7.f;
                M5.g.c(a7);
                i7 = a7.f15355b;
                i9 = a7.f15356c;
                bArr2 = a7.f15354a;
            }
            if (bArr2[i7] != bArr[i10]) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public static final String b(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "<this>");
        if (j7 > 0) {
            long j8 = j7 - 1;
            if (c1341f.y(j8) == 13) {
                String a02 = c1341f.a0(j8, U5.a.f3474a);
                c1341f.p(2L);
                return a02;
            }
        }
        String a03 = c1341f.a0(j7, U5.a.f3474a);
        c1341f.p(1L);
        return a03;
    }

    public static final int c(C1341f c1341f, u uVar, boolean z7) {
        int i7;
        int i8;
        boolean z8;
        A a7;
        byte[] bArr;
        int i9;
        M5.g.f(c1341f, "<this>");
        M5.g.f(uVar, "options");
        A a8 = c1341f.f15387q;
        int i10 = -2;
        if (a8 == null) {
            if (z7) {
                return -2;
            }
            return -1;
        }
        int i11 = a8.f15355b;
        int i12 = a8.f15356c;
        byte[] bArr2 = a8.f15354a;
        A a9 = a8;
        int i13 = -1;
        int i14 = 0;
        loop0: while (true) {
            int i15 = i14 + 1;
            int[] iArr = uVar.f15415r;
            int i16 = iArr[i14];
            int i17 = i14 + 2;
            int i18 = iArr[i15];
            if (i18 != -1) {
                i13 = i18;
            }
            if (a9 == null) {
                break;
            }
            if (i16 < 0) {
                int i19 = (i16 * (-1)) + i17;
                while (true) {
                    int i20 = i11 + 1;
                    int i21 = i17 + 1;
                    if ((bArr2[i11] & 255) != iArr[i17]) {
                        return i13;
                    }
                    if (i21 == i19) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (i20 == i12) {
                        M5.g.c(a9);
                        A a10 = a9.f;
                        M5.g.c(a10);
                        i9 = a10.f15355b;
                        int i22 = a10.f15356c;
                        bArr = a10.f15354a;
                        if (a10 == a8) {
                            if (!z8) {
                                break loop0;
                            }
                            i12 = i22;
                            a7 = null;
                        } else {
                            a7 = a10;
                            i12 = i22;
                        }
                    } else {
                        a7 = a9;
                        bArr = bArr2;
                        i9 = i20;
                    }
                    if (z8) {
                        i7 = iArr[i21];
                        i8 = i9;
                        bArr2 = bArr;
                        a9 = a7;
                        break;
                    }
                    i11 = i9;
                    bArr2 = bArr;
                    a9 = a7;
                    i17 = i21;
                }
            } else {
                int i23 = i11 + 1;
                int i24 = bArr2[i11] & 255;
                int i25 = i17 + i16;
                while (i17 != i25) {
                    if (i24 == iArr[i17]) {
                        i7 = iArr[i17 + i16];
                        if (i23 == i12) {
                            a9 = a9.f;
                            M5.g.c(a9);
                            i8 = a9.f15355b;
                            i12 = a9.f15356c;
                            bArr2 = a9.f15354a;
                            if (a9 == a8) {
                                a9 = null;
                            }
                        } else {
                            i8 = i23;
                        }
                    } else {
                        i17++;
                    }
                }
                return i13;
            }
            if (i7 >= 0) {
                return i7;
            }
            i14 = -i7;
            i11 = i8;
            i10 = -2;
        }
        if (z7) {
            return i10;
        }
        return i13;
    }
}
