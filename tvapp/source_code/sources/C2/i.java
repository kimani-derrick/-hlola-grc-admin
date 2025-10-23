package C2;

import O3.AbstractC0072p;
import O3.AbstractC0080y;
import O3.C;
import O3.E;
import O3.U;
import Z2.H;
import Z2.y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import x2.C1461c;
import x2.C1463e;
/* loaded from: classes.dex */
public final class i extends h4.b {

    /* renamed from: b  reason: collision with root package name */
    public static final A4.a f403b = new A4.a(1);

    /* renamed from: a  reason: collision with root package name */
    public final g f404a;

    public i(g gVar) {
        this.f404a = gVar;
    }

    public static a K(y yVar, int i7, int i8) {
        int X6;
        String str;
        byte[] copyOfRange;
        int u7 = yVar.u();
        Charset U6 = U(u7);
        int i9 = i7 - 1;
        byte[] bArr = new byte[i9];
        yVar.e(bArr, 0, i9);
        if (i8 == 2) {
            str = "image/" + p6.l.T(new String(bArr, 0, 3, N3.e.f2496b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            X6 = 2;
        } else {
            X6 = X(0, bArr);
            String T6 = p6.l.T(new String(bArr, 0, X6, N3.e.f2496b));
            if (T6.indexOf(47) == -1) {
                str = "image/".concat(T6);
            } else {
                str = T6;
            }
        }
        int i10 = bArr[X6 + 1] & 255;
        int i11 = X6 + 2;
        int W = W(bArr, i11, u7);
        String str2 = new String(bArr, i11, W - i11, U6);
        int T7 = T(u7) + W;
        if (i9 <= T7) {
            copyOfRange = H.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, T7, i9);
        }
        return new a(str, str2, i10, copyOfRange);
    }

    public static c L(y yVar, int i7, int i8, boolean z7, int i9, g gVar) {
        long j7;
        long j8;
        int i10 = yVar.f4692b;
        int X6 = X(i10, yVar.f4691a);
        String str = new String(yVar.f4691a, i10, X6 - i10, N3.e.f2496b);
        yVar.F(X6 + 1);
        int g7 = yVar.g();
        int g8 = yVar.g();
        long v5 = yVar.v();
        if (v5 == 4294967295L) {
            j7 = -1;
        } else {
            j7 = v5;
        }
        long v7 = yVar.v();
        if (v7 == 4294967295L) {
            j8 = -1;
        } else {
            j8 = v7;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = i10 + i7;
        while (yVar.f4692b < i11) {
            j O5 = O(i8, yVar, z7, i9, gVar);
            if (O5 != null) {
                arrayList.add(O5);
            }
        }
        return new c(str, g7, g8, j7, j8, (j[]) arrayList.toArray(new j[0]));
    }

    public static d M(y yVar, int i7, int i8, boolean z7, int i9, g gVar) {
        boolean z8;
        boolean z9;
        int i10 = yVar.f4692b;
        int X6 = X(i10, yVar.f4691a);
        String str = new String(yVar.f4691a, i10, X6 - i10, N3.e.f2496b);
        yVar.F(X6 + 1);
        int u7 = yVar.u();
        if ((u7 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((u7 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int u8 = yVar.u();
        String[] strArr = new String[u8];
        for (int i11 = 0; i11 < u8; i11++) {
            int i12 = yVar.f4692b;
            int X7 = X(i12, yVar.f4691a);
            strArr[i11] = new String(yVar.f4691a, i12, X7 - i12, N3.e.f2496b);
            yVar.F(X7 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i10 + i7;
        while (yVar.f4692b < i13) {
            j O5 = O(i8, yVar, z7, i9, gVar);
            if (O5 != null) {
                arrayList.add(O5);
            }
        }
        return new d(str, z8, z9, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e N(int i7, y yVar) {
        if (i7 < 4) {
            return null;
        }
        int u7 = yVar.u();
        Charset U6 = U(u7);
        byte[] bArr = new byte[3];
        yVar.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i7 - 4;
        byte[] bArr2 = new byte[i8];
        yVar.e(bArr2, 0, i8);
        int W = W(bArr2, 0, u7);
        String str2 = new String(bArr2, 0, W, U6);
        int T6 = T(u7) + W;
        return new e(str, str2, R(bArr2, T6, W(bArr2, T6, u7), U6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0229, code lost:
        if (r14 == 67) goto L112;
     */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [C2.j, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C2.j O(int r20, Z2.y r21, boolean r22, int r23, C2.g r24) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.i.O(int, Z2.y, boolean, int, C2.g):C2.j");
    }

    public static f P(int i7, y yVar) {
        byte[] copyOfRange;
        int u7 = yVar.u();
        Charset U6 = U(u7);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        yVar.e(bArr, 0, i8);
        int X6 = X(0, bArr);
        String str = new String(bArr, 0, X6, N3.e.f2496b);
        int i9 = X6 + 1;
        int W = W(bArr, i9, u7);
        String R6 = R(bArr, i9, W, U6);
        int T6 = T(u7) + W;
        int W6 = W(bArr, T6, u7);
        String R7 = R(bArr, T6, W6, U6);
        int T7 = T(u7) + W6;
        if (i8 <= T7) {
            copyOfRange = H.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, T7, i8);
        }
        return new f(str, R6, R7, copyOfRange);
    }

    public static l Q(int i7, y yVar) {
        int z7 = yVar.z();
        int w7 = yVar.w();
        int w8 = yVar.w();
        int u7 = yVar.u();
        int u8 = yVar.u();
        N2.f fVar = new N2.f();
        fVar.o(yVar);
        int i8 = ((i7 - 10) * 8) / (u7 + u8);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = fVar.i(u7);
            int i11 = fVar.i(u8);
            iArr[i9] = i10;
            iArr2[i9] = i11;
        }
        return new l(z7, w7, w8, iArr, iArr2);
    }

    public static String R(byte[] bArr, int i7, int i8, Charset charset) {
        if (i8 > i7 && i8 <= bArr.length) {
            return new String(bArr, i7, i8 - i7, charset);
        }
        return "";
    }

    public static U S(byte[] bArr, int i7, int i8) {
        Object[] objArr;
        if (i8 >= bArr.length) {
            return E.x("");
        }
        C c5 = E.f2597r;
        AbstractC0072p.c("initialCapacity", 4);
        Object[] objArr2 = new Object[4];
        int W = W(bArr, i8, i7);
        int i9 = 0;
        boolean z7 = false;
        while (i8 < W) {
            String str = new String(bArr, i8, W - i8, U(i7));
            int i10 = i9 + 1;
            if (objArr2.length < i10) {
                objArr = Arrays.copyOf(objArr2, AbstractC0080y.f(objArr2.length, i10));
            } else if (z7) {
                objArr = (Object[]) objArr2.clone();
            } else {
                objArr2[i9] = str;
                int T6 = W + T(i7);
                i9++;
                i8 = T6;
                W = W(bArr, T6, i7);
            }
            objArr2 = objArr;
            z7 = false;
            objArr2[i9] = str;
            int T62 = W + T(i7);
            i9++;
            i8 = T62;
            W = W(bArr, T62, i7);
        }
        U o7 = E.o(i9, objArr2);
        if (o7.isEmpty()) {
            return E.x("");
        }
        return o7;
    }

    public static int T(int i7) {
        if (i7 != 0 && i7 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset U(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return N3.e.f2496b;
                }
                return N3.e.f2497c;
            }
            return N3.e.d;
        }
        return N3.e.f;
    }

    public static String V(int i7, int i8, int i9, int i10, int i11) {
        if (i7 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static int W(byte[] bArr, int i7, int i8) {
        int X6 = X(i7, bArr);
        if (i8 != 0 && i8 != 3) {
            while (X6 < bArr.length - 1) {
                if ((X6 - i7) % 2 == 0 && bArr[X6 + 1] == 0) {
                    return X6;
                }
                X6 = X(X6 + 1, bArr);
            }
            return bArr.length;
        }
        return X6;
    }

    public static int X(int i7, byte[] bArr) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    public static int Y(int i7, y yVar) {
        byte[] bArr = yVar.f4691a;
        int i8 = yVar.f4692b;
        int i9 = i8;
        while (true) {
            int i10 = i9 + 1;
            if (i10 < i8 + i7) {
                if ((bArr[i9] & 255) == 255 && bArr[i10] == 0) {
                    System.arraycopy(bArr, i9 + 2, bArr, i10, (i7 - (i9 - i8)) - 2);
                    i7--;
                }
                i9 = i10;
            } else {
                return i7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean Z(Z2.y r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f4692b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.g()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.v()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.z()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.w()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.w()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.F(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.F(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.F(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.F(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.G(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.F(r2)
            return r4
        Lb0:
            r1.F(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.i.Z(Z2.y, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x2.C1461c J(int r13, byte[] r14) {
        /*
            r12 = this;
            r0 = 4
            r1 = 1
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            Z2.y r4 = new Z2.y
            r4.<init>(r13, r14)
            int r13 = r4.a()
            r14 = 2
            java.lang.String r5 = "Id3Decoder"
            r6 = 10
            r7 = 0
            if (r13 >= r6) goto L21
            java.lang.String r13 = "Data too short to be an ID3 tag"
        L1b:
            Z2.AbstractC0156a.K(r5, r13)
        L1e:
            r10 = r7
            goto L93
        L21:
            int r13 = r4.w()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r13 == r8) goto L3f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r2] = r13
            java.lang.String r13 = "%06X"
            java.lang.String r13 = java.lang.String.format(r13, r8)
            java.lang.String r8 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.String r13 = r8.concat(r13)
            goto L1b
        L3f:
            int r13 = r4.u()
            r4.G(r1)
            int r8 = r4.u()
            int r9 = r4.t()
            if (r13 != r14) goto L57
            r10 = r8 & 64
            if (r10 == 0) goto L7e
            java.lang.String r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            goto L1b
        L57:
            r10 = 3
            if (r13 != r10) goto L68
            r10 = r8 & 64
            if (r10 == 0) goto L7e
            int r10 = r4.g()
            r4.G(r10)
            int r10 = r10 + r0
            int r9 = r9 - r10
            goto L7e
        L68:
            if (r13 != r0) goto L8d
            r10 = r8 & 64
            if (r10 == 0) goto L78
            int r10 = r4.t()
            int r11 = r10 + (-4)
            r4.G(r11)
            int r9 = r9 - r10
        L78:
            r10 = r8 & 16
            if (r10 == 0) goto L7e
            int r9 = r9 + (-10)
        L7e:
            if (r13 >= r0) goto L86
            r8 = r8 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L86
            r8 = r1
            goto L87
        L86:
            r8 = r2
        L87:
            C2.h r10 = new C2.h
            r10.<init>(r13, r9, r8)
            goto L93
        L8d:
            java.lang.String r8 = "Skipped ID3 tag with unsupported majorVersion="
            com.google.android.gms.internal.measurement.AbstractC0515y1.q(r13, r8, r5)
            goto L1e
        L93:
            if (r10 != 0) goto L96
            return r7
        L96:
            int r13 = r4.f4692b
            int r8 = r10.f400a
            if (r8 != r14) goto L9d
            r6 = 6
        L9d:
            int r14 = r10.f402c
            boolean r9 = r10.f401b
            if (r9 == 0) goto La7
            int r14 = Y(r14, r4)
        La7:
            int r13 = r13 + r14
            r4.E(r13)
            boolean r13 = Z(r4, r8, r6, r2)
            if (r13 != 0) goto Lc0
            if (r8 != r0) goto Lba
            boolean r13 = Z(r4, r0, r6, r1)
            if (r13 == 0) goto Lba
            goto Lc1
        Lba:
            java.lang.String r13 = "Failed to validate ID3 tag with majorVersion="
            com.google.android.gms.internal.measurement.AbstractC0515y1.q(r8, r13, r5)
            return r7
        Lc0:
            r1 = r2
        Lc1:
            int r13 = r4.a()
            if (r13 < r6) goto Ld3
            C2.g r13 = r12.f404a
            C2.j r13 = O(r8, r4, r1, r6, r13)
            if (r13 == 0) goto Lc1
            r3.add(r13)
            goto Lc1
        Ld3:
            x2.c r13 = new x2.c
            r13.<init>(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.i.J(int, byte[]):x2.c");
    }

    @Override // h4.b
    public final C1461c q(C1463e c1463e, ByteBuffer byteBuffer) {
        return J(byteBuffer.limit(), byteBuffer.array());
    }
}
