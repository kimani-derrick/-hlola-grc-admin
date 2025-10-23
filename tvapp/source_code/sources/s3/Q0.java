package s3;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final /* synthetic */ class Q0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13863q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ R0 f13864r;

    public /* synthetic */ Q0(int i7) {
        this.f13863q = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13863q) {
            case 0:
                R0 r02 = this.f13864r;
                InterfaceC1149D interfaceC1149D = r02.f13866t;
                if (interfaceC1149D == null) {
                    r02.b().f13807v.d("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    interfaceC1149D.n(r02.W(false));
                    r02.V();
                    return;
                } catch (RemoteException e3) {
                    r02.b().f13807v.c(e3, "Failed to send storage consent settings to the service");
                    return;
                }
            default:
                R0 r03 = this.f13864r;
                InterfaceC1149D interfaceC1149D2 = r03.f13866t;
                if (interfaceC1149D2 == null) {
                    r03.b().f13807v.d("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    interfaceC1149D2.o(r03.W(false));
                    r03.V();
                    return;
                } catch (RemoteException e7) {
                    r03.b().f13807v.c(e7, "Failed to send Dma consent settings to the service");
                    return;
                }
        }
    }
}
