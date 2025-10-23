package W5;

import z5.C1530l;
/* loaded from: classes.dex */
public final class g0 extends e0 {

    /* renamed from: u  reason: collision with root package name */
    public final j0 f3989u;

    /* renamed from: v  reason: collision with root package name */
    public final h0 f3990v;

    /* renamed from: w  reason: collision with root package name */
    public final C0104k f3991w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f3992x;

    public g0(j0 j0Var, h0 h0Var, C0104k c0104k, Object obj) {
        this.f3989u = j0Var;
        this.f3990v = h0Var;
        this.f3991w = c0104k;
        this.f3992x = obj;
    }

    @Override // L5.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        p((Throwable) obj);
        return C1530l.f16479a;
    }

    @Override // W5.e0
    public final void p(Throwable th) {
        j0 j0Var = this.f3989u;
        j0Var.getClass();
        C0104k T6 = j0.T(this.f3991w);
        h0 h0Var = this.f3990v;
        Object obj = this.f3992x;
        if (T6 != null) {
            while (AbstractC0117y.n(T6.f4004u, false, new g0(j0Var, h0Var, T6, obj), 1) == m0.f4006q) {
                T6 = j0.T(T6);
                if (T6 == null) {
                    j0Var.t(j0Var.D(h0Var, obj));
                }
            }
            return;
        }
        j0Var.t(j0Var.D(h0Var, obj));
    }
}
