package o6;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import v6.InterfaceC1342g;
import v6.InterfaceC1343h;
/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: R  reason: collision with root package name */
    public static final E f13038R;

    /* renamed from: A  reason: collision with root package name */
    public final k6.c f13039A;

    /* renamed from: B  reason: collision with root package name */
    public final D f13040B;

    /* renamed from: C  reason: collision with root package name */
    public long f13041C;

    /* renamed from: D  reason: collision with root package name */
    public long f13042D;

    /* renamed from: E  reason: collision with root package name */
    public long f13043E;
    public long F;

    /* renamed from: G  reason: collision with root package name */
    public long f13044G;

    /* renamed from: H  reason: collision with root package name */
    public final E f13045H;

    /* renamed from: I  reason: collision with root package name */
    public E f13046I;

    /* renamed from: J  reason: collision with root package name */
    public long f13047J;

    /* renamed from: K  reason: collision with root package name */
    public long f13048K;

    /* renamed from: L  reason: collision with root package name */
    public long f13049L;

    /* renamed from: M  reason: collision with root package name */
    public long f13050M;

    /* renamed from: N  reason: collision with root package name */
    public final Socket f13051N;

    /* renamed from: O  reason: collision with root package name */
    public final B f13052O;

    /* renamed from: P  reason: collision with root package name */
    public final m f13053P;

    /* renamed from: Q  reason: collision with root package name */
    public final LinkedHashSet f13054Q;

    /* renamed from: r  reason: collision with root package name */
    public final i f13056r;

    /* renamed from: t  reason: collision with root package name */
    public final String f13058t;

    /* renamed from: u  reason: collision with root package name */
    public int f13059u;

    /* renamed from: v  reason: collision with root package name */
    public int f13060v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f13061w;

    /* renamed from: x  reason: collision with root package name */
    public final k6.d f13062x;

    /* renamed from: y  reason: collision with root package name */
    public final k6.c f13063y;

    /* renamed from: z  reason: collision with root package name */
    public final k6.c f13064z;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f13055q = true;

    /* renamed from: s  reason: collision with root package name */
    public final LinkedHashMap f13057s = new LinkedHashMap();

    static {
        E e3 = new E();
        e3.c(7, 65535);
        e3.c(5, 16384);
        f13038R = e3;
    }

    public s(O4.a aVar) {
        this.f13056r = (i) aVar.f2721g;
        String str = (String) aVar.f2718b;
        if (str != null) {
            this.f13058t = str;
            this.f13060v = 3;
            k6.d dVar = (k6.d) aVar.f2719c;
            this.f13062x = dVar;
            k6.c f = dVar.f();
            this.f13063y = f;
            this.f13064z = dVar.f();
            this.f13039A = dVar.f();
            this.f13040B = D.f12981a;
            E e3 = new E();
            e3.c(7, 16777216);
            this.f13045H = e3;
            E e7 = f13038R;
            this.f13046I = e7;
            this.f13050M = e7.a();
            Socket socket = (Socket) aVar.d;
            if (socket != null) {
                this.f13051N = socket;
                InterfaceC1342g interfaceC1342g = (InterfaceC1342g) aVar.f;
                if (interfaceC1342g != null) {
                    this.f13052O = new B(interfaceC1342g, true);
                    InterfaceC1343h interfaceC1343h = (InterfaceC1343h) aVar.f2720e;
                    if (interfaceC1343h != null) {
                        this.f13053P = new m(this, new w(interfaceC1343h, true));
                        this.f13054Q = new LinkedHashSet();
                        int i7 = aVar.f2717a;
                        if (i7 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i7);
                            f.c(new q(M5.g.k(" ping", str), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    M5.g.l("source");
                    throw null;
                }
                M5.g.l("sink");
                throw null;
            }
            M5.g.l("socket");
            throw null;
        }
        M5.g.l("connectionName");
        throw null;
    }

    public final void O(long j7, int i7) {
        this.f13063y.c(new r(this.f13058t + '[' + i7 + "] windowUpdate", this, i7, j7), 0L);
    }

    public final void a(EnumC1073b enumC1073b, EnumC1073b enumC1073b2, IOException iOException) {
        int i7;
        Object[] objArr;
        byte[] bArr = i6.b.f11390a;
        try {
            n(enumC1073b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f13057s.isEmpty()) {
                objArr = this.f13057s.values().toArray(new A[0]);
                if (objArr != null) {
                    this.f13057s.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            } else {
                objArr = null;
            }
        }
        A[] aArr = (A[]) objArr;
        if (aArr != null) {
            for (A a7 : aArr) {
                try {
                    a7.c(enumC1073b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f13052O.close();
        } catch (IOException unused3) {
        }
        try {
            this.f13051N.close();
        } catch (IOException unused4) {
        }
        this.f13063y.e();
        this.f13064z.e();
        this.f13039A.e();
    }

    public final void b(IOException iOException) {
        EnumC1073b enumC1073b = EnumC1073b.f12986s;
        a(enumC1073b, enumC1073b, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC1073b.f12985r, EnumC1073b.f12990w, null);
    }

    public final synchronized A f(int i7) {
        return (A) this.f13057s.get(Integer.valueOf(i7));
    }

    public final void flush() {
        this.f13052O.flush();
    }

    public final synchronized boolean h(long j7) {
        if (this.f13061w) {
            return false;
        }
        if (this.F < this.f13043E) {
            if (j7 >= this.f13044G) {
                return false;
            }
        }
        return true;
    }

    public final synchronized A j(int i7) {
        A a7;
        a7 = (A) this.f13057s.remove(Integer.valueOf(i7));
        notifyAll();
        return a7;
    }

    public final void n(EnumC1073b enumC1073b) {
        synchronized (this.f13052O) {
            synchronized (this) {
                if (this.f13061w) {
                    return;
                }
                this.f13061w = true;
                this.f13052O.h(this.f13059u, enumC1073b, i6.b.f11390a);
            }
        }
    }

    public final synchronized void r(long j7) {
        long j8 = this.f13047J + j7;
        this.f13047J = j8;
        long j9 = j8 - this.f13048K;
        if (j9 >= this.f13045H.a() / 2) {
            O(j9, 0);
            this.f13048K += j9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f13052O.f12975t);
        r6 = r2;
        r8.f13049L += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(int r9, boolean r10, v6.C1341f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            o6.B r12 = r8.f13052O
            r12.b(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f13049L     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f13050M     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f13057s     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            o6.B r4 = r8.f13052O     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f12975t     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f13049L     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f13049L = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            o6.B r4 = r8.f13052O
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.b(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.s.x(int, boolean, v6.f, long):void");
    }

    public final void y(int i7, EnumC1073b enumC1073b) {
        this.f13063y.c(new p(this.f13058t + '[' + i7 + "] writeSynReset", this, i7, enumC1073b, 1), 0L);
    }
}
