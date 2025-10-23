package com.google.android.gms.measurement;

import R3.a;
import T1.j;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import k0.AbstractC0927a;
import s3.BinderC1181j0;
import s3.C1154I;
import s3.C1175g0;
import s3.M0;
import s3.d1;
import s3.q1;
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements d1 {

    /* renamed from: q  reason: collision with root package name */
    public j f8729q;

    @Override // s3.d1
    public final void a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // s3.d1
    public final void b(Intent intent) {
        SparseArray sparseArray = AbstractC0927a.f12117q;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray sparseArray2 = AbstractC0927a.f12117q;
            synchronized (sparseArray2) {
                try {
                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                    if (wakeLock != null) {
                        wakeLock.release();
                        sparseArray2.remove(intExtra);
                    } else {
                        Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                    }
                } finally {
                }
            }
        }
    }

    public final j c() {
        if (this.f8729q == null) {
            this.f8729q = new j(this, 3);
        }
        return this.f8729q;
    }

    @Override // s3.d1
    public final boolean d(int i7) {
        return stopSelfResult(i7);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        j c5 = c();
        if (intent == null) {
            c5.e().f13807v.d("onBind called with null intent");
            return null;
        }
        c5.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC1181j0(q1.l(c5.f3243a));
        }
        c5.e().f13810y.c(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1154I c1154i = C1175g0.e(c().f3243a, null, null).f14064y;
        C1175g0.i(c1154i);
        c1154i.f13803D.d("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C1154I c1154i = C1175g0.e(c().f3243a, null, null).f14064y;
        C1175g0.i(c1154i);
        c1154i.f13803D.d("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        j c5 = c();
        if (intent == null) {
            c5.e().f13807v.d("onRebind called with null intent");
            return;
        }
        c5.getClass();
        c5.e().f13803D.c(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        j c5 = c();
        C1154I c1154i = C1175g0.e(c5.f3243a, null, null).f14064y;
        C1175g0.i(c1154i);
        if (intent == null) {
            c1154i.f13810y.d("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c1154i.f13803D.b(Integer.valueOf(i8), action, "Local AppMeasurementService called. startId, action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            M0 m02 = new M0(1);
            m02.f13832s = c5;
            m02.f13831r = i8;
            m02.f13833t = c1154i;
            m02.f13834u = intent;
            q1 l7 = q1.l(c5.f3243a);
            l7.d().M(new a(l7, 24, m02));
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        j c5 = c();
        if (intent == null) {
            c5.e().f13807v.d("onUnbind called with null intent");
            return true;
        }
        c5.getClass();
        c5.e().f13803D.c(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }
}
