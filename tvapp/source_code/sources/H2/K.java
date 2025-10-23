package H2;
/* loaded from: classes.dex */
public final class K implements d0 {

    /* renamed from: q  reason: collision with root package name */
    public final d0 f907q;

    /* renamed from: r  reason: collision with root package name */
    public final long f908r;

    public K(d0 d0Var, long j7) {
        this.f907q = d0Var;
        this.f908r = j7;
    }

    @Override // H2.d0
    public final boolean g() {
        return this.f907q.g();
    }

    @Override // H2.d0
    public final int k(androidx.fragment.app.D d, i2.g gVar, int i7) {
        int k5 = this.f907q.k(d, gVar, i7);
        if (k5 == -4) {
            gVar.f11353v = Math.max(0L, gVar.f11353v + this.f908r);
        }
        return k5;
    }

    @Override // H2.d0
    public final void w() {
        this.f907q.w();
    }

    @Override // H2.d0
    public final int x(long j7) {
        return this.f907q.x(j7 - this.f908r);
    }
}
