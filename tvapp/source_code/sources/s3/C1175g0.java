package s3;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0405c0;
import com.google.android.gms.internal.measurement.G1;
import com.google.android.gms.internal.measurement.H1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.R1;
import com.google.android.gms.internal.measurement.U1;
import j3.C0837a;
import java.util.concurrent.atomic.AtomicInteger;
import k3.AbstractC0958a;
import m4.C0997b;
/* renamed from: s3.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175g0 implements InterfaceC1193p0 {

    /* renamed from: Y  reason: collision with root package name */
    public static volatile C1175g0 f14033Y;

    /* renamed from: A  reason: collision with root package name */
    public final f1 f14034A;

    /* renamed from: B  reason: collision with root package name */
    public final x1 f14035B;

    /* renamed from: C  reason: collision with root package name */
    public final C1153H f14036C;

    /* renamed from: D  reason: collision with root package name */
    public final C0837a f14037D;

    /* renamed from: E  reason: collision with root package name */
    public final N0 f14038E;
    public final C1212z0 F;

    /* renamed from: G  reason: collision with root package name */
    public final C1164b f14039G;

    /* renamed from: H  reason: collision with root package name */
    public final L0 f14040H;

    /* renamed from: I  reason: collision with root package name */
    public final String f14041I;

    /* renamed from: J  reason: collision with root package name */
    public C1152G f14042J;

    /* renamed from: K  reason: collision with root package name */
    public R0 f14043K;

    /* renamed from: L  reason: collision with root package name */
    public C1192p f14044L;

    /* renamed from: M  reason: collision with root package name */
    public C1150E f14045M;

    /* renamed from: O  reason: collision with root package name */
    public Boolean f14047O;

    /* renamed from: P  reason: collision with root package name */
    public long f14048P;

    /* renamed from: Q  reason: collision with root package name */
    public volatile Boolean f14049Q;

    /* renamed from: R  reason: collision with root package name */
    public final Boolean f14050R;

    /* renamed from: S  reason: collision with root package name */
    public final Boolean f14051S;

    /* renamed from: T  reason: collision with root package name */
    public volatile boolean f14052T;

    /* renamed from: U  reason: collision with root package name */
    public int f14053U;

    /* renamed from: V  reason: collision with root package name */
    public int f14054V;

    /* renamed from: X  reason: collision with root package name */
    public final long f14055X;

    /* renamed from: q  reason: collision with root package name */
    public final Context f14056q;

    /* renamed from: r  reason: collision with root package name */
    public final String f14057r;

    /* renamed from: s  reason: collision with root package name */
    public final String f14058s;

    /* renamed from: t  reason: collision with root package name */
    public final String f14059t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f14060u;

    /* renamed from: v  reason: collision with root package name */
    public final m3.i f14061v;

    /* renamed from: w  reason: collision with root package name */
    public final C1170e f14062w;

    /* renamed from: x  reason: collision with root package name */
    public final T f14063x;

    /* renamed from: y  reason: collision with root package name */
    public final C1154I f14064y;

    /* renamed from: z  reason: collision with root package name */
    public final C1169d0 f14065z;

    /* renamed from: N  reason: collision with root package name */
    public boolean f14046N = false;
    public final AtomicInteger W = new AtomicInteger(0);

    /* JADX WARN: Type inference failed for: r3v7, types: [s3.e, P1.c] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.android.gms.internal.measurement.P1, N3.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [s3.q0, s3.L0] */
    public C1175g0(C1208x0 c1208x0) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z7 = false;
        Context context = c1208x0.f14373a;
        m3.i iVar = new m3.i(3);
        this.f14061v = iVar;
        AbstractC1204v0.f14367k = iVar;
        this.f14056q = context;
        this.f14057r = c1208x0.f14374b;
        this.f14058s = c1208x0.f14375c;
        this.f14059t = c1208x0.d;
        this.f14060u = c1208x0.f14378h;
        this.f14049Q = c1208x0.f14376e;
        this.f14041I = c1208x0.f14380j;
        this.f14052T = true;
        C0405c0 c0405c0 = c1208x0.f14377g;
        if (c0405c0 != null && (bundle = c0405c0.f8524w) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f14050R = (Boolean) obj;
            }
            Object obj2 = c0405c0.f8524w.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f14051S = (Boolean) obj2;
            }
        }
        if (R1.f8404i == null && context != null) {
            Object obj3 = R1.f8403h;
            synchronized (obj3) {
                try {
                    if (R1.f8404i == null) {
                        synchronized (obj3) {
                            H1 h12 = R1.f8404i;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext = applicationContext == null ? context : applicationContext;
                            if (h12 == null || h12.f8352a != applicationContext) {
                                if (h12 != null) {
                                    G1.d();
                                    U1.c();
                                    K1.O();
                                }
                                ?? obj4 = new Object();
                                obj4.f8394q = applicationContext;
                                R1.f8404i = new H1(applicationContext, AbstractC0958a.y(obj4));
                                R1.f8406k.incrementAndGet();
                            }
                        }
                    }
                } finally {
                }
            }
        }
        this.f14037D = C0837a.f11847a;
        Long l7 = c1208x0.f14379i;
        if (l7 != null) {
            currentTimeMillis = l7.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f14055X = currentTimeMillis;
        ?? cVar = new P1.c(this);
        cVar.f14005t = new C0997b(3);
        this.f14062w = cVar;
        T t5 = new T(this);
        t5.F();
        this.f14063x = t5;
        C1154I c1154i = new C1154I(this);
        c1154i.F();
        this.f14064y = c1154i;
        x1 x1Var = new x1(this);
        x1Var.F();
        this.f14035B = x1Var;
        this.f14036C = new C1153H(new V(this, 2));
        this.f14039G = new C1164b(this);
        N0 n02 = new N0(this);
        n02.I();
        this.f14038E = n02;
        C1212z0 c1212z0 = new C1212z0(this);
        c1212z0.I();
        this.F = c1212z0;
        f1 f1Var = new f1(this);
        f1Var.I();
        this.f14034A = f1Var;
        ?? abstractC1195q0 = new AbstractC1195q0(this);
        abstractC1195q0.F();
        this.f14040H = abstractC1195q0;
        C1169d0 c1169d0 = new C1169d0(this);
        c1169d0.F();
        this.f14065z = c1169d0;
        C0405c0 c0405c02 = c1208x0.f14377g;
        if (c0405c02 != null && c0405c02.f8519r != 0) {
            z7 = true;
        }
        boolean z8 = !z7;
        if (context.getApplicationContext() instanceof Application) {
            g(c1212z0);
            C1175g0 c1175g0 = (C1175g0) c1212z0.f2765q;
            if (c1175g0.f14056q.getApplicationContext() instanceof Application) {
                Application application = (Application) c1175g0.f14056q.getApplicationContext();
                if (c1212z0.f14408s == null) {
                    c1212z0.f14408s = new I0(c1212z0);
                }
                if (z8) {
                    application.unregisterActivityLifecycleCallbacks(c1212z0.f14408s);
                    application.registerActivityLifecycleCallbacks(c1212z0.f14408s);
                    c1212z0.b().f13803D.d("Registered activity lifecycle callback");
                }
            }
        } else {
            i(c1154i);
            c1154i.f13810y.d("Application context is not an Application");
        }
        c1169d0.M(new R3.a(this, c1208x0, 14, false));
    }

    public static C1175g0 e(Context context, C0405c0 c0405c0, Long l7) {
        Bundle bundle;
        if (c0405c0 != null && (c0405c0.f8522u == null || c0405c0.f8523v == null)) {
            c0405c0 = new C0405c0(c0405c0.f8518q, c0405c0.f8519r, c0405c0.f8520s, c0405c0.f8521t, null, null, c0405c0.f8524w, null);
        }
        g3.n.g(context);
        g3.n.g(context.getApplicationContext());
        if (f14033Y == null) {
            synchronized (C1175g0.class) {
                try {
                    if (f14033Y == null) {
                        f14033Y = new C1175g0(new C1208x0(context, c0405c0, l7));
                    }
                } finally {
                }
            }
        } else if (c0405c0 != null && (bundle = c0405c0.f8524w) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            g3.n.g(f14033Y);
            f14033Y.f14049Q = Boolean.valueOf(c0405c0.f8524w.getBoolean("dataCollectionDefaultEnabled"));
        }
        g3.n.g(f14033Y);
        return f14033Y;
    }

    public static void g(AbstractC1157L abstractC1157L) {
        if (abstractC1157L != null) {
            if (abstractC1157L.f13826r) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1157L.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    public static void h(AbstractC1195q0 abstractC1195q0) {
        if (abstractC1195q0 != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public static void i(AbstractC1195q0 abstractC1195q0) {
        if (abstractC1195q0 != null) {
            if (abstractC1195q0.f14182r) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1195q0.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // s3.InterfaceC1193p0
    public final Context a() {
        return this.f14056q;
    }

    @Override // s3.InterfaceC1193p0
    public final C1154I b() {
        C1154I c1154i = this.f14064y;
        i(c1154i);
        return c1154i;
    }

    @Override // s3.InterfaceC1193p0
    public final m3.i c() {
        return this.f14061v;
    }

    @Override // s3.InterfaceC1193p0
    public final C1169d0 d() {
        C1169d0 c1169d0 = this.f14065z;
        i(c1169d0);
        return c1169d0;
    }

    @Override // s3.InterfaceC1193p0
    public final C0837a f() {
        return this.f14037D;
    }

    public final boolean j() {
        if (l() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f14048P) > 1000) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            r6 = this;
            boolean r0 = r6.f14046N
            if (r0 == 0) goto Lb4
            s3.d0 r0 = r6.f14065z
            i(r0)
            r0.D()
            java.lang.Boolean r0 = r6.f14047O
            j3.a r1 = r6.f14037D
            if (r0 == 0) goto L34
            long r2 = r6.f14048P
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lad
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f14048P
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lad
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f14048P = r0
            s3.x1 r0 = r6.f14035B
            h(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.H0(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.H0(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r6.f14056q
            T1.j r4 = k3.C0959b.a(r1)
            boolean r4 = r4.d()
            if (r4 != 0) goto L74
            s3.e r4 = r6.f14062w
            boolean r4 = r4.S()
            if (r4 != 0) goto L74
            boolean r4 = s3.x1.k0(r1)
            if (r4 == 0) goto L76
            boolean r1 = s3.x1.v0(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = r2
            goto L77
        L76:
            r1 = r3
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.f14047O = r4
            if (r1 == 0) goto Lad
            s3.E r1 = r6.o()
            java.lang.String r1 = r1.L()
            s3.E r4 = r6.o()
            r4.H()
            java.lang.String r4 = r4.f13765C
            boolean r0 = r0.o0(r1, r4)
            if (r0 != 0) goto La7
            s3.E r0 = r6.o()
            r0.H()
            java.lang.String r0 = r0.f13765C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La6
            goto La7
        La6:
            r2 = r3
        La7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.f14047O = r0
        Lad:
            java.lang.Boolean r0 = r6.f14047O
            boolean r0 = r0.booleanValue()
            return r0
        Lb4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1175g0.k():boolean");
    }

    public final int l() {
        Boolean bool;
        C1169d0 c1169d0 = this.f14065z;
        i(c1169d0);
        c1169d0.D();
        Boolean N6 = this.f14062w.N("firebase_analytics_collection_deactivated");
        if (N6 != null && N6.booleanValue()) {
            return 1;
        }
        Boolean bool2 = this.f14051S;
        if (bool2 != null && bool2.booleanValue()) {
            return 2;
        }
        C1169d0 c1169d02 = this.f14065z;
        i(c1169d02);
        c1169d02.D();
        if (!this.f14052T) {
            return 8;
        }
        T t5 = this.f14063x;
        h(t5);
        t5.D();
        if (t5.N().contains("measurement_enabled")) {
            bool = Boolean.valueOf(t5.N().getBoolean("measurement_enabled", true));
        } else {
            bool = null;
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                return 0;
            }
            return 3;
        }
        Boolean N7 = this.f14062w.N("firebase_analytics_collection_enabled");
        if (N7 != null) {
            if (N7.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool3 = this.f14050R;
        if (bool3 != null) {
            if (bool3.booleanValue()) {
                return 0;
            }
            return 5;
        } else if (this.f14049Q == null || this.f14049Q.booleanValue()) {
            return 0;
        } else {
            return 7;
        }
    }

    public final C1164b m() {
        C1164b c1164b = this.f14039G;
        if (c1164b != null) {
            return c1164b;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C1192p n() {
        i(this.f14044L);
        return this.f14044L;
    }

    public final C1150E o() {
        g(this.f14045M);
        return this.f14045M;
    }

    public final C1152G p() {
        g(this.f14042J);
        return this.f14042J;
    }

    public final C1153H q() {
        return this.f14036C;
    }

    public final R0 r() {
        g(this.f14043K);
        return this.f14043K;
    }

    public final void s() {
        h(this.f14035B);
    }
}
