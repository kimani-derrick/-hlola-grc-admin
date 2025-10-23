package p6;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import w4.l0;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static volatile n f13188a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f13189b;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
        if (java.lang.Integer.parseInt(r5) >= 9) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [p6.n] */
    static {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.n.<clinit>():void");
    }

    public static void i(int i7, String str, Throwable th) {
        Level level;
        M5.g.f(str, "message");
        if (i7 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f13189b.log(level, str, th);
    }

    public static /* synthetic */ void j(n nVar, String str, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 4;
        }
        nVar.getClass();
        i(i7, str, null);
    }

    public l0 b(X509TrustManager x509TrustManager) {
        return new t6.a(c(x509TrustManager));
    }

    public t6.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        M5.g.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new t6.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        M5.g.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i7) {
        M5.g.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i7);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f13189b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        M5.g.f(str, "hostname");
        return true;
    }

    public void k(Object obj, String str) {
        M5.g.f(str, "message");
        if (obj == null) {
            str = M5.g.k(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", str);
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        M5.g.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l7 = l();
            l7.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = l7.getSocketFactory();
            M5.g.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e3) {
            throw new AssertionError(M5.g.k(e3, "No System TLS: "), e3);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        M5.g.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        M5.g.e(arrays, "toString(this)");
        throw new IllegalStateException(M5.g.k(arrays, "Unexpected default trust managers: ").toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
