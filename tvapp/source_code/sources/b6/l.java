package b6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7201a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7201a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a7 = nVar.a(obj);
            if (a7 == 0) {
                return true;
            }
            if (a7 != 1) {
                if (a7 == 2) {
                    return false;
                }
            } else {
                n c5 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c5) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7201a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c5 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c5) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f7201a.get(this);
        nVar.getClass();
        long j7 = n.f.get(nVar);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7201a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d = nVar.d();
            if (d != n.f7204g) {
                return d;
            }
            n c5 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c5) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
