package h6;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import z5.C1527i;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final K f11191a;

    /* renamed from: b  reason: collision with root package name */
    public final C0760j f11192b;

    /* renamed from: c  reason: collision with root package name */
    public final List f11193c;
    public final C1527i d;

    public p(K k5, C0760j c0760j, List list, L5.a aVar) {
        M5.g.f(k5, "tlsVersion");
        M5.g.f(c0760j, "cipherSuite");
        M5.g.f(list, "localCertificates");
        this.f11191a = k5;
        this.f11192b = c0760j;
        this.f11193c = list;
        this.d = new C1527i(new A1.j(aVar, 7));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.f11191a == this.f11191a && M5.g.a(pVar.f11192b, this.f11192b) && M5.g.a(pVar.a(), a()) && M5.g.a(pVar.f11193c, this.f11193c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11192b.hashCode();
        int hashCode2 = a().hashCode();
        return this.f11193c.hashCode() + ((hashCode2 + ((hashCode + ((this.f11191a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a7 = a();
        ArrayList arrayList = new ArrayList(A5.m.P(a7));
        for (Certificate certificate : a7) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                M5.g.e(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f11191a);
        sb.append(" cipherSuite=");
        sb.append(this.f11192b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f11193c;
        ArrayList arrayList2 = new ArrayList(A5.m.P(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                M5.g.e(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
