package h6;

import java.io.Closeable;
import v6.InterfaceC1343h;
/* loaded from: classes.dex */
public abstract class I implements Closeable {
    public abstract long a();

    public abstract v b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        i6.b.d(f());
    }

    public abstract InterfaceC1343h f();
}
