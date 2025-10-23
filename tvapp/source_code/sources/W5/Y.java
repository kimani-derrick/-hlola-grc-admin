package W5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class Y extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f3968u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ L5.a f3969v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(L5.a aVar, D5.d dVar) {
        super(2, dVar);
        this.f3969v = aVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        Y y3 = new Y(this.f3969v, dVar);
        y3.f3968u = obj;
        return y3;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((Y) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        D5.i n = ((InterfaceC0116x) this.f3968u).n();
        L5.a aVar = this.f3969v;
        try {
            InterfaceC0093a0 k5 = AbstractC0117y.k(n);
            t0 t0Var = new t0(k5);
            t0Var.f4024r = ((j0) k5).P(true, true, t0Var);
            while (true) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t0.f4022s;
                int i7 = atomicIntegerFieldUpdater.get(t0Var);
                if (i7 != 0) {
                    if (i7 != 2 && i7 != 3) {
                        t0.d(i7);
                        throw null;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(t0Var, i7, 0)) {
                    break;
                }
            }
            Object b7 = aVar.b();
            t0Var.a();
            return b7;
        } catch (InterruptedException e3) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e3);
        }
    }
}
