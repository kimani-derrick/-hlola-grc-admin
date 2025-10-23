package n6;

import M5.g;
import v6.C1341f;
/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: t  reason: collision with root package name */
    public boolean f12778t;

    @Override // n6.a, v6.F
    public final long L(C1341f c1341f, long j7) {
        g.f(c1341f, "sink");
        if (j7 >= 0) {
            if (!this.f12764r) {
                if (this.f12778t) {
                    return -1L;
                }
                long L6 = super.L(c1341f, j7);
                if (L6 == -1) {
                    this.f12778t = true;
                    a();
                    return -1L;
                }
                return L6;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(g.k(Long.valueOf(j7), "byteCount < 0: ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12764r) {
            return;
        }
        if (!this.f12778t) {
            a();
        }
        this.f12764r = true;
    }
}
