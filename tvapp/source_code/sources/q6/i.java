package q6;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p6.n;
/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final h f13406a = new Object();

    @Override // q6.l
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // q6.l
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // q6.l
    public final boolean c() {
        boolean z7 = p6.h.d;
        return p6.h.d;
    }

    @Override // q6.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        M5.g.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            n nVar = n.f13188a;
            Object[] array = m3.i.b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
