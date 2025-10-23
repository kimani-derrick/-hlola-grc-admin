package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* renamed from: com.google.android.gms.internal.measurement.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420f0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f8555q;

    public C0420f0(C0430h0 c0430h0) {
        this.f8555q = c0430h0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f8555q.e(new C0475q0(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f8555q.e(new C0489t0(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f8555q.e(new C0489t0(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f8555q.e(new C0489t0(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        T t5 = new T();
        this.f8555q.e(new C0475q0(this, activity, t5));
        Bundle z7 = t5.z(50L);
        if (z7 != null) {
            bundle.putAll(z7);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f8555q.e(new C0489t0(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f8555q.e(new C0489t0(this, activity, 3));
    }
}
