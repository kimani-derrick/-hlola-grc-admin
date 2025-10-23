package W5;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class T extends S implements D {

    /* renamed from: s  reason: collision with root package name */
    public final Executor f3964s;

    public T(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f3964s = executor;
        Method method2 = b6.c.f7181a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = b6.c.f7181a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // W5.AbstractC0113u
    public final void V(D5.i iVar, Runnable runnable) {
        try {
            this.f3964s.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) iVar.f(C0114v.f4028r);
            if (interfaceC0093a0 != null) {
                interfaceC0093a0.b(cancellationException);
            }
            G.f3946b.V(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f3964s;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof T) && ((T) obj).f3964s == this.f3964s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3964s);
    }

    @Override // W5.D
    public final I n(long j7, Runnable runnable, D5.i iVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f3964s;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j7, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) iVar.f(C0114v.f4028r);
                if (interfaceC0093a0 != null) {
                    interfaceC0093a0.b(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new H(scheduledFuture);
        }
        return RunnableC0118z.f4044z.n(j7, runnable, iVar);
    }

    @Override // W5.AbstractC0113u
    public final String toString() {
        return this.f3964s.toString();
    }

    @Override // W5.D
    public final void y(long j7, C0100g c0100g) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f3964s;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new R3.a(this, 7, c0100g), j7, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) c0100g.f3988u.f(C0114v.f4028r);
                if (interfaceC0093a0 != null) {
                    interfaceC0093a0.b(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0100g.y(new C0098e(0, scheduledFuture));
        } else {
            RunnableC0118z.f4044z.y(j7, c0100g);
        }
    }
}
