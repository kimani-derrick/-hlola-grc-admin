package t6;

import M5.g;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f14600a;

    public b(X509Certificate... x509CertificateArr) {
        g.f(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i7 = 0;
        while (i7 < length) {
            X509Certificate x509Certificate = x509CertificateArr[i7];
            i7++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            g.e(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f14600a = linkedHashMap;
    }

    @Override // t6.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        g.f(x509Certificate, "cert");
        Set set = (Set) this.f14600a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof b) || !g.a(((b) obj).f14600a, this.f14600a))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14600a.hashCode();
    }
}
