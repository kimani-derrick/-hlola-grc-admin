package s3;
/* loaded from: classes.dex */
public abstract class o1 extends l1 {

    /* renamed from: s  reason: collision with root package name */
    public boolean f14170s;

    public o1(q1 q1Var) {
        super(q1Var);
        this.f14116r.f14190H++;
    }

    public final void H() {
        if (this.f14170s) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void I() {
        if (!this.f14170s) {
            J();
            this.f14116r.f14191I++;
            this.f14170s = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean J();
}
