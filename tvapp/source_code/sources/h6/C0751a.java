package h6;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: h6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751a {

    /* renamed from: a  reason: collision with root package name */
    public final n f11119a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f11120b;

    /* renamed from: c  reason: collision with root package name */
    public final SSLSocketFactory f11121c;
    public final HostnameVerifier d;

    /* renamed from: e  reason: collision with root package name */
    public final C0758h f11122e;
    public final InterfaceC0752b f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f11123g;

    /* renamed from: h  reason: collision with root package name */
    public final t f11124h;

    /* renamed from: i  reason: collision with root package name */
    public final List f11125i;

    /* renamed from: j  reason: collision with root package name */
    public final List f11126j;

    public C0751a(String str, int i7, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0758h c0758h, InterfaceC0752b interfaceC0752b, List list, List list2, ProxySelector proxySelector) {
        String str2;
        M5.g.f(str, "uriHost");
        M5.g.f(nVar, "dns");
        M5.g.f(socketFactory, "socketFactory");
        M5.g.f(interfaceC0752b, "proxyAuthenticator");
        M5.g.f(list, "protocols");
        M5.g.f(list2, "connectionSpecs");
        M5.g.f(proxySelector, "proxySelector");
        this.f11119a = nVar;
        this.f11120b = socketFactory;
        this.f11121c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.f11122e = c0758h;
        this.f = interfaceC0752b;
        this.f11123g = proxySelector;
        s sVar = new s();
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        if (U5.n.W(str2, "http")) {
            sVar.f11199e = "http";
        } else if (U5.n.W(str2, "https")) {
            sVar.f11199e = "https";
        } else {
            throw new IllegalArgumentException(M5.g.k(str2, "unexpected scheme: "));
        }
        String H6 = h4.b.H(n.f(str, 0, 0, false, 7));
        if (H6 != null) {
            sVar.f11201h = H6;
            if (1 <= i7 && i7 < 65536) {
                sVar.f11198c = i7;
                this.f11124h = sVar.a();
                this.f11125i = i6.b.x(list);
                this.f11126j = i6.b.x(list2);
                return;
            }
            throw new IllegalArgumentException(M5.g.k(Integer.valueOf(i7), "unexpected port: ").toString());
        }
        throw new IllegalArgumentException(M5.g.k(str, "unexpected host: "));
    }

    public final boolean a(C0751a c0751a) {
        M5.g.f(c0751a, "that");
        if (M5.g.a(this.f11119a, c0751a.f11119a) && M5.g.a(this.f, c0751a.f) && M5.g.a(this.f11125i, c0751a.f11125i) && M5.g.a(this.f11126j, c0751a.f11126j) && M5.g.a(this.f11123g, c0751a.f11123g) && M5.g.a(null, null) && M5.g.a(this.f11121c, c0751a.f11121c) && M5.g.a(this.d, c0751a.d) && M5.g.a(this.f11122e, c0751a.f11122e) && this.f11124h.f11207e == c0751a.f11124h.f11207e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0751a) {
            C0751a c0751a = (C0751a) obj;
            if (M5.g.a(this.f11124h, c0751a.f11124h) && a(c0751a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = AbstractC0515y1.i(527, 31, this.f11124h.f11210i);
        int hashCode = this.f.hashCode();
        int hashCode2 = this.f11125i.hashCode();
        int hashCode3 = this.f11126j.hashCode();
        int hashCode4 = this.f11123g.hashCode();
        int hashCode5 = Objects.hashCode(this.f11121c);
        int hashCode6 = Objects.hashCode(this.d);
        return Objects.hashCode(this.f11122e) + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f11119a.hashCode() + i7) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        t tVar = this.f11124h;
        sb.append(tVar.d);
        sb.append(':');
        sb.append(tVar.f11207e);
        sb.append(", ");
        sb.append(M5.g.k(this.f11123g, "proxySelector="));
        sb.append('}');
        return sb.toString();
    }
}
