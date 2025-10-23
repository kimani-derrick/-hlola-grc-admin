package j;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.atomic.AtomicReference;
import s3.C1175g0;
import s3.C1201u;
import s3.C1212z0;
import s3.InterfaceC1149D;
import s3.Q;
import s3.R0;
import s3.W0;
import s3.m1;
import s3.q1;
import s3.s1;
import s3.x1;
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f11408q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f11409r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f11410s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f11411t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f11412u;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f11408q = i7;
        this.f11412u = obj;
        this.f11409r = obj2;
        this.f11410s = obj3;
        this.f11411t = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        R0 r02;
        InterfaceC1149D interfaceC1149D;
        switch (this.f11408q) {
            case 0:
                e eVar = (e) this.f11409r;
                if (eVar != null) {
                    Z5.n nVar = (Z5.n) this.f11412u;
                    ((f) nVar.f4918q).f11431Q = true;
                    eVar.f11414b.c(false);
                    ((f) nVar.f4918q).f11431Q = false;
                }
                MenuItem menuItem = (MenuItem) this.f11410s;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((j) this.f11411t).p(menuItem, null, 4);
                    return;
                }
                return;
            case 1:
                R0 r3 = ((AppMeasurementDynamiteService) this.f11412u).d.r();
                r3.D();
                r3.H();
                x1 C3 = r3.C();
                d3.d dVar = d3.d.f9227b;
                Context context = ((C1175g0) C3.f2765q).f14056q;
                dVar.getClass();
                int a7 = d3.d.a(context, 12451000);
                W w7 = (W) this.f11409r;
                if (a7 != 0) {
                    r3.b().f13810y.d("Not bundling data. Service unavailable or out of date");
                    r3.C().c0(w7, new byte[0]);
                    return;
                }
                r3.K(new d(r3, (C1201u) this.f11410s, (String) this.f11411t, w7, 5));
                return;
            case 2:
                R0 r5 = ((C1175g0) ((C1212z0) this.f11412u).f2765q).r();
                r5.D();
                r5.H();
                m1 W = r5.W(false);
                r5.K(new Q(r5, (AtomicReference) this.f11409r, (String) this.f11410s, (String) this.f11411t, W));
                return;
            case 3:
                R0 r7 = ((AppMeasurementDynamiteService) this.f11412u).d.r();
                r7.D();
                r7.H();
                r7.K(new W0(r7, (String) this.f11410s, (String) this.f11411t, r7.W(false), (W) this.f11409r));
                return;
            case 4:
                synchronized (((AtomicReference) this.f11409r)) {
                    try {
                        r02 = (R0) this.f11412u;
                        interfaceC1149D = r02.f13866t;
                    } catch (RemoteException e3) {
                        ((R0) this.f11412u).b().f13807v.c(e3, "Failed to get trigger URIs; remote exception");
                        atomicReference = (AtomicReference) this.f11409r;
                    }
                    if (interfaceC1149D == null) {
                        r02.b().f13807v.d("Failed to get trigger URIs; not connected to service");
                        ((AtomicReference) this.f11409r).notify();
                    } else {
                        g3.n.g((m1) this.f11410s);
                        ((AtomicReference) this.f11409r).set(interfaceC1149D.b((Bundle) this.f11411t, (m1) this.f11410s));
                        ((R0) this.f11412u).V();
                        atomicReference = (AtomicReference) this.f11409r;
                        atomicReference.notify();
                    }
                }
                return;
            case 5:
                W w8 = (W) this.f11411t;
                R0 r03 = (R0) this.f11412u;
                byte[] bArr = null;
                try {
                    try {
                        InterfaceC1149D interfaceC1149D2 = r03.f13866t;
                        if (interfaceC1149D2 == null) {
                            r03.b().f13807v.d("Discarding data. Failed to send event to service to bundle");
                            x1 C6 = r03.C();
                            C6.c0(w8, null);
                            r03 = C6;
                        } else {
                            bArr = interfaceC1149D2.f((C1201u) this.f11409r, (String) this.f11410s);
                            r03.V();
                            x1 C7 = r03.C();
                            C7.c0(w8, bArr);
                            r03 = C7;
                        }
                        return;
                    } catch (RemoteException e7) {
                        r03.b().f13807v.c(e7, "Failed to send event to the service to bundle");
                        r03.C().c0(w8, bArr);
                        return;
                    }
                } catch (Throwable th) {
                    r03.C().c0(w8, bArr);
                    throw th;
                }
            default:
                s1 s1Var = (s1) this.f11412u;
                x1 Z6 = s1Var.f14237r.Z();
                q1 q1Var = s1Var.f14237r;
                q1Var.f().getClass();
                long currentTimeMillis = System.currentTimeMillis();
                C1201u S6 = Z6.S((String) this.f11410s, (Bundle) this.f11411t, "auto", currentTimeMillis, false);
                g3.n.g(S6);
                q1Var.x(S6, (String) this.f11409r);
                return;
        }
    }
}
