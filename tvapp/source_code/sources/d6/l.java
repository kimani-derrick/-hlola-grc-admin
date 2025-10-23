package d6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9323b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9324c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9325e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f9326a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9324c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f9314r.f259q == 1) {
            f9325e.incrementAndGet(this);
        }
        int i7 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f9326a;
            if (atomicReferenceArray.get(i7) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i7, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f9324c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (hVar = (h) this.f9326a.getAndSet(i8, null)) != null) {
                if (hVar.f9314r.f259q == 1) {
                    f9325e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i7, boolean z7) {
        int i8 = i7 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f9326a;
        h hVar = (h) atomicReferenceArray.get(i8);
        if (hVar != null) {
            boolean z8 = true;
            if (hVar.f9314r.f259q != 1) {
                z8 = false;
            }
            if (z8 == z7) {
                while (!atomicReferenceArray.compareAndSet(i8, hVar, null)) {
                    if (atomicReferenceArray.get(i8) != hVar) {
                    }
                }
                if (z7) {
                    f9325e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
