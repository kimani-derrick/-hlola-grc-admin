package W5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* renamed from: W5.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0118z extends P implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public static final long f4043A;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: z  reason: collision with root package name */
    public static final RunnableC0118z f4044z;

    /* JADX WARN: Type inference failed for: r0v0, types: [W5.z, W5.P, W5.Q] */
    static {
        Long l7;
        ?? p3 = new P();
        f4044z = p3;
        p3.a0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f4043A = timeUnit.toNanos(l7.longValue());
    }

    @Override // W5.Q
    public final Thread Z() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // W5.Q
    public final void d0(long j7, N n) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // W5.P
    public final void e0(Runnable runnable) {
        if (debugStatus != 4) {
            super.e0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void i0() {
        int i7 = debugStatus;
        if (i7 != 2 && i7 != 3) {
            return;
        }
        debugStatus = 3;
        P.f3957w.set(this, null);
        P.f3958x.set(this, null);
        notifyAll();
    }

    @Override // W5.P, W5.D
    public final I n(long j7, Runnable runnable, D5.i iVar) {
        long j8 = 0;
        if (j7 > 0) {
            if (j7 >= 9223372036854L) {
                j8 = Long.MAX_VALUE;
            } else {
                j8 = 1000000 * j7;
            }
        }
        if (j8 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            M m7 = new M(runnable, j8 + nanoTime);
            h0(nanoTime, m7);
            return m7;
        }
        return m0.f4006q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean g02;
        s0.f4019a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 != 2 && i7 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j7 = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long b02 = b0();
                        if (b02 == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j7 == Long.MAX_VALUE) {
                                j7 = f4043A + nanoTime;
                            }
                            long j8 = j7 - nanoTime;
                            if (j8 <= 0) {
                                _thread = null;
                                i0();
                                if (!g0()) {
                                    Z();
                                    return;
                                }
                                return;
                            } else if (b02 > j8) {
                                b02 = j8;
                            }
                        } else {
                            j7 = Long.MAX_VALUE;
                        }
                        if (b02 > 0) {
                            int i8 = debugStatus;
                            if (i8 == 2 || i8 == 3) {
                                break;
                            }
                            LockSupport.parkNanos(this, b02);
                        }
                    }
                    if (!g02) {
                        return;
                    }
                    return;
                }
                _thread = null;
                i0();
                if (!g0()) {
                    Z();
                }
            }
        } finally {
            _thread = null;
            i0();
            if (!g0()) {
                Z();
            }
        }
    }

    @Override // W5.P, W5.Q
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
