package v6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: v6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1338c extends H {

    /* renamed from: h  reason: collision with root package name */
    public static final ReentrantLock f15378h;

    /* renamed from: i  reason: collision with root package name */
    public static final Condition f15379i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f15380j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f15381k;

    /* renamed from: l  reason: collision with root package name */
    public static C1338c f15382l;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15383e;
    public C1338c f;

    /* renamed from: g  reason: collision with root package name */
    public long f15384g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f15378h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        M5.g.e(newCondition, "lock.newCondition()");
        f15379i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f15380j = millis;
        f15381k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [v6.c, java.lang.Object] */
    public final void h() {
        long c5;
        C1338c c1338c;
        long j7 = this.f15367c;
        boolean z7 = this.f15365a;
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 == 0 && !z7) {
            return;
        }
        ReentrantLock reentrantLock = f15378h;
        reentrantLock.lock();
        try {
            if (!this.f15383e) {
                this.f15383e = true;
                if (f15382l == null) {
                    f15382l = new Object();
                    m3.f fVar = new m3.f("Okio Watchdog");
                    fVar.setDaemon(true);
                    fVar.start();
                }
                long nanoTime = System.nanoTime();
                if (i7 != 0 && z7) {
                    c5 = Math.min(j7, c() - nanoTime) + nanoTime;
                } else if (i7 != 0) {
                    c5 = j7 + nanoTime;
                } else if (z7) {
                    c5 = c();
                } else {
                    throw new AssertionError();
                }
                this.f15384g = c5;
                long j8 = this.f15384g - nanoTime;
                C1338c c1338c2 = f15382l;
                M5.g.c(c1338c2);
                while (true) {
                    c1338c = c1338c2.f;
                    if (c1338c == null || j8 < c1338c.f15384g - nanoTime) {
                        break;
                    }
                    c1338c2 = c1338c;
                }
                this.f = c1338c;
                c1338c2.f = this;
                if (c1338c2 == f15382l) {
                    f15379i.signal();
                }
                reentrantLock.unlock();
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f15378h;
        reentrantLock.lock();
        try {
            if (this.f15383e) {
                this.f15383e = false;
                C1338c c1338c = f15382l;
                while (c1338c != null) {
                    C1338c c1338c2 = c1338c.f;
                    if (c1338c2 == this) {
                        c1338c.f = this.f;
                        this.f = null;
                    } else {
                        c1338c = c1338c2;
                    }
                }
                reentrantLock.unlock();
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
