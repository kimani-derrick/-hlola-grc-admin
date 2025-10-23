package d6;

import W5.AbstractC0117y;
import b6.r;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class b implements Executor, Closeable {
    private volatile int _isTerminated;
    private volatile long controlState;
    private volatile long parkedWorkersStack;

    /* renamed from: q  reason: collision with root package name */
    public final int f9301q;

    /* renamed from: r  reason: collision with root package name */
    public final int f9302r;

    /* renamed from: s  reason: collision with root package name */
    public final long f9303s;

    /* renamed from: t  reason: collision with root package name */
    public final String f9304t;

    /* renamed from: u  reason: collision with root package name */
    public final e f9305u;

    /* renamed from: v  reason: collision with root package name */
    public final e f9306v;

    /* renamed from: w  reason: collision with root package name */
    public final r f9307w;

    /* renamed from: x  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9298x = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: y  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9299y = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: z  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9300z = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: A  reason: collision with root package name */
    public static final B0.d f9297A = new B0.d(6, "NOT_IN_STACK", false);

    /* JADX WARN: Type inference failed for: r4v10, types: [d6.e, b6.l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [d6.e, b6.l] */
    public b(int i7, int i8, long j7, String str) {
        this.f9301q = i7;
        this.f9302r = i8;
        this.f9303s = j7;
        this.f9304t = str;
        if (i7 >= 1) {
            if (i8 >= i7) {
                if (i8 <= 2097150) {
                    if (j7 > 0) {
                        this.f9305u = new b6.l();
                        this.f9306v = new b6.l();
                        this.f9307w = new r((i7 + 1) * 2);
                        this.controlState = i7 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
                }
                throw new IllegalArgumentException(AbstractC1111a.n(i8, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(AbstractC1111a.m(i8, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(AbstractC1111a.n(i7, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        synchronized (this.f9307w) {
            try {
                if (f9300z.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f9299y;
                long j7 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j7 & 2097151);
                int i8 = i7 - ((int) ((j7 & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f9301q) {
                    return 0;
                }
                if (i7 >= this.f9302r) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 > 0 && this.f9307w.b(i9) == null) {
                    a aVar = new a(this, i9);
                    this.f9307w.c(i9, aVar);
                    if (i9 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i10 = i8 + 1;
                        aVar.start();
                        return i10;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, B4.b bVar, boolean z7) {
        h iVar;
        boolean z8;
        long j7;
        a aVar;
        e eVar;
        int i7;
        j.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f9313q = nanoTime;
            iVar.f9314r = bVar;
        } else {
            iVar = new i(runnable, nanoTime, bVar);
        }
        boolean z9 = false;
        if (iVar.f9314r.f259q == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9299y;
        if (z8) {
            j7 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j7 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !M5.g.a(aVar.f9296x, this)) {
            aVar = null;
        }
        if (aVar != null && (i7 = aVar.f9291s) != 5 && (iVar.f9314r.f259q != 0 || i7 != 2)) {
            aVar.f9295w = true;
            l lVar = aVar.f9289q;
            if (z7) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f9323b.getAndSet(lVar, iVar);
                if (hVar == null) {
                    iVar = null;
                } else {
                    iVar = lVar.a(hVar);
                }
            }
        }
        if (iVar != null) {
            if (iVar.f9314r.f259q == 1) {
                eVar = this.f9306v;
            } else {
                eVar = this.f9305u;
            }
            if (!eVar.a(iVar)) {
                throw new RejectedExecutionException(AbstractC1111a.t(new StringBuilder(), this.f9304t, " was terminated"));
            }
        }
        if (z7 && aVar != null) {
            z9 = true;
        }
        if (z8) {
            if (!z9 && !j() && !h(j7)) {
                j();
            }
        } else if (!z9 && !j() && !h(atomicLongFieldUpdater.get(this))) {
            j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r1 == null) goto L46;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = d6.b.f9300z
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof d6.a
            r3 = 0
            if (r1 == 0) goto L18
            d6.a r0 = (d6.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            d6.b r1 = r0.f9296x
            boolean r1 = M5.g.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            b6.r r1 = r8.f9307w
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = d6.b.f9299y     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L77
            r1 = r2
        L37:
            b6.r r5 = r8.f9307w
            java.lang.Object r5 = r5.b(r1)
            M5.g.c(r5)
            d6.a r5 = (d6.a) r5
            if (r5 == r0) goto L72
        L44:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L53:
            d6.l r5 = r5.f9289q
            d6.e r6 = r8.f9306v
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = d6.l.f9323b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            d6.h r7 = (d6.h) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            d6.h r7 = r5.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r4) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            d6.e r1 = r8.f9306v
            r1.b()
            d6.e r1 = r8.f9305u
            r1.b()
        L81:
            if (r0 == 0) goto L89
            d6.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            d6.e r1 = r8.f9305u
            java.lang.Object r1 = r1.d()
            d6.h r1 = (d6.h) r1
            if (r1 != 0) goto Lb0
            d6.e r1 = r8.f9306v
            java.lang.Object r1 = r1.d()
            d6.h r1 = (d6.h) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = d6.b.f9298x
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = d6.b.f9299y
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.b.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, j.f9320g, false);
    }

    public final void f(a aVar, int i7, int i8) {
        while (true) {
            long j7 = f9298x.get(this);
            int i9 = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (i9 == i7) {
                if (i8 == 0) {
                    Object c5 = aVar.c();
                    while (true) {
                        if (c5 == f9297A) {
                            i9 = -1;
                            break;
                        } else if (c5 == null) {
                            i9 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c5;
                            int b7 = aVar2.b();
                            if (b7 != 0) {
                                i9 = b7;
                                break;
                            }
                            c5 = aVar2.c();
                        }
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f9298x.compareAndSet(this, j7, i9 | j8)) {
                    return;
                }
            }
        }
    }

    public final boolean h(long j7) {
        int i7 = ((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = this.f9301q;
        if (i7 < i8) {
            int a7 = a();
            if (a7 == 1 && i8 > 1) {
                a();
            }
            if (a7 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        B0.d dVar;
        int i7;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9298x;
            long j7 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f9307w.b((int) (2097151 & j7));
            if (aVar == null) {
                aVar = null;
            } else {
                long j8 = (2097152 + j7) & (-2097152);
                Object c5 = aVar.c();
                while (true) {
                    dVar = f9297A;
                    if (c5 == dVar) {
                        i7 = -1;
                        break;
                    } else if (c5 == null) {
                        i7 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c5;
                        i7 = aVar2.b();
                        if (i7 != 0) {
                            break;
                        }
                        c5 = aVar2.c();
                    }
                }
                if (i7 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j7, j8 | i7)) {
                    aVar.g(dVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f9288y.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i7;
        StringBuilder sb;
        char c5;
        ArrayList arrayList = new ArrayList();
        r rVar = this.f9307w;
        int a7 = rVar.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < a7; i13++) {
            a aVar = (a) rVar.b(i13);
            if (aVar != null) {
                l lVar = aVar.f9289q;
                lVar.getClass();
                if (l.f9323b.get(lVar) != null) {
                    i7 = (l.f9324c.get(lVar) - l.d.get(lVar)) + 1;
                } else {
                    i7 = l.f9324c.get(lVar) - l.d.get(lVar);
                }
                int b7 = s.h.b(aVar.f9291s);
                if (b7 != 0) {
                    if (b7 != 1) {
                        if (b7 != 2) {
                            if (b7 != 3) {
                                if (b7 == 4) {
                                    i12++;
                                }
                            } else {
                                i11++;
                                if (i7 > 0) {
                                    sb = new StringBuilder();
                                    sb.append(i7);
                                    c5 = 'd';
                                }
                            }
                        } else {
                            i10++;
                        }
                    } else {
                        i9++;
                        sb = new StringBuilder();
                        sb.append(i7);
                        c5 = 'b';
                    }
                } else {
                    i8++;
                    sb = new StringBuilder();
                    sb.append(i7);
                    c5 = 'c';
                }
                sb.append(c5);
                arrayList.add(sb.toString());
            }
        }
        long j7 = f9299y.get(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9304t);
        sb2.append('@');
        sb2.append(AbstractC0117y.j(this));
        sb2.append("[Pool Size {core = ");
        int i14 = this.f9301q;
        sb2.append(i14);
        sb2.append(", max = ");
        sb2.append(this.f9302r);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(i8);
        sb2.append(", blocking = ");
        sb2.append(i9);
        sb2.append(", parked = ");
        sb2.append(i10);
        sb2.append(", dormant = ");
        sb2.append(i11);
        sb2.append(", terminated = ");
        sb2.append(i12);
        sb2.append("}, running workers queues = ");
        sb2.append(arrayList);
        sb2.append(", global CPU queue size = ");
        sb2.append(this.f9305u.c());
        sb2.append(", global blocking queue size = ");
        sb2.append(this.f9306v.c());
        sb2.append(", Control State {created workers= ");
        sb2.append((int) (2097151 & j7));
        sb2.append(", blocking tasks = ");
        sb2.append((int) ((4398044413952L & j7) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(i14 - ((int) ((j7 & 9223367638808264704L) >> 42)));
        sb2.append("}]");
        return sb2.toString();
    }
}
