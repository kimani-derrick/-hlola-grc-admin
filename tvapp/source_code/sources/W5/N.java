package W5;
/* loaded from: classes.dex */
public abstract class N implements Runnable, Comparable, I {
    private volatile Object _heap;

    /* renamed from: q  reason: collision with root package name */
    public long f3954q;

    /* renamed from: r  reason: collision with root package name */
    public int f3955r = -1;

    public N(long j7) {
        this.f3954q = j7;
    }

    public final b6.x a() {
        Object obj = this._heap;
        if (obj instanceof b6.x) {
            return (b6.x) obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004c A[Catch: all -> 0x002e, TryCatch #2 {, blocks: (B:3:0x0001, B:8:0x000a, B:15:0x0021, B:37:0x0051, B:9:0x000b, B:11:0x0010, B:13:0x0014, B:23:0x002b, B:33:0x0043, B:35:0x004c, B:36:0x004e, B:26:0x0030, B:30:0x003a), top: B:44:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(long r9, W5.O r11, W5.P r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Object r0 = r8._heap     // Catch: java.lang.Throwable -> L25
            B0.d r1 = W5.AbstractC0117y.f4035b     // Catch: java.lang.Throwable -> L25
            if (r0 != r1) goto La
            monitor-exit(r8)
            r9 = 2
            return r9
        La:
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L25
            W5.N[] r0 = r11.f7220a     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e
            goto L14
        L13:
            r0 = 0
        L14:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = W5.P.f3957w     // Catch: java.lang.Throwable -> L2e
            r12.getClass()     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = W5.P.f3959y     // Catch: java.lang.Throwable -> L2e
            int r12 = r2.get(r12)     // Catch: java.lang.Throwable -> L2e
            if (r12 == 0) goto L27
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            r9 = 1
            return r9
        L25:
            r9 = move-exception
            goto L56
        L27:
            r2 = 0
            if (r0 != 0) goto L30
        L2b:
            r11.f3956c = r9     // Catch: java.lang.Throwable -> L2e
            goto L43
        L2e:
            r9 = move-exception
            goto L54
        L30:
            long r4 = r0.f3954q     // Catch: java.lang.Throwable -> L2e
            long r6 = r4 - r9
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 < 0) goto L39
            goto L3a
        L39:
            r9 = r4
        L3a:
            long r4 = r11.f3956c     // Catch: java.lang.Throwable -> L2e
            long r4 = r9 - r4
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 <= 0) goto L43
            goto L2b
        L43:
            long r9 = r8.f3954q     // Catch: java.lang.Throwable -> L2e
            long r4 = r11.f3956c     // Catch: java.lang.Throwable -> L2e
            long r9 = r9 - r4
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L4e
            r8.f3954q = r4     // Catch: java.lang.Throwable -> L2e
        L4e:
            r11.a(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            return r1
        L54:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L56:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.N.b(long, W5.O, W5.P):int");
    }

    public final void c(O o7) {
        if (this._heap != AbstractC0117y.f4035b) {
            this._heap = o7;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i7 = ((this.f3954q - ((N) obj).f3954q) > 0L ? 1 : ((this.f3954q - ((N) obj).f3954q) == 0L ? 0 : -1));
        if (i7 > 0) {
            return 1;
        }
        if (i7 < 0) {
            return -1;
        }
        return 0;
    }

    @Override // W5.I
    public final void d() {
        O o7;
        synchronized (this) {
            try {
                Object obj = this._heap;
                B0.d dVar = AbstractC0117y.f4035b;
                if (obj == dVar) {
                    return;
                }
                if (obj instanceof O) {
                    o7 = (O) obj;
                } else {
                    o7 = null;
                }
                if (o7 != null) {
                    o7.c(this);
                }
                this._heap = dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f3954q + ']';
    }
}
