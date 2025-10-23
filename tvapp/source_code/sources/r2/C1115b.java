package r2;

import H.j;
import Z2.H;
import k2.C0954s;
import k2.C0956u;
/* renamed from: r2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f13445a;

    /* renamed from: b  reason: collision with root package name */
    public final j f13446b;

    /* renamed from: c  reason: collision with root package name */
    public final j f13447c;
    public long d;

    public C1115b(long j7, long j8, long j9) {
        this.d = j7;
        this.f13445a = j9;
        j jVar = new j(4);
        this.f13446b = jVar;
        j jVar2 = new j(4);
        this.f13447c = jVar2;
        jVar.i(0L);
        jVar2.i(j8);
    }

    public final boolean a(long j7) {
        j jVar = this.f13446b;
        if (j7 - jVar.m(jVar.f793q - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return true;
    }

    @Override // r2.f
    public final long c(long j7) {
        return this.f13446b.m(H.c(this.f13447c, j7));
    }

    @Override // r2.f
    public final long f() {
        return this.f13445a;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        j jVar = this.f13446b;
        int c5 = H.c(jVar, j7);
        long m7 = jVar.m(c5);
        j jVar2 = this.f13447c;
        C0956u c0956u = new C0956u(m7, jVar2.m(c5));
        if (m7 != j7 && c5 != jVar.f793q - 1) {
            int i7 = c5 + 1;
            return new C0954s(c0956u, new C0956u(jVar.m(i7), jVar2.m(i7)));
        }
        return new C0954s(c0956u, c0956u);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.d;
    }
}
