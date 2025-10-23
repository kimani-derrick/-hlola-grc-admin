package v6;
/* loaded from: classes.dex */
public abstract class l implements D {

    /* renamed from: q  reason: collision with root package name */
    public final D f15397q;

    public l(D d) {
        M5.g.f(d, "delegate");
        this.f15397q = d;
    }

    @Override // v6.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15397q.close();
    }

    @Override // v6.D
    public final H d() {
        return this.f15397q.d();
    }

    @Override // v6.D, java.io.Flushable
    public void flush() {
        this.f15397q.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f15397q + ')';
    }

    @Override // v6.D
    public void v(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "source");
        this.f15397q.v(c1341f, j7);
    }
}
