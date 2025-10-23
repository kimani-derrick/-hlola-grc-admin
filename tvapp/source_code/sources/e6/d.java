package e6;

import W5.AbstractC0117y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class d extends i implements a {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10183h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z7) {
        super(1, z7 ? 1 : 0);
        B0.d dVar;
        if (z7) {
            dVar = null;
        } else {
            dVar = e.f10184a;
        }
        this.owner = dVar;
    }

    public final boolean c() {
        if (Math.max(i.f10189g.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        r0 = r1.f10181r;
        r2 = r1.f10182s;
        r3.set(r2, r0);
        r1.f10180q.i(r5, new e6.b(r2, r1, 0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(D5.d r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = e6.i.f10189g
            int r1 = r0.get(r6)
            int r2 = r6.f10190a
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r6)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r6, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = e6.d.f10183h
            r4 = 1
            if (r1 > 0) goto L1e
            r1 = r4
            goto L2b
        L1e:
            int r5 = r1 + (-1)
            boolean r1 = r0.compareAndSet(r6, r1, r5)
            if (r1 == 0) goto L0
            r1 = 0
            r3.set(r6, r1)
            r1 = 0
        L2b:
            z5.l r5 = z5.C1530l.f16479a
            if (r1 == 0) goto L8d
            if (r1 == r4) goto L4c
            r7 = 2
            if (r1 == r7) goto L40
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L40:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This mutex is already locked by the specified owner: null"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L4c:
            D5.d r7 = w4.l0.x(r7)
            W5.g r7 = W5.AbstractC0117y.l(r7)
            e6.c r1 = new e6.c     // Catch: java.lang.Throwable -> L88
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L88
        L59:
            int r4 = r0.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L88
            if (r4 > r2) goto L59
            if (r4 <= 0) goto L74
            java.lang.Object r0 = r1.f10181r     // Catch: java.lang.Throwable -> L88
            e6.d r2 = r1.f10182s     // Catch: java.lang.Throwable -> L88
            r3.set(r2, r0)     // Catch: java.lang.Throwable -> L88
            e6.b r0 = new e6.b     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L88
            W5.g r1 = r1.f10180q     // Catch: java.lang.Throwable -> L88
            r1.i(r5, r0)     // Catch: java.lang.Throwable -> L88
            goto L7a
        L74:
            boolean r4 = r6.a(r1)     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L59
        L7a:
            java.lang.Object r7 = r7.v()
            E5.a r0 = E5.a.f612q
            if (r7 != r0) goto L83
            goto L84
        L83:
            r7 = r5
        L84:
            if (r7 != r0) goto L8d
            r5 = r7
            goto L8d
        L88:
            r0 = move-exception
            r7.D()
            throw r0
        L8d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.d.d(D5.d):java.lang.Object");
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10183h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            B0.d dVar = e.f10184a;
            if (obj2 != dVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, dVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        return "Mutex@" + AbstractC0117y.j(this) + "[isLocked=" + c() + ",owner=" + f10183h.get(this) + ']';
    }
}
