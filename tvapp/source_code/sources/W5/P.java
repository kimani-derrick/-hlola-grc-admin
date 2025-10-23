package W5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public abstract class P extends Q implements D {

    /* renamed from: w  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3957w = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_queue");

    /* renamed from: x  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3958x = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_delayed");

    /* renamed from: y  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3959y = AtomicIntegerFieldUpdater.newUpdater(P.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // W5.AbstractC0113u
    public final void V(D5.i iVar, Runnable runnable) {
        e0(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0088 A[EDGE_INSN: B:95:0x0088->B:55:0x0088 ?: BREAK  , SYNTHETIC] */
    @Override // W5.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b0() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.P.b0():long");
    }

    public void e0(Runnable runnable) {
        if (f0(runnable)) {
            Thread Z6 = Z();
            if (Thread.currentThread() != Z6) {
                LockSupport.unpark(Z6);
                return;
            }
            return;
        }
        RunnableC0118z.f4044z.e0(runnable);
    }

    public final boolean f0(Runnable runnable) {
        boolean z7;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3957w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f3959y.get(this) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            } else if (obj instanceof b6.n) {
                b6.n nVar = (b6.n) obj;
                int a7 = nVar.a(runnable);
                if (a7 == 0) {
                    return true;
                }
                if (a7 != 1) {
                    if (a7 == 2) {
                        return false;
                    }
                } else {
                    b6.n c5 = nVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            } else if (obj == AbstractC0117y.f4036c) {
                return false;
            } else {
                b6.n nVar2 = new b6.n(8, true);
                nVar2.a((Runnable) obj);
                nVar2.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
        }
    }

    public final boolean g0() {
        A5.i iVar = this.f3963u;
        if (iVar != null && !iVar.isEmpty()) {
            return false;
        }
        O o7 = (O) f3958x.get(this);
        if (o7 != null && b6.x.f7219b.get(o7) != 0) {
            return false;
        }
        Object obj = f3957w.get(this);
        if (obj != null) {
            if (obj instanceof b6.n) {
                long j7 = b6.n.f.get((b6.n) obj);
                if (((int) (1073741823 & j7)) != ((int) ((j7 & 1152921503533105152L) >> 30))) {
                    return false;
                }
            } else if (obj != AbstractC0117y.f4036c) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [W5.O, java.lang.Object] */
    public final void h0(long j7, N n) {
        boolean z7;
        int b7;
        Thread Z6;
        if (f3959y.get(this) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        N n7 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3958x;
        if (z7) {
            b7 = 1;
        } else {
            O o7 = (O) atomicReferenceFieldUpdater.get(this);
            if (o7 == null) {
                ?? obj = new Object();
                obj.f3956c = j7;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                M5.g.c(obj2);
                o7 = (O) obj2;
            }
            b7 = n.b(j7, o7, this);
        }
        if (b7 != 0) {
            if (b7 != 1) {
                if (b7 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            d0(j7, n);
            return;
        }
        O o8 = (O) atomicReferenceFieldUpdater.get(this);
        if (o8 != null) {
            n7 = o8.b();
        }
        if (n7 == n && Thread.currentThread() != (Z6 = Z())) {
            LockSupport.unpark(Z6);
        }
    }

    @Override // W5.D
    public I n(long j7, Runnable runnable, D5.i iVar) {
        return A.f3941a.n(j7, runnable, iVar);
    }

    @Override // W5.Q
    public void shutdown() {
        N n;
        ThreadLocal threadLocal = s0.f4019a;
        s0.f4019a.set(null);
        f3959y.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3957w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            B0.d dVar = AbstractC0117y.f4036c;
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof b6.n) {
                ((b6.n) obj).b();
                break;
            } else if (obj != dVar) {
                b6.n nVar = new b6.n(8, true);
                nVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                break loop0;
            } else {
                break;
            }
        }
        do {
        } while (b0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            O o7 = (O) f3958x.get(this);
            if (o7 != null) {
                synchronized (o7) {
                    if (b6.x.f7219b.get(o7) > 0) {
                        n = o7.d(0);
                    } else {
                        n = null;
                    }
                }
                if (n != null) {
                    d0(nanoTime, n);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // W5.D
    public final void y(long j7, C0100g c0100g) {
        long j8 = 0;
        if (j7 > 0) {
            if (j7 >= 9223372036854L) {
                j8 = Long.MAX_VALUE;
            } else {
                j8 = 1000000 * j7;
            }
        }
        if (j8 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            L l7 = new L(this, j8 + nanoTime, c0100g);
            h0(nanoTime, l7);
            c0100g.y(new C0098e(1, l7));
        }
    }
}
