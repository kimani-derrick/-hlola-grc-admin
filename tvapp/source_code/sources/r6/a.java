package r6;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import m3.g;
/* loaded from: classes.dex */
public final class a extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13481a = new ProxySelector();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return g.z(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
