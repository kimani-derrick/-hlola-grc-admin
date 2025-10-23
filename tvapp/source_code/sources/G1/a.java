package G1;

import D5.d;
import F5.i;
import L5.p;
import W5.InterfaceC0116x;
import java.net.InetSocketAddress;
import java.net.Socket;
import k3.AbstractC0958a;
import z5.C1525g;
import z5.C1530l;
/* loaded from: classes.dex */
public final class a extends i implements p {
    @Override // F5.a
    public final d h(d dVar, Object obj) {
        return new i(2, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((a) h((d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object m7;
        AbstractC0958a.H(obj);
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("8.8.8.8", 53), 1500);
            socket.close();
            m7 = Boolean.TRUE;
        } catch (Throwable th) {
            m7 = AbstractC0958a.m(th);
        }
        Boolean bool = Boolean.FALSE;
        if (m7 instanceof C1525g) {
            return bool;
        }
        return m7;
    }
}
