package l6;

import h6.A;
import h6.C0751a;
import h6.C0757g;
import h6.C0758h;
import h6.C0760j;
import h6.J;
import h6.p;
import h6.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k.C0852F;
import o6.B;
import o6.E;
import o6.EnumC1073b;
import o6.s;
import r0.AbstractC1111a;
import v6.y;
import v6.z;
import w4.l0;
/* loaded from: classes.dex */
public final class k extends o6.i {

    /* renamed from: b  reason: collision with root package name */
    public final J f12344b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f12345c;
    public Socket d;

    /* renamed from: e  reason: collision with root package name */
    public p f12346e;
    public A f;

    /* renamed from: g  reason: collision with root package name */
    public s f12347g;

    /* renamed from: h  reason: collision with root package name */
    public z f12348h;

    /* renamed from: i  reason: collision with root package name */
    public y f12349i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12350j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12351k;

    /* renamed from: l  reason: collision with root package name */
    public int f12352l;

    /* renamed from: m  reason: collision with root package name */
    public int f12353m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f12354o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f12355p;

    /* renamed from: q  reason: collision with root package name */
    public long f12356q;

    public k(l lVar, J j7) {
        M5.g.f(lVar, "connectionPool");
        M5.g.f(j7, "route");
        this.f12344b = j7;
        this.f12354o = 1;
        this.f12355p = new ArrayList();
        this.f12356q = Long.MAX_VALUE;
    }

    public static void d(h6.z zVar, J j7, IOException iOException) {
        M5.g.f(zVar, "client");
        M5.g.f(j7, "failedRoute");
        M5.g.f(iOException, "failure");
        if (j7.f11110b.type() != Proxy.Type.DIRECT) {
            C0751a c0751a = j7.f11109a;
            c0751a.f11123g.connectFailed(c0751a.f11124h.h(), j7.f11110b.address(), iOException);
        }
        C0852F c0852f = zVar.f11263P;
        synchronized (c0852f) {
            ((LinkedHashSet) c0852f.f11874r).add(j7);
        }
    }

    @Override // o6.i
    public final synchronized void a(s sVar, E e3) {
        int i7;
        M5.g.f(sVar, "connection");
        M5.g.f(e3, "settings");
        if ((e3.f12982a & 16) != 0) {
            i7 = e3.f12983b[4];
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.f12354o = i7;
    }

    @Override // o6.i
    public final void b(o6.A a7) {
        M5.g.f(a7, "stream");
        a7.c(EnumC1073b.f12989v, null);
    }

    public final void c(int i7, int i8, int i9, boolean z7, i iVar, h6.n nVar) {
        J j7;
        M5.g.f(iVar, "call");
        M5.g.f(nVar, "eventListener");
        if (this.f == null) {
            List list = this.f12344b.f11109a.f11126j;
            b bVar = new b(list);
            C0751a c0751a = this.f12344b.f11109a;
            if (c0751a.f11121c == null) {
                if (list.contains(h6.l.f)) {
                    String str = this.f12344b.f11109a.f11124h.d;
                    p6.n nVar2 = p6.n.f13188a;
                    if (!p6.n.f13188a.h(str)) {
                        throw new m(new UnknownServiceException(AbstractC1111a.r("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (c0751a.f11125i.contains(A.f11066v)) {
                throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            m mVar = null;
            do {
                try {
                    J j8 = this.f12344b;
                    if (j8.f11109a.f11121c != null && j8.f11110b.type() == Proxy.Type.HTTP) {
                        f(i7, i8, i9, iVar, nVar);
                        if (this.f12345c == null) {
                            j7 = this.f12344b;
                            if (j7.f11109a.f11121c == null && j7.f11110b.type() == Proxy.Type.HTTP && this.f12345c == null) {
                                throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f12356q = System.nanoTime();
                            return;
                        }
                    } else {
                        try {
                            e(i7, i8, iVar, nVar);
                        } catch (IOException e3) {
                            e = e3;
                            Socket socket = this.d;
                            if (socket != null) {
                                i6.b.e(socket);
                            }
                            Socket socket2 = this.f12345c;
                            if (socket2 != null) {
                                i6.b.e(socket2);
                            }
                            this.d = null;
                            this.f12345c = null;
                            this.f12348h = null;
                            this.f12349i = null;
                            this.f12346e = null;
                            this.f = null;
                            this.f12347g = null;
                            this.f12354o = 1;
                            J j9 = this.f12344b;
                            InetSocketAddress inetSocketAddress = j9.f11111c;
                            Proxy proxy = j9.f11110b;
                            M5.g.f(inetSocketAddress, "inetSocketAddress");
                            M5.g.f(proxy, "proxy");
                            if (mVar == null) {
                                mVar = new m(e);
                            } else {
                                android.support.v4.media.session.b.a(mVar.f12361q, e);
                                mVar.f12362r = e;
                            }
                            if (!z7) {
                                break;
                            }
                            bVar.f12301c = true;
                            if (!bVar.f12300b) {
                                break;
                            } else if (e instanceof ProtocolException) {
                                break;
                            } else if (e instanceof InterruptedIOException) {
                                break;
                            } else {
                                if (e instanceof SSLHandshakeException) {
                                    if (e.getCause() instanceof CertificateException) {
                                        break;
                                    }
                                }
                                if (e instanceof SSLPeerUnverifiedException) {
                                    break;
                                } else if (!(e instanceof SSLException)) {
                                }
                            }
                            throw mVar;
                        }
                    }
                    g(bVar, iVar, nVar);
                    J j10 = this.f12344b;
                    InetSocketAddress inetSocketAddress2 = j10.f11111c;
                    Proxy proxy2 = j10.f11110b;
                    M5.g.f(inetSocketAddress2, "inetSocketAddress");
                    M5.g.f(proxy2, "proxy");
                    j7 = this.f12344b;
                    if (j7.f11109a.f11121c == null) {
                    }
                    this.f12356q = System.nanoTime();
                    return;
                } catch (IOException e7) {
                    e = e7;
                }
            } while (!(e instanceof SSLException));
            throw mVar;
        }
        throw new IllegalStateException("already connected".toString());
    }

    public final void e(int i7, int i8, i iVar, h6.n nVar) {
        int i9;
        Socket createSocket;
        J j7 = this.f12344b;
        Proxy proxy = j7.f11110b;
        C0751a c0751a = j7.f11109a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i9 = -1;
        } else {
            i9 = j.f12343a[type.ordinal()];
        }
        if (i9 != 1 && i9 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = c0751a.f11120b.createSocket();
            M5.g.c(createSocket);
        }
        this.f12345c = createSocket;
        InetSocketAddress inetSocketAddress = this.f12344b.f11111c;
        nVar.getClass();
        M5.g.f(iVar, "call");
        M5.g.f(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i8);
        try {
            p6.n nVar2 = p6.n.f13188a;
            p6.n.f13188a.e(createSocket, this.f12344b.f11111c, i7);
            try {
                this.f12348h = p6.l.c(p6.l.N(createSocket));
                this.f12349i = p6.l.b(p6.l.L(createSocket));
            } catch (NullPointerException e3) {
                if (!M5.g.a(e3.getMessage(), "throw with null exception")) {
                    return;
                }
                throw new IOException(e3);
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException(M5.g.k(this.f12344b.f11111c, "Failed to connect to "));
            connectException.initCause(e7);
            throw connectException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0154, code lost:
        if (r10 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0157, code lost:
        r1 = r26.f12345c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0159, code lost:
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015d, code lost:
        i6.b.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0161, code lost:
        r26.f12345c = null;
        r26.f12349i = null;
        r26.f12348h = null;
        M5.g.f(r30, "call");
        M5.g.f(r4.f11111c, "inetSocketAddress");
        M5.g.f(r4.f11110b, "proxy");
        r6 = null;
        r9 = r20;
        r8 = true;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r27, int r28, int r29, l6.i r30, h6.n r31) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.k.f(int, int, int, l6.i, h6.n):void");
    }

    public final void g(b bVar, i iVar, h6.n nVar) {
        C0751a c0751a = this.f12344b.f11109a;
        SSLSocketFactory sSLSocketFactory = c0751a.f11121c;
        A a7 = A.f11063s;
        if (sSLSocketFactory == null) {
            List list = c0751a.f11125i;
            A a8 = A.f11066v;
            if (list.contains(a8)) {
                this.d = this.f12345c;
                this.f = a8;
                m();
                return;
            }
            this.d = this.f12345c;
            this.f = a7;
            return;
        }
        nVar.getClass();
        M5.g.f(iVar, "call");
        C0751a c0751a2 = this.f12344b.f11109a;
        SSLSocketFactory sSLSocketFactory2 = c0751a2.f11121c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            M5.g.c(sSLSocketFactory2);
            Socket socket = this.f12345c;
            t tVar = c0751a2.f11124h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, tVar.d, tVar.f11207e, true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    h6.l a9 = bVar.a(sSLSocket2);
                    if (a9.f11172b) {
                        p6.n nVar2 = p6.n.f13188a;
                        p6.n.f13188a.d(sSLSocket2, c0751a2.f11124h.d, c0751a2.f11125i);
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    M5.g.e(session, "sslSocketSession");
                    p o7 = m3.g.o(session);
                    HostnameVerifier hostnameVerifier = c0751a2.d;
                    M5.g.c(hostnameVerifier);
                    if (!hostnameVerifier.verify(c0751a2.f11124h.d, session)) {
                        List a10 = o7.a();
                        if (true ^ a10.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) a10.get(0);
                            StringBuilder sb = new StringBuilder("\n              |Hostname ");
                            sb.append(c0751a2.f11124h.d);
                            sb.append(" not verified:\n              |    certificate: ");
                            C0758h c0758h = C0758h.f11147c;
                            sb.append(h4.b.E(x509Certificate));
                            sb.append("\n              |    DN: ");
                            sb.append((Object) x509Certificate.getSubjectDN().getName());
                            sb.append("\n              |    subjectAltNames: ");
                            sb.append(A5.k.e0(t6.c.a(x509Certificate, 7), t6.c.a(x509Certificate, 2)));
                            sb.append("\n              ");
                            throw new SSLPeerUnverifiedException(U5.g.S(sb.toString()));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + c0751a2.f11124h.d + " not verified (no certificates)");
                    }
                    C0758h c0758h2 = c0751a2.f11122e;
                    M5.g.c(c0758h2);
                    this.f12346e = new p(o7.f11191a, o7.f11192b, o7.f11193c, new C0757g(c0758h2, o7, c0751a2, 1));
                    c0758h2.a(c0751a2.f11124h.d, new D0.h(10, this));
                    if (a9.f11172b) {
                        p6.n nVar3 = p6.n.f13188a;
                        str = p6.n.f13188a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.f12348h = p6.l.c(p6.l.N(sSLSocket2));
                    this.f12349i = p6.l.b(p6.l.L(sSLSocket2));
                    if (str != null) {
                        a7 = l0.r(str);
                    }
                    this.f = a7;
                    p6.n nVar4 = p6.n.f13188a;
                    p6.n.f13188a.a(sSLSocket2);
                    if (this.f == A.f11065u) {
                        m();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        p6.n nVar5 = p6.n.f13188a;
                        p6.n.f13188a.a(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        i6.b.e(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void h() {
        this.f12353m++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
        if (t6.c.c(r1, (java.security.cert.X509Certificate) r10.get(0)) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(h6.C0751a r9, java.util.List r10) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "address"
            M5.g.f(r9, r1)
            byte[] r1 = i6.b.f11390a
            java.util.ArrayList r1 = r8.f12355p
            int r1 = r1.size()
            int r2 = r8.f12354o
            if (r1 >= r2) goto Ld9
            boolean r1 = r8.f12350j
            if (r1 == 0) goto L18
            goto Ld9
        L18:
            h6.J r1 = r8.f12344b
            h6.a r2 = r1.f11109a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L23
            return r0
        L23:
            h6.t r2 = r9.f11124h
            java.lang.String r3 = r2.d
            h6.a r4 = r1.f11109a
            h6.t r5 = r4.f11124h
            java.lang.String r5 = r5.d
            boolean r3 = M5.g.a(r3, r5)
            r5 = 1
            if (r3 == 0) goto L35
            return r5
        L35:
            o6.s r3 = r8.f12347g
            if (r3 != 0) goto L3a
            return r0
        L3a:
            if (r10 == 0) goto Ld9
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r3 = r10 instanceof java.util.Collection
            if (r3 == 0) goto L4d
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4d
            goto Ld9
        L4d:
            java.util.Iterator r10 = r10.iterator()
        L51:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Ld9
            java.lang.Object r3 = r10.next()
            h6.J r3 = (h6.J) r3
            java.net.Proxy r6 = r3.f11110b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L51
            java.net.Proxy r6 = r1.f11110b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L51
            java.net.InetSocketAddress r3 = r3.f11111c
            java.net.InetSocketAddress r6 = r1.f11111c
            boolean r3 = M5.g.a(r6, r3)
            if (r3 == 0) goto L51
            t6.c r10 = t6.c.f14601a
            javax.net.ssl.HostnameVerifier r1 = r9.d
            if (r1 == r10) goto L80
            return r0
        L80:
            byte[] r10 = i6.b.f11390a
            h6.t r10 = r4.f11124h
            int r1 = r10.f11207e
            int r3 = r2.f11207e
            if (r3 == r1) goto L8b
            goto Ld9
        L8b:
            java.lang.String r10 = r10.d
            java.lang.String r1 = r2.d
            boolean r10 = M5.g.a(r1, r10)
            if (r10 == 0) goto L96
            goto Lb8
        L96:
            boolean r10 = r8.f12351k
            if (r10 != 0) goto Ld9
            h6.p r10 = r8.f12346e
            if (r10 == 0) goto Ld9
            java.util.List r10 = r10.a()
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto Ld9
            java.lang.Object r10 = r10.get(r0)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = t6.c.c(r1, r10)
            if (r10 == 0) goto Ld9
        Lb8:
            h6.h r9 = r9.f11122e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            M5.g.c(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            h6.p r10 = r8.f12346e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            M5.g.c(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            java.util.List r10 = r10.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            java.lang.String r2 = "hostname"
            M5.g.f(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            java.lang.String r2 = "peerCertificates"
            M5.g.f(r10, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            h6.g r2 = new h6.g     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            r2.<init>(r9, r10, r1, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            r9.a(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld9
            return r5
        Ld9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.k.i(h6.a, java.util.List):boolean");
    }

    public final boolean j(boolean z7) {
        long j7;
        byte[] bArr = i6.b.f11390a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f12345c;
        M5.g.c(socket);
        Socket socket2 = this.d;
        M5.g.c(socket2);
        z zVar = this.f12348h;
        M5.g.c(zVar);
        boolean z8 = false;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        s sVar = this.f12347g;
        if (sVar != null) {
            return sVar.h(nanoTime);
        }
        synchronized (this) {
            j7 = nanoTime - this.f12356q;
        }
        if (j7 < 10000000000L || !z7) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            socket2.setSoTimeout(1);
            boolean z9 = !zVar.M();
            socket2.setSoTimeout(soTimeout);
            z8 = z9;
            return z8;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return z8;
        }
    }

    public final m6.c k(h6.z zVar, m6.e eVar) {
        Socket socket = this.d;
        M5.g.c(socket);
        z zVar2 = this.f12348h;
        M5.g.c(zVar2);
        y yVar = this.f12349i;
        M5.g.c(yVar);
        s sVar = this.f12347g;
        if (sVar != null) {
            return new o6.t(zVar, this, eVar, sVar);
        }
        int i7 = eVar.f12451g;
        socket.setSoTimeout(i7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVar2.f15427q.d().g(i7, timeUnit);
        yVar.f15424q.d().g(eVar.f12452h, timeUnit);
        return new O4.a(zVar, this, zVar2, yVar);
    }

    public final synchronized void l() {
        this.f12350j = true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, O4.a] */
    public final void m() {
        int i7;
        int a7;
        Socket socket = this.d;
        M5.g.c(socket);
        z zVar = this.f12348h;
        M5.g.c(zVar);
        y yVar = this.f12349i;
        M5.g.c(yVar);
        socket.setSoTimeout(0);
        k6.d dVar = k6.d.f12220h;
        M5.g.f(dVar, "taskRunner");
        ?? obj = new Object();
        obj.f2719c = dVar;
        obj.f2721g = o6.i.f13017a;
        String str = this.f12344b.f11109a.f11124h.d;
        M5.g.f(str, "peerName");
        obj.d = socket;
        String str2 = i6.b.f11394g + ' ' + str;
        M5.g.f(str2, "<set-?>");
        obj.f2718b = str2;
        obj.f2720e = zVar;
        obj.f = yVar;
        obj.f2721g = this;
        obj.f2717a = 0;
        s sVar = new s(obj);
        this.f12347g = sVar;
        E e3 = s.f13038R;
        if ((e3.f12982a & 16) != 0) {
            i7 = e3.f12983b[4];
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.f12354o = i7;
        B b7 = sVar.f13052O;
        synchronized (b7) {
            try {
                if (!b7.f12976u) {
                    if (b7.f12973r) {
                        Logger logger = B.f12971w;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(i6.b.i(M5.g.k(o6.g.f13014a.e(), ">> CONNECTION "), new Object[0]));
                        }
                        b7.f12972q.i(o6.g.f13014a);
                        b7.f12972q.flush();
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sVar.f13052O.x(sVar.f13045H);
        if (sVar.f13045H.a() != 65535) {
            sVar.f13052O.y(a7 - 65535, 0);
        }
        dVar.f().c(new k6.b(sVar.f13058t, sVar.f13053P, 0), 0L);
    }

    public final String toString() {
        C0760j c0760j;
        StringBuilder sb = new StringBuilder("Connection{");
        J j7 = this.f12344b;
        sb.append(j7.f11109a.f11124h.d);
        sb.append(':');
        sb.append(j7.f11109a.f11124h.f11207e);
        sb.append(", proxy=");
        sb.append(j7.f11110b);
        sb.append(" hostAddress=");
        sb.append(j7.f11111c);
        sb.append(" cipherSuite=");
        p pVar = this.f12346e;
        Object obj = "none";
        if (pVar != null && (c0760j = pVar.f11192b) != null) {
            obj = c0760j;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
