package s3;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class T0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f13901q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f13902r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ m1 f13903s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ boolean f13904t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.W f13905u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ R0 f13906v;

    public T0(R0 r02, String str, String str2, m1 m1Var, boolean z7, com.google.android.gms.internal.measurement.W w7) {
        this.f13901q = str;
        this.f13902r = str2;
        this.f13903s = m1Var;
        this.f13904t = z7;
        this.f13905u = w7;
        this.f13906v = r02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m1 m1Var = this.f13903s;
        String str = this.f13901q;
        com.google.android.gms.internal.measurement.W w7 = this.f13905u;
        R0 r02 = this.f13906v;
        Bundle bundle = new Bundle();
        try {
            try {
                InterfaceC1149D interfaceC1149D = r02.f13866t;
                String str2 = this.f13902r;
                if (interfaceC1149D == null) {
                    r02.b().f13807v.b(str, str2, "Failed to get user properties; not connected to service");
                } else {
                    g3.n.g(m1Var);
                    bundle = x1.P(interfaceC1149D.m(str, str2, this.f13904t, m1Var));
                    r02.V();
                }
            } catch (RemoteException e3) {
                r02.b().f13807v.b(str, e3, "Failed to get user properties; remote exception");
            }
        } finally {
            r02.C().Z(w7, bundle);
        }
    }
}
