package A4;

import H2.A;
import H2.S;
import T1.t;
import T1.u;
import X.i;
import X0.j;
import Y2.C0149s;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.x;
import a3.y;
import a3.z;
import android.app.job.JobParameters;
import android.content.Context;
import android.database.SQLException;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.Surface;
import androidx.profileinstaller.ProfileInstallerInitializer;
import b3.k;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e2.C0584A;
import e2.C0585B;
import e2.C0588E;
import e2.C0591H;
import e2.C0616l;
import e2.C0628x;
import e2.H0;
import e2.J0;
import e2.SurfaceHolder$CallbackC0629y;
import e2.p0;
import e2.x0;
import e2.z0;
import f2.C0695a;
import g2.K;
import j2.g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import k.C0852F;
import k2.C0950o;
import k2.InterfaceC0955t;
import o4.l;
import o4.m;
import p4.ThreadFactoryC1087a;
import p4.h;
import x0.q;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f101q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f102r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f103s;

    public /* synthetic */ d(Object obj, int i7, Object obj2) {
        this.f101q = i7;
        this.f102r = obj;
        this.f103s = obj2;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f102r;
        j jVar = (j) this.f103s;
        try {
            audioTrack.flush();
            audioTrack.release();
            jVar.d();
            synchronized (K.f10535g0) {
                try {
                    int i7 = K.f10537i0 - 1;
                    K.f10537i0 = i7;
                    if (i7 == 0) {
                        K.f10536h0.shutdown();
                        K.f10536h0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            jVar.d();
            synchronized (K.f10535g0) {
                try {
                    int i8 = K.f10537i0 - 1;
                    K.f10537i0 = i8;
                    if (i8 == 0) {
                        K.f10536h0.shutdown();
                        K.f10536h0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private final void b() {
        M4.a aVar;
        m mVar = (m) this.f102r;
        M4.b bVar = (M4.b) this.f103s;
        if (mVar.f12947b == m.d) {
            synchronized (mVar) {
                aVar = mVar.f12946a;
                mVar.f12946a = null;
                mVar.f12947b = bVar;
            }
            aVar.f(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        Set set;
        Object obj;
        l lVar = (l) this.f102r;
        M4.b bVar = (M4.b) this.f103s;
        synchronized (lVar) {
            try {
                if (lVar.f12944b == null) {
                    set = lVar.f12943a;
                    obj = bVar;
                } else {
                    set = lVar.f12944b;
                    obj = bVar.get();
                }
                set.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0955t c0950o;
        long j7;
        boolean z7;
        boolean z8;
        Handler handler;
        long j8 = -9223372036854775807L;
        boolean z9 = false;
        int i7 = 1;
        switch (this.f101q) {
            case 0:
                f fVar = (f) this.f102r;
                fVar.getClass();
                try {
                    t tVar = fVar.f113h;
                    Q1.c cVar = Q1.c.f2851s;
                    if (tVar instanceof t) {
                        u.a().d.a(tVar.f3262a.b(cVar), 1);
                    } else {
                        String w7 = h4.b.w("ForcedSender");
                        if (Log.isLoggable(w7, 5)) {
                            Log.w(w7, "Expected instance of `TransportImpl`, got `" + tVar + "`.");
                        }
                    }
                } catch (SQLException unused) {
                }
                ((CountDownLatch) this.f103s).countDown();
                return;
            case 1:
                ((C.b) this.f102r).i((Typeface) this.f103s);
                return;
            case 2:
                S s6 = (S) this.f102r;
                B2.b bVar = s6.f950H;
                InterfaceC0955t interfaceC0955t = (InterfaceC0955t) this.f103s;
                if (bVar == null) {
                    c0950o = interfaceC0955t;
                } else {
                    c0950o = new C0950o(-9223372036854775807L);
                }
                s6.f957O = c0950o;
                s6.f958P = interfaceC0955t.i();
                if (!s6.f964V && interfaceC0955t.i() == -9223372036854775807L) {
                    z9 = true;
                }
                s6.f959Q = z9;
                if (z9) {
                    i7 = 7;
                }
                s6.f960R = i7;
                s6.f976w.s(s6.f958P, interfaceC0955t.b(), s6.f959Q);
                if (!s6.f954L) {
                    s6.p();
                    return;
                }
                return;
            case 3:
                L2.b bVar2 = (L2.b) this.f102r;
                bVar2.f1931y = false;
                bVar2.d((Uri) this.f103s);
                return;
            case 4:
                int i8 = JobInfoSchedulerService.f8119q;
                ((JobInfoSchedulerService) this.f102r).jobFinished((JobParameters) this.f103s, false);
                return;
            case 5:
                ((C0149s) this.f103s).a(((x) this.f102r).c());
                return;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                y yVar = (y) this.f102r;
                yVar.getClass();
                int i9 = H.f4603a;
                C0585B c0585b = yVar.f5136c.f10095q;
                z zVar = (z) this.f103s;
                c0585b.f9468u0 = zVar;
                c0585b.f9421B.e(25, new C0628x(zVar));
                return;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                y yVar2 = (y) this.f102r;
                yVar2.getClass();
                int i10 = H.f4603a;
                f2.f fVar2 = yVar2.f5136c.f10095q.f9426H;
                C0695a Q4 = fVar2.Q();
                fVar2.R(Q4, 1019, new f2.b(Q4, (String) this.f103s, 26));
                return;
            case 8:
                y yVar3 = (y) this.f102r;
                yVar3.getClass();
                int i11 = H.f4603a;
                f2.f fVar3 = yVar3.f5136c.f10095q.f9426H;
                C0695a Q6 = fVar3.Q();
                fVar3.R(Q6, 1030, new f2.d(Q6, (Exception) this.f103s, 11));
                return;
            case 9:
                k kVar = (k) this.f102r;
                SurfaceTexture surfaceTexture = kVar.f7117w;
                Surface surface = kVar.f7118x;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f103s;
                Surface surface2 = new Surface(surfaceTexture2);
                kVar.f7117w = surfaceTexture2;
                kVar.f7118x = surface2;
                Iterator it = kVar.f7111q.iterator();
                while (it.hasNext()) {
                    ((SurfaceHolder$CallbackC0629y) it.next()).f10095q.k0(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 10:
                C0585B c0585b2 = (C0585B) this.f102r;
                C0588E c0588e = (C0588E) this.f103s;
                int i12 = c0585b2.W - c0588e.f9488c;
                c0585b2.W = i12;
                if (c0588e.d) {
                    c0585b2.f9441X = c0588e.f9489e;
                    c0585b2.f9442Y = true;
                }
                if (c0588e.f) {
                    c0585b2.f9443Z = c0588e.f9490g;
                }
                if (i12 == 0) {
                    J0 j02 = c0588e.f9487b.f10043a;
                    if (!c0585b2.f9472w0.f10043a.q() && j02.q()) {
                        c0585b2.f9474x0 = -1;
                        c0585b2.y0 = 0L;
                    }
                    if (!j02.q()) {
                        List asList = Arrays.asList(((z0) j02).f10108x);
                        if (asList.size() == c0585b2.f9424E.size()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        AbstractC0156a.k(z8);
                        for (int i13 = 0; i13 < asList.size(); i13++) {
                            ((C0584A) c0585b2.f9424E.get(i13)).f9417b = (J0) asList.get(i13);
                        }
                    }
                    if (c0585b2.f9442Y) {
                        if (c0588e.f9487b.f10044b.equals(c0585b2.f9472w0.f10044b) && c0588e.f9487b.d == c0585b2.f9472w0.f10057r) {
                            i7 = 0;
                        }
                        if (i7 != 0) {
                            if (!j02.q() && !c0588e.f9487b.f10044b.a()) {
                                p0 p0Var = c0588e.f9487b;
                                A a7 = p0Var.f10044b;
                                long j9 = p0Var.d;
                                Object obj = a7.f1180a;
                                H0 h02 = c0585b2.f9423D;
                                j02.h(obj, h02);
                                j8 = j9 + h02.f9556u;
                            } else {
                                j8 = c0588e.f9487b.d;
                            }
                        }
                        j7 = j8;
                        z7 = i7;
                    } else {
                        j7 = -9223372036854775807L;
                        z7 = false;
                    }
                    c0585b2.f9442Y = false;
                    c0585b2.o0(c0588e.f9487b, 1, c0585b2.f9443Z, z7, c0585b2.f9441X, j7, -1, false);
                    return;
                }
                return;
            case 11:
                x0 x0Var = (x0) this.f103s;
                ((C0591H) this.f102r).getClass();
                try {
                    synchronized (x0Var) {
                    }
                    x0Var.f10088a.c(x0Var.d, x0Var.f10091e);
                    x0Var.b(true);
                    return;
                } catch (C0616l e3) {
                    AbstractC0156a.r("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e3);
                    throw new RuntimeException(e3);
                }
            case 12:
                y yVar4 = (y) this.f102r;
                yVar4.getClass();
                int i14 = H.f4603a;
                f2.f fVar4 = yVar4.f5136c.f10095q.f9426H;
                C0695a Q7 = fVar4.Q();
                fVar4.R(Q7, 1012, new f2.b(Q7, (String) this.f103s, 11));
                return;
            case 13:
                a();
                return;
            case 14:
                j2.f fVar5 = (j2.f) this.f102r;
                g gVar = fVar5.f11794t;
                if (gVar.f11799E != 0 && !fVar5.f11793s) {
                    Looper looper = gVar.f11802I;
                    looper.getClass();
                    fVar5.f11792r = gVar.b(looper, fVar5.f11791q, (e2.K) this.f103s, false);
                    gVar.f11797C.add(fVar5);
                    return;
                }
                return;
            case 15:
                b();
                return;
            case 16:
                c();
                return;
            case 17:
                ThreadFactoryC1087a threadFactoryC1087a = (ThreadFactoryC1087a) this.f102r;
                Process.setThreadPriority(threadFactoryC1087a.f13140c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC1087a.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f103s).run();
                return;
            case 18:
                Callable callable = (Callable) this.f102r;
                C0852F c0852f = (C0852F) this.f103s;
                try {
                    ((h) c0852f.f11874r).i(callable.call());
                    return;
                } catch (Exception e7) {
                    ((h) c0852f.f11874r).j(e7);
                    return;
                }
            case 19:
                ((ProfileInstallerInitializer) this.f102r).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = u0.g.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new u0.d((Context) this.f103s, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Runnable runnable = (Runnable) this.f102r;
                M5.g.f(runnable, "$command");
                q qVar = (q) this.f103s;
                M5.g.f(qVar, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                    qVar.a();
                }
        }
    }
}
