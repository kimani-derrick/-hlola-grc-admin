package d6;

import W5.S;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* loaded from: classes.dex */
public abstract class g extends S {

    /* renamed from: s  reason: collision with root package name */
    public final b f9312s;

    public g(int i7, int i8, long j7, String str) {
        this.f9312s = new b(i7, i8, j7, str);
    }

    @Override // W5.AbstractC0113u
    public final void V(D5.i iVar, Runnable runnable) {
        b bVar = this.f9312s;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f9298x;
        bVar.b(runnable, j.f9320g, false);
    }
}
