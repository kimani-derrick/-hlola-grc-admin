package x0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public final Executor f16184q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayDeque f16185r;

    /* renamed from: s  reason: collision with root package name */
    public Runnable f16186s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f16187t;

    public q(Executor executor) {
        M5.g.f(executor, "executor");
        this.f16184q = executor;
        this.f16185r = new ArrayDeque();
        this.f16187t = new Object();
    }

    public final void a() {
        synchronized (this.f16187t) {
            Object poll = this.f16185r.poll();
            Runnable runnable = (Runnable) poll;
            this.f16186s = runnable;
            if (poll != null) {
                this.f16184q.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        M5.g.f(runnable, "command");
        synchronized (this.f16187t) {
            this.f16185r.offer(new A4.d(runnable, 20, this));
            if (this.f16186s == null) {
                a();
            }
        }
    }
}
