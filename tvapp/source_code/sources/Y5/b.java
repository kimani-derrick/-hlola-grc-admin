package Y5;

import W5.A0;
import W5.AbstractC0117y;
import W5.C0100g;
import W5.InterfaceC0099f;
import b6.t;
import b6.u;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k3.AbstractC0958a;
import r0.AbstractC1111a;
import w4.l0;
import z5.C1530l;
/* loaded from: classes.dex */
public class b implements f {
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: q  reason: collision with root package name */
    public final int f4512q;

    /* renamed from: r  reason: collision with root package name */
    public final L5.l f4513r;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* renamed from: s  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4504s = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4505t = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: u  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4506u = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4507v = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: w  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4508w = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: x  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4509x = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: y  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4510y = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: z  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4511z = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: A  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4503A = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");

    public b(int i7, L5.l lVar) {
        long j7;
        this.f4512q = i7;
        this.f4513r = lVar;
        if (i7 >= 0) {
            j jVar = d.f4515a;
            if (i7 != 0) {
                if (i7 != Integer.MAX_VALUE) {
                    j7 = i7;
                } else {
                    j7 = Long.MAX_VALUE;
                }
            } else {
                j7 = 0;
            }
            this.bufferEnd = j7;
            this.completedExpandBuffersAndPauseFlag = f4506u.get(this);
            j jVar2 = new j(0L, null, this, 3);
            this.sendSegment = jVar2;
            this.receiveSegment = jVar2;
            if (v()) {
                jVar2 = d.f4515a;
                M5.g.d(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar2;
            this._closeCause = d.f4530s;
            return;
        }
        throw new IllegalArgumentException(AbstractC1111a.n(i7, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static boolean C(Object obj) {
        if (obj instanceof InterfaceC0099f) {
            M5.g.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0099f) obj, C1530l.f16479a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final j a(b bVar, long j7, j jVar) {
        Object c5;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        long j9;
        bVar.getClass();
        j jVar2 = d.f4515a;
        c cVar = c.f4514y;
        loop0: while (true) {
            c5 = b6.a.c(jVar, j7, cVar);
            if (!b6.a.f(c5)) {
                t d = b6.a.d(c5);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4508w;
                    t tVar = (t) atomicReferenceFieldUpdater.get(bVar);
                    if (tVar.f7212s >= d.f7212s) {
                        break loop0;
                    } else if (!d.i()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(bVar, tVar, d)) {
                            if (atomicReferenceFieldUpdater.get(bVar) != tVar) {
                                if (d.e()) {
                                    d.d();
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
        boolean f = b6.a.f(c5);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4505t;
        if (f) {
            bVar.j();
            if (jVar.f7212s * d.f4516b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
        } else {
            jVar = (j) b6.a.d(c5);
            long j10 = jVar.f7212s;
            if (j10 > j7) {
                long j11 = d.f4516b * j10;
                do {
                    atomicLongFieldUpdater = f4504s;
                    j8 = atomicLongFieldUpdater.get(bVar);
                    j9 = 1152921504606846975L & j8;
                    if (j9 >= j11) {
                        break;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(bVar, j8, j9 + (((int) (j8 >> 60)) << 60)));
                if (j10 * d.f4516b >= atomicLongFieldUpdater2.get(bVar)) {
                    return null;
                }
            } else {
                return jVar;
            }
        }
        jVar.a();
        return null;
    }

    public static final void d(b bVar, Object obj, C0100g c0100g) {
        F0.c a7;
        L5.l lVar = bVar.f4513r;
        if (lVar != null && (a7 = b6.a.a(lVar, obj, null)) != null) {
            AbstractC0117y.m(c0100g.f3988u, a7);
        }
        c0100g.m(AbstractC0958a.m(bVar.q()));
    }

    public static final int f(b bVar, j jVar, int i7, Object obj, long j7, Object obj2, boolean z7) {
        bVar.getClass();
        jVar.m(i7, obj);
        if (!z7) {
            Object k5 = jVar.k(i7);
            if (k5 == null) {
                if (bVar.g(j7)) {
                    if (jVar.j(null, i7, d.d)) {
                        return 1;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (jVar.j(null, i7, obj2)) {
                        return 2;
                    }
                }
            } else if (k5 instanceof A0) {
                jVar.m(i7, null);
                if (bVar.B(k5, obj)) {
                    jVar.n(i7, d.f4521i);
                    return 0;
                }
                B0.d dVar = d.f4523k;
                if (jVar.f4536v.getAndSet((i7 * 2) + 1, dVar) != dVar) {
                    jVar.l(i7, true);
                }
                return 5;
            }
        }
        return bVar.E(jVar, i7, obj, j7, obj2, z7);
    }

    public static void s(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4507v;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
        }
    }

    public final Object A() {
        A0 a02;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4505t;
        long j7 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4504s;
        long j8 = atomicLongFieldUpdater2.get(this);
        if (t(true, j8)) {
            return new g(n());
        }
        int i7 = (j7 > (j8 & 1152921504606846975L) ? 1 : (j7 == (j8 & 1152921504606846975L) ? 0 : -1));
        Object obj = i.f4534a;
        if (i7 >= 0) {
            return obj;
        }
        B0.d dVar = d.f4523k;
        j jVar = (j) f4509x.get(this);
        while (!t(true, atomicLongFieldUpdater2.get(this))) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = d.f4516b;
            long j10 = andIncrement / j9;
            int i8 = (int) (andIncrement % j9);
            if (jVar.f7212s != j10) {
                j m7 = m(j10, jVar);
                if (m7 == null) {
                    continue;
                } else {
                    jVar = m7;
                }
            }
            Object D6 = D(jVar, i8, andIncrement, dVar);
            if (D6 == d.f4525m) {
                if (dVar instanceof A0) {
                    a02 = (A0) dVar;
                } else {
                    a02 = null;
                }
                if (a02 != null) {
                    a02.a(jVar, i8);
                }
                F(andIncrement);
                jVar.h();
            } else if (D6 == d.f4526o) {
                if (andIncrement < r()) {
                    jVar.a();
                }
            } else if (D6 != d.n) {
                jVar.a();
                obj = D6;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
            return obj;
        }
        return new g(n());
    }

    public final boolean B(Object obj, Object obj2) {
        T0.h hVar = null;
        if (obj instanceof a) {
            M5.g.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            a aVar = (a) obj;
            C0100g c0100g = aVar.f4501r;
            M5.g.c(c0100g);
            aVar.f4501r = null;
            aVar.f4500q = obj2;
            Boolean bool = Boolean.TRUE;
            L5.l lVar = aVar.f4502s.f4513r;
            if (lVar != null) {
                hVar = new T0.h(lVar, obj2, c0100g.f3988u, 2);
            }
            return d.a(c0100g, bool, hVar);
        } else if (obj instanceof InterfaceC0099f) {
            M5.g.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0099f interfaceC0099f = (InterfaceC0099f) obj;
            L5.l lVar2 = this.f4513r;
            if (lVar2 != null) {
                hVar = new T0.h(lVar2, obj2, interfaceC0099f.k(), 2);
            }
            return d.a(interfaceC0099f, obj2, hVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
        r11 = r2.get(r10 * 2);
        r9.m(r10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(Y5.j r9, int r10, long r11, java.lang.Object r13) {
        /*
            r8 = this;
            java.lang.Object r0 = r9.k(r10)
            r1 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.f4536v
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = Y5.b.f4504s
            if (r0 != 0) goto L2a
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L43
            if (r13 != 0) goto L1e
            B0.d r9 = Y5.d.n
            return r9
        L1e:
            boolean r0 = r9.j(r0, r10, r13)
            if (r0 == 0) goto L43
            r8.l()
            B0.d r9 = Y5.d.f4525m
            return r9
        L2a:
            B0.d r6 = Y5.d.d
            if (r0 != r6) goto L43
            B0.d r6 = Y5.d.f4521i
            boolean r0 = r9.j(r0, r10, r6)
            if (r0 == 0) goto L43
            r8.l()
            int r11 = r10 * 2
            java.lang.Object r11 = r2.get(r11)
            r9.m(r10, r1)
            return r11
        L43:
            java.lang.Object r0 = r9.k(r10)
            if (r0 == 0) goto Laf
            B0.d r6 = Y5.d.f4518e
            if (r0 != r6) goto L4e
            goto Laf
        L4e:
            B0.d r6 = Y5.d.d
            if (r0 != r6) goto L68
            B0.d r6 = Y5.d.f4521i
            boolean r0 = r9.j(r0, r10, r6)
            if (r0 == 0) goto L43
            r8.l()
        L5d:
            int r11 = r10 * 2
            java.lang.Object r11 = r2.get(r11)
            r9.m(r10, r1)
            goto Ld1
        L68:
            B0.d r6 = Y5.d.f4522j
            if (r0 != r6) goto L6f
        L6c:
            B0.d r11 = Y5.d.f4526o
            goto Ld1
        L6f:
            B0.d r7 = Y5.d.f4520h
            if (r0 != r7) goto L74
            goto L6c
        L74:
            B0.d r7 = Y5.d.f4524l
            if (r0 != r7) goto L7c
        L78:
            r8.l()
            goto L6c
        L7c:
            B0.d r7 = Y5.d.f4519g
            if (r0 == r7) goto L43
            B0.d r7 = Y5.d.f
            boolean r7 = r9.j(r0, r10, r7)
            if (r7 == 0) goto L43
            boolean r11 = r0 instanceof Y5.r
            if (r11 == 0) goto L90
            Y5.r r0 = (Y5.r) r0
            W5.A0 r0 = r0.f4540a
        L90:
            boolean r12 = C(r0)
            if (r12 == 0) goto L9f
            B0.d r11 = Y5.d.f4521i
            r9.n(r10, r11)
            r8.l()
            goto L5d
        L9f:
            r9.n(r10, r6)
            r12 = 0
            r9.l(r10, r12)
            if (r11 == 0) goto Lab
            r8.l()
        Lab:
            B0.d r9 = Y5.d.f4526o
            r11 = r9
            goto Ld1
        Laf:
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 >= 0) goto Lc1
            B0.d r6 = Y5.d.f4520h
            boolean r0 = r9.j(r0, r10, r6)
            if (r0 == 0) goto L43
            goto L78
        Lc1:
            if (r13 != 0) goto Lc6
            B0.d r11 = Y5.d.n
            goto Ld1
        Lc6:
            boolean r0 = r9.j(r0, r10, r13)
            if (r0 == 0) goto L43
            r8.l()
            B0.d r11 = Y5.d.f4525m
        Ld1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.b.D(Y5.j, int, long, java.lang.Object):java.lang.Object");
    }

    public final int E(j jVar, int i7, Object obj, long j7, Object obj2, boolean z7) {
        while (true) {
            Object k5 = jVar.k(i7);
            if (k5 == null) {
                if (g(j7) && !z7) {
                    if (jVar.j(null, i7, d.d)) {
                        return 1;
                    }
                } else if (z7) {
                    if (jVar.j(null, i7, d.f4522j)) {
                        jVar.l(i7, false);
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (jVar.j(null, i7, obj2)) {
                        return 2;
                    }
                }
            } else if (k5 == d.f4518e) {
                if (jVar.j(k5, i7, d.d)) {
                    return 1;
                }
            } else {
                B0.d dVar = d.f4523k;
                if (k5 == dVar) {
                    jVar.m(i7, null);
                    return 5;
                } else if (k5 == d.f4520h) {
                    jVar.m(i7, null);
                    return 5;
                } else if (k5 == d.f4524l) {
                    jVar.m(i7, null);
                    j();
                    return 4;
                } else {
                    jVar.m(i7, null);
                    if (k5 instanceof r) {
                        k5 = ((r) k5).f4540a;
                    }
                    if (B(k5, obj)) {
                        jVar.n(i7, d.f4521i);
                        return 0;
                    }
                    if (jVar.f4536v.getAndSet((i7 * 2) + 1, dVar) != dVar) {
                        jVar.l(i7, true);
                    }
                    return 5;
                }
            }
        }
    }

    public final void F(long j7) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        boolean z7;
        long j9;
        if (v()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f4506u;
        } while (atomicLongFieldUpdater.get(this) <= j7);
        int i7 = d.f4517c;
        int i8 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4507v;
            if (i8 < i7) {
                long j10 = atomicLongFieldUpdater.get(this);
                if (j10 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j10 == atomicLongFieldUpdater.get(this)) {
                    return;
                }
                i8++;
            } else {
                do {
                    j8 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j8, 4611686018427387904L + (j8 & 4611686018427387903L)));
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(this);
                    long j12 = atomicLongFieldUpdater2.get(this);
                    long j13 = j12 & 4611686018427387903L;
                    if ((j12 & 4611686018427387904L) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z7) {
                        atomicLongFieldUpdater2.compareAndSet(this, j12, j13 + 4611686018427387904L);
                    }
                }
                do {
                    j9 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, j9 & 4611686018427387903L));
                return;
            }
        }
    }

    @Override // Y5.p
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    @Override // Y5.q
    public final boolean c(Throwable th) {
        return h(th, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return r1;
     */
    @Override // Y5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.b.e(java.lang.Object):java.lang.Object");
    }

    public final boolean g(long j7) {
        if (j7 >= f4506u.get(this) && j7 >= f4505t.get(this) + this.f4512q) {
            return false;
        }
        return true;
    }

    public final boolean h(Throwable th, boolean z7) {
        boolean z8;
        long j7;
        long j8;
        long j9;
        Object obj;
        B0.d dVar;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4504s;
        if (z7) {
            do {
                j11 = atomicLongFieldUpdater.get(this);
                if (((int) (j11 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f4515a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j11, (1 << 60) + (j11 & 1152921504606846975L)));
        }
        B0.d dVar2 = d.f4530s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4511z;
            if (atomicReferenceFieldUpdater.compareAndSet(this, dVar2, th)) {
                z8 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != dVar2) {
                z8 = false;
                break;
            }
        }
        if (z7) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, (3 << 60) + (j10 & 1152921504606846975L)));
        } else {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j7 >> 60);
                if (i7 != 0) {
                    if (i7 != 1) {
                        break;
                    }
                    j8 = j7 & 1152921504606846975L;
                    j9 = 3;
                } else {
                    j8 = j7 & 1152921504606846975L;
                    j9 = 2;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (j9 << 60) + j8));
        }
        j();
        if (z8) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4503A;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    dVar = d.f4528q;
                } else {
                    dVar = d.f4529r;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, dVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                M5.r.b(1, obj);
                ((L5.l) obj).c(n());
            }
        }
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        r1 = (Y5.j) ((b6.d) b6.d.f7183r.get(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
        r3 = b6.a.g(r3, r6);
        r1.l(r5, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y5.j i(long r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.b.i(long):Y5.j");
    }

    @Override // Y5.p
    public final a iterator() {
        return new a(this);
    }

    public final void j() {
        t(false, f4504s.get(this));
    }

    public final void k(long j7) {
        F0.c a7;
        j jVar = (j) f4509x.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4505t;
            long j8 = atomicLongFieldUpdater.get(this);
            if (j7 < Math.max(this.f4512q + j8, f4506u.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j8, j8 + 1)) {
                long j9 = d.f4516b;
                long j10 = j8 / j9;
                int i7 = (int) (j8 % j9);
                if (jVar.f7212s != j10) {
                    j m7 = m(j10, jVar);
                    if (m7 == null) {
                        continue;
                    } else {
                        jVar = m7;
                    }
                }
                Object D6 = D(jVar, i7, j8, null);
                if (D6 == d.f4526o) {
                    if (j8 < r()) {
                        jVar.a();
                    }
                } else {
                    jVar.a();
                    L5.l lVar = this.f4513r;
                    if (lVar != null && (a7 = b6.a.a(lVar, D6, null)) != null) {
                        throw a7;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.b.l():void");
    }

    public final j m(long j7, j jVar) {
        Object c5;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        j jVar2 = d.f4515a;
        c cVar = c.f4514y;
        loop0: while (true) {
            c5 = b6.a.c(jVar, j7, cVar);
            if (!b6.a.f(c5)) {
                t d = b6.a.d(c5);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4509x;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f7212s >= d.f7212s) {
                        break loop0;
                    } else if (!d.i()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, d)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (d.e()) {
                                    d.d();
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
        if (b6.a.f(c5)) {
            j();
            if (jVar.f7212s * d.f4516b >= r()) {
                return null;
            }
        } else {
            jVar = (j) b6.a.d(c5);
            boolean v5 = v();
            long j9 = jVar.f7212s;
            if (!v5 && j7 <= f4506u.get(this) / d.f4516b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4510y;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f7212s >= j9 || !jVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, jVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (jVar.e()) {
                                jVar.d();
                            }
                        }
                    }
                    if (tVar2.e()) {
                        tVar2.d();
                    }
                }
            }
            if (j9 > j7) {
                long j10 = d.f4516b * j9;
                do {
                    atomicLongFieldUpdater = f4505t;
                    j8 = atomicLongFieldUpdater.get(this);
                    if (j8 >= j10) {
                        break;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j10));
                if (j9 * d.f4516b >= r()) {
                    return null;
                }
            } else {
                return jVar;
            }
        }
        jVar.a();
        return null;
    }

    public final Throwable n() {
        return (Throwable) f4511z.get(this);
    }

    public final Throwable o() {
        Throwable n = n();
        if (n == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d1, code lost:
        r2.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d4, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
        d(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014c, code lost:
        if (r24 >= r5.get(r26)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014e, code lost:
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0151, code lost:
        r2 = r27;
        r1 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v36 */
    @Override // Y5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(D5.d r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.b.p(D5.d, java.lang.Object):java.lang.Object");
    }

    public final Throwable q() {
        Throwable n = n();
        if (n == null) {
            return new IllegalStateException("Channel was closed");
        }
        return n;
    }

    public final long r() {
        return f4504s.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        r0.m(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bd, code lost:
        r0 = (Y5.j) ((b6.d) b6.d.f7183r.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.b.t(boolean, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0192, code lost:
        r3 = (Y5.j) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0199, code lost:
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0192 A[EDGE_INSN: B:99:0x0192->B:77:0x0192 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.b.toString():java.lang.String");
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j7 = f4506u.get(this);
        if (j7 != 0 && j7 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(long r5, Y5.j r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f7212s
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            b6.d r0 = r7.b()
            Y5.j r0 = (Y5.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            b6.d r5 = r7.b()
            Y5.j r5 = (Y5.j) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = Y5.b.f4510y
            java.lang.Object r6 = r5.get(r4)
            b6.t r6 = (b6.t) r6
            long r0 = r6.f7212s
            long r2 = r7.f7212s
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.b.w(long, Y5.j):void");
    }

    public final Object x(D5.d dVar, Object obj) {
        Throwable q5;
        C0100g c0100g = new C0100g(1, l0.x(dVar));
        c0100g.w();
        L5.l lVar = this.f4513r;
        if (lVar != null && (q5 = b6.a.a(lVar, obj, null)) != null) {
            android.support.v4.media.session.b.a(q5, q());
        } else {
            q5 = q();
        }
        c0100g.m(AbstractC0958a.m(q5));
        Object v5 = c0100g.v();
        if (v5 == E5.a.f612q) {
            return v5;
        }
        return C1530l.f16479a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [W5.g] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [Y5.b, java.lang.Object] */
    public final Object y(D5.d dVar) {
        j jVar;
        C0100g c0100g;
        Object D6;
        C0100g c0100g2;
        T0.h hVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4509x;
        j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4504s;
            if (!t(true, atomicLongFieldUpdater.get(this))) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4505t;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
                long j7 = d.f4516b;
                long j8 = andIncrement / j7;
                int i7 = (int) (andIncrement % j7);
                if (jVar2.f7212s != j8) {
                    j m7 = m(j8, jVar2);
                    if (m7 == null) {
                        continue;
                    } else {
                        jVar = m7;
                    }
                } else {
                    jVar = jVar2;
                }
                Object D7 = D(jVar, i7, andIncrement, null);
                B0.d dVar2 = d.f4525m;
                if (D7 != dVar2) {
                    B0.d dVar3 = d.f4526o;
                    if (D7 == dVar3) {
                        if (andIncrement < r()) {
                            jVar.a();
                        }
                        jVar2 = jVar;
                    } else if (D7 == d.n) {
                        C0100g l7 = AbstractC0117y.l(l0.x(dVar));
                        B0.d dVar4 = dVar2;
                        try {
                            D6 = D(jVar, i7, andIncrement, l7);
                        } catch (Throwable th) {
                            th = th;
                            c0100g = l7;
                        }
                        try {
                            if (D6 == dVar4) {
                                c0100g2 = l7;
                                c0100g2.a(jVar, i7);
                            } else {
                                c0100g2 = l7;
                                L5.l lVar = this.f4513r;
                                D5.i iVar = c0100g2.f3988u;
                                if (D6 == dVar3) {
                                    if (andIncrement < r()) {
                                        jVar.a();
                                    }
                                    j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
                                    while (true) {
                                        if (t(true, atomicLongFieldUpdater.get(this))) {
                                            c0100g2.m(AbstractC0958a.m(o()));
                                            break;
                                        }
                                        long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                        long j9 = d.f4516b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j10 = andIncrement2 / j9;
                                        int i8 = (int) (andIncrement2 % j9);
                                        if (jVar3.f7212s != j10) {
                                            j m8 = m(j10, jVar3);
                                            if (m8 == null) {
                                                continue;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                            } else {
                                                jVar3 = m8;
                                            }
                                        }
                                        D5.i iVar2 = iVar;
                                        L5.l lVar2 = lVar;
                                        D6 = D(jVar3, i8, andIncrement2, c0100g2);
                                        if (D6 == d.f4525m) {
                                            c0100g2.a(jVar3, i8);
                                            break;
                                        } else if (D6 == d.f4526o) {
                                            if (andIncrement2 < r()) {
                                                jVar3.a();
                                            }
                                            iVar = iVar2;
                                            lVar = lVar2;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                        } else if (D6 != d.n) {
                                            jVar3.a();
                                            if (lVar2 != null) {
                                                hVar = new T0.h(lVar2, D6, iVar2, 2);
                                            } else {
                                                hVar = null;
                                            }
                                        } else {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                    }
                                } else {
                                    jVar.a();
                                    if (lVar != null) {
                                        hVar = new T0.h(lVar, D6, iVar, 2);
                                    } else {
                                        hVar = null;
                                    }
                                }
                                c0100g2.i(D6, hVar);
                            }
                            return c0100g2.v();
                        } catch (Throwable th2) {
                            th = th2;
                            c0100g = dVar4;
                            c0100g.D();
                            throw th;
                        }
                    } else {
                        jVar.a();
                        return D7;
                    }
                } else {
                    throw new IllegalStateException("unexpected".toString());
                }
            } else {
                Throwable o7 = o();
                int i9 = u.f7213a;
                throw o7;
            }
        }
    }

    public final void z(A0 a02, boolean z7) {
        Object m7;
        Throwable q5;
        if (a02 instanceof InterfaceC0099f) {
            D5.d dVar = (D5.d) a02;
            if (z7) {
                q5 = o();
            } else {
                q5 = q();
            }
            dVar.m(AbstractC0958a.m(q5));
        } else if (a02 instanceof a) {
            a aVar = (a) a02;
            C0100g c0100g = aVar.f4501r;
            M5.g.c(c0100g);
            aVar.f4501r = null;
            aVar.f4500q = d.f4524l;
            Throwable n = aVar.f4502s.n();
            if (n == null) {
                m7 = Boolean.FALSE;
            } else {
                m7 = AbstractC0958a.m(n);
            }
            c0100g.m(m7);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + a02).toString());
        }
    }
}
