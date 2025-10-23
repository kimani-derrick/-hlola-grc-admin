package L0;

import java.io.Closeable;
/* loaded from: classes.dex */
public final class i implements Closeable {

    /* renamed from: q  reason: collision with root package name */
    public final d f1895q;

    public i(d dVar) {
        this.f1895q = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1895q.close();
    }
}
