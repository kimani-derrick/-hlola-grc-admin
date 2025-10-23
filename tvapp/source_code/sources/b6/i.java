package b6;

import W5.A;
import W5.AbstractC0113u;
import W5.C0100g;
import W5.D;
import W5.I;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class i extends AbstractC0113u implements D {

    /* renamed from: x  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7192x = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");
    private volatile int runningWorkers;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC0113u f7193s;

    /* renamed from: t  reason: collision with root package name */
    public final int f7194t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ D f7195u;

    /* renamed from: v  reason: collision with root package name */
    public final l f7196v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f7197w;

    public i(AbstractC0113u abstractC0113u, int i7) {
        D d;
        this.f7193s = abstractC0113u;
        this.f7194t = i7;
        if (abstractC0113u instanceof D) {
            d = (D) abstractC0113u;
        } else {
            d = null;
        }
        this.f7195u = d == null ? A.f3941a : d;
        this.f7196v = new l();
        this.f7197w = new Object();
    }

    @Override // W5.AbstractC0113u
    public final void V(D5.i iVar, Runnable runnable) {
        this.f7196v.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7192x;
        if (atomicIntegerFieldUpdater.get(this) < this.f7194t) {
            synchronized (this.f7197w) {
                if (atomicIntegerFieldUpdater.get(this) < this.f7194t) {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    Runnable Y6 = Y();
                    if (Y6 != null) {
                        this.f7193s.V(this, new R3.a(this, Y6, 9, false));
                    }
                }
            }
        }
    }

    public final Runnable Y() {
        while (true) {
            Runnable runnable = (Runnable) this.f7196v.d();
            if (runnable == null) {
                synchronized (this.f7197w) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7192x;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f7196v.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    @Override // W5.D
    public final I n(long j7, Runnable runnable, D5.i iVar) {
        return this.f7195u.n(j7, runnable, iVar);
    }

    @Override // W5.D
    public final void y(long j7, C0100g c0100g) {
        this.f7195u.y(j7, c0100g);
    }
}
