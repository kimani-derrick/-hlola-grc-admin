package p6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public final class b implements t6.d {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f13172a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f13173b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f13172a = x509TrustManager;
        this.f13173b = method;
    }

    @Override // t6.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        M5.g.f(x509Certificate, "cert");
        try {
            Object invoke = this.f13173b.invoke(this.f13172a, x509Certificate);
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e3) {
            throw new AssertionError("unable to get issues and signature", e3);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (M5.g.a(this.f13172a, bVar.f13172a) && M5.g.a(this.f13173b, bVar.f13173b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13173b.hashCode() + (this.f13172a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f13172a + ", findByIssuerAndSignatureMethod=" + this.f13173b + ')';
    }
}
