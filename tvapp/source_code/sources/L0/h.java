package L0;

import java.io.IOException;
import v6.C1341f;
import v6.D;
import v6.l;
/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: r  reason: collision with root package name */
    public final L5.l f1893r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1894s;

    public h(D d, A5.a aVar) {
        super(d);
        this.f1893r = aVar;
    }

    @Override // v6.l, v6.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e3) {
            this.f1894s = true;
            this.f1893r.c(e3);
        }
    }

    @Override // v6.l, v6.D, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e3) {
            this.f1894s = true;
            this.f1893r.c(e3);
        }
    }

    @Override // v6.l, v6.D
    public final void v(C1341f c1341f, long j7) {
        if (this.f1894s) {
            c1341f.p(j7);
            return;
        }
        try {
            super.v(c1341f, j7);
        } catch (IOException e3) {
            this.f1894s = true;
            this.f1893r.c(e3);
        }
    }
}
