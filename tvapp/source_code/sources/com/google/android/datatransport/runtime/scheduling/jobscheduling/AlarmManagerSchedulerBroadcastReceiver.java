package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import H2.C0002c;
import T1.i;
import T1.u;
import Z1.f;
import Z1.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import d2.AbstractC0552a;
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f8118a = 0;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        u.b(context);
        C0002c a7 = i.a();
        a7.K(queryParameter);
        a7.N(AbstractC0552a.b(intValue));
        if (queryParameter2 != null) {
            a7.f1018s = Base64.decode(queryParameter2, 0);
        }
        j jVar = u.a().d;
        i l7 = a7.l();
        ?? obj = new Object();
        jVar.getClass();
        jVar.f4575e.execute(new f(jVar, l7, i7, obj));
    }
}
