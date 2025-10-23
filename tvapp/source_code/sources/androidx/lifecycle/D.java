package androidx.lifecycle;

import android.app.Activity;
/* loaded from: classes.dex */
public final class D extends AbstractC0330h {
    final /* synthetic */ F this$0;

    public D(F f) {
        this.this$0 = f;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        M5.g.f(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        M5.g.f(activity, "activity");
        F f = this.this$0;
        int i7 = f.f6734q + 1;
        f.f6734q = i7;
        if (i7 == 1 && f.f6737t) {
            f.f6739v.G(EnumC0336n.ON_START);
            f.f6737t = false;
        }
    }
}
