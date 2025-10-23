package W5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class E extends b6.s {

    /* renamed from: u  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3943u = AtomicIntegerFieldUpdater.newUpdater(E.class, "_decision");
    private volatile int _decision;

    @Override // b6.s, W5.j0
    public final void t(Object obj) {
        u(obj);
    }

    @Override // b6.s, W5.j0
    public final void u(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3943u;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1) {
                    b6.a.i(w4.l0.x(this.f7210t), AbstractC0117y.r(obj), null);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
