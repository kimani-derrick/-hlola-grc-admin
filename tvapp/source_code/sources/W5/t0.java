package W5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z5.C1530l;
/* loaded from: classes.dex */
public final class t0 implements L5.l {

    /* renamed from: s  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4022s = AtomicIntegerFieldUpdater.newUpdater(t0.class, "_state");
    private volatile int _state;

    /* renamed from: q  reason: collision with root package name */
    public final Thread f4023q = Thread.currentThread();

    /* renamed from: r  reason: collision with root package name */
    public I f4024r;

    public t0(InterfaceC0093a0 interfaceC0093a0) {
    }

    public static void d(int i7) {
        throw new IllegalStateException(("Illegal state " + i7).toString());
    }

    public final void a() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4022s;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        d(i7);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i7, 1)) {
                I i8 = this.f4024r;
                if (i8 != null) {
                    i8.d();
                    return;
                }
                return;
            }
        }
    }

    @Override // L5.l
    public final Object c(Object obj) {
        Throwable th = (Throwable) obj;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4022s;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1 && i7 != 2 && i7 != 3) {
                    d(i7);
                    throw null;
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i7, 2)) {
                this.f4023q.interrupt();
                atomicIntegerFieldUpdater.set(this, 3);
                break;
            }
        }
        return C1530l.f16479a;
    }
}
