package b6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class b extends p {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7180a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f7176a;

    @Override // b6.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7180a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        B0.d dVar = a.f7176a;
        if (obj2 == dVar) {
            B0.d c5 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == dVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, dVar, c5)) {
                        obj2 = c5;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != dVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract B0.d c(Object obj);
}
