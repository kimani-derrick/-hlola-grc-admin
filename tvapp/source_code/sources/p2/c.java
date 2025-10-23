package p2;

import M2.e;
import k2.C0954s;
import k2.C0956u;
import k2.InterfaceC0955t;
/* loaded from: classes.dex */
public final class c implements InterfaceC0955t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0955t f13132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f13133b;

    public c(e eVar, InterfaceC0955t interfaceC0955t) {
        this.f13133b = eVar;
        this.f13132a = interfaceC0955t;
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return this.f13132a.b();
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        C0954s g7 = this.f13132a.g(j7);
        C0956u c0956u = g7.f12194a;
        long j8 = c0956u.f12197a;
        long j9 = c0956u.f12198b;
        long j10 = this.f13133b.f2260r;
        C0956u c0956u2 = new C0956u(j8, j9 + j10);
        C0956u c0956u3 = g7.f12195b;
        return new C0954s(c0956u2, new C0956u(c0956u3.f12197a, c0956u3.f12198b + j10));
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f13132a.i();
    }
}
