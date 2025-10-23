package l6;

import h6.C0759i;
import h6.C0760j;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import s3.C1154I;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f12299a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12300b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12301c;
    public final Object d;

    public b(List list) {
        M5.g.f(list, "connectionSpecs");
        this.d = list;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h6.k] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String[], java.io.Serializable] */
    public h6.l a(SSLSocket sSLSocket) {
        h6.l lVar;
        int i7;
        boolean z7;
        int i8 = this.f12299a;
        List list = (List) this.d;
        int size = list.size();
        while (true) {
            if (i8 < size) {
                int i9 = i8 + 1;
                lVar = (h6.l) list.get(i8);
                if (lVar.b(sSLSocket)) {
                    this.f12299a = i9;
                    break;
                }
                i8 = i9;
            } else {
                lVar = null;
                break;
            }
        }
        if (lVar != null) {
            int i10 = this.f12299a;
            int size2 = list.size();
            while (true) {
                i7 = 0;
                if (i10 < size2) {
                    int i11 = i10 + 1;
                    if (((h6.l) list.get(i10)).b(sSLSocket)) {
                        z7 = true;
                        break;
                    }
                    i10 = i11;
                } else {
                    z7 = false;
                    break;
                }
            }
            this.f12300b = z7;
            boolean z8 = this.f12301c;
            String[] strArr = lVar.f11173c;
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            if (strArr != null) {
                M5.g.e(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                enabledCipherSuites = i6.b.p(enabledCipherSuites, strArr, C0760j.f11151c);
            }
            ?? r62 = lVar.d;
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (r62 != 0) {
                M5.g.e(enabledProtocols, "sslSocket.enabledProtocols");
                enabledProtocols = i6.b.p(enabledProtocols, r62, C5.a.f425r);
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            M5.g.e(supportedCipherSuites, "supportedCipherSuites");
            C0759i c0759i = C0760j.f11151c;
            byte[] bArr = i6.b.f11390a;
            int length = supportedCipherSuites.length;
            while (true) {
                if (i7 < length) {
                    if (c0759i.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (z8 && i7 != -1) {
                M5.g.e(enabledCipherSuites, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i7];
                M5.g.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
                M5.g.e(copyOf, "copyOf(this, newSize)");
                enabledCipherSuites = (String[]) copyOf;
                enabledCipherSuites[enabledCipherSuites.length - 1] = str;
            }
            ?? obj = new Object();
            obj.f11167a = lVar.f11171a;
            obj.f11169c = strArr;
            obj.d = r62;
            obj.f11168b = lVar.f11172b;
            M5.g.e(enabledCipherSuites, "cipherSuitesIntersection");
            obj.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
            M5.g.e(enabledProtocols, "tlsVersionsIntersection");
            obj.f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
            h6.l a7 = obj.a();
            if (a7.c() != null) {
                sSLSocket.setEnabledProtocols(a7.d);
            }
            if (a7.a() != null) {
                sSLSocket.setEnabledCipherSuites(a7.f11173c);
            }
            return lVar;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f12301c);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        M5.g.c(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        M5.g.e(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public void b(Object obj, Object obj2, String str) {
        ((C1154I) this.d).K(this.f12299a, this.f12300b, this.f12301c, str, obj, obj2, null);
    }

    public void c(Object obj, String str) {
        ((C1154I) this.d).K(this.f12299a, this.f12300b, this.f12301c, str, obj, null, null);
    }

    public void d(String str) {
        ((C1154I) this.d).K(this.f12299a, this.f12300b, this.f12301c, str, null, null, null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((C1154I) this.d).K(this.f12299a, this.f12300b, this.f12301c, str, obj, obj2, obj3);
    }

    public b(C1154I c1154i, int i7, boolean z7, boolean z8) {
        this.d = c1154i;
        this.f12299a = i7;
        this.f12300b = z7;
        this.f12301c = z8;
    }
}
