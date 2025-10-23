package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A4.d;
import H2.C0002c;
import T1.i;
import T1.u;
import Z1.f;
import Z1.j;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import d2.AbstractC0552a;
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f8119q = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt("priority");
        int i8 = jobParameters.getExtras().getInt("attemptNumber");
        u.b(getApplicationContext());
        C0002c a7 = i.a();
        a7.K(string);
        a7.N(AbstractC0552a.b(i7));
        if (string2 != null) {
            a7.f1018s = Base64.decode(string2, 0);
        }
        j jVar = u.a().d;
        i l7 = a7.l();
        d dVar = new d(this, 4, jobParameters);
        jVar.getClass();
        jVar.f4575e.execute(new f(jVar, l7, i8, dVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
