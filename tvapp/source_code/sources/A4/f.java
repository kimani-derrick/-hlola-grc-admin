package A4;

import T1.t;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t2.i;
import t3.C1244h;
import u4.AbstractC1276D;
import u4.C1278b;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final double f108a;

    /* renamed from: b  reason: collision with root package name */
    public final double f109b;

    /* renamed from: c  reason: collision with root package name */
    public final long f110c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f111e;
    public final ArrayBlockingQueue f;

    /* renamed from: g  reason: collision with root package name */
    public final ThreadPoolExecutor f112g;

    /* renamed from: h  reason: collision with root package name */
    public final t f113h;

    /* renamed from: i  reason: collision with root package name */
    public final i f114i;

    /* renamed from: j  reason: collision with root package name */
    public int f115j;

    /* renamed from: k  reason: collision with root package name */
    public long f116k;

    public f(t tVar, B4.c cVar, i iVar) {
        double d = cVar.d;
        this.f108a = d;
        this.f109b = cVar.f263e;
        this.f110c = cVar.f * 1000;
        this.f113h = tVar;
        this.f114i = iVar;
        this.d = SystemClock.elapsedRealtime();
        int i7 = (int) d;
        this.f111e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f = arrayBlockingQueue;
        this.f112g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f115j = 0;
        this.f116k = 0L;
    }

    public final int a() {
        int max;
        if (this.f116k == 0) {
            this.f116k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f116k) / this.f110c);
        if (this.f.size() == this.f111e) {
            max = Math.min(100, this.f115j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f115j - currentTimeMillis);
        }
        if (this.f115j != max) {
            this.f115j = max;
            this.f116k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(final C1278b c1278b, final C1244h c1244h) {
        final boolean z7;
        String str = "Sending report through Google DataTransport: " + c1278b.f14986b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f113h.a(new Q1.a(c1278b.f14985a, Q1.c.f2851s), new Q1.f() { // from class: A4.c
            @Override // Q1.f
            public final void a(Exception exc) {
                boolean z8 = false;
                f fVar = f.this;
                fVar.getClass();
                C1244h c1244h2 = c1244h;
                if (exc != null) {
                    c1244h2.a(exc);
                    return;
                }
                if (z7) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new d(fVar, 0, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = AbstractC1276D.f14978a;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = nanoTime - System.nanoTime();
                                    z8 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z8 = true;
                                if (z8) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z8) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                c1244h2.b(c1278b);
            }
        });
    }
}
