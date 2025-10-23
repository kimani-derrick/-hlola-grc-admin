package i3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import g3.n;
import g3.v;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import k3.C0959b;
/* renamed from: i3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f11362b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile C0771a f11363c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f11364a = new ConcurrentHashMap();

    public static C0771a a() {
        if (f11363c == null) {
            synchronized (f11362b) {
                try {
                    if (f11363c == null) {
                        f11363c = new C0771a();
                    }
                } finally {
                }
            }
        }
        C0771a c0771a = f11363c;
        n.g(c0771a);
        return c0771a;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof v)) {
            ConcurrentHashMap concurrentHashMap = this.f11364a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        boolean bindService;
        boolean bindService2;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C0959b.a(context).f3243a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof v)) {
            ConcurrentHashMap concurrentHashMap = this.f11364a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29 && executor != null) {
                    bindService2 = context.bindService(intent, i7, executor, serviceConnection);
                } else {
                    bindService2 = context.bindService(intent, serviceConnection, i7);
                }
                if (!bindService2) {
                    return false;
                }
                return bindService2;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        }
        if (executor == null) {
            executor = null;
        }
        if (Build.VERSION.SDK_INT >= 29 && executor != null) {
            bindService = context.bindService(intent, i7, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i7);
    }
}
