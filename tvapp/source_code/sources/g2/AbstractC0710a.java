package g2;

import Z2.AbstractC0156a;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.m0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
/* renamed from: g2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0710a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f10661a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f10662b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f10663c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f10664e = {24000, 22050, 16000};
    public static final int[] f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f10665g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f10666h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f10667i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f10668j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f10669k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f10670l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f10671m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] n = {44100, 48000, 32000};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f10672o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f10673p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f10674q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f10675r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f10676s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static int b(int i7, int i8) {
        int i9 = i8 / 2;
        if (i7 >= 0 && i7 < 3 && i8 >= 0 && i9 < 19) {
            int i10 = d[i7];
            if (i10 == 44100) {
                return ((i8 % 2) + f10666h[i9]) * 2;
            }
            int i11 = f10665g[i9];
            if (i10 == 32000) {
                return i11 * 6;
            }
            return i11 * 4;
        }
        return -1;
    }

    public static void c(int i7, Z2.y yVar) {
        yVar.C(7);
        byte[] bArr = yVar.f4691a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i7 >> 16) & 255);
        bArr[5] = (byte) ((i7 >> 8) & 255);
        bArr[6] = (byte) (i7 & 255);
    }

    public static int d(int i7) {
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i7 & (-2097152)) == -2097152) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = n[i11];
        if (i8 == 2) {
            i14 /= 2;
        } else if (i8 == 0) {
            i14 /= 4;
        }
        int i15 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            if (i8 == 3) {
                i13 = f10672o[i10 - 1];
            } else {
                i13 = f10673p[i10 - 1];
            }
            return (((i13 * 12) / i14) + i15) * 4;
        }
        if (i8 == 3) {
            if (i9 == 2) {
                i12 = f10674q[i10 - 1];
            } else {
                i12 = f10675r[i10 - 1];
            }
        } else {
            i12 = f10676s[i10 - 1];
        }
        int i16 = 144;
        if (i8 == 3) {
            return ((i12 * 144) / i14) + i15;
        }
        if (i9 == 1) {
            i16 = 72;
        }
        return ((i16 * i12) / i14) + i15;
    }

    public static long e(byte b7, byte b8) {
        int i7;
        int i8;
        int i9 = b7 & 255;
        int i10 = b7 & 3;
        if (i10 != 0) {
            i7 = 2;
            if (i10 != 1 && i10 != 2) {
                i7 = b8 & 63;
            }
        } else {
            i7 = 1;
        }
        int i11 = i9 >> 3;
        int i12 = i11 & 3;
        if (i11 >= 16) {
            i8 = 2500 << i12;
        } else if (i11 >= 12) {
            i8 = 10000 << (i11 & 1);
        } else if (i12 == 3) {
            i8 = 60000;
        } else {
            i8 = 10000 << i12;
        }
        return i7 * i8;
    }

    public static int f(N2.f fVar) {
        int i7 = fVar.i(4);
        if (i7 == 15) {
            if (fVar.b() >= 24) {
                return fVar.i(24);
            }
            throw m0.a("AAC header insufficient data", null);
        } else if (i7 < 13) {
            return f10661a[i7];
        } else {
            throw m0.a("AAC header wrong Sampling Frequency Index", null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
        if (r9 != 8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static F3.m g(N2.f r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.s(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = g2.AbstractC0710a.f10667i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            F3.m r1 = new F3.m
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.AbstractC0710a.g(N2.f):F3.m");
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [g2.P, java.lang.Object] */
    public static P h(N2.f fVar, boolean z7) {
        int i7 = fVar.i(5);
        if (i7 == 31) {
            i7 = fVar.i(6) + 32;
        }
        int f7 = f(fVar);
        int i8 = fVar.i(4);
        String l7 = AbstractC0515y1.l("mp4a.40.", i7);
        if (i7 == 5 || i7 == 29) {
            f7 = f(fVar);
            int i9 = fVar.i(5);
            if (i9 == 31) {
                i9 = fVar.i(6) + 32;
            }
            i7 = i9;
            if (i7 == 22) {
                i8 = fVar.i(4);
            }
        }
        if (z7) {
            if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7 && i7 != 17) {
                switch (i7) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw m0.c("Unsupported audio object type: " + i7);
                }
            }
            if (fVar.h()) {
                AbstractC0156a.K("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (fVar.h()) {
                fVar.s(14);
            }
            boolean h7 = fVar.h();
            if (i8 != 0) {
                if (i7 == 6 || i7 == 20) {
                    fVar.s(3);
                }
                if (h7) {
                    if (i7 == 22) {
                        fVar.s(16);
                    }
                    if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                        fVar.s(3);
                    }
                    fVar.s(1);
                }
                switch (i7) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i10 = fVar.i(2);
                        if (i10 == 2 || i10 == 3) {
                            throw m0.c("Unsupported epConfig: " + i10);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i11 = f10662b[i8];
        if (i11 != -1) {
            ?? obj = new Object();
            obj.f10609a = f7;
            obj.f10610b = i11;
            obj.f10611c = l7;
            return obj;
        }
        throw m0.a(null, null);
    }

    public static int i(int i7) {
        boolean z7;
        int i8;
        int i9;
        if ((i7 & (-2097152)) == -2097152) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = (i7 >>> 12) & 15;
        int i11 = (i7 >>> 10) & 3;
        if (i10 == 0 || i10 == 15 || i11 == 3) {
            return -1;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                return 1152;
            }
            if (i9 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else if (i8 == 3) {
            return 1152;
        } else {
            return 576;
        }
    }
}
