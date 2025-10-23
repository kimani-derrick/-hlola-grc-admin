package h6;

import a.AbstractC0189a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: e  reason: collision with root package name */
    public static final l f11170e;
    public static final l f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11171a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11172b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f11173c;
    public final String[] d;

    static {
        C0760j c0760j = C0760j.f11163r;
        C0760j c0760j2 = C0760j.f11164s;
        C0760j c0760j3 = C0760j.f11165t;
        C0760j c0760j4 = C0760j.f11158l;
        C0760j c0760j5 = C0760j.n;
        C0760j c0760j6 = C0760j.f11159m;
        C0760j c0760j7 = C0760j.f11160o;
        C0760j c0760j8 = C0760j.f11162q;
        C0760j c0760j9 = C0760j.f11161p;
        C0760j[] c0760jArr = {c0760j, c0760j2, c0760j3, c0760j4, c0760j5, c0760j6, c0760j7, c0760j8, c0760j9, C0760j.f11156j, C0760j.f11157k, C0760j.f11154h, C0760j.f11155i, C0760j.f, C0760j.f11153g, C0760j.f11152e};
        C0761k c0761k = new C0761k();
        c0761k.b((C0760j[]) Arrays.copyOf(new C0760j[]{c0760j, c0760j2, c0760j3, c0760j4, c0760j5, c0760j6, c0760j7, c0760j8, c0760j9}, 9));
        K k5 = K.f11112r;
        K k7 = K.f11113s;
        c0761k.e(k5, k7);
        c0761k.d();
        c0761k.a();
        C0761k c0761k2 = new C0761k();
        c0761k2.b((C0760j[]) Arrays.copyOf(c0760jArr, 16));
        c0761k2.e(k5, k7);
        c0761k2.d();
        f11170e = c0761k2.a();
        C0761k c0761k3 = new C0761k();
        c0761k3.b((C0760j[]) Arrays.copyOf(c0760jArr, 16));
        c0761k3.e(k5, k7, K.f11114t, K.f11115u);
        c0761k3.d();
        c0761k3.a();
        f = new l(false, false, null, null);
    }

    public l(boolean z7, boolean z8, String[] strArr, String[] strArr2) {
        this.f11171a = z7;
        this.f11172b = z8;
        this.f11173c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f11173c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0760j.f11150b.c(str));
        }
        return A5.k.l0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f11171a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !i6.b.j(strArr, sSLSocket.getEnabledProtocols(), C5.a.f425r)) {
            return false;
        }
        String[] strArr2 = this.f11173c;
        if (strArr2 != null && !i6.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), C0760j.f11151c)) {
            return false;
        }
        return true;
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0189a.s(str));
        }
        return A5.k.l0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        boolean z7 = lVar.f11171a;
        boolean z8 = this.f11171a;
        if (z8 != z7) {
            return false;
        }
        if (z8 && (!Arrays.equals(this.f11173c, lVar.f11173c) || !Arrays.equals(this.d, lVar.d) || this.f11172b != lVar.f11172b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f11171a) {
            int i7 = 0;
            String[] strArr = this.f11173c;
            if (strArr == null) {
                hashCode = 0;
            } else {
                hashCode = Arrays.hashCode(strArr);
            }
            int i8 = (527 + hashCode) * 31;
            String[] strArr2 = this.d;
            if (strArr2 != null) {
                i7 = Arrays.hashCode(strArr2);
            }
            return ((i8 + i7) * 31) + (!this.f11172b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f11171a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(a(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(c(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f11172b + ')';
    }
}
