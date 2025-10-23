package b6;

import W5.N;
import W5.O;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public class x {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7219b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    public N[] f7220a;

    public final void a(N n) {
        n.c((O) this);
        N[] nArr = this.f7220a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7219b;
        if (nArr == null) {
            nArr = new N[4];
            this.f7220a = nArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= nArr.length) {
            Object[] copyOf = Arrays.copyOf(nArr, atomicIntegerFieldUpdater.get(this) * 2);
            M5.g.e(copyOf, "copyOf(this, newSize)");
            nArr = (N[]) copyOf;
            this.f7220a = nArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        nArr[i7] = n;
        n.f3955r = i7;
        e(i7);
    }

    public final N b() {
        N n;
        synchronized (this) {
            N[] nArr = this.f7220a;
            if (nArr != null) {
                n = nArr[0];
            } else {
                n = null;
            }
        }
        return n;
    }

    public final void c(N n) {
        synchronized (this) {
            if (n.a() != null) {
                d(n.f3955r);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final W5.N d(int r9) {
        /*
            r8 = this;
            W5.N[] r0 = r8.f7220a
            M5.g.c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = b6.x.f7219b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.f(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            M5.g.c(r4)
            r5 = r0[r2]
            M5.g.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.f(r9, r2)
            r8.e(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            W5.N[] r5 = r8.f7220a
            M5.g.c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            M5.g.c(r6)
            r7 = r5[r4]
            M5.g.c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            M5.g.c(r4)
            r5 = r5[r2]
            M5.g.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.f(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            M5.g.c(r9)
            r2 = 0
            r9.c(r2)
            r9.f3955r = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.x.d(int):W5.N");
    }

    public final void e(int i7) {
        while (i7 > 0) {
            N[] nArr = this.f7220a;
            M5.g.c(nArr);
            int i8 = (i7 - 1) / 2;
            N n = nArr[i8];
            M5.g.c(n);
            N n7 = nArr[i7];
            M5.g.c(n7);
            if (n.compareTo(n7) <= 0) {
                return;
            }
            f(i7, i8);
            i7 = i8;
        }
    }

    public final void f(int i7, int i8) {
        N[] nArr = this.f7220a;
        M5.g.c(nArr);
        N n = nArr[i8];
        M5.g.c(n);
        N n7 = nArr[i7];
        M5.g.c(n7);
        nArr[i7] = n;
        nArr[i8] = n7;
        n.f3955r = i7;
        n7.f3955r = i8;
    }
}
