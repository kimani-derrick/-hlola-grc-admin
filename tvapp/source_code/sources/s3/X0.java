package s3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import i3.C0771a;
/* loaded from: classes.dex */
public final class X0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f13928a;

    /* renamed from: b  reason: collision with root package name */
    public volatile C1155J f13929b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ R0 f13930c;

    public X0(R0 r02) {
        this.f13930c = r02;
    }

    public final void a(d3.b bVar) {
        g3.n.b("MeasurementServiceConnection.onConnectionFailed");
        C1154I c1154i = ((C1175g0) this.f13930c.f2765q).f14064y;
        if (c1154i == null || !c1154i.f14182r) {
            c1154i = null;
        }
        if (c1154i != null) {
            c1154i.f13810y.c(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f13928a = false;
            this.f13929b = null;
        }
        this.f13930c.d().M(new RunnableC1163a1(this, 1));
    }

    public final void b(Intent intent) {
        this.f13930c.D();
        Context context = ((C1175g0) this.f13930c.f2765q).f14056q;
        C0771a a7 = C0771a.a();
        synchronized (this) {
            try {
                if (this.f13928a) {
                    this.f13930c.b().f13803D.d("Connection attempt already in progress");
                    return;
                }
                this.f13930c.b().f13803D.d("Using local app measurement service");
                this.f13928a = true;
                a7.c(context, context.getClass().getName(), intent, this.f13930c.f13865s, 129, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1149D c1151f;
        g3.n.b("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f13928a = false;
                this.f13930c.b().f13807v.d("Service connected with null binder");
                return;
            }
            InterfaceC1149D interfaceC1149D = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC1149D) {
                        c1151f = (InterfaceC1149D) queryLocalInterface;
                    } else {
                        c1151f = new C1151F(iBinder);
                    }
                    interfaceC1149D = c1151f;
                    this.f13930c.b().f13803D.d("Bound to IMeasurementService interface");
                } else {
                    this.f13930c.b().f13807v.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.f13930c.b().f13807v.d("Service connect failed to get IMeasurementService");
            }
            if (interfaceC1149D == null) {
                this.f13928a = false;
                try {
                    C0771a a7 = C0771a.a();
                    R0 r02 = this.f13930c;
                    a7.b(((C1175g0) r02.f2765q).f14056q, r02.f13865s);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f13930c.d().M(new Z0(this, interfaceC1149D, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g3.n.b("MeasurementServiceConnection.onServiceDisconnected");
        R0 r02 = this.f13930c;
        r02.b().f13802C.d("Service disconnected");
        r02.d().M(new R3.a(this, componentName, 23, false));
    }
}
