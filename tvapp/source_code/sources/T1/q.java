package T1;
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3255q;

    /* renamed from: r  reason: collision with root package name */
    public final Runnable f3256r;

    public /* synthetic */ q(Runnable runnable, int i7) {
        this.f3255q = i7;
        this.f3256r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3255q) {
            case 0:
                try {
                    this.f3256r.run();
                    return;
                } catch (Exception e3) {
                    h4.b.s("Executor", "Background execution failure.", e3);
                    return;
                }
            default:
                this.f3256r.run();
                return;
        }
    }

    public String toString() {
        switch (this.f3255q) {
            case 1:
                return this.f3256r.toString();
            default:
                return super.toString();
        }
    }
}
