package o6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final int f12960a;

    /* renamed from: b  reason: collision with root package name */
    public final s f12961b;

    /* renamed from: c  reason: collision with root package name */
    public long f12962c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f12963e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f12964g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12965h;

    /* renamed from: i  reason: collision with root package name */
    public final y f12966i;

    /* renamed from: j  reason: collision with root package name */
    public final x f12967j;

    /* renamed from: k  reason: collision with root package name */
    public final z f12968k;

    /* renamed from: l  reason: collision with root package name */
    public final z f12969l;

    /* renamed from: m  reason: collision with root package name */
    public EnumC1073b f12970m;
    public IOException n;

    public A(int i7, s sVar, boolean z7, boolean z8, h6.r rVar) {
        this.f12960a = i7;
        this.f12961b = sVar;
        this.f = sVar.f13046I.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f12964g = arrayDeque;
        this.f12966i = new y(this, sVar.f13045H.a(), z8);
        this.f12967j = new x(this, z7);
        this.f12968k = new z(this);
        this.f12969l = new z(this);
        if (rVar != null) {
            if (!h()) {
                arrayDeque.add(rVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (h()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z7;
        boolean i7;
        byte[] bArr = i6.b.f11390a;
        synchronized (this) {
            y yVar = this.f12966i;
            if (!yVar.f13087r && yVar.f13090u) {
                x xVar = this.f12967j;
                if (xVar.f13082q || xVar.f13084s) {
                    z7 = true;
                    i7 = i();
                }
            }
            z7 = false;
            i7 = i();
        }
        if (z7) {
            c(EnumC1073b.f12990w, null);
        } else if (!i7) {
            this.f12961b.j(this.f12960a);
        }
    }

    public final void b() {
        x xVar = this.f12967j;
        if (!xVar.f13084s) {
            if (!xVar.f13082q) {
                if (this.f12970m != null) {
                    IOException iOException = this.n;
                    if (iOException == null) {
                        EnumC1073b enumC1073b = this.f12970m;
                        M5.g.c(enumC1073b);
                        throw new F(enumC1073b);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(EnumC1073b enumC1073b, IOException iOException) {
        if (!d(enumC1073b, iOException)) {
            return;
        }
        s sVar = this.f12961b;
        sVar.getClass();
        sVar.f13052O.r(this.f12960a, enumC1073b);
    }

    public final boolean d(EnumC1073b enumC1073b, IOException iOException) {
        byte[] bArr = i6.b.f11390a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f12966i.f13087r && this.f12967j.f13082q) {
                return false;
            }
            this.f12970m = enumC1073b;
            this.n = iOException;
            notifyAll();
            this.f12961b.j(this.f12960a);
            return true;
        }
    }

    public final void e(EnumC1073b enumC1073b) {
        if (!d(enumC1073b, null)) {
            return;
        }
        this.f12961b.y(this.f12960a, enumC1073b);
    }

    public final synchronized EnumC1073b f() {
        return this.f12970m;
    }

    public final x g() {
        synchronized (this) {
            if (!this.f12965h && !h()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f12967j;
    }

    public final boolean h() {
        boolean z7;
        if ((this.f12960a & 1) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f12961b.f13055q == z7) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.f12970m != null) {
            return false;
        }
        y yVar = this.f12966i;
        if (yVar.f13087r || yVar.f13090u) {
            x xVar = this.f12967j;
            if (xVar.f13082q || xVar.f13084s) {
                if (this.f12965h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:13:0x0021, B:14:0x0025, B:11:0x0018), top: B:21:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(h6.r r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            M5.g.f(r3, r0)
            byte[] r0 = i6.b.f11390a
            monitor-enter(r2)
            boolean r0 = r2.f12965h     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            if (r4 != 0) goto L10
            goto L18
        L10:
            o6.y r3 = r2.f12966i     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            goto L37
        L18:
            r2.f12965h = r1     // Catch: java.lang.Throwable -> L16
            java.util.ArrayDeque r0 = r2.f12964g     // Catch: java.lang.Throwable -> L16
            r0.add(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            if (r4 == 0) goto L25
            o6.y r3 = r2.f12966i     // Catch: java.lang.Throwable -> L16
            r3.f13087r = r1     // Catch: java.lang.Throwable -> L16
        L25:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L16
            r2.notifyAll()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            if (r3 != 0) goto L36
            o6.s r3 = r2.f12961b
            int r4 = r2.f12960a
            r3.j(r4)
        L36:
            return
        L37:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.A.j(h6.r, boolean):void");
    }

    public final synchronized void k(EnumC1073b enumC1073b) {
        if (this.f12970m == null) {
            this.f12970m = enumC1073b;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
