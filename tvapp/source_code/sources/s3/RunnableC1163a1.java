package s3;

import android.content.ComponentName;
/* renamed from: s3.a1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1163a1 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13960q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ X0 f13961r;

    public /* synthetic */ RunnableC1163a1(X0 x02, int i7) {
        this.f13960q = i7;
        this.f13961r = x02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13960q) {
            case 0:
                X0 x02 = this.f13961r;
                R0 r02 = x02.f13930c;
                ComponentName componentName = new ComponentName(((C1175g0) x02.f13930c.f2765q).f14056q, "com.google.android.gms.measurement.AppMeasurementService");
                r02.D();
                if (r02.f13866t != null) {
                    r02.f13866t = null;
                    r02.b().f13803D.c(componentName, "Disconnected from device MeasurementService");
                    r02.D();
                    r02.P();
                    return;
                }
                return;
            default:
                R0 r03 = this.f13961r.f13930c;
                r03.f13866t = null;
                r03.U();
                return;
        }
    }
}
