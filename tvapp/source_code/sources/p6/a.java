package p6;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import w4.l0;
/* loaded from: classes.dex */
public final class a extends n {
    public static final boolean d;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f13171c;

    static {
        boolean z7;
        if (m3.i.e() && Build.VERSION.SDK_INT >= 29) {
            z7 = true;
        } else {
            z7 = false;
        }
        d = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        Object obj;
        if (m3.i.e() && Build.VERSION.SDK_INT >= 29) {
            obj = new Object();
        } else {
            obj = null;
        }
        ArrayList W = A5.j.W(new q6.l[]{obj, new q6.k(q6.e.f), new q6.k(q6.i.f13406a), new q6.k(q6.g.f13405a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = W.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((q6.l) next).c()) {
                arrayList.add(next);
            }
        }
        this.f13171c = arrayList;
    }

    @Override // p6.n
    public final l0 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        q6.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new q6.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar == null) {
            return new t6.a(c(x509TrustManager));
        }
        return bVar;
    }

    @Override // p6.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        M5.g.f(list, "protocols");
        Iterator it = this.f13171c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((q6.l) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        q6.l lVar = (q6.l) obj;
        if (lVar != null) {
            lVar.d(sSLSocket, str, list);
        }
    }

    @Override // p6.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f13171c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((q6.l) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        q6.l lVar = (q6.l) obj;
        if (lVar == null) {
            return null;
        }
        return lVar.b(sSLSocket);
    }

    @Override // p6.n
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        M5.g.f(str, "hostname");
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }
}
