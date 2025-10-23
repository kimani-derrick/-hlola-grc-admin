package s3;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* renamed from: s3.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1162a0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13957q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.W f13958r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13959s;

    public /* synthetic */ RunnableC1162a0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.W w7, int i7) {
        this.f13957q = i7;
        this.f13958r = w7;
        this.f13959s = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        switch (this.f13957q) {
            case 0:
                R0 r3 = this.f13959s.d.r();
                r3.D();
                r3.H();
                r3.K(new A4.e(r3, r3.W(false), this.f13958r, 9));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f13959s;
                x1 x1Var = appMeasurementDynamiteService.d.f14035B;
                C1175g0.h(x1Var);
                C1175g0 c1175g0 = appMeasurementDynamiteService.d;
                if (c1175g0.f14049Q != null && c1175g0.f14049Q.booleanValue()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                x1Var.b0(this.f13958r, z7);
                return;
        }
    }
}
