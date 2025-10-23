package U5;

import w4.l0;
/* loaded from: classes.dex */
public abstract class m extends l {
    public static Integer T(String str) {
        boolean z7;
        int i7;
        Integer valueOf;
        int i8;
        l0.c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        int i10 = -2147483647;
        if (M5.g.h(charAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i10 = Integer.MIN_VALUE;
                z7 = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z7 = false;
            }
        } else {
            z7 = false;
            i7 = 0;
        }
        int i11 = -59652323;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i8 = i9 * 10) < i10 + digit) {
                return null;
            }
            i9 = i8 - digit;
            i7++;
        }
        if (z7) {
            valueOf = Integer.valueOf(i9);
        } else {
            valueOf = Integer.valueOf(-i9);
        }
        return valueOf;
    }

    public static Long U(String str) {
        boolean z7;
        Long valueOf;
        M5.g.f(str, "<this>");
        l0.c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        long j7 = -9223372036854775807L;
        if (M5.g.h(charAt, 48) < 0) {
            z7 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j7 = Long.MIN_VALUE;
                i7 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z7 = false;
                i7 = 1;
            }
        } else {
            z7 = false;
        }
        long j8 = -256204778801521550L;
        long j9 = 0;
        long j10 = -256204778801521550L;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            if (j9 < j10) {
                if (j10 != j8) {
                    return null;
                }
                j10 = j7 / 10;
                if (j9 < j10) {
                    return null;
                }
            }
            long j11 = j9 * 10;
            long j12 = digit;
            if (j11 < j7 + j12) {
                return null;
            }
            j9 = j11 - j12;
            i7++;
            j8 = -256204778801521550L;
        }
        if (z7) {
            valueOf = Long.valueOf(j9);
        } else {
            valueOf = Long.valueOf(-j9);
        }
        return valueOf;
    }
}
