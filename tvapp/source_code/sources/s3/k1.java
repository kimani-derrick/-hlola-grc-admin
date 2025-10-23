package s3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes.dex */
public final class k1 extends o1 {

    /* renamed from: t  reason: collision with root package name */
    public final AlarmManager f14104t;

    /* renamed from: u  reason: collision with root package name */
    public h1 f14105u;

    /* renamed from: v  reason: collision with root package name */
    public Integer f14106v;

    public k1(q1 q1Var) {
        super(q1Var);
        this.f14104t = (AlarmManager) ((C1175g0) this.f2765q).f14056q.getSystemService("alarm");
    }

    @Override // s3.o1
    public final boolean J() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f14104t;
        if (alarmManager != null) {
            alarmManager.cancel(M());
        }
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) ((C1175g0) this.f2765q).f14056q.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(L());
            return false;
        }
        return false;
    }

    public final void K() {
        JobScheduler jobScheduler;
        H();
        b().f13803D.d("Unscheduling upload");
        AlarmManager alarmManager = this.f14104t;
        if (alarmManager != null) {
            alarmManager.cancel(M());
        }
        N().a();
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) ((C1175g0) this.f2765q).f14056q.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(L());
        }
    }

    public final int L() {
        if (this.f14106v == null) {
            String packageName = ((C1175g0) this.f2765q).f14056q.getPackageName();
            this.f14106v = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.f14106v.intValue();
    }

    public final PendingIntent M() {
        Context context = ((C1175g0) this.f2765q).f14056q;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.O.f8386a);
    }

    public final AbstractC1184l N() {
        if (this.f14105u == null) {
            this.f14105u = new h1(this, this.f14116r.f14185B, 1);
        }
        return this.f14105u;
    }
}
