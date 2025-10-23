package M2;

import Z2.AbstractC0156a;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public abstract class g implements i, i2.d {

    /* renamed from: a  reason: collision with root package name */
    public final c3.c f2266a;
    public final i2.h[] f;

    /* renamed from: h  reason: collision with root package name */
    public int f2271h;

    /* renamed from: i  reason: collision with root package name */
    public i2.g f2272i;

    /* renamed from: j  reason: collision with root package name */
    public j f2273j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2274k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2275l;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2267b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f2268c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final i2.g[] f2269e = new l[2];

    /* renamed from: g  reason: collision with root package name */
    public int f2270g = 2;

    public g() {
        d[] dVarArr = new d[2];
        int i7 = 0;
        while (true) {
            if (i7 >= this.f2270g) {
                break;
            }
            this.f2269e[i7] = new i2.g(1);
            i7++;
        }
        this.f = dVarArr;
        this.f2271h = 2;
        for (int i8 = 0; i8 < this.f2271h; i8++) {
            this.f[i8] = new d(this, 1);
        }
        c3.c cVar = new c3.c(this);
        this.f2266a = cVar;
        cVar.start();
        int i9 = this.f2270g;
        i2.g[] gVarArr = this.f2269e;
        AbstractC0156a.k(i9 == gVarArr.length);
        for (i2.g gVar : gVarArr) {
            gVar.i(1024);
        }
    }

    @Override // i2.d
    public final void a() {
        synchronized (this.f2267b) {
            this.f2275l = true;
            this.f2267b.notify();
        }
        try {
            this.f2266a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // i2.d
    public final void c(l lVar) {
        boolean z7;
        synchronized (this.f2267b) {
            try {
                j jVar = this.f2273j;
                if (jVar == null) {
                    if (lVar == this.f2272i) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    AbstractC0156a.f(z7);
                    this.f2268c.addLast(lVar);
                    if (!this.f2268c.isEmpty() && this.f2271h > 0) {
                        this.f2267b.notify();
                    }
                    this.f2272i = null;
                } else {
                    throw jVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i2.d
    public final Object d() {
        synchronized (this.f2267b) {
            try {
                j jVar = this.f2273j;
                if (jVar == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (i2.h) this.d.removeFirst();
                }
                throw jVar;
            } finally {
            }
        }
    }

    @Override // i2.d
    public final Object e() {
        boolean z7;
        i2.g gVar;
        synchronized (this.f2267b) {
            try {
                j jVar = this.f2273j;
                if (jVar == null) {
                    if (this.f2272i == null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    AbstractC0156a.k(z7);
                    int i7 = this.f2270g;
                    if (i7 == 0) {
                        gVar = null;
                    } else {
                        i2.g[] gVarArr = this.f2269e;
                        int i8 = i7 - 1;
                        this.f2270g = i8;
                        gVar = gVarArr[i8];
                    }
                    this.f2272i = gVar;
                } else {
                    throw jVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public abstract h f(int i7, boolean z7, byte[] bArr);

    @Override // i2.d
    public final void flush() {
        synchronized (this.f2267b) {
            try {
                this.f2274k = true;
                i2.g gVar = this.f2272i;
                if (gVar != null) {
                    gVar.f();
                    int i7 = this.f2270g;
                    this.f2270g = i7 + 1;
                    this.f2269e[i7] = gVar;
                    this.f2272i = null;
                }
                while (!this.f2268c.isEmpty()) {
                    i2.g gVar2 = (i2.g) this.f2268c.removeFirst();
                    gVar2.f();
                    int i8 = this.f2270g;
                    this.f2270g = i8 + 1;
                    this.f2269e[i8] = gVar2;
                }
                while (!this.d.isEmpty()) {
                    ((i2.h) this.d.removeFirst()).f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final j g(i2.g gVar, i2.h hVar, boolean z7) {
        l lVar = (l) gVar;
        d dVar = (d) hVar;
        try {
            ByteBuffer byteBuffer = lVar.f11351t;
            byteBuffer.getClass();
            dVar.g(lVar.f11353v, f(byteBuffer.limit(), z7, byteBuffer.array()), lVar.f2277z);
            dVar.f11331r &= Integer.MAX_VALUE;
            return null;
        } catch (j e3) {
            return e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f2267b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.f2275l     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1d
            java.util.ArrayDeque r1 = r8.f2268c     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L14
            int r1 = r8.f2271h     // Catch: java.lang.Throwable -> L1a
            if (r1 <= 0) goto L14
            goto L1d
        L14:
            java.lang.Object r1 = r8.f2267b     // Catch: java.lang.Throwable -> L1a
            r1.wait()     // Catch: java.lang.Throwable -> L1a
            goto L3
        L1a:
            r1 = move-exception
            goto Laa
        L1d:
            boolean r1 = r8.f2275l     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            if (r1 == 0) goto L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r2
        L24:
            java.util.ArrayDeque r1 = r8.f2268c     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L1a
            i2.g r1 = (i2.g) r1     // Catch: java.lang.Throwable -> L1a
            i2.h[] r3 = r8.f     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.f2271h     // Catch: java.lang.Throwable -> L1a
            r5 = 1
            int r4 = r4 - r5
            r8.f2271h = r4     // Catch: java.lang.Throwable -> L1a
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r8.f2274k     // Catch: java.lang.Throwable -> L1a
            r8.f2274k = r2     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r0 = 4
            boolean r6 = r1.d(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L48
            r3.b(r0)
            goto L80
        L48:
            boolean r0 = r1.d(r7)
            if (r0 == 0) goto L51
            r3.b(r7)
        L51:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.d(r0)
            if (r6 == 0) goto L5c
            r3.b(r0)
        L5c:
            M2.j r0 = r8.g(r1, r3, r4)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.RuntimeException -> L6b
            goto L74
        L61:
            r0 = move-exception
            M2.j r4 = new M2.j
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
        L69:
            r0 = r4
            goto L74
        L6b:
            r0 = move-exception
            M2.j r4 = new M2.j
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
            goto L69
        L74:
            if (r0 == 0) goto L80
            java.lang.Object r4 = r8.f2267b
            monitor-enter(r4)
            r8.f2273j = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            return r2
        L7d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r0
        L80:
            java.lang.Object r2 = r8.f2267b
            monitor-enter(r2)
            boolean r0 = r8.f2274k     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L8d
        L87:
            r3.f()     // Catch: java.lang.Throwable -> L8b
            goto L99
        L8b:
            r0 = move-exception
            goto La8
        L8d:
            boolean r0 = r3.d(r7)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L94
            goto L87
        L94:
            java.util.ArrayDeque r0 = r8.d     // Catch: java.lang.Throwable -> L8b
            r0.addLast(r3)     // Catch: java.lang.Throwable -> L8b
        L99:
            r1.f()     // Catch: java.lang.Throwable -> L8b
            int r0 = r8.f2270g     // Catch: java.lang.Throwable -> L8b
            int r3 = r0 + 1
            r8.f2270g = r3     // Catch: java.lang.Throwable -> L8b
            i2.g[] r3 = r8.f2269e     // Catch: java.lang.Throwable -> L8b
            r3[r0] = r1     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            return r5
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            throw r0
        Laa:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.g.h():boolean");
    }

    @Override // M2.i
    public final void b(long j7) {
    }
}
