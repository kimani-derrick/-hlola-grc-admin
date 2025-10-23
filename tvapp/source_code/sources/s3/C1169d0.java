package s3;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: s3.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1169d0 extends AbstractC1195q0 {

    /* renamed from: A  reason: collision with root package name */
    public static final AtomicLong f13994A = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: s  reason: collision with root package name */
    public C1177h0 f13995s;

    /* renamed from: t  reason: collision with root package name */
    public C1177h0 f13996t;

    /* renamed from: u  reason: collision with root package name */
    public final PriorityBlockingQueue f13997u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedBlockingQueue f13998v;

    /* renamed from: w  reason: collision with root package name */
    public final C1173f0 f13999w;

    /* renamed from: x  reason: collision with root package name */
    public final C1173f0 f14000x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f14001y;

    /* renamed from: z  reason: collision with root package name */
    public final Semaphore f14002z;

    public C1169d0(C1175g0 c1175g0) {
        super(c1175g0);
        this.f14001y = new Object();
        this.f14002z = new Semaphore(2);
        this.f13997u = new PriorityBlockingQueue();
        this.f13998v = new LinkedBlockingQueue();
        this.f13999w = new C1173f0(this, "Thread death: Uncaught exception on worker thread");
        this.f14000x = new C1173f0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // P1.c
    public final void D() {
        if (Thread.currentThread() == this.f13995s) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override // s3.AbstractC1195q0
    public final boolean G() {
        return false;
    }

    public final Object H(AtomicReference atomicReference, long j7, String str, Runnable runnable) {
        synchronized (atomicReference) {
            d().M(runnable);
            try {
                atomicReference.wait(j7);
            } catch (InterruptedException unused) {
                b().f13810y.d("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            b().f13810y.d("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final C1171e0 I(Callable callable) {
        E();
        C1171e0 c1171e0 = new C1171e0(this, callable, false);
        if (Thread.currentThread() == this.f13995s) {
            if (!this.f13997u.isEmpty()) {
                b().f13810y.d("Callable skipped the worker queue.");
            }
            c1171e0.run();
        } else {
            J(c1171e0);
        }
        return c1171e0;
    }

    public final void J(C1171e0 c1171e0) {
        synchronized (this.f14001y) {
            try {
                this.f13997u.add(c1171e0);
                C1177h0 c1177h0 = this.f13995s;
                if (c1177h0 == null) {
                    C1177h0 c1177h02 = new C1177h0(this, "Measurement Worker", this.f13997u);
                    this.f13995s = c1177h02;
                    c1177h02.setUncaughtExceptionHandler(this.f13999w);
                    this.f13995s.start();
                } else {
                    c1177h0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K(Runnable runnable) {
        E();
        C1171e0 c1171e0 = new C1171e0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f14001y) {
            try {
                this.f13998v.add(c1171e0);
                C1177h0 c1177h0 = this.f13996t;
                if (c1177h0 == null) {
                    C1177h0 c1177h02 = new C1177h0(this, "Measurement Network", this.f13998v);
                    this.f13996t = c1177h02;
                    c1177h02.setUncaughtExceptionHandler(this.f14000x);
                    this.f13996t.start();
                } else {
                    c1177h0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1171e0 L(Callable callable) {
        E();
        C1171e0 c1171e0 = new C1171e0(this, callable, true);
        if (Thread.currentThread() == this.f13995s) {
            c1171e0.run();
        } else {
            J(c1171e0);
        }
        return c1171e0;
    }

    public final void M(Runnable runnable) {
        E();
        g3.n.g(runnable);
        J(new C1171e0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void N(Runnable runnable) {
        E();
        J(new C1171e0(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean O() {
        if (Thread.currentThread() == this.f13995s) {
            return true;
        }
        return false;
    }

    public final void P() {
        if (Thread.currentThread() == this.f13996t) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }
}
