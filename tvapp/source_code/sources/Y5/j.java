package Y5;

import b6.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public final class j extends t {

    /* renamed from: u  reason: collision with root package name */
    public final b f4535u;

    /* renamed from: v  reason: collision with root package name */
    public final AtomicReferenceArray f4536v;

    public j(long j7, j jVar, b bVar, int i7) {
        super(j7, jVar, i7);
        this.f4535u = bVar;
        this.f4536v = new AtomicReferenceArray(d.f4516b * 2);
    }

    @Override // b6.t
    public final int f() {
        return d.f4516b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        if (r1 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        M5.g.c(r5);
        r7 = r5.f4513r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
        r7 = b6.a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
        W5.AbstractC0117y.m(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    @Override // b6.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7, D5.i r8) {
        /*
            r6 = this;
            int r0 = Y5.d.f4516b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f4536v
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof W5.A0
            r4 = 0
            Y5.b r5 = r6.f4535u
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof Y5.r
            if (r3 == 0) goto L22
            goto L71
        L22:
            B0.d r3 = Y5.d.f4522j
            if (r2 == r3) goto L5b
            B0.d r3 = Y5.d.f4523k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            B0.d r3 = Y5.d.f4519g
            if (r2 == r3) goto L12
            B0.d r3 = Y5.d.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            B0.d r7 = Y5.d.f4521i
            if (r2 == r7) goto L5a
            B0.d r7 = Y5.d.d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            B0.d r7 = Y5.d.f4524l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r4)
            if (r1 == 0) goto L70
            M5.g.c(r5)
            L5.l r7 = r5.f4513r
            if (r7 == 0) goto L70
            F0.c r7 = b6.a.a(r7, r0, r4)
            if (r7 == 0) goto L70
            W5.AbstractC0117y.m(r8, r7)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            B0.d r3 = Y5.d.f4522j
            goto L78
        L76:
            B0.d r3 = Y5.d.f4523k
        L78:
            boolean r2 = r6.j(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r4)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            M5.g.c(r5)
            L5.l r7 = r5.f4513r
            if (r7 == 0) goto L98
            F0.c r7 = b6.a.a(r7, r0, r4)
            if (r7 == 0) goto L98
            W5.AbstractC0117y.m(r8, r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.j.g(int, D5.i):void");
    }

    public final boolean j(Object obj, int i7, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f4536v;
        int i8 = (i7 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i7) {
        return this.f4536v.get((i7 * 2) + 1);
    }

    public final void l(int i7, boolean z7) {
        if (z7) {
            b bVar = this.f4535u;
            M5.g.c(bVar);
            bVar.F((this.f7212s * d.f4516b) + i7);
        }
        h();
    }

    public final void m(int i7, Object obj) {
        this.f4536v.lazySet(i7 * 2, obj);
    }

    public final void n(int i7, B0.d dVar) {
        this.f4536v.set((i7 * 2) + 1, dVar);
    }
}
