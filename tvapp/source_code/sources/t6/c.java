package t6;

import A5.t;
import M5.g;
import U5.f;
import U5.n;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14601a = new Object();

    public static List a(X509Certificate x509Certificate, int i7) {
        Object obj;
        t tVar = t.f135q;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return tVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && g.a(list.get(0), Integer.valueOf(i7)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return tVar;
        }
    }

    public static boolean b(String str) {
        int i7;
        char c5;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j7 = 0;
                int i8 = 0;
                while (i8 < length2) {
                    char charAt = str.charAt(i8);
                    if (charAt < 128) {
                        j7++;
                    } else {
                        if (charAt < 2048) {
                            i7 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i9 = i8 + 1;
                            if (i9 < length2) {
                                c5 = str.charAt(i9);
                            } else {
                                c5 = 0;
                            }
                            if (charAt <= 56319 && c5 >= 56320 && c5 <= 57343) {
                                j7 += 4;
                                i8 += 2;
                            } else {
                                j7++;
                                i8 = i9;
                            }
                        } else {
                            i7 = 3;
                        }
                        j7 += i7;
                    }
                    i8++;
                }
                if (length != ((int) j7)) {
                    return false;
                }
                return true;
            }
            StringBuilder o7 = AbstractC0515y1.o(length2, "endIndex > string.length: ", " > ");
            o7.append(str.length());
            throw new IllegalArgumentException(o7.toString().toString());
        }
        throw new IllegalArgumentException(AbstractC1111a.n(length2, "endIndex < beginIndex: ", " < 0").toString());
    }

    public static boolean c(String str, X509Certificate x509Certificate) {
        String str2;
        int length;
        g.f(str, "host");
        g.f(x509Certificate, "certificate");
        byte[] bArr = i6.b.f11390a;
        U5.d dVar = i6.b.f;
        dVar.getClass();
        if (dVar.f3486q.matcher(str).matches()) {
            String H6 = h4.b.H(str);
            List<String> a7 = a(x509Certificate, 7);
            if (!(a7 instanceof Collection) || !a7.isEmpty()) {
                for (String str3 : a7) {
                    if (g.a(H6, h4.b.H(str3))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                g.e(locale, "US");
                str = str.toLowerCase(locale);
                g.e(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> a8 = a(x509Certificate, 2);
            if (!(a8 instanceof Collection) || !a8.isEmpty()) {
                for (String str4 : a8) {
                    if (str.length() != 0 && !n.b0(str, ".", false) && !n.V(str, "..", false) && str4 != null && str4.length() != 0 && !n.b0(str4, ".", false) && !n.V(str4, "..", false)) {
                        if (!n.V(str, ".", false)) {
                            str2 = g.k(".", str);
                        } else {
                            str2 = str;
                        }
                        if (!n.V(str4, ".", false)) {
                            str4 = g.k(".", str4);
                        }
                        if (b(str4)) {
                            Locale locale2 = Locale.US;
                            g.e(locale2, "US");
                            str4 = str4.toLowerCase(locale2);
                            g.e(str4, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!f.d0(str4, "*")) {
                            if (g.a(str2, str4)) {
                                return true;
                            }
                        } else if (n.b0(str4, "*.", false) && f.i0(str4, '*', 1, false, 4) == -1 && str2.length() >= str4.length() && !g.a("*.", str4)) {
                            String substring = str4.substring(1);
                            g.e(substring, "this as java.lang.String).substring(startIndex)");
                            if (n.V(str2, substring, false) && ((length = str2.length() - substring.length()) <= 0 || f.l0(str2, '.', length - 1, 4) == -1)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        g.f(str, "host");
        g.f(sSLSession, "session");
        if (b(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return c(str, (X509Certificate) certificate);
    }
}
