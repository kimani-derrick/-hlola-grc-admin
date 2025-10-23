package g3;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import s3.C1151F;
import s3.C1155J;
import s3.InterfaceC1149D;
import s3.X0;
import s3.Z0;
/* loaded from: classes.dex */
public final class r extends h {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f10815g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AbstractC0733b f10816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC0733b abstractC0733b, int i7, IBinder iBinder, Bundle bundle) {
        super(abstractC0733b, i7, bundle);
        this.f10816h = abstractC0733b;
        this.f10815g = iBinder;
    }

    @Override // g3.h
    public final void b(d3.b bVar) {
        X0 x02 = this.f10816h.f10770o;
        if (x02 != null) {
            x02.a(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // g3.h
    public final boolean c() {
        InterfaceC1149D c1151f;
        try {
            IBinder iBinder = this.f10815g;
            n.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            this.f10816h.getClass();
            if (!"com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                this.f10816h.getClass();
                Log.w("GmsClient", "service descriptor mismatch: com.google.android.gms.measurement.internal.IMeasurementService vs. " + interfaceDescriptor);
                return false;
            }
            AbstractC0733b abstractC0733b = this.f10816h;
            IBinder iBinder2 = this.f10815g;
            ((C1155J) abstractC0733b).getClass();
            if (iBinder2 == null) {
                c1151f = null;
            } else {
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                if (queryLocalInterface instanceof InterfaceC1149D) {
                    c1151f = (InterfaceC1149D) queryLocalInterface;
                } else {
                    c1151f = new C1151F(iBinder2);
                }
            }
            if (c1151f == null) {
                return false;
            }
            InterfaceC1149D interfaceC1149D = c1151f;
            if (!AbstractC0733b.f(this.f10816h, 2, 4, interfaceC1149D) && !AbstractC0733b.f(this.f10816h, 3, 4, interfaceC1149D)) {
                return false;
            }
            AbstractC0733b abstractC0733b2 = this.f10816h;
            abstractC0733b2.f10773r = null;
            X0 x02 = abstractC0733b2.n;
            if (x02 != null) {
                x02.getClass();
                n.b("MeasurementServiceConnection.onConnected");
                synchronized (x02) {
                    try {
                        n.g(x02.f13929b);
                        x02.f13930c.d().M(new Z0(x02, (InterfaceC1149D) x02.f13929b.b(), 1));
                    } catch (DeadObjectException | IllegalStateException unused) {
                        x02.f13929b = null;
                        x02.f13928a = false;
                    }
                }
            }
            return true;
        } catch (RemoteException unused2) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
