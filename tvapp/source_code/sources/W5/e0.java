package W5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class e0 extends b6.k implements I, W, L5.l {

    /* renamed from: t  reason: collision with root package name */
    public j0 f3982t;

    @Override // W5.W
    public final boolean a() {
        return true;
    }

    @Override // W5.I
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        j0 o7 = o();
        while (true) {
            Object K6 = o7.K();
            if (K6 instanceof e0) {
                if (K6 == this) {
                    K k5 = AbstractC0117y.f4041j;
                    do {
                        atomicReferenceFieldUpdater2 = j0.f4002q;
                        if (atomicReferenceFieldUpdater2.compareAndSet(o7, K6, k5)) {
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(o7) == K6);
                } else {
                    return;
                }
            } else if (!(K6 instanceof W) || ((W) K6).h() == null) {
                return;
            } else {
                while (true) {
                    Object l7 = l();
                    if (l7 instanceof b6.q) {
                        b6.k kVar = ((b6.q) l7).f7209a;
                        return;
                    } else if (l7 == this) {
                        b6.k kVar2 = (b6.k) l7;
                        return;
                    } else {
                        M5.g.d(l7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        b6.k kVar3 = (b6.k) l7;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = b6.k.f7200s;
                        b6.q qVar = (b6.q) atomicReferenceFieldUpdater3.get(kVar3);
                        if (qVar == null) {
                            qVar = new b6.q(kVar3);
                            atomicReferenceFieldUpdater3.lazySet(kVar3, qVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = b6.k.f7198q;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, l7, qVar)) {
                                kVar3.i();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == l7);
                    }
                }
            }
        }
    }

    public InterfaceC0093a0 getParent() {
        return o();
    }

    @Override // W5.W
    public final l0 h() {
        return null;
    }

    public final j0 o() {
        j0 j0Var = this.f3982t;
        if (j0Var != null) {
            return j0Var;
        }
        M5.g.l("job");
        throw null;
    }

    public abstract void p(Throwable th);

    @Override // b6.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0117y.j(this) + "[job@" + AbstractC0117y.j(o()) + ']';
    }
}
