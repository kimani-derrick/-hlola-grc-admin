package s3;

import android.os.RemoteException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class W0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f13923q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f13924r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ m1 f13925s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.W f13926t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ R0 f13927u;

    public W0(R0 r02, String str, String str2, m1 m1Var, com.google.android.gms.internal.measurement.W w7) {
        this.f13923q = str;
        this.f13924r = str2;
        this.f13925s = m1Var;
        this.f13926t = w7;
        this.f13927u = r02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m1 m1Var = this.f13925s;
        String str = this.f13924r;
        String str2 = this.f13923q;
        com.google.android.gms.internal.measurement.W w7 = this.f13926t;
        R0 r02 = this.f13927u;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                InterfaceC1149D interfaceC1149D = r02.f13866t;
                if (interfaceC1149D == null) {
                    r02.b().f13807v.b(str2, str, "Failed to get conditional properties; not connected to service");
                } else {
                    g3.n.g(m1Var);
                    arrayList = x1.z0(interfaceC1149D.w(str2, str, m1Var));
                    r02.V();
                }
            } catch (RemoteException e3) {
                r02.b().f13807v.e("Failed to get conditional properties; remote exception", str2, str, e3);
            }
        } finally {
            r02.C().a0(w7, arrayList);
        }
    }
}
