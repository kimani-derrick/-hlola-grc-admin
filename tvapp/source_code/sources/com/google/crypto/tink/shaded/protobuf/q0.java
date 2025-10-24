package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final p6.d f9160a;

    static {
        o0 o0Var;
        if (n0.f9150e && n0.d && !AbstractC0525c.a()) {
            o0Var = new o0(1);
        } else {
            o0Var = new o0(0);
        }
        f9160a = o0Var;
    }

    public static int a(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return d(b7, bArr[i7], bArr[i7 + 1]);
                }
                throw new AssertionError();
            }
            return c(b7, bArr[i7]);
        }
        if (b7 > -12) {
            b7 = -1;
        }
        return b7;
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = charSequence.length();
                while (i8 < length2) {
                    char charAt2 = charSequence.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i8) >= 65536) {
                                i8++;
                            } else {
                                throw new p0(i8, length2);
                            }
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }

    public static int c(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    public static int d(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }

    public static boolean e(byte[] bArr, int i7, int i8) {
        if (f9160a.z(bArr, i7, i8) == 0) {
            return true;
        }
        return false;
    }
}
