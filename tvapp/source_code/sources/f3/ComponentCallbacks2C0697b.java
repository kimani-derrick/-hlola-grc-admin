package f3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: f3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0697b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: u  reason: collision with root package name */
    public static final ComponentCallbacks2C0697b f10396u = new ComponentCallbacks2C0697b();

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f10397q = new AtomicBoolean();

    /* renamed from: r  reason: collision with root package name */
    public final AtomicBoolean f10398r = new AtomicBoolean();

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f10399s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public boolean f10400t = false;

    public static void b(Application application) {
        ComponentCallbacks2C0697b componentCallbacks2C0697b = f10396u;
        synchronized (componentCallbacks2C0697b) {
            try {
                if (!componentCallbacks2C0697b.f10400t) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0697b);
                    application.registerComponentCallbacks(componentCallbacks2C0697b);
                    componentCallbacks2C0697b.f10400t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC0696a interfaceC0696a) {
        synchronized (f10396u) {
            this.f10399s.add(interfaceC0696a);
        }
    }

    public final void c(boolean z7) {
        synchronized (f10396u) {
            try {
                Iterator it = this.f10399s.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0696a) it.next()).a(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f10398r;
        boolean compareAndSet = this.f10397q.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f10398r;
        boolean compareAndSet = this.f10397q.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f10397q.compareAndSet(false, true)) {
            this.f10398r.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
