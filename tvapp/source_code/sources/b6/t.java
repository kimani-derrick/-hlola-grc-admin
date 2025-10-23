package b6;

import W5.n0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public abstract class t extends d implements n0 {

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7211t = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: s  reason: collision with root package name */
    public final long f7212s;

    public t(long j7, t tVar, int i7) {
        super(tVar);
        this.f7212s = j7;
        this.cleanedAndPointers = i7 << 16;
    }

    @Override // b6.d
    public final boolean c() {
        if (f7211t.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f7211t.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i7, D5.i iVar);

    public final void h() {
        if (f7211t.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f7211t;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
