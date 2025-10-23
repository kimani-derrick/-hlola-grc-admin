package v6;
/* loaded from: classes.dex */
public abstract class m implements F {

    /* renamed from: q  reason: collision with root package name */
    public final F f15398q;

    public m(F f) {
        M5.g.f(f, "delegate");
        this.f15398q = f;
    }

    @Override // v6.F
    public long L(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "sink");
        return this.f15398q.L(c1341f, j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15398q.close();
    }

    @Override // v6.F
    public final H d() {
        return this.f15398q.d();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f15398q + ')';
    }
}
