package R0;

import H2.C0002c;
import android.net.ConnectivityManager;
import android.net.Network;
/* loaded from: classes.dex */
public final class f extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0002c f2879a;

    public f(C0002c c0002c) {
        this.f2879a = c0002c;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C0002c.i(this.f2879a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C0002c.i(this.f2879a, network, false);
    }
}
