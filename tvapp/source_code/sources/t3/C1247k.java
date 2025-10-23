package t3;

import java.util.concurrent.Executor;
/* renamed from: t3.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247k implements InterfaceC1250n, InterfaceC1241e, InterfaceC1240d, InterfaceC1238b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14584q;

    /* renamed from: r  reason: collision with root package name */
    public final Executor f14585r;

    /* renamed from: s  reason: collision with root package name */
    public final InterfaceC1237a f14586s;

    /* renamed from: t  reason: collision with root package name */
    public final C1251o f14587t;

    public /* synthetic */ C1247k(Executor executor, InterfaceC1237a interfaceC1237a, C1251o c1251o, int i7) {
        this.f14584q = i7;
        this.f14585r = executor;
        this.f14586s = interfaceC1237a;
        this.f14587t = c1251o;
    }

    @Override // t3.InterfaceC1250n
    public final void a(C1251o c1251o) {
        switch (this.f14584q) {
            case 0:
                this.f14585r.execute(new R3.a(this, c1251o, 25, false));
                return;
            default:
                this.f14585r.execute(new R3.a(this, c1251o, 26, false));
                return;
        }
    }

    @Override // t3.InterfaceC1238b
    public void b() {
        this.f14587t.m();
    }

    @Override // t3.InterfaceC1240d
    public void c(Exception exc) {
        this.f14587t.k(exc);
    }

    @Override // t3.InterfaceC1241e
    public void f(Object obj) {
        this.f14587t.l(obj);
    }
}
