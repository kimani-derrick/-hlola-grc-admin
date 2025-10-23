package W5;
/* loaded from: classes.dex */
public final class M extends N {

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f3953s;

    public M(Runnable runnable, long j7) {
        super(j7);
        this.f3953s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3953s.run();
    }

    @Override // W5.N
    public final String toString() {
        return super.toString() + this.f3953s;
    }
}
