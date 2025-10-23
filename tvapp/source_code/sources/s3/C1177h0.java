package s3;

import android.os.Process;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.concurrent.BlockingQueue;
/* renamed from: s3.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177h0 extends Thread {

    /* renamed from: q  reason: collision with root package name */
    public final Object f14070q;

    /* renamed from: r  reason: collision with root package name */
    public final BlockingQueue f14071r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f14072s = false;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C1169d0 f14073t;

    public C1177h0(C1169d0 c1169d0, String str, BlockingQueue blockingQueue) {
        this.f14073t = c1169d0;
        g3.n.g(blockingQueue);
        this.f14070q = new Object();
        this.f14071r = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f14070q) {
            this.f14070q.notifyAll();
        }
    }

    public final void b(InterruptedException interruptedException) {
        C1154I b7 = this.f14073t.b();
        b7.f13810y.c(interruptedException, AbstractC0515y1.m(getName(), " was interrupted"));
    }

    public final void c() {
        synchronized (this.f14073t.f14001y) {
            try {
                if (!this.f14072s) {
                    this.f14073t.f14002z.release();
                    this.f14073t.f14001y.notifyAll();
                    C1169d0 c1169d0 = this.f14073t;
                    if (this == c1169d0.f13995s) {
                        c1169d0.f13995s = null;
                    } else if (this == c1169d0.f13996t) {
                        c1169d0.f13996t = null;
                    } else {
                        c1169d0.b().f13807v.d("Current scheduler thread is neither worker nor network");
                    }
                    this.f14072s = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i7;
        boolean z7 = false;
        while (!z7) {
            try {
                this.f14073t.f14002z.acquire();
                z7 = true;
            } catch (InterruptedException e3) {
                b(e3);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C1171e0 c1171e0 = (C1171e0) this.f14071r.poll();
                if (c1171e0 != null) {
                    if (c1171e0.f14008r) {
                        i7 = threadPriority;
                    } else {
                        i7 = 10;
                    }
                    Process.setThreadPriority(i7);
                    c1171e0.run();
                } else {
                    synchronized (this.f14070q) {
                        if (this.f14071r.peek() == null) {
                            this.f14073t.getClass();
                            try {
                                this.f14070q.wait(30000L);
                            } catch (InterruptedException e7) {
                                b(e7);
                            }
                        }
                    }
                    synchronized (this.f14073t.f14001y) {
                        if (this.f14071r.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
