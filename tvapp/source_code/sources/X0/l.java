package X0;

import H2.C0002c;
import a.AbstractC0189a;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import z5.C1530l;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class l implements ComponentCallbacks2 {

    /* renamed from: q  reason: collision with root package name */
    public final Context f4075q;

    /* renamed from: r  reason: collision with root package name */
    public final WeakReference f4076r;

    /* renamed from: s  reason: collision with root package name */
    public final R0.e f4077s;

    /* renamed from: t  reason: collision with root package name */
    public volatile boolean f4078t;

    /* renamed from: u  reason: collision with root package name */
    public final AtomicBoolean f4079u;

    public l(J0.j jVar, Context context, boolean z7) {
        R0.e fVar;
        this.f4075q = context;
        this.f4076r = new WeakReference(jVar);
        if (z7) {
            jVar.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) A.b.b(context, ConnectivityManager.class);
            if (connectivityManager != null && AbstractC0189a.n(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                try {
                    fVar = new C0002c(connectivityManager, this);
                } catch (Exception unused) {
                    fVar = new L4.f(8);
                }
            } else {
                fVar = new L4.f(8);
            }
        } else {
            fVar = new L4.f(8);
        }
        this.f4077s = fVar;
        this.f4078t = fVar.D();
        this.f4079u = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.f4079u.getAndSet(true)) {
            return;
        }
        this.f4075q.unregisterComponentCallbacks(this);
        this.f4077s.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (((J0.j) this.f4076r.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        C1530l c1530l;
        Q0.d dVar;
        J0.j jVar = (J0.j) this.f4076r.get();
        if (jVar != null) {
            InterfaceC1522d interfaceC1522d = jVar.f1299b;
            if (interfaceC1522d != null && (dVar = (Q0.d) interfaceC1522d.getValue()) != null) {
                dVar.f2836a.c(i7);
                dVar.f2837b.c(i7);
            }
            c1530l = C1530l.f16479a;
        } else {
            c1530l = null;
        }
        if (c1530l == null) {
            a();
        }
    }
}
