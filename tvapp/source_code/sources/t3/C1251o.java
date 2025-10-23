package t3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* renamed from: t3.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14595a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final A0.f f14596b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14597c;
    public volatile boolean d;

    /* renamed from: e  reason: collision with root package name */
    public Object f14598e;
    public Exception f;

    /* JADX WARN: Type inference failed for: r0v1, types: [A0.f, java.lang.Object] */
    public C1251o() {
        ?? obj = new Object();
        obj.f12b = new Object();
        this.f14596b = obj;
    }

    public final void a(Executor executor, InterfaceC1238b interfaceC1238b) {
        this.f14596b.m(new C1248l(executor, interfaceC1238b));
        o();
    }

    public final void b(Executor executor, InterfaceC1240d interfaceC1240d) {
        this.f14596b.m(new C1248l(executor, interfaceC1240d));
        o();
    }

    public final void c(Executor executor, InterfaceC1241e interfaceC1241e) {
        this.f14596b.m(new C1248l(executor, interfaceC1241e));
        o();
    }

    public final C1251o d(Executor executor, InterfaceC1237a interfaceC1237a) {
        C1251o c1251o = new C1251o();
        this.f14596b.m(new C1247k(executor, interfaceC1237a, c1251o, 0));
        o();
        return c1251o;
    }

    public final C1251o e(Executor executor, InterfaceC1237a interfaceC1237a) {
        C1251o c1251o = new C1251o();
        this.f14596b.m(new C1247k(executor, interfaceC1237a, c1251o, 1));
        o();
        return c1251o;
    }

    public final Exception f() {
        Exception exc;
        synchronized (this.f14595a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object g() {
        Object obj;
        synchronized (this.f14595a) {
            try {
                g3.n.i("Task is not yet complete", this.f14597c);
                if (!this.d) {
                    Exception exc = this.f;
                    if (exc == null) {
                        obj = this.f14598e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean h() {
        boolean z7;
        synchronized (this.f14595a) {
            z7 = this.f14597c;
        }
        return z7;
    }

    public final boolean i() {
        boolean z7;
        synchronized (this.f14595a) {
            try {
                z7 = false;
                if (this.f14597c && !this.d && this.f == null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    public final C1251o j(Executor executor, InterfaceC1243g interfaceC1243g) {
        C1251o c1251o = new C1251o();
        this.f14596b.m(new C1248l(executor, interfaceC1243g, c1251o));
        o();
        return c1251o;
    }

    public final void k(Exception exc) {
        g3.n.h(exc, "Exception must not be null");
        synchronized (this.f14595a) {
            n();
            this.f14597c = true;
            this.f = exc;
        }
        this.f14596b.n(this);
    }

    public final void l(Object obj) {
        synchronized (this.f14595a) {
            n();
            this.f14597c = true;
            this.f14598e = obj;
        }
        this.f14596b.n(this);
    }

    public final void m() {
        synchronized (this.f14595a) {
            try {
                if (this.f14597c) {
                    return;
                }
                this.f14597c = true;
                this.d = true;
                this.f14596b.n(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        String str;
        if (this.f14597c) {
            int i7 = Y5.l.f4537q;
            if (h()) {
                Exception f = f();
                if (f == null) {
                    if (!i()) {
                        if (this.d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(g()));
                    }
                } else {
                    str = "failure";
                }
                throw new IllegalStateException("Complete with: ".concat(str), f);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void o() {
        synchronized (this.f14595a) {
            try {
                if (!this.f14597c) {
                    return;
                }
                this.f14596b.n(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
