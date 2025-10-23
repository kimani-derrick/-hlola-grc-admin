package s3;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class V0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13918q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ m1 f13919r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ R0 f13920s;

    public /* synthetic */ V0(R0 r02, m1 m1Var, int i7) {
        this.f13918q = i7;
        this.f13919r = m1Var;
        this.f13920s = r02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13918q) {
            case 0:
                m1 m1Var = this.f13919r;
                R0 r02 = this.f13920s;
                InterfaceC1149D interfaceC1149D = r02.f13866t;
                if (interfaceC1149D == null) {
                    r02.b().f13807v.d("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    g3.n.g(m1Var);
                    interfaceC1149D.t(m1Var);
                } catch (RemoteException e3) {
                    r02.b().f13807v.c(e3, "Failed to reset data on the service: remote exception");
                }
                r02.V();
                return;
            case 1:
                m1 m1Var2 = this.f13919r;
                R0 r03 = this.f13920s;
                InterfaceC1149D interfaceC1149D2 = r03.f13866t;
                if (interfaceC1149D2 == null) {
                    r03.b().f13807v.d("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    g3.n.g(m1Var2);
                    interfaceC1149D2.h(m1Var2);
                    ((C1175g0) r03.f2765q).p().N();
                    r03.N(interfaceC1149D2, null, m1Var2);
                    r03.V();
                    return;
                } catch (RemoteException e7) {
                    r03.b().f13807v.c(e7, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                m1 m1Var3 = this.f13919r;
                R0 r04 = this.f13920s;
                InterfaceC1149D interfaceC1149D3 = r04.f13866t;
                if (interfaceC1149D3 == null) {
                    r04.b().f13807v.d("Failed to send consent settings to service");
                    return;
                }
                try {
                    g3.n.g(m1Var3);
                    interfaceC1149D3.g(m1Var3);
                    r04.V();
                    return;
                } catch (RemoteException e8) {
                    r04.b().f13807v.c(e8, "Failed to send consent settings to the service");
                    return;
                }
            default:
                m1 m1Var4 = this.f13919r;
                R0 r05 = this.f13920s;
                InterfaceC1149D interfaceC1149D4 = r05.f13866t;
                if (interfaceC1149D4 == null) {
                    r05.b().f13807v.d("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    g3.n.g(m1Var4);
                    interfaceC1149D4.e(m1Var4);
                    r05.V();
                    return;
                } catch (RemoteException e9) {
                    r05.b().f13807v.c(e9, "Failed to send measurementEnabled to the service");
                    return;
                }
        }
    }
}
