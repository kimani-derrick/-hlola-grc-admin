package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public abstract class C {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        M5.g.f(activity, "activity");
        M5.g.f(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
