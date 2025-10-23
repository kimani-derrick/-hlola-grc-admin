package t3;

import java.util.concurrent.Executor;
/* renamed from: t3.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248l implements InterfaceC1250n, InterfaceC1241e, InterfaceC1240d, InterfaceC1238b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14588q;

    /* renamed from: r  reason: collision with root package name */
    public final Executor f14589r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f14590s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f14591t;

    public C1248l(Executor executor, InterfaceC1238b interfaceC1238b) {
        this.f14588q = 0;
        this.f14590s = new Object();
        this.f14589r = executor;
        this.f14591t = interfaceC1238b;
    }

    private final void d(C1251o c1251o) {
        synchronized (this.f14590s) {
            try {
                if (((InterfaceC1239c) this.f14591t) == null) {
                    return;
                }
                this.f14589r.execute(new R3.a(this, c1251o, 27, false));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e(C1251o c1251o) {
        if (!c1251o.i() && !c1251o.d) {
            synchronized (this.f14590s) {
                try {
                    if (((InterfaceC1240d) this.f14591t) == null) {
                        return;
                    }
                    this.f14589r.execute(new R3.a(this, c1251o, 28, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final void g(C1251o c1251o) {
        if (c1251o.i()) {
            synchronized (this.f14590s) {
                try {
                    if (((InterfaceC1241e) this.f14591t) == null) {
                        return;
                    }
                    this.f14589r.execute(new R3.a(this, c1251o, 29, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // t3.InterfaceC1250n
    public final void a(C1251o c1251o) {
        switch (this.f14588q) {
            case 0:
                if (c1251o.d) {
                    synchronized (this.f14590s) {
                        try {
                            if (((InterfaceC1238b) this.f14591t) != null) {
                                this.f14589r.execute(new P.b(19, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                d(c1251o);
                return;
            case 2:
                e(c1251o);
                return;
            case 3:
                g(c1251o);
                return;
            default:
                this.f14589r.execute(new RunnableC1249m(this, 0, c1251o));
                return;
        }
    }

    @Override // t3.InterfaceC1238b
    public void b() {
        ((C1251o) this.f14591t).m();
    }

    @Override // t3.InterfaceC1240d
    public void c(Exception exc) {
        ((C1251o) this.f14591t).k(exc);
    }

    @Override // t3.InterfaceC1241e
    public void f(Object obj) {
        ((C1251o) this.f14591t).l(obj);
    }

    public C1248l(Executor executor, InterfaceC1239c interfaceC1239c) {
        this.f14588q = 1;
        this.f14590s = new Object();
        this.f14589r = executor;
        this.f14591t = interfaceC1239c;
    }

    public C1248l(Executor executor, InterfaceC1240d interfaceC1240d) {
        this.f14588q = 2;
        this.f14590s = new Object();
        this.f14589r = executor;
        this.f14591t = interfaceC1240d;
    }

    public C1248l(Executor executor, InterfaceC1241e interfaceC1241e) {
        this.f14588q = 3;
        this.f14590s = new Object();
        this.f14589r = executor;
        this.f14591t = interfaceC1241e;
    }

    public C1248l(Executor executor, InterfaceC1243g interfaceC1243g, C1251o c1251o) {
        this.f14588q = 4;
        this.f14589r = executor;
        this.f14590s = interfaceC1243g;
        this.f14591t = c1251o;
    }
}
