package s3;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class I0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C1212z0 f13812q;

    public I0(C1212z0 c1212z0) {
        this.f13812q = c1212z0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        boolean z7;
        C1212z0 c1212z0 = this.f13812q;
        try {
            try {
                c1212z0.b().f13803D.d("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                            }
                        }
                        data = null;
                    }
                    Uri uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        c1212z0.C();
                        if (x1.l0(intent)) {
                            str = "gs";
                        } else {
                            str = "auto";
                        }
                        String str2 = str;
                        String queryParameter = uri.getQueryParameter("referrer");
                        if (bundle == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        c1212z0.d().M(new RunnableC1189n0(this, z7, uri, str2, queryParameter));
                    }
                }
            } catch (RuntimeException e3) {
                c1212z0.b().f13807v.c(e3, "Throwable caught in onActivityCreated");
            }
        } finally {
            c1212z0.F().M(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        N0 F = this.f13812q.F();
        synchronized (F.f13837B) {
            try {
                if (activity == F.f13842w) {
                    F.f13842w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C1175g0) F.f2765q).f14062w.R()) {
            F.f13841v.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        N0 F = this.f13812q.F();
        synchronized (F.f13837B) {
            F.f13836A = false;
            F.f13843x = true;
        }
        ((C1175g0) F.f2765q).f14037D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!((C1175g0) F.f2765q).f14062w.R()) {
            F.f13838s = null;
            F.d().M(new RunnableC1211z(F, elapsedRealtime, 1));
        } else {
            O0 Q4 = F.Q(activity);
            F.f13839t = F.f13838s;
            F.f13838s = null;
            F.d().M(new C0(F, Q4, elapsedRealtime));
        }
        f1 G6 = this.f13812q.G();
        ((C1175g0) G6.f2765q).f14037D.getClass();
        G6.d().M(new e1(G6, SystemClock.elapsedRealtime(), 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        f1 G6 = this.f13812q.G();
        ((C1175g0) G6.f2765q).f14037D.getClass();
        G6.d().M(new e1(G6, SystemClock.elapsedRealtime(), 0));
        N0 F = this.f13812q.F();
        synchronized (F.f13837B) {
            F.f13836A = true;
            if (activity != F.f13842w) {
                synchronized (F.f13837B) {
                    F.f13842w = activity;
                    F.f13843x = false;
                }
                if (((C1175g0) F.f2765q).f14062w.R()) {
                    F.f13844y = null;
                    F.d().M(new P0(F, 1));
                }
            }
        }
        if (!((C1175g0) F.f2765q).f14062w.R()) {
            F.f13838s = F.f13844y;
            F.d().M(new P0(F, 0));
            return;
        }
        F.N(activity, F.Q(activity), false);
        C1164b m7 = ((C1175g0) F.f2765q).m();
        ((C1175g0) m7.f2765q).f14037D.getClass();
        m7.d().M(new RunnableC1211z(m7, SystemClock.elapsedRealtime(), 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        O0 o02;
        N0 F = this.f13812q.F();
        if (((C1175g0) F.f2765q).f14062w.R() && bundle != null && (o02 = (O0) F.f13841v.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", o02.f13849c);
            bundle2.putString("name", o02.f13847a);
            bundle2.putString("referrer_name", o02.f13848b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
