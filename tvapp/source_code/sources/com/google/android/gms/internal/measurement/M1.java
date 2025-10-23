package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class M1 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile N3.g f8374a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0442j2 f8375b = new C0442j2(9);

    public static double a(int i7, byte[] bArr) {
        return Double.longBitsToDouble(r(i7, bArr));
    }

    public static int b(int i7, byte[] bArr, int i8, int i9, InterfaceC0481r2 interfaceC0481r2, Z1 z12) {
        C0462n2 c0462n2 = (C0462n2) interfaceC0481r2;
        int p3 = p(bArr, i8, z12);
        while (true) {
            c0462n2.g(z12.f8498a);
            if (p3 >= i9) {
                break;
            }
            int p5 = p(bArr, p3, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            p3 = p(bArr, p5, z12);
        }
        return p3;
    }

    public static int c(int i7, byte[] bArr, int i8, int i9, M2 m22, Z1 z12) {
        Object f;
        if ((i7 >>> 3) != 0) {
            int i10 = i7 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                m22.c(i7, Integer.valueOf(o(i8, bArr)));
                                return i8 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        M2 e3 = M2.e();
                        int i11 = (i7 & (-8)) | 4;
                        int i12 = 0;
                        while (true) {
                            if (i8 >= i9) {
                                break;
                            }
                            int p3 = p(bArr, i8, z12);
                            int i13 = z12.f8498a;
                            i12 = i13;
                            if (i13 != i11) {
                                int c5 = c(i12, bArr, p3, i9, e3, z12);
                                i12 = i13;
                                i8 = c5;
                            } else {
                                i8 = p3;
                                break;
                            }
                        }
                        if (i8 <= i9 && i12 == i11) {
                            m22.c(i7, e3);
                            return i8;
                        }
                        throw C0496u2.d();
                    }
                    int p5 = p(bArr, i8, z12);
                    int i14 = z12.f8498a;
                    if (i14 >= 0) {
                        if (i14 <= bArr.length - p5) {
                            if (i14 == 0) {
                                f = C0407c2.f8526s;
                            } else {
                                f = C0407c2.f(bArr, p5, i14);
                            }
                            m22.c(i7, f);
                            return p5 + i14;
                        }
                        throw C0496u2.e();
                    }
                    throw C0496u2.c();
                }
                m22.c(i7, Long.valueOf(r(i8, bArr)));
                return i8 + 8;
            }
            int q5 = q(bArr, i8, z12);
            m22.c(i7, Long.valueOf(z12.f8499b));
            return q5;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int d(int i7, byte[] bArr, int i8, Z1 z12) {
        int i9;
        int i10 = i7 & 127;
        int i11 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            i9 = b7 << 7;
        } else {
            int i12 = i10 | ((b7 & Byte.MAX_VALUE) << 7);
            int i13 = i8 + 2;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                z12.f8498a = i12 | (b8 << 14);
                return i13;
            }
            i10 = i12 | ((b8 & Byte.MAX_VALUE) << 14);
            i11 = i8 + 3;
            byte b9 = bArr[i13];
            if (b9 >= 0) {
                i9 = b9 << 21;
            } else {
                int i14 = i10 | ((b9 & Byte.MAX_VALUE) << 21);
                int i15 = i8 + 4;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    z12.f8498a = i14 | (b10 << 28);
                    return i15;
                }
                int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i17 = i15 + 1;
                    if (bArr[i15] >= 0) {
                        z12.f8498a = i16;
                        return i17;
                    }
                    i15 = i17;
                }
            }
        }
        z12.f8498a = i10 | i9;
        return i11;
    }

    public static int e(L2 l22, int i7, byte[] bArr, int i8, int i9, InterfaceC0481r2 interfaceC0481r2, Z1 z12) {
        AbstractC0457m2 a7 = l22.a();
        int h7 = h(a7, l22, bArr, i8, i9, z12);
        l22.f(a7);
        z12.f8500c = a7;
        interfaceC0481r2.add(a7);
        while (h7 < i9) {
            int p3 = p(bArr, h7, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            AbstractC0457m2 a8 = l22.a();
            int h8 = h(a8, l22, bArr, p3, i9, z12);
            l22.f(a8);
            z12.f8500c = a8;
            interfaceC0481r2.add(a8);
            h7 = h8;
        }
        return h7;
    }

    public static int f(L2 l22, byte[] bArr, int i7, int i8, int i9, Z1 z12) {
        AbstractC0457m2 a7 = l22.a();
        int g7 = g(a7, l22, bArr, i7, i8, i9, z12);
        l22.f(a7);
        z12.f8500c = a7;
        return g7;
    }

    public static int g(Object obj, L2 l22, byte[] bArr, int i7, int i8, int i9, Z1 z12) {
        int k5 = ((D2) l22).k(obj, bArr, i7, i8, i9, z12);
        z12.f8500c = obj;
        return k5;
    }

    public static int h(Object obj, L2 l22, byte[] bArr, int i7, int i8, Z1 z12) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = d(i10, bArr, i9, z12);
            i10 = z12.f8498a;
        }
        int i11 = i9;
        if (i10 >= 0 && i10 <= i8 - i11) {
            int i12 = i10 + i11;
            l22.e(obj, bArr, i11, i12, z12);
            z12.f8500c = obj;
            return i12;
        }
        throw C0496u2.e();
    }

    public static int i(byte[] bArr, int i7, Z1 z12) {
        int p3 = p(bArr, i7, z12);
        int i8 = z12.f8498a;
        if (i8 >= 0) {
            if (i8 <= bArr.length - p3) {
                if (i8 == 0) {
                    z12.f8500c = C0407c2.f8526s;
                    return p3;
                }
                z12.f8500c = C0407c2.f(bArr, p3, i8);
                return p3 + i8;
            }
            throw C0496u2.e();
        }
        throw C0496u2.c();
    }

    public static int j(byte[] bArr, int i7, InterfaceC0481r2 interfaceC0481r2, Z1 z12) {
        C0462n2 c0462n2 = (C0462n2) interfaceC0481r2;
        int p3 = p(bArr, i7, z12);
        int i8 = z12.f8498a + p3;
        while (p3 < i8) {
            p3 = p(bArr, p3, z12);
            c0462n2.g(z12.f8498a);
        }
        if (p3 == i8) {
            return p3;
        }
        throw C0496u2.e();
    }

    public static InterfaceC0464o k(InterfaceC0439j interfaceC0439j, C0474q c0474q, C4.b bVar, ArrayList arrayList) {
        String str = c0474q.f8646q;
        if (interfaceC0439j.f(str)) {
            InterfaceC0464o b7 = interfaceC0439j.b(str);
            if (b7 instanceof AbstractC0444k) {
                return ((AbstractC0444k) b7).a(bVar, arrayList);
            }
            throw new IllegalArgumentException(AbstractC0515y1.m(str, " is not a function"));
        } else if ("hasOwnProperty".equals(str)) {
            Q.i("hasOwnProperty", 1, arrayList);
            if (interfaceC0439j.f(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).g())) {
                return InterfaceC0464o.f8625j;
            }
            return InterfaceC0464o.f8626k;
        } else {
            throw new IllegalArgumentException(AbstractC0515y1.x("Object has no function ", str));
        }
    }

    public static String l(C0407c2 c0407c2) {
        String str;
        StringBuilder sb = new StringBuilder(c0407c2.h());
        for (int i7 = 0; i7 < c0407c2.h(); i7++) {
            int b7 = c0407c2.b(i7);
            if (b7 != 34) {
                if (b7 != 39) {
                    if (b7 != 92) {
                        switch (b7) {
                            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case 9:
                                str = "\\t";
                                break;
                            case 10:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case 12:
                                str = "\\f";
                                break;
                            case 13:
                                str = "\\r";
                                break;
                            default:
                                if (b7 < 32 || b7 > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((b7 >>> 6) & 3) + 48));
                                    sb.append((char) (((b7 >>> 3) & 7) + 48));
                                    b7 = (b7 & 7) + 48;
                                }
                                sb.append((char) b7);
                                continue;
                                break;
                        }
                    } else {
                        str = "\\\\";
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static float m(int i7, byte[] bArr) {
        return Float.intBitsToFloat(o(i7, bArr));
    }

    public static int n(byte[] bArr, int i7, Z1 z12) {
        int p3 = p(bArr, i7, z12);
        int i8 = z12.f8498a;
        if (i8 >= 0) {
            if (i8 == 0) {
                z12.f8500c = "";
                return p3;
            }
            R2.f8412a.getClass();
            if ((p3 | i8 | ((bArr.length - p3) - i8)) >= 0) {
                int i9 = p3 + i8;
                char[] cArr = new char[i8];
                int i10 = 0;
                while (p3 < i9) {
                    byte b7 = bArr[p3];
                    if (b7 < 0) {
                        break;
                    }
                    p3++;
                    cArr[i10] = (char) b7;
                    i10++;
                }
                while (p3 < i9) {
                    int i11 = p3 + 1;
                    byte b8 = bArr[p3];
                    if (b8 >= 0) {
                        int i12 = i10 + 1;
                        cArr[i10] = (char) b8;
                        while (i11 < i9) {
                            byte b9 = bArr[i11];
                            if (b9 < 0) {
                                break;
                            }
                            i11++;
                            cArr[i12] = (char) b9;
                            i12++;
                        }
                        i10 = i12;
                        p3 = i11;
                    } else if (b8 < -32) {
                        if (i11 < i9) {
                            p3 += 2;
                            byte b10 = bArr[i11];
                            int i13 = i10 + 1;
                            if (b8 >= -62 && !AbstractC0447k2.d(b10)) {
                                cArr[i10] = (char) ((b10 & 63) | ((b8 & 31) << 6));
                                i10 = i13;
                            } else {
                                throw C0496u2.b();
                            }
                        } else {
                            throw C0496u2.b();
                        }
                    } else if (b8 < -16) {
                        if (i11 < i9 - 1) {
                            int i14 = p3 + 2;
                            byte b11 = bArr[i11];
                            p3 += 3;
                            byte b12 = bArr[i14];
                            int i15 = i10 + 1;
                            if (!AbstractC0447k2.d(b11) && ((b8 != -32 || b11 >= -96) && ((b8 != -19 || b11 < -96) && !AbstractC0447k2.d(b12)))) {
                                cArr[i10] = (char) (((b11 & 63) << 6) | ((b8 & 15) << 12) | (b12 & 63));
                                i10 = i15;
                            } else {
                                throw C0496u2.b();
                            }
                        } else {
                            throw C0496u2.b();
                        }
                    } else if (i11 < i9 - 2) {
                        byte b13 = bArr[i11];
                        int i16 = p3 + 3;
                        byte b14 = bArr[p3 + 2];
                        p3 += 4;
                        byte b15 = bArr[i16];
                        int i17 = i10 + 1;
                        if (!AbstractC0447k2.d(b13) && (((b13 + 112) + (b8 << 28)) >> 30) == 0 && !AbstractC0447k2.d(b14) && !AbstractC0447k2.d(b15)) {
                            int i18 = ((b13 & 63) << 12) | ((b8 & 7) << 18) | ((b14 & 63) << 6) | (b15 & 63);
                            cArr[i10] = (char) ((i18 >>> 10) + 55232);
                            cArr[i17] = (char) ((i18 & 1023) + 56320);
                            i10 += 2;
                        } else {
                            throw C0496u2.b();
                        }
                    } else {
                        throw C0496u2.b();
                    }
                }
                z12.f8500c = new String(cArr, 0, i10);
                return i9;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(p3), Integer.valueOf(i8)));
        }
        throw C0496u2.c();
    }

    public static int o(int i7, byte[] bArr) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int p(byte[] bArr, int i7, Z1 z12) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 >= 0) {
            z12.f8498a = b7;
            return i8;
        }
        return d(b7, bArr, i8, z12);
    }

    public static int q(byte[] bArr, int i7, Z1 z12) {
        byte b7;
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 >= 0) {
            z12.f8499b = j7;
            return i8;
        }
        int i9 = i7 + 2;
        byte b8 = bArr[i8];
        long j8 = (j7 & 127) | ((b8 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b8 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (b7 & Byte.MAX_VALUE) << i10;
            b8 = bArr[i9];
            i9 = i11;
        }
        z12.f8499b = j8;
        return i9;
    }

    public static long r(int i7, byte[] bArr) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }
}
