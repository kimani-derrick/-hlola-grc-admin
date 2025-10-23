package com.google.android.gms.internal.measurement;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class R2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0442j2 f8412a;

    static {
        if (Q2.f8401e) {
            boolean z7 = Q2.d;
        }
        f8412a = new C0442j2(13);
    }

    public static int a(String str) {
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = str.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = str.length();
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) >= 65536) {
                                i8++;
                            } else {
                                throw new S2(i8, length2);
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
        throw new IllegalArgumentException(AbstractC1111a.o(i9 + 4294967296L, "UTF-8 length does not fit in int: "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.R2.b(java.lang.String, byte[], int, int):int");
    }

    public static /* synthetic */ int c(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            if (b7 > -12) {
                return -1;
            }
            return b7;
        } else if (i9 == 1) {
            byte b8 = bArr[i7];
            if (b7 > -12 || b8 > -65) {
                return -1;
            }
            return (b8 << 8) ^ b7;
        } else if (i9 == 2) {
            byte b9 = bArr[i7];
            byte b10 = bArr[i7 + 1];
            if (b7 > -12 || b9 > -65 || b10 > -65) {
                return -1;
            }
            return (b10 << 16) ^ ((b9 << 8) ^ b7);
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(byte[] r6, int r7, int r8) {
        /*
            com.google.android.gms.internal.measurement.j2 r0 = com.google.android.gms.internal.measurement.R2.f8412a
            r0.getClass()
        L5:
            if (r7 >= r8) goto Le
            r0 = r6[r7]
            if (r0 < 0) goto Le
            int r7 = r7 + 1
            goto L5
        Le:
            if (r7 < r8) goto L11
            goto L5b
        L11:
            if (r7 < r8) goto L14
            goto L5b
        L14:
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L7a
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L2e
            if (r0 < r8) goto L23
            goto L59
        L23:
            r2 = -62
            if (r1 < r2) goto L78
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto L11
            goto L78
        L2e:
            r4 = -16
            if (r1 >= r4) goto L54
            int r4 = r8 + (-1)
            if (r0 < r4) goto L3b
        L36:
            int r1 = c(r6, r0, r8)
            goto L59
        L3b:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L78
            r5 = -96
            if (r1 != r2) goto L47
            if (r0 < r5) goto L78
        L47:
            r2 = -19
            if (r1 != r2) goto L4d
            if (r0 >= r5) goto L78
        L4d:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto L11
            goto L78
        L54:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5d
            goto L36
        L59:
            if (r1 != 0) goto L78
        L5b:
            r6 = 1
            return r6
        L5d:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L78
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L78
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L78
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 <= r3) goto L11
        L78:
            r6 = 0
            return r6
        L7a:
            r7 = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.R2.d(byte[], int, int):boolean");
    }
}
