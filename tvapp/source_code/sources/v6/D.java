package v6;

import java.io.Closeable;
import java.io.Flushable;
/* loaded from: classes.dex */
public interface D extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    H d();

    void flush();

    void v(C1341f c1341f, long j7);
}
