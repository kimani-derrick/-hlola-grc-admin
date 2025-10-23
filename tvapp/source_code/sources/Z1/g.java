package Z1;

import Z2.m;
import b2.InterfaceC0363b;
import e2.t0;
import e2.u0;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC0363b, m {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4561q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f4562r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f4563s;

    public /* synthetic */ g(int i7, u0 u0Var, u0 u0Var2) {
        this.f4561q = i7;
        this.f4562r = u0Var;
        this.f4563s = u0Var2;
    }

    @Override // Z2.m
    public void c(Object obj) {
        t0 t0Var = (t0) obj;
        t0Var.getClass();
        t0Var.I(this.f4561q, (u0) this.f4562r, (u0) this.f4563s);
    }

    @Override // b2.InterfaceC0363b
    public Object e() {
        ((j) this.f4562r).d.a((T1.i) this.f4563s, this.f4561q + 1, false);
        return null;
    }

    public /* synthetic */ g(j jVar, T1.i iVar, int i7) {
        this.f4562r = jVar;
        this.f4563s = iVar;
        this.f4561q = i7;
    }
}
