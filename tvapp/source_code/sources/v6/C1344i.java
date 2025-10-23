package v6;

import a.AbstractC0189a;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
/* renamed from: v6.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1344i implements Serializable, Comparable {

    /* renamed from: t  reason: collision with root package name */
    public static final C1344i f15389t = new C1344i(new byte[0]);

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f15390q;

    /* renamed from: r  reason: collision with root package name */
    public transient int f15391r;

    /* renamed from: s  reason: collision with root package name */
    public transient String f15392s;

    public C1344i(byte[] bArr) {
        M5.g.f(bArr, "data");
        this.f15390q = bArr;
    }

    public static int g(C1344i c1344i, C1344i c1344i2) {
        c1344i.getClass();
        M5.g.f(c1344i2, "other");
        return c1344i.f(0, c1344i2.f15390q);
    }

    public static int k(C1344i c1344i, C1344i c1344i2) {
        c1344i.getClass();
        M5.g.f(c1344i2, "other");
        return c1344i.j(-1234567890, c1344i2.f15390q);
    }

    public static /* synthetic */ C1344i o(C1344i c1344i, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = -1234567890;
        }
        return c1344i.n(i7, i8);
    }

    public String a() {
        byte[] bArr = J.f15371a;
        byte[] bArr2 = this.f15390q;
        M5.g.f(bArr2, "<this>");
        M5.g.f(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            byte b7 = bArr2[i7];
            int i9 = i7 + 2;
            byte b8 = bArr2[i7 + 1];
            i7 += 3;
            byte b9 = bArr2[i9];
            bArr3[i8] = bArr[(b7 & 255) >> 2];
            bArr3[i8 + 1] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            int i10 = i8 + 3;
            bArr3[i8 + 2] = bArr[((b8 & 15) << 2) | ((b9 & 255) >> 6)];
            i8 += 4;
            bArr3[i10] = bArr[b9 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i11 = i7 + 1;
                byte b10 = bArr2[i7];
                byte b11 = bArr2[i11];
                bArr3[i8] = bArr[(b10 & 255) >> 2];
                bArr3[i8 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
                bArr3[i8 + 2] = bArr[(b11 & 15) << 2];
                bArr3[i8 + 3] = 61;
            }
        } else {
            byte b12 = bArr2[i7];
            bArr3[i8] = bArr[(b12 & 255) >> 2];
            bArr3[i8 + 1] = bArr[(b12 & 3) << 4];
            bArr3[i8 + 2] = 61;
            bArr3[i8 + 3] = 61;
        }
        return new String(bArr3, U5.a.f3474a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(v6.C1344i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            M5.g.f(r10, r0)
            int r0 = r9.d()
            int r1 = r10.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.C1344i.compareTo(v6.i):int");
    }

    public C1344i c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f15390q, 0, d());
        byte[] digest = messageDigest.digest();
        M5.g.e(digest, "digestBytes");
        return new C1344i(digest);
    }

    public int d() {
        return this.f15390q.length;
    }

    public String e() {
        byte[] bArr = this.f15390q;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i8 = i7 + 1;
            char[] cArr2 = w6.h.f16123a;
            cArr[i7] = cArr2[(b7 >> 4) & 15];
            i7 += 2;
            cArr[i8] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1344i) {
            C1344i c1344i = (C1344i) obj;
            int d = c1344i.d();
            byte[] bArr = this.f15390q;
            if (d == bArr.length && c1344i.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i7, byte[] bArr) {
        M5.g.f(bArr, "other");
        byte[] bArr2 = this.f15390q;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i7, 0);
        if (max <= length) {
            while (!AbstractC0189a.c(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.f15390q;
    }

    public int hashCode() {
        int i7 = this.f15391r;
        if (i7 == 0) {
            int hashCode = Arrays.hashCode(this.f15390q);
            this.f15391r = hashCode;
            return hashCode;
        }
        return i7;
    }

    public byte i(int i7) {
        return this.f15390q[i7];
    }

    public int j(int i7, byte[] bArr) {
        M5.g.f(bArr, "other");
        int G6 = AbstractC0189a.G(this, i7);
        byte[] bArr2 = this.f15390q;
        for (int min = Math.min(G6, bArr2.length - bArr.length); -1 < min; min--) {
            if (AbstractC0189a.c(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i7, int i8, int i9, byte[] bArr) {
        M5.g.f(bArr, "other");
        if (i7 >= 0) {
            byte[] bArr2 = this.f15390q;
            if (i7 <= bArr2.length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && AbstractC0189a.c(i7, i8, i9, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean m(int i7, C1344i c1344i, int i8) {
        M5.g.f(c1344i, "other");
        return c1344i.l(0, i7, i8, this.f15390q);
    }

    public C1344i n(int i7, int i8) {
        int G6 = AbstractC0189a.G(this, i8);
        if (i7 >= 0) {
            byte[] bArr = this.f15390q;
            if (G6 <= bArr.length) {
                if (G6 - i7 >= 0) {
                    if (i7 == 0 && G6 == bArr.length) {
                        return this;
                    }
                    return new C1344i(A5.j.S(bArr, i7, G6));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public C1344i p() {
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f15390q;
            if (i7 < bArr.length) {
                byte b7 = bArr[i7];
                if (b7 >= 65 && b7 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    M5.g.e(copyOf, "copyOf(this, size)");
                    copyOf[i7] = (byte) (b7 + 32);
                    for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                        byte b8 = copyOf[i8];
                        if (b8 >= 65 && b8 <= 90) {
                            copyOf[i8] = (byte) (b8 + 32);
                        }
                    }
                    return new C1344i(copyOf);
                }
                i7++;
            } else {
                return this;
            }
        }
    }

    public final String q() {
        String str = this.f15392s;
        if (str == null) {
            byte[] h7 = h();
            M5.g.f(h7, "<this>");
            String str2 = new String(h7, U5.a.f3474a);
            this.f15392s = str2;
            return str2;
        }
        return str;
    }

    public void r(C1341f c1341f, int i7) {
        M5.g.f(c1341f, "buffer");
        c1341f.g0(this.f15390q, 0, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0120, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0124, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0130, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x015c, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0163, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x016a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x019b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x019e, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01a1, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01a4, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00b6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f0, code lost:
        if (r6 == 64) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.C1344i.toString():java.lang.String");
    }
}
