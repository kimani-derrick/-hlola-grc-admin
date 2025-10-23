package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import k.C0852F;
import k0.AbstractC0927a;
import l6.b;
import s3.C1154I;
import s3.C1175g0;
import s3.X;
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC0927a implements X {

    /* renamed from: s  reason: collision with root package name */
    public C0852F f8728s;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b bVar;
        String str;
        if (this.f8728s == null) {
            this.f8728s = new C0852F(this);
        }
        C0852F c0852f = this.f8728s;
        c0852f.getClass();
        C1154I c1154i = C1175g0.e(context, null, null).f14064y;
        C1175g0.i(c1154i);
        if (intent == null) {
            bVar = c1154i.f13810y;
            str = "Receiver called with null intent";
        } else {
            String action = intent.getAction();
            c1154i.f13803D.c(action, "Local receiver got");
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                className.setAction("com.google.android.gms.measurement.UPLOAD");
                c1154i.f13803D.d("Starting wakeful intent.");
                ((AppMeasurementReceiver) ((X) c0852f.f11874r)).getClass();
                SparseArray sparseArray = AbstractC0927a.f12117q;
                synchronized (sparseArray) {
                    try {
                        int i7 = AbstractC0927a.f12118r;
                        int i8 = i7 + 1;
                        AbstractC0927a.f12118r = i8;
                        if (i8 <= 0) {
                            AbstractC0927a.f12118r = 1;
                        }
                        className.putExtra("androidx.contentpager.content.wakelockid", i7);
                        ComponentName startService = context.startService(className);
                        if (startService != null) {
                            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                            newWakeLock.setReferenceCounted(false);
                            newWakeLock.acquire(60000L);
                            sparseArray.put(i7, newWakeLock);
                        }
                    } finally {
                    }
                }
                return;
            } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                bVar = c1154i.f13810y;
                str = "Install Referrer Broadcasts are deprecated";
            } else {
                return;
            }
        }
        bVar.d(str);
    }
}
