package a3;

import H2.d0;
import O3.AbstractC0080y;
import O3.C;
import O3.E;
import O3.U;
import Z2.AbstractC0156a;
import Z2.H;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0;
import e2.C0593J;
import e2.K;
import e2.SurfaceHolder$CallbackC0629y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import u4.C1288l;
import w2.AbstractC1396r;
import w2.C1387i;
import w2.C1390l;
import w2.C1392n;
import w2.C1397s;
import w2.C1398t;
import w2.C1400v;
import w2.InterfaceC1389k;
/* loaded from: classes.dex */
public final class i extends AbstractC1396r {

    /* renamed from: D1  reason: collision with root package name */
    public static final int[] f5044D1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: E1  reason: collision with root package name */
    public static boolean f5045E1;

    /* renamed from: F1  reason: collision with root package name */
    public static boolean f5046F1;

    /* renamed from: A1  reason: collision with root package name */
    public int f5047A1;

    /* renamed from: B1  reason: collision with root package name */
    public C0208h f5048B1;

    /* renamed from: C1  reason: collision with root package name */
    public o f5049C1;

    /* renamed from: V0  reason: collision with root package name */
    public final Context f5050V0;

    /* renamed from: W0  reason: collision with root package name */
    public final t f5051W0;

    /* renamed from: X0  reason: collision with root package name */
    public final y f5052X0;

    /* renamed from: Y0  reason: collision with root package name */
    public final L0.b f5053Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public final long f5054Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final int f5055a1;

    /* renamed from: b1  reason: collision with root package name */
    public final boolean f5056b1;

    /* renamed from: c1  reason: collision with root package name */
    public F3.m f5057c1;
    public boolean d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f5058e1;

    /* renamed from: f1  reason: collision with root package name */
    public Surface f5059f1;

    /* renamed from: g1  reason: collision with root package name */
    public k f5060g1;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f5061h1;

    /* renamed from: i1  reason: collision with root package name */
    public int f5062i1;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f5063j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f5064k1;
    public boolean l1;

    /* renamed from: m1  reason: collision with root package name */
    public long f5065m1;

    /* renamed from: n1  reason: collision with root package name */
    public long f5066n1;

    /* renamed from: o1  reason: collision with root package name */
    public long f5067o1;

    /* renamed from: p1  reason: collision with root package name */
    public int f5068p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f5069q1;

    /* renamed from: r1  reason: collision with root package name */
    public int f5070r1;

    /* renamed from: s1  reason: collision with root package name */
    public long f5071s1;

    /* renamed from: t1  reason: collision with root package name */
    public long f5072t1;

    /* renamed from: u1  reason: collision with root package name */
    public long f5073u1;

    /* renamed from: v1  reason: collision with root package name */
    public int f5074v1;

    /* renamed from: w1  reason: collision with root package name */
    public long f5075w1;

    /* renamed from: x1  reason: collision with root package name */
    public z f5076x1;

    /* renamed from: y1  reason: collision with root package name */
    public z f5077y1;

    /* renamed from: z1  reason: collision with root package name */
    public boolean f5078z1;

    public i(Context context, C1288l c1288l, Handler handler, SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y) {
        super(2, c1288l, 30.0f);
        this.f5054Z0 = 5000L;
        this.f5055a1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f5050V0 = applicationContext;
        t tVar = new t(applicationContext);
        this.f5051W0 = tVar;
        this.f5052X0 = new y(handler, surfaceHolder$CallbackC0629y, 0);
        this.f5053Y0 = new L0.b(tVar, this);
        this.f5056b1 = "NVIDIA".equals(H.f4605c);
        this.f5066n1 = -9223372036854775807L;
        this.f5062i1 = 1;
        this.f5076x1 = z.f5137u;
        this.f5047A1 = 0;
        this.f5077y1 = null;
    }

    public static boolean s0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (i.class) {
            try {
                if (!f5045E1) {
                    f5046F1 = t0();
                    f5045E1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5046F1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0844, code lost:
        if (r0.equals("PGN528") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t0() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i.t0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        if (r4.equals("video/hevc") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int u0(w2.C1392n r10, e2.K r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i.u0(w2.n, e2.K):int");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [O3.y, O3.B] */
    public static List v0(Context context, C1397s c1397s, K k5, boolean z7, boolean z8) {
        List e3;
        List e7;
        String str = k5.f9655B;
        if (str == null) {
            C c5 = E.f2597r;
            return U.f2621u;
        }
        if (H.f4603a >= 26 && "video/dolby-vision".equals(str) && !AbstractC0207g.a(context)) {
            String b7 = w2.y.b(k5);
            if (b7 == null) {
                C c6 = E.f2597r;
                e7 = U.f2621u;
            } else {
                c1397s.getClass();
                e7 = w2.y.e(b7, z7, z8);
            }
            if (!e7.isEmpty()) {
                return e7;
            }
        }
        Pattern pattern = w2.y.f15864a;
        c1397s.getClass();
        List e8 = w2.y.e(k5.f9655B, z7, z8);
        String b8 = w2.y.b(k5);
        if (b8 == null) {
            C c7 = E.f2597r;
            e3 = U.f2621u;
        } else {
            e3 = w2.y.e(b8, z7, z8);
        }
        C c8 = E.f2597r;
        ?? abstractC0080y = new AbstractC0080y();
        abstractC0080y.e(e8);
        abstractC0080y.e(e3);
        return abstractC0080y.h();
    }

    public static int w0(C1392n c1392n, K k5) {
        if (k5.f9656C != -1) {
            List list = k5.f9657D;
            int size = list.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                i7 += ((byte[]) list.get(i8)).length;
            }
            return k5.f9656C + i7;
        }
        return u0(c1392n, k5);
    }

    public final void A0(InterfaceC1389k interfaceC1389k, int i7) {
        AbstractC0156a.b("releaseOutputBuffer");
        interfaceC1389k.j(i7, true);
        AbstractC0156a.s();
        this.f15821Q0.f11343e++;
        this.f5069q1 = 0;
        this.f5053Y0.getClass();
        this.f5072t1 = SystemClock.elapsedRealtime() * 1000;
        z0(this.f5076x1);
        y0();
    }

    @Override // w2.AbstractC1396r
    public final i2.i B(C1392n c1392n, K k5, K k7) {
        int i7;
        i2.i b7 = c1392n.b(k5, k7);
        F3.m mVar = this.f5057c1;
        int i8 = mVar.f726a;
        int i9 = k7.f9659G;
        int i10 = b7.f11361e;
        if (i9 > i8 || k7.f9660H > mVar.f727b) {
            i10 |= 256;
        }
        if (w0(c1392n, k7) > this.f5057c1.f728c) {
            i10 |= 64;
        }
        int i11 = i10;
        if (i11 != 0) {
            i7 = 0;
        } else {
            i7 = b7.d;
        }
        return new i2.i(c1392n.f15781a, k5, k7, i7, i11);
    }

    public final void B0(InterfaceC1389k interfaceC1389k, int i7, long j7) {
        AbstractC0156a.b("releaseOutputBuffer");
        interfaceC1389k.f(j7, i7);
        AbstractC0156a.s();
        this.f15821Q0.f11343e++;
        this.f5069q1 = 0;
        this.f5053Y0.getClass();
        this.f5072t1 = SystemClock.elapsedRealtime() * 1000;
        z0(this.f5076x1);
        y0();
    }

    @Override // w2.AbstractC1396r
    public final C1390l C(IllegalStateException illegalStateException, C1392n c1392n) {
        Surface surface = this.f5059f1;
        C1390l c1390l = new C1390l(illegalStateException, c1392n);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c1390l;
    }

    public final boolean C0(long j7, long j8) {
        boolean z7;
        boolean z8;
        if (this.f9937w == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.l1 ? this.f5063j1 : !z7 && !this.f5064k1) {
            z8 = false;
        } else {
            z8 = true;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.f5072t1;
        if (this.f5066n1 != -9223372036854775807L || j7 < this.f15823R0.f15792b) {
            return false;
        }
        if (!z8 && (!z7 || j8 >= -30000 || elapsedRealtime <= 100000)) {
            return false;
        }
        return true;
    }

    public final boolean D0(C1392n c1392n) {
        if (H.f4603a >= 23 && !this.f5078z1 && !s0(c1392n.f15781a) && (!c1392n.f || k.d(this.f5050V0))) {
            return true;
        }
        return false;
    }

    public final void E0(InterfaceC1389k interfaceC1389k, int i7) {
        AbstractC0156a.b("skipVideoBuffer");
        interfaceC1389k.j(i7, false);
        AbstractC0156a.s();
        this.f15821Q0.f++;
    }

    public final void F0(int i7, int i8) {
        i2.e eVar = this.f15821Q0;
        eVar.f11345h += i7;
        int i9 = i7 + i8;
        eVar.f11344g += i9;
        this.f5068p1 += i9;
        int i10 = this.f5069q1 + i9;
        this.f5069q1 = i10;
        eVar.f11346i = Math.max(i10, eVar.f11346i);
        int i11 = this.f5055a1;
        if (i11 > 0 && this.f5068p1 >= i11) {
            x0();
        }
    }

    public final void G0(long j7) {
        i2.e eVar = this.f15821Q0;
        eVar.f11348k += j7;
        eVar.f11349l++;
        this.f5073u1 += j7;
        this.f5074v1++;
    }

    @Override // w2.AbstractC1396r
    public final boolean K() {
        if (this.f5078z1 && H.f4603a < 23) {
            return true;
        }
        return false;
    }

    @Override // w2.AbstractC1396r
    public final float L(float f, K[] kArr) {
        float f7 = -1.0f;
        for (K k5 : kArr) {
            float f8 = k5.f9661I;
            if (f8 != -1.0f) {
                f7 = Math.max(f7, f8);
            }
        }
        if (f7 == -1.0f) {
            return -1.0f;
        }
        return f7 * f;
    }

    @Override // w2.AbstractC1396r
    public final ArrayList M(C1397s c1397s, K k5, boolean z7) {
        List v02 = v0(this.f5050V0, c1397s, k5, z7, this.f5078z1);
        Pattern pattern = w2.y.f15864a;
        ArrayList arrayList = new ArrayList(v02);
        Collections.sort(arrayList, new C1398t(new H2.U(29, k5)));
        return arrayList;
    }

    @Override // w2.AbstractC1396r
    public final C1387i N(C1392n c1392n, K k5, MediaCrypto mediaCrypto, float f) {
        int i7;
        C0202b c0202b;
        int i8;
        F3.m mVar;
        boolean z7;
        int i9;
        int i10;
        Point point;
        float f7;
        int i11;
        int i12;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        K[] kArr;
        int i13;
        char c5;
        boolean z8;
        int i14;
        boolean z9;
        Pair d;
        int u02;
        k kVar = this.f5060g1;
        if (kVar != null && kVar.f5086q != c1392n.f) {
            if (this.f5059f1 == kVar) {
                this.f5059f1 = null;
            }
            kVar.release();
            this.f5060g1 = null;
        }
        String str = c1392n.f15783c;
        K[] kArr2 = this.f9939y;
        kArr2.getClass();
        int i15 = k5.f9659G;
        int w02 = w0(c1392n, k5);
        int length = kArr2.length;
        float f8 = k5.f9661I;
        int i16 = k5.f9659G;
        C0202b c0202b2 = k5.f9666N;
        int i17 = k5.f9660H;
        if (length == 1) {
            if (w02 != -1 && (u02 = u0(c1392n, k5)) != -1) {
                w02 = Math.min((int) (w02 * 1.5f), u02);
            }
            mVar = new F3.m(i15, i17, w02);
            i7 = i16;
            c0202b = c0202b2;
            i8 = i17;
        } else {
            int length2 = kArr2.length;
            int i18 = i17;
            int i19 = 0;
            boolean z10 = false;
            while (i19 < length2) {
                K k7 = kArr2[i19];
                if (c0202b2 != null) {
                    kArr = kArr2;
                    if (k7.f9666N == null) {
                        C0593J a7 = k7.a();
                        a7.f9616w = c0202b2;
                        k7 = new K(a7);
                    }
                } else {
                    kArr = kArr2;
                }
                if (c1392n.b(k5, k7).d != 0) {
                    int i20 = k7.f9660H;
                    i13 = length2;
                    int i21 = k7.f9659G;
                    c5 = 65535;
                    if (i21 != -1 && i20 != -1) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    z10 |= z8;
                    i15 = Math.max(i15, i21);
                    i18 = Math.max(i18, i20);
                    w02 = Math.max(w02, w0(c1392n, k7));
                } else {
                    i13 = length2;
                    c5 = 65535;
                }
                i19++;
                kArr2 = kArr;
                length2 = i13;
            }
            if (z10) {
                AbstractC0156a.K("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i15 + "x" + i18);
                if (i17 > i16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i9 = i17;
                } else {
                    i9 = i16;
                }
                if (z7) {
                    i10 = i16;
                    c0202b = c0202b2;
                } else {
                    c0202b = c0202b2;
                    i10 = i17;
                }
                float f9 = i10 / i9;
                int[] iArr = f5044D1;
                i7 = i16;
                i8 = i17;
                int i22 = 0;
                while (i22 < 9) {
                    int i23 = iArr[i22];
                    int[] iArr2 = iArr;
                    int i24 = (int) (i23 * f9);
                    if (i23 <= i9 || i24 <= i10) {
                        break;
                    }
                    int i25 = i9;
                    int i26 = i10;
                    if (H.f4603a >= 21) {
                        if (z7) {
                            i12 = i24;
                        } else {
                            i12 = i23;
                        }
                        if (!z7) {
                            i23 = i24;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = c1392n.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f7 = f9;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f7 = f9;
                            point2 = new Point(H.g(i12, widthAlignment) * widthAlignment, H.g(i23, heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (c1392n.f(point2.x, point2.y, f8)) {
                            point = point3;
                            break;
                        }
                        i22++;
                        iArr = iArr2;
                        i9 = i25;
                        i10 = i26;
                        f9 = f7;
                    } else {
                        f7 = f9;
                        try {
                            int g7 = H.g(i23, 16) * 16;
                            int g8 = H.g(i24, 16) * 16;
                            if (g7 * g8 <= w2.y.i()) {
                                if (z7) {
                                    i11 = g8;
                                } else {
                                    i11 = g7;
                                }
                                if (!z7) {
                                    g7 = g8;
                                }
                                point = new Point(i11, g7);
                            } else {
                                i22++;
                                iArr = iArr2;
                                i9 = i25;
                                i10 = i26;
                                f9 = f7;
                            }
                        } catch (C1400v unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i15 = Math.max(i15, point.x);
                    i18 = Math.max(i18, point.y);
                    C0593J a8 = k5.a();
                    a8.f9609p = i15;
                    a8.f9610q = i18;
                    w02 = Math.max(w02, u0(c1392n, new K(a8)));
                    AbstractC0156a.K("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i15 + "x" + i18);
                }
            } else {
                i7 = i16;
                c0202b = c0202b2;
                i8 = i17;
            }
            mVar = new F3.m(i15, i18, w02);
        }
        this.f5057c1 = mVar;
        if (this.f5078z1) {
            i14 = this.f5047A1;
        } else {
            i14 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i7);
        mediaFormat.setInteger("height", i8);
        AbstractC0156a.I(mediaFormat, k5.f9657D);
        if (f8 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f8);
        }
        AbstractC0156a.C(mediaFormat, "rotation-degrees", k5.f9662J);
        if (c0202b != null) {
            C0202b c0202b3 = c0202b;
            AbstractC0156a.C(mediaFormat, "color-transfer", c0202b3.f5024s);
            AbstractC0156a.C(mediaFormat, "color-standard", c0202b3.f5022q);
            AbstractC0156a.C(mediaFormat, "color-range", c0202b3.f5023r);
            byte[] bArr = c0202b3.f5025t;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(k5.f9655B) && (d = w2.y.d(k5)) != null) {
            AbstractC0156a.C(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", mVar.f726a);
        mediaFormat.setInteger("max-height", mVar.f727b);
        AbstractC0156a.C(mediaFormat, "max-input-size", mVar.f728c);
        if (H.f4603a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f5056b1) {
            z9 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z9 = true;
        }
        if (i14 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z9);
            mediaFormat.setInteger("audio-session-id", i14);
        }
        if (this.f5059f1 == null) {
            if (D0(c1392n)) {
                if (this.f5060g1 == null) {
                    this.f5060g1 = k.e(this.f5050V0, c1392n.f);
                }
                this.f5059f1 = this.f5060g1;
            } else {
                throw new IllegalStateException();
            }
        }
        this.f5053Y0.getClass();
        return new C1387i(c1392n, mediaFormat, k5, this.f5059f1, mediaCrypto);
    }

    @Override // w2.AbstractC1396r
    public final void O(i2.g gVar) {
        if (!this.f5058e1) {
            return;
        }
        ByteBuffer byteBuffer = gVar.f11354w;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b7 = byteBuffer.get();
            short s6 = byteBuffer.getShort();
            short s7 = byteBuffer.getShort();
            byte b8 = byteBuffer.get();
            byte b9 = byteBuffer.get();
            byteBuffer.position(0);
            if (b7 == -75 && s6 == 60 && s7 == 1 && b8 == 4) {
                if (b9 == 0 || b9 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    InterfaceC1389k interfaceC1389k = this.f15832Z;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    interfaceC1389k.i(bundle);
                }
            }
        }
    }

    @Override // w2.AbstractC1396r
    public final void S(Exception exc) {
        AbstractC0156a.r("MediaCodecVideoRenderer", "Video codec error", exc);
        y yVar = this.f5052X0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new A4.d(yVar, 8, exc));
        }
    }

    @Override // w2.AbstractC1396r
    public final void T(long j7, long j8, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        y yVar = this.f5052X0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new x(yVar, str, j7, j8, 0));
        }
        this.d1 = s0(str);
        C1392n c1392n = this.f15839g0;
        c1392n.getClass();
        boolean z7 = false;
        if (H.f4603a >= 29 && "video/x-vnd.on2.vp9".equals(c1392n.f15782b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c1392n.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (codecProfileLevelArr[i7].profile == 16384) {
                    z7 = true;
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f5058e1 = z7;
        int i8 = H.f4603a;
        if (i8 >= 23 && this.f5078z1) {
            InterfaceC1389k interfaceC1389k = this.f15832Z;
            interfaceC1389k.getClass();
            this.f5048B1 = new C0208h(this, interfaceC1389k);
        }
        Context context = ((i) this.f5053Y0.f1863b).f5050V0;
        if (i8 >= 29) {
            int i9 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    @Override // w2.AbstractC1396r
    public final void U(String str) {
        y yVar = this.f5052X0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new A4.d(yVar, 7, str));
        }
    }

    @Override // w2.AbstractC1396r
    public final i2.i V(D d) {
        i2.i V6 = super.V(d);
        K k5 = (K) d.f5884s;
        y yVar = this.f5052X0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new H2.E(yVar, k5, V6, 2));
        }
        return V6;
    }

    @Override // w2.AbstractC1396r
    public final void W(K k5, MediaFormat mediaFormat) {
        boolean z7;
        int integer;
        int integer2;
        int i7;
        int i8;
        InterfaceC1389k interfaceC1389k = this.f15832Z;
        if (interfaceC1389k != null) {
            interfaceC1389k.n(this.f5062i1);
        }
        boolean z8 = true;
        if (this.f5078z1) {
            i8 = k5.f9659G;
            i7 = k5.f9660H;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z7) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i9 = integer;
            i7 = integer2;
            i8 = i9;
        }
        float f = k5.f9663K;
        if (H.f4603a < 21) {
            z8 = false;
        }
        L0.b bVar = this.f5053Y0;
        int i10 = k5.f9662J;
        if (z8) {
            if (i10 != 90 && i10 != 270) {
                i10 = 0;
            } else {
                f = 1.0f / f;
                i10 = 0;
                int i11 = i7;
                i7 = i8;
                i8 = i11;
            }
        } else {
            bVar.getClass();
        }
        this.f5076x1 = new z(f, i8, i7, i10);
        float f7 = k5.f9661I;
        t tVar = this.f5051W0;
        tVar.f = f7;
        C0204d c0204d = tVar.f5107a;
        c0204d.f5033a.c();
        c0204d.f5034b.c();
        c0204d.f5035c = false;
        c0204d.d = -9223372036854775807L;
        c0204d.f5036e = 0;
        tVar.d();
        bVar.getClass();
    }

    @Override // w2.AbstractC1396r
    public final void Y(long j7) {
        super.Y(j7);
        if (!this.f5078z1) {
            this.f5070r1--;
        }
    }

    @Override // w2.AbstractC1396r
    public final void Z() {
        r0();
    }

    @Override // w2.AbstractC1396r
    public final void a0(i2.g gVar) {
        boolean z7 = this.f5078z1;
        if (!z7) {
            this.f5070r1++;
        }
        if (H.f4603a < 23 && z7) {
            long j7 = gVar.f11353v;
            q0(j7);
            z0(this.f5076x1);
            this.f15821Q0.f11343e++;
            y0();
            Y(j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:19:0x004c, B:21:0x0052, B:23:0x0056, B:24:0x007a, B:27:0x007d, B:28:0x0092), top: B:31:0x004c }] */
    @Override // w2.AbstractC1396r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(e2.K r10) {
        /*
            r9 = this;
            r0 = 0
            L0.b r1 = r9.f5053Y0
            r1.getClass()
            w2.q r2 = r9.f15823R0
            long r2 = r2.f15792b
            boolean r2 = r1.f1862a
            if (r2 != 0) goto Lf
            goto L17
        Lf:
            java.lang.Object r2 = r1.f1864c
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            if (r2 != 0) goto L18
            r1.f1862a = r0
        L17:
            return
        L18:
            r2 = 0
            Z2.H.n(r2)
            r1.getClass()
            a3.b r3 = r10.f9666N
            java.lang.Object r1 = r1.f1863b
            a3.i r1 = (a3.i) r1
            r1.getClass()
            if (r3 == 0) goto L47
            r4 = 6
            r5 = 7
            int r6 = r3.f5024s
            if (r6 == r5) goto L32
            if (r6 != r4) goto L49
        L32:
            if (r6 != r5) goto L43
            a3.b r5 = new a3.b
            int r6 = r3.f5022q
            int r7 = r3.f5023r
            byte[] r8 = r3.f5025t
            r5.<init>(r6, r7, r4, r8)
            android.util.Pair.create(r3, r5)
            goto L4c
        L43:
            android.util.Pair.create(r3, r3)
            goto L4c
        L47:
            a3.b r3 = a3.C0202b.f5017v
        L49:
            a3.b r3 = a3.C0202b.f5017v
            goto L43
        L4c:
            int r3 = Z2.H.f4603a     // Catch: java.lang.Exception -> L7b
            r4 = 21
            if (r3 >= r4) goto L7d
            int r3 = r10.f9662J     // Catch: java.lang.Exception -> L7b
            if (r3 == 0) goto L7d
            float r3 = (float) r3     // Catch: java.lang.Exception -> L7b
            a.AbstractC0189a.B()     // Catch: java.lang.Exception -> L7b
            java.lang.reflect.Constructor r4 = a.AbstractC0189a.f4956c     // Catch: java.lang.Exception -> L7b
            java.lang.Object r4 = r4.newInstance(r2)     // Catch: java.lang.Exception -> L7b
            java.lang.reflect.Method r5 = a.AbstractC0189a.d     // Catch: java.lang.Exception -> L7b
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L7b
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L7b
            r6[r0] = r3     // Catch: java.lang.Exception -> L7b
            r5.invoke(r4, r6)     // Catch: java.lang.Exception -> L7b
            java.lang.reflect.Method r3 = a.AbstractC0189a.f4957e     // Catch: java.lang.Exception -> L7b
            java.lang.Object r3 = r3.invoke(r4, r2)     // Catch: java.lang.Exception -> L7b
            r3.getClass()     // Catch: java.lang.Exception -> L7b
            r0.AbstractC1111a.w(r3)     // Catch: java.lang.Exception -> L7b
            throw r2     // Catch: java.lang.Exception -> L7b
        L7b:
            r2 = move-exception
            goto L93
        L7d:
            a.AbstractC0189a.B()     // Catch: java.lang.Exception -> L7b
            java.lang.reflect.Constructor r3 = a.AbstractC0189a.f     // Catch: java.lang.Exception -> L7b
            java.lang.Object r3 = r3.newInstance(r2)     // Catch: java.lang.Exception -> L7b
            java.lang.reflect.Method r4 = a.AbstractC0189a.f4958g     // Catch: java.lang.Exception -> L7b
            java.lang.Object r3 = r4.invoke(r3, r2)     // Catch: java.lang.Exception -> L7b
            r3.getClass()     // Catch: java.lang.Exception -> L7b
            r0.AbstractC1111a.w(r3)     // Catch: java.lang.Exception -> L7b
            throw r2     // Catch: java.lang.Exception -> L7b
        L93:
            r3 = 7000(0x1b58, float:9.809E-42)
            e2.l r10 = r1.e(r2, r10, r0, r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i.b0(e2.K):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.Surface] */
    @Override // e2.AbstractC0600d, e2.w0
    public final void c(int i7, Object obj) {
        k kVar;
        k kVar2;
        long j7;
        Surface surface;
        t tVar = this.f5051W0;
        L0.b bVar = this.f5053Y0;
        if (i7 != 1) {
            if (i7 != 7) {
                if (i7 != 10) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 13) {
                                if (i7 == 14) {
                                    obj.getClass();
                                    Z2.z zVar = (Z2.z) obj;
                                    if (zVar.f4695a != 0 && zVar.f4696b != 0 && (surface = this.f5059f1) != null) {
                                        Pair pair = (Pair) bVar.d;
                                        if (pair == null || !((Surface) pair.first).equals(surface) || !((Z2.z) ((Pair) bVar.d).second).equals(zVar)) {
                                            bVar.d = Pair.create(surface, zVar);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) bVar.f1864c;
                            if (copyOnWriteArrayList == null) {
                                bVar.f1864c = new CopyOnWriteArrayList(list);
                                return;
                            }
                            copyOnWriteArrayList.clear();
                            ((CopyOnWriteArrayList) bVar.f1864c).addAll(list);
                            return;
                        }
                        int intValue = ((Integer) obj).intValue();
                        if (tVar.f5114j != intValue) {
                            tVar.f5114j = intValue;
                            tVar.e(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.f5062i1 = intValue2;
                    InterfaceC1389k interfaceC1389k = this.f15832Z;
                    if (interfaceC1389k != null) {
                        interfaceC1389k.n(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.f5047A1 != intValue3) {
                    this.f5047A1 = intValue3;
                    if (this.f5078z1) {
                        f0();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f5049C1 = (o) obj;
            return;
        }
        if (obj instanceof Surface) {
            kVar = (Surface) obj;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            k kVar3 = this.f5060g1;
            if (kVar3 != null) {
                kVar = kVar3;
            } else {
                C1392n c1392n = this.f15839g0;
                if (c1392n != null && D0(c1392n)) {
                    kVar = k.e(this.f5050V0, c1392n.f);
                    this.f5060g1 = kVar;
                }
            }
        }
        Surface surface2 = this.f5059f1;
        y yVar = this.f5052X0;
        if (surface2 != kVar) {
            this.f5059f1 = kVar;
            tVar.getClass();
            if (kVar instanceof k) {
                kVar2 = null;
            } else {
                kVar2 = kVar;
            }
            if (tVar.f5110e != kVar2) {
                tVar.b();
                tVar.f5110e = kVar2;
                tVar.e(true);
            }
            this.f5061h1 = false;
            int i8 = this.f9937w;
            InterfaceC1389k interfaceC1389k2 = this.f15832Z;
            if (interfaceC1389k2 != null) {
                bVar.getClass();
                if (H.f4603a >= 23 && kVar != null && !this.d1) {
                    interfaceC1389k2.h(kVar);
                } else {
                    f0();
                    Q();
                }
            }
            if (kVar != null && kVar != this.f5060g1) {
                z zVar2 = this.f5077y1;
                if (zVar2 != null) {
                    yVar.c(zVar2);
                }
                r0();
                if (i8 == 2) {
                    long j8 = this.f5054Z0;
                    if (j8 > 0) {
                        j7 = SystemClock.elapsedRealtime() + j8;
                    } else {
                        j7 = -9223372036854775807L;
                    }
                    this.f5066n1 = j7;
                }
            } else {
                this.f5077y1 = null;
                r0();
            }
            bVar.getClass();
        } else if (kVar != null && kVar != this.f5060g1) {
            z zVar3 = this.f5077y1;
            if (zVar3 != null) {
                yVar.c(zVar3);
            }
            if (this.f5061h1) {
                Surface surface3 = this.f5059f1;
                Handler handler = yVar.f5135b;
                if (handler != null) {
                    handler.post(new v(yVar, surface3, SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // w2.AbstractC1396r
    public final boolean d0(long j7, long j8, InterfaceC1389k interfaceC1389k, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, K k5) {
        long j10;
        interfaceC1389k.getClass();
        if (this.f5065m1 == -9223372036854775807L) {
            this.f5065m1 = j7;
        }
        int i10 = (j9 > this.f5071s1 ? 1 : (j9 == this.f5071s1 ? 0 : -1));
        L0.b bVar = this.f5053Y0;
        t tVar = this.f5051W0;
        if (i10 != 0) {
            bVar.getClass();
            tVar.c(j9);
            this.f5071s1 = j9;
        }
        long j11 = j9 - this.f15823R0.f15792b;
        if (z7 && !z8) {
            E0(interfaceC1389k, i7);
            return true;
        }
        boolean z9 = this.f9937w == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j12 = (long) ((j9 - j7) / this.f15830X);
        if (z9) {
            j12 -= elapsedRealtime - j8;
        }
        if (this.f5059f1 == this.f5060g1) {
            if (j12 < -30000) {
                E0(interfaceC1389k, i7);
                G0(j12);
                return true;
            }
            return false;
        } else if (C0(j7, j12)) {
            bVar.getClass();
            bVar.getClass();
            long nanoTime = System.nanoTime();
            o oVar = this.f5049C1;
            if (oVar != null) {
                oVar.d(j11, nanoTime, k5, this.f15834b0);
            }
            if (H.f4603a >= 21) {
                B0(interfaceC1389k, i7, nanoTime);
            } else {
                A0(interfaceC1389k, i7);
            }
            G0(j12);
            return true;
        } else if (!z9 || j7 == this.f5065m1) {
            return false;
        } else {
            long nanoTime2 = System.nanoTime();
            long a7 = tVar.a((j12 * 1000) + nanoTime2);
            bVar.getClass();
            long j13 = (a7 - nanoTime2) / 1000;
            boolean z10 = this.f5066n1 != -9223372036854775807L;
            if (j13 >= -500000 || z8) {
                j10 = j11;
            } else {
                d0 d0Var = this.f9938x;
                d0Var.getClass();
                j10 = j11;
                int x7 = d0Var.x(j7 - this.f9940z);
                if (x7 != 0) {
                    i2.e eVar = this.f15821Q0;
                    if (z10) {
                        eVar.d += x7;
                        eVar.f += this.f5070r1;
                    } else {
                        eVar.f11347j++;
                        F0(x7, this.f5070r1);
                    }
                    if (I()) {
                        Q();
                        return false;
                    }
                    return false;
                }
            }
            if (j13 < -30000 && !z8) {
                if (z10) {
                    E0(interfaceC1389k, i7);
                } else {
                    AbstractC0156a.b("dropVideoBuffer");
                    interfaceC1389k.j(i7, false);
                    AbstractC0156a.s();
                    F0(0, 1);
                }
                G0(j13);
                return true;
            }
            if (H.f4603a >= 21) {
                if (j13 < 50000) {
                    if (a7 == this.f5075w1) {
                        E0(interfaceC1389k, i7);
                    } else {
                        o oVar2 = this.f5049C1;
                        if (oVar2 != null) {
                            oVar2.d(j10, a7, k5, this.f15834b0);
                        }
                        B0(interfaceC1389k, i7, a7);
                    }
                    G0(j13);
                    this.f5075w1 = a7;
                    return true;
                }
            } else if (j13 < 30000) {
                if (j13 > 11000) {
                    try {
                        Thread.sleep((j13 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                o oVar3 = this.f5049C1;
                if (oVar3 != null) {
                    oVar3.d(j10, a7, k5, this.f15834b0);
                }
                A0(interfaceC1389k, i7);
                G0(j13);
                return true;
            }
            return false;
        }
    }

    @Override // e2.AbstractC0600d
    public final String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // w2.AbstractC1396r
    public final void h0() {
        super.h0();
        this.f5070r1 = 0;
    }

    @Override // e2.AbstractC0600d
    public final boolean j() {
        boolean z7 = this.f15813M0;
        this.f5053Y0.getClass();
        return z7;
    }

    @Override // w2.AbstractC1396r, e2.AbstractC0600d
    public final boolean k() {
        k kVar;
        if (super.k()) {
            this.f5053Y0.getClass();
            if (this.f5063j1 || (((kVar = this.f5060g1) != null && this.f5059f1 == kVar) || this.f15832Z == null || this.f5078z1)) {
                this.f5066n1 = -9223372036854775807L;
                return true;
            }
        }
        if (this.f5066n1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f5066n1) {
            return true;
        }
        this.f5066n1 = -9223372036854775807L;
        return false;
    }

    @Override // w2.AbstractC1396r, e2.AbstractC0600d
    public final void l() {
        y yVar = this.f5052X0;
        this.f5077y1 = null;
        r0();
        this.f5061h1 = false;
        this.f5048B1 = null;
        try {
            super.l();
            i2.e eVar = this.f15821Q0;
            yVar.getClass();
            synchronized (eVar) {
            }
            Handler handler = yVar.f5135b;
            if (handler != null) {
                handler.post(new w(yVar, eVar, 0));
            }
            yVar.c(z.f5137u);
        } catch (Throwable th) {
            yVar.a(this.f15821Q0);
            yVar.c(z.f5137u);
            throw th;
        }
    }

    @Override // w2.AbstractC1396r
    public final boolean l0(C1392n c1392n) {
        if (this.f5059f1 == null && !D0(c1392n)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [i2.e, java.lang.Object] */
    @Override // e2.AbstractC0600d
    public final void m(boolean z7, boolean z8) {
        boolean z9;
        this.f15821Q0 = new Object();
        C0 c02 = this.f9934t;
        c02.getClass();
        boolean z10 = c02.f9479a;
        if (z10 && this.f5047A1 == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC0156a.k(z9);
        if (this.f5078z1 != z10) {
            this.f5078z1 = z10;
            f0();
        }
        i2.e eVar = this.f15821Q0;
        y yVar = this.f5052X0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new w(yVar, eVar, 1));
        }
        this.f5064k1 = z8;
        this.l1 = false;
    }

    @Override // w2.AbstractC1396r, e2.AbstractC0600d
    public final void n(boolean z7, long j7) {
        super.n(z7, j7);
        this.f5053Y0.getClass();
        r0();
        t tVar = this.f5051W0;
        tVar.f5117m = 0L;
        tVar.f5119p = -1L;
        tVar.n = -1L;
        long j8 = -9223372036854775807L;
        this.f5071s1 = -9223372036854775807L;
        this.f5065m1 = -9223372036854775807L;
        this.f5069q1 = 0;
        if (z7) {
            long j9 = this.f5054Z0;
            if (j9 > 0) {
                j8 = SystemClock.elapsedRealtime() + j9;
            }
            this.f5066n1 = j8;
            return;
        }
        this.f5066n1 = -9223372036854775807L;
    }

    @Override // w2.AbstractC1396r
    public final int n0(C1397s c1397s, K k5) {
        boolean z7;
        boolean z8;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (!Z2.r.k(k5.f9655B)) {
            return AbstractC0515y1.b(0, 0, 0);
        }
        if (k5.f9658E != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        Context context = this.f5050V0;
        List v02 = v0(context, c1397s, k5, z7, false);
        if (z7 && v02.isEmpty()) {
            v02 = v0(context, c1397s, k5, false, false);
        }
        if (v02.isEmpty()) {
            return AbstractC0515y1.b(1, 0, 0);
        }
        int i12 = k5.W;
        if (i12 != 0 && i12 != 2) {
            return AbstractC0515y1.b(2, 0, 0);
        }
        C1392n c1392n = (C1392n) v02.get(0);
        boolean d = c1392n.d(k5);
        if (!d) {
            for (int i13 = 1; i13 < v02.size(); i13++) {
                C1392n c1392n2 = (C1392n) v02.get(i13);
                if (c1392n2.d(k5)) {
                    d = true;
                    z8 = false;
                    c1392n = c1392n2;
                    break;
                }
            }
        }
        z8 = true;
        if (d) {
            i7 = 4;
        } else {
            i7 = 3;
        }
        if (c1392n.e(k5)) {
            i8 = 16;
        } else {
            i8 = 8;
        }
        if (c1392n.f15785g) {
            i9 = 64;
        } else {
            i9 = 0;
        }
        if (z8) {
            i10 = 128;
        } else {
            i10 = 0;
        }
        if (H.f4603a >= 26 && "video/dolby-vision".equals(k5.f9655B) && !AbstractC0207g.a(context)) {
            i10 = 256;
        }
        if (d) {
            List v03 = v0(context, c1397s, k5, z7, true);
            if (!v03.isEmpty()) {
                Pattern pattern = w2.y.f15864a;
                ArrayList arrayList = new ArrayList(v03);
                Collections.sort(arrayList, new C1398t(new H2.U(29, k5)));
                C1392n c1392n3 = (C1392n) arrayList.get(0);
                if (c1392n3.d(k5) && c1392n3.e(k5)) {
                    i11 = 32;
                }
            }
        }
        return i7 | i8 | i11 | i9 | i10;
    }

    @Override // e2.AbstractC0600d
    public final void p() {
        L0.b bVar = this.f5053Y0;
        try {
            D();
            f0();
            j2.k kVar = this.f15826T;
            if (kVar != null) {
                kVar.a(null);
            }
            this.f15826T = null;
        } finally {
            bVar.getClass();
            k kVar2 = this.f5060g1;
            if (kVar2 != null) {
                if (this.f5059f1 == kVar2) {
                    this.f5059f1 = null;
                }
                kVar2.release();
                this.f5060g1 = null;
            }
        }
    }

    @Override // e2.AbstractC0600d
    public final void q() {
        this.f5068p1 = 0;
        this.f5067o1 = SystemClock.elapsedRealtime();
        this.f5072t1 = SystemClock.elapsedRealtime() * 1000;
        this.f5073u1 = 0L;
        this.f5074v1 = 0;
        t tVar = this.f5051W0;
        tVar.d = true;
        tVar.f5117m = 0L;
        tVar.f5119p = -1L;
        tVar.n = -1L;
        q qVar = tVar.f5108b;
        if (qVar != null) {
            s sVar = tVar.f5109c;
            sVar.getClass();
            sVar.f5104r.sendEmptyMessage(1);
            qVar.l(new H2.U(10, tVar));
        }
        tVar.e(false);
    }

    @Override // e2.AbstractC0600d
    public final void r() {
        this.f5066n1 = -9223372036854775807L;
        x0();
        int i7 = this.f5074v1;
        if (i7 != 0) {
            long j7 = this.f5073u1;
            y yVar = this.f5052X0;
            Handler handler = yVar.f5135b;
            if (handler != null) {
                handler.post(new u(yVar, j7, i7));
            }
            this.f5073u1 = 0L;
            this.f5074v1 = 0;
        }
        t tVar = this.f5051W0;
        tVar.d = false;
        q qVar = tVar.f5108b;
        if (qVar != null) {
            qVar.h();
            s sVar = tVar.f5109c;
            sVar.getClass();
            sVar.f5104r.sendEmptyMessage(2);
        }
        tVar.b();
    }

    public final void r0() {
        InterfaceC1389k interfaceC1389k;
        this.f5063j1 = false;
        if (H.f4603a >= 23 && this.f5078z1 && (interfaceC1389k = this.f15832Z) != null) {
            this.f5048B1 = new C0208h(this, interfaceC1389k);
        }
    }

    @Override // w2.AbstractC1396r, e2.AbstractC0600d
    public final void u(long j7, long j8) {
        super.u(j7, j8);
        this.f5053Y0.getClass();
    }

    @Override // w2.AbstractC1396r, e2.AbstractC0600d
    public final void x(float f, float f7) {
        super.x(f, f7);
        t tVar = this.f5051W0;
        tVar.f5113i = f;
        tVar.f5117m = 0L;
        tVar.f5119p = -1L;
        tVar.n = -1L;
        tVar.e(false);
    }

    public final void x0() {
        if (this.f5068p1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = elapsedRealtime - this.f5067o1;
            int i7 = this.f5068p1;
            y yVar = this.f5052X0;
            Handler handler = yVar.f5135b;
            if (handler != null) {
                handler.post(new u(yVar, i7, j7));
            }
            this.f5068p1 = 0;
            this.f5067o1 = elapsedRealtime;
        }
    }

    public final void y0() {
        this.l1 = true;
        if (!this.f5063j1) {
            this.f5063j1 = true;
            Surface surface = this.f5059f1;
            y yVar = this.f5052X0;
            Handler handler = yVar.f5135b;
            if (handler != null) {
                handler.post(new v(yVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f5061h1 = true;
        }
    }

    public final void z0(z zVar) {
        if (!zVar.equals(z.f5137u) && !zVar.equals(this.f5077y1)) {
            this.f5077y1 = zVar;
            this.f5052X0.c(zVar);
        }
    }
}
