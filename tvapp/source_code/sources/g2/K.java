package g2;

import H2.C0002c;
import O3.AbstractC0072p;
import Z2.AbstractC0156a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import e2.q0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class K implements InterfaceC0730v {

    /* renamed from: g0  reason: collision with root package name */
    public static final Object f10535g0 = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public static ExecutorService f10536h0;

    /* renamed from: i0  reason: collision with root package name */
    public static int f10537i0;

    /* renamed from: A  reason: collision with root package name */
    public H f10538A;

    /* renamed from: B  reason: collision with root package name */
    public q0 f10539B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f10540C;

    /* renamed from: D  reason: collision with root package name */
    public ByteBuffer f10541D;

    /* renamed from: E  reason: collision with root package name */
    public int f10542E;
    public long F;

    /* renamed from: G  reason: collision with root package name */
    public long f10543G;

    /* renamed from: H  reason: collision with root package name */
    public long f10544H;

    /* renamed from: I  reason: collision with root package name */
    public long f10545I;

    /* renamed from: J  reason: collision with root package name */
    public int f10546J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f10547K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f10548L;

    /* renamed from: M  reason: collision with root package name */
    public long f10549M;

    /* renamed from: N  reason: collision with root package name */
    public float f10550N;

    /* renamed from: O  reason: collision with root package name */
    public ByteBuffer f10551O;

    /* renamed from: P  reason: collision with root package name */
    public int f10552P;

    /* renamed from: Q  reason: collision with root package name */
    public ByteBuffer f10553Q;

    /* renamed from: R  reason: collision with root package name */
    public byte[] f10554R;

    /* renamed from: S  reason: collision with root package name */
    public int f10555S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f10556T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f10557U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f10558V;
    public boolean W;

    /* renamed from: X  reason: collision with root package name */
    public int f10559X;

    /* renamed from: Y  reason: collision with root package name */
    public z f10560Y;

    /* renamed from: Z  reason: collision with root package name */
    public E f10561Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10562a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f10563a0;

    /* renamed from: b  reason: collision with root package name */
    public final C0002c f10564b;

    /* renamed from: b0  reason: collision with root package name */
    public long f10565b0;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10566c;

    /* renamed from: c0  reason: collision with root package name */
    public long f10567c0;
    public final B d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f10568d0;

    /* renamed from: e  reason: collision with root package name */
    public final W f10569e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f10570e0;
    public final O3.U f;

    /* renamed from: f0  reason: collision with root package name */
    public Looper f10571f0;

    /* renamed from: g  reason: collision with root package name */
    public final O3.U f10572g;

    /* renamed from: h  reason: collision with root package name */
    public final X0.j f10573h;

    /* renamed from: i  reason: collision with root package name */
    public final y f10574i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque f10575j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f10576k;

    /* renamed from: l  reason: collision with root package name */
    public final int f10577l;

    /* renamed from: m  reason: collision with root package name */
    public C0002c f10578m;
    public final M2.e n;

    /* renamed from: o  reason: collision with root package name */
    public final M2.e f10579o;

    /* renamed from: p  reason: collision with root package name */
    public final L f10580p;

    /* renamed from: q  reason: collision with root package name */
    public f2.m f10581q;

    /* renamed from: r  reason: collision with root package name */
    public Z5.n f10582r;

    /* renamed from: s  reason: collision with root package name */
    public G f10583s;

    /* renamed from: t  reason: collision with root package name */
    public G f10584t;

    /* renamed from: u  reason: collision with root package name */
    public C0721l f10585u;

    /* renamed from: v  reason: collision with root package name */
    public AudioTrack f10586v;

    /* renamed from: w  reason: collision with root package name */
    public C0716g f10587w;

    /* renamed from: x  reason: collision with root package name */
    public C0720k f10588x;

    /* renamed from: y  reason: collision with root package name */
    public C0713d f10589y;

    /* renamed from: z  reason: collision with root package name */
    public H f10590z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [g2.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, X0.j] */
    /* JADX WARN: Type inference failed for: r10v4, types: [g2.B, g2.A] */
    /* JADX WARN: Type inference failed for: r3v8, types: [g2.A, g2.W] */
    public K(F f) {
        C0716g c0716g;
        boolean z7;
        boolean z8;
        int i7;
        Context context = f.f10517a;
        this.f10562a = context;
        if (context != null) {
            c0716g = C0716g.b(context);
        } else {
            c0716g = f.f10518b;
        }
        this.f10587w = c0716g;
        this.f10564b = f.f10519c;
        int i8 = Z2.H.f4603a;
        if (i8 >= 21 && f.d) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f10566c = z7;
        if (i8 >= 23 && f.f10520e) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f10576k = z8;
        if (i8 >= 29) {
            i7 = f.f;
        } else {
            i7 = 0;
        }
        this.f10577l = i7;
        this.f10580p = f.f10521g;
        ?? obj = new Object();
        this.f10573h = obj;
        obj.d();
        this.f10574i = new y(new Z5.n(this));
        ?? abstractC0709A = new AbstractC0709A();
        this.d = abstractC0709A;
        ?? abstractC0709A2 = new AbstractC0709A();
        abstractC0709A2.f10659m = Z2.H.f;
        this.f10569e = abstractC0709A2;
        AbstractC0709A abstractC0709A3 = new AbstractC0709A();
        O3.C c5 = O3.E.f2597r;
        Object[] objArr = {abstractC0709A3, abstractC0709A, abstractC0709A2};
        AbstractC0072p.b(3, objArr);
        this.f = O3.E.o(3, objArr);
        this.f10572g = O3.E.x(new AbstractC0709A());
        this.f10550N = 1.0f;
        this.f10589y = C0713d.f10677w;
        this.f10559X = 0;
        this.f10560Y = new Object();
        q0 q0Var = q0.f10062t;
        this.f10538A = new H(q0Var, 0L, 0L);
        this.f10539B = q0Var;
        this.f10540C = false;
        this.f10575j = new ArrayDeque();
        this.n = new M2.e(1);
        this.f10579o = new M2.e(1);
    }

    public static AudioFormat f(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (Z2.H.f4603a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r0 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r0 != 4) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r13) {
        /*
            r12 = this;
            boolean r0 = r12.s()
            r1 = 4
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r4 = r12.f10566c
            H2.c r5 = r12.f10564b
            if (r0 != 0) goto L51
            boolean r0 = r12.f10563a0
            if (r0 != 0) goto L4b
            g2.G r0 = r12.f10584t
            int r6 = r0.f10524c
            if (r6 != 0) goto L4b
            e2.K r0 = r0.f10522a
            int r0 = r0.f9669Q
            if (r4 == 0) goto L28
            int r6 = Z2.H.f4603a
            if (r0 == r3) goto L4b
            if (r0 == r2) goto L4b
            if (r0 != r1) goto L28
            goto L4b
        L28:
            e2.q0 r0 = r12.f10539B
            r5.getClass()
            float r6 = r0.f10063q
            java.lang.Object r7 = r5.f1019t
            g2.T r7 = (g2.T) r7
            float r8 = r7.f10643c
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L3e
            r7.f10643c = r6
            r7.f10647i = r9
        L3e:
            float r6 = r7.d
            float r8 = r0.f10064r
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4d
            r7.d = r8
            r7.f10647i = r9
            goto L4d
        L4b:
            e2.q0 r0 = e2.q0.f10062t
        L4d:
            r12.f10539B = r0
        L4f:
            r7 = r0
            goto L54
        L51:
            e2.q0 r0 = e2.q0.f10062t
            goto L4f
        L54:
            boolean r0 = r12.f10563a0
            if (r0 != 0) goto L76
            g2.G r0 = r12.f10584t
            int r6 = r0.f10524c
            if (r6 != 0) goto L76
            e2.K r0 = r0.f10522a
            int r0 = r0.f9669Q
            if (r4 == 0) goto L6d
            int r4 = Z2.H.f4603a
            if (r0 == r3) goto L76
            if (r0 == r2) goto L76
            if (r0 != r1) goto L6d
            goto L76
        L6d:
            boolean r0 = r12.f10540C
            java.lang.Object r1 = r5.f1018s
            g2.Q r1 = (g2.Q) r1
            r1.f10616m = r0
            goto L77
        L76:
            r0 = 0
        L77:
            r12.f10540C = r0
            java.util.ArrayDeque r0 = r12.f10575j
            g2.H r1 = new g2.H
            r2 = 0
            long r8 = java.lang.Math.max(r2, r13)
            g2.G r13 = r12.f10584t
            long r2 = r12.i()
            int r13 = r13.f10525e
            long r10 = Z2.H.N(r2, r13)
            r6 = r1
            r6.<init>(r7, r8, r10)
            r0.add(r1)
            g2.G r13 = r12.f10584t
            g2.l r13 = r13.f10528i
            r12.f10585u = r13
            r13.b()
            Z5.n r13 = r12.f10582r
            if (r13 == 0) goto Lb8
            boolean r14 = r12.f10540C
            java.lang.Object r13 = r13.f4918q
            g2.N r13 = (g2.N) r13
            a3.y r13 = r13.f10593W0
            android.os.Handler r0 = r13.f5135b
            if (r0 == 0) goto Lb8
            N4.c r1 = new N4.c
            r2 = 2
            r1.<init>(r13, r14, r2)
            r0.post(r1)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.K.a(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0178, code lost:
        if ((r7 & r9) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017b, code lost:
        if (r16 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017e, code lost:
        if (r4 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0181, code lost:
        if (r4 < 0) goto L70;
     */
    /* JADX WARN: Type inference failed for: r13v4, types: [O3.y, O3.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(e2.K r26, int[] r27) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.K.b(e2.K, int[]):void");
    }

    public final boolean c() {
        if (!this.f10585u.e()) {
            ByteBuffer byteBuffer = this.f10553Q;
            if (byteBuffer == null) {
                return true;
            }
            u(byteBuffer, Long.MIN_VALUE);
            if (this.f10553Q != null) {
                return false;
            }
            return true;
        }
        C0721l c0721l = this.f10585u;
        if (c0721l.e() && !c0721l.d) {
            c0721l.d = true;
            ((InterfaceC0724o) c0721l.f10700b.get(0)).d();
        }
        p(Long.MIN_VALUE);
        if (!this.f10585u.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f10553Q;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    public final void d() {
        if (m()) {
            this.F = 0L;
            this.f10543G = 0L;
            this.f10544H = 0L;
            this.f10545I = 0L;
            this.f10570e0 = false;
            this.f10546J = 0;
            this.f10538A = new H(this.f10539B, 0L, 0L);
            this.f10549M = 0L;
            this.f10590z = null;
            this.f10575j.clear();
            this.f10551O = null;
            this.f10552P = 0;
            this.f10553Q = null;
            this.f10557U = false;
            this.f10556T = false;
            this.f10541D = null;
            this.f10542E = 0;
            this.f10569e.f10660o = 0L;
            C0721l c0721l = this.f10584t.f10528i;
            this.f10585u = c0721l;
            c0721l.b();
            AudioTrack audioTrack = this.f10574i.f10737c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f10586v.pause();
            }
            if (n(this.f10586v)) {
                C0002c c0002c = this.f10578m;
                c0002c.getClass();
                this.f10586v.unregisterStreamEventCallback((J) c0002c.f1018s);
                ((Handler) c0002c.f1017r).removeCallbacksAndMessages(null);
            }
            if (Z2.H.f4603a < 21 && !this.W) {
                this.f10559X = 0;
            }
            G g7 = this.f10583s;
            if (g7 != null) {
                this.f10584t = g7;
                this.f10583s = null;
            }
            y yVar = this.f10574i;
            yVar.d();
            yVar.f10737c = null;
            yVar.f = null;
            AudioTrack audioTrack2 = this.f10586v;
            X0.j jVar = this.f10573h;
            jVar.c();
            synchronized (f10535g0) {
                try {
                    if (f10536h0 == null) {
                        f10536h0 = Executors.newSingleThreadExecutor(new Z2.F("ExoPlayer:AudioTrackReleaseThread", 0));
                    }
                    f10537i0++;
                    f10536h0.execute(new A4.d(audioTrack2, 13, jVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f10586v = null;
        }
        this.f10579o.f2261s = null;
        this.n.f2261s = null;
    }

    public final C0716g e() {
        Context context;
        C0716g c5;
        C0718i c0718i;
        if (this.f10588x == null && (context = this.f10562a) != null) {
            this.f10571f0 = Looper.myLooper();
            C0720k c0720k = new C0720k(context, new H2.U(20, this));
            this.f10588x = c0720k;
            if (c0720k.f10693a) {
                c5 = (C0716g) c0720k.f10698h;
                c5.getClass();
            } else {
                c0720k.f10693a = true;
                C0719j c0719j = (C0719j) c0720k.f10697g;
                if (c0719j != null) {
                    c0719j.f10690a.registerContentObserver(c0719j.f10691b, false, c0719j);
                }
                int i7 = Z2.H.f4603a;
                Handler handler = (Handler) c0720k.d;
                Context context2 = (Context) c0720k.f10694b;
                if (i7 >= 23 && (c0718i = (C0718i) c0720k.f10696e) != null) {
                    AbstractC0717h.a(context2, c0718i, handler);
                }
                Z2.w wVar = (Z2.w) c0720k.f;
                Intent intent = null;
                if (wVar != null) {
                    intent = context2.registerReceiver(wVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                c5 = C0716g.c(context2, intent);
                c0720k.f10698h = c5;
            }
            this.f10587w = c5;
        }
        return this.f10587w;
    }

    public final int g(e2.K k5) {
        if ("audio/raw".equals(k5.f9655B)) {
            int i7 = k5.f9669Q;
            if (!Z2.H.G(i7)) {
                AbstractC0156a.K("DefaultAudioSink", "Invalid PCM encoding: " + i7);
                return 0;
            } else if (i7 == 2 || (this.f10566c && i7 == 4)) {
                return 2;
            } else {
                return 1;
            }
        } else if ((this.f10568d0 || !t(k5, this.f10589y)) && e().d(k5) == null) {
            return 0;
        } else {
            return 2;
        }
    }

    public final long h() {
        G g7 = this.f10584t;
        if (g7.f10524c == 0) {
            return this.F / g7.f10523b;
        }
        return this.f10543G;
    }

    public final long i() {
        G g7 = this.f10584t;
        if (g7.f10524c == 0) {
            return this.f10544H / g7.d;
        }
        return this.f10545I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
        if (r10.b() == 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.K.j(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean k() {
        if (m() && this.f10574i.c(i())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.K.l():boolean");
    }

    public final boolean m() {
        if (this.f10586v != null) {
            return true;
        }
        return false;
    }

    public final void o() {
        if (!this.f10557U) {
            this.f10557U = true;
            long i7 = i();
            y yVar = this.f10574i;
            yVar.f10729A = yVar.b();
            yVar.f10756y = SystemClock.elapsedRealtime() * 1000;
            yVar.f10730B = i7;
            this.f10586v.stop();
            this.f10542E = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        r0 = r3.f10551O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (r0.hasRemaining() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        r0 = r3.f10585u;
        r1 = r3.f10551O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
        if (r0.e() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        if (r0.d == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
        r0.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(long r4) {
        /*
            r3 = this;
            g2.l r0 = r3.f10585u
            boolean r0 = r0.e()
            if (r0 != 0) goto L13
            java.nio.ByteBuffer r0 = r3.f10551O
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            java.nio.ByteBuffer r0 = g2.InterfaceC0724o.f10706a
        Lf:
            r3.u(r0, r4)
            return
        L13:
            g2.l r0 = r3.f10585u
            boolean r0 = r0.d()
            if (r0 != 0) goto L68
        L1b:
            g2.l r0 = r3.f10585u
            boolean r1 = r0.e()
            if (r1 != 0) goto L26
            java.nio.ByteBuffer r0 = g2.InterfaceC0724o.f10706a
            goto L3a
        L26:
            java.nio.ByteBuffer[] r1 = r0.f10701c
            int r2 = r0.c()
            r1 = r1[r2]
            boolean r2 = r1.hasRemaining()
            if (r2 != 0) goto L39
            java.nio.ByteBuffer r2 = g2.InterfaceC0724o.f10706a
            r0.f(r2)
        L39:
            r0 = r1
        L3a:
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L4a
            r3.u(r0, r4)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L1b
            return
        L4a:
            java.nio.ByteBuffer r0 = r3.f10551O
            if (r0 == 0) goto L68
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L55
            goto L68
        L55:
            g2.l r0 = r3.f10585u
            java.nio.ByteBuffer r1 = r3.f10551O
            boolean r2 = r0.e()
            if (r2 == 0) goto L13
            boolean r2 = r0.d
            if (r2 == 0) goto L64
            goto L13
        L64:
            r0.f(r1)
            goto L13
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.K.p(long):void");
    }

    public final void q() {
        d();
        O3.C listIterator = this.f.listIterator(0);
        while (listIterator.hasNext()) {
            ((InterfaceC0724o) listIterator.next()).g();
        }
        O3.C listIterator2 = this.f10572g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((InterfaceC0724o) listIterator2.next()).g();
        }
        C0721l c0721l = this.f10585u;
        if (c0721l != null) {
            c0721l.g();
        }
        this.f10558V = false;
        this.f10568d0 = false;
    }

    public final void r() {
        if (m()) {
            try {
                this.f10586v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f10539B.f10063q).setPitch(this.f10539B.f10064r).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e3) {
                AbstractC0156a.L("DefaultAudioSink", "Failed to set playback params", e3);
            }
            q0 q0Var = new q0(this.f10586v.getPlaybackParams().getSpeed(), this.f10586v.getPlaybackParams().getPitch());
            this.f10539B = q0Var;
            y yVar = this.f10574i;
            yVar.f10742j = q0Var.f10063q;
            x xVar = yVar.f;
            if (xVar != null) {
                xVar.a();
            }
            yVar.d();
        }
    }

    public final boolean s() {
        G g7 = this.f10584t;
        if (g7 != null && g7.f10529j && Z2.H.f4603a >= 23) {
            return true;
        }
        return false;
    }

    public final boolean t(e2.K k5, C0713d c0713d) {
        int i7;
        int p3;
        boolean isOffloadedPlaybackSupported;
        int i8;
        boolean z7;
        boolean z8;
        int i9 = Z2.H.f4603a;
        if (i9 < 29 || (i7 = this.f10577l) == 0) {
            return false;
        }
        String str = k5.f9655B;
        str.getClass();
        int c5 = Z2.r.c(str, k5.f9684y);
        if (c5 == 0 || (p3 = Z2.H.p(k5.f9667O)) == 0) {
            return false;
        }
        AudioFormat f = f(k5.f9668P, p3, c5);
        AudioAttributes audioAttributes = (AudioAttributes) c0713d.a().f4918q;
        if (i9 >= 31) {
            i8 = AudioManager.getPlaybackOffloadSupport(f, audioAttributes);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(f, audioAttributes);
            if (!isOffloadedPlaybackSupported) {
                i8 = 0;
            } else if (i9 == 30 && Z2.H.d.startsWith("Pixel")) {
                i8 = 2;
            } else {
                i8 = 1;
            }
        }
        if (i8 == 0) {
            return false;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                return true;
            }
            throw new IllegalStateException();
        }
        if (k5.f9670R == 0 && k5.f9671S == 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (i7 == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 && z8) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ee, code lost:
        if (r15 < r14) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.K.u(java.nio.ByteBuffer, long):void");
    }
}
