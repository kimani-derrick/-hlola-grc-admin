package q6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p6.n;
/* loaded from: classes.dex */
public class e implements l {
    public static final B0.d f = new B0.d(8);

    /* renamed from: a  reason: collision with root package name */
    public final Class f13401a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f13402b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f13403c;
    public final Method d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f13404e;

    public e(Class cls) {
        this.f13401a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        M5.g.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f13402b = declaredMethod;
        this.f13403c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f13404e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // q6.l
    public final boolean a(SSLSocket sSLSocket) {
        return this.f13401a.isInstance(sSLSocket);
    }

    @Override // q6.l
    public final String b(SSLSocket sSLSocket) {
        if (!this.f13401a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, U5.a.f3474a);
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if ((cause instanceof NullPointerException) && M5.g.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e7);
        }
    }

    @Override // q6.l
    public final boolean c() {
        boolean z7 = p6.c.f13174e;
        return p6.c.f13174e;
    }

    @Override // q6.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        M5.g.f(list, "protocols");
        if (this.f13401a.isInstance(sSLSocket)) {
            try {
                this.f13402b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f13403c.invoke(sSLSocket, str);
                }
                Method method = this.f13404e;
                n nVar = n.f13188a;
                method.invoke(sSLSocket, m3.i.c(list));
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e7) {
                throw new AssertionError(e7);
            }
        }
    }
}
