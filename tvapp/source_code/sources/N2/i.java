package N2;

import H2.U;
import M2.l;
import Z2.AbstractC0156a;
import Z2.H;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public abstract class i implements M2.i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f2485a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f2486b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityQueue f2487c;
    public h d;

    /* renamed from: e  reason: collision with root package name */
    public long f2488e;
    public long f;

    public i() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f2485a.add(new i2.g(1));
        }
        this.f2486b = new ArrayDeque();
        for (int i8 = 0; i8 < 2; i8++) {
            ArrayDeque arrayDeque = this.f2486b;
            U u7 = new U(1, this);
            M2.d dVar = new M2.d();
            dVar.f2258w = u7;
            arrayDeque.add(dVar);
        }
        this.f2487c = new PriorityQueue();
    }

    @Override // M2.i
    public final void b(long j7) {
        this.f2488e = j7;
    }

    @Override // i2.d
    public final void c(l lVar) {
        boolean z7;
        if (lVar == this.d) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        h hVar = (h) lVar;
        if (hVar.d(Integer.MIN_VALUE)) {
            hVar.f();
            this.f2485a.add(hVar);
        } else {
            long j7 = this.f;
            this.f = 1 + j7;
            hVar.f2484A = j7;
            this.f2487c.add(hVar);
        }
        this.d = null;
    }

    @Override // i2.d
    public final Object e() {
        boolean z7;
        if (this.d == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        ArrayDeque arrayDeque = this.f2485a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.d = hVar;
        return hVar;
    }

    public abstract j f();

    @Override // i2.d
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.f2488e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f2487c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f2485a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) priorityQueue.poll();
            int i7 = H.f4603a;
            hVar.f();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.d;
        if (hVar2 != null) {
            hVar2.f();
            arrayDeque.add(hVar2);
            this.d = null;
        }
    }

    public abstract void g(h hVar);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        return null;
     */
    @Override // i2.d
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M2.d d() {
        /*
            r12 = this;
            java.util.ArrayDeque r0 = r12.f2486b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r12.f2487c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            N2.h r3 = (N2.h) r3
            int r4 = Z2.H.f4603a
            long r3 = r3.f11353v
            long r5 = r12.f2488e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            N2.h r1 = (N2.h) r1
            r3 = 4
            boolean r4 = r1.d(r3)
            java.util.ArrayDeque r5 = r12.f2485a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            M2.d r0 = (M2.d) r0
            r0.b(r3)
            r1.f()
            r5.add(r1)
            return r0
        L41:
            r12.g(r1)
            boolean r3 = r12.i()
            if (r3 == 0) goto L66
            N2.j r9 = r12.f()
            java.lang.Object r0 = r0.pollFirst()
            M2.d r0 = (M2.d) r0
            long r7 = r1.f11353v
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r0
            r6.g(r7, r9, r10)
            r1.f()
            r5.add(r1)
            return r0
        L66:
            r1.f()
            r5.add(r1)
            goto La
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.i.d():M2.d");
    }

    public abstract boolean i();

    @Override // i2.d
    public void a() {
    }
}
