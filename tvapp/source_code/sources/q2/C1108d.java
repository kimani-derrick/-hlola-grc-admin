package q2;

import H.j;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.m0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k.C0852F;
import k2.C0943h;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.w;
import k2.x;
/* renamed from: q2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108d implements InterfaceC0946k {

    /* renamed from: c0  reason: collision with root package name */
    public static final byte[] f13330c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f13331d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final byte[] f13332e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final byte[] f13333f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final UUID f13334g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final Map f13335h0;

    /* renamed from: A  reason: collision with root package name */
    public long f13336A;

    /* renamed from: B  reason: collision with root package name */
    public long f13337B;

    /* renamed from: C  reason: collision with root package name */
    public j f13338C;

    /* renamed from: D  reason: collision with root package name */
    public j f13339D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f13340E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public int f13341G;

    /* renamed from: H  reason: collision with root package name */
    public long f13342H;

    /* renamed from: I  reason: collision with root package name */
    public long f13343I;

    /* renamed from: J  reason: collision with root package name */
    public int f13344J;

    /* renamed from: K  reason: collision with root package name */
    public int f13345K;

    /* renamed from: L  reason: collision with root package name */
    public int[] f13346L;

    /* renamed from: M  reason: collision with root package name */
    public int f13347M;

    /* renamed from: N  reason: collision with root package name */
    public int f13348N;

    /* renamed from: O  reason: collision with root package name */
    public int f13349O;

    /* renamed from: P  reason: collision with root package name */
    public int f13350P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f13351Q;

    /* renamed from: R  reason: collision with root package name */
    public long f13352R;

    /* renamed from: S  reason: collision with root package name */
    public int f13353S;

    /* renamed from: T  reason: collision with root package name */
    public int f13354T;

    /* renamed from: U  reason: collision with root package name */
    public int f13355U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f13356V;
    public boolean W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f13357X;

    /* renamed from: Y  reason: collision with root package name */
    public int f13358Y;

    /* renamed from: Z  reason: collision with root package name */
    public byte f13359Z;

    /* renamed from: a  reason: collision with root package name */
    public final C1106b f13360a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f13361a0;

    /* renamed from: b  reason: collision with root package name */
    public final e f13362b;

    /* renamed from: b0  reason: collision with root package name */
    public InterfaceC0948m f13363b0;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray f13364c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final y f13365e;
    public final y f;

    /* renamed from: g  reason: collision with root package name */
    public final y f13366g;

    /* renamed from: h  reason: collision with root package name */
    public final y f13367h;

    /* renamed from: i  reason: collision with root package name */
    public final y f13368i;

    /* renamed from: j  reason: collision with root package name */
    public final y f13369j;

    /* renamed from: k  reason: collision with root package name */
    public final y f13370k;

    /* renamed from: l  reason: collision with root package name */
    public final y f13371l;

    /* renamed from: m  reason: collision with root package name */
    public final y f13372m;
    public final y n;

    /* renamed from: o  reason: collision with root package name */
    public ByteBuffer f13373o;

    /* renamed from: p  reason: collision with root package name */
    public long f13374p;

    /* renamed from: q  reason: collision with root package name */
    public long f13375q;

    /* renamed from: r  reason: collision with root package name */
    public long f13376r;

    /* renamed from: s  reason: collision with root package name */
    public long f13377s;

    /* renamed from: t  reason: collision with root package name */
    public long f13378t;

    /* renamed from: u  reason: collision with root package name */
    public C1107c f13379u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f13380v;

    /* renamed from: w  reason: collision with root package name */
    public int f13381w;

    /* renamed from: x  reason: collision with root package name */
    public long f13382x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f13383y;

    /* renamed from: z  reason: collision with root package name */
    public long f13384z;

    static {
        int i7 = H.f4603a;
        f13331d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(N3.e.f2497c);
        f13332e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f13333f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f13334g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        AbstractC0515y1.r(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC0515y1.r(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f13335h0 = Collections.unmodifiableMap(hashMap);
    }

    public C1108d() {
        C1106b c1106b = new C1106b();
        this.f13375q = -1L;
        this.f13376r = -9223372036854775807L;
        this.f13377s = -9223372036854775807L;
        this.f13378t = -9223372036854775807L;
        this.f13384z = -1L;
        this.f13336A = -1L;
        this.f13337B = -9223372036854775807L;
        this.f13360a = c1106b;
        c1106b.d = new C0852F(9, this);
        this.d = true;
        this.f13362b = new e();
        this.f13364c = new SparseArray();
        this.f13366g = new y(4);
        this.f13367h = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.f13368i = new y(4);
        this.f13365e = new y(AbstractC0156a.d);
        this.f = new y(4);
        this.f13369j = new y();
        this.f13370k = new y();
        this.f13371l = new y(8);
        this.f13372m = new y();
        this.n = new y();
        this.f13346L = new int[1];
    }

    public static byte[] g(long j7, long j8, String str) {
        boolean z7;
        if (j7 != -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        int i7 = (int) (j7 / 3600000000L);
        long j9 = j7 - (i7 * 3600000000L);
        int i8 = (int) (j9 / 60000000);
        long j10 = j9 - (i8 * 60000000);
        int i9 = (int) (j10 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf((int) ((j10 - (i9 * 1000000)) / j8)));
        int i10 = H.f4603a;
        return format.getBytes(N3.e.f2497c);
    }

    public final void b(int i7) {
        if (this.f13338C != null && this.f13339D != null) {
            return;
        }
        throw m0.a("Element " + i7 + " must be in a Cues", null);
    }

    public final void c(int i7) {
        if (this.f13379u != null) {
            return;
        }
        throw m0.a("Element " + i7 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0c2f, code lost:
        if (r0.o() == r2.getLeastSignificantBits()) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0f73, code lost:
        r18 = true;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0c8e  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0e06  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0e08  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0e93  */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v177, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v193 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v14, types: [k2.h] */
    /* JADX WARN: Type inference failed for: r5v9, types: [q2.e] */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r41, U4.k r42) {
        /*
            Method dump skipped, instructions count: 5350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C1108d.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f13363b0 = interfaceC0948m;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(q2.C1107c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C1108d.f(q2.c, long, int, int, int):void");
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        this.f13337B = -9223372036854775807L;
        this.f13341G = 0;
        C1106b c1106b = this.f13360a;
        c1106b.f13282e = 0;
        c1106b.f13280b.clear();
        e eVar = c1106b.f13281c;
        eVar.f13386b = 0;
        eVar.f13387c = 0;
        e eVar2 = this.f13362b;
        eVar2.f13386b = 0;
        eVar2.f13387c = 0;
        k();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f13364c;
            if (i7 < sparseArray.size()) {
                x xVar = ((C1107c) sparseArray.valueAt(i7)).f13302T;
                if (xVar != null) {
                    xVar.f12203b = false;
                    xVar.f12204c = 0;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void i(C0943h c0943h, int i7) {
        y yVar = this.f13366g;
        if (yVar.f4693c >= i7) {
            return;
        }
        byte[] bArr = yVar.f4691a;
        if (bArr.length < i7) {
            yVar.b(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = yVar.f4691a;
        int i8 = yVar.f4693c;
        c0943h.e(bArr2, i8, i7 - i8, false);
        yVar.E(i7);
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        long p3;
        int i7;
        j jVar = new j(6);
        C0943h c0943h = (C0943h) interfaceC0947l;
        long j7 = c0943h.f12165s;
        int i8 = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
        long j8 = 1024;
        if (i8 != 0 && j7 <= 1024) {
            j8 = j7;
        }
        int i9 = (int) j8;
        y yVar = (y) jVar.f794r;
        c0943h.i(yVar.f4691a, 0, 4, false);
        jVar.f793q = 4;
        for (long v5 = yVar.v(); v5 != 440786851; v5 = ((v5 << 8) & (-256)) | (yVar.f4691a[0] & 255)) {
            int i10 = jVar.f793q + 1;
            jVar.f793q = i10;
            if (i10 == i9) {
                return false;
            }
            c0943h.i(yVar.f4691a, 0, 1, false);
        }
        long p5 = jVar.p(c0943h);
        long j9 = jVar.f793q;
        if (p5 == Long.MIN_VALUE) {
            return false;
        }
        if (i8 != 0 && j9 + p5 >= j7) {
            return false;
        }
        while (true) {
            int i11 = (jVar.f793q > (j9 + p5) ? 1 : (jVar.f793q == (j9 + p5) ? 0 : -1));
            if (i11 < 0) {
                if (jVar.p(c0943h) == Long.MIN_VALUE || (jVar.p(c0943h)) < 0 || p3 > 2147483647L) {
                    return false;
                }
                if (i7 != 0) {
                    int i12 = (int) p3;
                    c0943h.a(i12, false);
                    jVar.f793q += i12;
                }
            } else if (i11 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    public final void k() {
        this.f13353S = 0;
        this.f13354T = 0;
        this.f13355U = 0;
        this.f13356V = false;
        this.W = false;
        this.f13357X = false;
        this.f13358Y = 0;
        this.f13359Z = (byte) 0;
        this.f13361a0 = false;
        this.f13369j.C(0);
    }

    public final long l(long j7) {
        long j8 = this.f13376r;
        if (j8 != -9223372036854775807L) {
            return H.O(j7, j8, 1000L);
        }
        throw m0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int m(C0943h c0943h, C1107c c1107c, int i7, boolean z7) {
        int a7;
        int a8;
        boolean z8;
        int i8;
        if ("S_TEXT/UTF8".equals(c1107c.f13308b)) {
            n(c0943h, f13330c0, i7);
            int i9 = this.f13354T;
            k();
            return i9;
        } else if ("S_TEXT/ASS".equals(c1107c.f13308b)) {
            n(c0943h, f13332e0, i7);
            int i10 = this.f13354T;
            k();
            return i10;
        } else if ("S_TEXT/WEBVTT".equals(c1107c.f13308b)) {
            n(c0943h, f13333f0, i7);
            int i11 = this.f13354T;
            k();
            return i11;
        } else {
            w wVar = c1107c.f13305X;
            boolean z9 = this.f13356V;
            boolean z10 = true;
            y yVar = this.f13369j;
            if (!z9) {
                boolean z11 = c1107c.f13312h;
                y yVar2 = this.f13366g;
                if (z11) {
                    this.f13349O &= -1073741825;
                    int i12 = 128;
                    if (!this.W) {
                        c0943h.e(yVar2.f4691a, 0, 1, false);
                        this.f13353S++;
                        byte b7 = yVar2.f4691a[0];
                        if ((b7 & 128) != 128) {
                            this.f13359Z = b7;
                            this.W = true;
                        } else {
                            throw m0.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b8 = this.f13359Z;
                    if ((b8 & 1) == 1) {
                        if ((b8 & 2) == 2) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        this.f13349O |= 1073741824;
                        if (!this.f13361a0) {
                            y yVar3 = this.f13371l;
                            c0943h.e(yVar3.f4691a, 0, 8, false);
                            this.f13353S += 8;
                            this.f13361a0 = true;
                            byte[] bArr = yVar2.f4691a;
                            if (!z8) {
                                i12 = 0;
                            }
                            bArr[0] = (byte) (i12 | 8);
                            yVar2.F(0);
                            wVar.b(1, yVar2);
                            this.f13354T++;
                            yVar3.F(0);
                            wVar.b(8, yVar3);
                            this.f13354T += 8;
                        }
                        if (z8) {
                            if (!this.f13357X) {
                                c0943h.e(yVar2.f4691a, 0, 1, false);
                                this.f13353S++;
                                yVar2.F(0);
                                this.f13358Y = yVar2.u();
                                this.f13357X = true;
                            }
                            int i13 = this.f13358Y * 4;
                            yVar2.C(i13);
                            c0943h.e(yVar2.f4691a, 0, i13, false);
                            this.f13353S += i13;
                            short s6 = (short) ((this.f13358Y / 2) + 1);
                            int i14 = (s6 * 6) + 2;
                            ByteBuffer byteBuffer = this.f13373o;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f13373o = ByteBuffer.allocate(i14);
                            }
                            this.f13373o.position(0);
                            this.f13373o.putShort(s6);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i8 = this.f13358Y;
                                if (i15 >= i8) {
                                    break;
                                }
                                int x7 = yVar2.x();
                                if (i15 % 2 == 0) {
                                    this.f13373o.putShort((short) (x7 - i16));
                                } else {
                                    this.f13373o.putInt(x7 - i16);
                                }
                                i15++;
                                i16 = x7;
                            }
                            int i17 = (i7 - this.f13353S) - i16;
                            int i18 = i8 % 2;
                            ByteBuffer byteBuffer2 = this.f13373o;
                            if (i18 == 1) {
                                byteBuffer2.putInt(i17);
                            } else {
                                byteBuffer2.putShort((short) i17);
                                this.f13373o.putInt(0);
                            }
                            byte[] array = this.f13373o.array();
                            y yVar4 = this.f13372m;
                            yVar4.D(i14, array);
                            wVar.b(i14, yVar4);
                            this.f13354T += i14;
                        }
                    }
                } else {
                    byte[] bArr2 = c1107c.f13313i;
                    if (bArr2 != null) {
                        yVar.D(bArr2.length, bArr2);
                    }
                }
                if (!"A_OPUS".equals(c1107c.f13308b) ? c1107c.f > 0 : z7) {
                    this.f13349O |= 268435456;
                    this.n.C(0);
                    int i19 = (yVar.f4693c + i7) - this.f13353S;
                    yVar2.C(4);
                    byte[] bArr3 = yVar2.f4691a;
                    bArr3[0] = (byte) ((i19 >> 24) & 255);
                    bArr3[1] = (byte) ((i19 >> 16) & 255);
                    bArr3[2] = (byte) ((i19 >> 8) & 255);
                    bArr3[3] = (byte) (i19 & 255);
                    wVar.b(4, yVar2);
                    this.f13354T += 4;
                }
                this.f13356V = true;
            }
            int i20 = i7 + yVar.f4693c;
            if (!"V_MPEG4/ISO/AVC".equals(c1107c.f13308b) && !"V_MPEGH/ISO/HEVC".equals(c1107c.f13308b)) {
                if (c1107c.f13302T != null) {
                    if (yVar.f4693c != 0) {
                        z10 = false;
                    }
                    AbstractC0156a.k(z10);
                    c1107c.f13302T.c(c0943h);
                }
                while (true) {
                    int i21 = this.f13353S;
                    if (i21 >= i20) {
                        break;
                    }
                    int i22 = i20 - i21;
                    int a9 = yVar.a();
                    if (a9 > 0) {
                        a8 = Math.min(i22, a9);
                        wVar.d(a8, yVar);
                    } else {
                        a8 = wVar.a(c0943h, i22, false);
                    }
                    this.f13353S += a8;
                    this.f13354T += a8;
                }
            } else {
                y yVar5 = this.f;
                byte[] bArr4 = yVar5.f4691a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i23 = c1107c.f13306Y;
                int i24 = 4 - i23;
                while (this.f13353S < i20) {
                    int i25 = this.f13355U;
                    if (i25 == 0) {
                        int min = Math.min(i23, yVar.a());
                        c0943h.e(bArr4, i24 + min, i23 - min, false);
                        if (min > 0) {
                            yVar.e(bArr4, i24, min);
                        }
                        this.f13353S += i23;
                        yVar5.F(0);
                        this.f13355U = yVar5.x();
                        y yVar6 = this.f13365e;
                        yVar6.F(0);
                        wVar.d(4, yVar6);
                        this.f13354T += 4;
                    } else {
                        int a10 = yVar.a();
                        if (a10 > 0) {
                            a7 = Math.min(i25, a10);
                            wVar.d(a7, yVar);
                        } else {
                            a7 = wVar.a(c0943h, i25, false);
                        }
                        this.f13353S += a7;
                        this.f13354T += a7;
                        this.f13355U -= a7;
                    }
                }
            }
            if ("A_VORBIS".equals(c1107c.f13308b)) {
                y yVar7 = this.f13367h;
                yVar7.F(0);
                wVar.d(4, yVar7);
                this.f13354T += 4;
            }
            int i26 = this.f13354T;
            k();
            return i26;
        }
    }

    public final void n(C0943h c0943h, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        y yVar = this.f13370k;
        byte[] bArr2 = yVar.f4691a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i7);
            yVar.D(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c0943h.e(yVar.f4691a, bArr.length, i7, false);
        yVar.F(0);
        yVar.E(length);
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
