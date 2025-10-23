package p6;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import w4.l0;
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f13174e;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f13175c;
    public final F5.f d;

    static {
        boolean z7 = false;
        if (m3.i.e() && Build.VERSION.SDK_INT < 30) {
            z7 = true;
        }
        f13174e = z7;
    }

    public c() {
        q6.e eVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(M5.g.k(".OpenSSLSocketImpl", "com.android.org.conscrypt"));
            Class.forName(M5.g.k(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt"));
            Class.forName(M5.g.k(".SSLParametersImpl", "com.android.org.conscrypt"));
            eVar = new q6.e(cls);
        } catch (Exception e3) {
            n.f13188a.getClass();
            n.i(5, "unable to load android socket classes", e3);
            eVar = null;
        }
        ArrayList W = A5.j.W(new q6.l[]{eVar, new q6.k(q6.e.f), new q6.k(q6.i.f13406a), new q6.k(q6.g.f13405a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = W.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((q6.l) next).c()) {
                arrayList.add(next);
            }
        }
        this.f13175c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new F5.f(method3, method, method2);
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
    public final t6.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // p6.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        M5.g.f(list, "protocols");
        Iterator it = this.f13175c.iterator();
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i7) {
        M5.g.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i7);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e3);
            }
            throw e3;
        }
    }

    @Override // p6.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f13175c.iterator();
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
    public final Object g() {
        F5.f fVar = this.d;
        fVar.getClass();
        Method method = fVar.f733a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = fVar.f734b;
            M5.g.c(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p6.n
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        M5.g.f(str, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
            return isCleartextTrafficPermitted;
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // p6.n
    public final void k(Object obj, String str) {
        M5.g.f(str, "message");
        F5.f fVar = this.d;
        fVar.getClass();
        if (obj != null) {
            try {
                Method method = fVar.f735c;
                M5.g.c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.j(this, str, 5, 4);
    }
}
