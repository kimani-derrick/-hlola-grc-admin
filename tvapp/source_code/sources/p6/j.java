package p6;

import h6.A;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: c  reason: collision with root package name */
    public final Method f13182c;
    public final Method d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f13183e;
    public final Class f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f13184g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f13182c = method;
        this.d = method2;
        this.f13183e = method3;
        this.f = cls;
        this.f13184g = cls2;
    }

    @Override // p6.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f13183e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        }
    }

    @Override // p6.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        M5.g.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((A) obj) != A.f11062r) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(A5.m.P(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((A) it.next()).f11069q);
        }
        try {
            this.f13182c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f, this.f13184g}, new i(arrayList2)));
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        }
    }

    @Override // p6.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                i iVar = (i) invocationHandler;
                boolean z7 = iVar.f13180b;
                if (!z7 && iVar.f13181c == null) {
                    n.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                    return null;
                } else if (z7) {
                    return null;
                } else {
                    return iVar.f13181c;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        }
    }
}
