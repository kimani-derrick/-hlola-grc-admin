package u4;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import k.C0852F;
import r4.C1119a;
import s4.InterfaceC1213a;
import t3.C1244h;
import t3.C1251o;
import t3.RunnableC1249m;
import t4.InterfaceC1252a;
import z4.C1518b;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15038a;

    /* renamed from: b  reason: collision with root package name */
    public final v f15039b;

    /* renamed from: c  reason: collision with root package name */
    public final t2.i f15040c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public t2.i f15041e;
    public t2.i f;

    /* renamed from: g  reason: collision with root package name */
    public C1292p f15042g;

    /* renamed from: h  reason: collision with root package name */
    public final C1273A f15043h;

    /* renamed from: i  reason: collision with root package name */
    public final C1518b f15044i;

    /* renamed from: j  reason: collision with root package name */
    public final InterfaceC1252a f15045j;

    /* renamed from: k  reason: collision with root package name */
    public final InterfaceC1213a f15046k;

    /* renamed from: l  reason: collision with root package name */
    public final ExecutorService f15047l;

    /* renamed from: m  reason: collision with root package name */
    public final C4.b f15048m;
    public final C1287k n;

    /* renamed from: o  reason: collision with root package name */
    public final C1119a f15049o;

    /* renamed from: p  reason: collision with root package name */
    public final C0852F f15050p;

    public s(h4.f fVar, C1273A c1273a, C1119a c1119a, v vVar, q4.a aVar, q4.a aVar2, C1518b c1518b, ExecutorService executorService, C1287k c1287k, C0852F c0852f) {
        this.f15039b = vVar;
        fVar.a();
        this.f15038a = fVar.f10987a;
        this.f15043h = c1273a;
        this.f15049o = c1119a;
        this.f15045j = aVar;
        this.f15046k = aVar2;
        this.f15047l = executorService;
        this.f15044i = c1518b;
        this.f15048m = new C4.b(executorService);
        this.n = c1287k;
        this.f15050p = c0852f;
        this.d = System.currentTimeMillis();
        this.f15040c = new t2.i(6, (byte) 0);
    }

    public static C1251o a(s sVar, B4.d dVar) {
        C1251o l7;
        r rVar;
        C4.b bVar = sVar.f15048m;
        C4.b bVar2 = sVar.f15048m;
        if (Boolean.TRUE.equals(((ThreadLocal) bVar.f424u).get())) {
            sVar.f15041e.n();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    sVar.f15045j.a(new q(sVar));
                    sVar.f15042g.g();
                    if (!dVar.d().f261b.f256a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        l7 = m3.g.l(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        rVar = new r(sVar, 0);
                    } else {
                        if (!sVar.f15042g.d(dVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        l7 = sVar.f15042g.h(((C1244h) ((AtomicReference) dVar.f270i).get()).f14573a);
                        rVar = new r(sVar, 0);
                    }
                } catch (Exception e3) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e3);
                    l7 = m3.g.l(e3);
                    rVar = new r(sVar, 0);
                }
                bVar2.X(rVar);
                return l7;
            } catch (Throwable th) {
                bVar2.X(new r(sVar, 0));
                throw th;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(B4.d dVar) {
        String str;
        Future<?> submit = this.f15047l.submit(new RunnableC1249m(this, 2, dVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            e = e3;
            str = "Crashlytics was interrupted during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        } catch (ExecutionException e7) {
            e = e7;
            str = "Crashlytics encountered a problem during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        } catch (TimeoutException e8) {
            e = e8;
            str = "Crashlytics timed out during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        }
    }
}
