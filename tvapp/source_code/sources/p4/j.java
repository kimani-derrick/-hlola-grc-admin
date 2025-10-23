package p4;

import T1.q;
import g3.n;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: v  reason: collision with root package name */
    public static final Logger f13162v = Logger.getLogger(j.class.getName());

    /* renamed from: q  reason: collision with root package name */
    public final Executor f13163q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayDeque f13164r = new ArrayDeque();

    /* renamed from: s  reason: collision with root package name */
    public int f13165s = 1;

    /* renamed from: t  reason: collision with root package name */
    public long f13166t = 0;

    /* renamed from: u  reason: collision with root package name */
    public final R3.a f13167u = new R3.a(this);

    public j(Executor executor) {
        n.g(executor);
        this.f13163q = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        n.g(runnable);
        synchronized (this.f13164r) {
            int i7 = this.f13165s;
            if (i7 != 4 && i7 != 3) {
                long j7 = this.f13166t;
                q qVar = new q(runnable, 1);
                this.f13164r.add(qVar);
                this.f13165s = 2;
                try {
                    this.f13163q.execute(this.f13167u);
                    if (this.f13165s != 2) {
                        return;
                    }
                    synchronized (this.f13164r) {
                        try {
                            if (this.f13166t == j7 && this.f13165s == 2) {
                                this.f13165s = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e3) {
                    synchronized (this.f13164r) {
                        try {
                            int i8 = this.f13165s;
                            boolean z7 = true;
                            if ((i8 != 1 && i8 != 2) || !this.f13164r.removeLastOccurrence(qVar)) {
                                z7 = false;
                            }
                            if (!(e3 instanceof RejectedExecutionException) || z7) {
                                throw e3;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f13164r.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f13163q + "}";
    }
}
