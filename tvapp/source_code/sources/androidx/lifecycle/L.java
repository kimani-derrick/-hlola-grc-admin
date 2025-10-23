package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class L implements Application.ActivityLifecycleCallbacks {
    public static final K Companion = new Object();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        M5.g.f(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new L());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        M5.g.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        M5.g.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        M5.g.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        M5.g.f(activity, "activity");
        int i7 = M.f6766r;
        P.e(activity, EnumC0336n.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        M5.g.f(activity, "activity");
        int i7 = M.f6766r;
        P.e(activity, EnumC0336n.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        M5.g.f(activity, "activity");
        int i7 = M.f6766r;
        P.e(activity, EnumC0336n.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        M5.g.f(activity, "activity");
        int i7 = M.f6766r;
        P.e(activity, EnumC0336n.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        M5.g.f(activity, "activity");
        int i7 = M.f6766r;
        P.e(activity, EnumC0336n.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        M5.g.f(activity, "activity");
        int i7 = M.f6766r;
        P.e(activity, EnumC0336n.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        M5.g.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        M5.g.f(activity, "activity");
        M5.g.f(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        M5.g.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        M5.g.f(activity, "activity");
    }
}
