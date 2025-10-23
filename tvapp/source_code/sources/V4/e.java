package V4;

import android.util.Log;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l.ExecutorC0961a;
import t3.C1251o;
/* loaded from: classes.dex */
public final class e {
    public static final HashMap d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorC0961a f3669e = new ExecutorC0961a(1);

    /* renamed from: a  reason: collision with root package name */
    public final Executor f3670a;

    /* renamed from: b  reason: collision with root package name */
    public final q f3671b;

    /* renamed from: c  reason: collision with root package name */
    public C1251o f3672c = null;

    public e(ScheduledExecutorService scheduledExecutorService, q qVar) {
        this.f3670a = scheduledExecutorService;
        this.f3671b = qVar;
    }

    public static Object a(C1251o c1251o, TimeUnit timeUnit) {
        d dVar = new d(0);
        Executor executor = f3669e;
        c1251o.c(executor, dVar);
        c1251o.b(executor, dVar);
        c1251o.a(executor, dVar);
        if (dVar.f3668r.await(5L, timeUnit)) {
            if (c1251o.i()) {
                return c1251o.g();
            }
            throw new ExecutionException(c1251o.f());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized e d(ScheduledExecutorService scheduledExecutorService, q qVar) {
        e eVar;
        synchronized (e.class) {
            try {
                String str = qVar.f3728b;
                HashMap hashMap = d;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new e(scheduledExecutorService, qVar));
                }
                eVar = (e) hashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final synchronized C1251o b() {
        try {
            C1251o c1251o = this.f3672c;
            if (c1251o != null) {
                if (c1251o.h() && !this.f3672c.i()) {
                }
            }
            Executor executor = this.f3670a;
            q qVar = this.f3671b;
            Objects.requireNonNull(qVar);
            this.f3672c = m3.g.e(executor, new U4.l(1, qVar));
        } catch (Throwable th) {
            throw th;
        }
        return this.f3672c;
    }

    public final g c() {
        synchronized (this) {
            try {
                C1251o c1251o = this.f3672c;
                if (c1251o != null && c1251o.i()) {
                    return (g) this.f3672c.g();
                }
                try {
                    return (g) a(b(), TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e3);
                    return null;
                }
            } finally {
            }
        }
    }
}
