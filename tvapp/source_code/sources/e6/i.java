package e6;

import W5.A0;
import W5.InterfaceC0099f;
import b6.t;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.C1530l;
/* loaded from: classes.dex */
public class i implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10187c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10188e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx");

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10189g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f10190a;

    /* renamed from: b  reason: collision with root package name */
    public final A5.a f10191b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public i(int i7, int i8) {
        this.f10190a = i7;
        if (i7 > 0) {
            if (i8 >= 0 && i8 <= i7) {
                k kVar = new k(0L, null, 2);
                this.head = kVar;
                this.tail = kVar;
                this._availablePermits = i7 - i8;
                this.f10191b = new A5.a(4, this);
                return;
            }
            throw new IllegalArgumentException(AbstractC0515y1.l("The number of acquired permits should be in 0..", i7).toString());
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Semaphore should have at least 1 permit, but had ", i7).toString());
    }

    public final boolean a(A0 a02) {
        Object c5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10188e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        g gVar = g.f10185y;
        long j7 = andIncrement / j.f;
        loop0: while (true) {
            c5 = b6.a.c(kVar, j7, gVar);
            if (!b6.a.f(c5)) {
                t d7 = b6.a.d(c5);
                while (true) {
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f7212s >= d7.f7212s) {
                        break loop0;
                    } else if (!d7.i()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, d7)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (d7.e()) {
                                    d7.d();
                                }
                            }
                        }
                        if (tVar.e()) {
                            tVar.d();
                        }
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) b6.a.d(c5);
        int i7 = (int) (andIncrement % j.f);
        AtomicReferenceArray atomicReferenceArray = kVar2.f10196u;
        while (!atomicReferenceArray.compareAndSet(i7, null, a02)) {
            if (atomicReferenceArray.get(i7) != null) {
                B0.d dVar = j.f10193b;
                B0.d dVar2 = j.f10194c;
                while (!atomicReferenceArray.compareAndSet(i7, dVar, dVar2)) {
                    if (atomicReferenceArray.get(i7) != dVar) {
                        return false;
                    }
                }
                ((InterfaceC0099f) a02).i(C1530l.f16479a, this.f10191b);
                return true;
            }
        }
        a02.a(kVar2, i7);
        return true;
    }

    public final void b() {
        int i7;
        Object c5;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10189g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i8 = this.f10190a;
            if (andIncrement < i8) {
                if (andIncrement >= 0) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10187c;
                k kVar = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = d.getAndIncrement(this);
                long j7 = andIncrement2 / j.f;
                h hVar = h.f10186y;
                while (true) {
                    c5 = b6.a.c(kVar, j7, hVar);
                    if (b6.a.f(c5)) {
                        break;
                    }
                    t d7 = b6.a.d(c5);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.f7212s >= d7.f7212s) {
                            break;
                        } else if (!d7.i()) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, d7)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (d7.e()) {
                                        d7.d();
                                    }
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    }
                }
                k kVar2 = (k) b6.a.d(c5);
                kVar2.a();
                if (kVar2.f7212s <= j7) {
                    int i9 = (int) (andIncrement2 % j.f);
                    B0.d dVar = j.f10193b;
                    AtomicReferenceArray atomicReferenceArray = kVar2.f10196u;
                    Object andSet = atomicReferenceArray.getAndSet(i9, dVar);
                    if (andSet == null) {
                        int i10 = j.f10192a;
                        boolean z7 = false;
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (atomicReferenceArray.get(i9) == j.f10194c) {
                                return;
                            }
                        }
                        B0.d dVar2 = j.f10193b;
                        B0.d dVar3 = j.d;
                        while (true) {
                            if (atomicReferenceArray.compareAndSet(i9, dVar2, dVar3)) {
                                z7 = true;
                                break;
                            } else if (atomicReferenceArray.get(i9) != dVar2) {
                                break;
                            }
                        }
                        if (!z7) {
                            return;
                        }
                    } else if (andSet == j.f10195e) {
                        continue;
                    } else if (andSet instanceof InterfaceC0099f) {
                        InterfaceC0099f interfaceC0099f = (InterfaceC0099f) andSet;
                        B0.d d8 = interfaceC0099f.d(C1530l.f16479a, this.f10191b);
                        if (d8 != null) {
                            interfaceC0099f.o(d8);
                            return;
                        }
                    } else {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                }
            } else {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= i8) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i8));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i8).toString());
            }
        }
    }
}
