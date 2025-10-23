package d6;

import W5.AbstractC0113u;
import W5.S;
import b6.v;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class c extends S implements Executor {

    /* renamed from: s  reason: collision with root package name */
    public static final c f9308s = new AbstractC0113u();

    /* renamed from: t  reason: collision with root package name */
    public static final AbstractC0113u f9309t;

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.c, W5.u] */
    static {
        k kVar = k.f9322s;
        int i7 = v.f7214a;
        if (64 >= i7) {
            i7 = 64;
        }
        f9309t = kVar.X(b6.a.k("kotlinx.coroutines.io.parallelism", i7, 0, 0, 12));
    }

    @Override // W5.AbstractC0113u
    public final void V(D5.i iVar, Runnable runnable) {
        f9309t.V(iVar, runnable);
    }

    @Override // W5.AbstractC0113u
    public final AbstractC0113u X(int i7) {
        return k.f9322s.X(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        V(D5.j.f531q, runnable);
    }

    @Override // W5.AbstractC0113u
    public final String toString() {
        return "Dispatchers.IO";
    }
}
