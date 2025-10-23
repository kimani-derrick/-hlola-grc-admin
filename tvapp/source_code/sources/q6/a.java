package q6;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p6.n;
/* loaded from: classes.dex */
public final class a implements l {
    @Override // q6.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // q6.l
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || M5.g.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // q6.l
    public final boolean c() {
        n nVar = n.f13188a;
        if (m3.i.e() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @Override // q6.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        M5.g.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            n nVar = n.f13188a;
            Object[] array = m3.i.b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e3) {
            throw new IOException("Android internal error", e3);
        }
    }
}
