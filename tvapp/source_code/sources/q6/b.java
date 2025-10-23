package q6;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import w4.l0;
/* loaded from: classes.dex */
public final class b extends l0 {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f13396a;

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManagerExtensions f13397b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f13396a = x509TrustManager;
        this.f13397b = x509TrustManagerExtensions;
    }

    @Override // w4.l0
    public final List d(String str, List list) {
        M5.g.f(list, "chain");
        M5.g.f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f13397b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                M5.g.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && ((b) obj).f13396a == this.f13396a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13396a);
    }
}
