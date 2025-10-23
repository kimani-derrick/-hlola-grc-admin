package d6;

import M5.o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: y  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9288y = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* renamed from: q  reason: collision with root package name */
    public final l f9289q;

    /* renamed from: r  reason: collision with root package name */
    public final o f9290r;

    /* renamed from: s  reason: collision with root package name */
    public int f9291s;

    /* renamed from: t  reason: collision with root package name */
    public long f9292t;

    /* renamed from: u  reason: collision with root package name */
    public long f9293u;

    /* renamed from: v  reason: collision with root package name */
    public int f9294v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9295w;
    private volatile int workerCtl;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b f9296x;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, M5.o] */
    public a(b bVar, int i7) {
        this.f9296x = bVar;
        setDaemon(true);
        this.f9289q = new l();
        this.f9290r = new Object();
        this.f9291s = 4;
        this.nextParkedWorker = b.f9297A;
        P5.e.f2815q.getClass();
        this.f9294v = P5.e.f2816r.b();
        f(i7);
    }

    public final h a(boolean z7) {
        h e3;
        h e7;
        b bVar;
        long j7;
        int i7 = this.f9291s;
        boolean z8 = true;
        h hVar = null;
        l lVar = this.f9289q;
        b bVar2 = this.f9296x;
        if (i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f9299y;
            do {
                bVar = this.f9296x;
                j7 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f9323b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null && hVar2.f9314r.f259q == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i8 = l.d.get(lVar);
                    int i9 = l.f9324c.get(lVar);
                    while (true) {
                        if (i8 != i9 && l.f9325e.get(lVar) != 0) {
                            i9--;
                            h c5 = lVar.c(i9, true);
                            if (c5 != null) {
                                hVar = c5;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (hVar == null) {
                        h hVar3 = (h) bVar2.f9306v.d();
                        if (hVar3 == null) {
                            return i(1);
                        }
                        return hVar3;
                    }
                    return hVar;
                }
            } while (!b.f9299y.compareAndSet(bVar, j7, j7 - 4398046511104L));
            this.f9291s = 1;
        }
        if (z7) {
            if (d(bVar2.f9301q * 2) != 0) {
                z8 = false;
            }
            if (!z8 || (e7 = e()) == null) {
                lVar.getClass();
                h hVar4 = (h) l.f9323b.getAndSet(lVar, null);
                if (hVar4 == null) {
                    hVar4 = lVar.b();
                }
                if (hVar4 == null) {
                    if (!z8 && (e3 = e()) != null) {
                        return e3;
                    }
                } else {
                    return hVar4;
                }
            } else {
                return e7;
            }
        } else {
            h e8 = e();
            if (e8 != null) {
                return e8;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i7) {
        int i8 = this.f9294v;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f9294v = i11;
        int i12 = i7 - 1;
        if ((i12 & i7) == 0) {
            return i11 & i12;
        }
        return (i11 & Integer.MAX_VALUE) % i7;
    }

    public final h e() {
        e eVar;
        int d = d(2);
        b bVar = this.f9296x;
        if (d == 0) {
            h hVar = (h) bVar.f9305u.d();
            if (hVar != null) {
                return hVar;
            }
            eVar = bVar.f9306v;
        } else {
            h hVar2 = (h) bVar.f9306v.d();
            if (hVar2 != null) {
                return hVar2;
            }
            eVar = bVar.f9305u;
        }
        return (h) eVar.d();
    }

    public final void f(int i7) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9296x.f9304t);
        sb.append("-worker-");
        if (i7 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i7);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i7) {
        int i8 = this.f9291s;
        boolean z7 = true;
        if (i8 != 1) {
            z7 = false;
        }
        if (z7) {
            b.f9299y.addAndGet(this.f9296x, 4398046511104L);
        }
        if (i8 != i7) {
            this.f9291s = i7;
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d6.h i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.a.i(int):d6.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0004, code lost:
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.a.run():void");
    }
}
