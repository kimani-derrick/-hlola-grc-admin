package e1;

import a1.C0197a;
import f5.C0700a;
import h6.B;
import h6.E;
import h6.G;
import h6.J;
import h6.t;
import h6.u;
import h6.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import x5.C1467a;
/* renamed from: e1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575i implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9379a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9380b;

    public C0575i(C0197a c0197a) {
        M5.g.f(c0197a, "encryptedPreference");
        this.f9380b = c0197a;
    }

    public static int d(G g7, int i7) {
        String b7 = G.b(g7, "Retry-After");
        if (b7 == null) {
            return i7;
        }
        Pattern compile = Pattern.compile("\\d+");
        M5.g.e(compile, "compile(...)");
        if (compile.matcher(b7).matches()) {
            Integer valueOf = Integer.valueOf(b7);
            M5.g.e(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x035f, code lost:
        if ((r0 instanceof z5.C1525g) != false) goto L186;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x036d  */
    @Override // h6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h6.G a(m6.e r31) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0575i.a(m6.e):h6.G");
    }

    public B b(G g7, C0700a c0700a) {
        l6.k kVar;
        J j7;
        String b7;
        t a7;
        E e3 = null;
        if (c0700a == null || (kVar = (l6.k) c0700a.f10433g) == null) {
            j7 = null;
        } else {
            j7 = kVar.f12344b;
        }
        int i7 = g7.f11098t;
        String str = g7.f11095q.f11071b;
        boolean z7 = false;
        if (i7 != 307 && i7 != 308) {
            if (i7 != 401) {
                if (i7 != 421) {
                    if (i7 != 503) {
                        if (i7 != 407) {
                            if (i7 != 408) {
                                switch (i7) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else if (!((z) this.f9380b).f11269v) {
                                return null;
                            } else {
                                G g8 = g7.f11104z;
                                if ((g8 != null && g8.f11098t == 408) || d(g7, 0) > 0) {
                                    return null;
                                }
                                return g7.f11095q;
                            }
                        } else {
                            M5.g.c(j7);
                            if (j7.f11110b.type() == Proxy.Type.HTTP) {
                                return ((z) this.f9380b).f11251C.i(j7, g7);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        G g9 = g7.f11104z;
                        if ((g9 != null && g9.f11098t == 503) || d(g7, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return g7.f11095q;
                    }
                } else if (c0700a == null || !(!M5.g.a(((l6.e) c0700a.f10432e).f12314b.f11124h.d, ((l6.k) c0700a.f10433g).f12344b.f11109a.f11124h.d))) {
                    return null;
                } else {
                    l6.k kVar2 = (l6.k) c0700a.f10433g;
                    synchronized (kVar2) {
                        kVar2.f12351k = true;
                    }
                    return g7.f11095q;
                }
            } else {
                return ((z) this.f9380b).f11270w.i(j7, g7);
            }
        }
        z zVar = (z) this.f9380b;
        if (!zVar.f11271x || (b7 = G.b(g7, "Location")) == null) {
            return null;
        }
        B b8 = g7.f11095q;
        t tVar = b8.f11070a;
        tVar.getClass();
        h6.s f = tVar.f(b7);
        if (f == null) {
            a7 = null;
        } else {
            a7 = f.a();
        }
        if (a7 == null) {
            return null;
        }
        if (!M5.g.a(a7.f11204a, b8.f11070a.f11204a) && !zVar.f11272y) {
            return null;
        }
        H.e b9 = b8.b();
        if (p6.l.E(str)) {
            boolean a8 = M5.g.a(str, "PROPFIND");
            int i8 = g7.f11098t;
            if (a8 || i8 == 308 || i8 == 307) {
                z7 = true;
            }
            if ((true ^ M5.g.a(str, "PROPFIND")) && i8 != 308 && i8 != 307) {
                b9.A("GET", null);
            } else {
                if (z7) {
                    e3 = b8.d;
                }
                b9.A(str, e3);
            }
            if (!z7) {
                b9.B("Transfer-Encoding");
                b9.B("Content-Length");
                b9.B("Content-Type");
            }
        }
        if (!i6.b.a(b8.f11070a, a7)) {
            b9.B("Authorization");
        }
        b9.f778s = a7;
        return b9.q();
    }

    public boolean c(IOException iOException, l6.i iVar, B b7, boolean z7) {
        h6.s sVar;
        l6.k kVar;
        if (!((z) this.f9380b).f11269v) {
            return false;
        }
        if ((z7 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z7))) {
            return false;
        }
        l6.e eVar = iVar.f12341y;
        M5.g.c(eVar);
        int i7 = eVar.f12317g;
        if (i7 != 0 || eVar.f12318h != 0 || eVar.f12319i != 0) {
            if (eVar.f12320j == null) {
                J j7 = null;
                if (i7 <= 1 && eVar.f12318h <= 1 && eVar.f12319i <= 0 && (kVar = eVar.f12315c.f12342z) != null) {
                    synchronized (kVar) {
                        if (kVar.f12352l == 0 && i6.b.a(kVar.f12344b.f11109a.f11124h, eVar.f12314b.f11124h)) {
                            j7 = kVar.f12344b;
                        }
                    }
                }
                if (j7 != null) {
                    eVar.f12320j = j7;
                } else {
                    l6.n nVar = eVar.f12316e;
                    if ((nVar != null && nVar.c()) || (sVar = eVar.f) == null || sVar.c()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public C0575i(h6.n nVar) {
        M5.g.f(nVar, "cookieJar");
        this.f9380b = nVar;
    }

    public C0575i(z zVar) {
        M5.g.f(zVar, "client");
        this.f9380b = zVar;
    }

    public C0575i(C1467a c1467a) {
        this.f9380b = c1467a;
    }
}
