package g3;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import i3.C0771a;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class v implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10825a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f10826b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10827c;
    public IBinder d;

    /* renamed from: e  reason: collision with root package name */
    public final u f10828e;
    public ComponentName f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f10829g;

    public v(w wVar, u uVar) {
        this.f10829g = wVar;
        this.f10828e = uVar;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f10826b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            w wVar = this.f10829g;
            C0771a c0771a = wVar.d;
            Context context = wVar.f10833b;
            boolean c5 = c0771a.c(context, str, this.f10828e.a(context), this, 4225, executor);
            this.f10827c = c5;
            if (c5) {
                this.f10829g.f10834c.sendMessageDelayed(this.f10829g.f10834c.obtainMessage(1, this.f10828e), this.f10829g.f);
            } else {
                this.f10826b = 2;
                try {
                    w wVar2 = this.f10829g;
                    wVar2.d.b(wVar2.f10833b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f10829g.f10832a) {
            try {
                this.f10829g.f10834c.removeMessages(1, this.f10828e);
                this.d = iBinder;
                this.f = componentName;
                for (ServiceConnection serviceConnection : this.f10825a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f10826b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f10829g.f10832a) {
            try {
                this.f10829g.f10834c.removeMessages(1, this.f10828e);
                this.d = null;
                this.f = componentName;
                for (ServiceConnection serviceConnection : this.f10825a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f10826b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
