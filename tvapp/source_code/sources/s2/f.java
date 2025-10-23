package s2;

import H2.X;
import Z2.H;
import Z2.y;
import android.util.Pair;
import h2.C0746a;
import i2.AbstractC0769a;
import w4.l0;
import x2.C1461c;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f13594a;

    static {
        int i7 = H.f4603a;
        f13594a = "OpusHead".getBytes(N3.e.f2497c);
    }

    public static X a(int i7, y yVar) {
        long j7;
        long j8;
        yVar.F(i7 + 12);
        yVar.G(1);
        b(yVar);
        yVar.G(2);
        int u7 = yVar.u();
        if ((u7 & 128) != 0) {
            yVar.G(2);
        }
        if ((u7 & 64) != 0) {
            yVar.G(yVar.u());
        }
        if ((u7 & 32) != 0) {
            yVar.G(2);
        }
        yVar.G(1);
        b(yVar);
        String e3 = Z2.r.e(yVar.u());
        if (!"audio/mpeg".equals(e3) && !"audio/vnd.dts".equals(e3) && !"audio/vnd.dts.hd".equals(e3)) {
            yVar.G(4);
            long v5 = yVar.v();
            long v7 = yVar.v();
            yVar.G(1);
            int b7 = b(yVar);
            byte[] bArr = new byte[b7];
            yVar.e(bArr, 0, b7);
            if (v7 > 0) {
                j7 = v7;
            } else {
                j7 = -1;
            }
            if (v5 > 0) {
                j8 = v5;
            } else {
                j8 = -1;
            }
            return new X(e3, bArr, j7, j8);
        }
        return new X(e3, null, -1L, -1L);
    }

    public static int b(y yVar) {
        int u7 = yVar.u();
        int i7 = u7 & 127;
        while ((u7 & 128) == 128) {
            u7 = yVar.u();
            i7 = (i7 << 7) | (u7 & 127);
        }
        return i7;
    }

    public static M2.e c(y yVar) {
        long j7;
        yVar.F(8);
        if (AbstractC0769a.e(yVar.g()) == 0) {
            j7 = yVar.v();
            yVar.G(4);
        } else {
            long o7 = yVar.o();
            yVar.G(8);
            j7 = o7;
        }
        return new M2.e(new C1461c(new C0746a((j7 - 2082844800) * 1000)), yVar.v());
    }

    public static Pair d(y yVar, int i7, int i8) {
        boolean z7;
        boolean z8;
        boolean z9;
        Integer num;
        r rVar;
        Pair create;
        int i9;
        int i10;
        boolean z10;
        byte[] bArr;
        int i11 = yVar.f4692b;
        while (i11 - i7 < i8) {
            yVar.F(i11);
            int g7 = yVar.g();
            boolean z11 = false;
            if (g7 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            l0.b("childAtomSize must be positive", z7);
            if (yVar.g() == 1936289382) {
                int i12 = i11 + 8;
                int i13 = 0;
                int i14 = -1;
                String str = null;
                Integer num2 = null;
                while (i12 - i11 < g7) {
                    yVar.F(i12);
                    int g8 = yVar.g();
                    int g9 = yVar.g();
                    if (g9 == 1718775137) {
                        num2 = Integer.valueOf(yVar.g());
                    } else if (g9 == 1935894637) {
                        yVar.G(4);
                        str = yVar.s(4, N3.e.f2497c);
                    } else if (g9 == 1935894633) {
                        i14 = i12;
                        i13 = g8;
                    }
                    i12 += g8;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    l0.b("frma atom is mandatory", z8);
                    if (i14 != -1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    l0.b("schi atom is mandatory", z9);
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 < i13) {
                            yVar.F(i15);
                            int g10 = yVar.g();
                            if (yVar.g() == 1952804451) {
                                int e3 = AbstractC0769a.e(yVar.g());
                                yVar.G(1);
                                if (e3 == 0) {
                                    yVar.G(1);
                                    i9 = 0;
                                    i10 = 0;
                                } else {
                                    int u7 = yVar.u();
                                    i9 = u7 & 15;
                                    i10 = (u7 & 240) >> 4;
                                }
                                if (yVar.u() == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int u8 = yVar.u();
                                byte[] bArr2 = new byte[16];
                                yVar.e(bArr2, 0, 16);
                                if (z10 && u8 == 0) {
                                    int u9 = yVar.u();
                                    byte[] bArr3 = new byte[u9];
                                    yVar.e(bArr3, 0, u9);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                rVar = new r(z10, str, u8, bArr2, i10, i9, bArr);
                            } else {
                                i15 += g10;
                            }
                        } else {
                            num = num2;
                            rVar = null;
                            break;
                        }
                    }
                    if (rVar != null) {
                        z11 = true;
                    }
                    l0.b("tenc atom is mandatory", z11);
                    int i16 = H.f4603a;
                    create = Pair.create(num, rVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i11 += g7;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0515  */
    /* JADX WARN: Type inference failed for: r6v0, types: [s2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Object, O2.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s2.t e(s2.q r43, s2.C1145a r44, k2.C0952q r45) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.f.e(s2.q, s2.a, k2.q):s2.t");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
        if (r11 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0e0b  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0e0d  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0e72 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(s2.C1145a r71, k2.C0952q r72, long r73, j2.i r75, boolean r76, boolean r77, N3.f r78) {
        /*
            Method dump skipped, instructions count: 3707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.f.f(s2.a, k2.q, long, j2.i, boolean, boolean, N3.f):java.util.ArrayList");
    }
}
