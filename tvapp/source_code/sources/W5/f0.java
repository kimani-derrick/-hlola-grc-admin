package W5;
/* loaded from: classes.dex */
public final class f0 extends C0100g {

    /* renamed from: y  reason: collision with root package name */
    public final j0 f3983y;

    public f0(D5.d dVar, C0107n c0107n) {
        super(1, dVar);
        this.f3983y = c0107n;
    }

    @Override // W5.C0100g
    public final String C() {
        return "AwaitContinuation";
    }

    @Override // W5.C0100g
    public final Throwable u(j0 j0Var) {
        Throwable c5;
        Object K6 = this.f3983y.K();
        if ((K6 instanceof h0) && (c5 = ((h0) K6).c()) != null) {
            return c5;
        }
        if (K6 instanceof C0109p) {
            return ((C0109p) K6).f4012a;
        }
        return j0Var.E();
    }
}
