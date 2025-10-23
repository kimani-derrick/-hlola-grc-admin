package e2;

import H2.C0023y;
import H2.InterfaceC0024z;
import Y2.C0136e;
import Y2.C0150t;
import Y2.InterfaceC0137f;
import Z2.AbstractC0156a;
import Z2.C0162g;
import a4.C0214f;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import f2.C0695a;
import g2.C0713d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import x2.C1461c;
import x2.InterfaceC1460b;
/* renamed from: e2.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585B extends P1.c implements InterfaceC0621p {

    /* renamed from: A  reason: collision with root package name */
    public final C0591H f9420A;

    /* renamed from: B  reason: collision with root package name */
    public final Z2.p f9421B;

    /* renamed from: C  reason: collision with root package name */
    public final CopyOnWriteArraySet f9422C;

    /* renamed from: D  reason: collision with root package name */
    public final H0 f9423D;

    /* renamed from: E  reason: collision with root package name */
    public final ArrayList f9424E;
    public final boolean F;

    /* renamed from: G  reason: collision with root package name */
    public final InterfaceC0024z f9425G;

    /* renamed from: H  reason: collision with root package name */
    public final f2.f f9426H;

    /* renamed from: I  reason: collision with root package name */
    public final Looper f9427I;

    /* renamed from: J  reason: collision with root package name */
    public final InterfaceC0137f f9428J;

    /* renamed from: K  reason: collision with root package name */
    public final long f9429K;

    /* renamed from: L  reason: collision with root package name */
    public final long f9430L;

    /* renamed from: M  reason: collision with root package name */
    public final Z2.B f9431M;

    /* renamed from: N  reason: collision with root package name */
    public final SurfaceHolder$CallbackC0629y f9432N;

    /* renamed from: O  reason: collision with root package name */
    public final C0630z f9433O;

    /* renamed from: P  reason: collision with root package name */
    public final A0.f f9434P;

    /* renamed from: Q  reason: collision with root package name */
    public final C0598c f9435Q;

    /* renamed from: R  reason: collision with root package name */
    public final L4.f f9436R;

    /* renamed from: S  reason: collision with root package name */
    public final J3.e f9437S;

    /* renamed from: T  reason: collision with root package name */
    public final long f9438T;

    /* renamed from: U  reason: collision with root package name */
    public int f9439U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f9440V;
    public int W;

    /* renamed from: X  reason: collision with root package name */
    public int f9441X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f9442Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f9443Z;

    /* renamed from: a0  reason: collision with root package name */
    public final D0 f9444a0;

    /* renamed from: b0  reason: collision with root package name */
    public H2.g0 f9445b0;

    /* renamed from: c0  reason: collision with root package name */
    public r0 f9446c0;

    /* renamed from: d0  reason: collision with root package name */
    public C0597b0 f9447d0;

    /* renamed from: e0  reason: collision with root package name */
    public AudioTrack f9448e0;

    /* renamed from: f0  reason: collision with root package name */
    public Object f9449f0;

    /* renamed from: g0  reason: collision with root package name */
    public Surface f9450g0;

    /* renamed from: h0  reason: collision with root package name */
    public SurfaceHolder f9451h0;

    /* renamed from: i0  reason: collision with root package name */
    public b3.k f9452i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f9453j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextureView f9454k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f9455l0;

    /* renamed from: m0  reason: collision with root package name */
    public Z2.z f9456m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f9457n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C0713d f9458o0;

    /* renamed from: p0  reason: collision with root package name */
    public final float f9459p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f9460q0;

    /* renamed from: r  reason: collision with root package name */
    public final W2.x f9461r;

    /* renamed from: r0  reason: collision with root package name */
    public M2.c f9462r0;

    /* renamed from: s  reason: collision with root package name */
    public final r0 f9463s;

    /* renamed from: s0  reason: collision with root package name */
    public final boolean f9464s0;

    /* renamed from: t  reason: collision with root package name */
    public final X0.j f9465t;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f9466t0;

    /* renamed from: u  reason: collision with root package name */
    public final Context f9467u;

    /* renamed from: u0  reason: collision with root package name */
    public a3.z f9468u0;

    /* renamed from: v  reason: collision with root package name */
    public final v0 f9469v;

    /* renamed from: v0  reason: collision with root package name */
    public C0597b0 f9470v0;

    /* renamed from: w  reason: collision with root package name */
    public final AbstractC0600d[] f9471w;

    /* renamed from: w0  reason: collision with root package name */
    public p0 f9472w0;

    /* renamed from: x  reason: collision with root package name */
    public final W2.t f9473x;

    /* renamed from: x0  reason: collision with root package name */
    public int f9474x0;

    /* renamed from: y  reason: collision with root package name */
    public final Z2.D f9475y;
    public long y0;

    /* renamed from: z  reason: collision with root package name */
    public final C0623s f9476z;

    static {
        AbstractC0592I.a("goog.exo.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [A0.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [e2.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, X0.j] */
    public C0585B(C0620o c0620o) {
        super(4);
        boolean z7;
        f2.m a7;
        boolean z8;
        this.f9465t = new Object();
        try {
            AbstractC0156a.x("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + Z2.H.f4606e + "]");
            this.f9467u = c0620o.f10023a.getApplicationContext();
            this.f9426H = (f2.f) c0620o.f10028h.apply(c0620o.f10024b);
            this.f9458o0 = c0620o.f10030j;
            this.f9455l0 = c0620o.f10031k;
            this.f9460q0 = false;
            this.f9438T = c0620o.f10037r;
            SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y = new SurfaceHolder$CallbackC0629y(this);
            this.f9432N = surfaceHolder$CallbackC0629y;
            this.f9433O = new Object();
            Handler handler = new Handler(c0620o.f10029i);
            AbstractC0600d[] a8 = ((C0612j) c0620o.f10025c.get()).a(handler, surfaceHolder$CallbackC0629y, surfaceHolder$CallbackC0629y, surfaceHolder$CallbackC0629y, surfaceHolder$CallbackC0629y);
            this.f9471w = a8;
            if (a8.length > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            AbstractC0156a.k(z7);
            this.f9473x = (W2.t) c0620o.f10026e.get();
            this.f9425G = (InterfaceC0024z) c0620o.d.get();
            this.f9428J = (InterfaceC0137f) c0620o.f10027g.get();
            this.F = c0620o.f10032l;
            this.f9444a0 = c0620o.f10033m;
            this.f9429K = c0620o.n;
            this.f9430L = c0620o.f10034o;
            Looper looper = c0620o.f10029i;
            this.f9427I = looper;
            Z2.B b7 = c0620o.f10024b;
            this.f9431M = b7;
            this.f9469v = this;
            this.f9421B = new Z2.p(looper, b7, new C0623s(this));
            this.f9422C = new CopyOnWriteArraySet();
            this.f9424E = new ArrayList();
            this.f9445b0 = new H2.g0();
            this.f9461r = new W2.x(new C0[a8.length], new W2.q[a8.length], L0.f9700r, null);
            this.f9423D = new H0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            for (int i7 = 0; i7 < 19; i7++) {
                int i8 = iArr[i7];
                AbstractC0156a.k(!false);
                sparseBooleanArray.append(i8, true);
            }
            this.f9473x.getClass();
            AbstractC0156a.k(!false);
            sparseBooleanArray.append(29, true);
            AbstractC0156a.k(!false);
            C0162g c0162g = new C0162g(sparseBooleanArray);
            this.f9463s = new r0(c0162g);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i9 = 0; i9 < c0162g.f4633a.size(); i9++) {
                int a9 = c0162g.a(i9);
                AbstractC0156a.k(!false);
                sparseBooleanArray2.append(a9, true);
            }
            AbstractC0156a.k(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC0156a.k(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC0156a.k(!false);
            this.f9446c0 = new r0(new C0162g(sparseBooleanArray2));
            this.f9475y = this.f9431M.a(this.f9427I, null);
            C0623s c0623s = new C0623s(this);
            this.f9476z = c0623s;
            this.f9472w0 = p0.i(this.f9461r);
            this.f9426H.S(this.f9469v, this.f9427I);
            int i10 = Z2.H.f4603a;
            if (i10 < 31) {
                a7 = new f2.m();
            } else {
                a7 = AbstractC0627w.a(this.f9467u, this, c0620o.f10038s);
            }
            this.f9420A = new C0591H(this.f9471w, this.f9473x, this.f9461r, (C0610i) c0620o.f.get(), this.f9428J, this.f9439U, this.f9440V, this.f9426H, this.f9444a0, c0620o.f10035p, c0620o.f10036q, false, this.f9427I, this.f9431M, c0623s, a7);
            this.f9459p0 = 1.0f;
            this.f9439U = 0;
            C0597b0 c0597b0 = C0597b0.f9850Y;
            this.f9447d0 = c0597b0;
            this.f9470v0 = c0597b0;
            int i11 = -1;
            this.f9474x0 = -1;
            if (i10 < 21) {
                AudioTrack audioTrack = this.f9448e0;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f9448e0.release();
                    this.f9448e0 = null;
                }
                if (this.f9448e0 == null) {
                    this.f9448e0 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                i11 = this.f9448e0.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f9467u.getSystemService("audio");
                if (audioManager != null) {
                    i11 = audioManager.generateAudioSessionId();
                }
            }
            this.f9457n0 = i11;
            this.f9462r0 = M2.c.f2253r;
            this.f9464s0 = true;
            f2.f fVar = this.f9426H;
            fVar.getClass();
            this.f9421B.a(fVar);
            InterfaceC0137f interfaceC0137f = this.f9428J;
            Handler handler2 = new Handler(this.f9427I);
            f2.f fVar2 = this.f9426H;
            C0150t c0150t = (C0150t) interfaceC0137f;
            c0150t.getClass();
            fVar2.getClass();
            T4.c cVar = c0150t.f4442b;
            cVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.f3382r;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C0136e c0136e = (C0136e) it.next();
                if (c0136e.f4390b == fVar2) {
                    c0136e.f4391c = true;
                    copyOnWriteArrayList.remove(c0136e);
                }
            }
            ((CopyOnWriteArrayList) cVar.f3382r).add(new C0136e(handler2, fVar2));
            this.f9422C.add(this.f9432N);
            Context context = c0620o.f10023a;
            SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y2 = this.f9432N;
            ?? obj = new Object();
            obj.f12b = context.getApplicationContext();
            obj.f13c = new RunnableC0594a(obj, handler, surfaceHolder$CallbackC0629y2);
            this.f9434P = obj;
            obj.j();
            C0598c c0598c = new C0598c(c0620o.f10023a, handler, this.f9432N);
            this.f9435Q = c0598c;
            c0598c.b();
            this.f9436R = new L4.f(c0620o.f10023a);
            this.f9437S = new J3.e(c0620o.f10023a);
            F3.m mVar = new F3.m(0);
            mVar.f727b = 0;
            mVar.f728c = 0;
            mVar.a();
            this.f9468u0 = a3.z.f5137u;
            this.f9456m0 = Z2.z.f4694c;
            W2.t tVar = this.f9473x;
            C0713d c0713d = this.f9458o0;
            W2.o oVar = (W2.o) tVar;
            synchronized (oVar.f3866c) {
                z8 = !oVar.f3870i.equals(c0713d);
                oVar.f3870i = c0713d;
            }
            if (z8) {
                oVar.h();
            }
            e0(1, 10, Integer.valueOf(this.f9457n0));
            e0(2, 10, Integer.valueOf(this.f9457n0));
            e0(1, 3, this.f9458o0);
            e0(2, 4, Integer.valueOf(this.f9455l0));
            e0(2, 5, 0);
            e0(1, 9, Boolean.valueOf(this.f9460q0));
            e0(2, 7, this.f9433O);
            e0(6, 8, this.f9433O);
            this.f9465t.d();
        } catch (Throwable th) {
            this.f9465t.d();
            throw th;
        }
    }

    public static long U(p0 p0Var) {
        I0 i02 = new I0();
        H0 h02 = new H0();
        p0Var.f10043a.h(p0Var.f10044b.f1180a, h02);
        long j7 = p0Var.f10045c;
        if (j7 == -9223372036854775807L) {
            return p0Var.f10043a.n(h02.f9554s, i02, 0L).f9578C;
        }
        return h02.f9556u + j7;
    }

    public final C0597b0 E() {
        J0 O5 = O();
        if (O5.q()) {
            return this.f9470v0;
        }
        Z z7 = O5.n(K(), (I0) this.f2765q, 0L).f9584s;
        C0595a0 a7 = this.f9470v0.a();
        C0597b0 c0597b0 = z7.f9807t;
        if (c0597b0 != null) {
            CharSequence charSequence = c0597b0.f9899q;
            if (charSequence != null) {
                a7.f9819a = charSequence;
            }
            CharSequence charSequence2 = c0597b0.f9900r;
            if (charSequence2 != null) {
                a7.f9820b = charSequence2;
            }
            CharSequence charSequence3 = c0597b0.f9901s;
            if (charSequence3 != null) {
                a7.f9821c = charSequence3;
            }
            CharSequence charSequence4 = c0597b0.f9902t;
            if (charSequence4 != null) {
                a7.d = charSequence4;
            }
            CharSequence charSequence5 = c0597b0.f9903u;
            if (charSequence5 != null) {
                a7.f9822e = charSequence5;
            }
            CharSequence charSequence6 = c0597b0.f9904v;
            if (charSequence6 != null) {
                a7.f = charSequence6;
            }
            CharSequence charSequence7 = c0597b0.f9905w;
            if (charSequence7 != null) {
                a7.f9823g = charSequence7;
            }
            A0 a02 = c0597b0.f9906x;
            if (a02 != null) {
                a7.f9824h = a02;
            }
            A0 a03 = c0597b0.f9907y;
            if (a03 != null) {
                a7.f9825i = a03;
            }
            byte[] bArr = c0597b0.f9908z;
            if (bArr != null) {
                a7.f9826j = (byte[]) bArr.clone();
                a7.f9827k = c0597b0.f9877A;
            }
            Uri uri = c0597b0.f9878B;
            if (uri != null) {
                a7.f9828l = uri;
            }
            Integer num = c0597b0.f9879C;
            if (num != null) {
                a7.f9829m = num;
            }
            Integer num2 = c0597b0.f9880D;
            if (num2 != null) {
                a7.n = num2;
            }
            Integer num3 = c0597b0.f9881E;
            if (num3 != null) {
                a7.f9830o = num3;
            }
            Boolean bool = c0597b0.F;
            if (bool != null) {
                a7.f9831p = bool;
            }
            Boolean bool2 = c0597b0.f9882G;
            if (bool2 != null) {
                a7.f9832q = bool2;
            }
            Integer num4 = c0597b0.f9883H;
            if (num4 != null) {
                a7.f9833r = num4;
            }
            Integer num5 = c0597b0.f9884I;
            if (num5 != null) {
                a7.f9833r = num5;
            }
            Integer num6 = c0597b0.f9885J;
            if (num6 != null) {
                a7.f9834s = num6;
            }
            Integer num7 = c0597b0.f9886K;
            if (num7 != null) {
                a7.f9835t = num7;
            }
            Integer num8 = c0597b0.f9887L;
            if (num8 != null) {
                a7.f9836u = num8;
            }
            Integer num9 = c0597b0.f9888M;
            if (num9 != null) {
                a7.f9837v = num9;
            }
            Integer num10 = c0597b0.f9889N;
            if (num10 != null) {
                a7.f9838w = num10;
            }
            CharSequence charSequence8 = c0597b0.f9890O;
            if (charSequence8 != null) {
                a7.f9839x = charSequence8;
            }
            CharSequence charSequence9 = c0597b0.f9891P;
            if (charSequence9 != null) {
                a7.f9840y = charSequence9;
            }
            CharSequence charSequence10 = c0597b0.f9892Q;
            if (charSequence10 != null) {
                a7.f9841z = charSequence10;
            }
            Integer num11 = c0597b0.f9893R;
            if (num11 != null) {
                a7.f9813A = num11;
            }
            Integer num12 = c0597b0.f9894S;
            if (num12 != null) {
                a7.f9814B = num12;
            }
            CharSequence charSequence11 = c0597b0.f9895T;
            if (charSequence11 != null) {
                a7.f9815C = charSequence11;
            }
            CharSequence charSequence12 = c0597b0.f9896U;
            if (charSequence12 != null) {
                a7.f9816D = charSequence12;
            }
            CharSequence charSequence13 = c0597b0.f9897V;
            if (charSequence13 != null) {
                a7.f9817E = charSequence13;
            }
            Integer num13 = c0597b0.W;
            if (num13 != null) {
                a7.F = num13;
            }
            Bundle bundle = c0597b0.f9898X;
            if (bundle != null) {
                a7.f9818G = bundle;
            }
        }
        return new C0597b0(a7);
    }

    public final void F() {
        q0();
        d0();
        k0(null);
        Z(0, 0);
    }

    public final x0 G(w0 w0Var) {
        int Q4 = Q(this.f9472w0);
        J0 j02 = this.f9472w0.f10043a;
        if (Q4 == -1) {
            Q4 = 0;
        }
        C0591H c0591h = this.f9420A;
        return new x0(c0591h, w0Var, j02, Q4, this.f9431M, c0591h.f9546z);
    }

    public final long H(p0 p0Var) {
        if (p0Var.f10044b.a()) {
            Object obj = p0Var.f10044b.f1180a;
            J0 j02 = p0Var.f10043a;
            H0 h02 = this.f9423D;
            j02.h(obj, h02);
            long j7 = p0Var.f10045c;
            if (j7 == -9223372036854775807L) {
                return Z2.H.S(j02.n(Q(p0Var), (I0) this.f2765q, 0L).f9578C);
            }
            return Z2.H.S(h02.f9556u) + Z2.H.S(j7);
        }
        return Z2.H.S(N(p0Var));
    }

    public final int I() {
        q0();
        if (W()) {
            return this.f9472w0.f10044b.f1181b;
        }
        return -1;
    }

    public final int J() {
        q0();
        if (W()) {
            return this.f9472w0.f10044b.f1182c;
        }
        return -1;
    }

    public final int K() {
        q0();
        int Q4 = Q(this.f9472w0);
        if (Q4 == -1) {
            return 0;
        }
        return Q4;
    }

    public final int L() {
        q0();
        if (this.f9472w0.f10043a.q()) {
            return 0;
        }
        p0 p0Var = this.f9472w0;
        return p0Var.f10043a.b(p0Var.f10044b.f1180a);
    }

    public final long M() {
        q0();
        return Z2.H.S(N(this.f9472w0));
    }

    public final long N(p0 p0Var) {
        long j7;
        if (p0Var.f10043a.q()) {
            return Z2.H.J(this.y0);
        }
        if (p0Var.f10054o) {
            j7 = p0Var.j();
        } else {
            j7 = p0Var.f10057r;
        }
        if (p0Var.f10044b.a()) {
            return j7;
        }
        J0 j02 = p0Var.f10043a;
        Object obj = p0Var.f10044b.f1180a;
        H0 h02 = this.f9423D;
        j02.h(obj, h02);
        return j7 + h02.f9556u;
    }

    public final J0 O() {
        q0();
        return this.f9472w0.f10043a;
    }

    public final L0 P() {
        q0();
        return this.f9472w0.f10049i.d;
    }

    public final int Q(p0 p0Var) {
        if (p0Var.f10043a.q()) {
            return this.f9474x0;
        }
        return p0Var.f10043a.h(p0Var.f10044b.f1180a, this.f9423D).f9554s;
    }

    public final long R() {
        q0();
        if (W()) {
            p0 p0Var = this.f9472w0;
            H2.A a7 = p0Var.f10044b;
            J0 j02 = p0Var.f10043a;
            Object obj = a7.f1180a;
            H0 h02 = this.f9423D;
            j02.h(obj, h02);
            return Z2.H.S(h02.a(a7.f1181b, a7.f1182c));
        }
        return k();
    }

    public final boolean S() {
        q0();
        return this.f9472w0.f10052l;
    }

    public final int T() {
        q0();
        return this.f9472w0.f10046e;
    }

    public final W2.h V() {
        q0();
        return ((W2.o) this.f9473x).f();
    }

    public final boolean W() {
        q0();
        return this.f9472w0.f10044b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [H2.y] */
    public final p0 X(p0 p0Var, J0 j02, Pair pair) {
        boolean z7;
        H2.A a7;
        H2.n0 n0Var;
        W2.x xVar;
        List list;
        int i7;
        long j7;
        if (!j02.q() && pair == null) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0156a.f(z7);
        J0 j03 = p0Var.f10043a;
        long H6 = H(p0Var);
        p0 h7 = p0Var.h(j02);
        if (j02.q()) {
            H2.A a8 = p0.f10042t;
            long J6 = Z2.H.J(this.y0);
            p0 b7 = h7.c(a8, J6, J6, J6, 0L, H2.n0.f1144t, this.f9461r, O3.U.f2621u).b(a8);
            b7.f10055p = b7.f10057r;
            return b7;
        }
        Object obj = h7.f10044b.f1180a;
        int i8 = Z2.H.f4603a;
        boolean z8 = !obj.equals(pair.first);
        if (z8) {
            a7 = new C0023y(pair.first);
        } else {
            a7 = h7.f10044b;
        }
        H2.A a9 = a7;
        long longValue = ((Long) pair.second).longValue();
        long J7 = Z2.H.J(H6);
        if (!j03.q()) {
            J7 -= j03.h(obj, this.f9423D).f9556u;
        }
        if (!z8 && longValue >= J7) {
            if (i7 == 0) {
                int b8 = j02.b(h7.f10051k.f1180a);
                if (b8 == -1 || j02.g(b8, this.f9423D, false).f9554s != j02.h(a9.f1180a, this.f9423D).f9554s) {
                    j02.h(a9.f1180a, this.f9423D);
                    if (a9.a()) {
                        j7 = this.f9423D.a(a9.f1181b, a9.f1182c);
                    } else {
                        j7 = this.f9423D.f9555t;
                    }
                    p0 b9 = h7.c(a9, h7.f10057r, h7.f10057r, h7.d, j7 - h7.f10057r, h7.f10048h, h7.f10049i, h7.f10050j).b(a9);
                    b9.f10055p = j7;
                    return b9;
                }
                return h7;
            }
            AbstractC0156a.k(!a9.a());
            long max = Math.max(0L, h7.f10056q - (longValue - J7));
            long j8 = h7.f10055p;
            if (h7.f10051k.equals(h7.f10044b)) {
                j8 = longValue + max;
            }
            p0 c5 = h7.c(a9, longValue, longValue, longValue, max, h7.f10048h, h7.f10049i, h7.f10050j);
            c5.f10055p = j8;
            return c5;
        }
        AbstractC0156a.k(!a9.a());
        if (z8) {
            n0Var = H2.n0.f1144t;
        } else {
            n0Var = h7.f10048h;
        }
        H2.n0 n0Var2 = n0Var;
        if (z8) {
            xVar = this.f9461r;
        } else {
            xVar = h7.f10049i;
        }
        W2.x xVar2 = xVar;
        if (z8) {
            O3.C c6 = O3.E.f2597r;
            list = O3.U.f2621u;
        } else {
            list = h7.f10050j;
        }
        p0 b10 = h7.c(a9, longValue, longValue, longValue, 0L, n0Var2, xVar2, list).b(a9);
        b10.f10055p = longValue;
        return b10;
    }

    public final Pair Y(J0 j02, int i7, long j7) {
        if (j02.q()) {
            this.f9474x0 = i7;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.y0 = j7;
            return null;
        }
        if (i7 == -1 || i7 >= j02.p()) {
            i7 = j02.a(this.f9440V);
            j7 = Z2.H.S(j02.n(i7, (I0) this.f2765q, 0L).f9578C);
        }
        return j02.j((I0) this.f2765q, this.f9423D, i7, Z2.H.J(j7));
    }

    public final void Z(final int i7, final int i8) {
        Z2.z zVar = this.f9456m0;
        if (i7 != zVar.f4695a || i8 != zVar.f4696b) {
            this.f9456m0 = new Z2.z(i7, i8);
            this.f9421B.e(24, new Z2.m() { // from class: e2.u
                @Override // Z2.m
                public final void c(Object obj) {
                    ((t0) obj).n(i7, i8);
                }
            });
            e0(2, 14, new Z2.z(i7, i8));
        }
    }

    public final void a0() {
        int i7;
        q0();
        boolean S6 = S();
        int i8 = 2;
        int d = this.f9435Q.d(2, S6);
        if (S6 && d != 1) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        n0(d, i7, S6);
        p0 p0Var = this.f9472w0;
        if (p0Var.f10046e != 1) {
            return;
        }
        p0 e3 = p0Var.e(null);
        if (e3.f10043a.q()) {
            i8 = 4;
        }
        p0 g7 = e3.g(i8);
        this.W++;
        Z2.D d7 = this.f9420A.f9544x;
        d7.getClass();
        Z2.C b7 = Z2.D.b();
        b7.f4595a = d7.f4597a.obtainMessage(0);
        b7.b();
        o0(g7, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void b0(t0 t0Var) {
        q0();
        t0Var.getClass();
        Z2.p pVar = this.f9421B;
        pVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = pVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            Z2.o oVar = (Z2.o) it.next();
            if (oVar.f4645a.equals(t0Var)) {
                oVar.d = true;
                if (oVar.f4647c) {
                    oVar.f4647c = false;
                    C0162g c5 = oVar.f4646b.c();
                    pVar.f4650c.b(oVar.f4645a, c5);
                }
                copyOnWriteArraySet.remove(oVar);
            }
        }
    }

    public final void c0(int i7) {
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            this.f9424E.remove(i8);
        }
        H2.g0 g0Var = this.f9445b0;
        int[] iArr = g0Var.f1064b;
        int[] iArr2 = new int[iArr.length - i7];
        int i9 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 >= 0 && i11 < i7) {
                i9++;
            } else {
                int i12 = i10 - i9;
                if (i11 >= 0) {
                    i11 -= i7;
                }
                iArr2[i12] = i11;
            }
        }
        this.f9445b0 = new H2.g0(iArr2, new Random(g0Var.f1063a.nextLong()));
    }

    public final void d0() {
        b3.k kVar = this.f9452i0;
        SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y = this.f9432N;
        if (kVar != null) {
            x0 G6 = G(this.f9433O);
            AbstractC0156a.k(!G6.f10092g);
            G6.d = 10000;
            AbstractC0156a.k(!G6.f10092g);
            G6.f10091e = null;
            G6.c();
            this.f9452i0.f7111q.remove(surfaceHolder$CallbackC0629y);
            this.f9452i0 = null;
        }
        TextureView textureView = this.f9454k0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolder$CallbackC0629y) {
                AbstractC0156a.K("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f9454k0.setSurfaceTextureListener(null);
            }
            this.f9454k0 = null;
        }
        SurfaceHolder surfaceHolder = this.f9451h0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolder$CallbackC0629y);
            this.f9451h0 = null;
        }
    }

    public final void e0(int i7, int i8, Object obj) {
        AbstractC0600d[] abstractC0600dArr;
        for (AbstractC0600d abstractC0600d : this.f9471w) {
            if (abstractC0600d.f9932r == i7) {
                x0 G6 = G(abstractC0600d);
                AbstractC0156a.k(!G6.f10092g);
                G6.d = i8;
                AbstractC0156a.k(!G6.f10092g);
                G6.f10091e = obj;
                G6.c();
            }
        }
    }

    public final void f0(SurfaceHolder surfaceHolder) {
        this.f9453j0 = false;
        this.f9451h0 = surfaceHolder;
        surfaceHolder.addCallback(this.f9432N);
        Surface surface = this.f9451h0.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f9451h0.getSurfaceFrame();
            Z(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        Z(0, 0);
    }

    public final void g0(boolean z7) {
        q0();
        int d = this.f9435Q.d(T(), z7);
        int i7 = 1;
        if (z7 && d != 1) {
            i7 = 2;
        }
        n0(d, i7, z7);
    }

    public final void h0(q0 q0Var) {
        q0();
        if (this.f9472w0.n.equals(q0Var)) {
            return;
        }
        p0 f = this.f9472w0.f(q0Var);
        this.W++;
        this.f9420A.f9544x.a(4, q0Var).b();
        o0(f, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void i0(int i7) {
        q0();
        if (this.f9439U != i7) {
            this.f9439U = i7;
            Z2.D d = this.f9420A.f9544x;
            d.getClass();
            Z2.C b7 = Z2.D.b();
            b7.f4595a = d.f4597a.obtainMessage(11, i7, 0);
            b7.b();
            C0624t c0624t = new C0624t(i7);
            Z2.p pVar = this.f9421B;
            pVar.c(8, c0624t);
            m0();
            pVar.b();
        }
    }

    public final void j0(W2.w wVar) {
        q0();
        W2.t tVar = this.f9473x;
        tVar.getClass();
        W2.o oVar = (W2.o) tVar;
        if (wVar.equals(oVar.f())) {
            return;
        }
        if (wVar instanceof W2.h) {
            oVar.l((W2.h) wVar);
        }
        W2.g gVar = new W2.g(oVar.f());
        gVar.b(wVar);
        oVar.l(new W2.h(gVar));
        this.f9421B.e(19, new H2.U(12, wVar));
    }

    public final void k0(Object obj) {
        AbstractC0600d[] abstractC0600dArr;
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (AbstractC0600d abstractC0600d : this.f9471w) {
            if (abstractC0600d.f9932r == 2) {
                x0 G6 = G(abstractC0600d);
                AbstractC0156a.k(!G6.f10092g);
                G6.d = 1;
                AbstractC0156a.k(true ^ G6.f10092g);
                G6.f10091e = obj;
                G6.c();
                arrayList.add(G6);
            }
        }
        Object obj2 = this.f9449f0;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((x0) it.next()).a(this.f9438T);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z7 = true;
            }
            Object obj3 = this.f9449f0;
            Surface surface = this.f9450g0;
            if (obj3 == surface) {
                surface.release();
                this.f9450g0 = null;
            }
        }
        this.f9449f0 = obj;
        if (z7) {
            l0(new C0616l(2, new F0.c(3), 1003));
        }
    }

    public final void l0(C0616l c0616l) {
        p0 p0Var = this.f9472w0;
        p0 b7 = p0Var.b(p0Var.f10044b);
        b7.f10055p = b7.f10057r;
        b7.f10056q = 0L;
        p0 g7 = b7.g(1);
        if (c0616l != null) {
            g7 = g7.e(c0616l);
        }
        p0 p0Var2 = g7;
        this.W++;
        Z2.D d = this.f9420A.f9544x;
        d.getClass();
        Z2.C b8 = Z2.D.b();
        b8.f4595a = d.f4597a.obtainMessage(6);
        b8.b();
        o0(p0Var2, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[LOOP:0: B:23:0x0080->B:25:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C0585B.m0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void n0(int i7, int i8, boolean z7) {
        ?? r15;
        int i9 = 0;
        if (z7 && i7 != -1) {
            r15 = 1;
        } else {
            r15 = 0;
        }
        if (r15 != 0 && i7 != 1) {
            i9 = 1;
        }
        p0 p0Var = this.f9472w0;
        if (p0Var.f10052l == r15 && p0Var.f10053m == i9) {
            return;
        }
        this.W++;
        boolean z8 = p0Var.f10054o;
        p0 p0Var2 = p0Var;
        if (z8) {
            p0Var2 = p0Var.a();
        }
        p0 d = p0Var2.d(i9, r15);
        Z2.D d7 = this.f9420A.f9544x;
        d7.getClass();
        Z2.C b7 = Z2.D.b();
        b7.f4595a = d7.f4597a.obtainMessage(1, r15, i9);
        b7.b();
        o0(d, 0, i8, false, 5, -9223372036854775807L, -1, false);
    }

    public final void o0(final p0 p0Var, final int i7, final int i8, boolean z7, int i9, long j7, int i10, boolean z8) {
        Pair pair;
        int i11;
        final Z z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        Object obj;
        Z z14;
        Object obj2;
        int i13;
        long j8;
        long j9;
        Object obj3;
        Z z15;
        Object obj4;
        int i14;
        p0 p0Var2 = this.f9472w0;
        this.f9472w0 = p0Var;
        boolean z16 = !p0Var2.f10043a.equals(p0Var.f10043a);
        J0 j02 = p0Var2.f10043a;
        J0 j03 = p0Var.f10043a;
        if (j03.q() && j02.q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (j03.q() != j02.q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            H2.A a7 = p0Var2.f10044b;
            Object obj5 = a7.f1180a;
            H0 h02 = this.f9423D;
            int i15 = j02.h(obj5, h02).f9554s;
            I0 i02 = (I0) this.f2765q;
            Object obj6 = j02.n(i15, i02, 0L).f9582q;
            H2.A a8 = p0Var.f10044b;
            if (obj6.equals(j03.n(j03.h(a8.f1180a, h02).f9554s, i02, 0L).f9582q)) {
                pair = (z7 && i9 == 0 && a7.d < a8.d) ? new Pair(Boolean.TRUE, 0) : (z7 && i9 == 1 && z8) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z7 && i9 == 0) {
                    i11 = 1;
                } else if (z7 && i9 == 1) {
                    i11 = 2;
                } else if (!z16) {
                    throw new IllegalStateException();
                } else {
                    i11 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        C0597b0 c0597b0 = this.f9447d0;
        if (booleanValue) {
            z9 = !p0Var.f10043a.q() ? p0Var.f10043a.n(p0Var.f10043a.h(p0Var.f10044b.f1180a, this.f9423D).f9554s, (I0) this.f2765q, 0L).f9584s : null;
            this.f9470v0 = C0597b0.f9850Y;
        } else {
            z9 = null;
        }
        if (booleanValue || !p0Var2.f10050j.equals(p0Var.f10050j)) {
            C0595a0 a9 = this.f9470v0.a();
            List list = p0Var.f10050j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                C1461c c1461c = (C1461c) list.get(i16);
                int i17 = 0;
                while (true) {
                    InterfaceC1460b[] interfaceC1460bArr = c1461c.f16206q;
                    if (i17 < interfaceC1460bArr.length) {
                        interfaceC1460bArr[i17].c(a9);
                        i17++;
                    }
                }
            }
            this.f9470v0 = new C0597b0(a9);
            c0597b0 = E();
        }
        boolean z17 = !c0597b0.equals(this.f9447d0);
        this.f9447d0 = c0597b0;
        boolean z18 = p0Var2.f10052l != p0Var.f10052l;
        boolean z19 = p0Var2.f10046e != p0Var.f10046e;
        if (z19 || z18) {
            p0();
        }
        boolean z20 = p0Var2.f10047g != p0Var.f10047g;
        if (z16) {
            this.f9421B.c(0, new Z2.m() { // from class: e2.q
                @Override // Z2.m
                public final void c(Object obj7) {
                    t0 t0Var = (t0) obj7;
                    switch (r2) {
                        case 0:
                            J0 j04 = ((p0) p0Var).f10043a;
                            t0Var.d(i7);
                            return;
                        case 1:
                            t0Var.E(i7, ((p0) p0Var).f10052l);
                            return;
                        default:
                            t0Var.s((Z) p0Var, i7);
                            return;
                    }
                }
            });
        }
        if (z7) {
            H0 h03 = new H0();
            if (p0Var2.f10043a.q()) {
                z12 = z19;
                z13 = z20;
                i12 = i10;
                obj = null;
                z14 = null;
                obj2 = null;
                i13 = -1;
            } else {
                Object obj7 = p0Var2.f10044b.f1180a;
                p0Var2.f10043a.h(obj7, h03);
                int i18 = h03.f9554s;
                int b7 = p0Var2.f10043a.b(obj7);
                z12 = z19;
                z13 = z20;
                obj2 = obj7;
                obj = p0Var2.f10043a.n(i18, (I0) this.f2765q, 0L).f9582q;
                z14 = ((I0) this.f2765q).f9584s;
                i12 = i18;
                i13 = b7;
            }
            boolean a10 = p0Var2.f10044b.a();
            if (i9 == 0) {
                if (a10) {
                    H2.A a11 = p0Var2.f10044b;
                    j8 = h03.a(a11.f1181b, a11.f1182c);
                    j9 = U(p0Var2);
                } else {
                    j8 = p0Var2.f10044b.f1183e != -1 ? U(this.f9472w0) : h03.f9555t + h03.f9556u;
                    j9 = j8;
                }
            } else if (a10) {
                j8 = p0Var2.f10057r;
                j9 = U(p0Var2);
            } else {
                j8 = h03.f9556u + p0Var2.f10057r;
                j9 = j8;
            }
            long S6 = Z2.H.S(j8);
            long S7 = Z2.H.S(j9);
            H2.A a12 = p0Var2.f10044b;
            u0 u0Var = new u0(obj, i12, z14, obj2, i13, S6, S7, a12.f1181b, a12.f1182c);
            int K6 = K();
            if (this.f9472w0.f10043a.q()) {
                z10 = z18;
                z11 = z17;
                obj3 = null;
                z15 = null;
                obj4 = null;
                i14 = -1;
            } else {
                p0 p0Var3 = this.f9472w0;
                Object obj8 = p0Var3.f10044b.f1180a;
                p0Var3.f10043a.h(obj8, this.f9423D);
                int b8 = this.f9472w0.f10043a.b(obj8);
                J0 j04 = this.f9472w0.f10043a;
                I0 i03 = (I0) this.f2765q;
                z10 = z18;
                z11 = z17;
                Object obj9 = j04.n(K6, i03, 0L).f9582q;
                i14 = b8;
                z15 = i03.f9584s;
                obj3 = obj9;
                obj4 = obj8;
            }
            long S8 = Z2.H.S(j7);
            long S9 = this.f9472w0.f10044b.a() ? Z2.H.S(U(this.f9472w0)) : S8;
            H2.A a13 = this.f9472w0.f10044b;
            this.f9421B.c(11, new Z1.g(i9, u0Var, new u0(obj3, K6, z15, obj4, i14, S8, S9, a13.f1181b, a13.f1182c)));
        } else {
            z10 = z18;
            z11 = z17;
            z12 = z19;
            z13 = z20;
        }
        if (booleanValue) {
            this.f9421B.c(1, new Z2.m() { // from class: e2.q
                @Override // Z2.m
                public final void c(Object obj72) {
                    t0 t0Var = (t0) obj72;
                    switch (r2) {
                        case 0:
                            J0 j042 = ((p0) z9).f10043a;
                            t0Var.d(intValue);
                            return;
                        case 1:
                            t0Var.E(intValue, ((p0) z9).f10052l);
                            return;
                        default:
                            t0Var.s((Z) z9, intValue);
                            return;
                    }
                }
            });
        }
        if (p0Var2.f != p0Var.f) {
            this.f9421B.c(10, new Z2.m() { // from class: e2.r
                @Override // Z2.m
                public final void c(Object obj10) {
                    t0 t0Var = (t0) obj10;
                    switch (r2) {
                        case 0:
                            p0 p0Var4 = p0Var;
                            boolean z21 = p0Var4.f10047g;
                            t0Var.getClass();
                            t0Var.u(p0Var4.f10047g);
                            return;
                        case 1:
                            p0 p0Var5 = p0Var;
                            t0Var.D(p0Var5.f10046e, p0Var5.f10052l);
                            return;
                        case 2:
                            t0Var.c(p0Var.f10046e);
                            return;
                        case 3:
                            t0Var.b(p0Var.f10053m);
                            return;
                        case 4:
                            t0Var.L(p0Var.k());
                            return;
                        case 5:
                            t0Var.i(p0Var.n);
                            return;
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            t0Var.w(p0Var.f);
                            return;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            t0Var.j(p0Var.f);
                            return;
                        default:
                            t0Var.m(p0Var.f10049i.d);
                            return;
                    }
                }
            });
            if (p0Var.f != null) {
                this.f9421B.c(10, new Z2.m() { // from class: e2.r
                    @Override // Z2.m
                    public final void c(Object obj10) {
                        t0 t0Var = (t0) obj10;
                        switch (r2) {
                            case 0:
                                p0 p0Var4 = p0Var;
                                boolean z21 = p0Var4.f10047g;
                                t0Var.getClass();
                                t0Var.u(p0Var4.f10047g);
                                return;
                            case 1:
                                p0 p0Var5 = p0Var;
                                t0Var.D(p0Var5.f10046e, p0Var5.f10052l);
                                return;
                            case 2:
                                t0Var.c(p0Var.f10046e);
                                return;
                            case 3:
                                t0Var.b(p0Var.f10053m);
                                return;
                            case 4:
                                t0Var.L(p0Var.k());
                                return;
                            case 5:
                                t0Var.i(p0Var.n);
                                return;
                            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                t0Var.w(p0Var.f);
                                return;
                            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                t0Var.j(p0Var.f);
                                return;
                            default:
                                t0Var.m(p0Var.f10049i.d);
                                return;
                        }
                    }
                });
            }
        }
        W2.x xVar = p0Var2.f10049i;
        W2.x xVar2 = p0Var.f10049i;
        if (xVar != xVar2) {
            W2.t tVar = this.f9473x;
            Object obj10 = xVar2.f3935e;
            tVar.getClass();
            W2.s sVar = (W2.s) obj10;
            this.f9421B.c(2, new Z2.m() { // from class: e2.r
                @Override // Z2.m
                public final void c(Object obj102) {
                    t0 t0Var = (t0) obj102;
                    switch (r2) {
                        case 0:
                            p0 p0Var4 = p0Var;
                            boolean z21 = p0Var4.f10047g;
                            t0Var.getClass();
                            t0Var.u(p0Var4.f10047g);
                            return;
                        case 1:
                            p0 p0Var5 = p0Var;
                            t0Var.D(p0Var5.f10046e, p0Var5.f10052l);
                            return;
                        case 2:
                            t0Var.c(p0Var.f10046e);
                            return;
                        case 3:
                            t0Var.b(p0Var.f10053m);
                            return;
                        case 4:
                            t0Var.L(p0Var.k());
                            return;
                        case 5:
                            t0Var.i(p0Var.n);
                            return;
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            t0Var.w(p0Var.f);
                            return;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            t0Var.j(p0Var.f);
                            return;
                        default:
                            t0Var.m(p0Var.f10049i.d);
                            return;
                    }
                }
            });
        }
        if (z11) {
            this.f9421B.c(14, new H2.U(11, this.f9447d0));
        }
        if (z13) {
            this.f9421B.c(3, new Z2.m() { // from class: e2.r
                @Override // Z2.m
                public final void c(Object obj102) {
                    t0 t0Var = (t0) obj102;
                    switch (r2) {
                        case 0:
                            p0 p0Var4 = p0Var;
                            boolean z21 = p0Var4.f10047g;
                            t0Var.getClass();
                            t0Var.u(p0Var4.f10047g);
                            return;
                        case 1:
                            p0 p0Var5 = p0Var;
                            t0Var.D(p0Var5.f10046e, p0Var5.f10052l);
                            return;
                        case 2:
                            t0Var.c(p0Var.f10046e);
                            return;
                        case 3:
                            t0Var.b(p0Var.f10053m);
                            return;
                        case 4:
                            t0Var.L(p0Var.k());
                            return;
                        case 5:
                            t0Var.i(p0Var.n);
                            return;
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            t0Var.w(p0Var.f);
                            return;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            t0Var.j(p0Var.f);
                            return;
                        default:
                            t0Var.m(p0Var.f10049i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || z10) {
            this.f9421B.c(-1, new Z2.m() { // from class: e2.r
                @Override // Z2.m
                public final void c(Object obj102) {
                    t0 t0Var = (t0) obj102;
                    switch (r2) {
                        case 0:
                            p0 p0Var4 = p0Var;
                            boolean z21 = p0Var4.f10047g;
                            t0Var.getClass();
                            t0Var.u(p0Var4.f10047g);
                            return;
                        case 1:
                            p0 p0Var5 = p0Var;
                            t0Var.D(p0Var5.f10046e, p0Var5.f10052l);
                            return;
                        case 2:
                            t0Var.c(p0Var.f10046e);
                            return;
                        case 3:
                            t0Var.b(p0Var.f10053m);
                            return;
                        case 4:
                            t0Var.L(p0Var.k());
                            return;
                        case 5:
                            t0Var.i(p0Var.n);
                            return;
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            t0Var.w(p0Var.f);
                            return;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            t0Var.j(p0Var.f);
                            return;
                        default:
                            t0Var.m(p0Var.f10049i.d);
                            return;
                    }
                }
            });
        }
        if (z12) {
            this.f9421B.c(4, new Z2.m() { // from class: e2.r
                @Override // Z2.m
                public final void c(Object obj102) {
                    t0 t0Var = (t0) obj102;
                    switch (r2) {
                        case 0:
                            p0 p0Var4 = p0Var;
                            boolean z21 = p0Var4.f10047g;
                            t0Var.getClass();
                            t0Var.u(p0Var4.f10047g);
                            return;
                        case 1:
                            p0 p0Var5 = p0Var;
                            t0Var.D(p0Var5.f10046e, p0Var5.f10052l);
                            return;
                        case 2:
                            t0Var.c(p0Var.f10046e);
                            return;
                        case 3:
                            t0Var.b(p0Var.f10053m);
                            return;
                        case 4:
                            t0Var.L(p0Var.k());
                            return;
                        case 5:
                            t0Var.i(p0Var.n);
                            return;
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            t0Var.w(p0Var.f);
                            return;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            t0Var.j(p0Var.f);
                            return;
                        default:
                            t0Var.m(p0Var.f10049i.d);
                            return;
                    }
                }
            });
        }
        if (z10) {
            this.f9421B.c(5, new Z2.m() { // from class: e2.q
                @Override // Z2.m
                public final void c(Object obj72) {
                    t0 t0Var = (t0) obj72;
                    switch (r2) {
                        case 0:
                            J0 j042 = ((p0) p0Var).f10043a;
                            t0Var.d(i8);
                            return;
                        case 1:
                            t0Var.E(i8, ((p0) p0Var).f10052l);
                            return;
                        default:
                            t0Var.s((Z) p0Var, i8);
                            return;
                    }
                }
            });
        }
        if (p0Var2.f10053m != p0Var.f10053m) {
            this.f9421B.c(6, new Z2.m() { // from class: e2.r
                @Override // Z2.m
                public final void c(Object obj102) {
                    t0 t0Var = (t0) obj102;
                    switch (r2) {
                        case 0:
                            p0 p0Var4 = p0Var;
                            boolean z21 = p0Var4.f10047g;
                            t0Var.getClass();
                            t0Var.u(p0Var4.f10047g);
                            return;
                        case 1:
                            p0 p0Var5 = p0Var;
                            t0Var.D(p0Var5.f10046e, p0Var5.f10052l);
                            return;
                        case 2:
                            t0Var.c(p0Var.f10046e);
                            return;
                        case 3:
                            t0Var.b(p0Var.f10053m);
                            return;
                        case 4:
                            t0Var.L(p0Var.k());
                            return;
                        case 5:
                            t0Var.i(p0Var.n);
                            return;
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            t0Var.w(p0Var.f);
                            return;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            t0Var.j(p0Var.f);
                            return;
                        default:
                            t0Var.m(p0Var.f10049i.d);
                            return;
                    }
                }
            });
        }
        if (p0Var2.k() != p0Var.k()) {
            this.f9421B.c(7, new Z2.m() { // from class: e2.r
                @Override // Z2.m
                public final void c(Object obj102) {
                    t0 t0Var = (t0) obj102;
                    switch (r2) {
                        case 0:
                            p0 p0Var4 = p0Var;
                            boolean z21 = p0Var4.f10047g;
                            t0Var.getClass();
                            t0Var.u(p0Var4.f10047g);
                            return;
                        case 1:
                            p0 p0Var5 = p0Var;
                            t0Var.D(p0Var5.f10046e, p0Var5.f10052l);
                            return;
                        case 2:
                            t0Var.c(p0Var.f10046e);
                            return;
                        case 3:
                            t0Var.b(p0Var.f10053m);
                            return;
                        case 4:
                            t0Var.L(p0Var.k());
                            return;
                        case 5:
                            t0Var.i(p0Var.n);
                            return;
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            t0Var.w(p0Var.f);
                            return;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            t0Var.j(p0Var.f);
                            return;
                        default:
                            t0Var.m(p0Var.f10049i.d);
                            return;
                    }
                }
            });
        }
        if (!p0Var2.n.equals(p0Var.n)) {
            this.f9421B.c(12, new Z2.m() { // from class: e2.r
                @Override // Z2.m
                public final void c(Object obj102) {
                    t0 t0Var = (t0) obj102;
                    switch (r2) {
                        case 0:
                            p0 p0Var4 = p0Var;
                            boolean z21 = p0Var4.f10047g;
                            t0Var.getClass();
                            t0Var.u(p0Var4.f10047g);
                            return;
                        case 1:
                            p0 p0Var5 = p0Var;
                            t0Var.D(p0Var5.f10046e, p0Var5.f10052l);
                            return;
                        case 2:
                            t0Var.c(p0Var.f10046e);
                            return;
                        case 3:
                            t0Var.b(p0Var.f10053m);
                            return;
                        case 4:
                            t0Var.L(p0Var.k());
                            return;
                        case 5:
                            t0Var.i(p0Var.n);
                            return;
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            t0Var.w(p0Var.f);
                            return;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            t0Var.j(p0Var.f);
                            return;
                        default:
                            t0Var.m(p0Var.f10049i.d);
                            return;
                    }
                }
            });
        }
        m0();
        this.f9421B.b();
        if (p0Var2.f10054o != p0Var.f10054o) {
            Iterator it = this.f9422C.iterator();
            while (it.hasNext()) {
                ((SurfaceHolder$CallbackC0629y) it.next()).f10095q.p0();
            }
        }
    }

    public final void p0() {
        int T6 = T();
        J3.e eVar = this.f9437S;
        L4.f fVar = this.f9436R;
        if (T6 != 1) {
            if (T6 != 2 && T6 != 3) {
                if (T6 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                q0();
                boolean z7 = this.f9472w0.f10054o;
                S();
                fVar.getClass();
                S();
                eVar.getClass();
            }
        }
        fVar.getClass();
        eVar.getClass();
    }

    public final void q0() {
        IllegalStateException illegalStateException;
        X0.j jVar = this.f9465t;
        synchronized (jVar) {
            boolean z7 = false;
            while (!jVar.f4072a) {
                try {
                    jVar.wait();
                } catch (InterruptedException unused) {
                    z7 = true;
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f9427I.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f9427I.getThread().getName();
            int i7 = Z2.H.f4603a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (!this.f9464s0) {
                if (this.f9466t0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                AbstractC0156a.L("ExoPlayerImpl", str, illegalStateException);
                this.f9466t0 = true;
                return;
            }
            throw new IllegalStateException(str);
        }
    }

    @Override // P1.c
    public final void w(int i7, long j7, boolean z7) {
        boolean z8;
        q0();
        if (i7 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0156a.f(z8);
        f2.f fVar = this.f9426H;
        if (!fVar.f10356y) {
            C0695a M6 = fVar.M();
            fVar.f10356y = true;
            fVar.R(M6, -1, new C0214f(29));
        }
        J0 j02 = this.f9472w0.f10043a;
        if (!j02.q() && i7 >= j02.p()) {
            return;
        }
        this.W++;
        if (W()) {
            AbstractC0156a.K("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C0588E c0588e = new C0588E(this.f9472w0);
            c0588e.a(1);
            C0585B c0585b = this.f9476z.f10069q;
            c0585b.f9475y.c(new A4.d(c0585b, 10, c0588e));
            return;
        }
        p0 p0Var = this.f9472w0;
        int i8 = p0Var.f10046e;
        if (i8 == 3 || (i8 == 4 && !j02.q())) {
            p0Var = this.f9472w0.g(2);
        }
        int K6 = K();
        p0 X6 = X(p0Var, j02, Y(j02, i7, j7));
        this.f9420A.f9544x.a(3, new C0590G(j02, i7, Z2.H.J(j7))).b();
        o0(X6, 0, 1, true, 1, N(X6), K6, z7);
    }
}
