package s3;
/* renamed from: s3.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1195q0 extends P1.c {

    /* renamed from: r  reason: collision with root package name */
    public boolean f14182r;

    public AbstractC1195q0(C1175g0 c1175g0) {
        super(c1175g0);
        ((C1175g0) this.f2765q).f14053U++;
    }

    public final void E() {
        if (this.f14182r) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void F() {
        if (!this.f14182r) {
            if (!G()) {
                ((C1175g0) this.f2765q).W.incrementAndGet();
                this.f14182r = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean G();
}
