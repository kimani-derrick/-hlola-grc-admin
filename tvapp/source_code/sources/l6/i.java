package l6;

import f5.C0700a;
import h6.B;
import h6.InterfaceC0755e;
import h6.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: A  reason: collision with root package name */
    public boolean f12326A;

    /* renamed from: B  reason: collision with root package name */
    public C0700a f12327B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f12328C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f12329D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f12330E;
    public volatile boolean F;

    /* renamed from: G  reason: collision with root package name */
    public volatile C0700a f12331G;

    /* renamed from: H  reason: collision with root package name */
    public volatile k f12332H;

    /* renamed from: q  reason: collision with root package name */
    public final z f12333q;

    /* renamed from: r  reason: collision with root package name */
    public final B f12334r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f12335s;

    /* renamed from: t  reason: collision with root package name */
    public final l f12336t;

    /* renamed from: u  reason: collision with root package name */
    public final h6.n f12337u;

    /* renamed from: v  reason: collision with root package name */
    public final h f12338v;

    /* renamed from: w  reason: collision with root package name */
    public final AtomicBoolean f12339w;

    /* renamed from: x  reason: collision with root package name */
    public Object f12340x;

    /* renamed from: y  reason: collision with root package name */
    public e f12341y;

    /* renamed from: z  reason: collision with root package name */
    public k f12342z;

    public i(z zVar, B b7, boolean z7) {
        M5.g.f(zVar, "client");
        M5.g.f(b7, "originalRequest");
        this.f12333q = zVar;
        this.f12334r = b7;
        this.f12335s = z7;
        this.f12336t = (l) zVar.f11265r.f4918q;
        h6.n nVar = (h6.n) zVar.f11268u.f981r;
        M5.g.f(nVar, "$this_asFactory");
        this.f12337u = nVar;
        h hVar = new h(this);
        hVar.g(zVar.f11259L, TimeUnit.MILLISECONDS);
        this.f12338v = hVar;
        this.f12339w = new AtomicBoolean();
        this.f12330E = true;
    }

    public static final String b(i iVar) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (iVar.F) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (iVar.f12335s) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(iVar.f12334r.f11070a.g());
        return sb.toString();
    }

    public final void c(k kVar) {
        byte[] bArr = i6.b.f11390a;
        if (this.f12342z == null) {
            this.f12342z = kVar;
            kVar.f12355p.add(new g(this, this.f12340x));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void cancel() {
        Socket socket;
        if (this.F) {
            return;
        }
        this.F = true;
        C0700a c0700a = this.f12331G;
        if (c0700a != null) {
            ((m6.c) c0700a.f).cancel();
        }
        k kVar = this.f12332H;
        if (kVar != null && (socket = kVar.f12345c) != null) {
            i6.b.e(socket);
        }
        this.f12337u.getClass();
    }

    public final Object clone() {
        return new i(this.f12333q, this.f12334r, this.f12335s);
    }

    public final IOException d(IOException iOException) {
        IOException interruptedIOException;
        h6.n nVar;
        Socket m7;
        byte[] bArr = i6.b.f11390a;
        k kVar = this.f12342z;
        if (kVar != null) {
            synchronized (kVar) {
                m7 = m();
            }
            if (this.f12342z == null) {
                if (m7 != null) {
                    i6.b.e(m7);
                }
                this.f12337u.getClass();
            } else if (m7 != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (this.f12326A || !this.f12338v.i()) {
            interruptedIOException = iOException;
        } else {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        }
        if (iOException != null) {
            nVar = this.f12337u;
            M5.g.c(interruptedIOException);
        } else {
            nVar = this.f12337u;
        }
        nVar.getClass();
        return interruptedIOException;
    }

    public final void e(InterfaceC0755e interfaceC0755e) {
        f fVar;
        if (this.f12339w.compareAndSet(false, true)) {
            p6.n nVar = p6.n.f13188a;
            this.f12340x = p6.n.f13188a.g();
            this.f12337u.getClass();
            C4.b bVar = this.f12333q.f11264q;
            f fVar2 = new f(this, interfaceC0755e);
            bVar.getClass();
            synchronized (bVar) {
                ((ArrayDeque) bVar.f422s).add(fVar2);
                if (!this.f12335s) {
                    String str = this.f12334r.f11070a.d;
                    Iterator it = ((ArrayDeque) bVar.f423t).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            fVar = (f) it.next();
                            if (M5.g.a(fVar.f12323s.f12334r.f11070a.d, str)) {
                                break;
                            }
                        } else {
                            Iterator it2 = ((ArrayDeque) bVar.f422s).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    fVar = (f) it2.next();
                                    if (M5.g.a(fVar.f12323s.f12334r.f11070a.d, str)) {
                                        break;
                                    }
                                } else {
                                    fVar = null;
                                    break;
                                }
                            }
                        }
                    }
                    if (fVar != null) {
                        fVar2.f12322r = fVar.f12322r;
                    }
                }
            }
            bVar.O();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void g(boolean z7) {
        C0700a c0700a;
        synchronized (this) {
            if (!this.f12330E) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z7 && (c0700a = this.f12331G) != null) {
            ((m6.c) c0700a.f).cancel();
            ((i) c0700a.f10431c).k(c0700a, true, true, null);
        }
        this.f12327B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h6.G i() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            h6.z r0 = r11.f12333q
            java.util.List r0 = r0.f11266s
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            A5.q.R(r0, r2)
            e1.i r0 = new e1.i
            h6.z r1 = r11.f12333q
            r0.<init>(r1)
            r2.add(r0)
            e1.i r0 = new e1.i
            h6.z r1 = r11.f12333q
            h6.n r1 = r1.f11273z
            r0.<init>(r1)
            r2.add(r0)
            j6.b r0 = new j6.b
            h6.z r1 = r11.f12333q
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            l6.a r0 = l6.a.f12298a
            r2.add(r0)
            boolean r0 = r11.f12335s
            if (r0 != 0) goto L43
            h6.z r0 = r11.f12333q
            java.util.List r0 = r0.f11267t
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            A5.q.R(r0, r2)
        L43:
            m6.a r0 = new m6.a
            boolean r1 = r11.f12335s
            r0.<init>(r1)
            r2.add(r0)
            m6.e r9 = new m6.e
            h6.B r5 = r11.f12334r
            h6.z r0 = r11.f12333q
            int r6 = r0.f11260M
            int r7 = r0.f11261N
            int r8 = r0.f11262O
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            h6.B r2 = r11.f12334r     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            h6.G r2 = r9.b(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            boolean r3 = r11.F     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            if (r3 != 0) goto L70
            r11.l(r0)
            return r2
        L70:
            i6.b.d(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            throw r2     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
        L7b:
            r2 = move-exception
            goto L93
        L7d:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.l(r1)     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto L92
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L8d
            throw r1     // Catch: java.lang.Throwable -> L8d
        L8d:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
            goto L93
        L92:
            throw r1     // Catch: java.lang.Throwable -> L8d
        L93:
            if (r1 != 0) goto L98
            r11.l(r0)
        L98:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.i.i():h6.G");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException k(f5.C0700a r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            M5.g.f(r2, r0)
            f5.a r0 = r1.f12331G
            boolean r2 = M5.g.a(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f12328C     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L41
        L19:
            if (r4 == 0) goto L43
            boolean r0 = r1.f12329D     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L43
        L1f:
            if (r3 == 0) goto L23
            r1.f12328C = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f12329D = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f12328C     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f12329D     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f12329D     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f12330E     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L44
        L41:
            monitor-exit(r1)
            throw r2
        L43:
            r3 = r2
        L44:
            monitor-exit(r1)
            if (r2 == 0) goto L52
            r2 = 0
            r1.f12331G = r2
            l6.k r2 = r1.f12342z
            if (r2 != 0) goto L4f
            goto L52
        L4f:
            r2.h()
        L52:
            if (r3 == 0) goto L59
            java.io.IOException r2 = r1.d(r5)
            return r2
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.i.k(f5.a, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException l(IOException iOException) {
        boolean z7;
        synchronized (this) {
            z7 = false;
            if (this.f12330E) {
                this.f12330E = false;
                if (!this.f12328C) {
                    if (!this.f12329D) {
                        z7 = true;
                    }
                }
            }
        }
        if (z7) {
            return d(iOException);
        }
        return iOException;
    }

    public final Socket m() {
        k kVar = this.f12342z;
        M5.g.c(kVar);
        byte[] bArr = i6.b.f11390a;
        ArrayList arrayList = kVar.f12355p;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (it.hasNext()) {
                if (M5.g.a(((Reference) it.next()).get(), this)) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 != -1) {
            arrayList.remove(i7);
            this.f12342z = null;
            if (arrayList.isEmpty()) {
                kVar.f12356q = System.nanoTime();
                l lVar = this.f12336t;
                lVar.getClass();
                byte[] bArr2 = i6.b.f11390a;
                boolean z7 = kVar.f12350j;
                k6.c cVar = lVar.f12359c;
                if (!z7 && lVar.f12357a != 0) {
                    cVar.c(lVar.d, 0L);
                } else {
                    kVar.f12350j = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f12360e;
                    concurrentLinkedQueue.remove(kVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    Socket socket = kVar.d;
                    M5.g.c(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
