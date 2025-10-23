package Z4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import z5.C1530l;
/* loaded from: classes.dex */
public final class Y implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q  reason: collision with root package name */
    public static final Y f4800q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static boolean f4801r;

    /* renamed from: s  reason: collision with root package name */
    public static C4.b f4802s;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        M5.g.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        M5.g.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        M5.g.f(activity, "activity");
        C4.b bVar = f4802s;
        if (bVar != null) {
            bVar.V(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1530l c1530l;
        M5.g.f(activity, "activity");
        C4.b bVar = f4802s;
        if (bVar != null) {
            bVar.V(1);
            c1530l = C1530l.f16479a;
        } else {
            c1530l = null;
        }
        if (c1530l == null) {
            f4801r = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        M5.g.f(activity, "activity");
        M5.g.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        M5.g.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        M5.g.f(activity, "activity");
    }
}
