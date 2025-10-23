package P;

import A5.v;
import H2.X;
import K.O;
import Y2.L;
import Z2.A;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.D;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import androidx.fragment.app.S;
import androidx.leanback.widget.C0307n0;
import androidx.leanback.widget.C0321y;
import androidx.leanback.widget.SearchBar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import g.C0707e;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import k.AbstractC0875Z;
import k.C0890h;
import k3.AbstractC0958a;
import s3.AbstractC1203v;
import s3.C1154I;
import s3.C1160O;
import s3.C1170e;
import s3.C1175g0;
import s3.C1178i;
import s3.C1212z0;
import s3.P;
import s3.RunnableC1179i0;
import s3.V;
import s3.Z;
import s3.b1;
import s3.f1;
import s3.g1;
import s3.h1;
import s3.k1;
import s3.o1;
import s3.q1;
import s3.x1;
import t3.C1248l;
import t3.C1251o;
import t3.InterfaceC1238b;
import w0.C1365t;
import x0.AbstractC1454j;
import x0.C1455k;
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2738q;

    /* renamed from: r  reason: collision with root package name */
    public Object f2739r;

    public /* synthetic */ b(int i7) {
        this.f2738q = i7;
    }

    private final void b() {
        synchronized (this) {
            ((androidx.databinding.d) this.f2739r).f5661e = false;
        }
        do {
        } while (androidx.databinding.d.f5659p.poll() != null);
        if (!((androidx.databinding.d) this.f2739r).f5662g.isAttachedToWindow()) {
            View view = ((androidx.databinding.d) this.f2739r).f5662g;
            F3.l lVar = androidx.databinding.d.f5660q;
            view.removeOnAttachStateChangeListener(lVar);
            ((androidx.databinding.d) this.f2739r).f5662g.addOnAttachStateChangeListener(lVar);
            return;
        }
        ((androidx.databinding.d) this.f2739r).I0();
    }

    private final void c() {
        k6.a c5;
        long j7;
        while (true) {
            k6.d dVar = (k6.d) this.f2739r;
            synchronized (dVar) {
                c5 = dVar.c();
            }
            if (c5 == null) {
                return;
            }
            k6.c cVar = c5.f12214c;
            M5.g.c(cVar);
            k6.d dVar2 = (k6.d) this.f2739r;
            boolean isLoggable = k6.d.f12221i.isLoggable(Level.FINE);
            if (isLoggable) {
                cVar.f12216a.f12222a.getClass();
                j7 = System.nanoTime();
                AbstractC0958a.d(c5, cVar, "starting");
            } else {
                j7 = -1;
            }
            try {
                k6.d.a(dVar2, c5);
                if (isLoggable) {
                    cVar.f12216a.f12222a.getClass();
                    AbstractC0958a.d(c5, cVar, M5.g.k(AbstractC0958a.r(System.nanoTime() - j7), "finished run in "));
                }
            } finally {
            }
        }
    }

    private final void d() {
        synchronized (((C1248l) this.f2739r).f14590s) {
            try {
                InterfaceC1238b interfaceC1238b = (InterfaceC1238b) ((C1248l) this.f2739r).f14591t;
                if (interfaceC1238b != null) {
                    interfaceC1238b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public B5.i a() {
        B5.i iVar = new B5.i();
        Cursor m7 = ((C1455k) this.f2739r).f16163a.m(new B0.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 1), null);
        while (m7.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(m7.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p6.l.i(m7, th);
                    throw th2;
                }
            }
        }
        p6.l.i(m7, null);
        B5.i d = p6.l.d(iVar);
        if (!d.f314q.isEmpty()) {
            if (((C1455k) this.f2739r).f16167g != null) {
                D0.k kVar = ((C1455k) this.f2739r).f16167g;
                if (kVar != null) {
                    kVar.b();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return d;
    }

    /* JADX WARN: Type inference failed for: r3v28, types: [s3.y1, s3.o1] */
    @Override // java.lang.Runnable
    public final void run() {
        C0890h c0890h;
        Set set;
        switch (this.f2738q) {
            case 0:
                h hVar = (h) this.f2739r;
                if (hVar.f2745E) {
                    boolean z7 = hVar.f2743C;
                    a aVar = hVar.f2747q;
                    if (z7) {
                        hVar.f2743C = false;
                        aVar.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f2734e = currentAnimationTimeMillis;
                        aVar.f2735g = -1L;
                        aVar.f = currentAnimationTimeMillis;
                        aVar.f2736h = 0.5f;
                    }
                    if ((aVar.f2735g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f2735g + aVar.f2737i) || !hVar.e()) {
                        hVar.f2745E = false;
                        return;
                    }
                    boolean z8 = hVar.f2744D;
                    View view = hVar.f2749s;
                    if (z8) {
                        hVar.f2744D = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a7 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f = currentAnimationTimeMillis2;
                        hVar.f2746G.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f)) * ((a7 * 4.0f) + ((-4.0f) * a7 * a7)) * aVar.d));
                        Field field = O.f1447a;
                        view.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 1:
                ((T.e) this.f2739r).n(0);
                return;
            case 2:
                V4.p pVar = (V4.p) this.f2739r;
                if (pVar.a()) {
                    V4.m b7 = pVar.f3725o.b();
                    pVar.n.getClass();
                    if (new Date(System.currentTimeMillis()).before(b7.f3706b)) {
                        pVar.h();
                        return;
                    }
                    N4.d dVar = (N4.d) pVar.f3720i;
                    C1251o f = dVar.f();
                    C1251o d = dVar.d();
                    C1251o H6 = m3.g.H(f, d);
                    U4.e eVar = new U4.e(pVar, f, d, 1);
                    ScheduledExecutorService scheduledExecutorService = pVar.f;
                    C1251o e3 = H6.e(scheduledExecutorService, eVar);
                    m3.g.H(e3).d(scheduledExecutorService, new T4.d(pVar, 3, e3));
                    return;
                }
                return;
            case 3:
                ((L) this.f2739r).d();
                return;
            case 4:
                try {
                    androidx.activity.l.t((androidx.activity.l) this.f2739r);
                    return;
                } catch (IllegalStateException e7) {
                    if (TextUtils.equals(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e7;
                } catch (NullPointerException e8) {
                    if (!TextUtils.equals(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e8;
                    }
                    return;
                }
            case 5:
                b();
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q = (DialogInterface$OnCancelListenerC0263q) this.f2739r;
                dialogInterface$OnCancelListenerC0263q.f6072q0.onDismiss(dialogInterface$OnCancelListenerC0263q.y0);
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ComponentCallbacksC0269x componentCallbacksC0269x = (ComponentCallbacksC0269x) this.f2739r;
                if (componentCallbacksC0269x.f6121Z != null) {
                    componentCallbacksC0269x.l().getClass();
                    return;
                }
                return;
            case 8:
                ((S) this.f2739r).A(true);
                return;
            case 9:
                ((C0321y) this.f2739r).H0();
                return;
            case 10:
                SearchBar searchBar = (SearchBar) ((C0307n0) this.f2739r).f6614b;
                searchBar.f6512z = true;
                searchBar.f6504r.requestFocus();
                return;
            case 11:
                C0707e c0707e = (C0707e) this.f2739r;
                c0707e.a(true);
                c0707e.invalidateSelf();
                return;
            case 12:
                AbstractC0875Z abstractC0875Z = (AbstractC0875Z) this.f2739r;
                abstractC0875Z.f11971B = null;
                abstractC0875Z.drawableStateChanged();
                return;
            case 13:
                ActionMenuView actionMenuView = ((Toolbar) this.f2739r).f5552q;
                if (actionMenuView != null && (c0890h = actionMenuView.f5460I) != null) {
                    c0890h.i();
                    return;
                }
                return;
            case 14:
                c();
                return;
            case 15:
                ((P) this.f2739r).f13851a.G();
                return;
            case 16:
                g1 g1Var = (g1) this.f2739r;
                D d7 = g1Var.f14068s;
                ((f1) d7.f5884s).D();
                f1 f1Var = (f1) d7.f5884s;
                f1Var.b().f13802C.d("Application going to the background");
                f1Var.B().f13886J.a(true);
                f1Var.D();
                f1Var.f14017t = true;
                C1175g0 c1175g0 = (C1175g0) f1Var.f2765q;
                if (!c1175g0.f14062w.R()) {
                    boolean O5 = c1175g0.f14062w.O(null, AbstractC1203v.f14275I0);
                    long j7 = g1Var.f14067r;
                    X x7 = f1Var.f14019v;
                    if (O5) {
                        x7.a(j7, false, false);
                        ((h1) x7.f999s).a();
                    } else {
                        ((h1) x7.f999s).a();
                        x7.a(j7, false, false);
                    }
                }
                f1Var.b().f13801B.c(Long.valueOf(g1Var.f14066q), "Application backgrounded at: timestamp_millis");
                return;
            case 17:
                q1 q1Var = (q1) this.f2739r;
                q1Var.d().D();
                q1Var.f14184A = new V(q1Var);
                C1178i c1178i = new C1178i(q1Var);
                c1178i.I();
                q1Var.f14207s = c1178i;
                C1170e R6 = q1Var.R();
                Z z9 = q1Var.f14205q;
                g3.n.g(z9);
                R6.f14005t = z9;
                b1 b1Var = new b1(q1Var);
                b1Var.I();
                q1Var.f14213y = b1Var;
                ?? o1Var = new o1(q1Var);
                o1Var.I();
                q1Var.f14210v = o1Var;
                C1160O c1160o = new C1160O(q1Var, 1);
                c1160o.I();
                q1Var.f14212x = c1160o;
                k1 k1Var = new k1(q1Var);
                k1Var.I();
                q1Var.f14209u = k1Var;
                q1Var.f14208t = new P(q1Var);
                if (q1Var.f14190H != q1Var.f14191I) {
                    q1Var.b().f13807v.b(Integer.valueOf(q1Var.f14190H), Integer.valueOf(q1Var.f14191I), "Not all upload components initialized");
                }
                q1Var.f14186C = true;
                q1Var.d().D();
                C1178i c1178i2 = q1Var.f14207s;
                q1.z(c1178i2);
                c1178i2.F0();
                if (q1Var.f14213y.f13970w.f() == 0) {
                    A a8 = q1Var.f14213y.f13970w;
                    q1Var.f().getClass();
                    a8.g(System.currentTimeMillis());
                }
                q1Var.G();
                return;
            case 18:
                C1175g0 c1175g02 = (C1175g0) this.f2739r;
                x1 x1Var = c1175g02.f14035B;
                C1175g0.h(x1Var);
                x1Var.D();
                if (x1Var.L0() == 1) {
                    C1212z0 c1212z0 = c1175g02.F;
                    C1175g0.g(c1212z0);
                    RunnableC1179i0 runnableC1179i0 = new RunnableC1179i0(3);
                    runnableC1179i0.f14088r = c1212z0;
                    new Thread(runnableC1179i0).start();
                    return;
                }
                C1154I c1154i = c1175g02.f14064y;
                C1175g0.i(c1154i);
                c1154i.f13810y.d("registerTrigger called but app not eligible");
                return;
            case 19:
                d();
                return;
            case 20:
                ((ThreadLocal) ((C4.b) this.f2739r).f424u).set(Boolean.TRUE);
                return;
            case 21:
                C1365t c1365t = (C1365t) this.f2739r;
                int i7 = c1365t.f15657A;
                ValueAnimator valueAnimator = c1365t.f15681z;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                c1365t.f15657A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 22:
                ((StaggeredGridLayoutManager) this.f2739r).Y0();
                return;
            default:
                ReentrantReadWriteLock.ReadLock readLock = ((C1455k) this.f2739r).f16163a.f7290i.readLock();
                M5.g.e(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                    } catch (SQLiteException e9) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e9);
                        set = v.f137q;
                    } catch (IllegalStateException e10) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                        set = v.f137q;
                    }
                    if (((C1455k) this.f2739r).a() && ((C1455k) this.f2739r).f16166e.compareAndSet(true, false) && !((C1455k) this.f2739r).f16163a.g().K().n()) {
                        D0.c K6 = ((C1455k) this.f2739r).f16163a.g().K();
                        K6.b();
                        try {
                            set = a();
                            K6.V();
                            if (!set.isEmpty()) {
                                C1455k c1455k = (C1455k) this.f2739r;
                                synchronized (c1455k.f16169i) {
                                    Iterator it = c1455k.f16169i.iterator();
                                    while (true) {
                                        m.b bVar = (m.b) it;
                                        if (bVar.hasNext()) {
                                            ((AbstractC1454j) ((Map.Entry) bVar.next()).getValue()).a(set);
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        } finally {
                            K6.h();
                        }
                    }
                    return;
                } finally {
                    readLock.unlock();
                    ((C1455k) this.f2739r).getClass();
                }
        }
    }

    public /* synthetic */ b(int i7, Object obj) {
        this.f2738q = i7;
        this.f2739r = obj;
    }

    public b(P p3, boolean z7) {
        this.f2738q = 15;
        this.f2739r = p3;
    }

    public b(q1 q1Var, T1.j jVar) {
        this.f2738q = 17;
        this.f2739r = q1Var;
    }
}
