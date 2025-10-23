package p6;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
/* loaded from: classes.dex */
public final class h extends n {
    public static final boolean d;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f13178c;

    static {
        boolean z7 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z7 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        d = z7;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        M5.g.e(newProvider, "newProvider()");
        this.f13178c = newProvider;
    }

    @Override // p6.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        M5.g.f(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = m3.i.b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.d(sSLSocket, str, list);
    }

    @Override // p6.n
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p6.n
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f13178c);
        M5.g.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p6.n
    public final SSLSocketFactory m(X509TrustManager x509TrustManager) {
        SSLContext l7 = l();
        l7.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = l7.getSocketFactory();
        M5.g.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p6.n
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        M5.g.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    Conscrypt.setHostnameVerifier(x509TrustManager, g.f13177a);
                    return x509TrustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        M5.g.e(arrays, "toString(this)");
        throw new IllegalStateException(M5.g.k(arrays, "Unexpected default trust managers: ").toString());
    }
}
