package com.google.android.gms.measurement;

import A4.e;
import R3.a;
import T1.j;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import s3.C1154I;
import s3.C1175g0;
import s3.d1;
import s3.q1;
@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements d1 {

    /* renamed from: q  reason: collision with root package name */
    public j f8727q;

    @Override // s3.d1
    public final void a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // s3.d1
    public final void b(Intent intent) {
    }

    public final j c() {
        if (this.f8727q == null) {
            this.f8727q = new j(this, 3);
        }
        return this.f8727q;
    }

    @Override // s3.d1
    public final boolean d(int i7) {
        throw new UnsupportedOperationException();
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        j c5 = c();
        C1154I c1154i = C1175g0.e(c5.f3243a, null, null).f14064y;
        C1175g0.i(c1154i);
        String string = jobParameters.getExtras().getString("action");
        c1154i.f13803D.c(string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            e eVar = new e(11);
            eVar.f105r = c5;
            eVar.f106s = c1154i;
            eVar.f107t = jobParameters;
            q1 l7 = q1.l(c5.f3243a);
            l7.d().M(new a(l7, 24, eVar));
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
