package coil.request;

import M5.g;
import P1.c;
import S0.n;
import W5.InterfaceC0093a0;
import androidx.lifecycle.InterfaceC0342u;
/* loaded from: classes.dex */
public final class BaseRequestDelegate implements n {

    /* renamed from: q  reason: collision with root package name */
    public final c f7274q;

    /* renamed from: r  reason: collision with root package name */
    public final InterfaceC0093a0 f7275r;

    public BaseRequestDelegate(c cVar, InterfaceC0093a0 interfaceC0093a0) {
        this.f7274q = cVar;
        this.f7275r = interfaceC0093a0;
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void a(InterfaceC0342u interfaceC0342u) {
        g.f(interfaceC0342u, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void b(InterfaceC0342u interfaceC0342u) {
        this.f7275r.b(null);
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void c(InterfaceC0342u interfaceC0342u) {
        g.f(interfaceC0342u, "owner");
    }

    @Override // S0.n
    public final void e() {
        this.f7274q.v(this);
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final /* synthetic */ void f(InterfaceC0342u interfaceC0342u) {
    }

    @Override // S0.n
    public final /* synthetic */ void g() {
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final /* synthetic */ void h(InterfaceC0342u interfaceC0342u) {
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void i(InterfaceC0342u interfaceC0342u) {
        g.f(interfaceC0342u, "owner");
    }

    @Override // S0.n
    public final void start() {
        this.f7274q.g(this);
    }
}
