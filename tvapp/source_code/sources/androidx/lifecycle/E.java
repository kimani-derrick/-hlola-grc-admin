package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
/* loaded from: classes.dex */
public final class E extends AbstractC0330h {
    final /* synthetic */ F this$0;

    public E(F f) {
        this.this$0 = f;
    }

    @Override // androidx.lifecycle.AbstractC0330h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        M5.g.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = M.f6766r;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            M5.g.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((M) findFragmentByTag).f6767q = this.this$0.f6741x;
        }
    }

    @Override // androidx.lifecycle.AbstractC0330h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        M5.g.f(activity, "activity");
        F f = this.this$0;
        int i7 = f.f6735r - 1;
        f.f6735r = i7;
        if (i7 == 0) {
            Handler handler = f.f6738u;
            M5.g.c(handler);
            handler.postDelayed(f.f6740w, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        M5.g.f(activity, "activity");
        C.a(activity, new D(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0330h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        M5.g.f(activity, "activity");
        F f = this.this$0;
        int i7 = f.f6734q - 1;
        f.f6734q = i7;
        if (i7 == 0 && f.f6736s) {
            f.f6739v.G(EnumC0336n.ON_STOP);
            f.f6737t = true;
        }
    }
}
