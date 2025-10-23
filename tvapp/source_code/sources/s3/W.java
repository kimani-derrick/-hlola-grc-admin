package s3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class W implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final String f13921a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ V f13922b;

    public W(V v5, String str) {
        this.f13922b = v5;
        this.f13921a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.measurement.K] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.measurement.K k5;
        V v5 = this.f13922b;
        if (iBinder == null) {
            C1154I c1154i = v5.f13917b.f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.d("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i7 = com.google.android.gms.internal.measurement.J.d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof com.google.android.gms.internal.measurement.K) {
                k5 = (com.google.android.gms.internal.measurement.K) queryLocalInterface;
            } else {
                k5 = new com.google.android.gms.internal.measurement.F(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
            }
            if (k5 == 0) {
                C1154I c1154i2 = v5.f13917b.f14064y;
                C1175g0.i(c1154i2);
                c1154i2.f13810y.d("Install Referrer Service implementation was not found");
                return;
            }
            C1154I c1154i3 = v5.f13917b.f14064y;
            C1175g0.i(c1154i3);
            c1154i3.f13803D.d("Install Referrer Service connected");
            C1169d0 c1169d0 = v5.f13917b.f14065z;
            C1175g0.i(c1169d0);
            c1169d0.M(new R3.a(this, (com.google.android.gms.internal.measurement.K) k5, this));
        } catch (RuntimeException e3) {
            C1154I c1154i4 = v5.f13917b.f14064y;
            C1175g0.i(c1154i4);
            c1154i4.f13810y.c(e3, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1154I c1154i = this.f13922b.f13917b.f14064y;
        C1175g0.i(c1154i);
        c1154i.f13803D.d("Install Referrer Service disconnected");
    }
}
