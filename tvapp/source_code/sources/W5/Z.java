package W5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z5.C1530l;
/* loaded from: classes.dex */
public final class Z extends c0 {

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3970v = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: u  reason: collision with root package name */
    public final L5.l f3971u;

    public Z(L5.l lVar) {
        this.f3971u = lVar;
    }

    @Override // L5.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        p((Throwable) obj);
        return C1530l.f16479a;
    }

    @Override // W5.e0
    public final void p(Throwable th) {
        if (f3970v.compareAndSet(this, 0, 1)) {
            this.f3971u.c(th);
        }
    }
}
