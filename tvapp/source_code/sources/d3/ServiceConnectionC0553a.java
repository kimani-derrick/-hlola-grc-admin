package d3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: d3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0553a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9216a = false;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedBlockingQueue f9217b = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) {
        g3.n.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f9216a) {
            this.f9216a = true;
            IBinder iBinder = (IBinder) this.f9217b.poll(10000L, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9217b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
