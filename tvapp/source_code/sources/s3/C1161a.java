package s3;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* renamed from: s3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1161a implements InterfaceC1206w0 {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.Z f13955a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13956b;

    public C1161a(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.Z z7) {
        this.f13956b = appMeasurementDynamiteService;
        this.f13955a = z7;
    }

    @Override // s3.InterfaceC1206w0
    public final void a(long j7, Bundle bundle, String str, String str2) {
        try {
            this.f13955a.x(j7, bundle, str, str2);
        } catch (RemoteException e3) {
            C1175g0 c1175g0 = this.f13956b.d;
            if (c1175g0 != null) {
                C1154I c1154i = c1175g0.f14064y;
                C1175g0.i(c1154i);
                c1154i.f13810y.c(e3, "Event listener threw exception");
            }
        }
    }
}
