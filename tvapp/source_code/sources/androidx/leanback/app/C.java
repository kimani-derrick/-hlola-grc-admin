package androidx.leanback.app;

import e2.q0;
/* loaded from: classes.dex */
public final class C implements Z2.q {

    /* renamed from: q  reason: collision with root package name */
    public boolean f6155q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6156r;

    /* renamed from: s  reason: collision with root package name */
    public Object f6157s;

    /* renamed from: t  reason: collision with root package name */
    public Object f6158t;

    /* renamed from: u  reason: collision with root package name */
    public Object f6159u;

    /* renamed from: v  reason: collision with root package name */
    public Object f6160v;

    @Override // Z2.q
    public q0 a() {
        Z2.q qVar = (Z2.q) this.f6160v;
        if (qVar != null) {
            return qVar.a();
        }
        return (q0) ((Z2.A) this.f6157s).f4593u;
    }

    @Override // Z2.q
    public void b(q0 q0Var) {
        Z2.q qVar = (Z2.q) this.f6160v;
        if (qVar != null) {
            qVar.b(q0Var);
            q0Var = ((Z2.q) this.f6160v).a();
        }
        ((Z2.A) this.f6157s).b(q0Var);
    }

    @Override // Z2.q
    public long d() {
        if (this.f6155q) {
            return ((Z2.A) this.f6157s).d();
        }
        Z2.q qVar = (Z2.q) this.f6160v;
        qVar.getClass();
        return qVar.d();
    }
}
