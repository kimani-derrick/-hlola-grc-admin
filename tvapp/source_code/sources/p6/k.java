package p6;

import h6.A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f13185c;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0.intValue() >= 9) goto L8;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 != 0) goto Lb
            r0 = r1
            goto Lf
        Lb:
            java.lang.Integer r0 = U5.m.T(r0)
        Lf:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L25
        L1b:
            r2 = r3
            goto L25
        L1d:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L25
            goto L1b
        L25:
            p6.k.f13185c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.k.<clinit>():void");
    }

    @Override // p6.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        M5.g.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
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
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // p6.n
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (M5.g.a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
