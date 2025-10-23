package h6;

import java.net.InetSocketAddress;
import java.net.Proxy;
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public final C0751a f11109a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f11110b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f11111c;

    public J(C0751a c0751a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        M5.g.f(c0751a, "address");
        M5.g.f(inetSocketAddress, "socketAddress");
        this.f11109a = c0751a;
        this.f11110b = proxy;
        this.f11111c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J) {
            J j7 = (J) obj;
            if (M5.g.a(j7.f11109a, this.f11109a) && M5.g.a(j7.f11110b, this.f11110b) && M5.g.a(j7.f11111c, this.f11111c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11110b.hashCode();
        return this.f11111c.hashCode() + ((hashCode + ((this.f11109a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f11111c + '}';
    }
}
