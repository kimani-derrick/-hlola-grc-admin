package g2;

import H2.C0002c;
import O3.AbstractC0080y;
import Z2.AbstractC0156a;
import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import e2.C0;
import e2.C0586C;
import e2.C0593J;
import e2.SurfaceHolder$CallbackC0629y;
import e2.q0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import u4.C1288l;
import w2.AbstractC1396r;
import w2.C1392n;
import w2.C1397s;
import w2.C1398t;
import w2.InterfaceC1389k;
/* loaded from: classes.dex */
public final class N extends AbstractC1396r implements Z2.q {

    /* renamed from: V0  reason: collision with root package name */
    public final Context f10592V0;

    /* renamed from: W0  reason: collision with root package name */
    public final a3.y f10593W0;

    /* renamed from: X0  reason: collision with root package name */
    public final InterfaceC0730v f10594X0;

    /* renamed from: Y0  reason: collision with root package name */
    public int f10595Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f10596Z0;

    /* renamed from: a1  reason: collision with root package name */
    public e2.K f10597a1;

    /* renamed from: b1  reason: collision with root package name */
    public e2.K f10598b1;

    /* renamed from: c1  reason: collision with root package name */
    public long f10599c1;
    public boolean d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f10600e1;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f10601f1;

    /* renamed from: g1  reason: collision with root package name */
    public C0586C f10602g1;

    public N(Context context, C1288l c1288l, Handler handler, SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y, K k5) {
        super(1, c1288l, 44100.0f);
        this.f10592V0 = context.getApplicationContext();
        this.f10594X0 = k5;
        this.f10593W0 = new a3.y(handler, surfaceHolder$CallbackC0629y, 1);
        k5.f10582r = new Z5.n(this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [O3.y, O3.B] */
    public static O3.U s0(C1397s c1397s, e2.K k5, boolean z7, InterfaceC0730v interfaceC0730v) {
        List e3;
        C1392n c1392n;
        if (k5.f9655B == null) {
            O3.C c5 = O3.E.f2597r;
            return O3.U.f2621u;
        }
        if (((K) interfaceC0730v).g(k5) != 0) {
            List e7 = w2.y.e("audio/raw", false, false);
            if (e7.isEmpty()) {
                c1392n = null;
            } else {
                c1392n = (C1392n) e7.get(0);
            }
            if (c1392n != null) {
                return O3.E.x(c1392n);
            }
        }
        Pattern pattern = w2.y.f15864a;
        c1397s.getClass();
        List e8 = w2.y.e(k5.f9655B, z7, false);
        String b7 = w2.y.b(k5);
        if (b7 == null) {
            O3.C c6 = O3.E.f2597r;
            e3 = O3.U.f2621u;
        } else {
            e3 = w2.y.e(b7, z7, false);
        }
        O3.C c7 = O3.E.f2597r;
        ?? abstractC0080y = new AbstractC0080y();
        abstractC0080y.e(e8);
        abstractC0080y.e(e3);
        return abstractC0080y.h();
    }

    @Override // w2.AbstractC1396r
    public final i2.i B(C1392n c1392n, e2.K k5, e2.K k7) {
        boolean z7;
        i2.i b7 = c1392n.b(k5, k7);
        int i7 = 0;
        if (this.f15826T == null && m0(k7)) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i8 = b7.f11361e;
        if (z7) {
            i8 |= 32768;
        }
        if (r0(c1392n, k7) > this.f10595Y0) {
            i8 |= 64;
        }
        int i9 = i8;
        if (i9 == 0) {
            i7 = b7.d;
        }
        return new i2.i(c1392n.f15781a, k5, k7, i7, i9);
    }

    @Override // w2.AbstractC1396r
    public final float L(float f, e2.K[] kArr) {
        int i7 = -1;
        for (e2.K k5 : kArr) {
            int i8 = k5.f9668P;
            if (i8 != -1) {
                i7 = Math.max(i7, i8);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return f * i7;
    }

    @Override // w2.AbstractC1396r
    public final ArrayList M(C1397s c1397s, e2.K k5, boolean z7) {
        O3.U s02 = s0(c1397s, k5, z7, this.f10594X0);
        Pattern pattern = w2.y.f15864a;
        ArrayList arrayList = new ArrayList(s02);
        Collections.sort(arrayList, new C1398t(new H2.U(29, k5)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    @Override // w2.AbstractC1396r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w2.C1387i N(w2.C1392n r12, e2.K r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.N.N(w2.n, e2.K, android.media.MediaCrypto, float):w2.i");
    }

    @Override // w2.AbstractC1396r
    public final void S(Exception exc) {
        AbstractC0156a.r("MediaCodecAudioRenderer", "Audio codec error", exc);
        a3.y yVar = this.f10593W0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new RunnableC0725p(yVar, exc, 0));
        }
    }

    @Override // w2.AbstractC1396r
    public final void T(long j7, long j8, String str) {
        a3.y yVar = this.f10593W0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new a3.x(yVar, str, j7, j8, 1));
        }
    }

    @Override // w2.AbstractC1396r
    public final void U(String str) {
        a3.y yVar = this.f10593W0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new A4.d(yVar, 12, str));
        }
    }

    @Override // w2.AbstractC1396r
    public final i2.i V(androidx.fragment.app.D d) {
        e2.K k5 = (e2.K) d.f5884s;
        k5.getClass();
        this.f10597a1 = k5;
        i2.i V6 = super.V(d);
        e2.K k7 = this.f10597a1;
        a3.y yVar = this.f10593W0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new H2.E(yVar, k7, V6, 7));
        }
        return V6;
    }

    @Override // w2.AbstractC1396r
    public final void W(e2.K k5, MediaFormat mediaFormat) {
        int i7;
        int i8;
        e2.K k7 = this.f10598b1;
        int[] iArr = null;
        if (k7 != null) {
            k5 = k7;
        } else if (this.f15832Z != null) {
            if ("audio/raw".equals(k5.f9655B)) {
                i7 = k5.f9669Q;
            } else if (Z2.H.f4603a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i7 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i7 = Z2.H.w(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i7 = 2;
            }
            C0593J c0593j = new C0593J();
            c0593j.f9605k = "audio/raw";
            c0593j.f9619z = i7;
            c0593j.f9592A = k5.f9670R;
            c0593j.f9593B = k5.f9671S;
            c0593j.f9617x = mediaFormat.getInteger("channel-count");
            c0593j.f9618y = mediaFormat.getInteger("sample-rate");
            e2.K k8 = new e2.K(c0593j);
            if (this.f10596Z0 && k8.f9667O == 6 && (i8 = k5.f9667O) < 6) {
                iArr = new int[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    iArr[i9] = i9;
                }
            }
            k5 = k8;
        }
        try {
            ((K) this.f10594X0).b(k5, iArr);
        } catch (C0727s e3) {
            throw e(e3, e3.f10715q, false, 5001);
        }
    }

    @Override // w2.AbstractC1396r
    public final void X() {
        this.f10594X0.getClass();
    }

    @Override // w2.AbstractC1396r
    public final void Z() {
        ((K) this.f10594X0).f10547K = true;
    }

    @Override // Z2.q
    public final q0 a() {
        return ((K) this.f10594X0).f10539B;
    }

    @Override // w2.AbstractC1396r
    public final void a0(i2.g gVar) {
        if (this.d1 && !gVar.d(Integer.MIN_VALUE)) {
            if (Math.abs(gVar.f11353v - this.f10599c1) > 500000) {
                this.f10599c1 = gVar.f11353v;
            }
            this.d1 = false;
        }
    }

    @Override // Z2.q
    public final void b(q0 q0Var) {
        K k5 = (K) this.f10594X0;
        k5.getClass();
        k5.f10539B = new q0(Z2.H.i(q0Var.f10063q, 0.1f, 8.0f), Z2.H.i(q0Var.f10064r, 0.1f, 8.0f));
        if (k5.s()) {
            k5.r();
            return;
        }
        H h7 = new H(q0Var, -9223372036854775807L, -9223372036854775807L);
        if (k5.m()) {
            k5.f10590z = h7;
        } else {
            k5.f10538A = h7;
        }
    }

    @Override // e2.AbstractC0600d, e2.w0
    public final void c(int i7, Object obj) {
        q0 q0Var;
        boolean z7;
        InterfaceC0730v interfaceC0730v = this.f10594X0;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 6) {
                    switch (i7) {
                        case 9:
                            K k5 = (K) interfaceC0730v;
                            k5.f10540C = ((Boolean) obj).booleanValue();
                            if (k5.s()) {
                                q0Var = q0.f10062t;
                            } else {
                                q0Var = k5.f10539B;
                            }
                            H h7 = new H(q0Var, -9223372036854775807L, -9223372036854775807L);
                            if (k5.m()) {
                                k5.f10590z = h7;
                                return;
                            } else {
                                k5.f10538A = h7;
                                return;
                            }
                        case 10:
                            int intValue = ((Integer) obj).intValue();
                            K k7 = (K) interfaceC0730v;
                            if (k7.f10559X != intValue) {
                                k7.f10559X = intValue;
                                if (intValue != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                k7.W = z7;
                                k7.d();
                                return;
                            }
                            return;
                        case 11:
                            this.f10602g1 = (C0586C) obj;
                            return;
                        case 12:
                            if (Z2.H.f4603a >= 23) {
                                M.a(interfaceC0730v, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                z zVar = (z) obj;
                K k8 = (K) interfaceC0730v;
                if (!k8.f10560Y.equals(zVar)) {
                    zVar.getClass();
                    if (k8.f10586v != null) {
                        k8.f10560Y.getClass();
                    }
                    k8.f10560Y = zVar;
                    return;
                }
                return;
            }
            C0713d c0713d = (C0713d) obj;
            K k9 = (K) interfaceC0730v;
            if (!k9.f10589y.equals(c0713d)) {
                k9.f10589y = c0713d;
                if (!k9.f10563a0) {
                    k9.d();
                    return;
                }
                return;
            }
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        K k10 = (K) interfaceC0730v;
        if (k10.f10550N != floatValue) {
            k10.f10550N = floatValue;
            if (k10.m()) {
                if (Z2.H.f4603a >= 21) {
                    k10.f10586v.setVolume(k10.f10550N);
                    return;
                }
                AudioTrack audioTrack = k10.f10586v;
                float f = k10.f10550N;
                audioTrack.setStereoVolume(f, f);
            }
        }
    }

    @Override // Z2.q
    public final long d() {
        if (this.f9937w == 2) {
            t0();
        }
        return this.f10599c1;
    }

    @Override // w2.AbstractC1396r
    public final boolean d0(long j7, long j8, InterfaceC1389k interfaceC1389k, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, e2.K k5) {
        byteBuffer.getClass();
        if (this.f10598b1 != null && (i8 & 2) != 0) {
            interfaceC1389k.getClass();
            interfaceC1389k.j(i7, false);
            return true;
        }
        InterfaceC0730v interfaceC0730v = this.f10594X0;
        if (z7) {
            if (interfaceC1389k != null) {
                interfaceC1389k.j(i7, false);
            }
            this.f15821Q0.f += i9;
            ((K) interfaceC0730v).f10547K = true;
            return true;
        }
        try {
            if (!((K) interfaceC0730v).j(byteBuffer, j9, i9)) {
                return false;
            }
            if (interfaceC1389k != null) {
                interfaceC1389k.j(i7, false);
            }
            this.f15821Q0.f11343e += i9;
            return true;
        } catch (C0728t e3) {
            throw e(e3, this.f10597a1, e3.f10717r, 5001);
        } catch (C0729u e7) {
            throw e(e7, k5, e7.f10719r, 5002);
        }
    }

    @Override // w2.AbstractC1396r
    public final void g0() {
        try {
            K k5 = (K) this.f10594X0;
            if (!k5.f10556T && k5.m() && k5.c()) {
                k5.o();
                k5.f10556T = true;
            }
        } catch (C0729u e3) {
            throw e(e3, e3.f10720s, e3.f10719r, 5002);
        }
    }

    @Override // e2.AbstractC0600d
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // e2.AbstractC0600d
    public final boolean j() {
        if (this.f15813M0) {
            K k5 = (K) this.f10594X0;
            if (!k5.m() || (k5.f10556T && !k5.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // w2.AbstractC1396r, e2.AbstractC0600d
    public final boolean k() {
        if (!((K) this.f10594X0).k() && !super.k()) {
            return false;
        }
        return true;
    }

    @Override // w2.AbstractC1396r, e2.AbstractC0600d
    public final void l() {
        a3.y yVar = this.f10593W0;
        this.f10601f1 = true;
        this.f10597a1 = null;
        try {
            ((K) this.f10594X0).d();
            try {
                super.l();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.l();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [i2.e, java.lang.Object] */
    @Override // e2.AbstractC0600d
    public final void m(boolean z7, boolean z8) {
        ?? obj = new Object();
        this.f15821Q0 = obj;
        a3.y yVar = this.f10593W0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new r(yVar, obj, 0));
        }
        C0 c02 = this.f9934t;
        c02.getClass();
        boolean z9 = c02.f9479a;
        boolean z10 = false;
        InterfaceC0730v interfaceC0730v = this.f10594X0;
        if (z9) {
            K k5 = (K) interfaceC0730v;
            k5.getClass();
            if (Z2.H.f4603a >= 21) {
                z10 = true;
            }
            AbstractC0156a.k(z10);
            AbstractC0156a.k(k5.W);
            if (!k5.f10563a0) {
                k5.f10563a0 = true;
                k5.d();
            }
        } else {
            K k7 = (K) interfaceC0730v;
            if (k7.f10563a0) {
                k7.f10563a0 = false;
                k7.d();
            }
        }
        f2.m mVar = this.f9936v;
        mVar.getClass();
        ((K) interfaceC0730v).f10581q = mVar;
    }

    @Override // w2.AbstractC1396r
    public final boolean m0(e2.K k5) {
        if (((K) this.f10594X0).g(k5) != 0) {
            return true;
        }
        return false;
    }

    @Override // w2.AbstractC1396r, e2.AbstractC0600d
    public final void n(boolean z7, long j7) {
        super.n(z7, j7);
        ((K) this.f10594X0).d();
        this.f10599c1 = j7;
        this.d1 = true;
        this.f10600e1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r4 != null) goto L26;
     */
    @Override // w2.AbstractC1396r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n0(w2.C1397s r12, e2.K r13) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.N.n0(w2.s, e2.K):int");
    }

    @Override // e2.AbstractC0600d
    public final void o() {
        C0718i c0718i;
        C0720k c0720k = ((K) this.f10594X0).f10588x;
        if (c0720k != null && c0720k.f10693a) {
            c0720k.f10698h = null;
            int i7 = Z2.H.f4603a;
            Context context = (Context) c0720k.f10694b;
            if (i7 >= 23 && (c0718i = (C0718i) c0720k.f10696e) != null) {
                AbstractC0717h.b(context, c0718i);
            }
            Z2.w wVar = (Z2.w) c0720k.f;
            if (wVar != null) {
                context.unregisterReceiver(wVar);
            }
            C0719j c0719j = (C0719j) c0720k.f10697g;
            if (c0719j != null) {
                c0719j.f10690a.unregisterContentObserver(c0719j);
            }
            c0720k.f10693a = false;
        }
    }

    @Override // e2.AbstractC0600d
    public final void p() {
        InterfaceC0730v interfaceC0730v = this.f10594X0;
        try {
            D();
            f0();
            j2.k kVar = this.f15826T;
            if (kVar != null) {
                kVar.a(null);
            }
            this.f15826T = null;
        } finally {
            if (this.f10601f1) {
                this.f10601f1 = false;
                ((K) interfaceC0730v).q();
            }
        }
    }

    @Override // e2.AbstractC0600d
    public final void q() {
        K k5 = (K) this.f10594X0;
        k5.f10558V = true;
        if (k5.m()) {
            x xVar = k5.f10574i.f;
            xVar.getClass();
            xVar.a();
            k5.f10586v.play();
        }
    }

    @Override // e2.AbstractC0600d
    public final void r() {
        t0();
        K k5 = (K) this.f10594X0;
        k5.f10558V = false;
        if (k5.m()) {
            y yVar = k5.f10574i;
            yVar.d();
            if (yVar.f10756y == -9223372036854775807L) {
                x xVar = yVar.f;
                xVar.getClass();
                xVar.a();
                k5.f10586v.pause();
            }
        }
    }

    public final int r0(C1392n c1392n, e2.K k5) {
        int i7;
        if ("OMX.google.raw.decoder".equals(c1392n.f15781a) && (i7 = Z2.H.f4603a) < 24 && (i7 != 23 || !Z2.H.I(this.f10592V0))) {
            return -1;
        }
        return k5.f9656C;
    }

    public final void t0() {
        long j7;
        ArrayDeque arrayDeque;
        long v5;
        long j8;
        S s6;
        long j9;
        boolean j10 = j();
        K k5 = (K) this.f10594X0;
        if (k5.m() && !k5.f10548L) {
            long min = Math.min(k5.f10574i.a(j10), Z2.H.N(k5.i(), k5.f10584t.f10525e));
            while (true) {
                arrayDeque = k5.f10575j;
                if (arrayDeque.isEmpty() || min < ((H) arrayDeque.getFirst()).f10532c) {
                    break;
                }
                k5.f10538A = (H) arrayDeque.remove();
            }
            H h7 = k5.f10538A;
            long j11 = min - h7.f10532c;
            boolean equals = h7.f10530a.equals(q0.f10062t);
            C0002c c0002c = k5.f10564b;
            if (equals) {
                v5 = k5.f10538A.f10531b + j11;
            } else if (arrayDeque.isEmpty()) {
                T t5 = (T) c0002c.f1019t;
                if (t5.f10652o >= 1024) {
                    long j12 = t5.n;
                    t5.f10648j.getClass();
                    long j13 = j12 - ((s6.f10631k * s6.f10624b) * 2);
                    int i7 = t5.f10646h.f10703a;
                    int i8 = t5.f10645g.f10703a;
                    if (i7 == i8) {
                        j9 = t5.f10652o;
                    } else {
                        j13 *= i7;
                        j9 = t5.f10652o * i8;
                    }
                    j8 = Z2.H.O(j11, j13, j9);
                } else {
                    j8 = (long) (t5.f10643c * j11);
                }
                v5 = j8 + k5.f10538A.f10531b;
            } else {
                H h8 = (H) arrayDeque.getFirst();
                v5 = h8.f10531b - Z2.H.v(h8.f10532c - min, k5.f10538A.f10530a.f10063q);
            }
            j7 = Z2.H.N(((Q) c0002c.f1018s).f10622t, k5.f10584t.f10525e) + v5;
        } else {
            j7 = Long.MIN_VALUE;
        }
        if (j7 != Long.MIN_VALUE) {
            if (!this.f10600e1) {
                j7 = Math.max(this.f10599c1, j7);
            }
            this.f10599c1 = j7;
            this.f10600e1 = false;
        }
    }

    @Override // e2.AbstractC0600d
    public final Z2.q g() {
        return this;
    }
}
