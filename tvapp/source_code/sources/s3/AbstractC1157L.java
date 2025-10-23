package s3;
/* renamed from: s3.L  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1157L extends AbstractC1205w {

    /* renamed from: r  reason: collision with root package name */
    public boolean f13826r;

    public AbstractC1157L(C1175g0 c1175g0) {
        super(c1175g0);
        ((C1175g0) this.f2765q).f14053U++;
    }

    public final void H() {
        if (this.f13826r) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void I() {
        if (!this.f13826r) {
            if (!J()) {
                ((C1175g0) this.f2765q).W.incrementAndGet();
                this.f13826r = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean J();
}
