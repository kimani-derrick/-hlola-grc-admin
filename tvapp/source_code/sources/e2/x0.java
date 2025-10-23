package e2;

import Z2.AbstractC0156a;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final w0 f10088a;

    /* renamed from: b  reason: collision with root package name */
    public final C0591H f10089b;

    /* renamed from: c  reason: collision with root package name */
    public final Z2.B f10090c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public Object f10091e;
    public final Looper f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10092g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10093h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10094i;

    public x0(C0591H c0591h, w0 w0Var, J0 j02, int i7, Z2.B b7, Looper looper) {
        this.f10089b = c0591h;
        this.f10088a = w0Var;
        this.f = looper;
        this.f10090c = b7;
    }

    public final synchronized void a(long j7) {
        boolean z7;
        boolean z8;
        AbstractC0156a.k(this.f10092g);
        if (this.f.getThread() != Thread.currentThread()) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        this.f10090c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j7;
        while (true) {
            z8 = this.f10094i;
            if (z8 || j7 <= 0) {
                break;
            }
            this.f10090c.getClass();
            wait(j7);
            this.f10090c.getClass();
            j7 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z8) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z7) {
        this.f10093h = z7 | this.f10093h;
        this.f10094i = true;
        notifyAll();
    }

    public final void c() {
        AbstractC0156a.k(!this.f10092g);
        this.f10092g = true;
        C0591H c0591h = this.f10089b;
        synchronized (c0591h) {
            if (!c0591h.f9521O && c0591h.f9546z.getThread().isAlive()) {
                c0591h.f9544x.a(14, this).b();
            }
            AbstractC0156a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
